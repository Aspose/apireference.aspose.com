---
title: SVGBuilderExtensions.AddFilter
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddFilter method. Adds a filter element to the SVG builder defining a filter effect that can be applied to SVG elements
type: docs
weight: 300
url: /net/aspose.svg.builder/svgbuilderextensions/addfilter/
---
## AddFilter&lt;TBuilder&gt;(*this TBuilder, CoordinateUnits?, CoordinateUnits?, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, string, Action&amp;lt;SVGFilterElementBuilder&amp;gt;*) {#addfilter_1}

Adds a 'filter' element to the SVG builder, defining a filter effect that can be applied to SVG elements.

```csharp
public static TBuilder AddFilter<TBuilder>(this TBuilder builder, 
    CoordinateUnits? filterUnits = default, CoordinateUnits? primitiveUnits = default, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFilterElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'filter' element will be added. |
| filterUnits | Specifies the coordinate system for the filter's x, y, width, and height attributes. Optional parameter. |
| primitiveUnits | Specifies the coordinate system for the attributes of the filter's child elements. Optional parameter. |
| x | The x-coordinate of the filter region. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter region. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter region. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter region. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the filter element. Optional parameter. |
| stroke | The stroke color or paint for the filter element. Optional parameter. |
| id | The unique identifier for the filter element. Optional parameter. |
| extend | An optional action to further configure the SVGFilterElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* enum [CoordinateUnits](../../coordinateunits/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFilterElementBuilder](../../svgfilterelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFilter&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGFilterElementBuilder&amp;gt;*) {#addfilter}

Adds a 'filter' element configuration to the builder.

```csharp
public static TBuilder AddFilter<TBuilder>(this TBuilder builder, 
    Action<SVGFilterElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'filter' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFilterElementBuilder](../../svgfilterelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
