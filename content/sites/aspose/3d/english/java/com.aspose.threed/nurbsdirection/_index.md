---
title: NurbsDirection
second_title: Aspose.3D for Java API Reference
description: A 3D  has two direction the  and  the  defines data for each direction.
type: docs
weight: 104
url: /java/com.aspose.threed/nurbsdirection/
---

**Inheritance:**
java.lang.Object
```
public class NurbsDirection
```

A 3D [NurbsSurface](../../com.aspose.threed/nurbssurface) has two direction, the [NurbsSurface.getU](../../com.aspose.threed/nurbssurface\#getU) and [NurbsSurface.getV](../../com.aspose.threed/nurbssurface\#getV), the [NurbsDirection](../../com.aspose.threed/nurbsdirection) defines data for each direction. A direction is actually a NURBS curve, that means it's also defined by its [getOrder](../../com.aspose.threed/nurbsdirection\#getOrder), a [getKnotVectors](../../com.aspose.threed/nurbsdirection\#getKnotVectors), and a set of weighted control points(defined in [NurbsSurface](../../com.aspose.threed/nurbssurface)).
## Constructors

| Constructor | Description |
| --- | --- |
| [NurbsDirection()](#NurbsDirection--) |  |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Gets the count of control points in current direction. |
| [getDivisions()](#getDivisions--) | Gets the number of divisions between adjacent control points in current direction. |
| [getKnotVectors()](#getKnotVectors--) | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [getMultiplicity()](#getMultiplicity--) | Gets the multiplicity. |
| [getOrder()](#getOrder--) | Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [getType()](#getType--) | Gets the type of the current direction. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCount(int value)](#setCount-int-) | Sets the count of control points in current direction. |
| [setDivisions(int value)](#setDivisions-int-) | Sets the number of divisions between adjacent control points in current direction. |
| [setOrder(int value)](#setOrder-int-) | Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [setType(NurbsType value)](#setType-com.aspose.threed.NurbsType-) | Sets the type of the current direction. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NurbsDirection() {#NurbsDirection--}
```
public NurbsDirection()
```


### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public int getCount()
```


Gets the count of control points in current direction.

**Returns:**
int - the count of control points in current direction.
### getDivisions() {#getDivisions--}
```
public int getDivisions()
```


Gets the number of divisions between adjacent control points in current direction.

**Returns:**
int - the number of divisions between adjacent control points in current direction.
### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.

**Returns:**
java.util.List<java.lang.Double> - the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.
### getMultiplicity() {#getMultiplicity--}
```
public List<Integer> getMultiplicity()
```


Gets the multiplicity.

**Returns:**
java.util.List<java.lang.Integer> - the multiplicity.
### getOrder() {#getOrder--}
```
public int getOrder()
```


Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Returns:**
int - the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.
### getType() {#getType--}
```
public NurbsType getType()
```


Gets the type of the current direction.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype) - the type of the current direction.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setCount(int value) {#setCount-int-}
```
public void setCount(int value)
```


Sets the count of control points in current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDivisions(int value) {#setDivisions-int-}
```
public void setDivisions(int value)
```


Sets the number of divisions between adjacent control points in current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setOrder(int value) {#setOrder-int-}
```
public void setOrder(int value)
```


Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setType(NurbsType value) {#setType-com.aspose.threed.NurbsType-}
```
public void setType(NurbsType value)
```


Sets the type of the current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | New value |

### toString() {#toString--}
```
public String toString()
```




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

