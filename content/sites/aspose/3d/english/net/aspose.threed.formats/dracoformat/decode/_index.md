---
title: DracoFormat.Decode
second_title: Aspose.3D for .NET API Reference
description: DracoFormat method. Decode the point cloud or mesh from specified file name
type: docs
weight: 10
url: /net/aspose.threed.formats/dracoformat/decode/
---
## Decode(string) {#decode_1}

Decode the point cloud or mesh from specified file name

```csharp
public Geometry Decode(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The file name contains the drc file |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance depends on the file content

### Examples

The following code shows how to encode and decode a Mesh to/from byte array:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into Draco format
byte[] draco = FileFormat.Draco.Encode(mesh);
//decode mesh from Draco format
Mesh decodedMesh = (Mesh)FileFormat.Draco.Decode(draco);
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [DracoFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Decode(byte[]) {#decode}

Decode the point cloud or mesh from memory data

```csharp
public Geometry Decode(byte[] data)
```

| Parameter | Type | Description |
| --- | --- | --- |
| data | Byte[] | The raw drc bytes |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance depends on the content

### Examples

The following code shows how to encode and decode a Mesh to/from byte array:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into Draco format
byte[] draco = FileFormat.Draco.Encode(mesh);
//decode mesh from Draco format
Mesh decodedMesh = (Mesh)FileFormat.Draco.Decode(draco);
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [DracoFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)


