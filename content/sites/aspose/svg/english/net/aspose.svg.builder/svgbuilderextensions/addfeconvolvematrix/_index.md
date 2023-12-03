---
title: SVGBuilderExtensions.AddFeConvolveMatrix
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feConvolveMatrix element configuration to the builder. This element applies a matrix convolution filter effect
type: docs
weight: 170
url: /net/aspose.svg.builder/svgbuilderextensions/addfeconvolvematrix/
---
## SVGBuilderExtensions.AddFeConvolveMatrix&lt;TBuilder&gt; method

Adds an 'feConvolveMatrix' element configuration to the builder. This element applies a matrix convolution filter effect.

```csharp
public static TBuilder AddFeConvolveMatrix<TBuilder>(this TBuilder builder, 
    Action<SVGFEConvolveMatrixElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feConvolveMatrix' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEConvolveMatrixElementBuilder](../../svgfeconvolvematrixelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
