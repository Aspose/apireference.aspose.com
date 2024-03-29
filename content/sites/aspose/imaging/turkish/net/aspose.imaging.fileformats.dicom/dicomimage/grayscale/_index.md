---
title: Grayscale
second_title: Aspose.Imaging for .NET API Referansı
description: Bir görüntünün gri tonlamalı temsiline dönüştürülmesi
type: docs
weight: 230
url: /tr/net/aspose.imaging.fileformats.dicom/dicomimage/grayscale/
---
## DicomImage.Grayscale method

Bir görüntünün gri tonlamalı temsiline dönüştürülmesi

```csharp
public override void Grayscale()
```

### Örnekler

Aşağıdaki örnek, renkli bir DICOM görüntüsünü gri tonlamalı temsiline dönüştürür. Gri tonlamalı görüntüler yalnızca gri tonlarından oluşur ve yalnızca yoğunluk bilgisi taşır.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.dicom"))
{
    Aspose.Imaging.FileFormats.Dicom.DicomImage dicomImage = (Aspose.Imaging.FileFormats.Dicom.DicomImage)image;

    dicomImage.Grayscale();
    dicomImage.Save(dir + "sample.Grayscale.png", new Aspose.Imaging.ImageOptions.PngOptions());
}
```

### Ayrıca bakınız

* class [DicomImage](../../dicomimage)
* ad alanı [Aspose.Imaging.FileFormats.Dicom](../../dicomimage)
* toplantı [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
