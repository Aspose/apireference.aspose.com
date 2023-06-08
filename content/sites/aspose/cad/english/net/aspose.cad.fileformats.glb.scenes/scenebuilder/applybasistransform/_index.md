---
title: SceneBuilder.ApplyBasisTransform
second_title: Aspose.CAD for .NET API Reference
description: SceneBuilder method. Applies a tranform the this SceneBuilder
type: docs
weight: 120
url: /net/aspose.cad.fileformats.glb.scenes/scenebuilder/applybasistransform/
---
## SceneBuilder.ApplyBasisTransform method

Applies a tranform the this [`SceneBuilder`](../).

```csharp
public void ApplyBasisTransform(Matrix4x4 basisTransform, string basisNodeName = "BasisTransform")
```

| Parameter | Type | Description |
| --- | --- | --- |
| basisTransform | Matrix4x4 | The transform to apply. |
| basisNodeName | String | The name of the dummy root node. |

## Remarks

In some circunstances, it's not possible to apply the *basisTransform* to the nodes in the scene. In these cases a dummy node is created, and these nodes are made children of this dummy node.

This method is useful to switch axes (Z-UP or Y-UP) and left right handed mode.

This method should be called at the end, when the scene has been created completely.

### See Also

* class [SceneBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../scenebuilder/)
* assembly [Aspose.CAD](../../../)


