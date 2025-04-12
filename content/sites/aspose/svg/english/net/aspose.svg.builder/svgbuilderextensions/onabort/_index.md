---
title: SVGBuilderExtensions.OnAbort
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnAbort method. Sets the onabort event attribute defining a script to run when the loading of an SVG document is aborted
type: docs
weight: 1190
url: /net/aspose.svg.builder/svgbuilderextensions/onabort/
---
## SVGBuilderExtensions.OnAbort&lt;TBuilder&gt; method

Sets the 'onabort' event attribute, defining a script to run when the loading of an SVG document is aborted.

```csharp
public static TBuilder OnAbort<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IDocumentEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute when the document loading is aborted. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDocumentEventAttributeSetter](../../idocumenteventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
