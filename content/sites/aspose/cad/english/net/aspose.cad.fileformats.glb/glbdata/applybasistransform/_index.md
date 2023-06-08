---
title: GlbData.ApplyBasisTransform
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Applies a world transform to all the scenes of the model
type: docs
weight: 260
url: /net/aspose.cad.fileformats.glb/glbdata/applybasistransform/
---
## GlbData.ApplyBasisTransform method

Applies a world transform to all the scenes of the model.

```csharp
public void ApplyBasisTransform(Matrix4x4 basisTransform, string basisNodeName = "BasisTransform")
```

| Parameter | Type | Description |
| --- | --- | --- |
| basisTransform | Matrix4x4 | The transform to apply. |
| basisNodeName | String | The name of the new root node, if it needs to be created. |

## Remarks

This method is appropiate to apply a general axis or scale change to the whole model. Animations are preserved by encapsulating animated nodes inside a master basis transform node. Meanwhile, unanimated nodes are transformed directly. If the determinant of *basisTransform* is negative, the face culling should be flipped when rendering.

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)


