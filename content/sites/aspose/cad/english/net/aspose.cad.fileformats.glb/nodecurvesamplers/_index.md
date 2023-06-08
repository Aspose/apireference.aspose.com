---
title: Struct NodeCurveSamplers
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.NodeCurveSamplers struct. Represents an proxy to acccess the animation curves of a Node. Use GetCurveSamplers for access
type: docs
weight: 10790
url: /net/aspose.cad.fileformats.glb/nodecurvesamplers/
---
## NodeCurveSamplers structure

Represents an proxy to acccess the animation curves of a [`Node`](../node/). Use [`GetCurveSamplers`](../node/getcurvesamplers/) for access.

```csharp
public struct NodeCurveSamplers : IEquatable<NodeCurveSamplers>
```

## Properties

| Name | Description |
| --- | --- |
| [HasMorphingCurves](../../aspose.cad.fileformats.glb/nodecurvesamplers/hasmorphingcurves/) { get; } | True if there's a morphing curve. |
| [HasTransformCurves](../../aspose.cad.fileformats.glb/nodecurvesamplers/hastransformcurves/) { get; } | True if any of [`Scale`](./scale/), [`Rotation`](./rotation/) or [`Translation`](./translation/) is defined. |
| [Morphing](../../aspose.cad.fileformats.glb/nodecurvesamplers/morphing/) { get; } | Gets the raw Morphing sampler, or null if there's no curve defined. |
| [MorphingSparse](../../aspose.cad.fileformats.glb/nodecurvesamplers/morphingsparse/) { get; } | Gets the SparseWeight8 Morphing sampler, or null if there's no curve defined. |
| [Rotation](../../aspose.cad.fileformats.glb/nodecurvesamplers/rotation/) { get; } | Gets the Rotation sampler, or null if there's no curve defined. |
| [Scale](../../aspose.cad.fileformats.glb/nodecurvesamplers/scale/) { get; } | Gets the Scale sampler, or null if there's no curve defined. |
| [Translation](../../aspose.cad.fileformats.glb/nodecurvesamplers/translation/) { get; } | Gets the Translation sampler, or null if there's no curve defined. |

## Methods

| Name | Description |
| --- | --- |
| [Equals](../../aspose.cad.fileformats.glb/nodecurvesamplers/equals/#equals)(NodeCurveSamplers) |  |
| override [Equals](../../aspose.cad.fileformats.glb/nodecurvesamplers/equals/#equals_1)(object) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb/nodecurvesamplers/gethashcode/)() |  |
| [GetLocalTransform](../../aspose.cad.fileformats.glb/nodecurvesamplers/getlocaltransform/)(float) |  |
| [GetMorphingSampler&lt;TWeights&gt;](../../aspose.cad.fileformats.glb/nodecurvesamplers/getmorphingsampler/)() | Gets the morphing sampler, or null if there's no curve defined. |
| [GetMorphingWeights&lt;TWeight&gt;](../../aspose.cad.fileformats.glb/nodecurvesamplers/getmorphingweights/)(float) |  |
| [GetSparseMorphingWeights](../../aspose.cad.fileformats.glb/nodecurvesamplers/getsparsemorphingweights/)(float) |  |
| [operator ==](../../aspose.cad.fileformats.glb/nodecurvesamplers/op_equality/) |  |
| [operator !=](../../aspose.cad.fileformats.glb/nodecurvesamplers/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| readonly [Animation](../../aspose.cad.fileformats.glb/nodecurvesamplers/animation/) |  |
| readonly [TargetNode](../../aspose.cad.fileformats.glb/nodecurvesamplers/targetnode/) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


