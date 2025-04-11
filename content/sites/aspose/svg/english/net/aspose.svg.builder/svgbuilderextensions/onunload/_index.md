---
title: SVGBuilderExtensions.OnUnload
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnUnload method. Sets the onunload event attribute defining a script to run when the SVG document is unloaded
type: docs
weight: 1830
url: /net/aspose.svg.builder/svgbuilderextensions/onunload/
---
## SVGBuilderExtensions.OnUnload&lt;TBuilder&gt; method

Sets the 'onunload' event attribute, defining a script to run when the SVG document is unloaded.

```csharp
public static TBuilder OnUnload<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IDocumentEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when the document is unloaded. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDocumentEventAttributeSetter](../../idocumenteventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
