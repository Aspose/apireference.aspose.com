---
title: SVGBuilderExtensions.Max
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the max attribute specifying the maximum duration of the animation
type: docs
weight: 1160
url: /net/aspose.svg.builder/svgbuilderextensions/max/
---
## Max&lt;TBuilder&gt;(this TBuilder, TimeSpan) {#max_1}

Sets the 'max' attribute, specifying the maximum duration of the animation.

```csharp
public static TBuilder Max<TBuilder>(this TBuilder builder, TimeSpan duration)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| duration | The maximum duration of the animation. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Max&lt;TBuilder&gt;(this TBuilder, Media) {#max}

Sets the 'max' attribute, specifying the predefined maximum duration condition for the animation.

```csharp
public static TBuilder Max<TBuilder>(this TBuilder builder, Media value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The predefined maximum duration condition for the animation. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Media](../../media/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
