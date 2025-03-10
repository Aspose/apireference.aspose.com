---
title: KeyFrame class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.animation/keyframe/
is_root: false
---

## KeyFrame class

A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value.
Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames
Value before/after the first/last key-frame are calculated by the [`Extrapolation`](/3d/python-net/aspose.threed.animation/extrapolation) class.



The KeyFrame type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, curve, time)`](/3d/python-net/aspose.threed.animation/keyframe/__init__/#aspose.threed.animation.keyframesequence-float) | Create a new key frame on specified curve |


### Properties
| Property | Description |
| :- | :- |
| [time](/3d/python-net/aspose.threed.animation/keyframe/time) | Gets or sets the time position of list.data[index] key frame, measured in seconds. |
| [value](/3d/python-net/aspose.threed.animation/keyframe/value) | Gets or sets the key-frame's value. |
| [interpolation](/3d/python-net/aspose.threed.animation/keyframe/interpolation) | Gets or sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [tangent_weight_mode](/3d/python-net/aspose.threed.animation/keyframe/tangent_weight_mode) | Gets or sets the key's tangent weight mode.<br/>The out tangent or the next in tangent can be customized by select correct [`WeightedMode`](/3d/python-net/aspose.threed.animation/weightedmode) |
| [step_mode](/3d/python-net/aspose.threed.animation/keyframe/step_mode) | Gets or sets the key's step mode.<br/>If the interpolation type is [`Interpolation.CONSTANT`](/3d/python-net/aspose.threed.animation/interpolation#CONSTANT), list.data[index] decides which key-frame's value will be used during interpolation.  <br/>A [`StepMode.PREVIOUS_VALUE`](/3d/python-net/aspose.threed.animation/stepmode#PREVIOUS_VALUE) means the left key-frame's value will be used  <br/>A [`StepMode.NEXT_VALUE`](/3d/python-net/aspose.threed.animation/stepmode#NEXT_VALUE) means the next right key-frame's value will be used |
| [next_in_tangent](/3d/python-net/aspose.threed.animation/keyframe/next_in_tangent) | Gets or sets the next in(left) tangent on this key frame. |
| [out_tangent](/3d/python-net/aspose.threed.animation/keyframe/out_tangent) | Gets or sets the out(right) tangent on this key frame. |
| [out_weight](/3d/python-net/aspose.threed.animation/keyframe/out_weight) | Gets or sets the out(right) weight on this key frame. |
| [next_in_weight](/3d/python-net/aspose.threed.animation/keyframe/next_in_weight) | Gets or sets the next in(left) weight on this key frame. |
| [tension](/3d/python-net/aspose.threed.animation/keyframe/tension) | Gets or sets tension used in TCB spline |
| [continuity](/3d/python-net/aspose.threed.animation/keyframe/continuity) | Gets or sets the continuity used in TCB spline |
| [bias](/3d/python-net/aspose.threed.animation/keyframe/bias) | Gets or sets the bias used in TCB spline |
| [independent_tangent](/3d/python-net/aspose.threed.animation/keyframe/independent_tangent) | Gets or sets the out and next in tangents are independent. |
| [flat](/3d/python-net/aspose.threed.animation/keyframe/flat) | Get or set if the key frame is flat.<br/>Key frame should be flat if next or previous key frame has the same value.<br/>Flat key frame has flat tangents and fixed interpolation. |
| [time_independent_tangent](/3d/python-net/aspose.threed.animation/keyframe/time_independent_tangent) | Gets or sets the tangent is time-independent |



### See Also
* module [`aspose.threed.animation`](..)
* class [`Extrapolation`](/3d/python-net/aspose.threed.animation/extrapolation)
* class [`WeightedMode`](/3d/python-net/aspose.threed.animation/weightedmode)
