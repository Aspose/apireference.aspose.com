---
title: Aspose.ThreeD.Animation
second_title: Aspose.3D for .NET API Reference
description: The animation namespace of Aspose.3D all animation related classes are defined in this namespace
type: docs
weight: 20
url: /net/aspose.threed.animation/
---
The animation namespace of Aspose.3D, all animation related classes are defined in this namespace

## Classes

| Class | Description |
| --- | --- |
| [AnimationChannel](./animationchannel/) | A channel maps property's component field to a set of keyframe sequences |
| [AnimationClip](./animationclip/) | The Animation clip is a collection of animations. The scene can have one or more animation clips. |
| [AnimationNode](./animationnode/) | Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition. [`AnimationNode`](../aspose.threed.animation/animationnode/) defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [`A3DObject`](../aspose.threed/a3dobject/) object's numerical properties. |
| [BindPoint](./bindpoint/) | A [`BindPoint`](../aspose.threed.animation/bindpoint/) is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field), [`BindPoint`](../aspose.threed.animation/bindpoint/) will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels. |
| [Extrapolation](./extrapolation/) | Extrapolation defines how to do when sampled value is out of the range which defined by the first and last key-frames. |
| [KeyFrame](./keyframe/) | A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value. Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames Value before/after the first/last key-frame are calculated by the [`Extrapolation`](../aspose.threed.animation/extrapolation/) class. |
| [KeyframeSequence](./keyframesequence/) | The sequence of key-frames, it describes the transformation of a sampled value over time. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [ExtrapolationType](./extrapolationtype/) | Extrapolation type. |
| [Interpolation](./interpolation/) | The key frame's interpolation type. |
| [StepMode](./stepmode/) | Interpolation step mode. |
| [WeightedMode](./weightedmode/) | Weighted mode. |


