---
title: SVGBuilderExtensions.Points
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the points attribute for an SVG element using an array of doubles
type: docs
weight: 1910
url: /net/aspose.svg.builder/svgbuilderextensions/points/
---
## Points&lt;TBuilder&gt;(this TBuilder, params double[]) {#points}

Sets the 'points' attribute for an SVG element using an array of doubles.

```csharp
public static TBuilder Points<TBuilder>(this TBuilder builder, params double[] points)
    where TBuilder : ISVGElementBuilder, IPointsAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| points | An array of doubles representing the points (must be an even number). |

### Return Value

The builder instance for chaining.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Thrown if an odd number of points are provided. |

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPointsAttributeSetter](../../ipointsattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Points&lt;TBuilder&gt;(this TBuilder, params PointF[]) {#points_1}

Sets the 'points' attribute for an SVG element using an array of PointF objects.

```csharp
public static TBuilder Points<TBuilder>(this TBuilder builder, params PointF[] points)
    where TBuilder : ISVGElementBuilder, IPointsAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| points | An array of PointF objects representing the points. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPointsAttributeSetter](../../ipointsattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
