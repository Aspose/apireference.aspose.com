---
title: RenderFactory 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/renderfactory/
---
## RenderFactory class

  RenderFactory creates all resources that represented in rendering pipeline.  @hideconstructor


## Methods

### createRenderTexture{#createRenderTexture}

| Name | Description |
| --- | --- |
| createRenderTexture(parameters, targets, width, height) | Create a render target that renders to the texture | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| parameters | RenderParameters | Render parameters to create the render texture |
| targets | Number | How many color output targets |
| width | Number | The width of the render texture |
| height | Number | The height of the render texture |

 **Result:**
IRenderTexture


---


### createRenderTexture{#createRenderTexture}

| Name | Description |
| --- | --- |
| createRenderTexture(parameters, width, height) | Create a render target contains 1 targets that renders to the texture | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| parameters | RenderParameters | Render parameters to create the render texture |
| width | Number | The width of the render texture |
| height | Number | The height of the render texture |

 **Result:**
IRenderTexture


---


### createDescriptorSet{#createDescriptorSet}

| Name | Description |
| --- | --- |
| createDescriptorSet(shader) | Create the descriptor set for specified shader program. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| shader | ShaderProgram | The shader program |

 **Result:**
IDescriptorSet


---


### createCubeRenderTexture{#createCubeRenderTexture}

| Name | Description |
| --- | --- |
| createCubeRenderTexture(parameters, width, height) | Create a render target contains 1 cube texture | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| parameters | RenderParameters | Render parameters to create the render texture |
| width | Number | The width of the render texture |
| height | Number | The height of the render texture |

 **Result:**
IRenderTexture


---


### createRenderWindow{#createRenderWindow}

| Name | Description |
| --- | --- |
| createRenderWindow(parameters, handle) | Create a render target that renders to the native window. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| parameters | RenderParameters | Render parameters to create the render window |
| handle | WindowHandle | The handle of the window to render |

 **Result:**
IRenderWindow


---


### createVertexBuffer{#createVertexBuffer}

| Name | Description |
| --- | --- |
| createVertexBuffer(declaration) | Create an com.aspose.threed.IVertexBuffer instance to store polygon's vertex information. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  declaratio | VertexDeclaration | null |

 **Result:**
IVertexBuffer


---


### createIndexBuffer{#createIndexBuffer}

| Name | Description |
| --- | --- |
| createIndexBuffer() | Create an com.aspose.threed.IIndexBuffer instance to store polygon's face information. | 

 **Result:**
IIndexBuffer


---


### createTextureUnit{#createTextureUnit}

| Name | Description |
| --- | --- |
| createTextureUnit(textureType) | Create a texture unit that can be accessed by shader. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| textureType | TextureType | TextureType |

 **Result:**
ITextureUnit


---


### createTextureUnit{#createTextureUnit}

| Name | Description |
| --- | --- |
| createTextureUnit() | Create a 2D texture unit that can be accessed by shader. | 

 **Result:**
ITextureUnit


---


### createShaderProgram{#createShaderProgram}

| Name | Description |
| --- | --- |
| createShaderProgram(shaderSource) | Create a ShaderProgram object | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| shaderSource | ShaderSource | The source code of the shader |

 **Result:**
ShaderProgram


---


### createPipeline{#createPipeline}

| Name | Description |
| --- | --- |
| createPipeline(shader, renderState, vertexDeclaration, drawOperation) | Create a preconfigured graphics pipeline with preconfigured shader/render state/vertex declaration and draw operations. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| shader | ShaderProgram | The shader used in the rendering |
| renderState | RenderState | The render state used in the rendering |
| vertexDeclaration | VertexDeclaration | The vertex declaration of input vertex data |
| drawOperation | DrawOperation | DrawOperation |

 **Result:**
IPipeline


---


### createUniformBuffer{#createUniformBuffer}

| Name | Description |
| --- | --- |
| createUniformBuffer(size) | Create a new uniform buffer in GPU side with pre-allocated size. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| size | Number | The size of the uniform buffer |

 **Result:**
IBuffer


---



