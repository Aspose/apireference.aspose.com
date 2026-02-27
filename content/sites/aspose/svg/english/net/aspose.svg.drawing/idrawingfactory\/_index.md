---
title: IDrawingFactory Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.IDrawingFactory interface. Represents a factory for creating drawing-related objects
type: docs
weight: 3460
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
| [CreateInterpolationColor](../../aspose.svg.drawing/idrawingfactory/createinterpolationcolor/)(*Color, float*) | Creates an interpolation color with the specified color and position. |
| [CreateLinearGradientBrush](../../aspose.svg.drawing/idrawingfactory/createlineargradientbrush/)(*RectangleF, IInterpolationColor[]*) | Creates a linear gradient brush with the specified parameters. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix)() | Creates a new identity matrix. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix_1)(*[IMatrix](../imatrix/)*) | Creates a new matrix with the same contents as the specified matrix. |
| [CreateMatrix](../../aspose.svg.drawing/idrawingfactory/creatematrix/#creatematrix_2)(*float, float, float, float, float, float*) | Creates a new matrix with the specified elements. |
| [CreateSolidBrush](../../aspose.svg.drawing/idrawingfactory/createsolidbrush/)(*Color*) | Creates a solid brush with the specified color. |
| [CreateTextureBrush](../../aspose.svg.drawing/idrawingfactory/createtexturebrush/)(*byte[]*) | Creates a texture brush with the specified parameters. |

### See Also

* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
