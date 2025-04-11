---
title: SVGBuilderExtensions.Color
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Color method. Sets the color attribute for an SVG element using a custom configuration
type: docs
weight: 670
url: /net/aspose.svg.builder/svgbuilderextensions/color/
---
## Color&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;ColorBuilder&amp;gt;*) {#color}

Sets the 'color' attribute for an SVG element using a custom configuration.

```csharp
public static TBuilder Color<TBuilder>(this TBuilder builder, Action<ColorBuilder> configure)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | A delegate to configure the color. |

### Return Value

The builder instance for chaining.

### See Also

* class [ColorBuilder](../../colorbuilder/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Color&lt;TBuilder&gt;(*this TBuilder, Color*) {#color_1}

Sets the 'color' attribute for an SVG element using a color value.

```csharp
public static TBuilder Color<TBuilder>(this TBuilder builder, Color colorValue)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| colorValue | The color value to set. |

### Return Value

The builder instance for chaining.

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
