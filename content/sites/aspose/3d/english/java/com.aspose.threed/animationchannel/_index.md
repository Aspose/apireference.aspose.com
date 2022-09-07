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
| [getComponentType()](#getComponentType--) | Gets the component field's type |
| [getName()](#getName--) | Gets the name of the channel |
| [getDefaultValue()](#getDefaultValue--) | Gets the Default value of the channel. |
| [setDefaultValue(Object value)](#setDefaultValue-java.lang.Object-) | Sets the Default value of the channel. |
| [getKeyframeSequences()](#getKeyframeSequences--) | Gets all keyframe sequences inside this channel |
| [addKeyframeSequence(KeyframeSequence sequence)](#addKeyframeSequence-com.aspose.threed.KeyframeSequence-) | Adds keyframe sequence to this channel |
| [iterator()](#iterator--) | Gets an enumerator to walk through all keyframe sequences inside this channel |
### getComponentType() {#getComponentType--}
```
public Class<?> getComponentType()
```


Gets the component field's type

**Returns:**
java.lang.Class<?>
### getName() {#getName--}
```
public String getName()
```


Gets the name of the channel

**Returns:**
java.lang.String
### getDefaultValue() {#getDefaultValue--}
```
public Object getDefaultValue()
```


Gets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation.

**Returns:**
java.lang.Object
### setDefaultValue(Object value) {#setDefaultValue-java.lang.Object-}
```
public void setDefaultValue(Object value)
```


Sets the Default value of the channel. If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation. A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, then the default value will be used during full translation evaluation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object | New value |

### getKeyframeSequences() {#getKeyframeSequences--}
```
public List<KeyframeSequence> getKeyframeSequences()
```


Gets all keyframe sequences inside this channel

**Returns:**
java.util.List<com.aspose.threed.KeyframeSequence>
### addKeyframeSequence(KeyframeSequence sequence) {#addKeyframeSequence-com.aspose.threed.KeyframeSequence-}
```
public void addKeyframeSequence(KeyframeSequence sequence)
```


Adds keyframe sequence to this channel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sequence | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | The keyframe sequence to add. |

### iterator() {#iterator--}
```
public Iterator<KeyframeSequence> iterator()
```


Gets an enumerator to walk through all keyframe sequences inside this channel

**Returns:**
java.util.Iterator<com.aspose.threed.KeyframeSequence> - Enumerator
