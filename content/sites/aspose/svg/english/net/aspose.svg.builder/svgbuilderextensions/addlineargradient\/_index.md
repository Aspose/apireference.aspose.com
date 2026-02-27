---
title: SVGBuilderExtensions.AddLinearGradient
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddLinearGradient method. Adds a linearGradient element configuration to the builder
type: docs
weight: 360
url: /net/aspose.svg.builder/svgbuilderextensions/addlineargradient/
---
## AddLinearGradient<TBuilder>(*this TBuilder, Action&lt;SVGLinearGradientElementBuilder&gt;*) {#addlineargradient_1}

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

---

## AddLinearGradient<TBuilder>(*this TBuilder, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, CoordinateUnits?, SpreadMethod?, string, string, Action&lt;SVGLinearGradientElementBuilder&gt;*) {#addlineargradient}

Adds a 'linearGradient' element to the SVG builder, specifying its start and end positions, along with other gradient properties.

```csharp
public static TBuilder AddLinearGradient<TBuilder>(this TBuilder builder, 
    OneOf<double, (double, LengthType)> x1, OneOf<double, (double, LengthType)> y1, 
    OneOf<double, (double, LengthType)> x2, OneOf<double, (double, LengthType)> y2, 
    CoordinateUnits? gradientUnits, SpreadMethod? spreadMethod, string href = null, 
    string id = null, Action<SVGLinearGradientElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'linearGradient' element will be added. |
| x1 | The starting x-coordinate for the gradient. Can be a double or a ValueTuple with LengthType. |
| y1 | The starting y-coordinate for the gradient. Can be a double or a ValueTuple with LengthType. |
| x2 | The ending x-coordinate for the gradient. Can be a double or a ValueTuple with LengthType. |
| y2 | The ending y-coordinate for the gradient. Can be a double or a ValueTuple with LengthType. |
| gradientUnits | Specifies the coordinate system for the gradient. Optional parameter. |
| spreadMethod | Defines how the gradient spreads beyond its start and end points. Optional parameter. |
| href | The reference to another gradient, if applicable. Optional parameter. |
| id | The unique identifier for the gradient element. Optional parameter. |
| extend | An optional action to further configure the linear gradient element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* enum [CoordinateUnits](../../coordinateunits/)
* enum [SpreadMethod](../../spreadmethod/)
* class [SVGLinearGradientElementBuilder](../../svglineargradientelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
