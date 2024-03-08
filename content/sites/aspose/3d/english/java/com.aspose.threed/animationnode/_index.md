---
title: AnimationNode
second_title: Aspose.3D for Java API Reference
description: Aspose.3Ds supports animation hierarchy each animation can be composed by several animations and animations key-frame definition.
type: docs
weight: 15
url: /java/com.aspose.threed/animationnode/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class AnimationNode extends A3DObject
```

Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition. [AnimationNode](../../com.aspose.threed/animationnode) defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [A3DObject](../../com.aspose.threed/a3dobject) object's numerical properties.
## Constructors

| Constructor | Description |
| --- | --- |
| [AnimationNode(String name)](#AnimationNode-java.lang.String-) | Initializes a new instance of the [AnimationNode](../../com.aspose.threed/animationnode) class. |
| [AnimationNode()](#AnimationNode--) | Initializes a new instance of the [AnimationNode](../../com.aspose.threed/animationnode) class. |
## Methods

| Method | Description |
| --- | --- |
| [createBindPoint(A3DObject obj, String propName)](#createBindPoint-com.aspose.threed.A3DObject-java.lang.String-) | Creates a BindPoint based on the property data type. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findBindPoint(A3DObject target, String name)](#findBindPoint-com.aspose.threed.A3DObject-java.lang.String-) | Finds the bind point by target and name. |
| [findBindPoint(String name)](#findBindPoint-java.lang.String-) | Finds the bind point by name. |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBindPoint(A3DObject target, String propName, boolean create)](#getBindPoint-com.aspose.threed.A3DObject-java.lang.String-boolean-) | Gets the animation bind point on given property. |
| [getBindPoints()](#getBindPoints--) | Gets the current property bind points |
| [getClass()](#getClass--) |  |
| [getKeyframeSequence(A3DObject target, String propName, boolean create)](#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-boolean-) | Gets the keyframe sequence on given property. |
| [getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create)](#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-java.lang.String-boolean-) | Gets the keyframe sequence on given property and channel. |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getSubAnimations()](#getSubAnimations--) | Gets the sub-animation nodes under current animations |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AnimationNode(String name) {#AnimationNode-java.lang.String-}
```
public AnimationNode(String name)
```


Initializes a new instance of the [AnimationNode](../../com.aspose.threed/animationnode) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### AnimationNode() {#AnimationNode--}
```
public AnimationNode()
```


Initializes a new instance of the [AnimationNode](../../com.aspose.threed/animationnode) class.

### createBindPoint(A3DObject obj, String propName) {#createBindPoint-com.aspose.threed.A3DObject-java.lang.String-}
```
public BindPoint createBindPoint(A3DObject obj, String propName)
```


Creates a BindPoint based on the property data type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | [A3DObject](../../com.aspose.threed/a3dobject) | Object. |
| propName | java.lang.String | Property name. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point instance or null if the property is not defined.
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
### findBindPoint(A3DObject target, String name) {#findBindPoint-com.aspose.threed.A3DObject-java.lang.String-}
```
public BindPoint findBindPoint(A3DObject target, String name)
```


Finds the bind point by target and name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | Bind point's target to find. |
| name | java.lang.String | Bind point's name to find. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point.
### findBindPoint(String name) {#findBindPoint-java.lang.String-}
```
public BindPoint findBindPoint(String name)
```


Finds the bind point by name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Bind point's name to find. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point.
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
### getBindPoint(A3DObject target, String propName, boolean create) {#getBindPoint-com.aspose.threed.A3DObject-java.lang.String-boolean-}
```
public BindPoint getBindPoint(A3DObject target, String propName, boolean create)
```


Gets the animation bind point on given property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | On which object to create the bind point. |
| propName | java.lang.String | The property's name. |
| create | boolean | If set to  true  create the bind point if it's not existing. |

**Returns:**
[BindPoint](../../com.aspose.threed/bindpoint) - The bind point.
### getBindPoints() {#getBindPoints--}
```
public List<BindPoint> getBindPoints()
```


Gets the current property bind points

**Returns:**
java.util.List<com.aspose.threed.BindPoint>
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyframeSequence(A3DObject target, String propName, boolean create) {#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-boolean-}
```
public KeyframeSequence getKeyframeSequence(A3DObject target, String propName, boolean create)
```


Gets the keyframe sequence on given property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | On which instance to create the keyframe sequence. |
| propName | java.lang.String | The property's name. |
| create | boolean | If set to  true , create the sequence if it's not existing. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
### getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create) {#getKeyframeSequence-com.aspose.threed.A3DObject-java.lang.String-java.lang.String-boolean-}
```
public KeyframeSequence getKeyframeSequence(A3DObject target, String propName, String channelName, boolean create)
```


Gets the keyframe sequence on given property and channel.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [A3DObject](../../com.aspose.threed/a3dobject) | On which instance to create the keyframe sequence. |
| propName | java.lang.String | The property's name. |
| channelName | java.lang.String | The channel name. |
| create | boolean | If set to  true  create the animation sequence if it's not existing. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
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
### getSubAnimations() {#getSubAnimations--}
```
public List<AnimationNode> getSubAnimations()
```


Gets the sub-animation nodes under current animations

**Returns:**
java.util.List<com.aspose.threed.AnimationNode>
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

