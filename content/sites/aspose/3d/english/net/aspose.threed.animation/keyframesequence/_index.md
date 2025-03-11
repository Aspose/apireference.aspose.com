---
title: Class KeyframeSequence
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.KeyframeSequence class. The sequence of keyframes it describes the transformation of a sampled value over time
type: docs
weight: 100
url: /net/aspose.threed.animation/keyframesequence/
---
## KeyframeSequence class

The sequence of key-frames, it describes the transformation of a sampled value over time.

```csharp
public class KeyframeSequence : A3DObject, IEnumerable<KeyFrame>
```

## Constructors

| Name | Description |
| --- | --- |
| [KeyframeSequence](keyframesequence/#constructor)() | Initializes a new instance of the `KeyframeSequence` class. |
| [KeyframeSequence](keyframesequence/#constructor_1)(string) | Initializes a new instance of the `KeyframeSequence` class. |

## Properties

| Name | Description |
| --- | --- |
| [BindPoint](../../aspose.threed.animation/keyframesequence/bindpoint/) { get; } | Gets the property bind point which owns this curve |
| [KeyFrames](../../aspose.threed.animation/keyframesequence/keyframes/) { get; } | Gets the key frames of this curve. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [PostBehavior](../../aspose.threed.animation/keyframesequence/postbehavior/) { get; } | Gets the post behavior indicates what the sampled value should be after the last key frame. |
| [PreBehavior](../../aspose.threed.animation/keyframesequence/prebehavior/) { get; } | Gets the pre behavior indicates what the sampled value should be before the first key. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.threed.animation/keyframesequence/add/#add)(double, float) | Create a new key frame with specified value |
| [Add](../../aspose.threed.animation/keyframesequence/add/#add_1)(double, float, Interpolation) | Create a new key frame with specified value |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetEnumerator](../../aspose.threed.animation/keyframesequence/getenumerator/)() | Gets the enumerator to traverse all key frames. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [Reset](../../aspose.threed.animation/keyframesequence/reset/)() | Removes all key frames and reset the post/pre behaviors. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [A3DObject](../../aspose.threed/a3dobject/)
* class [KeyFrame](../keyframe/)
* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


