---
title: SVGBuilderExtensions.AddFeTurbulence
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feTurbulence element configuration to the builder. This element creates an image using Perlin noise useful for creating textures like clouds or marble
type: docs
weight: 290
url: /net/aspose.svg.builder/svgbuilderextensions/addfeturbulence/
---
## SVGBuilderExtensions.AddFeTurbulence&lt;TBuilder&gt; method

Adds an 'feTurbulence' element configuration to the builder. This element creates an image using Perlin noise, useful for creating textures like clouds or marble.

```csharp
public static TBuilder AddFeTurbulence<TBuilder>(this TBuilder builder, 
    Action<SVGFETurbulenceElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feTurbulence' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFETurbulenceElementBuilder](../../svgfeturbulenceelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
