---
title: SVGBuilderExtensions.AddFeTurbulence
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddFeTurbulence method. Adds an feTurbulence element to the SVG builder creating a turbulence effect such as clouds or marble using Perlin noise
type: docs
weight: 290
url: /net/aspose.svg.builder/svgbuilderextensions/addfeturbulence/
---
## AddFeTurbulence&lt;TBuilder&gt;(*this TBuilder, OneOf&amp;lt;double, (double, double)&amp;gt;, int?, double?, StitchTiles?, TurbulenceType?, OneOf&amp;lt;string, FilterInput&amp;gt;, string, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, string, Action&amp;lt;SVGFETurbulenceElementBuilder&amp;gt;*) {#addfeturbulence}

Adds an 'feTurbulence' element to the SVG builder, creating a turbulence effect, such as clouds or marble, using Perlin noise.

```csharp
public static TBuilder AddFeTurbulence<TBuilder>(this TBuilder builder, 
    OneOf<double, (double, double)> baseFrequency = null, int? numOctaves = null, 
    double? seed = null, StitchTiles? stitchTiles = default, TurbulenceType? type = default, 
    OneOf<string, FilterInput> @in = null, string result = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFETurbulenceElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feTurbulence' element will be added. |
| baseFrequency | The base frequency of the turbulence. Can be a double or a ValueTuple of two doubles. Optional parameter. |
| numOctaves | The number of octaves for the turbulence. Optional parameter. |
| seed | The seed number for the random number generator. Optional parameter. |
| stitchTiles | Indicates whether the tiles are stitched together. Optional parameter. |
| type | The type of turbulence (fractal noise or turbulence). Optional parameter. |
| in | The input image to which the turbulence effect will be applied. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFETurbulenceElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [StitchTiles](../../stitchtiles/)
* enum [TurbulenceType](../../turbulencetype/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFETurbulenceElementBuilder](../../svgfeturbulenceelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeTurbulence&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGFETurbulenceElementBuilder&amp;gt;*) {#addfeturbulence_1}

Adds an 'feTurbulence' element configuration to the builder. This element creates an image using Perlin noise, useful for creating textures like clouds or marble.

```csharp
public static TBuilder AddFeTurbulence<TBuilder>(this TBuilder builder, 
    Action<SVGFETurbulenceElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feTurbulence' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFETurbulenceElementBuilder](../../svgfeturbulenceelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
