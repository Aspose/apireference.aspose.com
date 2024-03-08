---
title: aspose.threed
second_title: Aspose.3D for Node.js via Java API Reference
description: 
keywords: "Aspose.3D for Node.js via Java, Aspose.3D, STL, OBJ, Aspose API Reference."
type: docs
weight: 10
url: /nodejs-java/aspose.threed/
---


## Classes

| Class | Description |
| --- | --- |
| [A3DObject](../aspose.threed/a3dobject) |   The base class of all Aspose.ThreeD objects, all sub classes will support dynamic properties. |
| [A3dwSaveOptions](../aspose.threed/a3dwsaveoptions) |   Save options for A3DW format. |
| [AmfSaveOptions](../aspose.threed/amfsaveoptions) |   Save options for AMF |
| [AnimationChannel](../aspose.threed/animationchannel) |   A channel maps property's component field to a set of keyframe sequences  @hideconstructor |
| [AnimationClip](../aspose.threed/animationclip) |   The Animation clip is a collection of animations.  The scene can have one or more animation clips. |
| [AnimationNode](../aspose.threed/animationnode) |   Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition.  AnimationNode defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other A3DObject object's numerical properties. |
| [ArbitraryProfile](../aspose.threed/arbitraryprofile) |   This class allows you to construct a 2D profile directly from arbitrary curve. |
| [AssetInfo](../aspose.threed/assetinfo) |   Information of asset.  Asset information can be attached to a Scene.  Child Scene can have its own AssetInfo to override parent's definition. |
| [BindPoint](../aspose.threed/bindpoint) |   A BindPoint is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field),  BindPoint will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels. |
| [Bone](../aspose.threed/bone) |   A bone defines the subset of the geometry's control point, and defined blend weight for each control point.  The Bone object cannot be used directly, a SkinDeformer instance is used to deform the geometry, and SkinDeformer comes with a set of bones, each bone linked to a node.  NOTE: A control point of a geometry can be bounded to more than one Bones. |
| [BonePose](../aspose.threed/bonepose) |   The BonePose contains the transformation matrix for a bone node |
| [BoundingBox](../aspose.threed/boundingbox) |   The axis-aligned bounding box |
| [BoundingBox2D](../aspose.threed/boundingbox2d) |   The axis-aligned bounding box for Vector2 |
| [Box](../aspose.threed/box) |   Box. |
| [Camera](../aspose.threed/camera) |   The camera describes the eye point of the viewer looking at the scene. |
| [Circle](../aspose.threed/circle) |   A Circle curve consists of a set of points in the edge of the circle shape. |
| [CircleShape](../aspose.threed/circleshape) |   IFC compatible circle profile, which can be used to construct a mesh through LinearExtrusion |
| [ColladaSaveOptions](../aspose.threed/colladasaveoptions) |   Save options for collada |
| [CompositeCurve](../aspose.threed/compositecurve) |   A CompositeCurve is consisting of several curve segments. |
| [CShape](../aspose.threed/cshape) |   IFC compatible C-shape profile that defined by parameters.  The center position of the profile is in the center of the bounding box. |
| [Curve](../aspose.threed/curve) |   The base class of all curve implementations.  @hideconstructor |
| [CustomObject](../aspose.threed/customobject) |   Meta data or custom objects used in 3D files are managed by this class.  All custom properties are saved as dynamic properties. |
| [Cylinder](../aspose.threed/cylinder) |   Parameterized Cylinder.  It can also be used to represent the cone when one of radiusTop/radiusBottom is zero. |
| [Deformer](../aspose.threed/deformer) |   Base class for SkinDeformer and MorphTargetDeformer |
| [DescriptorSetUpdater](../aspose.threed/descriptorsetupdater) |   This class allows to update the com.aspose.threed.IDescriptorSet in a chain operation.  @hideconstructor |
| [Discreet3dsLoadOptions](../aspose.threed/discreet3dsloadoptions) |   Load options for 3DS file. |
| [Discreet3dsSaveOptions](../aspose.threed/discreet3dssaveoptions) |   Save options for 3DS file. |
| [Dish](../aspose.threed/dish) |   Parameterized dish. |
| [DracoFormat](../aspose.threed/dracoformat) |   Google Draco format  @hideconstructor |
| [DracoSaveOptions](../aspose.threed/dracosaveoptions) |   Save options for Google draco files |
| [DriverException](../aspose.threed/driverexception) |   The exception raised by internal rendering drivers.  @hideconstructor |
| [DummyFileSystem](../aspose.threed/dummyfilesystem) |   Read/write operations are dummy operations. |
| [Ellipse](../aspose.threed/ellipse) |   An Ellipse defines a set of points that form the shape of ellipse. |
| [EllipseShape](../aspose.threed/ellipseshape) |   IFC compatible ellipse shape that defined by parameters.  The center position of the profile is in the center of the bounding box. |
| [EndPoint](../aspose.threed/endpoint) |   The end point to trim the curve, can be a parameter value or a Cartesian point. |
| [Entity](../aspose.threed/entity) |   The base class of all entities.  Entity represents a concrete object that attached under a node like Light/Geometry. |
| [EntityRenderer](../aspose.threed/entityrenderer) |   Subclass this to implement rendering for different kind of entities. |
| [EntityRendererKey](../aspose.threed/entityrendererkey) |   The key of registered entity renderer |
| [ExportException](../aspose.threed/exportexception) |   Exceptions when Aspose.3D failed to export the scene to file |
| [Extrapolation](../aspose.threed/extrapolation) |   Extrapolation defines how to do when sampled value is out of the range which defined by the first and last key-frames.  @hideconstructor |
| [FbxLoadOptions](../aspose.threed/fbxloadoptions) |   Load options for Fbx format. |
| [FbxSaveOptions](../aspose.threed/fbxsaveoptions) |   Save options for Fbx file. |
| [FileFormat](../aspose.threed/fileformat) |   File format definition  @hideconstructor |
| [FileFormatType](../aspose.threed/fileformattype) |   File format type  @hideconstructor |
| [FileSystem](../aspose.threed/filesystem) |   File system encapsulation.  Aspose.3D will use this to read/write dependencies.  @hideconstructor |
| [FMatrix4](../aspose.threed/fmatrix4) |   Matrix 4x4 with all component in float type |
| [FontFile](../aspose.threed/fontfile) |   Font file contains definitions for glyphs, this is used to create text profile.  @hideconstructor |
| [Frustum](../aspose.threed/frustum) |   The base class of Camera and Light  @hideconstructor |
| [FVector2](../aspose.threed/fvector2) |   A float vector with two components. |
| [FVector3](../aspose.threed/fvector3) |   A float vector with three components. |
| [FVector4](../aspose.threed/fvector4) |   A float vector with four components. |
| [Geometry](../aspose.threed/geometry) |   The base class of all renderable geometric objects (like Mesh, NurbsSurface, Patch and etc.).  The Geometry base class supports:  Control point management, control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models. Vertex element definition, vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see VertexElement for more details.Object deforming, Deformer can be bonded to animate geometry's shape. |
| [GlobalTransform](../aspose.threed/globaltransform) |   Global transform is similar to Transform but it's immutable while it represents the final evaluated transformation.  Right-hand coordinate system is used while evaluating global transform  @hideconstructor |
| [GLSLSource](../aspose.threed/glslsource) |   The source code of shaders in GLSL |
| [GltfLoadOptions](../aspose.threed/gltfloadoptions) |   Load options for glTF format |
| [GltfSaveOptions](../aspose.threed/gltfsaveoptions) |   Save options for glTF format. |
| [HollowCircleShape](../aspose.threed/hollowcircleshape) |   IFC compatible hollow circle profile. |
| [HollowRectangleShape](../aspose.threed/hollowrectangleshape) |   IFC compatible hollow rectangular shape with both inner/outer rounding corners. |
| [HShape](../aspose.threed/hshape) |   The HShape provides the defining parameters of an 'H' or 'I' shape. |
| [Html5SaveOptions](../aspose.threed/html5saveoptions) |   Save options for HTML5 |
| [ImageRenderOptions](../aspose.threed/imagerenderoptions) |   Options for Scene.render(com.aspose.threed.Camera, java.lang.String, com.aspose.threed.Vector2, java.lang.String, com.aspose.threed.ImageRenderOptions) and  Scene.render(com.aspose.threed.Camera, com.aspose.threed.TextureData, com.aspose.threed.ImageRenderOptions) |
| [ImportException](../aspose.threed/importexception) |   Exception when Aspose.3D failed to open the specified source |
| [InitializationException](../aspose.threed/initializationexception) |   Exceptions in render pipeline initialization |
| [IOConfig](../aspose.threed/ioconfig) |   IO config for serialization/deserialization.  User can specify detailed configurations like dependency look-up path  Or format-related configs here  @hideconstructor |
| [IOUtils](../aspose.threed/ioutils) |   Utilities to write matrix/vector to binary writer  @hideconstructor |
| [KeyFrame](../aspose.threed/keyframe) |   A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value.  Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames  Value before/after the first/last key-frame are calculated by the Extrapolation class. |
| [KeyframeSequence](../aspose.threed/keyframesequence) |   The sequence of key-frames, it describes the transformation of a sampled value over time. |
| [LambertMaterial](../aspose.threed/lambertmaterial) |   Material for lambert shading model |
| [License](../aspose.threed/license) |   Provides methods to license the component. |
| [Light](../aspose.threed/light) |   The light illuminates the scene.  The formula to calculate the total attenuation of light is:  A = ConstantAttenuation + (Dist  LinearAttenuation) + ((Dist^2)  QuadraticAttenuation) |
| [Line](../aspose.threed/line) |   A polyline is a path defined by a set of points with Geometry.ControlPoints, and connected by Segments,  which means it can also be a set of connected line segments.  The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses NurbsCurve. |
| [LinearExtrusion](../aspose.threed/linearextrusion) |   Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension. |
| [LoadOptions](../aspose.threed/loadoptions) |   The base class to configure options in file loading for different types  @hideconstructor |
| [LocalFileSystem](../aspose.threed/localfilesystem) |   The LocalFileSystem will maps the read/write operations to local directory. |
| [LShape](../aspose.threed/lshape) |   IFC compatible L-shape profile that defined by parameters. |
| [Material](../aspose.threed/material) |   Material defines the parameters necessary for visual appearance of geometry.  Aspose.3D provides shading model for LambertMaterial, PhongMaterial and ShaderMaterial  @hideconstructor |
| [MathUtils](../aspose.threed/mathutils) |   A set of useful mathematical utilities.  @hideconstructor |
| [Matrix4](../aspose.threed/matrix4) |   4x4 matrix implementation. |
| [MemoryFileSystem](../aspose.threed/memoryfilesystem) |   The MemoryFileSystem will maps the read/write operations to memory. |
| [Mesh](../aspose.threed/mesh) |   A mesh is made of many n-sided polygons. |
| [Metered](../aspose.threed/metered) |   Provides methods to set metered key. |
| [MirroredProfile](../aspose.threed/mirroredprofile) |   IFC compatible mirror profile.  This profile defines a new profile by mirroring the base profile about the y axis. |
| [MorphTargetChannel](../aspose.threed/morphtargetchannel) |   A MorphTargetChannel is used by MorphTargetDeformer to organize the target geometries.  Some file formats like FBX support multiple channels in parallel.  Weight is between 0 and 1.0, and default weight for target is 0.0; |
| [MorphTargetDeformer](../aspose.threed/morphtargetdeformer) |   MorphTargetDeformer provides per-vertex animation.  MorphTargetDeformer organize all targets via MorphTargetChannel, each channel can organize multiple targets.  A common use of morph target deformer is to apply facial expression to a character.  More details can be found at https://en.wikipedia.org/wiki/Morph_target_animation |
| [Node](../aspose.threed/node) |   Represents an element in the scene graph.  A scene graph is a tree of Node objects. The tree management services are self contained in this class.  Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy.  Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening.  When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity").  The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity. |
| [NurbsCurve](../aspose.threed/nurbscurve) |   NURBS curve is a curve represented by NURBS(Non-uniform rational basis spline),  A NURBS curve is defined by its Order, a set of weighted Geometry.ControlPoints and a KnotVectors  The w component in control point is used as control point's weight, whatever it is a CurveDimension.TWO_DIMENSIONAL or CurveDimension.THREE_DIMENSIONAL |
| [NurbsDirection](../aspose.threed/nurbsdirection) |   A 3D NurbsSurface has two direction, the NurbsSurface.U and NurbsSurface.V, the NurbsDirection defines data for each direction.  A direction is actually a NURBS curve, that means it's also defined by its Order, a KnotVectors, and a set of weighted control points(defined in NurbsSurface). |
| [NurbsSurface](../aspose.threed/nurbssurface) |   NurbsSurface is a surface represented by NURBS(Non-uniform rational basis spline),  A NurbsSurface is defined by two NurbsDirectionU and V.  The w component in control point is used as control point's weight whatever the direction's type is a CurveDimension.TWO_DIMENSIONAL or CurveDimension.THREE_DIMENSIONAL |
| [ObjLoadOptions](../aspose.threed/objloadoptions) |   Load options for wavefront obj |
| [ObjSaveOptions](../aspose.threed/objsaveoptions) |   Save options for wavefront obj file |
| [ParameterizedProfile](../aspose.threed/parameterizedprofile) |   The base class of all parameterized profiles.  @hideconstructor |
| [ParseException](../aspose.threed/parseexception) |   Exception when Aspose.3D failed to parse the input. |
| [Patch](../aspose.threed/patch) |   A Patch is a parametric modeling surface, similar to NurbsSurface, it's also defined by two  PatchDirection, the U and V.  But difference between Patch and NurbsSurface is that the PatchDirection curve  can be one of PatchDirectionType.BEZIER, PatchDirectionType.QUADRATIC_BEZIER, PatchDirectionType.BASIS_SPLINE, PatchDirectionType.CARDINAL_SPLINE and PatchDirectionType.LINEAR |
| [PatchDirection](../aspose.threed/patchdirection) |   Patch's U and V direction. |
| [PbrMaterial](../aspose.threed/pbrmaterial) |   Material for physically based rendering based on albedo color/metallic/roughness |
| [PbrSpecularMaterial](../aspose.threed/pbrspecularmaterial) |   Material for physically based rendering based on diffuse color/specular/glossiness |
| [PdfFormat](../aspose.threed/pdfformat) |   Adobe's Portable Document Format  @hideconstructor |
| [PdfLoadOptions](../aspose.threed/pdfloadoptions) |   Options for PDF loading |
| [PdfSaveOptions](../aspose.threed/pdfsaveoptions) |   The save options in PDF exporting. |
| [PhongMaterial](../aspose.threed/phongmaterial) |   Material for blinn-phong shading model. |
| [PixelMapping](../aspose.threed/pixelmapping) |   @hideconstructor |
| [Plane](../aspose.threed/plane) |   Parameterized plane. |
| [PlyFormat](../aspose.threed/plyformat) |   The PLY format.  @hideconstructor |
| [PlyLoadOptions](../aspose.threed/plyloadoptions) |   Load options for PLY files |
| [PlySaveOptions](../aspose.threed/plysaveoptions) |   Save options for exporting scene as PLY file. |
| [PointCloud](../aspose.threed/pointcloud) |   The point cloud contains no topology information but only the control points and the vertex elements. |
| [PolygonBuilder](../aspose.threed/polygonbuilder) |   A helper class to build polygon for Mesh |
| [PolygonModifier](../aspose.threed/polygonmodifier) |   Utilities to modify polygons  @hideconstructor |
| [Pose](../aspose.threed/pose) |   The pose is used to store transformation matrix when the geometry is skinned.  The pose is a set of BonePose, each BonePose saves the concrete transformation information of the bone node. |
| [PostProcessing](../aspose.threed/postprocessing) |   The post-processing effects  @hideconstructor |
| [Primitive](../aspose.threed/primitive) |   Base class for all primitives |
| [Profile](../aspose.threed/profile) |   2D Profile in xy plane  @hideconstructor |
| [Property](../aspose.threed/property) |   Class to hold user-defined properties.  @hideconstructor |
| [PropertyCollection](../aspose.threed/propertycollection) |   The collection of properties  @hideconstructor |
| [PushConstant](../aspose.threed/pushconstant) |   A utility to provide data to shader through push constant. |
| [Pyramid](../aspose.threed/pyramid) |   Parameterized pyramid. |
| [Quaternion](../aspose.threed/quaternion) |   Quaternion is usually used to perform rotation in computer graphics. |
| [Rect](../aspose.threed/rect) |   A class to represent the rectangle |
| [RectangleShape](../aspose.threed/rectangleshape) |   IFC compatible rectangular shape with rounding corners. |
| [RectangularTorus](../aspose.threed/rectangulartorus) |   Parameterized rectangular torus. |
| [RelativeRectangle](../aspose.threed/relativerectangle) |   Relative rectangle  The formula between relative component to absolute value is:  Scale  (Reference Width) + offset  So if we want it to represent an absolute value, leave all scale fields zero, and use offset fields instead. |
| [Renderer](../aspose.threed/renderer) |   The context about renderer.  @hideconstructor |
| [RendererVariableManager](../aspose.threed/renderervariablemanager) |   This class manages variables used in rendering  @hideconstructor |
| [RenderFactory](../aspose.threed/renderfactory) |   RenderFactory creates all resources that represented in rendering pipeline.  @hideconstructor |
| [RenderParameters](../aspose.threed/renderparameters) |   Describe the parameters of the render target |
| [RenderResource](../aspose.threed/renderresource) |   The abstract class of all render resources  All render resources will be disposed when the renderer is released.  Classes like Mesh/Texture will have a corresponding RenderResource  @hideconstructor |
| [RenderState](../aspose.threed/renderstate) |   Render state for building the pipeline  The changes made on render state will not affect the created pipeline instances. |
| [RevolvedAreaSolid](../aspose.threed/revolvedareasolid) |   This class represents a solid model by revolving a cross section provided by a profile about an axis. |
| [RvmFormat](../aspose.threed/rvmformat) |   The RVM Format  @hideconstructor |
| [RvmLoadOptions](../aspose.threed/rvmloadoptions) |   Load options for AVEVA Plant Design Management System's RVM file. |
| [RvmSaveOptions](../aspose.threed/rvmsaveoptions) |   Save options for Aveva PDMS RVM file. |
| [SaveOptions](../aspose.threed/saveoptions) |   The base class to configure options in file saving for different types  @hideconstructor |
| [Scene](../aspose.threed/scene) |   A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc.  Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx  Node hierarchy can be accessed through RootNodeLibrary is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library. |
| [SceneObject](../aspose.threed/sceneobject) |   The root class of objects that will be stored inside a scene. |
| [ShaderException](../aspose.threed/shaderexception) |   Shader related exceptions |
| [ShaderMaterial](../aspose.threed/shadermaterial) |   A shader material allows to describe the material by external rendering engine or shader language.  ShaderMaterial uses ShaderTechnique to describe the concrete rendering details,  and the most suitable one will be used according to the final rendering platform.  For example, your ShaderMaterial instance can have two technique, one is defined by HLSL, and another is defined by GLSL  Under non-window platform the GLSL should be used instead of HLSL |
| [ShaderProgram](../aspose.threed/shaderprogram) |   The shader program  @hideconstructor |
| [ShaderSet](../aspose.threed/shaderset) |   Shader programs for each kind of materials |
| [ShaderSource](../aspose.threed/shadersource) |   The source code of shader  @hideconstructor |
| [ShaderTechnique](../aspose.threed/shadertechnique) |   A shader technique represents a concrete rendering implementation. |
| [ShaderVariable](../aspose.threed/shadervariable) |   Shader variable |
| [Shape](../aspose.threed/shape) |   The shape describes the deformation on a set of control points, which is similar to the cluster deformer in Maya.  For example, we can add a shape to a created geometry.  And the shape and the geometry have the same topological information but different position of the control points.  With varying amounts of influence, the geometry performs a deformation effect. |
| [Skeleton](../aspose.threed/skeleton) |   The Skeleton is mainly used by CAD software to help designer to manipulate the transformation of skeletal structure, it's usually useless outside the CAD softwares.  To make the skeleton hierarchy acts like one object in CAD software, it's necessary to mark the top Skeleton node as the root one by setting Type to SkeletonType.SKELETON,  and all children set to SkeletonType.BONE |
| [SkinDeformer](../aspose.threed/skindeformer) |   A skin deformer contains multiple bones to work, each bone blends a part of the geometry by control point's weights. |
| [Sphere](../aspose.threed/sphere) |   Parameterized sphere. |
| [SPIRVSource](../aspose.threed/spirvsource) |   The compiled shader in SPIR-V format. |
| [StencilState](../aspose.threed/stencilstate) |   Stencil states per face.  @hideconstructor |
| [StlLoadOptions](../aspose.threed/stlloadoptions) |   Load options for STL |
| [StlSaveOptions](../aspose.threed/stlsaveoptions) |   Save options for STL |
| [SweptAreaSolid](../aspose.threed/sweptareasolid) |   A SweptAreaSolid constructs a geometry by sweeping a profile along a directrix. |
| [Text](../aspose.threed/text) |   Text profile, this profile describes contours using font and text. |
| [Texture](../aspose.threed/texture) |   This class defines the texture from an external file. |
| [TextureBase](../aspose.threed/texturebase) |   Base class for all concrete textures.  Texture defines the look and feel of a geometry surface. |
| [TextureCodec](../aspose.threed/texturecodec) |   Class to manage encoders and decoders for textures. |
| [TextureData](../aspose.threed/texturedata) |   This class contains the raw data and format definition of a texture. |
| [TextureSlot](../aspose.threed/textureslot) |   Texture slot in Material, can be enumerated through material instance.  @hideconstructor |
| [Torus](../aspose.threed/torus) |   Parameterized torus. |
| [Transform](../aspose.threed/transform) |   A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost  This is used by local transform.  @hideconstructor |
| [TransformBuilder](../aspose.threed/transformbuilder) |   The TransformBuilder is used to build transform matrix by a chain of transformations. |
| [TransformedCurve](../aspose.threed/transformedcurve) |   A TransformedCurve gives a curve a placement by using a transformation matrix.  This allows to perform a transformation inside a TrimmedCurve or CompositeCurve. |
| [TrapeziumShape](../aspose.threed/trapeziumshape) |   IFC compatible Trapezium shape defined by parameters. |
| [TrialException](../aspose.threed/trialexception) |   This is raised in Scene.Open/Scene.Save when no licenses are applied.  You can turn off this exception by setting SuppressTrialException to true. |
| [TriMesh](../aspose.threed/trimesh) |   A TriMesh contains raw data that can be used by GPU directly.  This class is a utility to help to construct a mesh that only contains per-vertex data. |
| [TrimmedCurve](../aspose.threed/trimmedcurve) |   A bounded curve that trimmed the basis curve at both ends. |
| [TShape](../aspose.threed/tshape) |   IFC compatible T-shape defined by parameters. |
| [U3dLoadOptions](../aspose.threed/u3dloadoptions) |   Load options for universal 3d |
| [U3dSaveOptions](../aspose.threed/u3dsaveoptions) |   Save options for universal 3d |
| [UsdSaveOptions](../aspose.threed/usdsaveoptions) |   Save options for USD/USDZ formats. |
| [UShape](../aspose.threed/ushape) |   IFC compatible U-shape defined by parameters. |
| [Vector2](../aspose.threed/vector2) |   A vector with two components. |
| [Vector3](../aspose.threed/vector3) |   A vector with three components. |
| [Vector4](../aspose.threed/vector4) |   A vector with four components. |
| [Vertex](../aspose.threed/vertex) |   Vertex reference, used to access the raw vertex in TriMesh.  @hideconstructor |
| [VertexDeclaration](../aspose.threed/vertexdeclaration) |   The declaration of a custom defined vertex's structure |
| [VertexElement](../aspose.threed/vertexelement) |   Base class of vertex elements.  A vertex element type is identified by VertexElementType.  A VertexElement describes how the vertex element is mapped to a geometry surface and how the mapping information is arranged in memory.  A VertexElement contains Normals, UVs or other kind of information.  @hideconstructor |
| [VertexElementBinormal](../aspose.threed/vertexelementbinormal) |   Defines the binormal vectors for specified components. |
| [VertexElementDoublesTemplate](../aspose.threed/vertexelementdoublestemplate) |   A helper class for defining concrete VertexElement implementations.  @hideconstructor |
| [VertexElementEdgeCrease](../aspose.threed/vertexelementedgecrease) |   Defines the edge crease for specified components |
| [VertexElementHole](../aspose.threed/vertexelementhole) |   Defines if specified polygon is hole |
| [VertexElementIntsTemplate](../aspose.threed/vertexelementintstemplate) |   A helper class for defining concrete VertexElement implementations.  @hideconstructor |
| [VertexElementMaterial](../aspose.threed/vertexelementmaterial) |   Defines material index for specified components.  A node can have multiple materials, the VertexElementMaterial is used to render different part of the geometry in different materials. |
| [VertexElementNormal](../aspose.threed/vertexelementnormal) |   Defines normal vectors for specified components. |
| [VertexElementPolygonGroup](../aspose.threed/vertexelementpolygongroup) |   Defines polygon group for specified components to group related polygons together. |
| [VertexElementSmoothingGroup](../aspose.threed/vertexelementsmoothinggroup) |   A smoothing group is a group of polygons in a polygon mesh which should appear to form a smooth surface.  Some early 3d modeling software like 3D studio max for DOS used smoothing group to void storing normal vector for each mesh vertex. |
| [VertexElementSpecular](../aspose.threed/vertexelementspecular) |   Defines specular color for specified components. |
| [VertexElementTangent](../aspose.threed/vertexelementtangent) |   Defines tangent vectors for specified components. |
| [VertexElementUserData](../aspose.threed/vertexelementuserdata) |   Defines custom user data for specified components.  Usually it's application-specific data for special purpose. |
| [VertexElementUV](../aspose.threed/vertexelementuv) |   Defines the UV coordinates for specified components.  A geometry can have multiple VertexElementUV elements, and each one have different TextureMappings. |
| [VertexElementVector4](../aspose.threed/vertexelementvector4) |   A helper class for defining concrete VertexElement implementations.  @hideconstructor |
| [VertexElementVertexColor](../aspose.threed/vertexelementvertexcolor) |   Defines the vertex color for specified components |
| [VertexElementVertexCrease](../aspose.threed/vertexelementvertexcrease) |   Defines the vertex crease for specified components |
| [VertexElementVisibility](../aspose.threed/vertexelementvisibility) |   Defines if specified components is visible |
| [VertexElementWeight](../aspose.threed/vertexelementweight) |   Defines blend weight for specified components. |
| [VertexField](../aspose.threed/vertexfield) |   Vertex's field memory layout description.  @hideconstructor |
| [Viewport](../aspose.threed/viewport) |   A com.aspose.threed.IRenderTarget contains at least one viewport for rendering the scene.  @hideconstructor |
| [Watermark](../aspose.threed/watermark) |   Utility to encode/decode blind watermark  to/from a mesh.  @hideconstructor |
| [WindowHandle](../aspose.threed/windowhandle) |   Encapsulated window handle for different platforms.  @hideconstructor |
| [XLoadOptions](../aspose.threed/xloadoptions) |   The Load options for DirectX X files. |
| [ZipArchiveFileSystem](../aspose.threed/ziparchivefilesystem) |   File system to provide to the read-only access to speicified zip file or zip stream.  File system will be disposed after the open/save operation. |
| [ZShape](../aspose.threed/zshape) |   IFC compatible Z-shape profile defined by parameters. |
| [CubeFace](../aspose.threed/cubeface) |   Utility class containing constants.  Each face of the cube map texture  @hideconstructor |
| [IndexDataType](../aspose.threed/indexdatatype) |   Utility class containing constants.  The data type of the elements in com.aspose.threed.IIndexBuffer  @hideconstructor |
