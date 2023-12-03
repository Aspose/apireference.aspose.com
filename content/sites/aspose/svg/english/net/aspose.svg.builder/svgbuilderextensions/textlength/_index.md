---
title: SVGBuilderExtensions.TextLength
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the exact length of the text content
type: docs
weight: 2220
url: /net/aspose.svg.builder/svgbuilderextensions/textlength/
---
## SVGBuilderExtensions.TextLength&lt;TBuilder&gt; method

Sets the exact length of the text content.

```csharp
public static TBuilder TextLength<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The length of the text. |
| type | The type of length unit for the value. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'textLength' attribute, specifying the desired length of the text content, potentially overriding the natural text length.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
