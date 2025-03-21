---
title: Class RenderFactory
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.RenderFactory class. RenderFactory creates all resources that represented in rendering pipeline
type: docs
weight: 2180
url: /net/aspose.threed.render/renderfactory/
---
## RenderFactory class

RenderFactory creates all resources that represented in rendering pipeline.

```csharp
public abstract class RenderFactory
```

## Methods

| Name | Description |
| --- | --- |
| abstract [CreateCubeRenderTexture](../../aspose.threed.render/renderfactory/createcuberendertexture/)(RenderParameters, int, int) | Create a render target contains 1 cube texture |
| abstract [CreateDescriptorSet](../../aspose.threed.render/renderfactory/createdescriptorset/)(ShaderProgram) | Create the descriptor set for specified shader program. |
| abstract [CreateIndexBuffer](../../aspose.threed.render/renderfactory/createindexbuffer/)() | Create an [`IIndexBuffer`](../iindexbuffer/) instance to store polygon's face information. |
| abstract [CreatePipeline](../../aspose.threed.render/renderfactory/createpipeline/)(ShaderProgram, RenderState, VertexDeclaration, DrawOperation) | Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations. |
| abstract [CreateRenderTexture](../../aspose.threed.render/renderfactory/createrendertexture/#createrendertexture)(RenderParameters, int, int) | Create a render target contains 1 targets that renders to the texture |
| abstract [CreateRenderTexture](../../aspose.threed.render/renderfactory/createrendertexture/#createrendertexture_1)(RenderParameters, int, int, int) | Create a render target that renders to the texture |
| abstract [CreateRenderWindow](../../aspose.threed.render/renderfactory/createrenderwindow/)(RenderParameters, WindowHandle) | Create a render target that renders to the native window. |
| abstract [CreateShaderProgram](../../aspose.threed.render/renderfactory/createshaderprogram/)(ShaderSource) | Create a [`ShaderProgram`](../shaderprogram/) object |
| [CreateTextureUnit](../../aspose.threed.render/renderfactory/createtextureunit/#createtextureunit)() | Create a 2D texture unit that can be accessed by shader. |
| abstract [CreateTextureUnit](../../aspose.threed.render/renderfactory/createtextureunit/#createtextureunit_1)(TextureType) | Create a texture unit that can be accessed by shader. |
| abstract [CreateUniformBuffer](../../aspose.threed.render/renderfactory/createuniformbuffer/)(int) | Create a new uniform buffer in GPU side with pre-allocated size. |
| abstract [CreateVertexBuffer](../../aspose.threed.render/renderfactory/createvertexbuffer/)(VertexDeclaration) | Create an [`IVertexBuffer`](../ivertexbuffer/) instance to store polygon's vertex information. |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


