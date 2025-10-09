---
title: ImageMetadataReader.GetReader
second_title: Aspose.GIS for .NET API Reference
description: ImageMetadataReader method. Creates a reader instance for EXIF tags
type: docs
weight: 10
url: /net/aspose.gis.imagemetadata/imagemetadatareader/getreader/
---
## GetReader(string) {#getreader_1}

Creates a reader instance for EXIF tags

```csharp
public static ImageMetadataReader GetReader(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | Full name of the image file. |

### Return Value

Metadata reader instance

## Remarks

The image file will be locked for changes until the reader's Dispose is executed.

### See Also

* class [ImageMetadataReader](../)
* namespace [Aspose.Gis.ImageMetadata](../../imagemetadatareader/)
* assembly [Aspose.GIS](../../../)

---

## GetReader(Stream) {#getreader}

Creates a reader instance for EXIF tags

```csharp
public static ImageMetadataReader GetReader(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Image data source stream |

### Return Value

Metadata reader instance

## Remarks

It is important not to close the source stream until the reader's Dispose is executed.

### See Also

* class [ImageMetadataReader](../)
* namespace [Aspose.Gis.ImageMetadata](../../imagemetadatareader/)
* assembly [Aspose.GIS](../../../)


