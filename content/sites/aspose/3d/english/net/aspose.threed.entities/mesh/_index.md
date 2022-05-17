---
title: Mesh
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 450
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
| [Mesh](mesh)() | Initializes a new instance of the [`Mesh`](../mesh) class. |
| [Mesh](mesh)(Bitmap) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |
| [Mesh](mesh)(string) | Initializes a new instance of the [`Mesh`](../mesh) class. |
| [Mesh](mesh)(Bitmap, Matrix4) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |
| [Mesh](mesh)(Bitmap, bool, Matrix4) | Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](castshadows) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [ControlPoints](controlpoints) { get; } | Gets all control points |
| [Deformers](deformers) { get; } | Gets all deformers associated with this geometry. |
| [Edges](edges) { get; } | Gets edges of the Mesh. Edge is optional in mesh, so it can be empty. |
| [Excluded](excluded) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](name) { get; set; } | Gets or sets the name. |
| [ParentNode](parentnode) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](parentnodes) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [PolygonCount](polygoncount) { get; } | Gets the count of polygons |
| [Polygons](polygons) { get; } | Gets the polygons definition of the mesh |
| [Properties](properties) { get; } | Gets the collection of all properties. |
| [ReceiveShadows](receiveshadows) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](scene) { get; } | Gets the scene that this object belongs to |
| [VertexElements](vertexelements) { get; } | Gets all vertex elements |
| [Visible](visible) { get; set; } | Gets or sets if the geometry is visible |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](addelement)(VertexElement) | Adds an existing vertex element to current geometry |
| [CreateElement](createelement)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElement](createelement)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElementUV](createelementuv)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv) with given texture mapping type. |
| [CreateElementUV](createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv) with given texture mapping type. |
| [CreatePolygon](createpolygon)(int[]) | Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../polygonbuilder). |
| [CreatePolygon](createpolygon)(int, int, int) | Create a polygon with 3 vertices(triangle) |
| [CreatePolygon](createpolygon)(int[], int, int) | Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../polygonbuilder). |
| [CreatePolygon](createpolygon)(int, int, int, int) | Create a polygon with 4 vertices(quad) |
| [FindProperty](findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](getboundingbox)() | Gets the bounding box of current entity in its object space coordinate system. |
| [GetDeformers&lt;T&gt;](getdeformers)() |  |
| [GetElement](getelement)(VertexElementType) | Gets a vertex element with specified type |
| virtual [GetEntityRendererKey](getentityrendererkey)() | Gets the key of the entity renderer registered in the renderer |
| [GetEnumerator](getenumerator)() | Gets the enumerator for each inner polygons. |
| [GetPolygonSize](getpolygonsize)(int) | Gets the vertex count of the specified polygon. |
| [GetProperty](getproperty)(string) | Get the value of specified property |
| [GetVertexElementOfUV](getvertexelementofuv)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv) instance with given texture mapping type |
| [RemoveProperty](removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](removeproperty)(string) | Remove the specified property identified by name |
| [SetProperty](setproperty)(string, object) | Sets the value of specified property |
| [ToMesh](tomesh)() | Gets the Mesh instance from current entity. |

### Examples

To add a polygon in mesh:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

Travel through all polygons in mesh:

```csharp
foreach(int[] polygon in mesh)
{
    //deal with polygon
}
```

### See Also

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3d.dll -->
