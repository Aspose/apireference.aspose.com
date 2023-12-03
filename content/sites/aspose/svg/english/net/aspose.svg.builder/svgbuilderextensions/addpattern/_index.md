---
title: SVGBuilderExtensions.AddPattern
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a pattern element configuration to the builder
type: docs
weight: 410
url: /net/aspose.svg.builder/svgbuilderextensions/addpattern/
---
## SVGBuilderExtensions.AddPattern&lt;TBuilder&gt; method

Adds a 'pattern' element configuration to the builder.

```csharp
public static TBuilder AddPattern<TBuilder>(this TBuilder builder, 
    Action<SVGPatternElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IPaintServerElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'pattern' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPatternElementBuilder](../../svgpatternelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPaintServerElementBuilder](../../ipaintserverelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
