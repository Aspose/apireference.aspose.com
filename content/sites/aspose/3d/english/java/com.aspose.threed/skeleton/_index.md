---
title: Skeleton
second_title: Aspose.3D for Java API Reference
description: The com.aspose.threed.Skeleton is mainly used by CAD software to help designer to manipulate the transformation of skeletal structure its usually useless outside the CAD softwares.
type: docs
weight: 157
url: /java/com.aspose.threed/skeleton/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)
```
public class Skeleton extends Entity
```

The com.aspose.threed.Skeleton is mainly used by CAD software to help designer to manipulate the transformation of skeletal structure, it's usually useless outside the CAD softwares. To make the skeleton hierarchy acts like one object in CAD software, it's necessary to mark the top com.aspose.threed.Skeleton node as the root one by setting com.aspose.threed.Skeleton\#getType to com.aspose.threed.SkeletonType\#SKELETON, and all children set to com.aspose.threed.SkeletonType\#BONE
## Constructors

| Constructor | Description |
| --- | --- |
| [Skeleton()](#Skeleton--) | Initializes a new instance of the com.aspose.threed.Skeleton class. |
| [Skeleton(String name)](#Skeleton-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Skeleton class. |
## Methods

| Method | Description |
| --- | --- |
| [getSize()](#getSize--) | Gets the limb node size that used in CAD software to represent the size of the bone. |
| [setSize(double value)](#setSize-double-) | Sets the limb node size that used in CAD software to represent the size of the bone. |
| [getType()](#getType--) | Gets the type of the skeleton. |
| [setType(SkeletonType value)](#setType-com.aspose.threed.SkeletonType-) | Sets the type of the skeleton. |
### Skeleton() {#Skeleton--}
```
public Skeleton()
```


Initializes a new instance of the com.aspose.threed.Skeleton class.

### Skeleton(String name) {#Skeleton-java.lang.String-}
```
public Skeleton(String name)
```


Initializes a new instance of the com.aspose.threed.Skeleton class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getSize() {#getSize--}
```
public double getSize()
```


Gets the limb node size that used in CAD software to represent the size of the bone.

**Returns:**
double
### setSize(double value) {#setSize-double-}
```
public void setSize(double value)
```


Sets the limb node size that used in CAD software to represent the size of the bone.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getType() {#getType--}
```
public SkeletonType getType()
```


Gets the type of the skeleton.

**Returns:**
[SkeletonType](../../com.aspose.threed/skeletontype)
### setType(SkeletonType value) {#setType-com.aspose.threed.SkeletonType-}
```
public void setType(SkeletonType value)
```


Sets the type of the skeleton.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SkeletonType](../../com.aspose.threed/skeletontype) | New value |

