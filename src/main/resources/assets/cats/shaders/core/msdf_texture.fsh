#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

uniform sampler2D Sampler0;

in vec2 texCoord0;
in vec4 vertexColor;

out vec4 fragColor;

float median(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

void main() {
    vec3 sampleValue = texture(Sampler0, texCoord0).rgb;
    float signedDistance = median(sampleValue.r, sampleValue.g, sampleValue.b) - 0.5;
    float alpha = clamp(signedDistance / max(fwidth(signedDistance), 0.0001) + 0.5, 0.0, 1.0);

    vec4 color = vertexColor * ColorModulator;
    color.a *= alpha;
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}
