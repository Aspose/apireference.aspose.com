---
title: SVGBuilderExtensions.AddFeSpecularLighting
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feSpecularLighting element configuration to the builder. This element applies a lighting effect to the image simulating specular reflection
type: docs
weight: 270
url: /net/aspose.svg.builder/svgbuilderextensions/addfespecularlighting/
---
## SVGBuilderExtensions.AddFeSpecularLighting&lt;TBuilder&gt; method

Adds an 'feSpecularLighting' element configuration to the builder. This element applies a lighting effect to the image, simulating specular reflection.

```csharp
public static TBuilder AddFeSpecularLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFESpecularLightingElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feSpecularLighting' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFESpecularLightingElementBuilder](../../svgfespecularlightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
