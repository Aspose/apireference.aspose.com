---
title: EndPoint
second_title: Aspose.3D for Java API Reference
description: The end point to trim the curve can be a parameter value or a Cartesian point.
type: docs
weight: 48
url: /java/com.aspose.threed/endpoint/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class EndPoint implements Struct<EndPoint>, Serializable
```

The end point to trim the curve, can be a parameter value or a Cartesian point.
## Constructors

| Constructor | Description |
| --- | --- |
| [EndPoint(Vector3 point)](#EndPoint-com.aspose.threed.Vector3-) | Construct a com.aspose.threed.EndPoint from a Cartesian point. |
| [EndPoint(double v)](#EndPoint-double-) | Construct a com.aspose.threed.EndPoint from a real parameter. |
| [EndPoint()](#EndPoint--) |  |
## Methods

| Method | Description |
| --- | --- |
| [fromDegree(double degree)](#fromDegree-double-) | Create an end point measured in degree. |
| [fromRadian(double degree)](#fromRadian-double-) | Create an end point measured in radian. |
| [isCartesianPoint()](#isCartesianPoint--) | Is the end point a Cartesian point? |
| [getAsPoint()](#getAsPoint--) | Gets the end point as Cartesian point, or thrown an exception. |
| [getAsValue()](#getAsValue--) | Gets the end point as a real parameter, or throw an exception. |
| [toString()](#toString--) | Returns a string representation of the current end point. |
| [clone()](#clone--) |  |
| [copyFrom(EndPoint src)](#copyFrom-com.aspose.threed.EndPoint-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### EndPoint(Vector3 point) {#EndPoint-com.aspose.threed.Vector3-}
```
public EndPoint(Vector3 point)
```


Construct a com.aspose.threed.EndPoint from a Cartesian point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Vector3](../../com.aspose.threed/vector3) |  |

### EndPoint(double v) {#EndPoint-double-}
```
public EndPoint(double v)
```


Construct a com.aspose.threed.EndPoint from a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | double |  |

### EndPoint() {#EndPoint--}
```
public EndPoint()
```


### fromDegree(double degree) {#fromDegree-double-}
```
public static EndPoint fromDegree(double degree)
```


Create an end point measured in degree.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| degree | double |  |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### fromRadian(double degree) {#fromRadian-double-}
```
public static EndPoint fromRadian(double degree)
```


Create an end point measured in radian.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| degree | double |  |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### isCartesianPoint() {#isCartesianPoint--}
```
public boolean isCartesianPoint()
```


Is the end point a Cartesian point?

**Returns:**
boolean
### getAsPoint() {#getAsPoint--}
```
public Vector3 getAsPoint()
```


Gets the end point as Cartesian point, or thrown an exception.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getAsValue() {#getAsValue--}
```
public double getAsValue()
```


Gets the end point as a real parameter, or throw an exception.

**Returns:**
double
### toString() {#toString--}
```
public String toString()
```


Returns a string representation of the current end point.

**Returns:**
java.lang.String
### clone() {#clone--}
```
public EndPoint clone()
```




**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### copyFrom(EndPoint src) {#copyFrom-com.aspose.threed.EndPoint-}
```
public void copyFrom(EndPoint src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [EndPoint](../../com.aspose.threed/endpoint) |  |

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
