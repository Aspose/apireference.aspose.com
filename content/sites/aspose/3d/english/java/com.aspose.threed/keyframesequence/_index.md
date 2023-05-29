---
title: KeyframeSequence
second_title: Aspose.3D for Java API Reference
description: The sequence of key-frames it describes the transformation of a sampled value over time.
type: docs
weight: 82
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
| [KeyframeSequence(String name)](#KeyframeSequence-java.lang.String-) | Initializes a new instance of the [KeyframeSequence](../../com.aspose.threed/keyframesequence) class. |
| [KeyframeSequence()](#KeyframeSequence--) | Initializes a new instance of the [KeyframeSequence](../../com.aspose.threed/keyframesequence) class. |
## Methods

| Method | Description |
| --- | --- |
| [add(double time, float value)](#add-double-float-) | Create a new key frame with specified value |
| [add(double time, float value, Interpolation interpolation)](#add-double-float-com.aspose.threed.Interpolation-) | Create a new key frame with specified value |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBindPoint()](#getBindPoint--) | Gets the property bind point which owns this curve |
| [getClass()](#getClass--) |  |
| [getKeyFrames()](#getKeyFrames--) | Gets the key frames of this curve. |
| [getName()](#getName--) | Gets the name. |
| [getPostBehavior()](#getPostBehavior--) | Gets the post behavior indicates what the sampled value should be after the last key frame. |
| [getPreBehavior()](#getPreBehavior--) | Gets the pre behavior indicates what the sampled value should be before the first key. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gets the enumerator to traverse all key frames. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [reset()](#reset--) | Removes all key frames and reset the post/pre behaviors. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### KeyframeSequence(String name) {#KeyframeSequence-java.lang.String-}
```
public KeyframeSequence(String name)
```


Initializes a new instance of the [KeyframeSequence](../../com.aspose.threed/keyframesequence) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### KeyframeSequence() {#KeyframeSequence--}
```
public KeyframeSequence()
```


Initializes a new instance of the [KeyframeSequence](../../com.aspose.threed/keyframesequence) class.

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
### getBindPoint() {#getBindPoint--}
```
public BindPoint getBindPoint()
```


Gets the property bind point which owns this curve

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyFrames() {#getKeyFrames--}
```
public List<KeyFrame> getKeyFrames()
```


Gets the key frames of this curve.

**Returns:**
java.util.List<com.aspose.threed.KeyFrame>
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<KeyFrame> iterator()
```


Gets the enumerator to traverse all key frames.

**Returns:**
java.util.Iterator<com.aspose.threed.KeyFrame>
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
### reset() {#reset--}
```
public void reset()
```


Removes all key frames and reset the post/pre behaviors.

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
public final native void wait(long arg0)
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

