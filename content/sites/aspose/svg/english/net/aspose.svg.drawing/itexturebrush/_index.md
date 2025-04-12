---
title: ITextureBrush Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.ITextureBrush interface. Defines brush interface that uses an image to fill the interior of a shape
type: docs
weight: 3650
url: /net/aspose.svg.drawing/itexturebrush/
---
## ITextureBrush interface

Defines brush interface that uses an image to fill the interior of a shape.

```csharp
public interface ITextureBrush : ITransformableBrush
```

## Properties

| Name | Description |
| --- | --- |
| [ColorMap](../../aspose.svg.drawing/itexturebrush/colormap/) { get; } | The number of elements must be even. Every even element is old color. Every odd element is new color. |
| [Image](../../aspose.svg.drawing/itexturebrush/image/) { get; } | Gets or sets the image used by the brush. |
| [ImageArea](../../aspose.svg.drawing/itexturebrush/imagearea/) { get; } | Specifies the portion of the image used by the brush. If it equals RectangleF.Empty then the whole image will be used. Coordinates are in pixels. |
| [Opacity](../../aspose.svg.drawing/itexturebrush/opacity/) { get; set; } | Get opacity value in a color transform matrix. |

### See Also

* interface [ITransformableBrush](../itransformablebrush/)
* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
