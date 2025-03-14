---
title: RasterImage.SetArgb32Pixel
second_title: Aspose.Imaging for .NET API Reference
description: RasterImage method. Sets an image 32bit ARGB pixel for the specified position
type: docs
weight: 570
url: /net/aspose.imaging/rasterimage/setargb32pixel/
---
## RasterImage.SetArgb32Pixel method

Sets an image 32-bit ARGB pixel for the specified position.

```csharp
public void SetArgb32Pixel(int x, int y, int argb32Color)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Int32 | The pixel x location. |
| y | Int32 | The pixel y location. |
| argb32Color | Int32 | The 32-bit ARGB pixel for the specified position. |

## Examples

The following example loads a raster image, and sets the color of an arbitrary pixel.

```csharp
[C#]

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(@"c:\temp\sample.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // Sets the color of the top-left pixel.
    rasterImage.SetArgb32Pixel(0, 0, Aspose.Imaging.Color.Aqua.ToArgb());

    // Another way is to pass an instance of the Aspose.Imaging.Color directly
    rasterImage.SetPixel(0, 0, Aspose.Imaging.Color.Aqua);
}
```

### See Also

* class [RasterImage](../)
* namespace [Aspose.Imaging](../../rasterimage/)
* assembly [Aspose.Imaging](../../../)


