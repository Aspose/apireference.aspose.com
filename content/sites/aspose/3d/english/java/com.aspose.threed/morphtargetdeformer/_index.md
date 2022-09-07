---
title: MorphTargetDeformer
second_title: Aspose.3D for Java API Reference
description: MorphTargetDeformer provides per-vertex animation.
type: docs
weight: 97
url: /java/com.aspose.threed/morphtargetdeformer/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Deformer](../../com.aspose.threed/deformer)
```
public class MorphTargetDeformer extends Deformer
```

MorphTargetDeformer provides per-vertex animation. MorphTargetDeformer organize all targets via com.aspose.threed.MorphTargetChannel, each channel can organize multiple targets. A common use of morph target deformer is to apply facial expression to a character. More details can be found at https://en.wikipedia.org/wiki/Morph\_target\_animation
## Constructors

| Constructor | Description |
| --- | --- |
| [MorphTargetDeformer(String name)](#MorphTargetDeformer-java.lang.String-) | Initializes a new instance of the com.aspose.threed.MorphTargetDeformer class. |
| [MorphTargetDeformer()](#MorphTargetDeformer--) | Initializes a new instance of the com.aspose.threed.MorphTargetDeformer class. |
## Methods

| Method | Description |
| --- | --- |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Gets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel. |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Sets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel. |
| [getChannels()](#getChannels--) | Gets all channels contained in this deformer |
### MorphTargetDeformer(String name) {#MorphTargetDeformer-java.lang.String-}
```
public MorphTargetDeformer(String name)
```


Initializes a new instance of the com.aspose.threed.MorphTargetDeformer class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### MorphTargetDeformer() {#MorphTargetDeformer--}
```
public MorphTargetDeformer()
```


Initializes a new instance of the com.aspose.threed.MorphTargetDeformer class.

### get(Shape target) {#get-com.aspose.threed.Shape-}
```
public double get(Shape target)
```


Gets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry |

**Returns:**
double - Weight
### set(Shape target, double value) {#set-com.aspose.threed.Shape-double-}
```
public void set(Shape target, double value)
```


Sets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry |
| value | double | New value |

### getChannels() {#getChannels--}
```
public List<MorphTargetChannel> getChannels()
```


Gets all channels contained in this deformer

**Returns:**
java.util.List<com.aspose.threed.MorphTargetChannel>
