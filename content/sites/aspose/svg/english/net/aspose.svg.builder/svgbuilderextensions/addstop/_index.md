---
title: SVGBuilderExtensions.AddStop
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a stop element to the gradient in the SVG builder specifying color and opacity at a particular offset
type: docs
weight: 480
url: /net/aspose.svg.builder/svgbuilderextensions/addstop/
---
## AddStop&lt;TBuilder&gt;(this TBuilder, Color?, double?, OneOf&lt;double, (double, StopUnitType)&gt;, string, Action&lt;SVGStopElementBuilder&gt;) {#addstop_1}

Adds a 'stop' element to the gradient in the SVG builder, specifying color and opacity at a particular offset.

```csharp
public static TBuilder AddStop<TBuilder>(this TBuilder builder, Color? stopColor = default, 
    double? stopOpacity = null, OneOf<double, (double, StopUnitType)> offset = null, 
    string id = null, Action<SVGStopElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IGradientStopElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'stop' element will be added. |
| stopColor | The color at the stop. Optional parameter. |
| stopOpacity | The opacity at the stop. Optional parameter. |
| offset | The offset of the stop within the gradient. Can be a double or a ValueTuple with StopUnitType. Optional parameter. |
| id | The unique identifier for the stop element. Optional parameter. |
| extend | An optional action to further configure the stop element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [StopUnitType](../../stopunittype/)
* class [SVGStopElementBuilder](../../svgstopelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGradientStopElementBuilder](../../igradientstopelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddStop&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGStopElementBuilder&gt;) {#addstop}

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
