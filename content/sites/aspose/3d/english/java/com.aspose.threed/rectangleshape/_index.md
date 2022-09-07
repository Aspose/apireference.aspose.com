---
title: RectangleShape
second_title: Aspose.3D for Java API Reference
description: IFC compatible rectangular shape with rounding corners.
type: docs
weight: 130
url: /java/com.aspose.threed/rectangleshape/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Profile](../../com.aspose.threed/profile), [com.aspose.threed.ParameterizedProfile](../../com.aspose.threed/parameterizedprofile)
```
public class RectangleShape extends ParameterizedProfile
```

IFC compatible rectangular shape with rounding corners.
## Constructors

| Constructor | Description |
| --- | --- |
| [RectangleShape()](#RectangleShape--) | Constructor of com.aspose.threed.RectangleShape |
## Methods

| Method | Description |
| --- | --- |
| [getRoundingRadius()](#getRoundingRadius--) | Gets the radius of the circular arcs of all four corners, measured in degrees. |
| [setRoundingRadius(double value)](#setRoundingRadius-double-) | Sets the radius of the circular arcs of all four corners, measured in degrees. |
| [getXDim()](#getXDim--) | Gets the extent of the rectangle in the direction of x-axis Default value is 2.0 |
| [setXDim(double value)](#setXDim-double-) | Sets the extent of the rectangle in the direction of x-axis Default value is 2.0 |
| [getYDim()](#getYDim--) | Gets the extent of the rectangle in the direction of y-axis Default value is 2.0 |
| [setYDim(double value)](#setYDim-double-) | Sets the extent of the rectangle in the direction of y-axis Default value is 2.0 |
| [getExtent()](#getExtent--) | Gets the extent in x and y dimension. |
### RectangleShape() {#RectangleShape--}
```
public RectangleShape()
```


Constructor of com.aspose.threed.RectangleShape

### getRoundingRadius() {#getRoundingRadius--}
```
public double getRoundingRadius()
```


Gets the radius of the circular arcs of all four corners, measured in degrees. Default value is 0.0

**Returns:**
double
### setRoundingRadius(double value) {#setRoundingRadius-double-}
```
public void setRoundingRadius(double value)
```


Sets the radius of the circular arcs of all four corners, measured in degrees. Default value is 0.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getXDim() {#getXDim--}
```
public double getXDim()
```


Gets the extent of the rectangle in the direction of x-axis Default value is 2.0

**Returns:**
double
### setXDim(double value) {#setXDim-double-}
```
public void setXDim(double value)
```


Sets the extent of the rectangle in the direction of x-axis Default value is 2.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getYDim() {#getYDim--}
```
public double getYDim()
```


Gets the extent of the rectangle in the direction of y-axis Default value is 2.0

**Returns:**
double
### setYDim(double value) {#setYDim-double-}
```
public void setYDim(double value)
```


Sets the extent of the rectangle in the direction of y-axis Default value is 2.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getExtent() {#getExtent--}
```
public Vector2 getExtent()
```


Gets the extent in x and y dimension.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
