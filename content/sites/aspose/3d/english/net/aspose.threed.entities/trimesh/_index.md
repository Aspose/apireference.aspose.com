---
title: TriMesh
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 730
url: /net/aspose.threed.entities/trimesh/
---
## TriMesh class

A TriMesh contains raw data that can be used by GPU directly. This class is a utility to help to construct a mesh that only contains per-vertex data.

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## Constructors

| Name | Description |
| --- | --- |
| [TriMesh](trimesh)(string, VertexDeclaration) | Initialize an instance of [`TriMesh`](../trimesh) |

## Properties

| Name | Description |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | The capacity of pre-allocated vertices. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | The count of indices in this [`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Gets the scene that this object belongs to |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | The count of unmerged vertices that passed in by [`BeginVertex`](./beginvertex) and [`EndVertex`](./endvertex). |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | The vertex layout of the [`TriMesh`](../trimesh). |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | The count of vertices in this [`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | The total size of all vertices in bytes |

## Methods

| Name | Description |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom)(TriMesh, VertexDeclaration) | Copy the [`TriMesh`](../trimesh) from input with new vertex layout |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh)(Mesh, bool) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh)(VertexDeclaration, Mesh) | Create a TriMesh from given mesh object with given vertex layout. |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata)(VertexDeclaration, byte[], int[], bool) | Create TriMesh from raw data |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Begin adding vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | End adding vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Gets the bounding box of current entity in its object space coordinate system. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Gets the key of the entity renderer registered in the renderer |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Get the enumerator to enumerate [`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Get the value of specified property |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Load vertices from bytes, the length of bytes must be an integer multiple of vertex size. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Read the double field |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Read the float field |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Read the vector2 field |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Read the vector3 field |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Read the vector4 field |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Read the vector2 field |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Read the vector3 field |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Read the vector4 field |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Sets the value of specified property |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Gets the string representation of [`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Convert the vertices data to byte array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Write the indices data as 16bit integer to the stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Write the indices data as 32bit integer to the stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Write vertices data to the specified stream |

### See Also

* class [Entity](../../aspose.threed/entity)
* class [Vertex](../../aspose.threed.utilities/vertex)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
