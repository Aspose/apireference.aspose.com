---
title: SVGBuilderExtensions.AddStop
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a stop element configuration to the builder for defining gradient stops
type: docs
weight: 480
url: /net/aspose.svg.builder/svgbuilderextensions/addstop/
---
## SVGBuilderExtensions.AddStop&lt;TBuilder&gt; method

Adds a 'stop' element configuration to the builder for defining gradient stops.

```csharp
public static TBuilder AddStop<TBuilder>(this TBuilder builder, 
    Action<SVGStopElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IGradientStopElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'stop' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGStopElementBuilder](../../svgstopelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGradientStopElementBuilder](../../igradientstopelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
