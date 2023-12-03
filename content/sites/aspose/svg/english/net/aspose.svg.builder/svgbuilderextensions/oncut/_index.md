---
title: SVGBuilderExtensions.OnCut
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the oncut event attribute defining a script to run when content is cut from the SVG element
type: docs
weight: 1290
url: /net/aspose.svg.builder/svgbuilderextensions/oncut/
---
## SVGBuilderExtensions.OnCut&lt;TBuilder&gt; method

Sets the 'oncut' event attribute, defining a script to run when content is cut from the SVG element.

```csharp
public static TBuilder OnCut<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IDocumentElementEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute on the cut event. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IDocumentElementEventAttributeSetter](../../idocumentelementeventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
