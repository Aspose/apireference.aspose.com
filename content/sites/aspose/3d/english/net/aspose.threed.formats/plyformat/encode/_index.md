---
title: PlyFormat.Encode
second_title: Aspose.3D for .NET API Reference
description: PlyFormat method. Encode the entity and save the result into the stream
type: docs
weight: 20
url: /net/aspose.threed.formats/plyformat/encode/
---
## Encode(Entity, Stream) {#encode}

Encode the entity and save the result into the stream.

```csharp
public void Encode(Entity entity, Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| stream | Stream | The stream to write to, this method will not close this stream |

### Examples

The following code shows how to encode a mesh into PLY file:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into PLY format
FileFormat.PLY.Encode(mesh, "sphere.ply");
```

### See Also

* class [Entity](../../../aspose.threed/entity/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Encode(Entity, Stream, PlySaveOptions) {#encode_1}

Encode the entity and save the result into the stream.

```csharp
public void Encode(Entity entity, Stream stream, PlySaveOptions opt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| stream | Stream | The stream to write to, this method will not close this stream |
| opt | PlySaveOptions | Save options |

### Examples

The following code shows how to encode a mesh into PLY file:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into PLY format
FileFormat.PLY.Encode(mesh, "sphere.ply");
```

### See Also

* class [Entity](../../../aspose.threed/entity/)
* class [PlySaveOptions](../../plysaveoptions/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Encode(Entity, string) {#encode_2}

Encode the entity and save the result into an external file.

```csharp
public void Encode(Entity entity, string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| fileName | String | The file to write to |

### Examples

The following code shows how to encode a mesh into PLY file:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into PLY format
FileFormat.PLY.Encode(mesh, "sphere.ply");
```

### See Also

* class [Entity](../../../aspose.threed/entity/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Encode(Entity, string, PlySaveOptions) {#encode_3}

Encode the entity and save the result into an external file.

```csharp
public void Encode(Entity entity, string fileName, PlySaveOptions opt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to encode |
| fileName | String | The file to write to |
| opt | PlySaveOptions | Save options |

### Examples

The following code shows how to encode a mesh into PLY file:

```csharp
Mesh mesh = (new Sphere()).ToMesh();
//encode mesh into PLY format
FileFormat.PLY.Encode(mesh, "sphere.ply");
```

### See Also

* class [Entity](../../../aspose.threed/entity/)
* class [PlySaveOptions](../../plysaveoptions/)
* class [PlyFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)


