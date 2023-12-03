---
title: SVGBuilderExtensions.WordSpacing
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the word-spacing attribute for an SVG element specifying the spacing behavior between words
type: docs
weight: 2340
url: /net/aspose.svg.builder/svgbuilderextensions/wordspacing/
---
## WordSpacing&lt;TBuilder&gt;(this TBuilder, Spacing) {#wordspacing}

Sets the 'word-spacing' attribute for an SVG element, specifying the spacing behavior between words.

```csharp
public static TBuilder WordSpacing<TBuilder>(this TBuilder builder, Spacing value)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The predefined word spacing value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Spacing](../../spacing/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## WordSpacing&lt;TBuilder&gt;(this TBuilder, double, LengthType) {#wordspacing_1}

Sets the 'word-spacing' attribute for an SVG element, specifying the spacing behavior between words with a custom value.

```csharp
public static TBuilder WordSpacing<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The word spacing value. |
| type | The unit type for the spacing value. |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
