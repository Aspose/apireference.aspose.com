---
title: SVGBuilderExtensions.AddFeColorMatrix
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feColorMatrix element configuration to the builder. This element applies a matrix transformation to the color and alpha values of every pixel
type: docs
weight: 140
url: /net/aspose.svg.builder/svgbuilderextensions/addfecolormatrix/
---
## SVGBuilderExtensions.AddFeColorMatrix&lt;TBuilder&gt; method

Adds an 'feColorMatrix' element configuration to the builder. This element applies a matrix transformation to the color and alpha values of every pixel.

```csharp
public static TBuilder AddFeColorMatrix<TBuilder>(this TBuilder builder, 
    Action<SVGFEColorMatrixElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feColorMatrix' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEColorMatrixElementBuilder](../../svgfecolormatrixelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
