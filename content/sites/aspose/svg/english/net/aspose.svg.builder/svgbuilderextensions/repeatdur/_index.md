---
title: SVGBuilderExtensions.RepeatDur
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions RepeatDur method. Sets the repeatDur attribute specifying the total duration for which the animation should repeat
type: docs
weight: 1960
url: /net/aspose.svg.builder/svgbuilderextensions/repeatdur/
---
## RepeatDur&lt;TBuilder&gt;(*this TBuilder, TimeSpan*) {#repeatdur_1}

Sets the 'repeatDur' attribute, specifying the total duration for which the animation should repeat.

```csharp
public static TBuilder RepeatDur<TBuilder>(this TBuilder builder, TimeSpan duration)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| duration | The total duration for repeating the animation. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## RepeatDur&lt;TBuilder&gt;(*this TBuilder, [IndefiniteRepeat](../../indefiniterepeat/)*) {#repeatdur}

Sets the 'repeatDur' attribute, specifying an indefinite total duration for the animation using a predefined enum.

```csharp
public static TBuilder RepeatDur<TBuilder>(this TBuilder builder, IndefiniteRepeat value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The predefined indefinite total duration for repeating the animation. |

### Return Value

The builder instance for chaining.

### See Also

* enum [IndefiniteRepeat](../../indefiniterepeat/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
