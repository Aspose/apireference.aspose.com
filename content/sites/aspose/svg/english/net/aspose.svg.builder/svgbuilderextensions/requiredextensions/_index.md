---
title: SVGBuilderExtensions.RequiredExtensions
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions RequiredExtensions method. Sets the requiredExtensions attribute on the SVG element. This attribute specifies which extensions are required for the SVG document fragment to be processed
type: docs
weight: 1970
url: /net/aspose.svg.builder/svgbuilderextensions/requiredextensions/
---
## SVGBuilderExtensions.RequiredExtensions&lt;TBuilder&gt; method

Sets the 'requiredExtensions' attribute on the SVG element. This attribute specifies which extensions are required for the SVG document fragment to be processed.

```csharp
public static TBuilder RequiredExtensions<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IConditionalProcessingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder on which the attribute is set. |
| value | A string value representing the required extensions. |

### Return Value

The original SVG element builder for method chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IConditionalProcessingAttributeSetter](../../iconditionalprocessingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
