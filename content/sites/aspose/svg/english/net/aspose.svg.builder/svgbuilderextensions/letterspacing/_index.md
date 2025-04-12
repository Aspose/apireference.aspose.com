---
title: SVGBuilderExtensions.LetterSpacing
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions LetterSpacing method. Sets the letter-spacing attribute for an SVG element using a numeric value and a specific length type
type: docs
weight: 1100
url: /net/aspose.svg.builder/svgbuilderextensions/letterspacing/
---
## LetterSpacing&lt;TBuilder&gt;(*this TBuilder, double, [LengthType](../../lengthtype/)*) {#letterspacing_1}

Sets the 'letter-spacing' attribute for an SVG element using a numeric value and a specific length type.

```csharp
public static TBuilder LetterSpacing<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The letter spacing value to set. |
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

## LetterSpacing&lt;TBuilder&gt;(*this TBuilder, [Spacing](../../spacing/)*) {#letterspacing}

Sets the 'letter-spacing' attribute for an SVG element using a predefined spacing value.

```csharp
public static TBuilder LetterSpacing<TBuilder>(this TBuilder builder, Spacing value)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The predefined spacing value to set. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Spacing](../../spacing/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
