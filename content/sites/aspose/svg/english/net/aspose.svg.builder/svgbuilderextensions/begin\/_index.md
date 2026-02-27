---
title: SVGBuilderExtensions.Begin
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Begin method. Sets the begin attribute defining when the animation should start
type: docs
weight: 610
url: /net/aspose.svg.builder/svgbuilderextensions/begin/
---
## SVGBuilderExtensions.Begin<TBuilder> method

Sets the 'begin' attribute, defining when the animation should start.

```csharp
public static TBuilder Begin<TBuilder>(this TBuilder builder, Action<TimingValueBuilder> configure)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| configure | A delegate to configure the timing value. |

### Return Value

The builder instance for chaining.

### See Also

* class [TimingValueBuilder](../../timingvaluebuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
