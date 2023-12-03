---
title: SVGBuilderExtensions.AddAnimateMotion
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an animateMotion element configuration to the builder
type: docs
weight: 40
url: /net/aspose.svg.builder/svgbuilderextensions/addanimatemotion/
---
## SVGBuilderExtensions.AddAnimateMotion&lt;TBuilder&gt; method

Adds an 'animateMotion' element configuration to the builder.

```csharp
public static TBuilder AddAnimateMotion<TBuilder>(this TBuilder builder, 
    Action<SVGAnimateMotionElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IAnimationElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'animateMotion' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGAnimateMotionElementBuilder](../../svganimatemotionelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationElementBuilder](../../ianimationelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
