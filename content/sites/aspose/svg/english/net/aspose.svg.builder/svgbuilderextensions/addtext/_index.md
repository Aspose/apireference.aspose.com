---
title: SVGBuilderExtensions.AddText
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a text element configuration to the builder
type: docs
weight: 530
url: /net/aspose.svg.builder/svgbuilderextensions/addtext/
---
## SVGBuilderExtensions.AddText&lt;TBuilder&gt; method

Adds a 'text' element configuration to the builder.

```csharp
public static TBuilder AddText<TBuilder>(this TBuilder builder, 
    Action<SVGTextElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'text' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGTextElementBuilder](../../svgtextelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
