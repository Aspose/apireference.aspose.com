---
title: Class Animation
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Animation class. A keyframe animation
type: docs
weight: 9660
url: /net/aspose.cad.fileformats.glb/animation/
---
## Animation class

A keyframe animation.

```csharp
public sealed class Animation : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [Channels](../../aspose.cad.fileformats.glb/animation/channels/) { get; } |  |
| [Duration](../../aspose.cad.fileformats.glb/animation/duration/) { get; } |  |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |

## Methods

| Name | Description |
| --- | --- |
| [CreateMorphChannel](../../aspose.cad.fileformats.glb/animation/createmorphchannel/#createmorphchannel_1)(Node, IReadOnlyDictionary&lt;float, (SparseWeight8 TangentIn, SparseWeight8 Value, SparseWeight8 TangentOut)&gt;, int) |  |
| [CreateMorphChannel](../../aspose.cad.fileformats.glb/animation/createmorphchannel/#createmorphchannel)(Node, IReadOnlyDictionary&lt;float, SparseWeight8&gt;, int, bool) |  |
| [CreateMorphChannel&lt;TWeights&gt;](../../aspose.cad.fileformats.glb/animation/createmorphchannel/#createmorphchannel_2)(Node, IReadOnlyDictionary&lt;float, (TWeights TangentIn, TWeights Value, TWeights TangentOut)&gt;, int) |  |
| [CreateMorphChannel&lt;TWeights&gt;](../../aspose.cad.fileformats.glb/animation/createmorphchannel/#createmorphchannel_3)(Node, IReadOnlyDictionary&lt;float, TWeights&gt;, int, bool) |  |
| [CreateRotationChannel](../../aspose.cad.fileformats.glb/animation/createrotationchannel/#createrotationchannel_1)(Node, IReadOnlyDictionary&lt;float, (Quaternion TangentIn, Quaternion Value, Quaternion TangentOut)&gt;) |  |
| [CreateRotationChannel](../../aspose.cad.fileformats.glb/animation/createrotationchannel/#createrotationchannel)(Node, IReadOnlyDictionary&lt;float, Quaternion&gt;, bool) |  |
| [CreateScaleChannel](../../aspose.cad.fileformats.glb/animation/createscalechannel/#createscalechannel_1)(Node, IReadOnlyDictionary&lt;float, (Vector3 TangentIn, Vector3 Value, Vector3 TangentOut)&gt;) |  |
| [CreateScaleChannel](../../aspose.cad.fileformats.glb/animation/createscalechannel/#createscalechannel)(Node, IReadOnlyDictionary&lt;float, Vector3&gt;, bool) |  |
| [CreateTranslationChannel](../../aspose.cad.fileformats.glb/animation/createtranslationchannel/#createtranslationchannel_1)(Node, IReadOnlyDictionary&lt;float, (Vector3 TangentIn, Vector3 Value, Vector3 TangentOut)&gt;) |  |
| [CreateTranslationChannel](../../aspose.cad.fileformats.glb/animation/createtranslationchannel/#createtranslationchannel)(Node, IReadOnlyDictionary&lt;float, Vector3&gt;, bool) |  |
| [FindChannels](../../aspose.cad.fileformats.glb/animation/findchannels/)(Node) |  |
| [FindMorphChannel](../../aspose.cad.fileformats.glb/animation/findmorphchannel/)(Node) |  |
| [FindRotationChannel](../../aspose.cad.fileformats.glb/animation/findrotationchannel/)(Node) |  |
| [FindScaleChannel](../../aspose.cad.fileformats.glb/animation/findscalechannel/)(Node) |  |
| [FindTranslationChannel](../../aspose.cad.fileformats.glb/animation/findtranslationchannel/)(Node) |  |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


