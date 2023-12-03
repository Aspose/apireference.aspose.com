---
title: SVGBuilderExtensions.AddFeOffset
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feOffset element configuration to the builder. This element offsets the input image by a specified vector
type: docs
weight: 260
url: /net/aspose.svg.builder/svgbuilderextensions/addfeoffset/
---
## SVGBuilderExtensions.AddFeOffset&lt;TBuilder&gt; method

Adds an 'feOffset' element configuration to the builder. This element offsets the input image by a specified vector.

```csharp
public static TBuilder AddFeOffset<TBuilder>(this TBuilder builder, 
    Action<SVGFEOffsetElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feOffset' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEOffsetElementBuilder](../../svgfeoffsetelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
