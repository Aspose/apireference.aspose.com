---
title: SVGBuilderExtensions.AddFeDropShadow
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feDropShadow element configuration to the builder. This element creates a drop shadow effect
type: docs
weight: 200
url: /net/aspose.svg.builder/svgbuilderextensions/addfedropshadow/
---
## SVGBuilderExtensions.AddFeDropShadow&lt;TBuilder&gt; method

Adds an 'feDropShadow' element configuration to the builder. This element creates a drop shadow effect.

```csharp
public static TBuilder AddFeDropShadow<TBuilder>(this TBuilder builder, 
    Action<SVGFEDropShadowElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feDropShadow' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEDropShadowElementBuilder](../../svgfedropshadowelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
