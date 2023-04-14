---
title: Property
second_title: Aspose.3D for Java API Reference
description: Class to hold user-defined properties.
type: docs
weight: 127
url: /java/com.aspose.threed/property/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public abstract class Property extends A3DObject
```

Class to hold user-defined properties.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBindPoint(AnimationNode anim, boolean create)](#getBindPoint-com.aspose.threed.AnimationNode-boolean-) | Gets the property bind point on specified animation instance. |
| [getClass()](#getClass--) |  |
| [getKeyframeSequence(AnimationNode anim, boolean create)](#getKeyframeSequence-com.aspose.threed.AnimationNode-boolean-) | Gets the keyframe sequence on specified animation instance. |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getValue()](#getValue--) | Gets the value. |
| [getValueType()](#getValueType--) | Gets the type of the property value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setName(String value)](#setName-java.lang.String-) | Gets the name of the property |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setValue(Object value)](#setValue-java.lang.Object-) | Sets the value. |
| [toString()](#toString--) | Returns a string that represents the current [Property](../../com.aspose.threed/property). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getBindPoint(AnimationNode anim, boolean create) {#getBindPoint-com.aspose.threed.AnimationNode-boolean-}
```
public BindPoint getBindPoint(AnimationNode anim, boolean create)
```


Gets the property bind point on specified animation instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| anim | [AnimationNode](../../com.aspose.threed/animationnode) | On which animation to create the bind point. |
| create | boolean | Create the property bind point if it's not found. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The property bind point on specified animation instance
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyframeSequence(AnimationNode anim, boolean create) {#getKeyframeSequence-com.aspose.threed.AnimationNode-boolean-}
```
public KeyframeSequence getKeyframeSequence(AnimationNode anim, boolean create)
```


Gets the keyframe sequence on specified animation instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| anim | [AnimationNode](../../com.aspose.threed/animationnode) | On which animation to create the keyframe sequence. |
| create | boolean | Create the keyframe sequence if it's not found. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence on specified animation instance
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
### getValue() {#getValue--}
```
public abstract Object getValue()
```


Gets the value.

**Returns:**
java.lang.Object
### getValueType() {#getValueType--}
```
public abstract Class<?> getValueType()
```


Gets the type of the property value.

**Returns:**
java.lang.Class<?>
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
### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Gets the name of the property

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

### setValue(Object value) {#setValue-java.lang.Object-}
```
public abstract void setValue(Object value)
```


Sets the value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object | New value |

### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the current [Property](../../com.aspose.threed/property).

**Returns:**
java.lang.String - A string that represents the current [Property](../../com.aspose.threed/property).
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

