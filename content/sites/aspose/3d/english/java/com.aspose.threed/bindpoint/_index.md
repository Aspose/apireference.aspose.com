---
title: BindPoint
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.BindPoint is usually created on an objects property some property types contains multiple component fieldslike a Vector3 field
 com.aspose.threed.BindPoint will generate channel for each component field and connects the field to one or more keyframe sequence instances through the channels.
type: docs
weight: 18
url: /java/com.aspose.threed/bindpoint/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class BindPoint extends A3DObject
```

A com.aspose.threed.BindPoint is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field), com.aspose.threed.BindPoint will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels.
## Constructors

| Constructor | Description |
| --- | --- |
| [BindPoint(Scene scene, Property prop)](#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-) | Initializes a new instance of the com.aspose.threed.BindPoint class. |
## Methods

| Method | Description |
| --- | --- |
| [getProperty()](#getProperty--) | Gets the property associated with the CurveMapping |
| [setProperty(Property value)](#setProperty-com.aspose.threed.Property-) | Gets the property associated with the CurveMapping |
| [getKeyframeSequence(String channelName)](#getKeyframeSequence-java.lang.String-) | Gets the first keyframe sequence in specified channel |
| [getKeyframeSequences(String channelName)](#getKeyframeSequences-java.lang.String-) | Gets all keyframe sequences in specified channel |
| [createKeyframeSequence(String name)](#createKeyframeSequence-java.lang.String-) | Creates a new curve and connects it to the first channel of the curve mapping |
| [bindKeyframeSequence(String channelName, KeyframeSequence sequence)](#bindKeyframeSequence-java.lang.String-com.aspose.threed.KeyframeSequence-) | Bind the keyframe sequence to specified channel |
| [getChannel(String channelName)](#getChannel-java.lang.String-) | Gets channel by given name |
| [get(String channelName)](#get-java.lang.String-) | Gets channel by given name |
| [addChannel(String name, Object value)](#addChannel-java.lang.String-java.lang.Object-) | Adds the specified channel property. |
| [addChannel(String name, Class<?> type, Object value)](#addChannel-java.lang.String-java.lang.Class----java.lang.Object-) | Adds the specified channel property. |
| [resetChannels()](#resetChannels--) | Empties the property channels of this animation curve mapping. |
| [getChannelsCount()](#getChannelsCount--) | Gets the total number of property channels defined in this animation curve mapping. |
| [toString()](#toString--) | Formats object to string |
### BindPoint(Scene scene, Property prop) {#BindPoint-com.aspose.threed.Scene-com.aspose.threed.Property-}
```
public BindPoint(Scene scene, Property prop)
```


Initializes a new instance of the com.aspose.threed.BindPoint class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene that contains the animation. |
| prop | [Property](../../com.aspose.threed/property) | Property. |

### getProperty() {#getProperty--}
```
public Property getProperty()
```


Gets the property associated with the CurveMapping

**Returns:**
[Property](../../com.aspose.threed/property)
### setProperty(Property value) {#setProperty-com.aspose.threed.Property-}
```
public void setProperty(Property value)
```


Gets the property associated with the CurveMapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Property](../../com.aspose.threed/property) | New value |

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
### getKeyframeSequences(String channelName) {#getKeyframeSequences-java.lang.String-}
```
public List<KeyframeSequence> getKeyframeSequences(String channelName)
```


Gets all keyframe sequences in specified channel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| channelName | java.lang.String | The channel name to find |

**Returns:**
java.util.List<com.aspose.threed.KeyframeSequence> - Keyframe sequence list with the channel name
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
### resetChannels() {#resetChannels--}
```
public void resetChannels()
```


Empties the property channels of this animation curve mapping.

### getChannelsCount() {#getChannelsCount--}
```
public int getChannelsCount()
```


Gets the total number of property channels defined in this animation curve mapping.

**Returns:**
int - The channels count.
### toString() {#toString--}
```
public String toString()
```


Formats object to string

**Returns:**
java.lang.String - Object string
