---
title: KeyFrame
second_title: Aspose.3D for Java API Reference
description: A key frame is mainly defined by a time and a value for some interpolation types tangent/tension/bias/continuity is also used by calculating the final sampled value.
type: docs
weight: 82
url: /java/com.aspose.threed/keyframe/
---

**Inheritance:**
java.lang.Object
```
public class KeyFrame
```

A key frame is mainly defined by a time and a value, for some interpolation types, tangent/tension/bias/continuity is also used by calculating the final sampled value. Sampled values in a non-key-frame time position is interpolated by key-frames between the previous and next key-frames Value before/after the first/last key-frame are calculated by the [Extrapolation](../../com.aspose.threed/extrapolation) class.
## Constructors

| Constructor | Description |
| --- | --- |
| [KeyFrame(KeyframeSequence curve, double time)](#KeyFrame-com.aspose.threed.KeyframeSequence-double-) | Create a new key frame on specified curve |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBias()](#getBias--) | Gets the bias used in TCB spline |
| [getClass()](#getClass--) |  |
| [getContinuity()](#getContinuity--) | Gets the continuity used in TCB spline |
| [getFlat()](#getFlat--) | Get or set if the key frame is flat. |
| [getIndependentTangent()](#getIndependentTangent--) | Gets the out and next in tangents are independent. |
| [getInterpolation()](#getInterpolation--) | Gets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [getNextInTangent()](#getNextInTangent--) | Gets the next in(left) tangent on this key frame. |
| [getNextInWeight()](#getNextInWeight--) | Gets the next in(left) weight on this key frame. |
| [getOutTangent()](#getOutTangent--) | Gets the out(right) tangent on this key frame. |
| [getOutWeight()](#getOutWeight--) | Gets the out(right) weight on this key frame. |
| [getStepMode()](#getStepMode--) | Gets the key's step mode. |
| [getTangentWeightMode()](#getTangentWeightMode--) | Gets the key's tangent weight mode. |
| [getTension()](#getTension--) | Gets tension used in TCB spline |
| [getTime()](#getTime--) | Gets the time position of list.data[index] key frame, measured in seconds. |
| [getTimeIndependentTangent()](#getTimeIndependentTangent--) | Gets the tangent is time-independent |
| [getValue()](#getValue--) | Gets the key-frame's value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBias(float value)](#setBias-float-) | Sets the bias used in TCB spline |
| [setContinuity(float value)](#setContinuity-float-) | Sets the continuity used in TCB spline |
| [setFlat(boolean value)](#setFlat-boolean-) | Get or set if the key frame is flat. |
| [setIndependentTangent(boolean value)](#setIndependentTangent-boolean-) | Sets the out and next in tangents are independent. |
| [setInterpolation(Interpolation value)](#setInterpolation-com.aspose.threed.Interpolation-) | Sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated. |
| [setNextInTangent(Vector2 value)](#setNextInTangent-com.aspose.threed.Vector2-) | Sets the next in(left) tangent on this key frame. |
| [setNextInWeight(float value)](#setNextInWeight-float-) | Sets the next in(left) weight on this key frame. |
| [setOutTangent(Vector2 value)](#setOutTangent-com.aspose.threed.Vector2-) | Sets the out(right) tangent on this key frame. |
| [setOutWeight(float value)](#setOutWeight-float-) | Sets the out(right) weight on this key frame. |
| [setStepMode(StepMode value)](#setStepMode-com.aspose.threed.StepMode-) | Sets the key's step mode. |
| [setTangentWeightMode(int value)](#setTangentWeightMode-int-) | Sets the key's tangent weight mode. |
| [setTension(float value)](#setTension-float-) | Sets tension used in TCB spline |
| [setTime(double value)](#setTime-double-) | Sets the time position of list.data[index] key frame, measured in seconds. |
| [setTimeIndependentTangent(boolean value)](#setTimeIndependentTangent-boolean-) | Sets the tangent is time-independent |
| [setValue(float value)](#setValue-float-) | Sets the key-frame's value. |
| [toString()](#toString--) | Gets the string representation of the key frame |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBias() {#getBias--}
```
public float getBias()
```


Gets the bias used in TCB spline

**Returns:**
float
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getContinuity() {#getContinuity--}
```
public float getContinuity()
```


Gets the continuity used in TCB spline

**Returns:**
float
### getFlat() {#getFlat--}
```
public boolean getFlat()
```


Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation.

**Returns:**
boolean
### getIndependentTangent() {#getIndependentTangent--}
```
public boolean getIndependentTangent()
```


Gets the out and next in tangents are independent.

**Returns:**
boolean
### getInterpolation() {#getInterpolation--}
```
public Interpolation getInterpolation()
```


Gets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated.

**Returns:**
[Interpolation](../../com.aspose.threed/interpolation)
### getNextInTangent() {#getNextInTangent--}
```
public Vector2 getNextInTangent()
```


Gets the next in(left) tangent on this key frame.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### getNextInWeight() {#getNextInWeight--}
```
public float getNextInWeight()
```


Gets the next in(left) weight on this key frame.

**Returns:**
float
### getOutTangent() {#getOutTangent--}
```
public Vector2 getOutTangent()
```


Gets the out(right) tangent on this key frame.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### getOutWeight() {#getOutWeight--}
```
public float getOutWeight()
```


Gets the out(right) weight on this key frame.

**Returns:**
float
### getStepMode() {#getStepMode--}
```
public StepMode getStepMode()
```


Gets the key's step mode. If the interpolation type is [Interpolation.CONSTANT](../../com.aspose.threed/interpolation\#CONSTANT), list.data[index] decides which key-frame's value will be used during interpolation. A [StepMode.PREVIOUS\_VALUE](../../com.aspose.threed/stepmode\#PREVIOUS-VALUE) means the left key-frame's value will be used A [StepMode.NEXT\_VALUE](../../com.aspose.threed/stepmode\#NEXT-VALUE) means the next right key-frame's value will be used

**Returns:**
[StepMode](../../com.aspose.threed/stepmode)
### getTangentWeightMode() {#getTangentWeightMode--}
```
public int getTangentWeightMode()
```


Gets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct [WeightedMode](../../com.aspose.threed/weightedmode)

**Returns:**
int
### getTension() {#getTension--}
```
public float getTension()
```


Gets tension used in TCB spline

**Returns:**
float
### getTime() {#getTime--}
```
public double getTime()
```


Gets the time position of list.data[index] key frame, measured in seconds.

**Returns:**
double
### getTimeIndependentTangent() {#getTimeIndependentTangent--}
```
public boolean getTimeIndependentTangent()
```


Gets the tangent is time-independent

**Returns:**
boolean
### getValue() {#getValue--}
```
public float getValue()
```


Gets the key-frame's value.

**Returns:**
float
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setBias(float value) {#setBias-float-}
```
public void setBias(float value)
```


Sets the bias used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setContinuity(float value) {#setContinuity-float-}
```
public void setContinuity(float value)
```


Sets the continuity used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setFlat(boolean value) {#setFlat-boolean-}
```
public void setFlat(boolean value)
```


Get or set if the key frame is flat. Key frame should be flat if next or previous key frame has the same value. Flat key frame has flat tangents and fixed interpolation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setIndependentTangent(boolean value) {#setIndependentTangent-boolean-}
```
public void setIndependentTangent(boolean value)
```


Sets the out and next in tangents are independent.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setInterpolation(Interpolation value) {#setInterpolation-com.aspose.threed.Interpolation-}
```
public void setInterpolation(Interpolation value)
```


Sets the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Interpolation](../../com.aspose.threed/interpolation) | New value |

### setNextInTangent(Vector2 value) {#setNextInTangent-com.aspose.threed.Vector2-}
```
public void setNextInTangent(Vector2 value)
```


Sets the next in(left) tangent on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setNextInWeight(float value) {#setNextInWeight-float-}
```
public void setNextInWeight(float value)
```


Sets the next in(left) weight on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setOutTangent(Vector2 value) {#setOutTangent-com.aspose.threed.Vector2-}
```
public void setOutTangent(Vector2 value)
```


Sets the out(right) tangent on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### setOutWeight(float value) {#setOutWeight-float-}
```
public void setOutWeight(float value)
```


Sets the out(right) weight on this key frame.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setStepMode(StepMode value) {#setStepMode-com.aspose.threed.StepMode-}
```
public void setStepMode(StepMode value)
```


Sets the key's step mode. If the interpolation type is [Interpolation.CONSTANT](../../com.aspose.threed/interpolation\#CONSTANT), list.data[index] decides which key-frame's value will be used during interpolation. A [StepMode.PREVIOUS\_VALUE](../../com.aspose.threed/stepmode\#PREVIOUS-VALUE) means the left key-frame's value will be used A [StepMode.NEXT\_VALUE](../../com.aspose.threed/stepmode\#NEXT-VALUE) means the next right key-frame's value will be used

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [StepMode](../../com.aspose.threed/stepmode) | New value |

### setTangentWeightMode(int value) {#setTangentWeightMode-int-}
```
public void setTangentWeightMode(int value)
```


Sets the key's tangent weight mode. The out tangent or the next in tangent can be customized by select correct [WeightedMode](../../com.aspose.threed/weightedmode)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setTension(float value) {#setTension-float-}
```
public void setTension(float value)
```


Sets tension used in TCB spline

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setTime(double value) {#setTime-double-}
```
public void setTime(double value)
```


Sets the time position of list.data[index] key frame, measured in seconds.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setTimeIndependentTangent(boolean value) {#setTimeIndependentTangent-boolean-}
```
public void setTimeIndependentTangent(boolean value)
```


Sets the tangent is time-independent

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setValue(float value) {#setValue-float-}
```
public void setValue(float value)
```


Sets the key-frame's value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the key frame

**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

