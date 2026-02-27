---
title: SVGBuilderExtensions.AddAnimate
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddAnimate method. Adds an animate element configuration to the builder
type: docs
weight: 30
url: /net/aspose.svg.builder/svgbuilderextensions/addanimate/
---
## SVGBuilderExtensions.AddAnimate<TBuilder> method

Adds an 'animate' element configuration to the builder.

```csharp
public static TBuilder AddAnimate<TBuilder>(this TBuilder builder, 
    Action<SVGAnimateElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IBaseAnimationElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'animate' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGAnimateElementBuilder](../../svganimateelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IBaseAnimationElementBuilder](../../ibaseanimationelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
