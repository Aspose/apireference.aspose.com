---
title: SVGBuilderExtensions.Min
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the min attribute specifying the minimum duration of the animation
type: docs
weight: 1170
url: /net/aspose.svg.builder/svgbuilderextensions/min/
---
## Min&lt;TBuilder&gt;(this TBuilder, TimeSpan) {#min_1}

Sets the 'min' attribute, specifying the minimum duration of the animation.

```csharp
public static TBuilder Min<TBuilder>(this TBuilder builder, TimeSpan duration)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| duration | The minimum duration of the animation. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Min&lt;TBuilder&gt;(this TBuilder, Media) {#min}

Sets the 'min' attribute, specifying the minimum duration condition for the animation based on media.

```csharp
public static TBuilder Min<TBuilder>(this TBuilder builder, Media value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The media-related minimum duration condition for the animation. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Media](../../media/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
