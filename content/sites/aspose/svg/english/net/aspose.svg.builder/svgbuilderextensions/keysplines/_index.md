---
title: SVGBuilderExtensions.KeySplines
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions KeySplines method. Sets the keySplines attribute specifying the control points for the pacing of the animation
type: docs
weight: 1060
url: /net/aspose.svg.builder/svgbuilderextensions/keysplines/
---
## SVGBuilderExtensions.KeySplines<TBuilder> method

Sets the 'keySplines' attribute, specifying the control points for the pacing of the animation.

```csharp
public static TBuilder KeySplines<TBuilder>(this TBuilder builder, 
    Action<AnimationSplineBuilder> buildSplines)
    where TBuilder : ISVGElementBuilder, IAnimationValueAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| buildSplines | The action to build the spline configuration. |

### Return Value

The builder instance for chaining.

### See Also

* class [AnimationSplineBuilder](../../animationsplinebuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationValueAttributeSetter](../../ianimationvalueattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
