---
title: SVGBuilderExtensions.GradientTransform
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions GradientTransform method. Sets the gradientTransform attribute for a gradient element
type: docs
weight: 980
url: /net/aspose.svg.builder/svgbuilderextensions/gradienttransform/
---
## SVGBuilderExtensions.GradientTransform<TBuilder> method

Sets the 'gradientTransform' attribute for a gradient element.

```csharp
public static TBuilder GradientTransform<TBuilder>(this TBuilder builder, 
    Func<TransformBuilder, TransformBuilder> configure)
    where TBuilder : ISVGElementBuilder, IGradientStopElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder to which the attribute is applied. |
| configure | A function to configure the SVG transform builder. |

### Return Value

The builder instance for chaining.

### See Also

* class [TransformBuilder](../../transformbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGradientStopElementBuilder](../../igradientstopelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
