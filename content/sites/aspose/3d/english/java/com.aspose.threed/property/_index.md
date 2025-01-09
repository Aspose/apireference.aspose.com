---
title: Property
second_title: Aspose.3D for Java API Reference
description: Class to hold user-defined properties.
type: docs
weight: 130
url: /java/com.aspose.threed/property/
---

**Inheritance:**
java.lang.Object
```
public abstract class Property
```

Class to hold user-defined properties.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBindPoint(AnimationNode anim, boolean create)](#getBindPoint-com.aspose.threed.AnimationNode-boolean-) | Gets the property bind point on specified animation instance. |
| [getClass()](#getClass--) |  |
| [getExtra(String name)](#getExtra-java.lang.String-) | Gets extra data of the property associated by name. |
| [getKeyframeSequence(AnimationNode anim, boolean create)](#getKeyframeSequence-com.aspose.threed.AnimationNode-boolean-) | Gets the keyframe sequence on specified animation instance. |
| [getName()](#getName--) | Gets the name of the property |
| [getValue()](#getValue--) | Gets the value. |
| [getValueType()](#getValueType--) | Gets the type of the property value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setExtra(String name, Object value)](#setExtra-java.lang.String-java.lang.Object-) | Sets extra data of the property associated by name. |
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
### getExtra(String name) {#getExtra-java.lang.String-}
```
public Object getExtra(String name)
```


Gets extra data of the property associated by name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the property's extra data |

**Returns:**
java.lang.Object - The extra data associated by name
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


Gets the name of the property

**Returns:**
java.lang.String - the name of the property
### getValue() {#getValue--}
```
public abstract Object getValue()
```


Gets the value.

**Returns:**
java.lang.Object - the value.
### getValueType() {#getValueType--}
```
public abstract Class<?> getValueType()
```


Gets the type of the property value.

**Returns:**
java.lang.Class<?> - the type of the property value.
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




### setExtra(String name, Object value) {#setExtra-java.lang.String-java.lang.Object-}
```
public void setExtra(String name, Object value)
```


Sets extra data of the property associated by name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the property's extra data |
| value | java.lang.Object | The value of the property's extra data |

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

