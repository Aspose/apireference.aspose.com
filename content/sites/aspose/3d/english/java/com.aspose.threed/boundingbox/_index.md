---
title: BoundingBox
second_title: Aspose.3D for Java API Reference
description: The axis-aligned bounding box Example  The following code shows how to get a bounding box from an Entity instance.
type: docs
weight: 22
url: /java/com.aspose.threed/boundingbox/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class BoundingBox implements Struct<BoundingBox>, Serializable
```

The axis-aligned bounding box **Example:** The following code shows how to get a bounding box from an Entity instance.

```
var sphere = new Sphere();
      var boundingBox = sphere.getBoundingBox();
      System.out.println("Bounding box = " + boundingBox);
```
## Constructors

| Constructor | Description |
| --- | --- |
| [BoundingBox(Vector3 minimum, Vector3 maximum)](#BoundingBox-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)](#BoundingBox-double-double-double-double-double-double-) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox()](#BoundingBox--) |  |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [contains(BoundingBox bbox)](#contains-com.aspose.threed.BoundingBox-) | The bounding box to check if it's inside current bounding box. |
| [contains(Vector3 p)](#contains-com.aspose.threed.Vector3-) | Check if the point p is inside the bounding box |
| [copyFrom(BoundingBox src)](#copyFrom-com.aspose.threed.BoundingBox-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines if two objects are equal |
| [fromGeometry(Geometry geometry)](#fromGeometry-com.aspose.threed.Geometry-) | Construct a bounding box from given geometry |
| [getCenter()](#getCenter--) | The center of the bounding box. |
| [getClass()](#getClass--) |  |
| [getExtent()](#getExtent--) | Gets the extent of the bounding box. |
| [getInfinite()](#getInfinite--) | The infinite bounding box |
| [getMaximum()](#getMaximum--) | The maximum corner of the bounding box |
| [getMinimum()](#getMinimum--) | The minimum corner of the bounding box |
| [getNull()](#getNull--) | The null bounding box |
| [getSize()](#getSize--) | The size of the bounding box |
| [hashCode()](#hashCode--) | Returns the hash code for this instance |
| [merge(BoundingBox bb)](#merge-com.aspose.threed.BoundingBox-) | Merges the new box into the current bounding box. |
| [merge(Vector3 pt)](#merge-com.aspose.threed.Vector3-) | Merge current bounding box with given point |
| [merge(Vector4 pt)](#merge-com.aspose.threed.Vector4-) | Merge current bounding box with given point |
| [merge(double x, double y, double z)](#merge-double-double-double-) | Merge current bounding box with given point |
| [mul(BoundingBox bbox, Matrix4 mat)](#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-) | Operator overloading for multiply, new bounding box's minimum and maximum corner will be transformed by the matrix. |
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
| maximum | [Vector3](../../com.aspose.threed/vector3) | The maximum corner **Example:** The following code shows how to construct a bounding box from minimum and maximum corners.

```
var minimum = new Vector3(0, 0, 0);
  var maximum = new Vector3(10, 10, 10);
  var boundingBox = new BoundingBox(minimum, maximum);
  System.out.println("Bounding box = " + boundingBox);
``` |

### BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {#BoundingBox-double-double-double-double-double-double-}
```
public BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
```


Initialize a finite bounding box with given minimum and maximum corner

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| minX | double | The minimum corner's X |
| minY | double | The minimum corner's Y |
| minZ | double | The minimum corner's Z |
| maxX | double | The maximum corner's X |
| maxY | double | The maximum corner's Y |
| maxZ | double | The maximum corner's Z **Example:** The following code shows how to construct a bounding box from minimum and maximum corners.

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  System.out.println("Bounding box = " + boundingBox);
``` |

### BoundingBox() {#BoundingBox--}
```
public BoundingBox()
```


### clone() {#clone--}
```
public BoundingBox clone()
```


Clone current instance

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### contains(BoundingBox bbox) {#contains-com.aspose.threed.BoundingBox-}
```
public boolean contains(BoundingBox bbox)
```


The bounding box to check if it's inside current bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bbox | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

**Returns:**
boolean
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
boolean - True if the point is inside the bounding box **Example:** The following code shows how to check if a point is inside the bounding box.

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  var pt = new Vector3(4, 4, 4);
  System.out.println("Bounding box overlaps = " + boundingBox.contains(pt));
```
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
| obj | java.lang.Object | The object to compare |

**Returns:**
boolean - true if two objects are equal
### fromGeometry(Geometry geometry) {#fromGeometry-com.aspose.threed.Geometry-}
```
public static BoundingBox fromGeometry(Geometry geometry)
```


Construct a bounding box from given geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) | The geometry to calculate bounding box |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The bounding box of given geometry **Example:** The following code shows how to construct a bounding box from a geometry instance.

```
var sphere = (new Sphere()).toMesh();
  var boundingBox = BoundingBox.fromGeometry(sphere);
  System.out.println("Bounding box = " + boundingBox);
```
### getCenter() {#getCenter--}
```
public Vector3 getCenter()
```


The center of the bounding box.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The center of the bounding box.
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
[BoundingBoxExtent](../../com.aspose.threed/boundingboxextent) - the extent of the bounding box.
### getInfinite() {#getInfinite--}
```
public static BoundingBox getInfinite()
```


The infinite bounding box

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The infinite bounding box
### getMaximum() {#getMaximum--}
```
public Vector3 getMaximum()
```


The maximum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The maximum corner of the bounding box
### getMinimum() {#getMinimum--}
```
public Vector3 getMinimum()
```


The minimum corner of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The minimum corner of the bounding box
### getNull() {#getNull--}
```
public static BoundingBox getNull()
```


The null bounding box

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The null bounding box
### getSize() {#getSize--}
```
public Vector3 getSize()
```


The size of the bounding box

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The size of the bounding box
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this instance

**Returns:**
int - The hash code of the bounding box
### merge(BoundingBox bb) {#merge-com.aspose.threed.BoundingBox-}
```
public void merge(BoundingBox bb)
```


Merges the new box into the current bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bb | [BoundingBox](../../com.aspose.threed/boundingbox) | The bounding box to merge |

### merge(Vector3 pt) {#merge-com.aspose.threed.Vector3-}
```
public void merge(Vector3 pt)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Vector3](../../com.aspose.threed/vector3) | The point to be merged into the bounding box **Example:** The following code shows how to merge a point to bounding box.

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(new Vector3(1, 10, -1));
  System.out.println("Bounding box = " + boundingBox);
``` |

### merge(Vector4 pt) {#merge-com.aspose.threed.Vector4-}
```
public void merge(Vector4 pt)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Vector4](../../com.aspose.threed/vector4) | The point to be merged into the bounding box **Example:** The following code shows how to merge a point to bounding box.

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(new Vector4(1, 10, -1));
  System.out.println("Bounding box = " + boundingBox);
``` |

### merge(double x, double y, double z) {#merge-double-double-double-}
```
public void merge(double x, double y, double z)
```


Merge current bounding box with given point

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The point to be merged into the bounding box |
| y | double | The point to be merged into the bounding box |
| z | double | The point to be merged into the bounding box **Example:** The following code shows how to merge a point to bounding box.

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(1, 10, -1);
  System.out.println("Bounding box = " + boundingBox);
``` |

### mul(BoundingBox bbox, Matrix4 mat) {#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-}
```
public static BoundingBox mul(BoundingBox bbox, Matrix4 mat)
```


Operator overloading for multiply, new bounding box's minimum and maximum corner will be transformed by the matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bbox | [BoundingBox](../../com.aspose.threed/boundingbox) | The input bounding box. |
| mat | [Matrix4](../../com.aspose.threed/matrix4) | The matrix used to transform the bounding box's corners |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The product of bounding box and transform matrix.
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
boolean - True if the current bounding box overlaps with the given one. **Example:** The following code shows how to check if two bounding boxes overlaps with each other.

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  var bbox2 = new BoundingBox(1, 1, 1, 11, 11, 11);
  System.out.println("Bounding box overlaps = " + boundingBox.overlapsWith(bbox2));
```
### scale() {#scale--}
```
public double scale()
```


Calculates the absolute largest coordinate value of any contained point.

**Returns:**
double - the calculated absolute largest coordinate value of any contained point.
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the bounding box.

**Returns:**
java.lang.String - The string representation of the bounding box.
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

