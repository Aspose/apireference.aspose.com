---
title: DracoFormat
second_title: Aspose.3D for Java API Reference
description: Google Draco format
type: docs
weight: 42
url: /java/com.aspose.threed/dracoformat/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileFormat](../../com.aspose.threed/fileformat)
```
public class DracoFormat extends FileFormat
```

Google Draco format
## Methods

| Method | Description |
| --- | --- |
| [decode(String fileName)](#decode-java.lang.String-) | Decode the point cloud or mesh from specified file name |
| [decode(byte[] data)](#decode-byte---) | Decode the point cloud or mesh from memory data |
| [encode(Entity entity, Stream stream, DracoSaveOptions options)](#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-com.aspose.threed.DracoSaveOptions-) | Encode the entity to specified stream |
| [encode(Entity entity, Stream stream)](#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-) | Encode the entity to specified stream |
| [encode(Entity entity, String fileName, DracoSaveOptions options)](#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.DracoSaveOptions-) | Encode the entity to specified file |
| [encode(Entity entity, String fileName)](#encode-com.aspose.threed.Entity-java.lang.String-) | Encode the entity to specified file |
| [encode(Entity entity, DracoSaveOptions options)](#encode-com.aspose.threed.Entity-com.aspose.threed.DracoSaveOptions-) | Encode the entity to Draco raw data |
| [encode(Entity entity)](#encode-com.aspose.threed.Entity-) | Encode the entity to Draco raw data |
### decode(String fileName) {#decode-java.lang.String-}
```
public Geometry decode(String fileName)
```


Decode the point cloud or mesh from specified file name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name contains the drc file |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance depends on the file content
### decode(byte[] data) {#decode-byte---}
```
public Geometry decode(byte[] data)
```


Decode the point cloud or mesh from memory data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] | The raw drc bytes |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance depends on the content
### encode(Entity entity, Stream stream, DracoSaveOptions options) {#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-com.aspose.threed.DracoSaveOptions-}
```
public void encode(Entity entity, Stream stream, DracoSaveOptions options)
```


Encode the entity to specified stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |
| stream | com.aspose.csporter.helpers.Stream | The stream that encoded data will be written to |
| options | [DracoSaveOptions](../../com.aspose.threed/dracosaveoptions) | Extra options for encoding the point cloud |

### encode(Entity entity, Stream stream) {#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-}
```
public void encode(Entity entity, Stream stream)
```


Encode the entity to specified stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |
| stream | com.aspose.csporter.helpers.Stream | The stream that encoded data will be written to |

### encode(Entity entity, String fileName, DracoSaveOptions options) {#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.DracoSaveOptions-}
```
public void encode(Entity entity, String fileName, DracoSaveOptions options)
```


Encode the entity to specified file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |
| fileName | java.lang.String | The file name to be written |
| options | [DracoSaveOptions](../../com.aspose.threed/dracosaveoptions) | Extra options for encoding the point cloud |

### encode(Entity entity, String fileName) {#encode-com.aspose.threed.Entity-java.lang.String-}
```
public void encode(Entity entity, String fileName)
```


Encode the entity to specified file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |
| fileName | java.lang.String | The file name to be written |

### encode(Entity entity, DracoSaveOptions options) {#encode-com.aspose.threed.Entity-com.aspose.threed.DracoSaveOptions-}
```
public byte[] encode(Entity entity, DracoSaveOptions options)
```


Encode the entity to Draco raw data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |
| options | [DracoSaveOptions](../../com.aspose.threed/dracosaveoptions) | Extra options for encoding the point cloud |

**Returns:**
byte[] - The encoded draco data represented in bytes
### encode(Entity entity) {#encode-com.aspose.threed.Entity-}
```
public byte[] encode(Entity entity)
```


Encode the entity to Draco raw data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be encoded |

**Returns:**
byte[] - The encoded draco data represented in bytes
