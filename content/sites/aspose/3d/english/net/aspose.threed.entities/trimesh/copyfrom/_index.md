---
title: TriMesh.CopyFrom
second_title: Aspose.3D for .NET API Reference
description: TriMesh method. Copy the TriMesh from input with new vertex layout
type: docs
weight: 20
url: /net/aspose.threed.entities/trimesh/copyfrom/
---
## TriMesh.CopyFrom method

Copy the [`TriMesh`](../) from input with new vertex layout

```csharp
public static TriMesh CopyFrom(TriMesh input, VertexDeclaration vd)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | TriMesh | The input TriMesh for copying |
| vd | VertexDeclaration | The new vertex declaration of the output TriMesh |

### Return Value

A new TriMesh instance with new vertex declaration.

## Examples

```csharp
//Define a vertex declaration as {FVector3 Position; FVector3 Normal; FVector2 UV}
VertexDeclaration vd = new VertexDeclaration();
vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Position);
vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Normal);
vd.AddField(VertexFieldDataType.FVector2, VertexFieldSemantic.UV);
//convert a mesh to TriMesh, the layout is automatically inferred from input mesh
var oldTriMesh = TriMesh.FromMesh((new Sphere()).ToMesh());
//now create a new TriMesh from old TriMesh, using explicit memory layout defined by vd
var newTriMesh = TriMesh.CopyFrom(oldTriMesh, vd);
```

### See Also

* class [VertexDeclaration](../../../aspose.threed.utilities/vertexdeclaration/)
* class [TriMesh](../)
* namespace [Aspose.ThreeD.Entities](../../trimesh/)
* assembly [Aspose.3D](../../../)


