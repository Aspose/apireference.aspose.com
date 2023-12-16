---
title: SVGBuilderExtensions.AddEllipse
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an ellipse element to the SVG builder specifying its center radii and styles
type: docs
weight: 120
url: /net/aspose.svg.builder/svgbuilderextensions/addellipse/
---
## AddEllipse&lt;TBuilder&gt;(this TBuilder, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGEllipseElementBuilder&gt;) {#addellipse}

Adds an 'ellipse' element to the SVG builder, specifying its center, radii, and styles.

```csharp
public static TBuilder AddEllipse<TBuilder>(this TBuilder builder, 
    OneOf<double, (double, LengthType)> cx = null, OneOf<double, (double, LengthType)> cy = null, 
    OneOf<double, (double, LengthType)> rx = null, OneOf<double, (double, LengthType)> ry = null, 
    OneOf<Color, Paint> fill = null, OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGEllipseElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'ellipse' element will be added. |
| cx | The x-coordinate of the center of the ellipse. Can be a double value or a tuple of double and LengthType. |
| cy | The y-coordinate of the center of the ellipse. Can be a double value or a tuple of double and LengthType. |
| rx | The x-radius of the ellipse. Can be a double value or a tuple of double and LengthType. |
| ry | The y-radius of the ellipse. Can be a double value or a tuple of double and LengthType. |
| fill | The fill color or paint style for the ellipse. Can be a Color or a Paint enum value. Optional parameter. |
| stroke | The stroke color or paint style for the ellipse. Can be a Color or a Paint enum value. Optional parameter. |
| id | The unique identifier for the ellipse element. Optional parameter. |
| extend | An optional action to further configure the ellipse element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGEllipseElementBuilder](../../svgellipseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddEllipse&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGEllipseElementBuilder&gt;) {#addellipse_1}

Adds an 'ellipse' element configuration to the builder.

```csharp
public static TBuilder AddEllipse<TBuilder>(this TBuilder builder, 
    Action<SVGEllipseElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'ellipse' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGEllipseElementBuilder](../../svgellipseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
