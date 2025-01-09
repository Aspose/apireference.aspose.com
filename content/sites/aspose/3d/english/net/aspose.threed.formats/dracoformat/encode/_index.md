---
title: DracoFormat.Encode
second_title: Aspose.3D for .NET API Reference
description: DracoFormat method. Encode the entity to specified stream
type: docs
weight: 20
url: /net/aspose.threed.formats/dracoformat/encode/
---
## Encode(Entity, Stream, DracoSaveOptions) {#encode_1}

Encode the entity to specified stream

```csharp
public void Encode(Entity entity, Stream stream, DracoSaveOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be encoded |
| stream | Stream | The stream that encoded data will be written to |
| options | DracoSaveOptions | Extra options for encoding the point cloud |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed to read from stream |

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

* class [Entity](../../../aspose.threed/entity/)
* class [DracoSaveOptions](../../dracosaveoptions/)
* class [DracoFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Encode(Entity, string, DracoSaveOptions) {#encode_2}

Encode the entity to specified file

```csharp
public void Encode(Entity entity, string fileName, DracoSaveOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be encoded |
| fileName | String | The file name to be written |
| options | DracoSaveOptions | Extra options for encoding the point cloud |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed to read from file |

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

* class [Entity](../../../aspose.threed/entity/)
* class [DracoSaveOptions](../../dracosaveoptions/)
* class [DracoFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)

---

## Encode(Entity, DracoSaveOptions) {#encode}

Encode the entity to Draco raw data

```csharp
public byte[] Encode(Entity entity, DracoSaveOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be encoded |
| options | DracoSaveOptions | Extra options for encoding the point cloud |

### Return Value

The encoded draco data represented in bytes

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

* class [Entity](../../../aspose.threed/entity/)
* class [DracoSaveOptions](../../dracosaveoptions/)
* class [DracoFormat](../)
* namespace [Aspose.ThreeD.Formats](../../../aspose.threed.formats/)
* assembly [Aspose.3D](../../../)


