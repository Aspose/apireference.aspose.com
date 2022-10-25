---
title: NurbsCurve
second_title: Aspose.3D for Java API Reference
description: a hrefhttps//en.wikipedia.org/wiki/Non-uniform_rational_B-splineNURBS curve/a is a curve represented by NURBSNon-uniform rational basis spline
 A NURBS curve is defined by its com.aspose.threed.NurbsCurvegetOrder a set of weighted com.aspose.threed.GeometrygetControlPoints and a com.aspose.threed.NurbsCurvegetKnotVectors
 The w component in control point is used as control points weight whatever it is a com.aspose.threed.CurveDimensionTWO_DIMENSIONAL or com.aspose.threed.CurveDimensionTHREE_DIMENSIONAL
type: docs
weight: 99
url: /java/com.aspose.threed/nurbscurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class NurbsCurve extends Curve
```

[NURBS curve][] is a curve represented by NURBS(Non-uniform rational basis spline), A NURBS curve is defined by its com.aspose.threed.NurbsCurve\#getOrder, a set of weighted com.aspose.threed.Geometry\#getControlPoints and a com.aspose.threed.NurbsCurve\#getKnotVectors The w component in control point is used as control point's weight, whatever it is a com.aspose.threed.CurveDimension\#TWO\_DIMENSIONAL or com.aspose.threed.CurveDimension\#THREE\_DIMENSIONAL


[NURBS curve]: https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline
## Constructors

| Constructor | Description |
| --- | --- |
| [NurbsCurve()](#NurbsCurve--) | Initializes a new instance of the com.aspose.threed.NurbsCurve class. |
| [NurbsCurve(String name)](#NurbsCurve-java.lang.String-) | Initializes a new instance of the com.aspose.threed.NurbsCurve class. |
## Methods

| Method | Description |
| --- | --- |
| [getControlPoints()](#getControlPoints--) | Gets all control points |
| [getMultiplicity()](#getMultiplicity--) | Gets the multiplicity. |
| [getOrder()](#getOrder--) | Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [setOrder(int value)](#setOrder-int-) | Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [getDimension()](#getDimension--) | Gets the curve's dimension. |
| [setDimension(CurveDimension value)](#setDimension-com.aspose.threed.CurveDimension-) | Sets the curve's dimension. |
| [getCurveType()](#getCurveType--) | Gets the type of the curve. |
| [setCurveType(NurbsType value)](#setCurveType-com.aspose.threed.NurbsType-) | Sets the type of the curve. |
| [getKnotVectors()](#getKnotVectors--) | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [getRational()](#getRational--) | Gets whether it is rational, this value indicates whether this com.aspose.threed.NurbsCurve is rational spline or non-rational spline. |
| [setRational(boolean value)](#setRational-boolean-) | Sets whether it is rational, this value indicates whether this com.aspose.threed.NurbsCurve is rational spline or non-rational spline. |
| [evaluate(int steps)](#evaluate-int-) | Evaluate the NURBS curve |
| [evaluate()](#evaluate--) | Evaluate the NURBS curve |
| [evaluateAt(double u)](#evaluateAt-double-) | Evaluate the curve's point at specified position |
### NurbsCurve() {#NurbsCurve--}
```
public NurbsCurve()
```


Initializes a new instance of the com.aspose.threed.NurbsCurve class.

### NurbsCurve(String name) {#NurbsCurve-java.lang.String-}
```
public NurbsCurve(String name)
```


Initializes a new instance of the com.aspose.threed.NurbsCurve class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Gets all control points

**Returns:**
java.util.List<com.aspose.threed.Vector4>
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

### getDimension() {#getDimension--}
```
public CurveDimension getDimension()
```


Gets the curve's dimension.

**Returns:**
[CurveDimension](../../com.aspose.threed/curvedimension)
### setDimension(CurveDimension value) {#setDimension-com.aspose.threed.CurveDimension-}
```
public void setDimension(CurveDimension value)
```


Sets the curve's dimension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CurveDimension](../../com.aspose.threed/curvedimension) | New value |

### getCurveType() {#getCurveType--}
```
public NurbsType getCurveType()
```


Gets the type of the curve.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype)
### setCurveType(NurbsType value) {#setCurveType-com.aspose.threed.NurbsType-}
```
public void setCurveType(NurbsType value)
```


Sets the type of the curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | New value |

### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.

**Returns:**
java.util.List<java.lang.Double>
### getRational() {#getRational--}
```
public boolean getRational()
```


Gets whether it is rational, this value indicates whether this com.aspose.threed.NurbsCurve is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines.

**Returns:**
boolean
### setRational(boolean value) {#setRational-boolean-}
```
public void setRational(boolean value)
```


Sets whether it is rational, this value indicates whether this com.aspose.threed.NurbsCurve is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### evaluate(int steps) {#evaluate-int-}
```
public Vector4[] evaluate(int steps)
```


Evaluate the NURBS curve

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| steps | int | The evaluation frequency between two neighbor knots, default value is 20 |

**Returns:**
com.aspose.threed.Vector4[] - Points in the curve
### evaluate() {#evaluate--}
```
public Vector4[] evaluate()
```


Evaluate the NURBS curve

**Returns:**
com.aspose.threed.Vector4[] - Points in the curve
### evaluateAt(double u) {#evaluateAt-double-}
```
public Vector4 evaluateAt(double u)
```


Evaluate the curve's point at specified position

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| u | double | The position in the curve, between 0 and 1 |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
