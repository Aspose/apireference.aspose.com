---
title: CurveSampler.FindRangeContainingOffset
second_title: Aspose.CAD for .NET API Reference
description: CurveSampler method. Given a sequence of floatT pairs and an offset it finds two consecutive values that contain offset between them
type: docs
weight: 50
url: /net/aspose.cad.fileformats.glb.animations/curvesampler/findrangecontainingoffset/
---
## FindRangeContainingOffset&lt;T&gt;(this IEnumerable&lt;(float Key, T Value)&gt;, float) {#findrangecontainingoffset_1}

Given a *sequence* of float+*T* pairs and an *offset*, it finds two consecutive values that contain *offset* between them.

```csharp
public static (T A, T B, float Amount) FindRangeContainingOffset<T>(
    this IEnumerable<(float Key, T Value)> sequence, float offset)
```

| Parameter | Description |
| --- | --- |
| T | The value type |
| sequence | A sequence of float+*T* pairs sorted in ascending order. |
| offset | the offset to look for in the sequence. |

### Return Value

Two consecutive *T* values and a float amount to LERP amount.

### See Also

* class [CurveSampler](../)
* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../curvesampler/)
* assembly [Aspose.CAD](../../../)

---

## FindRangeContainingOffset(IEnumerable&lt;float&gt;, float) {#findrangecontainingoffset}

Given a *sequence* of offsets and an *offset*, it finds two consecutive offsets that contain *offset* between them.

```csharp
public static (float A, float B, float Amount) FindRangeContainingOffset(
    IEnumerable<float> sequence, float offset)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sequence | IEnumerable`1 | A sequence of offsets sorted in ascending order. |
| offset | Single | the offset to look for in the sequence. |

### Return Value

Two consecutive offsets and a LERP amount.

### See Also

* class [CurveSampler](../)
* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../curvesampler/)
* assembly [Aspose.CAD](../../../)


