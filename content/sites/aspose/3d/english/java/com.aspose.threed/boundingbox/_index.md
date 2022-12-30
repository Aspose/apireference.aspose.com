---
title: BoundingBox
second_title: Aspose.3D for Java API Reference
description: The axis-aligned bounding box
type: docs
weight: 21
url: /java/com.aspose.threed/boundingbox/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class BoundingBox implements Struct<BoundingBox>, Serializable
```

The axis-aligned bounding box
## Constructors

| Constructor | Description |
| --- | --- |
| [BoundingBox(Vector3 minimum, Vector3 maximum)](#BoundingBox-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)](#BoundingBox-double-double-double-double-double-double-) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox()](#BoundingBox--) |  |
## Fields

| Field | Description |
| --- | --- |
| [NULL](#NULL) | The null bounding box |
| [INFINITE](#INFINITE) | The infinite bounding box |
## Methods

| Method | Description |
| --- | --- |
| [getExtent()](#getExtent--) | Gets the extent of the bounding box. |
| [getMinimum()](#getMinimum--) | The minimum corner of the bounding box |
| [getMaximum()](#getMaximum--) | The maximum corner of the bounding box |
| [getSize()](#getSize--) | The size of the bounding box |
| [getCenter()](#getCenter--) | The center of the bounding box. |
| [fromGeometry(Geometry geometry)](#fromGeometry-com.aspose.threed.Geometry-) | Construct a bounding box from given geometry |
| [mul(BoundingBox bbox, Matrix4 mat)](#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-) | Operator overloading for multiply |
| [toString()](#toString--) | Gets the string representation of the bounding box. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines if two objects are equal |
| [clone()](#clone--) |  |
| [copyFrom(BoundingBox src)](#copyFrom-com.aspose.threed.BoundingBox-) |  |
| [hashCode()](#hashCode--) | Returns the hash code for this instance |
### BoundingBox(Vector3 minimum, Vector3 maximum) {#BoundingBox-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public BoundingBox(Vector3 minimum, Vector3 maximum)
```


Initialize a finite bounding box with given minimum and maximum corner

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| minimum | [Vector3](../../com.aspose.threed/vector3) | The minimum corner |
| maximum | [Vector3](../../com.aspose.threed/vector3) | The maximum corner |

### BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {#BoundingBox-double-double-double-double-double-double-}
```
public BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
```


Initialize a finite bounding box with given minimum and maximum corner

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| minX | double |  |
| minY | double |  |
| minZ | double |  |
| maxX | double |  |
| maxY | double |  |
| maxZ | double |  |

### BoundingBox() {#BoundingBox--}
```
public BoundingBox()
```


### NULL {#NULL}
```
public static final BoundingBox NULL
```


The null bounding box

### INFINITE {#INFINITE}
```
public static final BoundingBox INFINITE
```


The infinite bounding box

### getExtent() {#getExtent--}
```
public BoundingBoxExtent getExtent()
```


Gets the extent of the bounding box.

**Returns:**
[BoundingBoxExtent](../../com.aspose.threed/boundingboxextent)
### getMinimum() {#getMinimum--}
```
public Vector3 getMinimum()
```


The minimum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getMaximum() {#getMaximum--}
```
public Vector3 getMaximum()
```


The maximum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getSize() {#getSize--}
```
public Vector3 getSize()
```


The size of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getCenter() {#getCenter--}
```
public Vector3 getCenter()
```


The center of the bounding box.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### fromGeometry(Geometry geometry) {#fromGeometry-com.aspose.threed.Geometry-}
```
public static BoundingBox fromGeometry(Geometry geometry)
```


Construct a bounding box from given geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) |  |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### mul(BoundingBox bbox, Matrix4 mat) {#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-}
```
public static BoundingBox mul(BoundingBox bbox, Matrix4 mat)
```


Operator overloading for multiply

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bbox | [BoundingBox](../../com.aspose.threed/boundingbox) |  |
| mat | [Matrix4](../../com.aspose.threed/matrix4) |  |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the bounding box.

**Returns:**
java.lang.String
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines if two objects are equal

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### clone() {#clone--}
```
public BoundingBox clone()
```




**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### copyFrom(BoundingBox src) {#copyFrom-com.aspose.threed.BoundingBox-}
```
public void copyFrom(BoundingBox src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this instance

**Returns:**
int
