---
title: SVGBuilderExtensions.Accumulate
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the accumulate attribute specifying how repeated animations build upon each other
type: docs
weight: 10
url: /net/aspose.svg.builder/svgbuilderextensions/accumulate/
---
## SVGBuilderExtensions.Accumulate&lt;TBuilder&gt; method

Sets the 'accumulate' attribute, specifying how repeated animations build upon each other.

```csharp
public static TBuilder Accumulate<TBuilder>(this TBuilder builder,    value)
    where TBuilder : ISVGElementBuilder, IAnimationAdditionAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The accumulation behavior of the animation. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationAdditionAttributeSetter](../../ianimationadditionattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
