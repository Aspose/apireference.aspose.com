---
title: Class TriMesh
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.TriMesh class. A TriMesh contains raw data that can be used by GPU directly. This class is a utility to help to construct a mesh that only contains pervertex data
type: docs
weight: 760
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
| [TriMesh](trimesh/)(string, VertexDeclaration) | Initialize an instance of `TriMesh` |

## Properties

| Name | Description |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | The capacity of pre-allocated vertices. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | The count of indices in this `TriMesh` |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | The count of unmerged vertices that passed in by [`BeginVertex`](./beginvertex/) and [`EndVertex`](./endvertex/). |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | The vertex layout of the `TriMesh`. |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | The count of vertices in this `TriMesh` |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | The total size of all vertices in bytes |

## Methods

| Name | Description |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom/)(TriMesh, VertexDeclaration) | Copy the `TriMesh` from input with new vertex layout |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh)(Mesh, bool) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh/#frommesh_1)(VertexDeclaration, Mesh) | Create a TriMesh from given mesh object with given vertex layout. |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata/)(VertexDeclaration, byte[], int[], bool) | Create TriMesh from raw data |
| [AddTriangle](../../aspose.threed.entities/trimesh/addtriangle/)(int, int, int) | Add a new triangle |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | Begin adding vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | End adding vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | Get the enumerator to enumerate [`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/#indicestoarray_1)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | Load vertices from bytes, the length of bytes must be an integer multiple of vertex size. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | Read the double field |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | Read the float field |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | Read the vector2 field |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | Read the vector3 field |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | Read the vector4 field |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | Read the vector2 field |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | Read the vector3 field |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | Read the vector4 field |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | Gets the string representation of `TriMesh` |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | Convert the vertices data to byte array |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | Write the indices data as 16bit integer to the stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | Write the indices data as 32bit integer to the stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | Write vertices data to the specified stream |

### Examples

The following code shows how to create a TriMesh with custom memory layout, and export it to file.

```csharp
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
VertexDeclaration vd = new VertexDeclaration();
vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Position);
vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Normal);
vd.AddField(VertexFieldDataType.FVector2, VertexFieldSemantic.UV);
//convert a mesh to tri-mesh using specified memory layout  
var mesh = (new Sphere()).ToMesh();
var triMesh = TriMesh.FromMesh(vd, mesh);
//save it to a stream, 115 vertices * 32bytes per vertex
using (var stream = new FileStream("output.bin", FileMode.Create))
{
    triMesh.WriteVerticesTo(stream);
    //save indices as ushort to stream, 504 indices * 2 bytes per index
    triMesh.Write16bIndicesTo(stream);
}
```

### See Also

* class [Entity](../../aspose.threed/entity/)
* class [Vertex](../../aspose.threed.utilities/vertex/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


