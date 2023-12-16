---
title: SVGBuilderExtensions.AddFeTile
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feTile element to the SVG builder creating a pattern of tiles by replicating the input image
type: docs
weight: 280
url: /net/aspose.svg.builder/svgbuilderextensions/addfetile/
---
## AddFeTile&lt;TBuilder&gt;(this TBuilder, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGFETileElementBuilder&gt;) {#addfetile}

Adds an 'feTile' element to the SVG builder, creating a pattern of tiles by replicating the input image.

```csharp
public static TBuilder AddFeTile<TBuilder>(this TBuilder builder, 
    OneOf<string, FilterInput> @in = null, string result = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint> fill = null, 
    OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGFETileElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feTile' element will be added. |
| in | The input image to be replicated into tiles. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the element. Optional parameter. |
| stroke | The stroke color or paint for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFETileElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGFETileElementBuilder](../../svgfetileelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeTile&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFETileElementBuilder&gt;) {#addfetile_1}

Adds an 'feTile' element configuration to the builder. This element fills a rectangle with the repeated, tiled pattern of an input image.

```csharp
public static TBuilder AddFeTile<TBuilder>(this TBuilder builder, 
    Action<SVGFETileElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feTile' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFETileElementBuilder](../../svgfetileelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
