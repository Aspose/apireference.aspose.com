---
title: SVGBuilderExtensions.Stroke
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the stroke attribute for an SVG element using a custom paint configuration
type: docs
weight: 2080
url: /net/aspose.svg.builder/svgbuilderextensions/stroke/
---
## Stroke&lt;TBuilder&gt;(this TBuilder, Action&lt;PaintBuilder&gt;) {#stroke_1}

Sets the 'stroke' attribute for an SVG element using a custom paint configuration.

```csharp
public static TBuilder Stroke<TBuilder>(this TBuilder builder, Action<PaintBuilder> configure)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A delegate to configure the paint. |

### Return Value

The builder instance for chaining.

### See Also

* class [PaintBuilder](../../paintbuilder/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Stroke&lt;TBuilder&gt;(this TBuilder, Color) {#stroke_2}

Sets the 'stroke' attribute for an SVG element using a specific color.

```csharp
public static TBuilder Stroke<TBuilder>(this TBuilder builder, Color color)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| color | The color to use for the stroke. |

### Return Value

The builder instance for chaining.

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Stroke&lt;TBuilder&gt;(this TBuilder, Paint) {#stroke}

Sets the 'stroke' attribute for an SVG element using a predefined paint value.

```csharp
public static TBuilder Stroke<TBuilder>(this TBuilder builder, Paint paint)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| paint | The paint value to set. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Paint](../../paint/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
