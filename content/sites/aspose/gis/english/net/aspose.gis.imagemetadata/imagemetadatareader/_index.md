---
title: Class ImageMetadataReader
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.ImageMetadata.ImageMetadataReader class. Class for editing adding some EXIF tags
type: docs
weight: 3080
url: /net/aspose.gis.imagemetadata/imagemetadatareader/
---
## ImageMetadataReader class

Class for editing, adding some EXIF tags

```csharp
public class ImageMetadataReader : IDisposable
```

## Methods

| Name | Description |
| --- | --- |
| static [GetReader](../../aspose.gis.imagemetadata/imagemetadatareader/getreader/#getreader)(Stream) | Creates a reader instance for EXIF tags |
| static [GetReader](../../aspose.gis.imagemetadata/imagemetadatareader/getreader/#getreader_1)(string) | Creates a reader instance for EXIF tags |
| [Dispose](../../aspose.gis.imagemetadata/imagemetadatareader/dispose/)() | Public implementation of Dispose pattern callable by consumers. |
| [ReadData](../../aspose.gis.imagemetadata/imagemetadatareader/readdata/)() | Extracts all supported EXIF tags |
| [Save](../../aspose.gis.imagemetadata/imagemetadatareader/save/#save)(Stream) | Saving changes to a separate stream |
| [Save](../../aspose.gis.imagemetadata/imagemetadatareader/save/#save_2)(string) | Save to new file since the original one is locked for changes |
| [Save](../../aspose.gis.imagemetadata/imagemetadatareader/save/#save_1)(Stream, ImageFormat) | Saving changes to a separate stream |
| [Save](../../aspose.gis.imagemetadata/imagemetadatareader/save/#save_3)(string, ImageFormat) | Save to new file since the original one is locked for changes |
| [SetArtist](../../aspose.gis.imagemetadata/imagemetadatareader/setartist/)(string) | Saving the EXIF Artist tag, adding or overwriting the data. |
| [SetDescription](../../aspose.gis.imagemetadata/imagemetadatareader/setdescription/)(string) | Saving the EXIF ImageDescription tag, adding or overwriting the data. |
| [SetGeoLocation](../../aspose.gis.imagemetadata/imagemetadatareader/setgeolocation/)(double, double) | Saving the EXIF GPSLatitudeRef, GPSLongitudeRef, GPSLatitude and GPSLongitude tags, adding or overwriting the data. |
| [SetImageSize](../../aspose.gis.imagemetadata/imagemetadatareader/setimagesize/)(int, int) | Saving the EXIF ImageWidth and ImageHeight tags, adding or overwriting the data. |
| [SetModifyDate](../../aspose.gis.imagemetadata/imagemetadatareader/setmodifydate/)(DateTime) | Saving the EXIF ModifyDate (DataTime) tag, adding or overwriting the data. |
| [TryGetArtist](../../aspose.gis.imagemetadata/imagemetadatareader/trygetartist/)(out string) | It tries to find EXIF tag Artist, if the tag is not found it returns null |
| [TryGetDescription](../../aspose.gis.imagemetadata/imagemetadatareader/trygetdescription/)(out string) | It tries to find EXIF tag ImageDescription, if the tag is not found it returns null |
| [TryGetGeoLocation](../../aspose.gis.imagemetadata/imagemetadatareader/trygetgeolocation/)(out GeoLocation) | It tries to find EXIF set of tags GPSLatitudeRef, GPSLongitudeRef, GPSLatitude, GPSLongitude, if the tags does not presented it returns null |
| [TryGetImageSize](../../aspose.gis.imagemetadata/imagemetadatareader/trygetimagesize/)(out ImageSize) | It tries to find EXIF set of tags ImageWidth and ImageHeight, if the tags does not presented it returns null |
| [TryGetModifyDate](../../aspose.gis.imagemetadata/imagemetadatareader/trygetmodifydate/)(out DateTime) | It tries to find EXIF tag ModifyDate (DataTime), if the tag is not found it returns default DataTime value |

### See Also

* namespace [Aspose.Gis.ImageMetadata](../../aspose.gis.imagemetadata/)
* assembly [Aspose.GIS](../../)


