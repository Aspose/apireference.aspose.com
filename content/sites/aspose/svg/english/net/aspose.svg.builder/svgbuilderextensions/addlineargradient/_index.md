---
title: SVGBuilderExtensions.AddLinearGradient
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a linearGradient element configuration to the builder
type: docs
weight: 360
url: /net/aspose.svg.builder/svgbuilderextensions/addlineargradient/
---
## SVGBuilderExtensions.AddLinearGradient&lt;TBuilder&gt; method

Adds a 'linearGradient' element configuration to the builder.

```csharp
public static TBuilder AddLinearGradient<TBuilder>(this TBuilder builder, 
    Action<SVGLinearGradientElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IPaintServerElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'linearGradient' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGLinearGradientElementBuilder](../../svglineargradientelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPaintServerElementBuilder](../../ipaintserverelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
