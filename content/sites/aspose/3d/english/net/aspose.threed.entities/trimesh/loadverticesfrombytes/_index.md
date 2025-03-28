---
title: TriMesh.LoadVerticesFromBytes
second_title: Aspose.3D for .NET API Reference
description: TriMesh method. Load vertices from bytes the length of bytes must be an integer multiple of vertex size
type: docs
weight: 160
url: /net/aspose.threed.entities/trimesh/loadverticesfrombytes/
---
## TriMesh.LoadVerticesFromBytes method

Load vertices from bytes, the length of bytes must be an integer multiple of vertex size.

```csharp
public void LoadVerticesFromBytes(byte[] verticesInBytes)
```

| Parameter | Type | Description |
| --- | --- | --- |
| verticesInBytes | Byte[] |  |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException |  |
| ArgumentException |  |

## Examples

The following code shows how to create an empty TriMesh and manually load vertices from raw bytes.

```csharp
var indices = new int[] { 0,  1,  2 };
var vertices = new byte[]{
    0, 0, 0, 191,
    0, 0, 0, 0,
    0, 0, 0, 191,
    0, 0, 0, 191,
    0, 0, 0, 0,
    0, 0, 0, 63,
    0, 0, 0, 63,
    0, 0, 0, 0,
    0, 0, 0, 63
};
VertexDeclaration vd = new VertexDeclaration();
vd.AddField(VertexFieldDataType.FVector3, VertexFieldSemantic.Position);
//create an empty TriMesh with specified vertex declaration
var triMesh = new TriMesh("", vd);
//load vertices directly from bytes
triMesh.LoadVerticesFromBytes(vertices);
triMesh.AddTriangle(0, 1, 2);
```

```csharp
int[] indices = new int[] { 0,  1,  2 };
byte[] vertices = new byte[]{
    0, 0, 0, 191,
    0, 0, 0, 0,
    0, 0, 0, 191,
    0, 0, 0, 191,
    0, 0, 0, 0,
    0, 0, 0, 63,
    0, 0, 0, 63,
    0, 0, 0, 0,
    0, 0, 0, 63
};
VertexDeclaration vd = new VertexDeclaration();
vd.addField(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION);
//create an empty TriMesh with specified vertex declaration
var triMesh = new TriMesh("", vd);
//load vertices directly from bytes
triMesh.loadVerticesFromBytes(vertices);
triMesh.addTriangle(0, 1, 2);
```

### See Also

* class [TriMesh](../)
* namespace [Aspose.ThreeD.Entities](../../trimesh/)
* assembly [Aspose.3D](../../../)


