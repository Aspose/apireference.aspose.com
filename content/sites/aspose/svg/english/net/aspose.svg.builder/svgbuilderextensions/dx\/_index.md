---
title: SVGBuilderExtensions.Dx
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Dx method. Sets the dx attribute to adjust the horizontal position of each character in the text
type: docs
weight: 770
url: /net/aspose.svg.builder/svgbuilderextensions/dx/
---
## Dx<TBuilder>(*this TBuilder, [LengthType](../../lengthtype/), params double[]*) {#dx}

Sets the 'dx' attribute to adjust the horizontal position of each character in the text.

```csharp
public static TBuilder Dx<TBuilder>(this TBuilder builder, LengthType type = LengthType.Px, 
    params double[] values)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| type | The type of length unit for the values. |
| values | The horizontal adjustment values for each character. |

### Return Value

The builder instance for chaining.

## Remarks

This method allows fine control over the horizontal spacing of characters in the text.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Dx<TBuilder>(*this TBuilder, double, [LengthType](../../lengthtype/)*) {#dx_1}

Sets a single horizontal adjustment value for the text content.

```csharp
public static TBuilder Dx<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The horizontal adjustment value. |
| type | The type of length unit for the value. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'dx' attribute with a single value, adjusting the horizontal position of the text content.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
