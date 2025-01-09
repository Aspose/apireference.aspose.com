---
title: Class AnimationChannel
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.AnimationChannel class. A channel maps propertys component field to a set of keyframe sequences
type: docs
weight: 20
url: /net/aspose.threed.animation/animationchannel/
---
## AnimationChannel class

A channel maps property's component field to a set of keyframe sequences

```csharp
public class AnimationChannel : KeyframeSequence
```

## Properties

| Name | Description |
| --- | --- |
| [BindPoint](../../aspose.threed.animation/keyframesequence/bindpoint/) { get; } | Gets the property bind point which owns this curve(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [ComponentType](../../aspose.threed.animation/animationchannel/componenttype/) { get; } | Gets the component field's type |
| [DefaultValue](../../aspose.threed.animation/animationchannel/defaultvalue/) { get; set; } | Gets or sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation. |
| [KeyFrames](../../aspose.threed.animation/keyframesequence/keyframes/) { get; } | Gets the key frames of this curve.(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [KeyframeSequence](../../aspose.threed.animation/animationchannel/keyframesequence/) { get; set; } | Gets associated keyframe sequence inside this channel |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [PostBehavior](../../aspose.threed.animation/keyframesequence/postbehavior/) { get; } | Gets the post behavior indicates what the sampled value should be after the last key frame.(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [PreBehavior](../../aspose.threed.animation/keyframesequence/prebehavior/) { get; } | Gets the pre behavior indicates what the sampled value should be before the first key.(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.threed.animation/keyframesequence/add/)(double, float) | Create a new key frame with specified value(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [Add](../../aspose.threed.animation/keyframesequence/add/)(double, float, Interpolation) | Create a new key frame with specified value(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetEnumerator](../../aspose.threed.animation/keyframesequence/getenumerator/)() | Gets the enumerator to traverse all key frames.(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Reset](../../aspose.threed.animation/keyframesequence/reset/)() | Removes all key frames and reset the post/pre behaviors.(Inherited from [`KeyframeSequence`](../keyframesequence/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [KeyframeSequence](../keyframesequence/)
* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


