---
title: NurbsDirection
second_title: Aspose.3D for Java API Reference
description: A 3D com.aspose.threed.NurbsSurface has two direction the com.aspose.threed.NurbsSurfacegetU and com.aspose.threed.NurbsSurfacegetV the com.aspose.threed.NurbsDirection defines data for each direction.
type: docs
weight: 100
url: /java/com.aspose.threed/nurbsdirection/
---

**Inheritance:**
java.lang.Object
```
public class NurbsDirection
```

A 3D com.aspose.threed.NurbsSurface has two direction, the com.aspose.threed.NurbsSurface\#getU and com.aspose.threed.NurbsSurface\#getV, the com.aspose.threed.NurbsDirection defines data for each direction. A direction is actually a NURBS curve, that means it's also defined by its com.aspose.threed.NurbsDirection\#getOrder, a com.aspose.threed.NurbsDirection\#getKnotVectors, and a set of weighted control points(defined in com.aspose.threed.NurbsSurface).
## Constructors

| Constructor | Description |
| --- | --- |
| [NurbsDirection()](#NurbsDirection--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getKnotVectors()](#getKnotVectors--) | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [getMultiplicity()](#getMultiplicity--) | Gets the multiplicity. |
| [getOrder()](#getOrder--) | Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [setOrder(int value)](#setOrder-int-) | Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [getDivisions()](#getDivisions--) | Gets the number of divisions between adjacent control points in current direction. |
| [setDivisions(int value)](#setDivisions-int-) | Sets the number of divisions between adjacent control points in current direction. |
| [getType()](#getType--) | Gets the type of the current direction. |
| [setType(NurbsType value)](#setType-com.aspose.threed.NurbsType-) | Sets the type of the current direction. |
| [getCount()](#getCount--) | Gets the count of control points in current direction. |
| [setCount(int value)](#setCount-int-) | Sets the count of control points in current direction. |
### NurbsDirection() {#NurbsDirection--}
```
public NurbsDirection()
```


### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.

**Returns:**
java.util.List<java.lang.Double>
### getMultiplicity() {#getMultiplicity--}
```
public List<Integer> getMultiplicity()
```


Gets the multiplicity.

**Returns:**
java.util.List<java.lang.Integer>
### getOrder() {#getOrder--}
```
public int getOrder()
```


Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Returns:**
int
### setOrder(int value) {#setOrder-int-}
```
public void setOrder(int value)
```


Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getDivisions() {#getDivisions--}
```
public int getDivisions()
```


Gets the number of divisions between adjacent control points in current direction.

**Returns:**
int
### setDivisions(int value) {#setDivisions-int-}
```
public void setDivisions(int value)
```


Sets the number of divisions between adjacent control points in current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getType() {#getType--}
```
public NurbsType getType()
```


Gets the type of the current direction.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype)
### setType(NurbsType value) {#setType-com.aspose.threed.NurbsType-}
```
public void setType(NurbsType value)
```


Sets the type of the current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | New value |

### getCount() {#getCount--}
```
public int getCount()
```


Gets the count of control points in current direction.

**Returns:**
int
### setCount(int value) {#setCount-int-}
```
public void setCount(int value)
```


Sets the count of control points in current direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

