---
title: Property
second_title: Aspose.3D for Java API Reference
description: Class to hold user-defined properties.
type: docs
weight: 125
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
| [getValue()](#getValue--) | Gets the value. |
| [setValue(Object value)](#setValue-java.lang.Object-) | Sets the value. |
| [setName(String value)](#setName-java.lang.String-) | Gets the name of the property |
| [getValueType()](#getValueType--) | Gets the type of the property value. |
| [getBindPoint(AnimationNode anim, boolean create)](#getBindPoint-com.aspose.threed.AnimationNode-boolean-) | Gets the property bind point on specified animation instance. |
| [getKeyframeSequence(AnimationNode anim, boolean create)](#getKeyframeSequence-com.aspose.threed.AnimationNode-boolean-) | Gets the keyframe sequence on specified animation instance. |
| [toString()](#toString--) | Returns a string that represents the current com.aspose.threed.Property. |
### getValue() {#getValue--}
```
public abstract Object getValue()
```


Gets the value.

**Returns:**
java.lang.Object
### setValue(Object value) {#setValue-java.lang.Object-}
```
public abstract void setValue(Object value)
```


Sets the value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Gets the name of the property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getValueType() {#getValueType--}
```
public abstract Class<?> getValueType()
```


Gets the type of the property value.

**Returns:**
java.lang.Class<?>
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
### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the current com.aspose.threed.Property.

**Returns:**
java.lang.String - A string that represents the current com.aspose.threed.Property.
