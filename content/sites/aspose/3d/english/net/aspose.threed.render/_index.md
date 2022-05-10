---
title: Aspose.ThreeD.Render
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 70
url: /net/aspose.threed.render/
---


## Classes

| Class | Description |
| --- | --- |
| class [DescriptorSetUpdater](./descriptorsetupdater) | This class allows to update the [`IDescriptorSet`](aspose.threed.render/idescriptorset) in a chain operation. |
| class [DriverException](./driverexception) | The exception raised by internal rendering drivers. |
| class [EntityRenderer](./entityrenderer) | Subclass this to implement rendering for different kind of entities. |
| class [EntityRendererKey](./entityrendererkey) | The key of registered entity renderer |
| class [GLSLSource](./glslsource) | The source code of shaders in GLSL |
| class [InitializationException](./initializationexception) | Exceptions in render pipeline initialization |
| abstract class [PostProcessing](./postprocessing) | The post-processing effects |
| class [PushConstant](./pushconstant) | A utility to provide data to shader through push constant. |
| abstract class [Renderer](./renderer) | The context about renderer. |
| abstract class [RendererVariableManager](./renderervariablemanager) | This class manages variables used in rendering |
| abstract class [RenderFactory](./renderfactory) | RenderFactory creates all resources that represented in rendering pipeline. |
| class [RenderParameters](./renderparameters) | Describe the parameters of the render target |
| abstract class [RenderResource](./renderresource) | The abstract class of all render resources All render resources will be disposed when the renderer is released. Classes like [`Mesh`](aspose.threed.entities/mesh)/[`Texture`](aspose.threed.shading/texture) will have a corresponding RenderResource |
| class [RenderState](./renderstate) | Render state for building the pipeline The changes made on render state will not affect the created pipeline instances. |
| class [ShaderException](./shaderexception) | Shader related exceptions |
| abstract class [ShaderProgram](./shaderprogram) | The shader program |
| class [ShaderSet](./shaderset) | Shader programs for each kind of materials |
| abstract class [ShaderSource](./shadersource) | The source code of shader |
| class [ShaderVariable](./shadervariable) | Shader variable |
| class [SPIRVSource](./spirvsource) | The compiled shader in SPIR-V format. |
| class [StencilState](./stencilstate) | Stencil states per face. |
| class [TextureData](./texturedata) | This class contains the raw data and format definition of a texture. |
| class [Viewport](./viewport) | A [`IRenderTarget`](aspose.threed.render/irendertarget) contains at least one viewport for rendering the scene. |
| class [WindowHandle](./windowhandle) | Encapsulated window handle for different platforms. |
## Interfaces

| Interface | Description |
| --- | --- |
| interface [IBuffer](./ibuffer) | The base interface of all managed buffers used in rendering |
| interface [ICommandList](./icommandlist) | Encodes a sequence of commands which will be sent to GPU to render. |
| interface [IDescriptorSet](./idescriptorset) | The descriptor sets describes different resources that can be used to bind to the render pipeline like buffers, textures |
| interface [IIndexBuffer](./iindexbuffer) | The index buffer describes the geometry used in rendering pipeline. |
| interface [IPipeline](./ipipeline) | The pre-baked sequence of operations to draw in GPU side. |
| interface [IRenderQueue](./irenderqueue) | Entity renderer uses this queue to manage render tasks. |
| interface [IRenderTarget](./irendertarget) | The base interface of render target |
| interface [IRenderTexture](./irendertexture) | The interface of render texture |
| interface [IRenderWindow](./irenderwindow) | IRenderWindow represents the native window created by operating system that supports rendering. |
| interface [ITexture1D](./itexture1d) | 1D texture |
| interface [ITexture2D](./itexture2d) | 2D texture |
| interface [ITextureCubemap](./itexturecubemap) | Cube map texture |
| interface [ITextureUnit](./itextureunit) | [`ITextureUnit`](aspose.threed.render/itextureunit) represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader, where the [`Texture`](aspose.threed.shading/texture) only represents a reference to an external file. More details can be found https://en.wikipedia.org/wiki/Texture_mapping_unit |
| interface [IVertexBuffer](./ivertexbuffer) | The vertex buffer holds the polygon vertex data that will be sent to rendering pipeline |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [BlendFactor](./blendfactor) | Blend factor specify pixel arithmetic. |
| enum [CompareFunction](./comparefunction) | The compare function used in depth/stencil testing. |
| enum [CubeFace](./cubeface) | Each face of the cube map texture |
| enum [CullFaceMode](./cullfacemode) | What face to cull |
| enum [DrawOperation](./drawoperation) | The primitive types to render |
| enum [EntityRendererFeatures](./entityrendererfeatures) | The extra features that the entity renderer will provide |
| enum [FrontFace](./frontface) | Define front- and back-facing polygons |
| enum [IndexDataType](./indexdatatype) | The data type of the elements in [`IIndexBuffer`](aspose.threed.render/iindexbuffer) |
| enum [PixelFormat](./pixelformat) | The pixel's format used in texture unit. |
| enum [PolygonMode](./polygonmode) | The polygon rasterization mode |
| enum [PresetShaders](./presetshaders) | This defines the preset internal shaders used by the renderer. |
| enum [RenderQueueGroupId](./renderqueuegroupid) | The group id of render queue |
| enum [RenderStage](./renderstage) | The render stage |
| enum [ShaderStage](./shaderstage) | Shader stage |
| enum [StencilAction](./stencilaction) | The stencil test actions |
| enum [TextureType](./texturetype) | The type of the [`ITextureUnit`](aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
