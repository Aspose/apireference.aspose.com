---
title: Class RigidTransform
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.RigidTransform class. 
type: docs
weight: 11370
url: /net/aspose.cad.fileformats.glb.transforms/rigidtransform/
---
## RigidTransform class

```csharp
public class RigidTransform : MorphTransform, IGeometryTransform
```

## Constructors

| Name | Description |
| --- | --- |
| [RigidTransform](rigidtransform/#constructor)() | The default constructor. |
| [RigidTransform](rigidtransform/#constructor_1)(Matrix4x4) |  |
| [RigidTransform](rigidtransform/#constructor_2)(Matrix4x4, SparseWeight8, bool) |  |

## Properties

| Name | Description |
| --- | --- |
| [AbsoluteMorphTargets](../../aspose.cad.fileformats.glb.transforms/morphtransform/absolutemorphtargets/) { get; } | Gets a value indicating whether morph target values are absolute, and not relative to the master value. |
| [FlipFaces](../../aspose.cad.fileformats.glb.transforms/rigidtransform/flipfaces/) { get; } |  |
| [MorphWeights](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphweights/) { get; } | Gets the current morph weights to use for morph target blending. [`COMPLEMENT_INDEX`](../morphtransform/complement_index/) represents the index for the base geometry. |
| [Visible](../../aspose.cad.fileformats.glb.transforms/rigidtransform/visible/) { get; } |  |
| [WorldMatrix](../../aspose.cad.fileformats.glb.transforms/rigidtransform/worldmatrix/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [MorphColors](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphcolors/)(Vector4, IReadOnlyList&lt;Vector4&gt;) |  |
| [MorphTexCoord](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphtexcoord/)(Vector2, IReadOnlyList&lt;Vector2&gt;) |  |
| [TransformNormal](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformnormal/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformPosition](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformposition/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformTangent](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformtangent/)(Vector4, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/rigidtransform/update/#update_1)(Matrix4x4) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/morphtransform/update/)(ref SparseWeight8, bool) |  |

### See Also

* class [MorphTransform](../morphtransform/)
* interface [IGeometryTransform](../igeometrytransform/)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


