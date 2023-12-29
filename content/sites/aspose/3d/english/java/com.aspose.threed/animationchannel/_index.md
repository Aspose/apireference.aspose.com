---
title: AnimationChannel
second_title: Aspose.3D for Java API Reference
description: A channel maps propertys component field to a set of keyframe sequences
type: docs
weight: 13
url: /java/com.aspose.threed/animationchannel/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public class AnimationChannel implements Iterable<KeyframeSequence>
```

A channel maps property's component field to a set of keyframe sequences
## Methods

| Method | Description |
| --- | --- |
| [addKeyframeSequence(KeyframeSequence sequence)](#addKeyframeSequence-com.aspose.threed.KeyframeSequence-) | Adds keyframe sequence to this channel |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getComponentType()](#getComponentType--) | Gets the component field's type |
| [getDefaultValue()](#getDefaultValue--) | Gets the Default value of the channel. |
| [getKeyframeSequences()](#getKeyframeSequences--) | Gets all keyframe sequences inside this channel |
| [getName()](#getName--) | Gets the name of the channel |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Gets an enumerator to walk through all keyframe sequences inside this channel |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDefaultValue(Object value)](#setDefaultValue-java.lang.Object-) | Sets the Default value of the channel. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addKeyframeSequence(KeyframeSequence sequence) {#addKeyframeSequence-com.aspose.threed.KeyframeSequence-}
```
public void addKeyframeSequence(KeyframeSequence sequence)
```


Adds keyframe sequence to this channel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sequence | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | The keyframe sequence to add. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getComponentType() {#getComponentType--}
```
public Class<?> getComponentType()
```


Gets the component field's type

**Returns:**
java.lang.Class<?>
### getDefaultValue() {#getDefaultValue--}
```
public Object getDefaultValue()
```


Gets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation.

**Returns:**
java.lang.Object
### getKeyframeSequences() {#getKeyframeSequences--}
```
public List<KeyframeSequence> getKeyframeSequences()
```


Gets all keyframe sequences inside this channel

**Returns:**
java.util.List<com.aspose.threed.KeyframeSequence>
### getName() {#getName--}
```
public String getName()
```


Gets the name of the channel

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<KeyframeSequence> iterator()
```


Gets an enumerator to walk through all keyframe sequences inside this channel

**Returns:**
java.util.Iterator<com.aspose.threed.KeyframeSequence> - Enumerator
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setDefaultValue(Object value) {#setDefaultValue-java.lang.Object-}
```
public void setDefaultValue(Object value)
```


Sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object | New value |

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

