---
title: SVGBuilderExtensions.OnCopy
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the oncopy event attribute defining a script to run when content is copied from the SVG element
type: docs
weight: 1270
url: /net/aspose.svg.builder/svgbuilderextensions/oncopy/
---
## SVGBuilderExtensions.OnCopy&lt;TBuilder&gt; method

Sets the 'oncopy' event attribute, defining a script to run when content is copied from the SVG element.

```csharp
public static TBuilder OnCopy<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IDocumentElementEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute on the copy event. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../../idocumentelementeventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
