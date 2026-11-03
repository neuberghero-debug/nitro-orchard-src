#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

in vec2 texCoord0;
in vec4 vertexColor;

out vec4 fragColor;

void main() {
    vec4 base = vertexColor;
    if (base.a <= 0.001) {
        discard;
    }

    vec2 p = texCoord0 * 2.0 - 1.0;
    float curve = length(p * vec2(0.92, 1.10));
    float mask = smoothstep(1.18, 0.30, curve);
    float softEdge = clamp(1.0 - curve, 0.0, 1.0);
    softEdge *= softEdge;

    float waveA = sin(p.x * 8.5 + p.y * 4.2);
    float waveB = cos(p.y * 9.5 - p.x * 3.4);
    float waveC = sin((p.x + p.y) * 11.0);
    float caustic = 0.5 + 0.5 * (waveA * 0.34 + waveB * 0.40 + waveC * 0.26);
    caustic = smoothstep(0.18, 0.88, caustic);

    float sweep = exp(-pow(p.y + p.x * 0.28 - 0.18, 2.0) * 18.0);
    float secondary = exp(-pow(p.y - p.x * 0.42 + 0.20, 2.0) * 24.0);
    float topGlow = smoothstep(0.90, -0.20, p.y);

    vec3 tint = clamp(base.rgb, 0.0, 1.0);
    vec3 liquid = tint * (0.12 + softEdge * 0.16);
    liquid += vec3(1.0) * (0.08 + 0.10 * softEdge + 0.08 * topGlow);
    liquid += vec3(1.0) * sweep * 0.18;
    liquid += mix(vec3(0.82, 0.93, 1.0), tint, 0.35) * secondary * 0.12;
    liquid += mix(vec3(0.93, 0.98, 1.0), tint, 0.28) * caustic * 0.08;

    float alpha = base.a * (0.24 + 0.28 * mask + 0.10 * topGlow);
    fragColor = vec4(liquid, alpha) * ColorModulator;
}
