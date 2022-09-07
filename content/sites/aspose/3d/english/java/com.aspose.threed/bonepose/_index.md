---
title: BonePose
second_title: Aspose.3D for Java API Reference
description: The com.aspose.threed.BonePose contains the transformation matrix for a bone node
type: docs
weight: 20
url: /java/com.aspose.threed/bonepose/
---

**Inheritance:**
java.lang.Object
```
public class BonePose
```

The com.aspose.threed.BonePose contains the transformation matrix for a bone node
## Constructors

| Constructor | Description |
| --- | --- |
| [BonePose()](#BonePose--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getNode()](#getNode--) | Gets the scene node, points to a skinned skeleton node |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Sets the scene node, points to a skinned skeleton node |
| [getMatrix()](#getMatrix--) | Gets the transform matrix of the node in current pose. |
| [setMatrix(Matrix4 value)](#setMatrix-com.aspose.threed.Matrix4-) | Sets the transform matrix of the node in current pose. |
| [isLocal()](#isLocal--) | Gets if the matrix is defined in local coordinate. |
| [setLocal(boolean value)](#setLocal-boolean-) | Sets if the matrix is defined in local coordinate. |
### BonePose() {#BonePose--}
```
public BonePose()
```


### getNode() {#getNode--}
```
public Node getNode()
```


Gets the scene node, points to a skinned skeleton node

**Returns:**
[Node](../../com.aspose.threed/node)
### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Sets the scene node, points to a skinned skeleton node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### getMatrix() {#getMatrix--}
```
public Matrix4 getMatrix()
```


Gets the transform matrix of the node in current pose.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setMatrix(Matrix4 value) {#setMatrix-com.aspose.threed.Matrix4-}
```
public void setMatrix(Matrix4 value)
```


Sets the transform matrix of the node in current pose.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### isLocal() {#isLocal--}
```
public boolean isLocal()
```


Gets if the matrix is defined in local coordinate.

**Returns:**
boolean
### setLocal(boolean value) {#setLocal-boolean-}
```
public void setLocal(boolean value)
```


Sets if the matrix is defined in local coordinate.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

