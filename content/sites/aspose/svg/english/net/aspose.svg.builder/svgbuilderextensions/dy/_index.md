---
title: SVGBuilderExtensions.Dy
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets multiple vertical adjustment values for the text content
type: docs
weight: 780
url: /net/aspose.svg.builder/svgbuilderextensions/dy/
---
## Dy&lt;TBuilder&gt;(this TBuilder, double[], LengthType) {#dy_1}

Sets multiple vertical adjustment values for the text content.

```csharp
public static TBuilder Dy<TBuilder>(this TBuilder builder, double[] values, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| values | The array of vertical adjustment values. |
| type | The type of length unit for the values. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'dy' attribute with multiple values, allowing for individual vertical adjustments for each character or text segment.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Dy&lt;TBuilder&gt;(this TBuilder, double, LengthType) {#dy}

Sets a single vertical adjustment value for the text content.

```csharp
public static TBuilder Dy<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The vertical adjustment value. |
| type | The type of length unit for the value. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'dy' attribute with a single value, adjusting the vertical position of the text content.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
