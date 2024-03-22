---
title: PlyFormat.Decode
second_title: Aspose.3D for .NET API Reference
description: PlyFormat method. Decode a point cloud or mesh from the specified stream
type: docs
weight: 10
url: /net/aspose.threed.formats/plyformat/decode/
---
## Decode(string) {#decode_2}

Decode a point cloud or mesh from the specified stream.

```csharp
public Geometry Decode(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The input stream |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance

### Examples

The following code shows how to decode a mesh from a PLY file:

```csharp
//Generate a test file for decoding
FileFormat.PLY.Encode(new Sphere(), "sphere.ply");
//Decode the file
var mesh = (Mesh)FileFormat.PLY.Decode("sphere.ply")
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Decode(string, PlyLoadOptions) {#decode_3}

Decode a point cloud or mesh from the specified stream.

```csharp
public Geometry Decode(string fileName, PlyLoadOptions opt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The input stream |
| opt | PlyLoadOptions | The load option of PLY format |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance

### Examples

The following code shows how to decode a mesh from a PLY file:

```csharp
//Generate a test file for decoding
FileFormat.PLY.Encode(new Sphere(), "sphere.ply");
//Decode the file
var mesh = (Mesh)FileFormat.PLY.Decode("sphere.ply")
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [PlyLoadOptions](../../plyloadoptions/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Decode(Stream) {#decode}

Decode a point cloud or mesh from the specified stream.

```csharp
public Geometry Decode(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The input stream |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance

### Examples

The following code shows how to decode a mesh from a PLY file:

```csharp
//Generate a test file for decoding
FileFormat.PLY.Encode(new Sphere(), "sphere.ply");
//Decode the file
var mesh = (Mesh)FileFormat.PLY.Decode("sphere.ply")
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Decode(Stream, PlyLoadOptions) {#decode_1}

Decode a point cloud or mesh from the specified stream.

```csharp
public Geometry Decode(Stream stream, PlyLoadOptions opt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The input stream |
| opt | PlyLoadOptions | The load option of PLY format |

### Return Value

A [`Mesh`](../../../aspose.threed.entities/mesh/) or [`PointCloud`](../../../aspose.threed.entities/pointcloud/) instance

### Examples

The following code shows how to decode a mesh from a PLY file:

```csharp
//Generate a test file for decoding
FileFormat.PLY.Encode(new Sphere(), "sphere.ply");
//Decode the file
var mesh = (Mesh)FileFormat.PLY.Decode("sphere.ply")
```

### See Also

* class [Geometry](../../../aspose.threed.entities/geometry/)
* class [PlyLoadOptions](../../plyloadoptions/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)


