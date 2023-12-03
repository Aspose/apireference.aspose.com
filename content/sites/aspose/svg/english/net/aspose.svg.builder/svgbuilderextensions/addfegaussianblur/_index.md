---
title: SVGBuilderExtensions.AddFeGaussianBlur
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feGaussianBlur element configuration to the builder. This element applies a Gaussian blur to the input image
type: docs
weight: 220
url: /net/aspose.svg.builder/svgbuilderextensions/addfegaussianblur/
---
## SVGBuilderExtensions.AddFeGaussianBlur&lt;TBuilder&gt; method

Adds an 'feGaussianBlur' element configuration to the builder. This element applies a Gaussian blur to the input image.

```csharp
public static TBuilder AddFeGaussianBlur<TBuilder>(this TBuilder builder, 
    Action<SVGFEGaussianBlurElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feGaussianBlur' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEGaussianBlurElementBuilder](../../svgfegaussianblurelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
