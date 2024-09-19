---
title: IDrawingFactory.CreateLinearGradientBrush
second_title: Aspose.SVG for .NET API Reference
description: IDrawingFactory method. Creates a linear gradient brush with the specified parameters
type: docs
weight: 70
url: /net/aspose.svg.drawing/idrawingfactory/createlineargradientbrush/
---
## CreateLinearGradientBrush(RectangleF, IInterpolationColor[]) {#createlineargradientbrush}

Creates a linear gradient brush with the specified parameters.

```csharp
public ILinearGradientBrush CreateLinearGradientBrush(RectangleF rect, IInterpolationColor[] colors)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | The rectangle defining the gradient bounds. |
| colors | IInterpolationColor[] | The interpolation colors for the gradient. See [`IInterpolationColor`](../../iinterpolationcolor/). |

### Return Value

The created [`ILinearGradientBrush`](../../ilineargradientbrush/).

### See Also

* interface [ILinearGradientBrush](../../ilineargradientbrush/)
* interface [IInterpolationColor](../../iinterpolationcolor/)
* interface [IDrawingFactory](../)
* namespace [Aspose.Svg.Drawing](../../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../../)

---

## CreateLinearGradientBrush(RectangleF, float, bool, IInterpolationColor[], SpreadMode) {#createlineargradientbrush_1}

Creates a linear gradient brush with the specified parameters.

```csharp
public ILinearGradientBrush CreateLinearGradientBrush(RectangleF rect, float angle, bool isScaled, 
    IInterpolationColor[] colors, SpreadMode spreadMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | The rectangle defining the gradient bounds. |
| angle | Single | The angle of the gradient. |
| isScaled | Boolean | Determines whether the angle is affected by transformation matrix associated with the brush. |
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
