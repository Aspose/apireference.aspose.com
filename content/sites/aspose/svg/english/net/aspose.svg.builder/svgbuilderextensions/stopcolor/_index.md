---
title: SVGBuilderExtensions.StopColor
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the stop-color attribute for an SVG element defining the color at a gradient stop
type: docs
weight: 2060
url: /net/aspose.svg.builder/svgbuilderextensions/stopcolor/
---
## StopColor&lt;TBuilder&gt;(this TBuilder, Color) {#stopcolor_1}

Sets the 'stop-color' attribute for an SVG element, defining the color at a gradient stop.

```csharp
public static TBuilder StopColor<TBuilder>(this TBuilder builder, Color colorValue)
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

---

## StopColor&lt;TBuilder&gt;(this TBuilder, Action&lt;ColorBuilder&gt;) {#stopcolor}

Sets the 'stop-color' attribute for an SVG element using a custom color configuration.

```csharp
public static TBuilder StopColor<TBuilder>(this TBuilder builder, Action<ColorBuilder> configure)
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
