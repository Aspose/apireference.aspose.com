---
title: BoundingBox
second_title: Aspose.3D for Java API Reference
description: The axis-aligned bounding box
type: docs
weight: 22
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
| [INFINITE](#INFINITE) | The infinite bounding box |
| [NULL](#NULL) | The null bounding box |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [contains(Vector3 p)](#contains-com.aspose.threed.Vector3-) | Check if the point p is inside the bounding box |
| [copyFrom(BoundingBox src)](#copyFrom-com.aspose.threed.BoundingBox-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines if two objects are equal |
| [fromGeometry(Geometry geometry)](#fromGeometry-com.aspose.threed.Geometry-) | Construct a bounding box from given geometry |
| [getCenter()](#getCenter--) | The center of the bounding box. |
| [getClass()](#getClass--) |  |
| [getExtent()](#getExtent--) | Gets the extent of the bounding box. |
| [getMaximum()](#getMaximum--) | The maximum corner of the bounding box |
| [getMinimum()](#getMinimum--) | The minimum corner of the bounding box |
| [getSize()](#getSize--) | The size of the bounding box |
| [hashCode()](#hashCode--) | Returns the hash code for this instance |
| [merge(BoundingBox bb)](#merge-com.aspose.threed.BoundingBox-) | Merges the new box into the current bounding box. |
| [merge(Vector3 pt)](#merge-com.aspose.threed.Vector3-) | Merge current bounding box with given point |
| [merge(Vector4 pt)](#merge-com.aspose.threed.Vector4-) | Merge current bounding box with given point |
| [merge(double x, double y, double z)](#merge-double-double-double-) | Merge current bounding box with given point |
| [mul(BoundingBox bbox, Matrix4 mat)](#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-) | Operator overloading for multiply |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [overlapsWith(BoundingBox box)](#overlapsWith-com.aspose.threed.BoundingBox-) | Check if current bounding box overlaps with specified bounding box. |
| [scale()](#scale--) | Calculates the absolute largest coordinate value of any contained point. |
| [toString()](#toString--) | Gets the string representation of the bounding box. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


### INFINITE {#INFINITE}
```
public static final BoundingBox INFINITE
```


The infinite bounding box

### NULL {#NULL}
```
public static final BoundingBox NULL
```


The null bounding box

### clone() {#clone--}
```
public BoundingBox clone()
```




**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### contains(Vector3 p) {#contains-com.aspose.threed.Vector3-}
```
public boolean contains(Vector3 p)
```


Check if the point p is inside the bounding box

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| p | [Vector3](../../com.aspose.threed/vector3) | The point to test |

**Returns:**
boolean
### copyFrom(BoundingBox src) {#copyFrom-com.aspose.threed.BoundingBox-}
```
public void copyFrom(BoundingBox src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

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
### getCenter() {#getCenter--}
```
public Vector3 getCenter()
```


The center of the bounding box.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getExtent() {#getExtent--}
```
public BoundingBoxExtent getExtent()
```


Gets the extent of the bounding box.

**Returns:**
[BoundingBoxExtent](../../com.aspose.threed/boundingboxextent)
### getMaximum() {#getMaximum--}
```
public Vector3 getMaximum()
```


The maximum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getMinimum() {#getMinimum--}
```
public Vector3 getMinimum()
```


The minimum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getSize() {#getSize--}
```
public Vector3 getSize()
```


The size of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this instance

**Returns:**
int
### merge(BoundingBox bb) {#merge-com.aspose.threed.BoundingBox-}
```
public void merge(BoundingBox bb)
```


Merges the new box into the current bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bb | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

### merge(Vector3 pt) {#merge-com.aspose.threed.Vector3-}
```
public void merge(Vector3 pt)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Vector3](../../com.aspose.threed/vector3) |  |

### merge(Vector4 pt) {#merge-com.aspose.threed.Vector4-}
```
public void merge(Vector4 pt)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Vector4](../../com.aspose.threed/vector4) |  |

### merge(double x, double y, double z) {#merge-double-double-double-}
```
public void merge(double x, double y, double z)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### overlapsWith(BoundingBox box) {#overlapsWith-com.aspose.threed.BoundingBox-}
```
public boolean overlapsWith(BoundingBox box)
```


Check if current bounding box overlaps with specified bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| box | [BoundingBox](../../com.aspose.threed/boundingbox) | The other bounding box to test |

**Returns:**
boolean
### scale() {#scale--}
```
public double scale()
```


Calculates the absolute largest coordinate value of any contained point.

**Returns:**
double
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the bounding box.

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

