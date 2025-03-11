---
title: Class KeyFrame
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Animation.KeyFrame class. A key frame is mainly defined by a time and a value for some interpolation types tangent/tension/bias/continuity is also used by calculating the final sampled value. Sampled values in a nonkeyframe time position is interpolated by keyframes between the previous and next keyframes Value before/after the first/last keyframe are calculated by the Extrapolation class
type: docs
weight: 90
url: /net/aspose.threed.animation/keyframe/
---
## KeyFrame class

A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value. Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames Value before/after the first/last key-frame are calculated by the [`Extrapolation`](../extrapolation/) class.

```csharp
public class KeyFrame
```

## Constructors

| Name | Description |
| --- | --- |
| [KeyFrame](keyframe/)(KeyframeSequence, double) | Create a new key frame on specified curve |

## Properties

| Name | Description |
| --- | --- |
| [Bias](../../aspose.threed.animation/keyframe/bias/) { get; set; } | Gets or sets the bias used in TCB spline |
| [Continuity](../../aspose.threed.animation/keyframe/continuity/) { get; set; } | Gets or sets the continuity used in TCB spline |
| [Flat](../../aspose.threed.animation/keyframe/flat/) { get; set; } | Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation. |
| [IndependentTangent](../../aspose.threed.animation/keyframe/independenttangent/) { get; set; } | Gets or sets the out and next in tangents are independent. |
| [Interpolation](../../aspose.threed.animation/keyframe/interpolation/) { get; set; } | Gets or sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [NextInTangent](../../aspose.threed.animation/keyframe/nextintangent/) { get; set; } | Gets or sets the next in(left) tangent on this key frame. |
| [NextInWeight](../../aspose.threed.animation/keyframe/nextinweight/) { get; set; } | Gets or sets the next in(left) weight on this key frame. |
| [OutTangent](../../aspose.threed.animation/keyframe/outtangent/) { get; set; } | Gets or sets the out(right) tangent on this key frame. |
| [OutWeight](../../aspose.threed.animation/keyframe/outweight/) { get; set; } | Gets or sets the out(right) weight on this key frame. |
| [StepMode](../../aspose.threed.animation/keyframe/stepmode/) { get; set; } | Gets or sets the key's step mode. If the interpolation type is Constant, list.data[index] decides which key-frame's value will be used during interpolation. A PreviousValue means the left key-frame's value will be used A NextValue means the next right key-frame's value will be used |
| [TangentWeightMode](../../aspose.threed.animation/keyframe/tangentweightmode/) { get; set; } | Gets or sets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct [`WeightedMode`](../weightedmode/) |
| [Tension](../../aspose.threed.animation/keyframe/tension/) { get; set; } | Gets or sets tension used in TCB spline |
| [Time](../../aspose.threed.animation/keyframe/time/) { get; set; } | Gets or sets the time position of list.data[index] key frame, measured in seconds. |
| [TimeIndependentTangent](../../aspose.threed.animation/keyframe/timeindependenttangent/) { get; set; } | Gets or sets the tangent is time-independent |
| [Value](../../aspose.threed.animation/keyframe/value/) { get; set; } | Gets or sets the key-frame's value. |

## Methods

| Name | Description |
| --- | --- |
| override [ToString](../../aspose.threed.animation/keyframe/tostring/)() | Gets the string representation of the key frame |

### See Also

* namespace [Aspose.ThreeD.Animation](../../aspose.threed.animation/)
* assembly [Aspose.3D](../../)


