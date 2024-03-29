---
title: BinarizeOtsu
second_title: Aspose.Imaging för .NET API-referens
description: Binarisering av en bild med Otsu thresholding
type: docs
weight: 70
url: /sv/net/aspose.imaging/rastercachedimage/binarizeotsu/
---
## RasterCachedImage.BinarizeOtsu method

Binarisering av en bild med Otsu thresholding

```csharp
public override void BinarizeOtsu()
```

### Exempel

Följande exempel binariserar en rastercachad bild med Otsu-tröskelvärde. Binariserade bilder innehåller endast 2 färger - svart och vitt.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.png"))
{
    Aspose.Imaging.RasterCachedImage rasterImage = (Aspose.Imaging.RasterCachedImage)image;

    // Binarisera bilden med Otsu-tröskelvärde.
    rasterImage.BinarizeOtsu();
    rasterImage.Save(dir + "sample.BinarizeOtsu.png");
}
```

### Se även

* class [RasterCachedImage](../../rastercachedimage)
* namnutrymme [Aspose.Imaging](../../rastercachedimage)
* hopsättning [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
