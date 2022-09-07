---
title: Bone
second_title: Aspose.3D for Java API Reference
description: A bone defines the subset of the geometrys control point and defined blend weight for each control point.
type: docs
weight: 19
url: /java/com.aspose.threed/bone/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Bone extends A3DObject
```

A bone defines the subset of the geometry's control point, and defined blend weight for each control point. The com.aspose.threed.Bone object cannot be used directly, a com.aspose.threed.SkinDeformer instance is used to deform the geometry, and com.aspose.threed.SkinDeformer comes with a set of bones, each bone linked to a node. NOTE: A control point of a geometry can be bounded to more than one Bones.
## Constructors

| Constructor | Description |
| --- | --- |
| [Bone(String name)](#Bone-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Bone class. |
| [Bone()](#Bone--) | Initializes a new instance of the com.aspose.threed.Bone class. |
## Methods

| Method | Description |
| --- | --- |
| [get(int index)](#get-int-) | Gets the blend weight of specified control point |
| [set(int index, double value)](#set-int-double-) | Sets the blend weight of specified control point |
| [getWeight(int index)](#getWeight-int-) | Gets the weight for control point specified by index |
| [setWeight(int index, double weight)](#setWeight-int-double-) | Sets the weight for control point specified by index |
| [getWeightCount()](#getWeightCount--) | Gets the count of weight, this is automatically extended by com.aspose.threed.Bone\#setWeight |
| [getTransform()](#getTransform--) | Gets the transform matrix of the node containing the bone. |
| [setTransform(Matrix4 value)](#setTransform-com.aspose.threed.Matrix4-) | Sets the transform matrix of the node containing the bone. |
| [getBoneTransform()](#getBoneTransform--) | Gets the transform matrix of the bone. |
| [setBoneTransform(Matrix4 value)](#setBoneTransform-com.aspose.threed.Matrix4-) | Sets the transform matrix of the bone. |
| [getNode()](#getNode--) | Gets the node. |
| [setNode(Node value)](#setNode-com.aspose.threed.Node-) | Sets the node. |
### Bone(String name) {#Bone-java.lang.String-}
```
public Bone(String name)
```


Initializes a new instance of the com.aspose.threed.Bone class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### Bone() {#Bone--}
```
public Bone()
```


Initializes a new instance of the com.aspose.threed.Bone class.

### get(int index) {#get-int-}
```
public double get(int index)
```


Gets the blend weight of specified control point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |

**Returns:**
double - The weight
### set(int index, double value) {#set-int-double-}
```
public void set(int index, double value)
```


Sets the blend weight of specified control point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |
| value | double | New value |

### getWeight(int index) {#getWeight-int-}
```
public double getWeight(int index)
```


Gets the weight for control point specified by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Control point's index |

**Returns:**
double - the weight at specified index, or 0 if the index is invalid
### setWeight(int index, double weight) {#setWeight-int-double-}
```
public void setWeight(int index, double weight)
```


Sets the weight for control point specified by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Control point's index |
| weight | double | New weight |

### getWeightCount() {#getWeightCount--}
```
public int getWeightCount()
```


Gets the count of weight, this is automatically extended by com.aspose.threed.Bone\#setWeight

**Returns:**
int
### getTransform() {#getTransform--}
```
public Matrix4 getTransform()
```


Gets the transform matrix of the node containing the bone.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setTransform(Matrix4 value) {#setTransform-com.aspose.threed.Matrix4-}
```
public void setTransform(Matrix4 value)
```


Sets the transform matrix of the node containing the bone.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### getBoneTransform() {#getBoneTransform--}
```
public Matrix4 getBoneTransform()
```


Gets the transform matrix of the bone.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setBoneTransform(Matrix4 value) {#setBoneTransform-com.aspose.threed.Matrix4-}
```
public void setBoneTransform(Matrix4 value)
```


Sets the transform matrix of the bone.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### getNode() {#getNode--}
```
public Node getNode()
```


Gets the node. The bone node is the bone which skin attached to, the com.aspose.threed.SkinDeformer will use bone node to influence the displacement of the control points. Bone node usually has a com.aspose.threed.Skeleton attached, but it's not required. Attached com.aspose.threed.Skeleton is usually used by DCC software to show skeleton to user.

**Returns:**
[Node](../../com.aspose.threed/node)
### setNode(Node value) {#setNode-com.aspose.threed.Node-}
```
public void setNode(Node value)
```


Sets the node. The bone node is the bone which skin attached to, the com.aspose.threed.SkinDeformer will use bone node to influence the displacement of the control points. Bone node usually has a com.aspose.threed.Skeleton attached, but it's not required. Attached com.aspose.threed.Skeleton is usually used by DCC software to show skeleton to user.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

