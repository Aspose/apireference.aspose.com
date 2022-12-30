---
title: PlyFormat
second_title: Aspose.3D for Java API Reference
description: The PLY format.
type: docs
weight: 115
url: /java/com.aspose.threed/plyformat/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileFormat](../../com.aspose.threed/fileformat)
```
public class PlyFormat extends FileFormat
```

The PLY format.
## Methods

| Method | Description |
| --- | --- |
| [encode(Entity entity, Stream stream, PlySaveOptions opt)](#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-com.aspose.threed.PlySaveOptions-) | Encode the entity and save the result into the stream. |
| [encode(Entity entity, Stream stream)](#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-) | Encode the entity and save the result into the stream. |
| [encode(Entity entity, String fileName, PlySaveOptions opt)](#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.PlySaveOptions-) | Encode the entity and save the result into an external file. |
| [encode(Entity entity, String fileName)](#encode-com.aspose.threed.Entity-java.lang.String-) | Encode the entity and save the result into an external file. |
| [decode(String fileName, PlyLoadOptions opt)](#decode-java.lang.String-com.aspose.threed.PlyLoadOptions-) | Decode a point cloud or mesh from the specified stream. |
| [decode(String fileName)](#decode-java.lang.String-) | Decode a point cloud or mesh from the specified stream. |
| [decode(Stream stream, PlyLoadOptions opt)](#decode-com.aspose.csporter.helpers.Stream-com.aspose.threed.PlyLoadOptions-) | Decode a point cloud or mesh from the specified stream. |
| [decode(Stream stream)](#decode-com.aspose.csporter.helpers.Stream-) | Decode a point cloud or mesh from the specified stream. |
### encode(Entity entity, Stream stream, PlySaveOptions opt) {#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-com.aspose.threed.PlySaveOptions-}
```
public void encode(Entity entity, Stream stream, PlySaveOptions opt)
```


Encode the entity and save the result into the stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to encode |
| stream | com.aspose.csporter.helpers.Stream | The stream to write to, this method will not close this stream |
| opt | [PlySaveOptions](../../com.aspose.threed/plysaveoptions) | Save options |

### encode(Entity entity, Stream stream) {#encode-com.aspose.threed.Entity-com.aspose.csporter.helpers.Stream-}
```
public void encode(Entity entity, Stream stream)
```


Encode the entity and save the result into the stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to encode |
| stream | com.aspose.csporter.helpers.Stream | The stream to write to, this method will not close this stream |

### encode(Entity entity, String fileName, PlySaveOptions opt) {#encode-com.aspose.threed.Entity-java.lang.String-com.aspose.threed.PlySaveOptions-}
```
public void encode(Entity entity, String fileName, PlySaveOptions opt)
```


Encode the entity and save the result into an external file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to encode |
| fileName | java.lang.String | The file to write to |
| opt | [PlySaveOptions](../../com.aspose.threed/plysaveoptions) | Save options |

### encode(Entity entity, String fileName) {#encode-com.aspose.threed.Entity-java.lang.String-}
```
public void encode(Entity entity, String fileName)
```


Encode the entity and save the result into an external file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to encode |
| fileName | java.lang.String | The file to write to |

### decode(String fileName, PlyLoadOptions opt) {#decode-java.lang.String-com.aspose.threed.PlyLoadOptions-}
```
public Geometry decode(String fileName, PlyLoadOptions opt)
```


Decode a point cloud or mesh from the specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The input stream |
| opt | [PlyLoadOptions](../../com.aspose.threed/plyloadoptions) | The load option of PLY format |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance
### decode(String fileName) {#decode-java.lang.String-}
```
public Geometry decode(String fileName)
```


Decode a point cloud or mesh from the specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The input stream |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance
### decode(Stream stream, PlyLoadOptions opt) {#decode-com.aspose.csporter.helpers.Stream-com.aspose.threed.PlyLoadOptions-}
```
public Geometry decode(Stream stream, PlyLoadOptions opt)
```


Decode a point cloud or mesh from the specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | The input stream |
| opt | [PlyLoadOptions](../../com.aspose.threed/plyloadoptions) | The load option of PLY format |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance
### decode(Stream stream) {#decode-com.aspose.csporter.helpers.Stream-}
```
public Geometry decode(Stream stream)
```


Decode a point cloud or mesh from the specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | The input stream |

**Returns:**
[Geometry](../../com.aspose.threed/geometry) - A com.aspose.threed.Mesh or com.aspose.threed.PointCloud instance
