---
title: BinarizeOtsu
second_title: Aspose.Imaging för .NET API-referens
description: Binarisering av en bild med Otsu thresholding
type: docs
weight: 240
url: /sv/net/aspose.imaging/rasterimage/binarizeotsu/
---
## RasterImage.BinarizeOtsu method

Binarisering av en bild med Otsu thresholding

```csharp
public virtual void BinarizeOtsu()
```

### Exempel

Följande exempel binariserar en rasterbild med Otsu-tröskelvärde. Binariserade bilder innehåller endast 2 färger - svart och vitt.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // Binarisera bilden med Otsu-tröskelvärde.
    rasterImage.BinarizeOtsu();
    rasterImage.Save(dir + "sample.BinarizeOtsu.png");
}
```

### Se även

* class [RasterImage](../../rasterimage)
* namnutrymme [Aspose.Imaging](../../rasterimage)
* hopsättning [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
