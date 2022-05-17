---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 40
url: /net/aspose.threed.entities/
---


## Classes

| Class | Description |
| --- | --- |
| [Box](./box) | Box. |
| [Camera](./camera) | The camera describes the eye point of the viewer looking at the scene. |
| [Circle](./circle) | A [`Circle`](aspose.threed.entities/circle) curve consists of a set of points in the edge of the circle shape. |
| [CompositeCurve](./compositecurve) | A [`CompositeCurve`](aspose.threed.entities/compositecurve) is consisting of several curve segments. |
| [Curve](./curve) | The base class of all curve implementations. |
| [Cylinder](./cylinder) | Parameterized Cylinder. It can also be used to represent the cone when one of radiusTop/radiusBottom is zero. |
| [Dish](./dish) | Parameterized dish. |
| [Ellipse](./ellipse) | An [`Ellipse`](aspose.threed.entities/ellipse) defines a set of points that form the shape of ellipse. |
| [Frustum](./frustum) | The base class of [`Camera`](aspose.threed.entities/camera) and [`Light`](aspose.threed.entities/light) |
| [Geometry](./geometry) | The base class of all renderable geometric objects (like [`Mesh`](aspose.threed.entities/mesh), [`NurbsSurface`](aspose.threed.entities/nurbssurface), [`Patch`](aspose.threed.entities/patch) and etc.). |
| [Light](./light) | The light illuminates the scene. |
| [Line](./line) | A polyline is a path defined by a set of points with [`ControlPoints`](aspose.threed.entities/geometry/controlpoints), and connected by [`Segments`](aspose.threed.entities/line/segments), which means it can also be a set of connected line segments. The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses [`NurbsCurve`](aspose.threed.entities/nurbscurve). |
| [LinearExtrusion](./linearextrusion) | Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension. |
| [Mesh](./mesh) | A mesh is made of many n-sided polygons. |
| [NurbsCurve](./nurbscurve) | [NURBS curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) is a curve represented by NURBS(Non-uniform rational basis spline), A NURBS curve is defined by its [`Order`](aspose.threed.entities/nurbscurve/order), a set of weighted [`ControlPoints`](aspose.threed.entities/geometry/controlpoints) and a [`KnotVectors`](aspose.threed.entities/nurbscurve/knotvectors) The w component in control point is used as control point's weight, whatever it is a TwoDimensional or ThreeDimensional |
| [NurbsDirection](./nurbsdirection) | A 3D [`NurbsSurface`](aspose.threed.entities/nurbssurface) has two direction, the [`U`](aspose.threed.entities/nurbssurface/u) and [`V`](aspose.threed.entities/nurbssurface/v), the [`NurbsDirection`](aspose.threed.entities/nurbsdirection) defines data for each direction. A direction is actually a NURBS curve, that means it's also defined by its [`Order`](aspose.threed.entities/nurbsdirection/order), a [`KnotVectors`](aspose.threed.entities/nurbsdirection/knotvectors), and a set of weighted control points(defined in [`NurbsSurface`](aspose.threed.entities/nurbssurface)). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](aspose.threed.entities/nurbssurface) is a surface represented by [NURBS(Non-uniform rational basis spline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A [`NurbsSurface`](aspose.threed.entities/nurbssurface) is defined by two [`NurbsDirection`](aspose.threed.entities/nurbsdirection)[`U`](aspose.threed.entities/nurbssurface/u) and [`V`](aspose.threed.entities/nurbssurface/v). The w component in control point is used as control point's weight whatever the direction's type is a TwoDimensional or ThreeDimensional |
| [Patch](./patch) | A [`Patch`](aspose.threed.entities/patch) is a parametric modeling surface, similar to [`NurbsSurface`](aspose.threed.entities/nurbssurface), it's also defined by two [`PatchDirection`](aspose.threed.entities/patchdirection), the [`U`](aspose.threed.entities/patch/u) and [`V`](aspose.threed.entities/patch/v). But difference between [`Patch`](aspose.threed.entities/patch) and [`NurbsSurface`](aspose.threed.entities/nurbssurface) is that the [`PatchDirection`](aspose.threed.entities/patchdirection) curve can be one of Bezier, QuadraticBezier, BasisSpline, CardinalSpline and Linear |
| [PatchDirection](./patchdirection) | Patch's U and V direction. |
| [Plane](./plane) | Parameterized plane. |
| [PointCloud](./pointcloud) | The point cloud contains no topology information but only the control points and the vertex elements. |
| [PolygonBuilder](./polygonbuilder) | A helper class to build polygon for [`Mesh`](aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Utilities to modify polygons |
| [Primitive](./primitive) | Base class for all primitives |
| [Pyramid](./pyramid) | Parameterized pyramid. |
| [RectangularTorus](./rectangulartorus) | Parameterized rectangular torus. |
| [RevolvedAreaSolid](./revolvedareasolid) | This class represents a solid model by revolving a cross section provided by a profile about an axis. |
| [Shape](./shape) | The shape describes the deformation on a set of control points, which is similar to the cluster deformer in Maya. For example, we can add a shape to a created geometry. And the shape and the geometry have the same topological information but different position of the control points. With varying amounts of influence, the geometry performs a deformation effect. |
| [Skeleton](./skeleton) | The [`Skeleton`](aspose.threed.entities/skeleton) is mainly used by CAD software to help designer to manipulate the transformation of skeletal structure, it's usually useless outside the CAD softwares. To make the skeleton hierarchy acts like one object in CAD software, it's necessary to mark the top [`Skeleton`](aspose.threed.entities/skeleton) node as the root one by setting [`Type`](aspose.threed.entities/skeleton/type) to Skeleton, and all children set to Bone |
| [Sphere](./sphere) | Parameterized sphere. |
| [SweptAreaSolid](./sweptareasolid) | A [`SweptAreaSolid`](aspose.threed.entities/sweptareasolid) constructs a geometry by sweeping a profile along a directrix. |
| [Torus](./torus) | Parameterized torus. |
| [TransformedCurve](./transformedcurve) | A [`TransformedCurve`](aspose.threed.entities/transformedcurve) gives a curve a placement by using a transformation matrix. This allows to perform a transformation inside a [`TrimmedCurve`](aspose.threed.entities/trimmedcurve) or [`CompositeCurve`](aspose.threed.entities/compositecurve). |
| [TriMesh](./trimesh) | A TriMesh contains raw data that can be used by GPU directly. This class is a utility to help to construct a mesh that only contains per-vertex data. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Generic version of [`TriMesh`](aspose.threed.entities/trimesh) for user's static-defined vertex type |
| [TrimmedCurve](./trimmedcurve) | A bounded curve that trimmed the basis curve at both ends. |
| [VertexElement](./vertexelement) | Base class of vertex elements. A vertex element type is identified by VertexElementType. A VertexElement describes how the vertex element is mapped to a geometry surface and how the mapping information is arranged in memory. A VertexElement contains Normals, UVs or other kind of information. |
| [VertexElementBinormal](./vertexelementbinormal) | Defines the binormal vectors for specified components. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | A helper class for defining concrete [`VertexElement`](aspose.threed.entities/vertexelement) implementations. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Defines the edge crease for specified components |
| [VertexElementHole](./vertexelementhole) | Defines if specified polygon is hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | A helper class for defining concrete [`VertexElement`](aspose.threed.entities/vertexelement) implementations. |
| [VertexElementMaterial](./vertexelementmaterial) | Defines material index for specified components. A node can have multiple materials, the [`VertexElementMaterial`](aspose.threed.entities/vertexelementmaterial) is used to render different part of the geometry in different materials. |
| [VertexElementNormal](./vertexelementnormal) | Defines normal vectors for specified components. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Defines polygon group for specified components to group related polygons together. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | A smoothing group is a group of polygons in a polygon mesh which should appear to form a smooth surface. Some early 3d modeling software like 3D studio max for DOS used smoothing group to void storing normal vector for each mesh vertex. |
| [VertexElementSpecular](./vertexelementspecular) | Defines specular color for specified components. |
| [VertexElementTangent](./vertexelementtangent) | Defines tangent vectors for specified components. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | A helper class for defining concrete [`VertexElement`](aspose.threed.entities/vertexelement) implementations. |
| [VertexElementUserData](./vertexelementuserdata) | Defines custom user data for specified components. Usually it's application-specific data for special purpose. |
| [VertexElementUV](./vertexelementuv) | Defines the UV coordinates for specified components. A geometry can have multiple [`VertexElementUV`](aspose.threed.entities/vertexelementuv) elements, and each one have different [`TextureMapping`](aspose.threed.entities/texturemapping)s. |
| [VertexElementVector4](./vertexelementvector4) | A helper class for defining concrete [`VertexElement`](aspose.threed.entities/vertexelement) implementations. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Defines the vertex color for specified components |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Defines the vertex crease for specified components |
| [VertexElementVisibility](./vertexelementvisibility) | Defines if specified components is visible |
| [VertexElementWeight](./vertexelementweight) | Defines blend weight for specified components. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement with indices data. |
| [IMeshConvertible](./imeshconvertible) | Entities that implemented this interface can be converted to [`Mesh`](aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Orientable entities shall implement this interface. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [ApertureMode](./aperturemode) | Camera aperture modes. The aperture mode determines which values drive the camera aperture. If the aperture mode is HorizAndVert, Horizontal, or Vertical, then the field of view is used. If the aperture mode is FocalLength, then the focal length is used. |
| [CurveDimension](./curvedimension) | The dimension of the curves. |
| [LightType](./lighttype) | Light types. |
| [MappingMode](./mappingmode) | Determines how the element is mapped to a surface. The [`MappingMode`](aspose.threed.entities/mappingmode) defined how [`VertexElement`](aspose.threed.entities/vertexelement) is mapped to the surface of geometry. |
| [NurbsType](./nurbstype) | NURBS types. |
| [PatchDirectionType](./patchdirectiontype) | Patch direction's types. |
| [ProjectionType](./projectiontype) | Camera's projection types. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](aspose.threed.entities/referencemode) defines how mapping information is stored and referenced by. |
| [RotationMode](./rotationmode) | The frustum's rotation mode |
| [SkeletonType](./skeletontype) | [`Skeleton`](aspose.threed.entities/skeleton)'s types. |
| [SplitMeshPolicy](./splitmeshpolicy) | Share vertex/control point data between sub-meshes or each sub-mesh has its own compacted data. |
| [TextureMapping](./texturemapping) | The texture mapping type for [`VertexElementUV`](aspose.threed.entities/vertexelementuv) Describes which kind of texture mapping is used. |
| [VertexElementType](./vertexelementtype) | The type of the vertex element, defined how it will be used in modeling. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3d.dll -->
