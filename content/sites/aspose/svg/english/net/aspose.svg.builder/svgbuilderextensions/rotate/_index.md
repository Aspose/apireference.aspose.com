---
title: SVGBuilderExtensions.Rotate
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets rotation angles for individual characters or segments of the text content
type: docs
weight: 2000
url: /net/aspose.svg.builder/svgbuilderextensions/rotate/
---
## Rotate&lt;TBuilder&gt;(this TBuilder, params double[]) {#rotate_1}

Sets rotation angles for individual characters or segments of the text content.

```csharp
public static TBuilder Rotate<TBuilder>(this TBuilder builder, params double[] values)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| values | An array of rotation angles in degrees. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'rotate' attribute with multiple values, allowing for individual rotation of each character or text segment.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Rotate&lt;TBuilder&gt;(this TBuilder, double) {#rotate}

Sets a single rotation angle for the entire text content.

```csharp
public static TBuilder Rotate<TBuilder>(this TBuilder builder, double value)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The rotation angle in degrees. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'rotate' attribute with a single value, applying the same rotation angle to all text content.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
