---
title: SVGBuilderExtensions.AddFeImage
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feImage element configuration to the builder. This element fetches an external image and includes it in the filter pipeline
type: docs
weight: 230
url: /net/aspose.svg.builder/svgbuilderextensions/addfeimage/
---
## SVGBuilderExtensions.AddFeImage&lt;TBuilder&gt; method

Adds an 'feImage' element configuration to the builder. This element fetches an external image and includes it in the filter pipeline.

```csharp
public static TBuilder AddFeImage<TBuilder>(this TBuilder builder, 
    Action<SVGFEImageElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feImage' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEImageElementBuilder](../../svgfeimageelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
