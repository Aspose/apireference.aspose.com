---
title: SVGBuilderExtensions.ViewBox
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions ViewBox method. Sets the viewBox attribute for an SVG element
type: docs
weight: 2300
url: /net/aspose.svg.builder/svgbuilderextensions/viewbox/
---
## SVGBuilderExtensions.ViewBox&lt;TBuilder&gt; method

Sets the 'viewBox' attribute for an SVG element.

```csharp
public static TBuilder ViewBox<TBuilder>(this TBuilder builder, double minX, double minY, 
    double width, double height)
    where TBuilder : ISVGElementBuilder, IViewBoxAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| minX | The minimum X coordinate of the viewBox. |
| minY | The minimum Y coordinate of the viewBox. |
| width | The width of the viewBox. |
| height | The height of the viewBox. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IViewBoxAttributeSetter](../../iviewboxattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
