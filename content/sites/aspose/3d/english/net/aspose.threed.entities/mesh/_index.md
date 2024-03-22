---
title: Class Mesh
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Mesh class. A mesh is made of many nsided polygons
type: docs
weight: 2100
url: /net/aspose.threed.entities/mesh/
---
## Mesh class

A mesh is made of many n-sided polygons.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Constructors

| Name | Description |
| --- | --- |
| [Mesh](mesh/#constructor)() | Initializes a new instance of the `Mesh` class. |
| [Mesh](mesh/#constructor_4)(string) | Initializes a new instance of the `Mesh` class. |
| [Mesh](mesh/#constructor_1)(TextureData) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |
| [Mesh](mesh/#constructor_2)(TextureData, Matrix4) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |
| [Mesh](mesh/#constructor_3)(TextureData, bool, Matrix4) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow(Inherited from [`Geometry`](../geometry/).) |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Gets all control points(Inherited from [`Geometry`](../geometry/).) |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Gets all deformers associated with this geometry.(Inherited from [`Geometry`](../geometry/).) |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | Gets edges of the Mesh. Edge is optional in mesh, so it can be empty. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | Gets the count of polygons |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | Gets the polygons definition of the mesh |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow.(Inherited from [`Geometry`](../geometry/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Gets all vertex elements(Inherited from [`Geometry`](../geometry/).) |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Gets or sets if the geometry is visible(Inherited from [`Geometry`](../geometry/).) |

## Methods

| Name | Description |
| --- | --- |
| static [DoBoolean](../../aspose.threed.entities/mesh/doboolean/)(BooleanOperation, Mesh, Matrix4?, Mesh, Matrix4?) |  |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Adds an existing vertex element to current geometry(Inherited from [`Geometry`](../geometry/).) |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type.(Inherited from [`Geometry`](../geometry/).) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../polygonbuilder/). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | Create a polygon with 3 vertices(triangle) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../polygonbuilder/). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | Create a polygon with 4 vertices(quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() | (Inherited from [`Geometry`](../geometry/).) |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Gets a vertex element with specified type(Inherited from [`Geometry`](../geometry/).) |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | Gets the enumerator for each inner polygons. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | Gets the vertex count of the specified polygon. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv/) instance with given texture mapping type(Inherited from [`Geometry`](../geometry/).) |
| [Optimize](../../aspose.threed.entities/mesh/optimize/)(bool) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | Gets the Mesh instance from current entity. |
| [Triangulate](../../aspose.threed.entities/mesh/triangulate/)() | Return triangulated mesh |
| [operator &amp;](../../aspose.threed.entities/mesh/op_bitwiseand/) | Calculate the intersection of two meshes |
| [operator &#x7C;](../../aspose.threed.entities/mesh/op_bitwiseor/) | Calculate the union of two meshes |
| [operator -](../../aspose.threed.entities/mesh/op_subtraction/) | Calculate the difference of two meshes |

### Examples

To add a polygon in mesh:

```csharp
Mesh mesh = new Mesh();
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

Travel through all polygons in mesh:

```csharp
Mesh mesh = new Mesh();
foreach(int[] polygon in mesh)
{
    //deal with polygon
}
```

### See Also

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


