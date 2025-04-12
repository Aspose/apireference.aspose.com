---
title: SVGBuilderExtensions.AddBuilder
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddBuilder method. Adds an existing SVG element builder to the current SVG element builder. This method is used to include a predefined SVG element builder into the current builder
type: docs
weight: 60
url: /net/aspose.svg.builder/svgbuilderextensions/addbuilder/
---
## SVGBuilderExtensions.AddBuilder&lt;TBuilder,TElementBuilder&gt; method

Adds an existing SVG element builder to the current SVG element builder. This method is used to include a predefined SVG element builder into the current builder.

```csharp
public static TBuilder AddBuilder<TBuilder, TElementBuilder>(this TBuilder builder, 
    TElementBuilder elementBuilder)
    where TBuilder : ISVGElementBuilder
    where TElementBuilder : ISVGElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| TElementBuilder | The type of the SVG element builder to be configured. TElementBuilder must implement ISVGElementBuilder. |
| builder | The SVG element builder to which the other element builder is added. |
| elementBuilder | The SVG element builder to be added. |

### Return Value

The original SVG element builder for method chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
