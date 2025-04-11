---
title: SVGBuilderExtensions.AddFeMerge
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddFeMerge method. Adds an feMerge element configuration to the builder. This element allows filter effects to be applied concurrently instead of sequentially
type: docs
weight: 240
url: /net/aspose.svg.builder/svgbuilderextensions/addfemerge/
---
## SVGBuilderExtensions.AddFeMerge&lt;TBuilder&gt; method

Adds an 'feMerge' element configuration to the builder. This element allows filter effects to be applied concurrently instead of sequentially.

```csharp
public static TBuilder AddFeMerge<TBuilder>(this TBuilder builder, 
    Action<SVGFEMergeElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feMerge' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEMergeElementBuilder](../../svgfemergeelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
