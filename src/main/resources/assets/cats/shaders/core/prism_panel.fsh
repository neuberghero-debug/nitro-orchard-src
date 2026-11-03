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

vec3 hsv2rgb(vec3 c) {
    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);
    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);
    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);
}

void main() {
    vec4 base = texture(Sampler0, texCoord0) * vertexColor;
    if (base.a <= 0.001) {
        discard;
    }

    vec2 p = texCoord0 * 2.0 - 1.0;
    float curve = length(p * vec2(0.88, 1.05));
    float mask = smoothstep(1.12, 0.18, curve);

    float band = 0.5 + 0.5 * sin((texCoord0.x + texCoord0.y) * 14.0);
    float hue = fract(texCoord0.y * 0.82 + texCoord0.x * 0.21 + band * 0.08);
    vec3 prism = hsv2rgb(vec3(hue, 0.74, 1.0));
    vec3 edgeTint = hsv2rgb(vec3(fract(hue + 0.11), 0.55, 1.0));

    vec3 shaded = mix(prism, edgeTint, smoothstep(0.0, 1.0, texCoord0.x));
    shaded = mix(shaded, base.rgb, 0.18);
    shaded += vec3(1.0) * (0.06 + 0.08 * mask);

    float alpha = base.a * (0.22 + 0.34 * mask);
    fragColor = vec4(shaded, alpha) * ColorModulator;
}
