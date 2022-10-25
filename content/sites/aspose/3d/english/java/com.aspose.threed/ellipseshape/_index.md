---
title: EllipseShape
second_title: Aspose.3D for Java API Reference
description: IFC compatible ellipse shape that defined by parameters.
type: docs
weight: 47
url: /java/com.aspose.threed/ellipseshape/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Profile](../../com.aspose.threed/profile), [com.aspose.threed.ParameterizedProfile](../../com.aspose.threed/parameterizedprofile)
```
public class EllipseShape extends ParameterizedProfile
```

IFC compatible ellipse shape that defined by parameters. The center position of the profile is in the center of the bounding box.
## Constructors

| Constructor | Description |
| --- | --- |
| [EllipseShape()](#EllipseShape--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getSemiAxis1()](#getSemiAxis1--) | Gets the first radius of the ellipse that measured in the direction of x axis. |
| [setSemiAxis1(double value)](#setSemiAxis1-double-) | Sets the first radius of the ellipse that measured in the direction of x axis. |
| [getSemiAxis2()](#getSemiAxis2--) | Gets the second radius of the ellipse that measured in the direction of y axis. |
| [setSemiAxis2(double value)](#setSemiAxis2-double-) | Sets the second radius of the ellipse that measured in the direction of y axis. |
| [getExtent()](#getExtent--) | Gets the extent in x and y dimension. |
### EllipseShape() {#EllipseShape--}
```
public EllipseShape()
```


### getSemiAxis1() {#getSemiAxis1--}
```
public double getSemiAxis1()
```


Gets the first radius of the ellipse that measured in the direction of x axis.

**Returns:**
double
### setSemiAxis1(double value) {#setSemiAxis1-double-}
```
public void setSemiAxis1(double value)
```


Sets the first radius of the ellipse that measured in the direction of x axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getSemiAxis2() {#getSemiAxis2--}
```
public double getSemiAxis2()
```


Gets the second radius of the ellipse that measured in the direction of y axis.

**Returns:**
double
### setSemiAxis2(double value) {#setSemiAxis2-double-}
```
public void setSemiAxis2(double value)
```


Sets the second radius of the ellipse that measured in the direction of y axis.

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
