---
title: SVGBuilderExtensions.AddFeMorphology
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feMorphology element configuration to the builder. This element is used to apply morphological operations like dilation or erosion on the input image
type: docs
weight: 250
url: /net/aspose.svg.builder/svgbuilderextensions/addfemorphology/
---
## SVGBuilderExtensions.AddFeMorphology&lt;TBuilder&gt; method

Adds an 'feMorphology' element configuration to the builder. This element is used to apply morphological operations like dilation or erosion on the input image.

```csharp
public static TBuilder AddFeMorphology<TBuilder>(this TBuilder builder, 
    Action<SVGFEMorphologyElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feMorphology' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEMorphologyElementBuilder](../../svgfemorphologyelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
