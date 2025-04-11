---
title: SVGBuilderExtensions.AddRadialGradient
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddRadialGradient method. Adds a radialGradient element to the SVG builder specifying its center radius and focal points along with other gradient properties
type: docs
weight: 440
url: /net/aspose.svg.builder/svgbuilderextensions/addradialgradient/
---
## AddRadialGradient&lt;TBuilder&gt;(*this TBuilder, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, CoordinateUnits?, SpreadMethod?, string, string, Action&amp;lt;SVGRadialGradientElementBuilder&amp;gt;*) {#addradialgradient}

Adds a 'radialGradient' element to the SVG builder, specifying its center, radius, and focal points, along with other gradient properties.

```csharp
public static TBuilder AddRadialGradient<TBuilder>(this TBuilder builder, 
    OneOf<double, (double, LengthType)> cx = null, OneOf<double, (double, LengthType)> cy = null, 
    OneOf<double, (double, LengthType)> r = null, OneOf<double, (double, LengthType)> fx = null, 
    OneOf<double, (double, LengthType)> fy = null, CoordinateUnits? gradientUnits = default, 
    SpreadMethod? spreadMethod = default, string href = null, string id = null, 
    Action<SVGRadialGradientElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'radialGradient' element will be added. |
| cx | The x-coordinate of the center of the gradient. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| cy | The y-coordinate of the center of the gradient. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| r | The radius of the gradient. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fx | The x-coordinate of the focal point of the gradient. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fy | The y-coordinate of the focal point of the gradient. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| gradientUnits | Specifies the coordinate system for the gradient. Optional parameter. |
| spreadMethod | Defines how the gradient spreads beyond its start and end points. Optional parameter. |
| href | The reference to another gradient, if applicable. Optional parameter. |
| id | The unique identifier for the gradient element. Optional parameter. |
| extend | An optional action to further configure the radial gradient element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* enum [CoordinateUnits](../../coordinateunits/)
* enum [SpreadMethod](../../spreadmethod/)
* class [SVGRadialGradientElementBuilder](../../svgradialgradientelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddRadialGradient&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGRadialGradientElementBuilder&amp;gt;*) {#addradialgradient_1}

Adds a 'radialGradient' element configuration to the builder.

```csharp
public static TBuilder AddRadialGradient<TBuilder>(this TBuilder builder, 
    Action<SVGRadialGradientElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IPaintServerElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'radialGradient' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGRadialGradientElementBuilder](../../svgradialgradientelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPaintServerElementBuilder](../../ipaintserverelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
