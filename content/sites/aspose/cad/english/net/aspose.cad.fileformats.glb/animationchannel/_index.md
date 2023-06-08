---
title: Class AnimationChannel
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.AnimationChannel class. An animation channel combines an animation sampler with a target property being animated
type: docs
weight: 9670
url: /net/aspose.cad.fileformats.glb/animationchannel/
---
## AnimationChannel class

An animation channel combines an animation sampler with a target property being animated.

```csharp
public sealed class AnimationChannel : ExtraProperties, IChildOf<Animation>
```

## Properties

| Name | Description |
| --- | --- |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/animationchannel/logicalindex/) { get; } | Gets the zero-based index of this [`Animation`](../animation/) at !:GlbImage.LogicalAnimations |
| [LogicalParent](../../aspose.cad.fileformats.glb/animationchannel/logicalparent/) { get; } | Gets the [`Animation`](../animation/) instance that owns this object. |
| [TargetNode](../../aspose.cad.fileformats.glb/animationchannel/targetnode/) { get; } | Gets the [`Node`](../node/) which property is to be bound with this animation. |
| [TargetNodePath](../../aspose.cad.fileformats.glb/animationchannel/targetnodepath/) { get; } | Gets which property of the [`Node`](../node/) pointed by [`TargetNode`](./targetnode/) is to be bound with this animation. |

## Methods

| Name | Description |
| --- | --- |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetMorphSampler](../../aspose.cad.fileformats.glb/animationchannel/getmorphsampler/)() |  |
| [GetRotationSampler](../../aspose.cad.fileformats.glb/animationchannel/getrotationsampler/)() |  |
| [GetScaleSampler](../../aspose.cad.fileformats.glb/animationchannel/getscalesampler/)() |  |
| [GetSparseMorphSampler](../../aspose.cad.fileformats.glb/animationchannel/getsparsemorphsampler/)() |  |
| [GetTranslationSampler](../../aspose.cad.fileformats.glb/animationchannel/gettranslationsampler/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [ExtraProperties](../extraproperties/)
* interface [IChildOf&lt;TParent&gt;](../../aspose.cad.fileformats.glb.collections/ichildof-1/)
* class [Animation](../animation/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


