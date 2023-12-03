---
title: SVGBuilderExtensions.FontSize
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the font-size attribute for an SVG element using a numeric value and a specific length type
type: docs
weight: 890
url: /net/aspose.svg.builder/svgbuilderextensions/fontsize/
---
## FontSize&lt;TBuilder&gt;(this TBuilder, double, LengthType) {#fontsize_1}

Sets the 'font-size' attribute for an SVG element using a numeric value and a specific length type.

```csharp
public static TBuilder FontSize<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The font size value to set. |
| type | The length type (e.g., px, em). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## FontSize&lt;TBuilder&gt;(this TBuilder, FontSize) {#fontsize}

Sets the 'font-size' attribute for an SVG element using a predefined font size value.

```csharp
public static TBuilder FontSize<TBuilder>(this TBuilder builder, FontSize value)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The predefined font size value to set. |

### Return Value

The builder instance for chaining.

### See Also

* enum [FontSize](../../fontsize/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
