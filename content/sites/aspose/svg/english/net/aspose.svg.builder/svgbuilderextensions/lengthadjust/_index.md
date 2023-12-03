---
title: SVGBuilderExtensions.LengthAdjust
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the method of length adjustment for the text content
type: docs
weight: 1090
url: /net/aspose.svg.builder/svgbuilderextensions/lengthadjust/
---
## SVGBuilderExtensions.LengthAdjust&lt;TBuilder&gt; method

Sets the method of length adjustment for the text content.

```csharp
public static TBuilder LengthAdjust<TBuilder>(this TBuilder builder, LengthAdjust value)
    where TBuilder : ISVGElementBuilder, ITextContentPositioningAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The length adjustment method. |

### Return Value

The builder instance for chaining.

## Remarks

This method sets the 'lengthAdjust' attribute, determining how text length is adjusted, either by spacing or by scaling.

### See Also

* enum [LengthAdjust](../../lengthadjust/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentPositioningAttributeSetter](../../itextcontentpositioningattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
