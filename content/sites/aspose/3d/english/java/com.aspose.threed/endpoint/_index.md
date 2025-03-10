---
title: EndPoint
second_title: Aspose.3D for Java API Reference
description: The end point to trim the curve can be a parameter value or a Cartesian point.
type: docs
weight: 49
url: /java/com.aspose.threed/endpoint/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class EndPoint implements Struct<EndPoint>, Serializable
```

The end point to trim the curve, can be a parameter value or a Cartesian point.
## Constructors

| Constructor | Description |
| --- | --- |
| [EndPoint(Vector3 point)](#EndPoint-com.aspose.threed.Vector3-) | Construct a [EndPoint](../../com.aspose.threed/endpoint) from a Cartesian point. |
| [EndPoint(double v)](#EndPoint-double-) | Construct a [EndPoint](../../com.aspose.threed/endpoint) from a real parameter. |
| [EndPoint()](#EndPoint--) |  |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [copyFrom(EndPoint src)](#copyFrom-com.aspose.threed.EndPoint-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [fromDegree(double degree)](#fromDegree-double-) | Create an end point measured in degree. |
| [fromRadian(double degree)](#fromRadian-double-) | Create an end point measured in radian. |
| [getAsPoint()](#getAsPoint--) | Gets the end point as Cartesian point, or thrown an exception. |
| [getAsValue()](#getAsValue--) | Gets the end point as a real parameter, or throw an exception. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isCartesianPoint()](#isCartesianPoint--) | Is the end point a Cartesian point? |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Returns a string representation of the current end point. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EndPoint(Vector3 point) {#EndPoint-com.aspose.threed.Vector3-}
```
public EndPoint(Vector3 point)
```


Construct a [EndPoint](../../com.aspose.threed/endpoint) from a Cartesian point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Vector3](../../com.aspose.threed/vector3) | Point to construct |

### EndPoint(double v) {#EndPoint-double-}
```
public EndPoint(double v)
```


Construct a [EndPoint](../../com.aspose.threed/endpoint) from a real parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | double | The real number parameter for constructing an end point |

### EndPoint() {#EndPoint--}
```
public EndPoint()
```


### clone() {#clone--}
```
public EndPoint clone()
```


Clone current instance

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
### fromDegree(double degree) {#fromDegree-double-}
```
public static EndPoint fromDegree(double degree)
```


Create an end point measured in degree.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| degree | double | The value in degree |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - An end point constructed from degree
### fromRadian(double degree) {#fromRadian-double-}
```
public static EndPoint fromRadian(double degree)
```


Create an end point measured in radian.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| degree | double | The value in radian |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - An end point constructed from radian
### getAsPoint() {#getAsPoint--}
```
public Vector3 getAsPoint()
```


Gets the end point as Cartesian point, or thrown an exception.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the end point as Cartesian point, or thrown an exception.
### getAsValue() {#getAsValue--}
```
public double getAsValue()
```


Gets the end point as a real parameter, or throw an exception.

**Returns:**
double - the end point as a real parameter, or throw an exception.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### isCartesianPoint() {#isCartesianPoint--}
```
public boolean isCartesianPoint()
```


Is the end point a Cartesian point?

**Returns:**
boolean - Is the end point a Cartesian point?
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```


Returns a string representation of the current end point.

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

