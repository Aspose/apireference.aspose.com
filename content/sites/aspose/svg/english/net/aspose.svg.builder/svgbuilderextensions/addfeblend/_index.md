---
title: SVGBuilderExtensions.AddFeBlend
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feBlend element to the SVG builder specifying the blend mode and various other properties for the filter effect
type: docs
weight: 130
url: /net/aspose.svg.builder/svgbuilderextensions/addfeblend/
---
## AddFeBlend&lt;TBuilder&gt;(this TBuilder, BlendMode?, OneOf&lt;string, FilterInput&gt;, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGFEBlendElementBuilder&gt;) {#addfeblend_1}

Adds an 'feBlend' element to the SVG builder, specifying the blend mode and various other properties for the filter effect.

```csharp
public static TBuilder AddFeBlend<TBuilder>(this TBuilder builder, BlendMode? mode = default, 
    OneOf<string, FilterInput> @in = null, OneOf<string, FilterInput> in2 = null, 
    string result = null, OneOf<double, (double, LengthType)> x = null, 
    OneOf<double, (double, LengthType)> y = null, OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint> fill = null, 
    OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGFEBlendElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feBlend' element will be added. |
| mode | The blend mode to be used. Optional parameter. |
| in | The first input for the blend effect. Can be a string or a FilterInput. Optional parameter. |
| in2 | The second input for the blend effect. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the element. Optional parameter. |
| stroke | The stroke color or paint for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFEBlendElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* enum [BlendMode](../../blendmode/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGFEBlendElementBuilder](../../svgfeblendelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeBlend&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFEBlendElementBuilder&gt;) {#addfeblend}

Adds an 'feBlend' element configuration to the builder. This element defines a blend effect between two graphics.

```csharp
public static TBuilder AddFeBlend<TBuilder>(this TBuilder builder, 
    Action<SVGFEBlendElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feBlend' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEBlendElementBuilder](../../svgfeblendelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
