---
title: Aspose.ThreeD.Render
second_title: Aspose.3D for .NET API Reference
description: All rendering related classes are defined in this namespace
type: docs
weight: 70
url: /net/aspose.threed.render/
---
All rendering related classes are defined in this namespace

## Classes

| Class | Description |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater) | This class allows to update the [`IDescriptorSet`](../aspose.threed.render/idescriptorset) in a chain operation. |
| [DriverException](./driverexception) | The exception raised by internal rendering drivers. |
| [EntityRenderer](./entityrenderer) | Subclass this to implement rendering for different kind of entities. |
| [EntityRendererKey](./entityrendererkey) | The key of registered entity renderer |
| [GLSLSource](./glslsource) | The source code of shaders in GLSL |
| [InitializationException](./initializationexception) | Exceptions in render pipeline initialization |
| [PixelMapping](./pixelmapping) |  |
| [PostProcessing](./postprocessing) | The post-processing effects |
| [PushConstant](./pushconstant) | A utility to provide data to shader through push constant. |
| [Renderer](./renderer) | The context about renderer. |
| [RendererVariableManager](./renderervariablemanager) | This class manages variables used in rendering |
| [RenderFactory](./renderfactory) | RenderFactory creates all resources that represented in rendering pipeline. |
| [RenderParameters](./renderparameters) | Describe the parameters of the render target |
| [RenderResource](./renderresource) | The abstract class of all render resources All render resources will be disposed when the renderer is released. Classes like [`Mesh`](../aspose.threed.entities/mesh)/[`Texture`](../aspose.threed.shading/texture) will have a corresponding RenderResource |
| [RenderState](./renderstate) | Render state for building the pipeline The changes made on render state will not affect the created pipeline instances. |
| [ShaderException](./shaderexception) | Shader related exceptions |
| [ShaderProgram](./shaderprogram) | The shader program |
| [ShaderSet](./shaderset) | Shader programs for each kind of materials |
| [ShaderSource](./shadersource) | The source code of shader |
| [ShaderVariable](./shadervariable) | Shader variable |
| [SPIRVSource](./spirvsource) | The compiled shader in SPIR-V format. |
| [StencilState](./stencilstate) | Stencil states per face. |
| [TextureCodec](./texturecodec) | Class to manage encoders and decoders for textures. |
| [TextureData](./texturedata) | This class contains the raw data and format definition of a texture. |
| [Viewport](./viewport) | A [`IRenderTarget`](../aspose.threed.render/irendertarget) contains at least one viewport for rendering the scene. |
| [WindowHandle](./windowhandle) | Encapsulated window handle for different platforms. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IBuffer](./ibuffer) | The base interface of all managed buffers used in rendering |
| [ICommandList](./icommandlist) | Encodes a sequence of commands which will be sent to GPU to render. |
| [IDescriptorSet](./idescriptorset) | The descriptor sets describes different resources that can be used to bind to the render pipeline like buffers, textures |
| [IIndexBuffer](./iindexbuffer) | The index buffer describes the geometry used in rendering pipeline. |
| [IPipeline](./ipipeline) | The pre-baked sequence of operations to draw in GPU side. |
| [IRenderQueue](./irenderqueue) | Entity renderer uses this queue to manage render tasks. |
| [IRenderTarget](./irendertarget) | The base interface of render target |
| [IRenderTexture](./irendertexture) | The interface of render texture |
| [IRenderWindow](./irenderwindow) | IRenderWindow represents the native window created by operating system that supports rendering. |
| [ITexture1D](./itexture1d) | 1D texture |
| [ITexture2D](./itexture2d) | 2D texture |
| [ITextureCodec](./itexturecodec) | Codec for textures |
| [ITextureCubemap](./itexturecubemap) | Cube map texture |
| [ITextureDecoder](./itexturedecoder) | External texture decoder should implement this interface for decoding. |
| [ITextureEncoder](./itextureencoder) | External texture encoder should implement this interface for encoding. |
| [ITextureUnit](./itextureunit) | [`ITextureUnit`](../aspose.threed.render/itextureunit) represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader, where the [`Texture`](../aspose.threed.shading/texture) only represents a reference to an external file. More details can be found https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer) | The vertex buffer holds the polygon vertex data that will be sent to rendering pipeline |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [BlendFactor](./blendfactor) | Blend factor specify pixel arithmetic. |
| [CompareFunction](./comparefunction) | The compare function used in depth/stencil testing. |
| [CubeFace](./cubeface) | Each face of the cube map texture |
| [CullFaceMode](./cullfacemode) | What face to cull |
| [DrawOperation](./drawoperation) | The primitive types to render |
| [EntityRendererFeatures](./entityrendererfeatures) | The extra features that the entity renderer will provide |
| [FrontFace](./frontface) | Define front- and back-facing polygons |
| [IndexDataType](./indexdatatype) | The data type of the elements in [`IIndexBuffer`](../aspose.threed.render/iindexbuffer) |
| [PixelFormat](./pixelformat) | The pixel's format used in texture unit. |
| [PixelMapMode](./pixelmapmode) |  |
| [PolygonMode](./polygonmode) | The polygon rasterization mode |
| [PresetShaders](./presetshaders) | This defines the preset internal shaders used by the renderer. |
| [RenderQueueGroupId](./renderqueuegroupid) | The group id of render queue |
| [RenderStage](./renderstage) | The render stage |
| [ShaderStage](./shaderstage) | Shader stage |
| [StencilAction](./stencilaction) | The stencil test actions |
| [TextureType](./texturetype) | The type of the [`ITextureUnit`](../aspose.threed.render/itextureunit) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
