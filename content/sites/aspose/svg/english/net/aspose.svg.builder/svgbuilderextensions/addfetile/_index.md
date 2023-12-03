---
title: SVGBuilderExtensions.AddFeTile
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feTile element configuration to the builder. This element fills a rectangle with the repeated tiled pattern of an input image
type: docs
weight: 280
url: /net/aspose.svg.builder/svgbuilderextensions/addfetile/
---
## SVGBuilderExtensions.AddFeTile&lt;TBuilder&gt; method

Adds an 'feTile' element configuration to the builder. This element fills a rectangle with the repeated, tiled pattern of an input image.

```csharp
public static TBuilder AddFeTile<TBuilder>(this TBuilder builder, 
    Action<SVGFETileElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feTile' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFETileElementBuilder](../../svgfetileelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
