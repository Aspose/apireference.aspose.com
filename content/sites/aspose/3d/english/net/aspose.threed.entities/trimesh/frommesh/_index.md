---
title: TriMesh.FromMesh
second_title: Aspose.3D for .NET API Reference
description: TriMesh method. Create a TriMesh from given mesh object with given vertex layout
type: docs
weight: 30
url: /net/aspose.threed.entities/trimesh/frommesh/
---
## FromMesh(VertexDeclaration, Mesh) {#frommesh_1}

Create a TriMesh from given mesh object with given vertex layout.

```csharp
public static TriMesh FromMesh(VertexDeclaration declaration, Mesh mesh)
```

| Parameter | Type | Description |
| --- | --- | --- |
| declaration | VertexDeclaration | Vertex's type definition, or memory layout |
| mesh | Mesh | Source mesh |

### Return Value

Instance of TriMesh converted from input mesh with specified vertex's memory layout

## Examples

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

* class [VertexDeclaration](../../../aspose.threed.utilities/vertexdeclaration/)
* class [Mesh](../../mesh/)
* class [TriMesh](../)
* namespace [Aspose.ThreeD.Entities](../../trimesh/)
* assembly [Aspose.3D](../../../)

---

## FromMesh(Mesh, bool) {#frommesh}

Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure.

```csharp
public static TriMesh FromMesh(Mesh mesh, bool useFloat = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | Mesh |  |
| useFloat | Boolean | Use float type instead of double type for each vertex element component. |

### Return Value

The [`TriMesh`](../) generated from given [`Mesh`](../../mesh/)

## Examples

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

* class [Mesh](../../mesh/)
* class [TriMesh](../)
* namespace [Aspose.ThreeD.Entities](../../trimesh/)
* assembly [Aspose.3D](../../../)


