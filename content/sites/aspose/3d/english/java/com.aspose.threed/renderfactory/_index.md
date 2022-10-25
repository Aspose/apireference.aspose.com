---
title: RenderFactory
second_title: Aspose.3D for Java API Reference
description: RenderFactory creates all resources that represented in rendering pipeline.
type: docs
weight: 133
url: /java/com.aspose.threed/renderfactory/
---

**Inheritance:**
java.lang.Object
```
public abstract class RenderFactory
```

RenderFactory creates all resources that represented in rendering pipeline.
## Constructors

| Constructor | Description |
| --- | --- |
| [RenderFactory()](#RenderFactory--) |  |
## Methods

| Method | Description |
| --- | --- |
| [createRenderTexture(RenderParameters parameters, int targets, int width, int height)](#createRenderTexture-com.aspose.threed.RenderParameters-int-int-int-) | Create a render target that renders to the texture |
| [createRenderTexture(RenderParameters parameters, int width, int height)](#createRenderTexture-com.aspose.threed.RenderParameters-int-int-) | Create a render target contains 1 targets that renders to the texture |
| [createDescriptorSet(ShaderProgram shader)](#createDescriptorSet-com.aspose.threed.ShaderProgram-) | Create the descriptor set for specified shader program. |
| [createCubeRenderTexture(RenderParameters parameters, int width, int height)](#createCubeRenderTexture-com.aspose.threed.RenderParameters-int-int-) | Create a render target contains 1 cube texture |
| [createRenderWindow(RenderParameters parameters, WindowHandle handle)](#createRenderWindow-com.aspose.threed.RenderParameters-com.aspose.threed.WindowHandle-) | Create a render target that renders to the native window. |
| [createVertexBuffer(VertexDeclaration declaration)](#createVertexBuffer-com.aspose.threed.VertexDeclaration-) | Create an com.aspose.threed.IVertexBuffer instance to store polygon's vertex information. |
| [createIndexBuffer()](#createIndexBuffer--) | Create an com.aspose.threed.IIndexBuffer instance to store polygon's face information. |
| [createTextureUnit(TextureType textureType)](#createTextureUnit-com.aspose.threed.TextureType-) | Create a texture unit that can be accessed by shader. |
| [createTextureUnit()](#createTextureUnit--) | Create a 2D texture unit that can be accessed by shader. |
| [createShaderProgram(ShaderSource shaderSource)](#createShaderProgram-com.aspose.threed.ShaderSource-) | Create a com.aspose.threed.ShaderProgram object |
| [createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation)](#createPipeline-com.aspose.threed.ShaderProgram-com.aspose.threed.RenderState-com.aspose.threed.VertexDeclaration-com.aspose.threed.DrawOperation-) | Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations. |
| [createUniformBuffer(int size)](#createUniformBuffer-int-) | Create a new uniform buffer in GPU side with pre-allocated size. |
### RenderFactory() {#RenderFactory--}
```
public RenderFactory()
```


### createRenderTexture(RenderParameters parameters, int targets, int width, int height) {#createRenderTexture-com.aspose.threed.RenderParameters-int-int-int-}
```
public abstract IRenderTexture createRenderTexture(RenderParameters parameters, int targets, int width, int height)
```


Create a render target that renders to the texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Render parameters to create the render texture |
| targets | int | How many color output targets |
| width | int | The width of the render texture |
| height | int | The height of the render texture |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createRenderTexture(RenderParameters parameters, int width, int height) {#createRenderTexture-com.aspose.threed.RenderParameters-int-int-}
```
public abstract IRenderTexture createRenderTexture(RenderParameters parameters, int width, int height)
```


Create a render target contains 1 targets that renders to the texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Render parameters to create the render texture |
| width | int | The width of the render texture |
| height | int | The height of the render texture |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createDescriptorSet(ShaderProgram shader) {#createDescriptorSet-com.aspose.threed.ShaderProgram-}
```
public abstract IDescriptorSet createDescriptorSet(ShaderProgram shader)
```


Create the descriptor set for specified shader program.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shader | [ShaderProgram](../../com.aspose.threed/shaderprogram) | The shader program |

**Returns:**
[IDescriptorSet](../../com.aspose.threed/idescriptorset) - A new descriptor set instance
### createCubeRenderTexture(RenderParameters parameters, int width, int height) {#createCubeRenderTexture-com.aspose.threed.RenderParameters-int-int-}
```
public abstract IRenderTexture createCubeRenderTexture(RenderParameters parameters, int width, int height)
```


Create a render target contains 1 cube texture

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Render parameters to create the render texture |
| width | int | The width of the render texture |
| height | int | The height of the render texture |

**Returns:**
[IRenderTexture](../../com.aspose.threed/irendertexture)
### createRenderWindow(RenderParameters parameters, WindowHandle handle) {#createRenderWindow-com.aspose.threed.RenderParameters-com.aspose.threed.WindowHandle-}
```
public abstract IRenderWindow createRenderWindow(RenderParameters parameters, WindowHandle handle)
```


Create a render target that renders to the native window.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| parameters | [RenderParameters](../../com.aspose.threed/renderparameters) | Render parameters to create the render window |
| handle | [WindowHandle](../../com.aspose.threed/windowhandle) | The handle of the window to render |

**Returns:**
[IRenderWindow](../../com.aspose.threed/irenderwindow)
### createVertexBuffer(VertexDeclaration declaration) {#createVertexBuffer-com.aspose.threed.VertexDeclaration-}
```
public abstract IVertexBuffer createVertexBuffer(VertexDeclaration declaration)
```


Create an com.aspose.threed.IVertexBuffer instance to store polygon's vertex information.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| declaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |  |

**Returns:**
[IVertexBuffer](../../com.aspose.threed/ivertexbuffer)
### createIndexBuffer() {#createIndexBuffer--}
```
public abstract IIndexBuffer createIndexBuffer()
```


Create an com.aspose.threed.IIndexBuffer instance to store polygon's face information.

**Returns:**
[IIndexBuffer](../../com.aspose.threed/iindexbuffer)
### createTextureUnit(TextureType textureType) {#createTextureUnit-com.aspose.threed.TextureType-}
```
public abstract ITextureUnit createTextureUnit(TextureType textureType)
```


Create a texture unit that can be accessed by shader.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textureType | [TextureType](../../com.aspose.threed/texturetype) | Type of the texture |

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit)
### createTextureUnit() {#createTextureUnit--}
```
public ITextureUnit createTextureUnit()
```


Create a 2D texture unit that can be accessed by shader.

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit)
### createShaderProgram(ShaderSource shaderSource) {#createShaderProgram-com.aspose.threed.ShaderSource-}
```
public abstract ShaderProgram createShaderProgram(ShaderSource shaderSource)
```


Create a com.aspose.threed.ShaderProgram object

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shaderSource | [ShaderSource](../../com.aspose.threed/shadersource) | The source code of the shader |

**Returns:**
[ShaderProgram](../../com.aspose.threed/shaderprogram)
### createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation) {#createPipeline-com.aspose.threed.ShaderProgram-com.aspose.threed.RenderState-com.aspose.threed.VertexDeclaration-com.aspose.threed.DrawOperation-}
```
public abstract IPipeline createPipeline(ShaderProgram shader, RenderState renderState, VertexDeclaration vertexDeclaration, DrawOperation drawOperation)
```


Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shader | [ShaderProgram](../../com.aspose.threed/shaderprogram) | The shader used in the rendering |
| renderState | [RenderState](../../com.aspose.threed/renderstate) | The render state used in the rendering |
| vertexDeclaration | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) | The vertex declaration of input vertex data |
| drawOperation | [DrawOperation](../../com.aspose.threed/drawoperation) | Draw operation |

**Returns:**
[IPipeline](../../com.aspose.threed/ipipeline) - A new pipeline instance
### createUniformBuffer(int size) {#createUniformBuffer-int-}
```
public abstract IBuffer createUniformBuffer(int size)
```


Create a new uniform buffer in GPU side with pre-allocated size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | int | The size of the uniform buffer |

**Returns:**
[IBuffer](../../com.aspose.threed/ibuffer) - The uniform buffer instance
