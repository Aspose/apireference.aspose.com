---
title: ICanvasLinearGradientFactory.Create
second_title: Aspose.SVG for .NET API Reference
description: ICanvasLinearGradientFactory Create method. Creates a linear gradient along the line given by the coordinates represented by the parameters
type: docs
weight: 10
url: /net/aspose.svg.dom.canvas/icanvaslineargradientfactory/create/
---
## ICanvasLinearGradientFactory.Create method

Creates a linear gradient along the line given by the coordinates represented by the parameters.

```csharp
public ICanvasGradient Create(double x0, double y0, double x1, double y1, 
    Func<string, Color> parseColor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x0 | Double | The x axis of the coordinate of the start point. |
| y0 | Double | The y axis of the coordinate of the start point. |
| x1 | Double | The x axis of the coordinate of the end point. |
| y1 | Double | The y axis of the coordinate of the end point. |
| parseColor | Func`2 | A function for parsing a color string into a System.Drawing.Color object. |

### Return Value

The created linear gradient.

### See Also

* interface [ICanvasGradient](../../icanvasgradient/)
* interface [ICanvasLinearGradientFactory](../)
* namespace [Aspose.Svg.Dom.Canvas](../../../aspose.svg.dom.canvas/)
* assembly [Aspose.SVG](../../../)
