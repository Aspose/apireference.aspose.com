---
title: IDrawingFactory Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.IDrawingFactory interface. Represents a factory for creating drawing-related objects
type: docs
weight: 150
url: /net/aspose.svg.drawing/idrawingfactory/
---
## IDrawingFactory interface

Represents a factory for creating drawing-related objects.

```csharp
public interface IDrawingFactory : IDisposable
```

## Methods

| Name | Description |
| --- | --- |
| [CreateBitmap](../../aspose.svg.drawing/idrawingfactory/createbitmap/)(int, int) | Creates a bitmap with the specified width and height. |
| [CreateBitmapFromImageByteArray](../../aspose.svg.drawing/idrawingfactory/createbitmapfromimagebytearray/)(byte[]) | Creates a bitmap from the specified image byte array. |
| [CreateBitmapFromImageStream](../../aspose.svg.drawing/idrawingfactory/createbitmapfromimagestream/)(Stream) | Creates a bitmap from the specified image stream. |
| [CreateBitmapFromPixelByteArray](../../aspose.svg.drawing/idrawingfactory/createbitmapfrompixelbytearray/)(byte[], int, int) | Creates a bitmap from the specified pixel byte array with the specified width and height. |
| [CreateCodec](../../aspose.svg.drawing/idrawingfactory/createcodec/)(byte[]) | Creates a codec for the specified image. |
| [CreateLinearGradientBrush](../../aspose.svg.drawing/idrawingfactory/createlineargradientbrush/)(RectangleF, float, bool, IInterpolationColor[], SpreadMode) | Creates a linear gradient brush with the specified parameters. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix)() | Creates a new identity matrix. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix_1)(IMatrix) | Creates a new matrix with the same contents as the specified matrix. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix_2)(float, float, float, float, float, float) | Creates a new matrix with the specified elements. |
| [CreateSolidBrush](../../aspose.svg.drawing/idrawingfactory/createsolidbrush/)(Color) | Creates a solid brush with the specified color. |
| [CreateTextureBrush](../../aspose.svg.drawing/idrawingfactory/createtexturebrush/#createtexturebrush)(byte[], SpreadMode, float, IMatrix) | Creates a texture brush with the specified parameters. |
| [CreateTextureBrush](../../aspose.svg.drawing/idrawingfactory/createtexturebrush/#createtexturebrush_1)(PointF, IMatrix, IInterpolationColor[], RectangleF, float, RectangleF) | Creates a texture brush with the specified parameters for an elliptical shape. |

### See Also

* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
