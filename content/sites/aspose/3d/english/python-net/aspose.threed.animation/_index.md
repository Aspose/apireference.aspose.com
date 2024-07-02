---
title: aspose.threed.animation
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.animation/
is_root: false
---

The animation namespace of Aspose.3D, all animation related classes are defined in this namespace

### Classes
| Class | Description |
| :- | :- |
| [`AnimationChannel`](/3d/python-net/aspose.threed.animation/animationchannel) | A channel maps property's component field to a set of keyframe sequences |
| [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) | The Animation clip is a collection of animations.<br/>The scene can have one or more animation clips. |
| [`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) | Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition.<br/><br/>[`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [`A3DObject`](/3d/python-net/aspose.threed/a3dobject) object's numerical properties. |
| [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) | A [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field),<br/>[`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels. |
| [`Extrapolation`](/3d/python-net/aspose.threed.animation/extrapolation) | Extrapolation defines how to do when sampled value is out of the range which defined by the first and last key-frames. |
| [`KeyFrame`](/3d/python-net/aspose.threed.animation/keyframe) | A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value.<br/>Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames<br/>Value before/after the first/last key-frame are calculated by the [`Extrapolation`](/3d/python-net/aspose.threed.animation/extrapolation) class. |
| [`KeyframeSequence`](/3d/python-net/aspose.threed.animation/keyframesequence) | The sequence of key-frames, it describes the transformation of a sampled value over time. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`ExtrapolationType`](/3d/python-net/aspose.threed.animation/extrapolationtype) | Extrapolation type. |
| [`Interpolation`](/3d/python-net/aspose.threed.animation/interpolation) | The key frame's interpolation type. |
| [`StepMode`](/3d/python-net/aspose.threed.animation/stepmode) | Interpolation step mode. |
| [`WeightedMode`](/3d/python-net/aspose.threed.animation/weightedmode) | Weighted mode. |


