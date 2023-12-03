---
title: SVGBuilderExtensions.AddFeComponentTransfer
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feComponentTransfer element configuration to the builder. This element performs component-wise remapping of data for color channels
type: docs
weight: 150
url: /net/aspose.svg.builder/svgbuilderextensions/addfecomponenttransfer/
---
## SVGBuilderExtensions.AddFeComponentTransfer&lt;TBuilder&gt; method

Adds an 'feComponentTransfer' element configuration to the builder. This element performs component-wise remapping of data for color channels.

```csharp
public static TBuilder AddFeComponentTransfer<TBuilder>(this TBuilder builder, 
    Action<SVGFEComponentTransferElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feComponentTransfer' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEComponentTransferElementBuilder](../../svgfecomponenttransferelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
