---
title: SVGBuilderExtensions.OnProgress
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions OnProgress method. Sets the onprogress event attribute for handling events to indicate the progress of an ongoing process
type: docs
weight: 1680
url: /net/aspose.svg.builder/svgbuilderextensions/onprogress/
---
## SVGBuilderExtensions.OnProgress&lt;TBuilder&gt; method

Sets the 'onprogress' event attribute for handling events to indicate the progress of an ongoing process.

```csharp
public static TBuilder OnProgress<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IGlobalEventAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The JavaScript function or script to execute to indicate the progress of an ongoing process. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IGlobalEventAttributeSetter](../../iglobaleventattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
