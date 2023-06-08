---
title: Aspose.CAD.FileFormats.GLB
second_title: Aspose.CAD for .NET API Reference
description: 
type: docs
weight: 700
url: /net/aspose.cad.fileformats.glb/
---


## Classes

| Class | Description |
| --- | --- |
| [Accessor](./accessor/) | A typed view into a buffer view that contains raw binary data. |
| [AccessorSparse](./accessorsparse/) | Sparse storage of accessor values that deviate from their initialization value. |
| [AccessorSparseIndices](./accessorsparseindices/) | An object pointing to a buffer view containing the indices of deviating accessor values. The number of indices is equal to `accessor.sparse.count`. Indices **MUST** strictly increase. |
| [AccessorSparseValues](./accessorsparsevalues/) | An object pointing to a buffer view containing the deviating accessor values. The number of elements is equal to `accessor.sparse.count` times number of components. The elements have the same component type as the base accessor. The elements are tightly packed. Data **MUST** be aligned following the same rules as the base accessor. |
| [AgiArticulation](./agiarticulation/) | A model articulation definition. |
| [AgiArticulationStage](./agiarticulationstage/) | One stage of a model articulation definition. |
| [AgiNodeArticulations](./aginodearticulations/) | glTF Extension for an individual node in a glTF model, to associate it with the model's root AGI_articulations object. |
| [AgiNodeStkMetadata](./aginodestkmetadata/) | glTF Extension for an individual node in a glTF model, to associate it with the model's root AGI_stk_metadata object. |
| [AgiRootArticulations](./agirootarticulations/) | glTF Extension that defines metadata for applying external analysis or effects to a model. |
| [AgiRootStkMetadata](./agirootstkmetadata/) | glTF Extension that defines metadata for use with STK (Systems Tool Kit). |
| [AgiStkSolarPanelGroup](./agistksolarpanelgroup/) | A solar panel group definition. |
| [Animation](./animation/) | A keyframe animation. |
| [AnimationChannel](./animationchannel/) | An animation channel combines an animation sampler with a target property being animated. |
| [Asset](./asset/) | Metadata about the glTF asset. |
| [Buffer](./buffer/) | A buffer points to binary geometry, animation, or skins. |
| [BufferView](./bufferview/) | A view into a buffer generally representing a subset of the buffer. |
| [Camera](./camera/) | A camera's projection. A node **MAY** reference a camera to apply a transform to place the camera in the scene. |
| [CameraOrthographic](./cameraorthographic/) | An orthographic camera containing properties to create an orthographic projection matrix. |
| [CameraPerspective](./cameraperspective/) | A perspective camera containing properties to create a perspective projection matrix. |
| [ExtensionsFactory](./extensionsfactory/) | Global extensions manager. |
| [ExtraProperties](./extraproperties/) | Represents the base class for all glTF 2 Schema objects. |
| [FileReaderCallback](./filereadercallback/) | Callback used for loading associated files of current model. |
| [FileWriterCallback](./filewritercallback/) | Callback used for saving associated files of the current model. |
| [GlbData](./glbdata/) | The root object for a glTF asset. |
| [GlbImage](./glbimage/) | Represents the base class of a serializable glTF schema2 object. Inherited by [`ExtraProperties`](../aspose.cad.fileformats.glb/extraproperties/). |
| [ImageDecodeCallback](./imagedecodecallback/) | Callback used to intercept the loading of textures so they can be decoded by the client engine and uploaded to the GPU if neccesary. |
| [ImageGlb](./imageglb/) | Image data used to create a texture. Image **MAY** be referenced by an URI (or IRI) or a buffer view index. |
| [ImageWriterCallback](./imagewritercallback/) | Callback to control the image writing behavior. |
| [JsonFilterCallback](./jsonfiltercallback/) | Callback used to preprocess and postprocess json before reading and after writing. |
| [LogicalChildOfRoot](./logicalchildofroot/) | All gltf elements stored in ModelRoot must inherit from this class. |
| [Material](./material/) | The material appearance of a primitive. |
| [Mesh](./mesh/) | A set of primitives to be rendered. Its global transform is defined by a node that references it. |
| [MeshGpuInstancing](./meshgpuinstancing/) | glTF extension defines instance attributes for a node with a mesh. |
| [MeshPrimitive](./meshprimitive/) | Geometry to be rendered with the given material. |
| [Node](./node/) | A node in the node hierarchy. When the node contains `skin`, all `mesh.primitives` **MUST** contain `JOINTS_0` and `WEIGHTS_0` attributes. A node **MAY** have either a `matrix` or any combination of `translation`/`rotation`/`scale` (TRS) properties. TRS properties are converted to matrices and postmultiplied in the `T * R * S` order to compose the transformation matrix; first the scale is applied to the vertices, then the rotation, and then the translation. If none are provided, the transform is the identity. When a node is targeted for animation (referenced by an animation.channel.target), `matrix` **MUST NOT** be present. |
| [PunctualLight](./punctuallight/) | A directional, point, or spot light. |
| [ReadSettings](./readsettings/) | Read settings and base class of ReadContext |
| [Scene](./scene/) | The root nodes of a scene. |
| [Skin](./skin/) | Joints and matrices defining a skin. |
| [Texture](./texture/) | A texture and its sampler. |
| [TextureSampler](./texturesampler/) | Texture sampler properties for filtering and wrapping modes. |
| [TextureTransform](./texturetransform/) | glTF extension that enables shifting and scaling UV coordinates on a per-texture basis |
| [UriResolver](./uriresolver/) |  |
| [WriteContext](./writecontext/) | Configuration settings for writing model files. |
| [WriteSettings](./writesettings/) | Write settings and base class of [`WriteContext`](../aspose.cad.fileformats.glb/writecontext/) |
## Structures

| Structure | Description |
| --- | --- |
| [MaterialChannel](./materialchannel/) | Represents a material sub-channel, which usually contains a texture. Use [`Channels`](../aspose.cad.fileformats.glb/material/channels/) and [`FindChannel`](../aspose.cad.fileformats.glb/material/findchannel/) to access it. |
| [NodeCurveSamplers](./nodecurvesamplers/) | Represents an proxy to acccess the animation curves of a [`Node`](../aspose.cad.fileformats.glb/node/). Use [`GetCurveSamplers`](../aspose.cad.fileformats.glb/node/getcurvesamplers/) for access. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IAnimationSampler&lt;T&gt;](./ianimationsampler-1/) | Represents an interface to a curve made of time-value points. |
| [ICamera](./icamera/) | Common interface for [`CameraOrthographic`](../aspose.cad.fileformats.glb/cameraorthographic/) and [`CameraPerspective`](../aspose.cad.fileformats.glb/cameraperspective/). |
| [IConvertibleToGltf2](./iconvertibletogltf2/) | Defines a method that converts the implementing reference to a [`GlbImage`](../aspose.cad.fileformats.glb/glbimage/) |
| [IExtraProperties](./iextraproperties/) |  |
| [IMaterialParameter](./imaterialparameter/) |  |
| [IVisualNodeContainer](./ivisualnodecontainer/) | Represents an abstract interface for a visual hierarchy. Implemented by [`Node`](../aspose.cad.fileformats.glb/node/) and [`Scene`](../aspose.cad.fileformats.glb/scene/). |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [AgiArticulationTransformType](./agiarticulationtransformtype/) | The type of motion applied by this articulation stage. |
| [AlphaMode](./alphamode/) | The alpha rendering mode of the material. |
| [AnimationInterpolationMode](./animationinterpolationmode/) | Interpolation algorithm. |
| [BufferMode](./buffermode/) | The hint representing the intended GPU buffer type to use with this buffer view. |
| [CameraType](./cameratype/) | Specifies if the camera uses a perspective or orthographic projection. |
| [DimensionType](./dimensiontype/) | Specifies if the accessor's elements are scalars, vectors, or matrices. |
| [EncodingType](./encodingtype/) | The datatype of the accessor's components. |
| [IndexEncodingType](./indexencodingtype/) | The indices data type. |
| [PrimitiveType](./primitivetype/) | The topology type of primitives to render. |
| [PropertyPath](./propertypath/) | The name of the node's TRS property to animate, or the weights of the Morph Targets it instantiates. For the translation property, the values that are provided by the sampler are the translation along the X, Y, and Z axes. For the rotation property, the values are a quaternion in the order (x, y, z, w), where w is the scalar. For the scale property, the values are the scaling factors along the X, Y, and Z axes. |
| [PunctualLightType](./punctuallighttype/) | Defines all the types of [`PunctualLight`](../aspose.cad.fileformats.glb/punctuallight/) types. |
| [ResourceWriteMode](./resourcewritemode/) | Determines how resources are written. |
| [TextureInterpolationFilter](./textureinterpolationfilter/) | Magnification filter. |
| [TextureMipMapFilter](./texturemipmapfilter/) | Minification filter. |
| [TextureWrapMode](./texturewrapmode/) | T (V) wrapping mode. |


