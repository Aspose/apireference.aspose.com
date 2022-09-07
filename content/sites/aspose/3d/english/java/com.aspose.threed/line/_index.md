---
title: Line
second_title: Aspose.3D for Java API Reference
description: A polyline is a path defined by a set of points with com.aspose.threed.GeometrygetControlPoints and connected by com.aspose.threed.LinegetSegments
 which means it can also be a set of connected line segments.
type: docs
weight: 85
url: /java/com.aspose.threed/line/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class Line extends Curve
```

A polyline is a path defined by a set of points with com.aspose.threed.Geometry\#getControlPoints, and connected by com.aspose.threed.Line\#getSegments, which means it can also be a set of connected line segments. The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses com.aspose.threed.NurbsCurve.
## Constructors

| Constructor | Description |
| --- | --- |
| [Line()](#Line--) | Initializes a new instance of the com.aspose.threed.Line class. |
| [Line(String name)](#Line-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Line class. |
## Methods

| Method | Description |
| --- | --- |
| [getControlPoints()](#getControlPoints--) | Gets all control points |
| [getVisible()](#getVisible--) | Gets if the geometry is visible |
| [setVisible(boolean value)](#setVisible-boolean-) | Sets if the geometry is visible |
| [getSegments()](#getSegments--) | Gets the segments of the line |
| [fromPoints(Vector3[] points)](#fromPoints-com.aspose.threed.Vector3...-) | Construct a com.aspose.threed.Line instance from a set of points. |
| [makeDefaultIndices()](#makeDefaultIndices--) | Generate the sequence 0,1,2,3....com.aspose.threed.Geometry\#getControlPoints.Length-1 to com.aspose.threed.Line\#getSegments so the ControlPoints can be used as a single line |
### Line() {#Line--}
```
public Line()
```


Initializes a new instance of the com.aspose.threed.Line class.

### Line(String name) {#Line-java.lang.String-}
```
public Line(String name)
```


Initializes a new instance of the com.aspose.threed.Line class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Gets all control points

**Returns:**
java.util.List<com.aspose.threed.Vector4>
### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gets if the geometry is visible

**Returns:**
boolean
### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Sets if the geometry is visible

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getSegments() {#getSegments--}
```
public List<int[]> getSegments()
```


Gets the segments of the line

**Returns:**
java.util.List<int[]>
### fromPoints(Vector3[] points) {#fromPoints-com.aspose.threed.Vector3...-}
```
public static Line fromPoints(Vector3[] points)
```


Construct a com.aspose.threed.Line instance from a set of points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | com.aspose.threed.Vector3[] |  |

**Returns:**
[Line](../../com.aspose.threed/line)
### makeDefaultIndices() {#makeDefaultIndices--}
```
public void makeDefaultIndices()
```


Generate the sequence 0,1,2,3....com.aspose.threed.Geometry\#getControlPoints.Length-1 to com.aspose.threed.Line\#getSegments so the ControlPoints can be used as a single line

