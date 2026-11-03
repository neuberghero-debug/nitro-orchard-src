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

void main() {
    vec4 base = texture(Sampler0, texCoord0) * vertexColor;
    if (base.a <= 0.001) {
        discard;
    }

    vec2 p = texCoord0 * 2.0 - 1.0;
    float curve = length(p * vec2(0.92, 1.06));
    float edge = smoothstep(1.08, 0.32, curve);
    float halo = smoothstep(1.12, 0.58, curve);
    float center = smoothstep(0.72, 0.0, curve);

    vec3 glow = mix(base.rgb, vec3(1.0), 0.42);
    glow += vec3(1.0) * (0.10 * edge + 0.16 * halo + 0.05 * center);

    float alpha = base.a * (0.14 + 0.30 * edge + 0.20 * halo);
    fragColor = vec4(glow, alpha) * ColorModulator;
}
