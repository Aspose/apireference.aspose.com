---
title: KeyFrame
second_title: Aspose.3D for Java API Reference
description: A key frame is mainly defined by a time and a value for some interpolation types tangent/tension/bias/continuity is also used by calculating the final sampled value.
type: docs
weight: 79
url: /java/com.aspose.threed/keyframe/
---

**Inheritance:**
java.lang.Object
```
public class KeyFrame
```

A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value. Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames Value before/after the first/last key-frame are calculated by the com.aspose.threed.Extrapolation class.
## Constructors

| Constructor | Description |
| --- | --- |
| [KeyFrame(KeyframeSequence curve, double time)](#KeyFrame-com.aspose.threed.KeyframeSequence-double-) | Create a new key frame on specified curve |
## Methods

| Method | Description |
| --- | --- |
| [toString()](#toString--) | Gets the string representation of the key frame |
| [getTime()](#getTime--) | Gets the time position of list.data[index] key frame, measured in seconds. |
| [setTime(double value)](#setTime-double-) | Sets the time position of list.data[index] key frame, measured in seconds. |
| [getValue()](#getValue--) | Gets the key-frame's value. |
| [setValue(float value)](#setValue-float-) | Sets the key-frame's value. |
| [getInterpolation()](#getInterpolation--) | Gets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [setInterpolation(Interpolation value)](#setInterpolation-com.aspose.threed.Interpolation-) | Sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [getTangentWeightMode()](#getTangentWeightMode--) | Gets the key's tangent weight mode. |
| [setTangentWeightMode(int value)](#setTangentWeightMode-int-) | Sets the key's tangent weight mode. |
| [getStepMode()](#getStepMode--) | Gets the key's step mode. |
| [setStepMode(StepMode value)](#setStepMode-com.aspose.threed.StepMode-) | Sets the key's step mode. |
| [getNextInTangent()](#getNextInTangent--) | Gets the next in(left) tangent on this key frame. |
| [setNextInTangent(Vector2 value)](#setNextInTangent-com.aspose.threed.Vector2-) | Sets the next in(left) tangent on this key frame. |
| [getOutTangent()](#getOutTangent--) | Gets the out(right) tangent on this key frame. |
| [setOutTangent(Vector2 value)](#setOutTangent-com.aspose.threed.Vector2-) | Sets the out(right) tangent on this key frame. |
| [getOutWeight()](#getOutWeight--) | Gets the out(right) weight on this key frame. |
| [setOutWeight(float value)](#setOutWeight-float-) | Sets the out(right) weight on this key frame. |
| [getNextInWeight()](#getNextInWeight--) | Gets the next in(left) weight on this key frame. |
| [setNextInWeight(float value)](#setNextInWeight-float-) | Sets the next in(left) weight on this key frame. |
| [getTension()](#getTension--) | Gets tension used in TCB spline |
| [setTension(float value)](#setTension-float-) | Sets tension used in TCB spline |
| [getContinuity()](#getContinuity--) | Gets the continuity used in TCB spline |
| [setContinuity(float value)](#setContinuity-float-) | Sets the continuity used in TCB spline |
| [getBias()](#getBias--) | Gets the bias used in TCB spline |
| [setBias(float value)](#setBias-float-) | Sets the bias used in TCB spline |
| [getIndependentTangent()](#getIndependentTangent--) | Gets the out and next in tangents are independent. |
| [setIndependentTangent(boolean value)](#setIndependentTangent-boolean-) | Sets the out and next in tangents are independent. |
| [getFlat()](#getFlat--) | Get or set if the key frame is flat. |
| [setFlat(boolean value)](#setFlat-boolean-) | Get or set if the key frame is flat. |
| [getTimeIndependentTangent()](#getTimeIndependentTangent--) | Gets the tangent is time-independent |
| [setTimeIndependentTangent(boolean value)](#setTimeIndependentTangent-boolean-) | Sets the tangent is time-independent |
### KeyFrame(KeyframeSequence curve, double time) {#KeyFrame-com.aspose.threed.KeyframeSequence-double-}
```
public KeyFrame(KeyframeSequence curve, double time)
```


Create a new key frame on specified curve

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| curve | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | The curve that the key frame will be created on |
| time | double | The time position of the key frame |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the key frame

**Returns:**
java.lang.String
### getTime() {#getTime--}
```
public double getTime()
```


Gets the time position of list.data[index] key frame, measured in seconds.

**Returns:**
double
### setTime(double value) {#setTime-double-}
```
public void setTime(double value)
```


Sets the time position of list.data[index] key frame, measured in seconds.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getValue() {#getValue--}
```
public float getValue()
```


Gets the key-frame's value.

**Returns:**
float
### setValue(float value) {#setValue-float-}
```
public void setValue(float value)
```


Sets the key-frame's value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getInterpolation() {#getInterpolation--}
```
public Interpolation getInterpolation()
```


Gets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated.

**Returns:**
[Interpolation](../../com.aspose.threed/interpolation)
### setInterpolation(Interpolation value) {#setInterpolation-com.aspose.threed.Interpolation-}
```
public void setInterpolation(Interpolation value)
```


Sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Interpolation](../../com.aspose.threed/interpolation) | New value |

### getTangentWeightMode() {#getTangentWeightMode--}
```
public int getTangentWeightMode()
```


Gets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct com.aspose.threed.WeightedMode

**Returns:**
int
### setTangentWeightMode(int value) {#setTangentWeightMode-int-}
```
public void setTangentWeightMode(int value)
```


Sets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct com.aspose.threed.WeightedMode

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getStepMode() {#getStepMode--}
```
public StepMode getStepMode()
```


Gets the key's step mode. If the interpolation type is com.aspose.threed.Interpolation\#CONSTANT, list.data[index] decides which key-frame's value will be used during interpolation. A com.aspose.threed.StepMode\#PREVIOUS\_VALUE means the left key-frame's value will be used A com.aspose.threed.StepMode\#NEXT\_VALUE means the next right key-frame's value will be used

**Returns:**
[StepMode](../../com.aspose.threed/stepmode)
### setStepMode(StepMode value) {#setStepMode-com.aspose.threed.StepMode-}
```
public void setStepMode(StepMode value)
```


Sets the key's step mode. If the interpolation type is com.aspose.threed.Interpolation\#CONSTANT, list.data[index] decides which key-frame's value will be used during interpolation. A com.aspose.threed.StepMode\#PREVIOUS\_VALUE means the left key-frame's value will be used A com.aspose.threed.StepMode\#NEXT\_VALUE means the next right key-frame's value will be used

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [StepMode](../../com.aspose.threed/stepmode) | New value |

### getNextInTangent() {#getNextInTangent--}
```
public Vector2 getNextInTangent()
```


Gets the next in(left) tangent on this key frame.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setNextInTangent(Vector2 value) {#setNextInTangent-com.aspose.threed.Vector2-}
```
public void setNextInTangent(Vector2 value)
```


Sets the next in(left) tangent on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getOutTangent() {#getOutTangent--}
```
public Vector2 getOutTangent()
```


Gets the out(right) tangent on this key frame.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setOutTangent(Vector2 value) {#setOutTangent-com.aspose.threed.Vector2-}
```
public void setOutTangent(Vector2 value)
```


Sets the out(right) tangent on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getOutWeight() {#getOutWeight--}
```
public float getOutWeight()
```


Gets the out(right) weight on this key frame.

**Returns:**
float
### setOutWeight(float value) {#setOutWeight-float-}
```
public void setOutWeight(float value)
```


Sets the out(right) weight on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getNextInWeight() {#getNextInWeight--}
```
public float getNextInWeight()
```


Gets the next in(left) weight on this key frame.

**Returns:**
float
### setNextInWeight(float value) {#setNextInWeight-float-}
```
public void setNextInWeight(float value)
```


Sets the next in(left) weight on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getTension() {#getTension--}
```
public float getTension()
```


Gets tension used in TCB spline

**Returns:**
float
### setTension(float value) {#setTension-float-}
```
public void setTension(float value)
```


Sets tension used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getContinuity() {#getContinuity--}
```
public float getContinuity()
```


Gets the continuity used in TCB spline

**Returns:**
float
### setContinuity(float value) {#setContinuity-float-}
```
public void setContinuity(float value)
```


Sets the continuity used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getBias() {#getBias--}
```
public float getBias()
```


Gets the bias used in TCB spline

**Returns:**
float
### setBias(float value) {#setBias-float-}
```
public void setBias(float value)
```


Sets the bias used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getIndependentTangent() {#getIndependentTangent--}
```
public boolean getIndependentTangent()
```


Gets the out and next in tangents are independent.

**Returns:**
boolean
### setIndependentTangent(boolean value) {#setIndependentTangent-boolean-}
```
public void setIndependentTangent(boolean value)
```


Sets the out and next in tangents are independent.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getFlat() {#getFlat--}
```
public boolean getFlat()
```


Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation.

**Returns:**
boolean
### setFlat(boolean value) {#setFlat-boolean-}
```
public void setFlat(boolean value)
```


Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getTimeIndependentTangent() {#getTimeIndependentTangent--}
```
public boolean getTimeIndependentTangent()
```


Gets the tangent is time-independent

**Returns:**
boolean
### setTimeIndependentTangent(boolean value) {#setTimeIndependentTangent-boolean-}
```
public void setTimeIndependentTangent(boolean value)
```


Sets the tangent is time-independent

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

