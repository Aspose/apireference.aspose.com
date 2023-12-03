---
title: SVGBuilderExtensions.AddFeFlood
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feFlood element configuration to the builder. This element fills the filter subregion with a specified color
type: docs
weight: 210
url: /net/aspose.svg.builder/svgbuilderextensions/addfeflood/
---
## SVGBuilderExtensions.AddFeFlood&lt;TBuilder&gt; method

Adds an 'feFlood' element configuration to the builder. This element fills the filter subregion with a specified color.

```csharp
public static TBuilder AddFeFlood<TBuilder>(this TBuilder builder, 
    Action<SVGFEFloodElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feFlood' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEFloodElementBuilder](../../svgfefloodelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
