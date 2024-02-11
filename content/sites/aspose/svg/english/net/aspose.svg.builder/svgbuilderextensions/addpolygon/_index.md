---
title: SVGBuilderExtensions.AddPolygon
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a polygon element to the SVG builder specifying its vertices and styles
type: docs
weight: 420
url: /net/aspose.svg.builder/svgbuilderextensions/addpolygon/
---
## AddPolygon&lt;TBuilder&gt;(this TBuilder, double[], OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGPolygonElementBuilder&gt;) {#addpolygon}

Adds a 'polygon' element to the SVG builder, specifying its vertices, and styles.

```csharp
public static TBuilder AddPolygon<TBuilder>(this TBuilder builder, double[] points, 
    OneOf<Color, Paint, string> fill = null, OneOf<Color, Paint, string> stroke = null, 
    string id = null, Action<SVGPolygonElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'polygon' element will be added. |
| points | An array of doubles representing the points of the polygon (alternating x and y coordinates). |
| fill | The fill color or paint style for the polygon. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| stroke | The stroke color or paint style for the polygon. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| id | The unique identifier for the polygon element. Optional parameter. |
| extend | An optional action to further configure the polygon element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGPolygonElementBuilder](../../svgpolygonelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddPolygon&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGPolygonElementBuilder&gt;) {#addpolygon_1}

Adds a 'polygon' element configuration to the builder.

```csharp
public static TBuilder AddPolygon<TBuilder>(this TBuilder builder, 
    Action<SVGPolygonElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'polygon' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPolygonElementBuilder](../../svgpolygonelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
