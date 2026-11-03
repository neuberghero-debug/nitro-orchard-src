#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};
layout(std140) uniform Projection {
    mat4 ProjMat;
};

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;
in vec3 Normal;

out vec2 texCoord0;
out vec2 shapeSize;
out vec3 shapeData;
out vec4 vertexColor;

const float SIZE_PACK_SCALE = 8.0;

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
    texCoord0 = UV0;
    shapeSize = max(vec2(UV2) / SIZE_PACK_SCALE, vec2(0.125));
    shapeData = Normal;
    vertexColor = Color;
}
