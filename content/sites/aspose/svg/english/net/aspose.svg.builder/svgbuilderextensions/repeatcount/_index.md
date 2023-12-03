---
title: SVGBuilderExtensions.RepeatCount
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Sets the repeatCount attribute defining how many times the animation should repeat
type: docs
weight: 1950
url: /net/aspose.svg.builder/svgbuilderextensions/repeatcount/
---
## RepeatCount&lt;TBuilder&gt;(this TBuilder, int) {#repeatcount_1}

Sets the 'repeatCount' attribute, defining how many times the animation should repeat.

```csharp
public static TBuilder RepeatCount<TBuilder>(this TBuilder builder, int value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The number of times the animation should repeat. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## RepeatCount&lt;TBuilder&gt;(this TBuilder, IndefiniteRepeat) {#repeatcount}

Sets the 'repeatCount' attribute, defining an indefinite repeat count for the animation using a predefined enum.

```csharp
public static TBuilder RepeatCount<TBuilder>(this TBuilder builder, IndefiniteRepeat value)
    where TBuilder : ISVGElementBuilder, IAnimationTimingAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| value | The predefined indefinite repeat count for the animation. |

### Return Value

The builder instance for chaining.

### See Also

* enum [IndefiniteRepeat](../../indefiniterepeat/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IAnimationTimingAttributeSetter](../../ianimationtimingattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
