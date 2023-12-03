---
title: SVGBuilderExtensions.AddFeDiffuseLighting
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feDiffuseLighting element configuration to the builder. This element provides a lighting effect on an image
type: docs
weight: 180
url: /net/aspose.svg.builder/svgbuilderextensions/addfediffuselighting/
---
## SVGBuilderExtensions.AddFeDiffuseLighting&lt;TBuilder&gt; method

Adds an 'feDiffuseLighting' element configuration to the builder. This element provides a lighting effect on an image.

```csharp
public static TBuilder AddFeDiffuseLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEDiffuseLightingElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feDiffuseLighting' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEDiffuseLightingElementBuilder](../../svgfediffuselightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
