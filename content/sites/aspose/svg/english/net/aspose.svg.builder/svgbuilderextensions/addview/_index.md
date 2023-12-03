---
title: SVGBuilderExtensions.AddView
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a view element configuration to the builder
type: docs
weight: 560
url: /net/aspose.svg.builder/svgbuilderextensions/addview/
---
## SVGBuilderExtensions.AddView&lt;TBuilder&gt; method

Adds a 'view' element configuration to the builder.

```csharp
public static TBuilder AddView<TBuilder>(this TBuilder builder, 
    Action<SVGViewElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'view' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGViewElementBuilder](../../svgviewelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
