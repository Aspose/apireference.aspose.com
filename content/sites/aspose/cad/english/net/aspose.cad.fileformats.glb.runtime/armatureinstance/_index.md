---
title: Class ArmatureInstance
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Runtime.ArmatureInstance class. Represents the transform states of a collection of bones
type: docs
weight: 10870
url: /net/aspose.cad.fileformats.glb.runtime/armatureinstance/
---
## ArmatureInstance class

Represents the transform states of a collection of bones.

```csharp
public class ArmatureInstance
```

## Properties

| Name | Description |
| --- | --- |
| [AnimationTracks](../../aspose.cad.fileformats.glb.runtime/armatureinstance/animationtracks/) { get; } | Gets the total number of animation tracks for this instance. |
| [LogicalNodes](../../aspose.cad.fileformats.glb.runtime/armatureinstance/logicalnodes/) { get; } | Gets a flattened collection of all the nodes of this armature. |
| [VisualNodes](../../aspose.cad.fileformats.glb.runtime/armatureinstance/visualnodes/) { get; } | Gets all the [`NodeInstance`](../nodeinstance/) roots used by this [`SceneInstance`](../sceneinstance/). |

## Methods

| Name | Description |
| --- | --- |
| [SetAnimationFrame](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setanimationframe/#setanimationframe_1)(params (int TrackIdx, float Time, float Weight)[]) |  |
| [SetAnimationFrame](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setanimationframe/#setanimationframe)(int, float, bool) | Sets the bone transforms from an animation frame. |
| [SetLocalMatrix](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setlocalmatrix/)(string, Matrix4x4) | Sets the matrix of a bone. |
| [SetModelMatrix](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setmodelmatrix/)(string, Matrix4x4) | Sets the matrix of a bone. |
| [SetPoseTransforms](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setposetransforms/)() | Resets the bone transforms to their default positions. |
| static [SetAnimationFrame](../../aspose.cad.fileformats.glb.runtime/armatureinstance/setanimationframe/)(IEnumerable&lt;NodeInstance&gt;, params (int TrackIdx, float Time, float Weight)[]) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../aspose.cad.fileformats.glb.runtime/)
* assembly [Aspose.CAD](../../)


