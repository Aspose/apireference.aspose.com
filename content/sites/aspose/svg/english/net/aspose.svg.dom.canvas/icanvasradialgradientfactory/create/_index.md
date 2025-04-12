---
title: ICanvasRadialGradientFactory.Create
second_title: Aspose.SVG for .NET API Reference
description: ICanvasRadialGradientFactory Create method. Creates a radial gradient given by the coordinates of the two circles represented by the parameters
type: docs
weight: 10
url: /net/aspose.svg.dom.canvas/icanvasradialgradientfactory/create/
---
## ICanvasRadialGradientFactory.Create method

Creates a radial gradient given by the coordinates of the two circles represented by the parameters.

```csharp
public ICanvasGradient Create(double x0, double y0, double r0, double x1, double y1, double r1, 
    Func<string, Color> parseColor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x0 | Double | The x-axis coordinate of the start circle. |
| y0 | Double | The y-axis coordinate of the start circle. |
| r0 | Double | The radius of the start circle. |
| x1 | Double | The x-axis coordinate of the end circle. |
| y1 | Double | The y-axis coordinate of the end circle. |
| r1 | Double | The radius of the end circle. |
| parseColor | Func`2 | A function for parsing a color string into a System.Drawing.Color object. |

### Return Value

The created radial gradient.

### See Also

* interface [ICanvasGradient](../../icanvasgradient/)
* interface [ICanvasRadialGradientFactory](../)
* namespace [Aspose.Svg.Dom.Canvas](../../../aspose.svg.dom.canvas/)
* assembly [Aspose.SVG](../../../)
