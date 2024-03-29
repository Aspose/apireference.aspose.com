---
title: LoadArgb64Pixels
second_title: Aspose.Imaging för .NET API-referens
description: Laddar 64-bitars ARGB-pixlar.
type: docs
weight: 370
url: /sv/net/aspose.imaging/rasterimage/loadargb64pixels/
---
## RasterImage.LoadArgb64Pixels method

Laddar 64-bitars ARGB-pixlar.

```csharp
public long[] LoadArgb64Pixels(Rectangle rectangle)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rectangle | Rectangle | Rektangeln att ladda pixlar från. |

### Returvärde

Den inlästa 64-bitars ARGB-pixelmatrisen.

### Exempel

Följande exempel visar hur man laddar och bearbetar pixlar i en rasterbild. Pixlarna representeras som 64-bitars heltalsvärden. Tänk till exempel på ett problem med räkning av helt genomskinliga pixlar i en bild.

```csharp
[C#]

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(@"c:\temp\16rgba.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // Ladda pixlar för hela bilden. Vilken rektangulär del av bilden som helst kan anges som en parameter för metoden Aspose.Imaging.RasterImage.LoadArgb64Pixels.
    // Observera att själva bilden måste ha 16 bitar per sampel, eftersom Aspose.Imaging.RasterImage.LoadArgb64Pixels inte fungerar med 8 bitar per sampel.
    // För att arbeta med 8 bitar per sampel, använd den gamla goda metoden Aspose.Imaging.RasterImage.LoadArgb32Pixels.
    long[] pixels = rasterImage.LoadArgb64Pixels(rasterImage.Bounds);

    int count = 0;
    foreach (int pixel in pixels)
    {
        // Observera att alla färgkomponenter inklusive alfa representeras av 16-bitars värden, så deras tillåtna värden ligger i intervallet [0, 63535].
        int alpha = (pixel >> 48) & 0xffff;
        if (alpha == 0)
        {
            count++;
        }
    }

    System.Console.WriteLine("The number of fully transparent pixels is {0}", count);
    System.Console.WriteLine("The total number of pixels is {0}", image.Width * image.Height);
}
```

### Se även

* struct [Rectangle](../../rectangle)
* class [RasterImage](../../rasterimage)
* namnutrymme [Aspose.Imaging](../../rasterimage)
* hopsättning [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
