---
title: Struct SparseWeight8
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.SparseWeight8 struct. Represents a sparse collection of non zero weight values with a maximum of 8 weights
type: docs
weight: 11390
url: /net/aspose.cad.fileformats.glb.transforms/sparseweight8/
---
## SparseWeight8 structure

Represents a sparse collection of non zero weight values, with a maximum of 8 weights.

```csharp
public struct SparseWeight8 : IEquatable<SparseWeight8>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.glb.transforms/sparseweight8/count/) { get; } |  |
| [IsWeightless](../../aspose.cad.fileformats.glb.transforms/sparseweight8/isweightless/) { get; } | Gets a value indicating whether all the weights in this `SparseWeight8` are zero. |
| [Item](../../aspose.cad.fileformats.glb.transforms/sparseweight8/item/) { get; } |  |
| [MaxIndex](../../aspose.cad.fileformats.glb.transforms/sparseweight8/maxindex/) { get; } |  |
| [WeightSum](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weightsum/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../aspose.cad.fileformats.glb.transforms/sparseweight8/add/)(ref SparseWeight8, ref SparseWeight8) | Adds *x* with *y* element wise. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| static [Blend](../../aspose.cad.fileformats.glb.transforms/sparseweight8/blend/)(ReadOnlySpan&lt;SparseWeight8&gt;, ReadOnlySpan&lt;float&gt;) |  |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create_5)(params (int Index, float Weight)[]) | Creates a new `SparseWeight8` from an indexed weight collection. If there's more than 8 weighted values, the 8 heaviest values are taken. |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create)(params float[]) | Creates a new `SparseWeight8` from a weights collection. If there's more than 8 non zero values, the 8 most representative values are taken. |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create_2)(IEnumerable&lt;(int Index, float Weight)&gt;) | Creates a new `SparseWeight8` from an indexed weight collection. If there's more than 8 weighted values, the 8 heaviest values are taken. |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create_1)(IEnumerable&lt;float&gt;) | Creates a new `SparseWeight8` from a weights collection. If there's more than 8 weighted values, the 8 heaviest values are taken. |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create_3)(ref Vector4, ref Vector4) | Creates a new `SparseWeight8` struct. |
| static [Create](../../aspose.cad.fileformats.glb.transforms/sparseweight8/create/#create_4)(ref Vector4, ref Vector4, ref Vector4, ref Vector4) | Creates a new `SparseWeight8` struct. |
| static [CreateUnchecked](../../aspose.cad.fileformats.glb.transforms/sparseweight8/createunchecked/)(ref Vector4, ref Vector4, ref Vector4, ref Vector4) | Creates a new `SparseWeight8` struct. |
| static [InterpolateCubic](../../aspose.cad.fileformats.glb.transforms/sparseweight8/interpolatecubic/)(ref SparseWeight8, ref SparseWeight8, ref SparseWeight8, ref SparseWeight8, float) | Interpolates (*x* , *xt*) with (*y* , *yt*) an *amount*. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| static [InterpolateLinear](../../aspose.cad.fileformats.glb.transforms/sparseweight8/interpolatelinear/)(ref SparseWeight8, ref SparseWeight8, float) | Interpolates Linearly *x* with *y* an *amount*. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| static [Multiply](../../aspose.cad.fileformats.glb.transforms/sparseweight8/multiply/#multiply_1)(ref SparseWeight8, float) | Multiplies *x* with *y* element wise. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| static [Multiply](../../aspose.cad.fileformats.glb.transforms/sparseweight8/multiply/#multiply)(ref SparseWeight8, ref SparseWeight8) | Multiplies *x* with *y* element wise. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| static [OrderedByIndex](../../aspose.cad.fileformats.glb.transforms/sparseweight8/orderedbyindex/)(ref SparseWeight8) | Returns a copy of this `SparseWeight8` where all the indices have been reordered by index in ascending order. |
| static [OrderedByWeight](../../aspose.cad.fileformats.glb.transforms/sparseweight8/orderedbyweight/)(ref SparseWeight8) | Returns a copy of this `SparseWeight8` where all the indices have been reordered by weight in descending order. |
| static [Subtract](../../aspose.cad.fileformats.glb.transforms/sparseweight8/subtract/)(ref SparseWeight8, ref SparseWeight8) | Subtracts *y* from *x* element wise. If there's more than 8 non zero result values, the 8 most representative values are taken. |
| override [Equals](../../aspose.cad.fileformats.glb.transforms/sparseweight8/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.transforms/sparseweight8/equals/#equals)(SparseWeight8) |  |
| [Expand](../../aspose.cad.fileformats.glb.transforms/sparseweight8/expand/)(int) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.transforms/sparseweight8/gethashcode/)() |  |
| [GetIndexedWeights](../../aspose.cad.fileformats.glb.transforms/sparseweight8/getindexedweights/)() |  |
| [GetNormalized](../../aspose.cad.fileformats.glb.transforms/sparseweight8/getnormalized/)() |  |
| [GetTrimmed](../../aspose.cad.fileformats.glb.transforms/sparseweight8/gettrimmed/)(int) |  |
| override [ToString](../../aspose.cad.fileformats.glb.transforms/sparseweight8/tostring/)() |  |
| [operator ==](../../aspose.cad.fileformats.glb.transforms/sparseweight8/op_equality/) |  |
| [operator !=](../../aspose.cad.fileformats.glb.transforms/sparseweight8/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| readonly [Index0](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index0/) |  |
| readonly [Index1](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index1/) |  |
| readonly [Index2](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index2/) |  |
| readonly [Index3](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index3/) |  |
| readonly [Index4](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index4/) |  |
| readonly [Index5](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index5/) |  |
| readonly [Index6](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index6/) |  |
| readonly [Index7](../../aspose.cad.fileformats.glb.transforms/sparseweight8/index7/) |  |
| readonly [Weight0](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight0/) |  |
| readonly [Weight1](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight1/) |  |
| readonly [Weight2](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight2/) |  |
| readonly [Weight3](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight3/) |  |
| readonly [Weight4](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight4/) |  |
| readonly [Weight5](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight5/) |  |
| readonly [Weight6](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight6/) |  |
| readonly [Weight7](../../aspose.cad.fileformats.glb.transforms/sparseweight8/weight7/) |  |

## Remarks

`SparseWeight8` is being used in two different contexts:

* As an utility structure to define per vertex joint weights in mesh skinning.
* As an animation key in morph targets; a mesh can have many morph targets, but realistically and due to GPU limitations, only up to 8 morph targets can be blended at the same time.

Constructors are designed so weightless values are not taken into account, and duplicated indices are merged, so indices are expected to be unique.

Use static Create* methods to construct instances of `SparseWeight8`.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


