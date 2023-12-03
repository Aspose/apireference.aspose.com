---
title: SVGBuilderExtensions.AddFilter
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a filter element configuration to the builder
type: docs
weight: 300
url: /net/aspose.svg.builder/svgbuilderextensions/addfilter/
---
## SVGBuilderExtensions.AddFilter&lt;TBuilder&gt; method

Adds a 'filter' element configuration to the builder.

```csharp
public static TBuilder AddFilter<TBuilder>(this TBuilder builder, 
    Action<SVGFilterElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'filter' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFilterElementBuilder](../../svgfilterelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
