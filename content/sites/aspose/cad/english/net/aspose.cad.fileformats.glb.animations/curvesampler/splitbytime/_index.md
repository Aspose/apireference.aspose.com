---
title: CurveSampler.SplitByTime
second_title: Aspose.CAD for .NET API Reference
description: CurveSampler method. Splits the input sequence into chunks of 1 second for faster access
type: docs
weight: 80
url: /net/aspose.cad.fileformats.glb.animations/curvesampler/splitbytime/
---
## CurveSampler.SplitByTime&lt;T&gt; method

Splits the input sequence into chunks of 1 second for faster access

```csharp
public static IEnumerable<(float, T)[]> SplitByTime<T>(
    this IEnumerable<(float Time, T Value)> sequence)
```

| Parameter | Description |
| --- | --- |
| T | The curve key type. |
| sequence | A timed sequence of curve keys. |

### Return Value

A sequence of 1 second chunks.

## Remarks

The first and last keys outside the range of each chunk are duplicated, so each chunk can be evaluated for the whole second.

### See Also

* class [CurveSampler](../)
* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../curvesampler/)
* assembly [Aspose.CAD](../../../)


