---
title: Class CurveSampler
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Animations.CurveSampler class. Utility class to create samplers from curve collections
type: docs
weight: 9710
url: /net/aspose.cad.fileformats.glb.animations/curvesampler/
---
## CurveSampler class

Utility class to create samplers from curve collections.

```csharp
public static class CurveSampler
```

## Methods

| Name | Description |
| --- | --- |
| static [CreateHermitePointWeights](../../aspose.cad.fileformats.glb.animations/curvesampler/createhermitepointweights/)(float) | Calculates the Hermite point weights for a given *amount* |
| static [CreateHermiteTangentWeights](../../aspose.cad.fileformats.glb.animations/curvesampler/createhermitetangentweights/)(float) | Calculates the Hermite tangent weights for a given *amount* |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_3)(this IEnumerable&lt;(float, (ArraySegment&lt;float&gt;, ArraySegment&lt;float&gt;, ArraySegment&lt;float&gt;))&gt;, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_9)(this IEnumerable&lt;(float, (float[], float[], float[]))&gt;, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_5)(this IEnumerable&lt;(float, (Quaternion, Quaternion, Quaternion))&gt;, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_1)(this IEnumerable&lt;(float, (SparseWeight8, SparseWeight8, SparseWeight8))&gt;, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_7)(this IEnumerable&lt;(float, (Vector3, Vector3, Vector3))&gt;, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_2)(this IEnumerable&lt;(float, ArraySegment&lt;float&gt;)&gt;, bool, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_8)(this IEnumerable&lt;(float, float[])&gt;, bool, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_4)(this IEnumerable&lt;(float, Quaternion)&gt;, bool, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler)(this IEnumerable&lt;(float, SparseWeight8)&gt;, bool, bool) |  |
| static [CreateSampler](../../aspose.cad.fileformats.glb.animations/curvesampler/createsampler/#createsampler_6)(this IEnumerable&lt;(float, Vector3)&gt;, bool, bool) |  |
| static [CreateTangent](../../aspose.cad.fileformats.glb.animations/curvesampler/createtangent/#createtangent)(float[], float[], float) |  |
| static [CreateTangent](../../aspose.cad.fileformats.glb.animations/curvesampler/createtangent/#createtangent_1)(Quaternion, Quaternion, float) |  |
| static [CreateTangent](../../aspose.cad.fileformats.glb.animations/curvesampler/createtangent/#createtangent_2)(Vector3, Vector3, float) |  |
| static [FindRangeContainingOffset](../../aspose.cad.fileformats.glb.animations/curvesampler/findrangecontainingoffset/#findrangecontainingoffset)(IEnumerable&lt;float&gt;, float) | Given a *sequence* of offsets and an *offset*, it finds two consecutive offsets that contain *offset* between them. |
| static [FindRangeContainingOffset&lt;T&gt;](../../aspose.cad.fileformats.glb.animations/curvesampler/findrangecontainingoffset/#findrangecontainingoffset_1)(this IEnumerable&lt;(float Key, T Value)&gt;, float) | Given a *sequence* of float+*T* pairs and an *offset*, it finds two consecutive values that contain *offset* between them. |
| static [InterpolateCubic](../../aspose.cad.fileformats.glb.animations/curvesampler/interpolatecubic/#interpolatecubic)(IReadOnlyList&lt;float&gt;, IReadOnlyList&lt;float&gt;, IReadOnlyList&lt;float&gt;, IReadOnlyList&lt;float&gt;, float) |  |
| static [InterpolateCubic](../../aspose.cad.fileformats.glb.animations/curvesampler/interpolatecubic/#interpolatecubic_1)(Quaternion, Quaternion, Quaternion, Quaternion, float) |  |
| static [InterpolateCubic](../../aspose.cad.fileformats.glb.animations/curvesampler/interpolatecubic/#interpolatecubic_2)(Vector3, Vector3, Vector3, Vector3, float) |  |
| static [InterpolateLinear](../../aspose.cad.fileformats.glb.animations/curvesampler/interpolatelinear/)(IReadOnlyList&lt;float&gt;, IReadOnlyList&lt;float&gt;, float) |  |
| static [SplitByTime&lt;T&gt;](../../aspose.cad.fileformats.glb.animations/curvesampler/splitbytime/)(this IEnumerable&lt;(float Time, T Value)&gt;) | Splits the input sequence into chunks of 1 second for faster access |
| static [Subtract](../../aspose.cad.fileformats.glb.animations/curvesampler/subtract/)(IReadOnlyList&lt;float&gt;, IReadOnlyList&lt;float&gt;) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../aspose.cad.fileformats.glb.animations/)
* assembly [Aspose.CAD](../../)


