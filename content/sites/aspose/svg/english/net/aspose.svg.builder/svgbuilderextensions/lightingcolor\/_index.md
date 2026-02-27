---
title: SVGBuilderExtensions.LightingColor
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions LightingColor method. Sets the lighting-color attribute for an SVG element using a specified color value
type: docs
weight: 1110
url: /net/aspose.svg.builder/svgbuilderextensions/lightingcolor/
---
## LightingColor<TBuilder>(*this TBuilder, Color*) {#lightingcolor_1}

Sets the 'lighting-color' attribute for an SVG element using a specified color value.

```csharp
public static TBuilder LightingColor<TBuilder>(this TBuilder builder, Color colorValue)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| colorValue | The color value to set for the lighting effect. |

### Return Value

The builder instance for chaining.

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## LightingColor<TBuilder>(*this TBuilder, Action&lt;ColorBuilder&gt;*) {#lightingcolor}

Sets the 'lighting-color' attribute for an SVG element using a custom color configuration.

```csharp
public static TBuilder LightingColor<TBuilder>(this TBuilder builder, 
    Action<ColorBuilder> configure)
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
