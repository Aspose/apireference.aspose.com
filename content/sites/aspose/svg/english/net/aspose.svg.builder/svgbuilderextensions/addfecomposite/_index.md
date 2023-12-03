---
title: SVGBuilderExtensions.AddFeComposite
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feComposite element configuration to the builder. This element performs a bitwise combination of two input graphics
type: docs
weight: 160
url: /net/aspose.svg.builder/svgbuilderextensions/addfecomposite/
---
## SVGBuilderExtensions.AddFeComposite&lt;TBuilder&gt; method

Adds an 'feComposite' element configuration to the builder. This element performs a bitwise combination of two input graphics.

```csharp
public static TBuilder AddFeComposite<TBuilder>(this TBuilder builder, 
    Action<SVGFECompositeElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feComposite' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFECompositeElementBuilder](../../svgfecompositeelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
