---
title: IDrawingFactory.CreateLinearGradientBrush
second_title: Aspose.SVG for .NET API Reference
description: IDrawingFactory method. Creates a linear gradient brush with the specified parameters
type: docs
weight: 60
url: /net/aspose.svg.drawing/idrawingfactory/createlineargradientbrush/
---
## IDrawingFactory.CreateLinearGradientBrush method

Creates a linear gradient brush with the specified parameters.

```csharp
public ILinearGradientBrush CreateLinearGradientBrush(RectangleF rect, float angle, bool isScaled, 
    IInterpolationColor[] colors, SpreadMode spreadMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | The rectangle defining the gradient bounds. |
| angle | Single | The angle of the gradient. |
| isScaled | Boolean | Determines whether the gradient is scaled with the rectangle. |
| colors | IInterpolationColor[] | The interpolation colors for the gradient. See [`IInterpolationColor`](../../iinterpolationcolor/). |
| spreadMode | SpreadMode | The spread mode for the gradient. See [`SpreadMode`](../../spreadmode/). |

### Return Value

The created [`ILinearGradientBrush`](../../ilineargradientbrush/).

### See Also

* interface [ILinearGradientBrush](../../ilineargradientbrush/)
* interface [IInterpolationColor](../../iinterpolationcolor/)
* enum [SpreadMode](../../spreadmode/)
* interface [IDrawingFactory](../)
* namespace [Aspose.Svg.Drawing](../../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../../)
