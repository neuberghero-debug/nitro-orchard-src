#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

in vec2 texCoord0;
in vec2 shapeSize;
in vec3 shapeData;
in vec4 vertexColor;

out vec4 fragColor;

const float RECT_AA_PAD = 1.25;

float decodeUnit(float value) {
    return clamp(value * 0.5 + 0.5, 0.0, 1.0);
}

int decodeMode(float value) {
    return int(floor((clamp(value, -1.0, 1.0) + 1.0) * 4.0 + 0.5));
}

float cornerRadiusForMode(vec2 local, vec2 size, float radius, int mode) {
    bool top = local.y <= size.y * 0.5;
    bool bottom = !top;

    if (mode == 1 && bottom) {
        return 0.0;
    }
    if (mode == 2 && top) {
        return 0.0;
    }
    return radius;
}

float roundedBoxSdf(vec2 p, vec2 halfSize, float radius) {
    radius = min(radius, min(halfSize.x, halfSize.y));
    vec2 q = abs(p) - halfSize + vec2(radius);
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - radius;
}

float roundedRectSdf(vec2 local, vec2 size, float radius, int mode) {
    vec2 halfSize = size * 0.5;
    vec2 p = local - halfSize;
    float cornerRadius = cornerRadiusForMode(local, size, radius, mode);
    return roundedBoxSdf(p, halfSize, cornerRadius);
}

float fillAlpha(float distanceValue, float aa) {
    return 1.0 - smoothstep(-aa, aa, distanceValue);
}

float distanceAa(float distanceValue) {
    return max(fwidth(distanceValue) * 0.65, 0.35);
}

float outlineAlpha(float outerDistance, vec2 local, vec2 size, float radius, float stroke, int mode, float aa) {
    float outer = fillAlpha(outerDistance, aa);
    vec2 innerSize = size - vec2(stroke * 2.0);
    if (innerSize.x <= 0.0 || innerSize.y <= 0.0) {
        return outer;
    }

    vec2 innerLocal = local - vec2(stroke);
    float innerRadius = max(0.0, radius - stroke);
    float innerDistance = roundedRectSdf(innerLocal, innerSize, innerRadius, mode);
    float inner = fillAlpha(innerDistance, aa);
    return clamp(outer * (1.0 - inner), 0.0, 1.0);
}

void main() {
    vec2 rasterSize = max(shapeSize, vec2(0.125));
    vec2 rasterLocal = texCoord0 * rasterSize;
    float rasterMinSize = min(rasterSize.x, rasterSize.y);
    float minSize = rasterMinSize;
    float radius = min(decodeUnit(shapeData.x) * rasterMinSize, rasterMinSize * 0.5);
    float stroke = max(decodeUnit(shapeData.y) * rasterMinSize, 0.0);
    int mode = decodeMode(shapeData.z);

    float alpha;
    if (mode == 5) {
        float circleRadius = min(radius, minSize * 0.5);
        float distanceValue = length(rasterLocal - rasterSize * 0.5) - circleRadius;
        alpha = fillAlpha(distanceValue, distanceAa(distanceValue));
    } else if (mode == 6) {
        float circleRadius = min(radius, max(0.0, minSize * 0.5 - stroke * 0.5));
        float distanceValue = abs(length(rasterLocal - rasterSize * 0.5) - circleRadius) - stroke * 0.5;
        float aa = distanceAa(distanceValue);
        alpha = 1.0 - smoothstep(-aa, aa, distanceValue);
    } else {
        vec2 size = max(rasterSize - vec2(RECT_AA_PAD * 2.0), vec2(0.125));
        vec2 local = rasterLocal - vec2(RECT_AA_PAD);
        float distanceValue = roundedRectSdf(local, size, radius, mode);
        float aa = distanceAa(distanceValue);
        if (mode == 3) {
            alpha = outlineAlpha(distanceValue, local, size, radius, stroke, 0, aa);
        } else if (mode == 4) {
            alpha = 1.0 - smoothstep(-aa, max(stroke, aa), abs(distanceValue));
        } else if (mode == 7) {
            vec2 innerSize = size - vec2(stroke * 2.0);
            if (innerSize.x <= 0.0 || innerSize.y <= 0.0) {
                alpha = 0.0;
            } else {
                vec2 innerLocal = local - vec2(stroke);
                float innerRadius = max(0.0, radius - stroke);
                float innerDistance = roundedRectSdf(innerLocal, innerSize, innerRadius, 0);
                float outside = max(innerDistance, 0.0);
                alpha = 1.0 - smoothstep(0.0, max(stroke, distanceAa(innerDistance)), outside);
                alpha *= alpha;
            }
        } else {
            alpha = fillAlpha(distanceValue, aa);
        }
    }

    vec4 color = vertexColor * ColorModulator;
    color.a *= clamp(alpha, 0.0, 1.0);
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}
