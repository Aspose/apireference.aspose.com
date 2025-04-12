---
title: CalcMode Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.CalcMode enum. Specifies the calculation modes for interpolating values in SVG animations
type: docs
weight: 90
url: /net/aspose.svg.builder/calcmode/
---
## CalcMode enumeration

Specifies the calculation modes for interpolating values in SVG animations.

```csharp
public enum CalcMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Discrete | `0` | The animation jumps from one value to the next without any interpolation. |
| Linear | `1` | The animation values are interpolated linearly across the animation duration. |
| Paced | `2` | The animation is paced so that the progress is even across the entire animation. |
| Spline | `3` | The animation uses cubic Bézier splines to interpolate values. |

## Remarks

The calculation mode determines how an SVG animation transitions between values over the course of the animation. Different modes can be used to create various effects and control the animation's pacing and smoothness.

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
