---
title: SVGBuilderExtensions.AddContent
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddContent method. Adds text content to the SVG element
type: docs
weight: 90
url: /net/aspose.svg.builder/svgbuilderextensions/addcontent/
---
## SVGBuilderExtensions.AddContent<TBuilder> method

Adds text content to the SVG element.

```csharp
public static TBuilder AddContent<TBuilder>(this TBuilder builder, string text)
    where TBuilder : ISVGElementBuilder, ITextContentSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| text | The text to be added to the element. |

### Return Value

The builder instance for chaining.

## Remarks

This method allows adding text content directly to an SVG element. It's useful for elements that contain textual data.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITextContentSetter](../../itextcontentsetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
