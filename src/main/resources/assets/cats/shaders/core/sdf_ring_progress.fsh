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

const float PI = 3.14159265358979323846;
const float TWO_PI = 6.28318530717958647692;

float decodeUnit(float value) {
    return clamp(value * 0.5 + 0.5, 0.0, 1.0);
}

float alphaFromDistance(float distanceValue, float aa) {
    return 1.0 - smoothstep(-aa, aa, distanceValue);
}

void main() {
    vec2 size = max(shapeSize, vec2(0.125));
    vec2 local = texCoord0 * size;
    vec2 center = size * 0.5;
    vec2 point = local - center;
    float minSize = min(size.x, size.y);
    float stroke = max(decodeUnit(shapeData.y) * minSize, 0.0);
    float circleRadius = min(decodeUnit(shapeData.x) * minSize, max(0.0, minSize * 0.5 - stroke * 0.5));
    float progress = clamp(shapeData.z, 0.0, 1.0);

    if (progress <= 0.001 || stroke <= 0.0 || circleRadius <= 0.0) {
        discard;
    }

    float distanceValue = abs(length(point) - circleRadius) - stroke * 0.5;
    if (progress < 0.999) {
        float start = -PI * 0.5;
        float sweep = TWO_PI * progress;
        float angle = atan(point.y, point.x);
        float relative = mod(angle - start + TWO_PI, TWO_PI);

        if (relative > sweep) {
            vec2 startPoint = center + vec2(cos(start), sin(start)) * circleRadius;
            float endAngle = start + sweep;
            vec2 endPoint = center + vec2(cos(endAngle), sin(endAngle)) * circleRadius;
            distanceValue = min(length(local - startPoint), length(local - endPoint)) - stroke * 0.5;
        }
    }

    float aa = max(fwidth(local.x) + fwidth(local.y), 0.75);
    vec4 color = vertexColor * ColorModulator;
    color.a *= clamp(alphaFromDistance(distanceValue, aa), 0.0, 1.0);
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}