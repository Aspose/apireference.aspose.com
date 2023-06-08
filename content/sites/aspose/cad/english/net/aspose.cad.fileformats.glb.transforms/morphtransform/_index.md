---
title: Class MorphTransform
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.MorphTransform class. 
type: docs
weight: 11350
url: /net/aspose.cad.fileformats.glb.transforms/morphtransform/
---
## MorphTransform class

```csharp
public abstract class MorphTransform : IMaterialTransform
```

## Properties

| Name | Description |
| --- | --- |
| [AbsoluteMorphTargets](../../aspose.cad.fileformats.glb.transforms/morphtransform/absolutemorphtargets/) { get; } | Gets a value indicating whether morph target values are absolute, and not relative to the master value. |
| [MorphWeights](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphweights/) { get; } | Gets the current morph weights to use for morph target blending. [`COMPLEMENT_INDEX`](./complement_index/) represents the index for the base geometry. |

## Methods

| Name | Description |
| --- | --- |
| [MorphColors](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphcolors/)(Vector4, IReadOnlyList&lt;Vector4&gt;) |  |
| [MorphTexCoord](../../aspose.cad.fileformats.glb.transforms/morphtransform/morphtexcoord/)(Vector2, IReadOnlyList&lt;Vector2&gt;) |  |
| [Update](../../aspose.cad.fileformats.glb.transforms/morphtransform/update/)(ref SparseWeight8, bool) |  |

## Fields

| Name | Description |
| --- | --- |
| const [COMPLEMENT_INDEX](../../aspose.cad.fileformats.glb.transforms/morphtransform/complement_index/) |  |

### See Also

* interface [IMaterialTransform](../imaterialtransform/)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


