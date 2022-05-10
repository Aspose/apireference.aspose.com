---
title: Aspose.CAD.FileFormats.Collada.FileParser.Elements
second_title: Aspose.CAD for .NET API Reference
description: 
type: docs
weight: 460
url: /net/aspose.cad.fileformats.collada.fileparser.elements/
---


## Classes

| Class | Description |
| --- | --- |
| class [Accessor](./accessor) | The accessor. The accessor element declares an access pattern to one of the array elements: FLOAT_ARRAY, INT_ARRAY, NAME_ARRAY, BOOL_ARRAY, TOKEN_ARRAY, and IDREF_ARRAY. The accessor element describes access to arrays that are organized in either an interleaved or non-interleaved manner, depending on the offset and stride attributes. |
| class [Altitude](./altitude) | The altitude. Altitude is always given in meters. If the mode is "absolute", then the value is interpreted as meters from mean sea level. If the mode is "relativeToGround" then the value is interpreted as meters above the actual ground elevation at that particular location. |
| class [Asset](./asset) | The COLLADA asset. The asset element defines asset management information regarding its parent element. |
| class [AssetUnit](./assetunit) | The asset unit. The unit element contains descriptive information about unit of measure. It has attributes for the name of the unit and the measurement with respect to the meter. The unit element may appear zero or one time. |
| class [Bind](./bind) | The bind. The bind element binds values to effect parameters upon instantiation. |
| class [BindMaterial](./bindmaterial) | The bind material. Bind a specific material to a piece of geometry, binding varying and uniform parameters at the same time. |
| class [BindVertexInput](./bindvertexinput) | The bind vertex input. The bind_vertex_input element binds vertex inputs to effect parameters upon instantiation. |
| class [BoolArray](./boolarray) | The boolean array. The BOOL_ARRAY element declares the storage for a homogenous array of boolean values. |
| class [Brep](./brep) | The BREP. Describes a boundary representation (BREP) structure. |
| class [Camera](./camera) | The camera. Declares a view of the visual scene hierarchy or scene graph. |
| class [CameraOptics](./cameraoptics) | The camera optics. Represents the apparatus on a camera that projects the image onto the image sensor. |
| class [CameraOpticsTechniqueCommon](./cameraopticstechniquecommon) | The camera optics technique common. |
| class [CameraOpticsTechniqueCommonOrthographic](./cameraopticstechniquecommonorthographic) | The camera optics technique common orthographic. Describes the field of view of an orthographic camera. |
| class [CameraOpticsTechniqueCommonPerspective](./cameraopticstechniquecommonperspective) | The camera optics technique common perspective. Describes the field of view of a perspective camera. |
| class [Circle](./circle) | The circle. |
| class [Collada](./collada) | The COLLADA element declares the root of the document that comprises some of the content in the COLLADA schema. |
| class [ColladaElement](./colladaelement) | The base COLLADA element. |
| class [Cone](./cone) | The cone. Describes a conical surface. |
| class [Contributor](./contributor) | The contributor. The contributor element defines authoring information for asset management. |
| class [ControlVertices](./controlvertices) | The control vertices. It is used to describe the CVs of the spline. |
| class [ConvexMesh](./convexmesh) | The convex mesh. The definition of the convex_mesh element is identical to the mesh element with the exception that instead of a complete description(source, vertices, polygons etc.), it may simply point to another geometry to derive its shape. The latter case means that the convex hull of that geometry should be computed and is indicated by the optional "convex_hull_of" attribute. |
| class [Coverage](./coverage) | The coverage. Specifies the location of the asset using the WGS84 coordinate system. |
| class [Curve](./curve) | The curve. |
| class [Curves](./curves) | The curves. This element holds all the curves that are needed for the geometrical description of the topological entities edges. |
| class [Cylinder](./cylinder) | The cylinder. Describes an unlimited cylindrical surface. |
| class [Edges](./edges) | The edges. Edges are limited by two vertices and have a curve for a geometric representation. The segment of the curve is also limited by its start and end parameters. |
| class [Effect](./effect) | The effect. A self contained description of a SHADER effect. |
| class [Ellipse](./ellipse) | The ellipse. |
| class [EvaluateScene](./evaluatescene) | The evaluate scene. The evaluate_scene element declares information specifying how to evaluate this visual_scene. There may be any number of evaluate_scene elements. They are evaluated in order and particular one may be disabled via setting enabled=false. |
| class [Extra](./extra) | The COLLADA asset extra. The extra element declares additional information regarding its parent element. |
| class [Faces](./faces) | The faces. Faces are limited by one or more wires. |
| class [FloatArray](./floatarray) | The float array. The float_array element declares the storage for a homogenous array of floating point values. |
| class [FxCommonColorOrTexture](./fxcommoncolorortexture) | The FX common color or texture. A type that describes color attributes of fixed-function SHADER elements. |
| class [FxCommonColorOrTextureColor](./fxcommoncolorortexturecolor) | The FX common color or texture color. Contains four floating-point values describing the RGBA color. |
| class [FxCommonColorOrTextureParam](./fxcommoncolorortextureparam) | The FX common color or texture parameter. References a predefined parameter. |
| class [FxCommonColorOrTextureTexture](./fxcommoncolorortexturetexture) | The FX common color or texture texture. |
| class [FxCommonFloatOrParameter](./fxcommonfloatorparameter) | The FX common float or parameter. Describes the scalar attributes of fixed-function SHADER elements. |
| class [FxCommonFloatOrParameterFloat](./fxcommonfloatorparameterfloat) | The FX common float or parameter float. The value is represented by a literal floating-point scalar. |
| class [FxCommonFloatOrParameterParameter](./fxcommonfloatorparameterparameter) | The FX common float or parameter parameter. The value is represented by a reference to a previously defined parameter that can be directly cast to a floating point scalar. |
| class [FxCommonTransparent](./fxcommontransparent) | The FX common transparent. |
| class [GeographicLocation](./geographiclocation) | The geographic location. Specifies the location of the asset using the WGS84 coordinate system. |
| class [Geometry](./geometry) | The geometry. Geometry describes the visual shape and appearance of an object in the scene. The geometry element categorizes the declaration of geometric information.Geometry is a branch of mathematics that deals with the measurement, properties, and relationships of points, lines, angles, surfaces, and solids. |
| class [Hyperbola](./hyperbola) | The hyperbola. |
| class [IdRefArray](./idrefarray) | The id ref array. The IDREF_array element declares the storage for a homogenous array of ID reference values. |
| class [InputLocal](./inputlocal) | The input local. The input_local_type element is used to represent inputs that can only reference resources declared in the same document. |
| class [InputLocalOffset](./inputlocaloffset) | The input local offset. The input_local_offset_type element is used to represent indexed inputs that can only reference resources declared in the same document. |
| class [InstanceCamera](./instancecamera) | The instance camera. The Instance Camera element instantiates an object described by a camera element to activate it in the visual scene. |
| class [InstanceEffect](./instanceeffect) | The instance effect. |
| class [InstanceGeometry](./instancegeometry) | The instance geometry. The instance_geometry element declares the instantiation of a COLLADA geometry resource. |
| class [InstanceImage](./instanceimage) | The instance image. |
| class [InstanceJoint](./instancejoint) | The instance joint. |
| class [InstanceLight](./instancelight) | The instance light. The instance_light element declares the instantiation of a COLLADA light resource. |
| class [InstanceMaterialGeometry](./instancematerialgeometry) | The instance material. The instance_material element declares the instantiation of a COLLADA material resource. |
| class [InstanceMaterialRendering](./instancematerialrendering) | The instance material rendering. Instantiates a COLLADA material resource for a screen effect. |
| class [InstanceNode](./instancenode) | The instance node. The instance_node element declares the instantiation of a COLLADA node resource. |
| class [InstancePhysicsMaterial](./instancephysicsmaterial) | The instance physics material. |
| class [InstanceVisualScene](./instancevisualscene) | The instance Visual Scene. |
| class [InstanceWithExtra](./instancewithextra) | The instance with extra. The instance_with_extra_type element is used for all generic instance elements. A generic instance element is one which does not have any specific child elements declared. |
| class [IntArray](./intarray) | The integer array. The INT_ARRAY element declares the storage for a homogenous array of integer values. |
| class [LibraryCameras](./librarycameras) | The library cameras. Provides a library in which to place camera elements. |
| class [LibraryEffects](./libraryeffects) | The library effects. The library_effects element declares a module of effect elements. |
| class [LibraryGeometries](./librarygeometries) | The library geometries. The library_geometries element declares a module of geometry elements. |
| class [LibraryMaterials](./librarymaterials) | The library materials. The library_materials element declares a module of material elements. |
| class [LibraryVisualScenes](./libraryvisualscenes) | The library of visual scenes. The library_visual_scenes element declares a module of visual_scene elements. |
| class [Line](./line) | The line. |
| class [Lines](./lines) | The lines. The lines element provides the information needed to bind vertex attributes together and then organize those vertices into individual lines. Each line described by the mesh has two vertices. The first line is formed from first and second vertices. The second line is formed from the third and fourth vertices and so on. |
| class [Linestrips](./linestrips) | The LINESTRIPS. The linEStrips element provides the information needed to bind vertex attributes together and then organize those vertices into connected line-strips. Each line-strip described by the mesh has an arbitrary number of vertices. Each line segment within the line-strip is formed from the current vertex and the preceding vertex. |
| class [Lookat](./lookat) | The look at. The look at element contains a position and orientation transformation suitable for aiming a camera. The look at element contains three mathematical vectors within it that describe: 1. The position of the object; 2. The position of the interest point; 3. The direction that points up. |
| class [Material](./material) | The material. Materials describe the visual appearance of a geometric object. |
| class [Matrix](./matrix) | The matrix. Matrix transformations embody mathematical changes to points within a coordinate systems or the coordinate system itself. The matrix element contains a 4-by-4 matrix of floating-point values. |
| class [Mesh](./mesh) | The mesh. The mesh element contains vertex and primitive information sufficient to describe basic geometric meshes. |
| class [NameArray](./namearray) | The name array. The Name_array element declares the storage for a homogenous array of Name string values. |
| class [Node](./node) | The node. Nodes embody the hierarchical relationship of elements in the scene. |
| class [Nurbs](./nurbs) | The NURBS. Describes a NURBS curve in 3D space. |
| class [NurbsSurface](./nurbssurface) | The NURBS surface. Describes a NURBS surface in 3D space. |
| class [Orient](./orient) | The orient. Describes the orientation of an object frame. The orientation is given by an arbitrary axis and an angle. |
| class [Origin](./origin) | The origin. Describes the origin of an object frame. The origin is given by a position in 3D space. |
| class [Parabola](./parabola) | The parabola. |
| class [Parameter](./parameter) | The parameter. The parameter element declares parametric information regarding its parent element. |
| class [ParametricCurves](./parametriccurves) | The parametric curves. Specifies how an edge is represented in a face’s parametric space. |
| class [Plane](./plane) | The plane. Defines an infinite plane. |
| class [Polygons](./polygons) | The polygons. The polygons element provides the information needed to bind vertex attributes together and then organize those vertices into individual polygons. The polygons described can contain arbitrary numbers of vertices. These polygons may be self intersecting and may also contain holes. |
| class [Polylist](./polylist) | The POLYLIST. The POLYLIST element provides the information needed to bind vertex attributes together and then organize those vertices into individual polygons. The polygons described in POLYLIST can contain arbitrary numbers of vertices. Unlike the polygons element, the POLYLIST element cannot contain polygons with holes. |
| class [Primitives](./primitives) | The primitives. The primitives element represents primitive data for the primitive types. The primitives element contains indices that reference into the parent's source elements referenced by the input elements. |
| class [PrimitivesWithHoles](./primitiveswithholes) | The primitives with holes. Describes a primitives that contains one or more holes. |
| class [ProfileBridge](./profilebridge) | The profile bridge. Bridge COLLADA FX to an external FX framework such as NVIDIA's CgFX or Microsoft's Direct3D FX |
| class [ProfileCommon](./profilecommon) | The profile common. Opens a block of COMMON platform-specific data types and technique declarations. |
| class [ProfileCommonTechnique](./profilecommontechnique) | The profile common technique. Holds a description of the textures, samplers, SHADERS, parameters, and passes necessary for rendering this effect using one method. |
| class [Render](./render) | The evaluate scene render. Describes one effect pass to evaluate a scene. |
| class [Rotate](./rotate) | The rotate. The rotate element contains an angle and a mathematical vector that represents the axis of rotation. |
| class [Scale](./scale) | The scale. The scale element contains a mathematical vector that represents the relative proportions of the X, Y and Z axes of a coordinated system. |
| class [Scene](./scene) | The scene. The scene embodies the entire set of information that can be visualized from the contents of a COLLADA resource. The scene element declares the base of the scene hierarchy or scene graph. The scene contains elements that comprise much of the visual and transformational information content as created by the authoring tools. |
| class [Shells](./shells) | The shells. Describes the shells of a B-rep structure. A shell is the union of one or more faces. A closed shell can limit a solid. |
| class [SidRefArray](./sidrefarray) | The sid ref array. The SIDREF_array element declares the storage for a homogenous array of SID reference values. |
| class [Skew](./skew) | The skew. The skew element contains an angle and two mathematical vectors that represent the axis of rotation and the axis of translation. |
| class [Solids](./solids) | The solids. This element defines all the solids used in the BREP structure |
| class [Source](./source) | The source. The source element declares a data repository that provides values according to the semantics of an input element that refers to it. |
| class [Sphere](./sphere) | The sphere. Describes a sphere that is centered around its local origin. |
| class [Spline](./spline) | The spline. The spline element contains control vertex information sufficient to describe basic splines. |
| class [Surface](./surface) | The surface. A surface defines the attributes of a surface element. With rotate and translate the surface can be positioned to its right location. |
| class [SurfaceCurves](./surfacecurves) | The surface curves. The curves in the parametric space of the surface on which they lie. |
| class [Surfaces](./surfaces) | The surfaces. Contains all surfaces that are used in a B-rep structure. |
| class [SweptSurface](./sweptsurface) | The swept surface. Describes a surface by extruding or revolving a curve. |
| class [TargetableFloat](./targetablefloat) | The targetable float. The targetable_float_type element is used to represent elements which contain a single float value which can be targeted for animation. |
| class [TargetableFloat3](./targetablefloat3) | The target able float 3. |
| class [TargetableFloat4](./targetablefloat4) | The target able float 4. |
| class [Technique](./technique) | The technique. The technique element declares the information used to process some portion of the content. Each technique conforms to an associated profile.Techniques generally act as a "switch". If more than one is present for a particular portion of content, on import, one or the other is picked, but usually not both. Selection should be based on which profile the importing application can support. Techniques contain application data and programs, making them assets that can be managed as a unit. |
| class [TechniqueBlinn](./techniqueblinn) | The technique BLINN. Produces a shaded surface with a BLINN BRDF approximation. |
| class [TechniqueCommon](./techniquecommon) | The technique common. The technique common specifies the common method for accessing this source element's data. |
| class [TechniqueConstant](./techniqueconstant) | The technique constant. Produces a constantly shaded surface that is independent of lighting. |
| class [TechniqueHint](./techniquehint) | The technique hint. Add a hint for a platform of which technique to use in this effect. |
| class [TechniqueLambert](./techniquelambert) | The technique lambert. Produces a diffuse shaded surface that is independent of lighting. |
| class [TechniqueOverride](./techniqueoverride) | The technique override. Target specific techniques and passes inside a material rather than having to split the effects techniques and passes into multiple effects. |
| class [TechniquePhong](./techniquephong) | The technique PHONG. Produces a shaded surface where the specular reflection is shaded according the PHONG BRDF approximation. |
| class [TokenArray](./tokenarray) | The token array. The token_array_type element declares the storage for a homogenous array of token string values. |
| class [Torus](./torus) | The torus. Describes a torus in 3D space. |
| class [Translate](./translate) | The translate. The translate element contains a mathematical vector that represents the distance along the X, Y and Z-axes. |
| class [Triangles](./triangles) | The triangles. The triangles element provides the information needed to bind vertex attributes together and then organize those vertices into individual triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from the first, second, and third vertices. The second triangle is formed from the fourth, fifth, and sixth vertices, and so on. |
| class [Trifans](./trifans) | The TRIFANS. The TRIFANS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first, second, and third vertices. Each subsequent triangle is formed from the current vertex, reusing the first and the previous vertices. |
| class [Tristrips](./tristrips) | The TRISTRIPS. The TRISTRIPS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first, second, and third vertices.Each subsequent triangle is formed from the current vertex, reusing the previous two vertices. |
| class [Vertices](./vertices) | The vertices. The vertices element declares the attributes and identity of mesh-vertices. The vertices element describes mesh-vertices in a mesh geometry. The mesh-vertices represent the position(identity) of the vertices comprising the mesh and other vertex attributes that are invariant to tessellation. |
| class [VisualScene](./visualscene) | The visual scene. The visual_scene element declares the base of the visual_scene hierarchy or scene graph. The scene contains elements that comprise much of the visual and transformational information content as created by the authoring tools. |
| class [Wires](./wires) | The wires. Wires are a combination of one or more edges. A closed wire can limit a face. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [EnumAltitudeMode](./enumaltitudemode) | The altitude mode. The legal values for the mode attribute on the altitude element in a geographic_location element. |
| enum [EnumChoiceSweptType](./enumchoiceswepttype) | The enumeration for choice swept type. |
| enum [EnumFxOpaque](./enumfxopaque) | The enumerator FX opaque. |
| enum [EnumFxSamplerMagFilter](./enumfxsamplermagfilter) | The enumeration FX sampler mag filter. |
| enum [EnumFxSamplerMinFilter](./enumfxsamplerminfilter) | The enumeration FX sampler min filter. |
| enum [EnumFxSamplerMipFilter](./enumfxsamplermipfilter) | The enumeration FX sampler MIP filter. |
| enum [EnumFxSamplerWrap](./enumfxsamplerwrap) | The enumeration FX sampler wrap. |
| enum [EnumNode](./enumnode) | The node type enumeration. |
| enum [EnumOrthograthicItems](./enumorthograthicitems) | The enumeration ORTHOGRATHIC items. |
| enum [EnumPerspectiveItems](./enumperspectiveitems) | The enumeration Perspective items. |
| enum [EnumUpAxis](./enumupaxis) | The up axis enumeration. An enumerated type specifying the acceptable up-axis values. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
