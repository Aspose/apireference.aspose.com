---
title: Class AnimationChannel
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.AnimationChannel class. A channel maps propertys component field to a set of keyframe sequences
type: docs
weight: 2710
url: /net/aspose.threed.animation/animationchannel/
---
## AnimationChannel class

A channel maps property's component field to a set of keyframe sequences

```csharp
public class AnimationChannel : IEnumerable<KeyframeSequence>
```

## Properties

| Name | Description |
| --- | --- |
| [ComponentType](../../aspose.threed.animation/animationchannel/componenttype/) { get; } | Gets the component field's type |
| [DefaultValue](../../aspose.threed.animation/animationchannel/defaultvalue/) { get; set; } | Gets or sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation. |
| [KeyframeSequence](../../aspose.threed.animation/animationchannel/keyframesequence/) { get; set; } | Gets associated keyframe sequence inside this channel |
| [Name](../../aspose.threed.animation/animationchannel/name/) { get; } | Gets the name of the channel |

## Methods

| Name | Description |
| --- | --- |
| [GetEnumerator](../../aspose.threed.animation/animationchannel/getenumerator/)() | Gets an enumerator to walk through all keyframe sequences inside this channel |

### See Also

* class [KeyframeSequence](../keyframesequence/)
* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


