---
title: Interpolation
second_title: Aspose.3D for Java API Reference
description: The key frames interpolation type.
type: docs
weight: 254
url: /java/com.aspose.threed/interpolation/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum Interpolation extends Enum<Interpolation>
```

The key frame's interpolation type.
## Fields

| Field | Description |
| --- | --- |
| [CONSTANT](#CONSTANT) | The value will remains constant to the value of the first point until the next segment. |
| [LINEAR](#LINEAR) | Linear interpolation is a straight line between two points. |
| [BEZIER](#BEZIER) | A bezier or Hermite spline. |
| [B_SPLINE](#B-SPLINE) | Basis splines are defined by a series of control points, for which the curve is guaranteed only to go through the first and the last point. |
| [CARDINAL_SPLINE](#CARDINAL-SPLINE) | A cardinal spline is a cubic Hermite spline whose tangents are defined by the endpoints and a tension parameter. |
| [TCB_SPLINE](#TCB-SPLINE) | Also called Kochanek-Bartels spline, the behavior of tangent is defined by tension/bias/continuity |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### CONSTANT {#CONSTANT}
```
public static final Interpolation CONSTANT
```


The value will remains constant to the value of the first point until the next segment.

### LINEAR {#LINEAR}
```
public static final Interpolation LINEAR
```


Linear interpolation is a straight line between two points.

### BEZIER {#BEZIER}
```
public static final Interpolation BEZIER
```


A bezier or Hermite spline.

### B_SPLINE {#B-SPLINE}
```
public static final Interpolation B_SPLINE
```


Basis splines are defined by a series of control points, for which the curve is guaranteed only to go through the first and the last point.

### CARDINAL_SPLINE {#CARDINAL-SPLINE}
```
public static final Interpolation CARDINAL_SPLINE
```


A cardinal spline is a cubic Hermite spline whose tangents are defined by the endpoints and a tension parameter.

### TCB_SPLINE {#TCB-SPLINE}
```
public static final Interpolation TCB_SPLINE
```


Also called Kochanek-Bartels spline, the behavior of tangent is defined by tension/bias/continuity

### values() {#values--}
```
public static Interpolation[] values()
```




**Returns:**
com.aspose.threed.Interpolation[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static Interpolation valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[Interpolation](../../com.aspose.threed/interpolation)
