---
title: aspose.cad.fileformats.glb
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.glb/
is_root: false
---

The namespace handles GLB files format processing.

### Classes
| Class | Description |
| :- | :- |
| [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) |  |
| [`Animation`](/cad/python-net/aspose.cad.fileformats.glb/animation) | A keyframe animation. |
| [`AnimationChannel`](/cad/python-net/aspose.cad.fileformats.glb/animationchannel) |  |
| [`Asset`](/cad/python-net/aspose.cad.fileformats.glb/asset) | Metadata about the glTF asset. |
| [`AttributeFormatTuple`](/cad/python-net/aspose.cad.fileformats.glb/attributeformattuple) |  |
| [`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer) | A buffer points to binary geometry, animation, or skins. |
| [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) | A view into a buffer generally representing a subset of the buffer. |
| [`Camera`](/cad/python-net/aspose.cad.fileformats.glb/camera) | A camera's projection.<br/>A node **MAY** reference a camera to apply a transform to place the camera in the scene. |
| [`ExtensionsFactory`](/cad/python-net/aspose.cad.fileformats.glb/extensionsfactory) | Global extensions manager. |
| [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) | Represents the base class for all glTF 2 Schema objects. |
| [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) | The root object for a glTF asset. |
| [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage) |  |
| [`GltfImage`](/cad/python-net/aspose.cad.fileformats.glb/gltfimage) |  |
| [`GltfImageBase`](/cad/python-net/aspose.cad.fileformats.glb/gltfimagebase) | Represents the base class of a serializable glTF schema2 object.<br/>Inherited by [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties). |
| [`ICamera`](/cad/python-net/aspose.cad.fileformats.glb/icamera) | Common interface for CameraOrthographic and CameraPerspective. |
| [`IMaterialParameter`](/cad/python-net/aspose.cad.fileformats.glb/imaterialparameter) |  |
| [`IVisualNodeContainer`](/cad/python-net/aspose.cad.fileformats.glb/ivisualnodecontainer) | Represents an abstract interface for a visual hierarchy.<br/>Implemented by [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) and [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene). |
| [`ImageGlb`](/cad/python-net/aspose.cad.fileformats.glb/imageglb) | Image data used to create a texture. Image **MAY** be referenced by an URI (or IRI) or a buffer view index. |
| [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) | All gltf elements stored in ModelRoot must inherit from this class. |
| [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material) | The material appearance of a primitive. |
| [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel) | Represents a material sub-channel, which usually contains a texture.<br/><br/>Use [`Material.channels`](/cad/python-net/aspose.cad.fileformats.glb/material#channels) and [`Material.find_channel`](/cad/python-net/aspose.cad.fileformats.glb/material/find_channel) to access it. |
| [`Mesh`](/cad/python-net/aspose.cad.fileformats.glb/mesh) | A set of primitives to be rendered.<br/>Its global transform is defined by a node that references it. |
| [`MeshGpuInstancing`](/cad/python-net/aspose.cad.fileformats.glb/meshgpuinstancing) | glTF extension defines instance attributes for a node with a mesh. |
| [`MeshPrimitive`](/cad/python-net/aspose.cad.fileformats.glb/meshprimitive) | Geometry to be rendered with the given material. |
| [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node) | A node in the node hierarchy.<br/>When the node contains `skin`, all `mesh.primitives` **MUST** contain `JOINTS_0` and `WEIGHTS_0` attributes.<br/>A node **MAY** have either a `matrix` or any combination of `translation`/`rotation`/`scale` (TRS) properties. TRS properties are converted to matrices and postmultiplied in the `T * R * S` order to compose the transformation matrix; first the scale is applied to the vertices, then the rotation, and then the translation. If none are provided, the transform is the identity. When a node is targeted for animation (referenced by an animation.channel.target), `matrix` **MUST NOT** be present. |
| [`NodeCurveSamplers`](/cad/python-net/aspose.cad.fileformats.glb/nodecurvesamplers) | Represents an proxy to acccess the animation curves of a [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node).<br/>Use [`Node.get_curve_samplers`](/cad/python-net/aspose.cad.fileformats.glb/node/get_curve_samplers) for access. |
| [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) | A directional, point, or spot light. |
| [`ReadSettings`](/cad/python-net/aspose.cad.fileformats.glb/readsettings) | Read settings and base class of ReadContext |
| [`Scene`](/cad/python-net/aspose.cad.fileformats.glb/scene) | The root nodes of a scene. |
| [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin) | Joints and matrices defining a skin. |
| [`Texture`](/cad/python-net/aspose.cad.fileformats.glb/texture) | A texture and its sampler. |
| [`TextureSampler`](/cad/python-net/aspose.cad.fileformats.glb/texturesampler) | Texture sampler properties for filtering and wrapping modes. |
| [`TextureTransform`](/cad/python-net/aspose.cad.fileformats.glb/texturetransform) | glTF extension that enables shifting and scaling UV coordinates on a per-texture basis |
| [`ValueLocationTuple`](/cad/python-net/aspose.cad.fileformats.glb/valuelocationtuple) |  |
| [`VertexColor2Texture2Tuple`](/cad/python-net/aspose.cad.fileformats.glb/vertexcolor2texture2tuple) |  |
| [`VertexColor2TextureTuple`](/cad/python-net/aspose.cad.fileformats.glb/vertexcolor2texturetuple) |  |
| [`VertexColorTexture2Tuple`](/cad/python-net/aspose.cad.fileformats.glb/vertexcolortexture2tuple) |  |
| [`VertexColorTextureTuple`](/cad/python-net/aspose.cad.fileformats.glb/vertexcolortexturetuple) |  |
| [`VertexGeometryTuple`](/cad/python-net/aspose.cad.fileformats.glb/vertexgeometrytuple) |  |
| [`VertexTextureTuple`](/cad/python-net/aspose.cad.fileformats.glb/vertextexturetuple) |  |
| [`WriteSettings`](/cad/python-net/aspose.cad.fileformats.glb/writesettings) | Write settings and base class of WriteContext |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`AgiArticulationTransformType`](/cad/python-net/aspose.cad.fileformats.glb/agiarticulationtransformtype) | The type of motion applied by this articulation stage. |
| [`AlphaMode`](/cad/python-net/aspose.cad.fileformats.glb/alphamode) | The alpha rendering mode of the material. |
| [`AnimationInterpolationMode`](/cad/python-net/aspose.cad.fileformats.glb/animationinterpolationmode) | Interpolation algorithm. |
| [`BufferMode`](/cad/python-net/aspose.cad.fileformats.glb/buffermode) | The hint representing the intended GPU buffer type to use with this buffer view. |
| [`CameraType`](/cad/python-net/aspose.cad.fileformats.glb/cameratype) | Specifies if the camera uses a perspective or orthographic projection. |
| [`DimensionType`](/cad/python-net/aspose.cad.fileformats.glb/dimensiontype) | Specifies if the accessor's elements are scalars, vectors, or matrices. |
| [`EncodingType`](/cad/python-net/aspose.cad.fileformats.glb/encodingtype) | The datatype of the accessor's components. |
| [`IndexEncodingType`](/cad/python-net/aspose.cad.fileformats.glb/indexencodingtype) | The indices data type. |
| [`PrimitiveType`](/cad/python-net/aspose.cad.fileformats.glb/primitivetype) | The topology type of primitives to render. |
| [`PropertyPath`](/cad/python-net/aspose.cad.fileformats.glb/propertypath) | The name of the node's TRS property to animate, or the [`PropertyPath.WEIGHTS`](/cad/python-net/aspose.cad.fileformats.glb/propertypath#WEIGHTS) of the Morph Targets it instantiates. For the [`PropertyPath.TRANSLATION`](/cad/python-net/aspose.cad.fileformats.glb/propertypath#TRANSLATION) property, the values that are provided by the sampler are the translation along the X, Y, and Z axes. For the [`PropertyPath.ROTATION`](/cad/python-net/aspose.cad.fileformats.glb/propertypath#ROTATION) property, the values are a quaternion in the order (x, y, z, w), where w is the scalar. For the [`PropertyPath.SCALE`](/cad/python-net/aspose.cad.fileformats.glb/propertypath#SCALE) property, the values are the scaling factors along the X, Y, and Z axes. |
| [`PunctualLightType`](/cad/python-net/aspose.cad.fileformats.glb/punctuallighttype) | Defines all the types of [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) types. |
| [`ResourceWriteMode`](/cad/python-net/aspose.cad.fileformats.glb/resourcewritemode) | Determines how resources are written. |
| [`TextureInterpolationFilter`](/cad/python-net/aspose.cad.fileformats.glb/textureinterpolationfilter) | Magnification filter. |
| [`TextureMipMapFilter`](/cad/python-net/aspose.cad.fileformats.glb/texturemipmapfilter) | Minification filter. |
| [`TextureWrapMode`](/cad/python-net/aspose.cad.fileformats.glb/texturewrapmode) | T (V) wrapping mode. |


