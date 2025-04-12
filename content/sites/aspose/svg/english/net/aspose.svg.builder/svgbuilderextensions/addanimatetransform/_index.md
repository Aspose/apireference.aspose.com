---
title: SVGBuilderExtensions.AddAnimateTransform
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddAnimateTransform method. Adds an animateTransform element configuration to the builder
type: docs
weight: 50
url: /net/aspose.svg.builder/svgbuilderextensions/addanimatetransform/
---
## SVGBuilderExtensions.AddAnimateTransform&lt;TBuilder&gt; method

Adds an 'animateTransform' element configuration to the builder.

```csharp
public static TBuilder AddAnimateTransform<TBuilder>(this TBuilder builder, 
    Action<SVGAnimateTransformElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IAnimationElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'animateTransform' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGAnimateTransformElementBuilder](../../svganimatetransformelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationElementBuilder](../../ianimationelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
