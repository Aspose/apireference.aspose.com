---
title: DicomImage.CacheData
second_title: Aspose.Imaging for .NET API Reference
description: DicomImage method. This method efficiently caches data optimizing performance and ensuring swift access when needed. Ideal for developers seeking to enhance the speed and efficiency of their applications by intelligently managing data resources
type: docs
weight: 170
url: /net/aspose.imaging.fileformats.dicom/dicomimage/cachedata/
---
## DicomImage.CacheData method

This method efficiently caches data, optimizing performance and ensuring swift access when needed. Ideal for developers seeking to enhance the speed and efficiency of their applications by intelligently managing data resources.

```csharp
public override void CacheData()
```

## Examples

The following example shows how to cache all pages of a DICOM image.

```csharp
[C#]

string dir = "c:\\temp\\";

// Load an image from a DICOM file.
using (Aspose.Imaging.FileFormats.Dicom.DicomImage image = (Aspose.Imaging.FileFormats.Dicom.DicomImage)Aspose.Imaging.Image.Load(dir + "sample.dicom"))
{
    // This call caches all the pages so that no additional data loading will be performed from the underlying data stream.
    image.CacheData();

    // Or you can cache the pages individually.
    foreach (Aspose.Imaging.FileFormats.Dicom.DicomPage page in image.DicomPages)
    {
        page.CacheData();
    }
}
```

### See Also

* class [DicomImage](../)
* namespace [Aspose.Imaging.FileFormats.Dicom](../../dicomimage/)
* assembly [Aspose.Imaging](../../../)


