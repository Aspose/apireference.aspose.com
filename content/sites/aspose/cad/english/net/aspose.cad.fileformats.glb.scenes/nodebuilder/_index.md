---
title: Class NodeBuilder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.NodeBuilder class. Defines a node object within an armature
type: docs
weight: 11090
url: /net/aspose.cad.fileformats.glb.scenes/nodebuilder/
---
## NodeBuilder class

Defines a node object within an armature.

```csharp
public class NodeBuilder : BaseBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [NodeBuilder](nodebuilder/#constructor)() | The default constructor. |
| [NodeBuilder](nodebuilder/#constructor_1)(string) |  |
| [NodeBuilder](nodebuilder/#constructor_2)(string, JsonContent) |  |

## Properties

| Name | Description |
| --- | --- |
| [AnimationTracksNames](../../aspose.cad.fileformats.glb.scenes/nodebuilder/animationtracksnames/) { get; } |  |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [HasAnimations](../../aspose.cad.fileformats.glb.scenes/nodebuilder/hasanimations/) { get; } | Gets a value indicating whether this `NodeBuilder` has animations. |
| [LocalMatrix](../../aspose.cad.fileformats.glb.scenes/nodebuilder/localmatrix/) { get; set; } | Gets or sets the local transform Matrix4x4 of this `NodeBuilder`. |
| [LocalTransform](../../aspose.cad.fileformats.glb.scenes/nodebuilder/localtransform/) { get; set; } | Gets or sets the local Scale, Rotation and Translation of this `NodeBuilder`. |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Parent](../../aspose.cad.fileformats.glb.scenes/nodebuilder/parent/) { get; } |  |
| [Root](../../aspose.cad.fileformats.glb.scenes/nodebuilder/root/) { get; } |  |
| [Rotation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/rotation/) { get; } | Gets the current rotation transform, or null. |
| [Scale](../../aspose.cad.fileformats.glb.scenes/nodebuilder/scale/) { get; } | Gets the current Scale transform, or null. |
| [Translation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/translation/) { get; } | Gets the current translation transform, or null. |
| [VisualChildren](../../aspose.cad.fileformats.glb.scenes/nodebuilder/visualchildren/) { get; } |  |
| [WorldMatrix](../../aspose.cad.fileformats.glb.scenes/nodebuilder/worldmatrix/) { get; set; } | Gets or sets the world transform Matrix4x4 of this `NodeBuilder`. |

## Methods

| Name | Description |
| --- | --- |
| [AddNode](../../aspose.cad.fileformats.glb.scenes/nodebuilder/addnode/)(NodeBuilder) |  |
| [CreateNode](../../aspose.cad.fileformats.glb.scenes/nodebuilder/createnode/)(string) |  |
| [DeepClone](../../aspose.cad.fileformats.glb.scenes/nodebuilder/deepclone/)() |  |
| [GetInverseBindMatrix](../../aspose.cad.fileformats.glb.scenes/nodebuilder/getinversebindmatrix/)(Matrix4x4?) |  |
| [GetLocalTransform](../../aspose.cad.fileformats.glb.scenes/nodebuilder/getlocaltransform/)(string, float) |  |
| [GetWorldMatrix](../../aspose.cad.fileformats.glb.scenes/nodebuilder/getworldmatrix/)(string, float) |  |
| [SetLocalTransform](../../aspose.cad.fileformats.glb.scenes/nodebuilder/setlocaltransform/)(AffineTransform, bool) | Sets the local transform of this node. Optionally it is possible keep children from being affected by this node transformation change. |
| [SetRotationTrack](../../aspose.cad.fileformats.glb.scenes/nodebuilder/setrotationtrack/)(string, ICurveSampler&lt;Quaternion&gt;) |  |
| [SetScaleTrack](../../aspose.cad.fileformats.glb.scenes/nodebuilder/setscaletrack/)(string, ICurveSampler&lt;Vector3&gt;) |  |
| [SetTranslationTrack](../../aspose.cad.fileformats.glb.scenes/nodebuilder/settranslationtrack/)(string, ICurveSampler&lt;Vector3&gt;) |  |
| [UseRotation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/userotation/#userotation)() |  |
| [UseRotation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/userotation/#userotation_1)(string) |  |
| [UseScale](../../aspose.cad.fileformats.glb.scenes/nodebuilder/usescale/#usescale)() |  |
| [UseScale](../../aspose.cad.fileformats.glb.scenes/nodebuilder/usescale/#usescale_1)(string) |  |
| [UseTranslation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/usetranslation/#usetranslation)() |  |
| [UseTranslation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/usetranslation/#usetranslation_1)(string) |  |
| [WithLocalRotation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocalrotation/#withlocalrotation)(Quaternion) |  |
| [WithLocalRotation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocalrotation/#withlocalrotation_1)(string, IReadOnlyDictionary&lt;float, Quaternion&gt;) |  |
| [WithLocalScale](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocalscale/#withlocalscale)(Vector3) |  |
| [WithLocalScale](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocalscale/#withlocalscale_1)(string, IReadOnlyDictionary&lt;float, Vector3&gt;) |  |
| [WithLocalTranslation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocaltranslation/#withlocaltranslation)(Vector3) |  |
| [WithLocalTranslation](../../aspose.cad.fileformats.glb.scenes/nodebuilder/withlocaltranslation/#withlocaltranslation_1)(string, IReadOnlyDictionary&lt;float, Vector3&gt;) |  |
| static [Flatten](../../aspose.cad.fileformats.glb.scenes/nodebuilder/flatten/)(NodeBuilder) |  |
| static [IsValidArmature](../../aspose.cad.fileformats.glb.scenes/nodebuilder/isvalidarmature/)(IEnumerable&lt;NodeBuilder&gt;) | Checks if the collection of joints can be used for skinning a mesh. |

### See Also

* class [BaseBuilder](../../aspose.cad.fileformats.glb.geometry/basebuilder/)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


