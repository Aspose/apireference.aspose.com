---
title: Struct AffineTransform
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.AffineTransform struct. Represents an affine transform in 3D space with two mutually exclusive representantions
type: docs
weight: 11270
url: /net/aspose.cad.fileformats.glb.transforms/affinetransform/
---
## AffineTransform structure

Represents an affine transform in 3D space, with two mutually exclusive representantions:

* As a 4x3 Matrix. When [`IsMatrix`](./ismatrix/) is true. Publicly exposed as [`Matrix`](./matrix/).
* As a Scale/Rotation/Translation chain. When [`IsSRT`](./issrt/) is true. Publicly exposed as: [`Scale`](./scale/), [`Rotation`](./rotation/), [`Translation`](./translation/).

```csharp
public struct AffineTransform : IEquatable<AffineTransform>
```

## Constructors

| Name | Description |
| --- | --- |
| [AffineTransform](affinetransform/#constructor_1)(Matrix4x4) |  |
| [AffineTransform](affinetransform/#constructor_2)(Quaternion) |  |
| [AffineTransform](affinetransform/#constructor_3)(Quaternion, Vector3) |  |
| [AffineTransform](affinetransform/#constructor_4)(Vector3, Quaternion, Vector3) |  |
| [AffineTransform](affinetransform/#constructor)(Vector3?, Quaternion?, Vector3?) |  |

## Properties

| Name | Description |
| --- | --- |
| [IsIdentity](../../aspose.cad.fileformats.glb.transforms/affinetransform/isidentity/) { get; } |  |
| [IsLosslessDecomposable](../../aspose.cad.fileformats.glb.transforms/affinetransform/islosslessdecomposable/) { get; } | Gets a value indicating whether this transform can be decomposed to SRT without precission loss. |
| [IsMatrix](../../aspose.cad.fileformats.glb.transforms/affinetransform/ismatrix/) { get; } | Gets a value indicating whether this `AffineTransform` represents a Matrix4x4. |
| [IsSRT](../../aspose.cad.fileformats.glb.transforms/affinetransform/issrt/) { get; } | Gets a value indicating whether this `AffineTransform` represents a SRT chain. |
| [IsValid](../../aspose.cad.fileformats.glb.transforms/affinetransform/isvalid/) { get; } |  |
| [Matrix](../../aspose.cad.fileformats.glb.transforms/affinetransform/matrix/) { get; } | Gets the Matrix4x4 transform of the current `AffineTransform` |
| [Rotation](../../aspose.cad.fileformats.glb.transforms/affinetransform/rotation/) { get; } | Gets the rotation. |
| [Scale](../../aspose.cad.fileformats.glb.transforms/affinetransform/scale/) { get; } | Gets the scale. |
| [Translation](../../aspose.cad.fileformats.glb.transforms/affinetransform/translation/) { get; } | Gets the translation |

## Methods

| Name | Description |
| --- | --- |
| static [Blend](../../aspose.cad.fileformats.glb.transforms/affinetransform/blend/)(ReadOnlySpan&lt;AffineTransform&gt;, ReadOnlySpan&lt;float&gt;) |  |
| static [CreateDecomposed](../../aspose.cad.fileformats.glb.transforms/affinetransform/createdecomposed/)(Matrix4x4) |  |
| static [CreateFromAny](../../aspose.cad.fileformats.glb.transforms/affinetransform/createfromany/)(Matrix4x4?, Vector3?, Quaternion?, Vector3?) |  |
| static [Multiply](../../aspose.cad.fileformats.glb.transforms/affinetransform/multiply/)(ref AffineTransform, ref AffineTransform) | Multiplies *a* by *b*. |
| [Equals](../../aspose.cad.fileformats.glb.transforms/affinetransform/equals/#equals)(AffineTransform) |  |
| override [Equals](../../aspose.cad.fileformats.glb.transforms/affinetransform/equals/#equals_1)(object) |  |
| [GetDecomposed](../../aspose.cad.fileformats.glb.transforms/affinetransform/getdecomposed/)() | If this object represents a Matrix4x4, it returns a decomposed representation. |
| override [GetHashCode](../../aspose.cad.fileformats.glb.transforms/affinetransform/gethashcode/)() |  |
| [TryDecompose](../../aspose.cad.fileformats.glb.transforms/affinetransform/trydecompose/#trydecompose)(out AffineTransform) |  |
| [TryDecompose](../../aspose.cad.fileformats.glb.transforms/affinetransform/trydecompose/#trydecompose_1)(out Vector3, out Quaternion, out Vector3) |  |
| [WithRotation](../../aspose.cad.fileformats.glb.transforms/affinetransform/withrotation/)(Quaternion) |  |
| [WithScale](../../aspose.cad.fileformats.glb.transforms/affinetransform/withscale/)(Vector3) |  |
| [WithTranslation](../../aspose.cad.fileformats.glb.transforms/affinetransform/withtranslation/)(Vector3) |  |
| static [AreGeometricallyEquivalent](../../aspose.cad.fileformats.glb.transforms/affinetransform/aregeometricallyequivalent/)(ref AffineTransform, ref AffineTransform, float) | Checks whether two transform represent the same geometric spatial transformation. |
| static [TransformNormal](../../aspose.cad.fileformats.glb.transforms/affinetransform/transformnormal/)(Vector3, ref AffineTransform) | Transforms a vector normal by a specified transform. |
| static [TryInvert](../../aspose.cad.fileformats.glb.transforms/affinetransform/tryinvert/)(ref AffineTransform, out AffineTransform) | Inverts the specified transform. The return value indicates whether the operation succeeded. |
| [operator ==](../../aspose.cad.fileformats.glb.transforms/affinetransform/op_equality/) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.transforms/affinetransform/op_implicit/#op_implicit_2) |  (3 operators) |
| [operator !=](../../aspose.cad.fileformats.glb.transforms/affinetransform/op_inequality/) |  |
| [operator *](../../aspose.cad.fileformats.glb.transforms/affinetransform/op_multiply/) |  |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Identity](../../aspose.cad.fileformats.glb.transforms/affinetransform/identity/) |  |

## Remarks

Depending on how `AffineTransform` structures are created, the underlaying fields must be interpreted as a Matrix4x3 or a Scale/Rotation/Translation chain.

This approach allows `AffineTransform` preserving the source transform, avoiding loosing precission when decomposing a matrix, or creating a matrix from a SRT chain.

Decomposing matrices is tricky because not all valid matrices can be decomposed; in particular squewed matrices will fail to decompose.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


