---
title: IBitmap Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.IBitmap interface. Represents a bitmap image
type: docs
weight: 2110
url: /net/aspose.svg.drawing/ibitmap/
---
## IBitmap interface

Represents a bitmap image.

```csharp
public interface IBitmap : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| [ColorSpace](../../aspose.svg.drawing/ibitmap/colorspace/) { get; } | Gets the color space [`ColorSpace`](./colorspace/) of the bitmap image. |
| [ColorTable](../../aspose.svg.drawing/ibitmap/colortable/) { get; } | Gets the color table of the bitmap image. |
| [Format](../../aspose.svg.drawing/ibitmap/format/) { get; } | Gets the format of the bitmap image [`WebImageFormat`](../webimageformat/). |
| [Height](../../aspose.svg.drawing/ibitmap/height/) { get; } | Gets the height of the bitmap image. |
| [HorizontalResolution](../../aspose.svg.drawing/ibitmap/horizontalresolution/) { get; } | Gets the horizontal resolution of the bitmap image. |
| [VerticalResolution](../../aspose.svg.drawing/ibitmap/verticalresolution/) { get; } | Gets the vertical resolution of the bitmap image. |
| [Width](../../aspose.svg.drawing/ibitmap/width/) { get; } | Gets the width of the bitmap image. |

## Methods

| Name | Description |
| --- | --- |
| [ApplyOpacity](../../aspose.svg.drawing/ibitmap/applyopacity/)(float) | Applies the specified opacity to the bitmap image. |
| [DrawBitmap](../../aspose.svg.drawing/ibitmap/drawbitmap/)(Rectangle, Rectangle, IBitmap) | Draws the specified source rectangle of the given bitmap onto the specified destination rectangle of the current bitmap. |
| [FillRectangle](../../aspose.svg.drawing/ibitmap/fillrectangle/)(Rectangle, IBrush) | Fills the specified rectangle with the specified brush. |
| [GetPixelsMap](../../aspose.svg.drawing/ibitmap/getpixelsmap/)(bool, bool) | Retrieves the pixel map representation of the bitmap image, optionally converting to monochrome and allowing transparency color conversion. |
| [RotateFlip](../../aspose.svg.drawing/ibitmap/rotateflip/)(WebRotateFlipType) | Rotates and flips the bitmap image according to the specified rotation and flip type. |
| [Save](../../aspose.svg.drawing/ibitmap/save/)(Stream, WebImageFormat, int) | Saves the bitmap image to the specified stream with the specified image format and quality. |
| [SetTransparent](../../aspose.svg.drawing/ibitmap/settransparent/)(Color) | Sets the specified color as transparent in the bitmap image. |

### See Also

* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
