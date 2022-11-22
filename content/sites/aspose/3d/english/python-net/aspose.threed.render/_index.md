---
title: aspose.threed.render
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.render/
is_root: false
---

All rendering related classes are defined in this namespace

### Classes
| Class | Description |
| :- | :- |
| [DescriptorSetUpdater](/3d/python-net/aspose.threed.render/descriptorsetupdater) | This class allows to update the [IDescriptorSet](/3d/python-net/aspose.threed.render/idescriptorset) in a chain operation. |
| [DriverException](/3d/python-net/aspose.threed.render/driverexception) | The exception raised by internal rendering drivers. |
| [EntityRenderer](/3d/python-net/aspose.threed.render/entityrenderer) | Subclass this to implement rendering for different kind of entities. |
| [EntityRendererKey](/3d/python-net/aspose.threed.render/entityrendererkey) | The key of registered entity renderer |
| [GLSLSource](/3d/python-net/aspose.threed.render/glslsource) | The source code of shaders in GLSL |
| [IBuffer](/3d/python-net/aspose.threed.render/ibuffer) | The base interface of all managed buffers used in rendering |
| [ICommandList](/3d/python-net/aspose.threed.render/icommandlist) | Encodes a sequence of commands which will be sent to GPU to render. |
| [IDescriptorSet](/3d/python-net/aspose.threed.render/idescriptorset) | The descriptor sets describes different resources that can be used to bind to the render pipeline like buffers, textures |
| [IIndexBuffer](/3d/python-net/aspose.threed.render/iindexbuffer) | The index buffer describes the geometry used in rendering pipeline. |
| [IPipeline](/3d/python-net/aspose.threed.render/ipipeline) | The pre-baked sequence of operations to draw in GPU side. |
| [IRenderQueue](/3d/python-net/aspose.threed.render/irenderqueue) | Entity renderer uses this queue to manage render tasks. |
| [IRenderTarget](/3d/python-net/aspose.threed.render/irendertarget) | The base interface of render target |
| [IRenderTexture](/3d/python-net/aspose.threed.render/irendertexture) | The interface of render texture |
| [IRenderWindow](/3d/python-net/aspose.threed.render/irenderwindow) | IRenderWindow represents the native window created by operating system that supports rendering. |
| [ITexture1D](/3d/python-net/aspose.threed.render/itexture1d) | 1D texture |
| [ITexture2D](/3d/python-net/aspose.threed.render/itexture2d) | 2D texture |
| [ITextureCubemap](/3d/python-net/aspose.threed.render/itexturecubemap) | Cube map texture |
| [ITextureUnit](/3d/python-net/aspose.threed.render/itextureunit) | [ITextureUnit](/3d/python-net/aspose.threed.render/itextureunit) represents a texture in the memory that shared between GPU and CPU and can be sampled by the shader,<br/>where the [Texture](/3d/python-net/aspose.threed.shading/texture) only represents a reference to an external file.<br/>More details can be found https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](/3d/python-net/aspose.threed.render/ivertexbuffer) | The vertex buffer holds the polygon vertex data that will be sent to rendering pipeline |
| [InitializationException](/3d/python-net/aspose.threed.render/initializationexception) | Exceptions in render pipeline initialization |
| [PostProcessing](/3d/python-net/aspose.threed.render/postprocessing) | The post-processing effects |
| [PushConstant](/3d/python-net/aspose.threed.render/pushconstant) | A utility to provide data to shader through push constant. |
| [RenderFactory](/3d/python-net/aspose.threed.render/renderfactory) | RenderFactory creates all resources that represented in rendering pipeline. |
| [RenderParameters](/3d/python-net/aspose.threed.render/renderparameters) | Describe the parameters of the render target |
| [RenderResource](/3d/python-net/aspose.threed.render/renderresource) | The abstract class of all render resources<br/>All render resources will be disposed when the renderer is released.<br/>Classes like [Mesh](/3d/python-net/aspose.threed.entities/mesh)/[Texture](/3d/python-net/aspose.threed.shading/texture) will have a corresponding RenderResource |
| [RenderState](/3d/python-net/aspose.threed.render/renderstate) | Render state for building the pipeline<br/>The changes made on render state will not affect the created pipeline instances. |
| [Renderer](/3d/python-net/aspose.threed.render/renderer) | The context about renderer. |
| [RendererVariableManager](/3d/python-net/aspose.threed.render/renderervariablemanager) | This class manages variables used in rendering |
| [SPIRVSource](/3d/python-net/aspose.threed.render/spirvsource) | The compiled shader in SPIR-V format. |
| [ShaderException](/3d/python-net/aspose.threed.render/shaderexception) | Shader related exceptions |
| [ShaderProgram](/3d/python-net/aspose.threed.render/shaderprogram) | The shader program |
| [ShaderSet](/3d/python-net/aspose.threed.render/shaderset) | Shader programs for each kind of materials |
| [ShaderSource](/3d/python-net/aspose.threed.render/shadersource) | The source code of shader |
| [ShaderVariable](/3d/python-net/aspose.threed.render/shadervariable) | Shader variable |
| [StencilState](/3d/python-net/aspose.threed.render/stencilstate) | Stencil states per face. |
| [TextureData](/3d/python-net/aspose.threed.render/texturedata) | This class contains the raw data and format definition of a texture. |
| [Viewport](/3d/python-net/aspose.threed.render/viewport) | A [IRenderTarget](/3d/python-net/aspose.threed.render/irendertarget) contains at least one viewport for rendering the scene. |
| [WindowHandle](/3d/python-net/aspose.threed.render/windowhandle) | Encapsulated window handle for different platforms. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [BlendFactor](/3d/python-net/aspose.threed.render/blendfactor) | Blend factor specify pixel arithmetic. |
| [CompareFunction](/3d/python-net/aspose.threed.render/comparefunction) | The compare function used in depth/stencil testing. |
| [CubeFace](/3d/python-net/aspose.threed.render/cubeface) | Each face of the cube map texture |
| [CullFaceMode](/3d/python-net/aspose.threed.render/cullfacemode) | What face to cull |
| [DrawOperation](/3d/python-net/aspose.threed.render/drawoperation) | The primitive types to render |
| [EntityRendererFeatures](/3d/python-net/aspose.threed.render/entityrendererfeatures) | The extra features that the entity renderer will provide |
| [FrontFace](/3d/python-net/aspose.threed.render/frontface) | Define front- and back-facing polygons |
| [IndexDataType](/3d/python-net/aspose.threed.render/indexdatatype) | The data type of the elements in [IIndexBuffer](/3d/python-net/aspose.threed.render/iindexbuffer) |
| [PixelFormat](/3d/python-net/aspose.threed.render/pixelformat) | The pixel's format used in texture unit. |
| [PolygonMode](/3d/python-net/aspose.threed.render/polygonmode) | The polygon rasterization mode |
| [PresetShaders](/3d/python-net/aspose.threed.render/presetshaders) | This defines the preset internal shaders used by the renderer. |
| [RenderQueueGroupId](/3d/python-net/aspose.threed.render/renderqueuegroupid) | The group id of render queue |
| [RenderStage](/3d/python-net/aspose.threed.render/renderstage) | The render stage |
| [ShaderStage](/3d/python-net/aspose.threed.render/shaderstage) | Shader stage |
| [StencilAction](/3d/python-net/aspose.threed.render/stencilaction) | The stencil test actions |
| [TextureType](/3d/python-net/aspose.threed.render/texturetype) | The type of the [ITextureUnit](/3d/python-net/aspose.threed.render/itextureunit) |


