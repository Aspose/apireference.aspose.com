---
title: AnimationClip
second_title: Aspose.3D for Java API Reference
description: The Animation clip is a collection of animations.
type: docs
weight: 14
url: /java/com.aspose.threed/animationclip/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject)
```
public class AnimationClip extends SceneObject
```

The Animation clip is a collection of animations. The scene can have one or more animation clips.
## Constructors

| Constructor | Description |
| --- | --- |
| [AnimationClip()](#AnimationClip--) | Initializes a new instance of the com.aspose.threed.AnimationClip class. |
| [AnimationClip(String name)](#AnimationClip-java.lang.String-) | Initializes a new instance of the com.aspose.threed.AnimationClip class. |
## Methods

| Method | Description |
| --- | --- |
| [getAnimations()](#getAnimations--) | Gets the animations contained inside the clip. |
| [getDescription()](#getDescription--) | Gets the description of this animation clip |
| [setDescription(String value)](#setDescription-java.lang.String-) | Sets the description of this animation clip |
| [getStart()](#getStart--) | Gets the time in seconds of the beginning of the clip. |
| [setStart(double value)](#setStart-double-) | Sets the time in seconds of the beginning of the clip. |
| [getStop()](#getStop--) | Gets the time in seconds of the end of the clip. |
| [setStop(double value)](#setStop-double-) | Sets the time in seconds of the end of the clip. |
| [createAnimationNode(String nodeName)](#createAnimationNode-java.lang.String-) | A shorthand function to create and register the animation node on current clip. |
### AnimationClip() {#AnimationClip--}
```
public AnimationClip()
```


Initializes a new instance of the com.aspose.threed.AnimationClip class.

### AnimationClip(String name) {#AnimationClip-java.lang.String-}
```
public AnimationClip(String name)
```


Initializes a new instance of the com.aspose.threed.AnimationClip class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getAnimations() {#getAnimations--}
```
public List<AnimationNode> getAnimations()
```


Gets the animations contained inside the clip.

**Returns:**
java.util.List<com.aspose.threed.AnimationNode>
### getDescription() {#getDescription--}
```
public String getDescription()
```


Gets the description of this animation clip

**Returns:**
java.lang.String
### setDescription(String value) {#setDescription-java.lang.String-}
```
public void setDescription(String value)
```


Sets the description of this animation clip

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getStart() {#getStart--}
```
public double getStart()
```


Gets the time in seconds of the beginning of the clip.

**Returns:**
double
### setStart(double value) {#setStart-double-}
```
public void setStart(double value)
```


Sets the time in seconds of the beginning of the clip.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getStop() {#getStop--}
```
public double getStop()
```


Gets the time in seconds of the end of the clip.

**Returns:**
double
### setStop(double value) {#setStop-double-}
```
public void setStop(double value)
```


Sets the time in seconds of the end of the clip.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### createAnimationNode(String nodeName) {#createAnimationNode-java.lang.String-}
```
public AnimationNode createAnimationNode(String nodeName)
```


A shorthand function to create and register the animation node on current clip.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | java.lang.String | New animation node's name |

**Returns:**
[AnimationNode](../../com.aspose.threed/animationnode)
