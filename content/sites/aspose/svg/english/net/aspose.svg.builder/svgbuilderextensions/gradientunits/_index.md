---
title: SVGBuilderExtensions.GradientUnits
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the gradientUnits attribute for a gradient element
type: docs
weight: 990
url: /net/aspose.svg.builder/svgbuilderextensions/gradientunits/
---
## SVGBuilderExtensions.GradientUnits&lt;TBuilder&gt; method

Sets the 'gradientUnits' attribute for a gradient element.

```csharp
public static TBuilder GradientUnits<TBuilder>(this TBuilder builder, CoordinateUnits units)
    where TBuilder : ISVGElementBuilder, IGradientStopElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder to which the attribute is applied. |
| units | The coordinate units for the gradient (userSpaceOnUse or objectBoundingBox). |

### Return Value

The builder instance for chaining.

### See Also

* enum [CoordinateUnits](../../coordinateunits/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGradientStopElementBuilder](../../igradientstopelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
