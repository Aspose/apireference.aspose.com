---
title: Class InstancingTransform
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.InstancingTransform class. 
type: docs
weight: 11310
url: /net/aspose.cad.fileformats.glb.transforms/instancingtransform/
---
## InstancingTransform class

```csharp
public class InstancingTransform : RigidTransform, IGeometryInstancing
```

## Constructors

| Name | Description |
| --- | --- |
| [InstancingTransform](instancingtransform/)(AffineTransform[]) |  |

## Properties

| Name | Description |
| --- | --- |
| [AbsoluteMorphTargets](../../aspose.cad.fileformats.glb.transforms/morphtransform/absolutemorphtargets/) { get; } | Gets a value indicating whether morph target values are absolute, and not relative to the master value. |
| [FlipFaces](../../aspose.cad.fileformats.glb.transforms/rigidtransform/flipfaces/) { get; } |  |
| [InstancesCount](../../aspose.cad.fileformats.glb.transforms/instancingtransform/instancescount/) { get; } |  |
| [LocalMatrices](../../aspose.cad.fileformats.glb.transforms/instancingtransform/localmatrices/) { get; } | Gets the local matrices for every instanced mesh |
| [MorphWeights](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphweights/) { get; } | Gets the current morph weights to use for morph target blending. [`COMPLEMENT_INDEX`](../morphtransform/complement_index/) represents the index for the base geometry. |
| [Visible](../../aspose.cad.fileformats.glb.transforms/rigidtransform/visible/) { get; } |  |
| [WorldMatrix](../../aspose.cad.fileformats.glb.transforms/rigidtransform/worldmatrix/) { get; } |  |
| [WorldTransforms](../../aspose.cad.fileformats.glb.transforms/instancingtransform/worldtransforms/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [MorphColors](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphcolors/)(Vector4, IReadOnlyList&lt;Vector4&gt;) |  |
| [MorphTexCoord](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphtexcoord/)(Vector2, IReadOnlyList&lt;Vector2&gt;) |  |
| [TransformNormal](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformnormal/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformPosition](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformposition/)(Vector3, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [TransformTangent](../../aspose.cad.fileformats.glb.transforms/rigidtransform/transformtangent/)(Vector4, IReadOnlyList&lt;Vector3&gt;, ref SparseWeight8) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/rigidtransform/update/)(Matrix4x4) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/morphtransform/update/)(ref SparseWeight8, bool) |  |
| [UpdateInstances](../../aspose.cad.fileformats.glb.transforms/instancingtransform/updateinstances/)() |  |
| static [Evaluate](../../aspose.cad.fileformats.glb.transforms/instancingtransform/evaluate/)(IGeometryTransform) |  |

### See Also

* class [RigidTransform](../rigidtransform/)
* interface [IGeometryInstancing](../igeometryinstancing/)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


