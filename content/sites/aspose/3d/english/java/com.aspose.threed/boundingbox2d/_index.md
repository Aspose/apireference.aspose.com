---
title: BoundingBox2D
second_title: Aspose.3D for Java API Reference
description: The axis-aligned bounding box for com.aspose.threed.Vector2
type: docs
weight: 22
url: /java/com.aspose.threed/boundingbox2d/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class BoundingBox2D implements Struct<BoundingBox2D>, Serializable
```

The axis-aligned bounding box for com.aspose.threed.Vector2
## Constructors

| Constructor | Description |
| --- | --- |
| [BoundingBox2D(Vector2 minimum, Vector2 maximum)](#BoundingBox2D-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox2D()](#BoundingBox2D--) |  |
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
| [merge(Vector2 pt)](#merge-com.aspose.threed.Vector2-) | Merges the new box into the current bounding box. |
| [merge(BoundingBox2D bb)](#merge-com.aspose.threed.BoundingBox2D-) | Merges the new box into the current bounding box. |
| [toString()](#toString--) | Gets the string representation of the bounding box. |
| [clone()](#clone--) |  |
| [copyFrom(BoundingBox2D src)](#copyFrom-com.aspose.threed.BoundingBox2D-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### BoundingBox2D(Vector2 minimum, Vector2 maximum) {#BoundingBox2D-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public BoundingBox2D(Vector2 minimum, Vector2 maximum)
```


Initialize a finite bounding box with given minimum and maximum corner

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| minimum | [Vector2](../../com.aspose.threed/vector2) | The minimum corner |
| maximum | [Vector2](../../com.aspose.threed/vector2) | The maximum corner |

### BoundingBox2D() {#BoundingBox2D--}
```
public BoundingBox2D()
```


### NULL {#NULL}
```
public static final BoundingBox2D NULL
```


The null bounding box

### INFINITE {#INFINITE}
```
public static final BoundingBox2D INFINITE
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
public Vector2 getMinimum()
```


The minimum corner of the bounding box

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### getMaximum() {#getMaximum--}
```
public Vector2 getMaximum()
```


The maximum corner of the bounding box

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### merge(Vector2 pt) {#merge-com.aspose.threed.Vector2-}
```
public void merge(Vector2 pt)
```


Merges the new box into the current bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt | [Vector2](../../com.aspose.threed/vector2) |  |

### merge(BoundingBox2D bb) {#merge-com.aspose.threed.BoundingBox2D-}
```
public void merge(BoundingBox2D bb)
```


Merges the new box into the current bounding box.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bb | [BoundingBox2D](../../com.aspose.threed/boundingbox2d) |  |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of the bounding box.

**Returns:**
java.lang.String
### clone() {#clone--}
```
public BoundingBox2D clone()
```




**Returns:**
[BoundingBox2D](../../com.aspose.threed/boundingbox2d)
### copyFrom(BoundingBox2D src) {#copyFrom-com.aspose.threed.BoundingBox2D-}
```
public void copyFrom(BoundingBox2D src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [BoundingBox2D](../../com.aspose.threed/boundingbox2d) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
