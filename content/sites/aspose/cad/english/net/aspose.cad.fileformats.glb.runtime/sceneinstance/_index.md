---
title: Class SceneInstance
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Runtime.SceneInstance class. Represents a specific and independent state of a SceneTemplate
type: docs
weight: 10960
url: /net/aspose.cad.fileformats.glb.runtime/sceneinstance/
---
## SceneInstance class

Represents a specific and independent state of a SceneTemplate.

```csharp
public sealed class SceneInstance : IReadOnlyList<DrawableInstance>
```

## Properties

| Name | Description |
| --- | --- |
| [Armature](../../aspose.cad.fileformats.glb.runtime/sceneinstance/armature/) { get; } |  |
| [Count](../../aspose.cad.fileformats.glb.runtime/sceneinstance/count/) { get; } |  |
| [DrawableInstances](../../aspose.cad.fileformats.glb.runtime/sceneinstance/drawableinstances/) { get; } |  |
| [DrawableInstancesCount](../../aspose.cad.fileformats.glb.runtime/sceneinstance/drawableinstancescount/) { get; } |  |
| [Item](../../aspose.cad.fileformats.glb.runtime/sceneinstance/item/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [GetDrawableInstance](../../aspose.cad.fileformats.glb.runtime/sceneinstance/getdrawableinstance/)(int) | Gets a [`DrawableInstance`](../drawableinstance/) object, where: - Name is the name of this drawable instance. Originally, it was the name of [`Node`](../../aspose.cad.fileformats.glb/node/). - MeshIndex is the logical Index of a [`Mesh`](../../aspose.cad.fileformats.glb/mesh/) in !:GlbImage.LogicalMeshes. - Transform is an [`IGeometryTransform`](../../aspose.cad.fileformats.glb.transforms/igeometrytransform/) that can be used to transform the [`Mesh`](../../aspose.cad.fileformats.glb/mesh/) into world space. |
| [GetEnumerator](../../aspose.cad.fileformats.glb.runtime/sceneinstance/getenumerator/)() |  |

### See Also

* struct [DrawableInstance](../drawableinstance/)
* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../aspose.cad.fileformats.glb.runtime/)
* assembly [Aspose.CAD](../../)


