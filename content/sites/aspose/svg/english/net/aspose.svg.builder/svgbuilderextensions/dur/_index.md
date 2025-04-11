---
title: SVGBuilderExtensions.Dur
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Dur method. Sets the dur attribute specifying the duration of the animation
type: docs
weight: 760
url: /net/aspose.svg.builder/svgbuilderextensions/dur/
---
## Dur&lt;TBuilder&gt;(*this TBuilder, TimeSpan*) {#dur_1}

Sets the 'dur' attribute, specifying the duration of the animation.

```csharp
public static TBuilder Dur<TBuilder>(this TBuilder builder, TimeSpan duration)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| duration | The duration of the animation. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Dur&lt;TBuilder&gt;(*this TBuilder, [Dur](../../dur/)*) {#dur}

Sets the 'dur' attribute, specifying the predefined duration type of the animation.

```csharp
public static TBuilder Dur<TBuilder>(this TBuilder builder, Dur value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The predefined duration type for the animation. |

### Return Value

The builder instance for chaining.

### See Also

* enum [Dur](../../dur/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
