---
title: SVGBuilderExtensions.AddFeBlend
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feBlend element configuration to the builder. This element defines a blend effect between two graphics
type: docs
weight: 130
url: /net/aspose.svg.builder/svgbuilderextensions/addfeblend/
---
## SVGBuilderExtensions.AddFeBlend&lt;TBuilder&gt; method

Adds an 'feBlend' element configuration to the builder. This element defines a blend effect between two graphics.

```csharp
public static TBuilder AddFeBlend<TBuilder>(this TBuilder builder, 
    Action<SVGFEBlendElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feBlend' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEBlendElementBuilder](../../svgfeblendelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
