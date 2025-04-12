---
title: SVGBuilderExtensions.AddLine
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddLine method. Adds a line element with specified start and end points and styles to the SVG builder
type: docs
weight: 350
url: /net/aspose.svg.builder/svgbuilderextensions/addline/
---
## AddLine&lt;TBuilder&gt;(*this TBuilder, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, string, Action&amp;lt;SVGLineElementBuilder&amp;gt;*) {#addline}

Adds a 'line' element with specified start and end points, and styles to the SVG builder.

```csharp
public static TBuilder AddLine<TBuilder>(this TBuilder builder, 
    OneOf<double, (double, LengthType)> x1 = null, OneOf<double, (double, LengthType)> y1 = null, 
    OneOf<double, (double, LengthType)> x2 = null, OneOf<double, (double, LengthType)> y2 = null, 
    OneOf<Color, Paint, string> fill = null, OneOf<Color, Paint, string> stroke = null, 
    string id = null, Action<SVGLineElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'line' element will be added. |
| x1 | The x-coordinate of the start point of the line. Can be a double value or a tuple of double and LengthType. |
| y1 | The y-coordinate of the start point of the line. Can be a double value or a tuple of double and LengthType. |
| x2 | The x-coordinate of the end point of the line. Can be a double value or a tuple of double and LengthType. |
| y2 | The y-coordinate of the end point of the line. Can be a double value or a tuple of double and LengthType. |
| fill | The fill color or paint style for the line. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| stroke | The stroke color or paint style for the line. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| id | The unique identifier for the line element. Optional parameter. |
| extend | An optional action to further configure the line element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGLineElementBuilder](../../svglineelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddLine&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGLineElementBuilder&amp;gt;*) {#addline_1}

Adds a 'line' element configuration to the builder.

```csharp
public static TBuilder AddLine<TBuilder>(this TBuilder builder, 
    Action<SVGLineElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'line' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGLineElementBuilder](../../svglineelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
