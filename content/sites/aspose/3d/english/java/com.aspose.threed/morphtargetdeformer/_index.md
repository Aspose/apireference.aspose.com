---
title: MorphTargetDeformer
second_title: Aspose.3D for Java API Reference
description: MorphTargetDeformer provides per-vertex animation.
type: docs
weight: 100
url: /java/com.aspose.threed/morphtargetdeformer/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.Deformer](../../com.aspose.threed/deformer)
```
public class MorphTargetDeformer extends Deformer
```

MorphTargetDeformer provides per-vertex animation. MorphTargetDeformer organize all targets via [MorphTargetChannel](../../com.aspose.threed/morphtargetchannel), each channel can organize multiple targets. A common use of morph target deformer is to apply facial expression to a character. More details can be found at https://en.wikipedia.org/wiki/Morph\_target\_animation
## Constructors

| Constructor | Description |
| --- | --- |
| [MorphTargetDeformer(String name)](#MorphTargetDeformer-java.lang.String-) | Initializes a new instance of the [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) class. |
| [MorphTargetDeformer()](#MorphTargetDeformer--) | Initializes a new instance of the [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [get(Shape target)](#get-com.aspose.threed.Shape-) | Gets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel. |
| [getChannels()](#getChannels--) | Gets all channels contained in this deformer |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the name. |
| [getOwner()](#getOwner--) | Gets the geometry which owns this deformer |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [set(Shape target, double value)](#set-com.aspose.threed.Shape-double-) | Sets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MorphTargetDeformer(String name) {#MorphTargetDeformer-java.lang.String-}
```
public MorphTargetDeformer(String name)
```


Initializes a new instance of the [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### MorphTargetDeformer() {#MorphTargetDeformer--}
```
public MorphTargetDeformer()
```


Initializes a new instance of the [MorphTargetDeformer](../../com.aspose.threed/morphtargetdeformer) class.

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


Gets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry |

**Returns:**
double - Weight
### getChannels() {#getChannels--}
```
public List<MorphTargetChannel> getChannels()
```


Gets all channels contained in this deformer

**Returns:**
java.util.List<com.aspose.threed.MorphTargetChannel>
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
### getOwner() {#getOwner--}
```
public Geometry getOwner()
```


Gets the geometry which owns this deformer

**Returns:**
[Geometry](../../com.aspose.threed/geometry)
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


Sets the weight for given geometry, this is a short-handed way to modify weight for target without accessing channel.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [Shape](../../com.aspose.threed/shape) | Target geometry |
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

