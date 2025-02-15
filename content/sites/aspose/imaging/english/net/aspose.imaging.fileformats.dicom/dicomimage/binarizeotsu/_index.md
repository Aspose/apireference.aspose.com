---
title: DicomImage.BinarizeOtsu
second_title: Aspose.Imaging for .NET API Reference
description: DicomImage method. Apply Otsu thresholding to binarize the image automatically determining the optimal threshold value based on the images histogram. Perfect for developers seeking a reliable method to segment images into foreground and background regions with minimal manual intervention
type: docs
weight: 160
url: /net/aspose.imaging.fileformats.dicom/dicomimage/binarizeotsu/
---
## DicomImage.BinarizeOtsu method

Apply Otsu thresholding to binarize the image, automatically determining the optimal threshold value based on the image's histogram. Perfect for developers seeking a reliable method to segment images into foreground and background regions with minimal manual intervention.

```csharp
public override void BinarizeOtsu()
```

## Examples

The following example binarizes a DICOM image with Otsu thresholding. Binarized images contain only 2 colors - black and white.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.dicom"))
{
    Aspose.Imaging.FileFormats.Dicom.DicomImage dicomImage = (Aspose.Imaging.FileFormats.Dicom.DicomImage)image;

    // Binarize the image with Otsu thresholding.
    dicomImage.BinarizeOtsu();
    dicomImage.Save(dir + "sample.BinarizeOtsu.png", new Aspose.Imaging.ImageOptions.PngOptions());
}
```

### See Also

* class [DicomImage](../)
* namespace [Aspose.Imaging.FileFormats.Dicom](../../dicomimage/)
* assembly [Aspose.Imaging](../../../)


