---
title: SkinnedTransform.CalculateInverseBinding
second_title: Aspose.CAD for .NET API Reference
description: SkinnedTransform method. Calculates the inverse bind matrix to use for runtime skinning
type: docs
weight: 90
url: /net/aspose.cad.fileformats.glb.transforms/skinnedtransform/calculateinversebinding/
---
## CalculateInverseBinding(Matrix4x4, Matrix4x4) {#calculateinversebinding_1}

Calculates the inverse bind matrix to use for runtime skinning.

```csharp
public static Matrix4x4 CalculateInverseBinding(Matrix4x4 meshWorldTransform, 
    Matrix4x4 jointWorldTransform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshWorldTransform | Matrix4x4 | The world space Matrix4x4 of the mesh at the time of binding (POSE). |
| jointWorldTransform | Matrix4x4 | The world space Matrix4x4 of the given bone joint at the time of binding (POSE). |

### Return Value

A Matrix4x4 representing the inverse bind transform.

### See Also

* class [SkinnedTransform](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../skinnedtransform/)
* assembly [Aspose.CAD](../../../)

---

## CalculateInverseBinding(Matrix4x4Double, Matrix4x4Double) {#calculateinversebinding}

```csharp
public static Matrix4x4Double CalculateInverseBinding(Matrix4x4Double meshWorldTransform, 
    Matrix4x4Double jointWorldTransform)
```

### See Also

* struct [Matrix4x4Double](../../matrix4x4double/)
* class [SkinnedTransform](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../skinnedtransform/)
* assembly [Aspose.CAD](../../../)


