---
title: MorphTargetChannel
second_title: Aspose.3D for Java API Reference
description: A MorphTargetChannel is used by com.aspose.threed.MorphTargetDeformer to organize the target geometries.
type: docs
weight: 96
url: /java/com.aspose.threed/morphtargetchannel/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class MorphTargetChannel extends A3DObject
```

A MorphTargetChannel is used by com.aspose.threed.MorphTargetDeformer to organize the target geometries. Some file formats like FBX support multiple channels in parallel.
## Constructors

| Constructor | Description |
| --- | --- |
| [MorphTargetChannel(String name)](#MorphTargetChannel-java.lang.String-) | Initializes a new instance of the com.aspose.threed.MorphTargetChannel class. |
| [MorphTargetChannel()](#MorphTargetChannel--) | Initializes a new instance of the com.aspose.threed.MorphTargetChannel class. |
## Fields

| Field | Description |
| --- | --- |
| [DEFAULT_WEIGHT](#DEFAULT-WEIGHT) | Default weight for morph target. |
## Methods

| Method | Description |
| --- | --- |
| [getWeights()](#getWeights--) | Gets the full weight values of target geometries. |
| [getChannelWeight()](#getChannelWeight--) | Gets the deformer weight of this channel. |
| [setChannelWeight(double value)](#setChannelWeight-double-) | Sets the deformer weight of this channel. |
| [getTargets()](#getTargets--) | Gets all targets associated with the channel. |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Gets the weight for specified geometry |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Sets the weight for specified geometry |
| [getWeight(Shape target)](#getWeight-com.aspose.threed.Shape-) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. |
| [setWeight(Shape target, double weight)](#setWeight-com.aspose.threed.Shape-double-) | Sets the weight for the specified target, default value is 1, range should between 0~1 |
| [setWeight(Shape target)](#setWeight-com.aspose.threed.Shape-) | Sets the weight for the specified target, default value is 1, range should between 0~1 |
### MorphTargetChannel(String name) {#MorphTargetChannel-java.lang.String-}
```
public MorphTargetChannel(String name)
```


Initializes a new instance of the com.aspose.threed.MorphTargetChannel class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### MorphTargetChannel() {#MorphTargetChannel--}
```
public MorphTargetChannel()
```


Initializes a new instance of the com.aspose.threed.MorphTargetChannel class.

### DEFAULT_WEIGHT {#DEFAULT-WEIGHT}
```
public static final double DEFAULT_WEIGHT
```


Default weight for morph target.

### getWeights() {#getWeights--}
```
public List<Double> getWeights()
```


Gets the full weight values of target geometries.

**Returns:**
java.util.List<java.lang.Double>
### getChannelWeight() {#getChannelWeight--}
```
public double getChannelWeight()
```


Gets the deformer weight of this channel. The weight is between 0.0 and 1.0

**Returns:**
double
### setChannelWeight(double value) {#setChannelWeight-double-}
```
public void setChannelWeight(double value)
```


Sets the deformer weight of this channel. The weight is between 0.0 and 1.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getTargets() {#getTargets--}
```
public List<Shape> getTargets()
```


Gets all targets associated with the channel.

**Returns:**
java.util.List<com.aspose.threed.Shape>
### get(Shape target) {#get-com.aspose.threed.Shape-}
```
public double get(Shape target)
```


Gets the weight for specified geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry. |

**Returns:**
double - Weight
### set(Shape target, double value) {#set-com.aspose.threed.Shape-double-}
```
public void set(Shape target, double value)
```


Sets the weight for specified geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry. |
| value | double | New value |

### getWeight(Shape target) {#getWeight-com.aspose.threed.Shape-}
```
public double getWeight(Shape target)
```


Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |

**Returns:**
double
### setWeight(Shape target, double weight) {#setWeight-com.aspose.threed.Shape-double-}
```
public void setWeight(Shape target, double weight)
```


Sets the weight for the specified target, default value is 1, range should between 0~1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |
| weight | double |  |

### setWeight(Shape target) {#setWeight-com.aspose.threed.Shape-}
```
public void setWeight(Shape target)
```


Sets the weight for the specified target, default value is 1, range should between 0~1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |

