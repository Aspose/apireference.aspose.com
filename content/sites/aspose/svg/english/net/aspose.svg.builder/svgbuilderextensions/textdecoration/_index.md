---
title: SVGBuilderExtensions.TextDecoration
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the text-decoration attribute for an SVG element defining decorations that are added to the text
type: docs
weight: 2210
url: /net/aspose.svg.builder/svgbuilderextensions/textdecoration/
---
## SVGBuilderExtensions.TextDecoration&lt;TBuilder&gt; method

Sets the 'text-decoration' attribute for an SVG element, defining decorations that are added to the text.

```csharp
public static TBuilder TextDecoration<TBuilder>(this TBuilder builder, bool underline = false, 
    bool overline = false, bool lineThrough = false, bool blink = false)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| underline | Specifies if the text should be underlined. |
| overline | Specifies if the text should have an overline. |
| lineThrough | Specifies if the text should have a line through it. |
| blink | Specifies if the text should blink (not recommended for use). |

### Return Value

The builder instance for chaining.

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
