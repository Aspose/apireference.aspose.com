---
title: KeyframeSequence
second_title: Aspose.3D for Java API Reference
description: The sequence of key-frames it describes the transformation of a sampled value over time.
type: docs
weight: 80
url: /java/com.aspose.threed/keyframesequence/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public class KeyframeSequence extends A3DObject implements Iterable<KeyFrame>
```

The sequence of key-frames, it describes the transformation of a sampled value over time.
## Constructors

| Constructor | Description |
| --- | --- |
| [KeyframeSequence(String name)](#KeyframeSequence-java.lang.String-) | Initializes a new instance of the com.aspose.threed.KeyframeSequence class. |
| [KeyframeSequence()](#KeyframeSequence--) | Initializes a new instance of the com.aspose.threed.KeyframeSequence class. |
## Methods

| Method | Description |
| --- | --- |
| [getBindPoint()](#getBindPoint--) | Gets the property bind point which owns this curve |
| [getKeyFrames()](#getKeyFrames--) | Gets the key frames of this curve. |
| [getPostBehavior()](#getPostBehavior--) | Gets the post behavior indicates what the sampled value should be after the last key frame. |
| [getPreBehavior()](#getPreBehavior--) | Gets the pre behavior indicates what the sampled value should be before the first key. |
| [add(double time, float value)](#add-double-float-) | Create a new key frame with specified value |
| [add(double time, float value, Interpolation interpolation)](#add-double-float-com.aspose.threed.Interpolation-) | Create a new key frame with specified value |
| [reset()](#reset--) | Removes all key frames and reset the post/pre behaviors. |
| [iterator()](#iterator--) | Gets the enumerator to traverse all key frames. |
### KeyframeSequence(String name) {#KeyframeSequence-java.lang.String-}
```
public KeyframeSequence(String name)
```


Initializes a new instance of the com.aspose.threed.KeyframeSequence class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### KeyframeSequence() {#KeyframeSequence--}
```
public KeyframeSequence()
```


Initializes a new instance of the com.aspose.threed.KeyframeSequence class.

### getBindPoint() {#getBindPoint--}
```
public BindPoint getBindPoint()
```


Gets the property bind point which owns this curve

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint)
### getKeyFrames() {#getKeyFrames--}
```
public List<KeyFrame> getKeyFrames()
```


Gets the key frames of this curve.

**Returns:**
java.util.List<com.aspose.threed.KeyFrame>
### getPostBehavior() {#getPostBehavior--}
```
public Extrapolation getPostBehavior()
```


Gets the post behavior indicates what the sampled value should be after the last key frame.

**Returns:**
[Extrapolation](../../com.aspose.threed/extrapolation)
### getPreBehavior() {#getPreBehavior--}
```
public Extrapolation getPreBehavior()
```


Gets the pre behavior indicates what the sampled value should be before the first key.

**Returns:**
[Extrapolation](../../com.aspose.threed/extrapolation)
### add(double time, float value) {#add-double-float-}
```
public void add(double time, float value)
```


Create a new key frame with specified value

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| time | double | Time position(measured in seconds) |
| value | float | The value at this time position |

### add(double time, float value, Interpolation interpolation) {#add-double-float-com.aspose.threed.Interpolation-}
```
public void add(double time, float value, Interpolation interpolation)
```


Create a new key frame with specified value

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| time | double | Time position(measured in seconds) |
| value | float | The value at this time position |
| interpolation | [Interpolation](../../com.aspose.threed/interpolation) | The interpolation type of this key frame |

### reset() {#reset--}
```
public void reset()
```


Removes all key frames and reset the post/pre behaviors.

### iterator() {#iterator--}
```
public Iterator<KeyFrame> iterator()
```


Gets the enumerator to traverse all key frames.

**Returns:**
java.util.Iterator<com.aspose.threed.KeyFrame>
