---
title: ColorPaletteHelper.GetCloseImagePalette
second_title: Aspose.CAD for .NET API Reference
description: ColorPaletteHelper method. Gets color palette from raster image palletizes image in case the image does not have one. In case palette exists it will be used instead performing calculations
type: docs
weight: 60
url: /net/aspose.cad/colorpalettehelper/getcloseimagepalette/
---
## ColorPaletteHelper.GetCloseImagePalette method

Gets color palette from raster image (palletizes image) in case the image does not have one. In case palette exists it will be used instead performing calculations.

```csharp
public static IColorPalette GetCloseImagePalette(RasterImage image, int entriesCount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| image | RasterImage | The raster image. |
| entriesCount | Int32 | The desired entries count. |

### Return Value

The color palette which starts with the most frequent colors from the *image* and contains *entriesCount* entries.

### See Also

* interface [IColorPalette](../../icolorpalette/)
* class [RasterImage](../../rasterimage/)
* class [ColorPaletteHelper](../)
* namespace [Aspose.CAD](../../colorpalettehelper/)
* assembly [Aspose.CAD](../../../)


