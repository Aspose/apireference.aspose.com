---
title: SVGBuilderExtensions.AddA
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddA method. Adds an a hyperlink element configuration to the builder
type: docs
weight: 20
url: /net/aspose.svg.builder/svgbuilderextensions/adda/
---
## SVGBuilderExtensions.AddA&lt;TBuilder&gt; method

Adds an 'a' (hyperlink) element configuration to the builder.

```csharp
public static TBuilder AddA<TBuilder>(this TBuilder builder, Action<SVGAElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'a' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGAElementBuilder](../../svgaelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
