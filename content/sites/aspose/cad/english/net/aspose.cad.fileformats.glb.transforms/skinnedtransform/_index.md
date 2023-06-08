---
title: Class SkinnedTransform
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.SkinnedTransform class. 
type: docs
weight: 11380
url: /net/aspose.cad.fileformats.glb.transforms/skinnedtransform/
---
## SkinnedTransform class

```csharp
public class SkinnedTransform : MorphTransform, IGeometryTransform
```

## Constructors

| Name | Description |
| --- | --- |
| [SkinnedTransform](skinnedtransform/#constructor)() | The default constructor. |
| [SkinnedTransform](skinnedtransform/#constructor_2)(Matrix4x4[], Matrix4x4[], SparseWeight8, bool) |  |
| [SkinnedTransform](skinnedtransform/#constructor_1)(int, Func&lt;int, Matrix4x4&gt;, Func&lt;int, Matrix4x4&gt;, SparseWeight8, bool) |  |

## Properties

| Name | Description |
| --- | --- |
| [AbsoluteMorphTargets](../../aspose.cad.fileformats.glb.transforms/morphtransform/absolutemorphtargets/) { get; } | Gets a value indicating whether morph target values are absolute, and not relative to the master value. |
| [FlipFaces](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/flipfaces/) { get; } |  |
| [MorphWeights](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphweights/) { get; } | Gets the current morph weights to use for morph target blending. [`COMPLEMENT_INDEX`](../morphtransform/complement_index/) represents the index for the base geometry. |
| [SkinMatrices](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/skinmatrices/) { get; } | Gets the collection of the current, final matrices to use for skinning |
| [Visible](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/visible/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [MorphColors](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphcolors/)(Vector4, IReadOnlyList&lt;Vector4&gt;) |  |
| [MorphTexCoord](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphtexcoord/)(Vector2, IReadOnlyList&lt;Vector2&gt;) |  |
| [TransformNormal](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/transformnormal/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformPosition](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/transformposition/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformTangent](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/transformtangent/)(Vector4, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/update/#update_2)(Matrix4x4[], Matrix4x4[]) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/morphtransform/update/)(ref SparseWeight8, bool) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/update/#update_1)(int, Func&lt;int, Matrix4x4&gt;, Func&lt;int, Matrix4x4&gt;) |  |
| static [CalculateInverseBinding](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/calculateinversebinding/#calculateinversebinding_1)(Matrix4x4, Matrix4x4) | Calculates the inverse bind matrix to use for runtime skinning. |
| static [CalculateInverseBinding](../../aspose.cad.fileformats.glb.transforms/skinnedtransform/calculateinversebinding/#calculateinversebinding)(Matrix4x4Double, Matrix4x4Double) |  |

### See Also

* class [MorphTransform](../morphtransform/)
* interface [IGeometryTransform](../igeometrytransform/)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


