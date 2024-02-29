---
title: Struct SparseWeight8
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.SparseWeight8 struct. Represents a sparse collection of non zero weight values with a maximum of 8 weights
type: docs
weight: 11660
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
| override [Equals](../../aspose.cad.fileformats.glb.transforms/sparseweight8/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.transforms/sparseweight8/equals/#equals)(SparseWeight8) |  |
| [Expand](../../aspose.cad.fileformats.glb.transforms/sparseweight8/expand/)(int) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.transforms/sparseweight8/gethashcode/)() |  |
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


