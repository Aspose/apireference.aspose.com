---
title: BindPoint
second_title: Aspose.3D for Java API Reference
description: A  is usually created on an objects property some property types contains multiple component fieldslike a Vector3 field   will generate channel for each component field and connects the field to one or more keyframe sequence instances through the channels.
type: docs
weight: 19
url: /java/com.aspose.threed/bindpoint/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class BindPoint extends A3DObject
```

A [BindPoint](../../com.aspose.threed/bindpoint) is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field), [BindPoint](../../com.aspose.threed/bindpoint) will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels.
## Constructors

| Constructor | Description |
| --- | --- |
| [BindPoint(Scene scene, Property prop)](#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-) | Initializes a new instance of the [BindPoint](../../com.aspose.threed/bindpoint) class. |
## Methods

| Method | Description |
| --- | --- |
| [addChannel(String name, Class<?> type, Object value)](#addChannel-java.lang.String-java.lang.Class----java.lang.Object-) | Adds the specified channel property. |
| [addChannel(String name, Object value)](#addChannel-java.lang.String-java.lang.Object-) | Adds the specified channel property. |
| [bindKeyframeSequence(String channelName, KeyframeSequence sequence)](#bindKeyframeSequence-java.lang.String-com.aspose.threed.KeyframeSequence-) | Bind the keyframe sequence to specified channel |
| [createKeyframeSequence(String name)](#createKeyframeSequence-java.lang.String-) | Creates a new curve and connects it to the first channel of the curve mapping |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [get(String channelName)](#get-java.lang.String-) | Gets channel by given name |
| [getChannel(String channelName)](#getChannel-java.lang.String-) | Gets channel by given name |
| [getChannelsCount()](#getChannelsCount--) | Gets the total number of property channels defined in this animation curve mapping. |
| [getClass()](#getClass--) |  |
| [getKeyframeSequence(String channelName)](#getKeyframeSequence-java.lang.String-) | Gets the first keyframe sequence in specified channel |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty()](#getProperty--) | Gets the property associated with the CurveMapping |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [resetChannels()](#resetChannels--) | Empties the property channels of this animation curve mapping. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(Property value)](#setProperty-com.aspose.threed.Property-) | Gets the property associated with the CurveMapping |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [toString()](#toString--) | Formats object to string |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BindPoint(Scene scene, Property prop) {#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-}
```
public BindPoint(Scene scene, Property prop)
```


Initializes a new instance of the [BindPoint](../../com.aspose.threed/bindpoint) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene that contains the animation. |
| prop | [Property](../../com.aspose.threed/property) | Property. |

### addChannel(String name, Class<?> type, Object value) {#addChannel-java.lang.String-java.lang.Class----java.lang.Object-}
```
public boolean addChannel(String name, Class<?> type, Object value)
```


Adds the specified channel property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| type | java.lang.Class<?> | Type. |
| value | java.lang.Object | Value. |

**Returns:**
boolean - true, if channel was added, false otherwise.
### addChannel(String name, Object value) {#addChannel-java.lang.String-java.lang.Object-}
```
public boolean addChannel(String name, Object value)
```


Adds the specified channel property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| value | java.lang.Object | Value. |

**Returns:**
boolean - true, if channel was added, false otherwise.
### bindKeyframeSequence(String channelName, KeyframeSequence sequence) {#bindKeyframeSequence-java.lang.String-com.aspose.threed.KeyframeSequence-}
```
public void bindKeyframeSequence(String channelName, KeyframeSequence sequence)
```


Bind the keyframe sequence to specified channel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| channelName | java.lang.String | Which channel the keyframe sequence will be bound to |
| sequence | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | The keyframe sequence to bind |

### createKeyframeSequence(String name) {#createKeyframeSequence-java.lang.String-}
```
public KeyframeSequence createKeyframeSequence(String name)
```


Creates a new curve and connects it to the first channel of the curve mapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The new sequence's name. |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - The keyframe sequence.
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
### get(String channelName) {#get-java.lang.String-}
```
public AnimationChannel get(String channelName)
```


Gets channel by given name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| channelName | java.lang.String | Channel name |

**Returns:**
[AnimationChannel](../../com.aspose.threed/animationchannel) - Animation channel
### getChannel(String channelName) {#getChannel-java.lang.String-}
```
public AnimationChannel getChannel(String channelName)
```


Gets channel by given name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| channelName | java.lang.String | The channel name to find |

**Returns:**
[AnimationChannel](../../com.aspose.threed/animationchannel) - Channel with the name
### getChannelsCount() {#getChannelsCount--}
```
public int getChannelsCount()
```


Gets the total number of property channels defined in this animation curve mapping.

**Returns:**
int - The channels count.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getKeyframeSequence(String channelName) {#getKeyframeSequence-java.lang.String-}
```
public KeyframeSequence getKeyframeSequence(String channelName)
```


Gets the first keyframe sequence in specified channel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| channelName | java.lang.String | The channel name to find |

**Returns:**
[KeyframeSequence](../../com.aspose.threed/keyframesequence) - First keyframe sequence with the channel name
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty() {#getProperty--}
```
public Property getProperty()
```


Gets the property associated with the CurveMapping

**Returns:**
[Property](../../com.aspose.threed/property) - the property associated with the CurveMapping
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
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### resetChannels() {#resetChannels--}
```
public void resetChannels()
```


Empties the property channels of this animation curve mapping.

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setProperty(Property value) {#setProperty-com.aspose.threed.Property-}
```
public void setProperty(Property value)
```


Gets the property associated with the CurveMapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Property](../../com.aspose.threed/property) | New value |

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


Formats object to string

**Returns:**
java.lang.String - Object string
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

