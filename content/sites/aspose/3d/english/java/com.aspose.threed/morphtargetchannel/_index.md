---
title: MorphTargetChannel
second_title: Aspose.3D for Java API Reference
description: A MorphTargetChannel is used by  to organize the target geometries.
type: docs
weight: 99
url: /java/com.aspose.threed/morphtargetchannel/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class MorphTargetChannel extends A3DObject
```

A MorphTargetChannel is used by [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) to organize the target geometries. Some file formats like FBX support multiple channels in parallel.
## Constructors

| Constructor | Description |
| --- | --- |
| [MorphTargetChannel(String name)](#MorphTargetChannel-java.lang.String-) | Initializes a new instance of the [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel) class. |
| [MorphTargetChannel()](#MorphTargetChannel--) | Initializes a new instance of the [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel) class. |
## Fields

| Field | Description |
| --- | --- |
| [DEFAULT_WEIGHT](#DEFAULT-WEIGHT) | Default weight for morph target. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Gets the weight for specified geometry |
| [getChannelWeight()](#getChannelWeight--) | Gets the deformer weight of this channel. |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getTargets()](#getTargets--) | Gets all targets associated with the channel. |
| [getWeight(Shape target)](#getWeight-com.aspose.threed.Shape-) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. |
| [getWeights()](#getWeights--) | Gets the full weight values of target geometries. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Sets the weight for specified geometry |
| [setChannelWeight(double value)](#setChannelWeight-double-) | Sets the deformer weight of this channel. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setWeight(Shape target)](#setWeight-com.aspose.threed.Shape-) | Sets the weight for the specified target, default value is 1, range should between 0~1 |
| [setWeight(Shape target, double weight)](#setWeight-com.aspose.threed.Shape-double-) | Sets the weight for the specified target, default value is 1, range should between 0~1 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MorphTargetChannel(String name) {#MorphTargetChannel-java.lang.String-}
```
public MorphTargetChannel(String name)
```


Initializes a new instance of the [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### MorphTargetChannel() {#MorphTargetChannel--}
```
public MorphTargetChannel()
```


Initializes a new instance of the [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel) class.

### DEFAULT_WEIGHT {#DEFAULT-WEIGHT}
```
public static final double DEFAULT_WEIGHT
```


Default weight for morph target.

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
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
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
### getChannelWeight() {#getChannelWeight--}
```
public double getChannelWeight()
```


Gets the deformer weight of this channel. The weight is between 0.0 and 1.0

**Returns:**
double
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getTargets() {#getTargets--}
```
public List<Shape> getTargets()
```


Gets all targets associated with the channel.

**Returns:**
java.util.List<com.aspose.threed.Shape>
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
### getWeights() {#getWeights--}
```
public List<Double> getWeights()
```


Gets the full weight values of target geometries.

**Returns:**
java.util.List<java.lang.Double>
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




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String |  |

**Returns:**
boolean
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

### setChannelWeight(double value) {#setChannelWeight-double-}
```
public void setChannelWeight(double value)
```


Sets the deformer weight of this channel. The weight is between 0.0 and 1.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### setWeight(Shape target) {#setWeight-com.aspose.threed.Shape-}
```
public void setWeight(Shape target)
```


Sets the weight for the specified target, default value is 1, range should between 0~1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) |  |

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

### toString() {#toString--}
```
public String toString()
```




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

