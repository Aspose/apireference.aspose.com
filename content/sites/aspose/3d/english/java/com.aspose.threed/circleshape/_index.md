---
title: CircleShape
second_title: Aspose.3D for Java API Reference
description: IFC compatible circle profile which can be used to construct a mesh through com.aspose.threed.LinearExtrusion
type: docs
weight: 28
url: /java/com.aspose.threed/circleshape/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Profile](../../com.aspose.threed/profile), [com.aspose.threed.ParameterizedProfile](../../com.aspose.threed/parameterizedprofile)
```
public class CircleShape extends ParameterizedProfile
```

IFC compatible circle profile, which can be used to construct a mesh through com.aspose.threed.LinearExtrusion
## Constructors

| Constructor | Description |
| --- | --- |
| [CircleShape()](#CircleShape--) | Construct a com.aspose.threed.CircleShape profile with default radius(5). |
| [CircleShape(double radius)](#CircleShape-double-) | Construct a com.aspose.threed.CircleShape profile with specified radius. |
## Methods

| Method | Description |
| --- | --- |
| [getRadius()](#getRadius--) | Gets the radius of the circle. |
| [setRadius(double value)](#setRadius-double-) | Sets the radius of the circle. |
| [getExtent()](#getExtent--) | Gets the extent in x and y dimension. |
### CircleShape() {#CircleShape--}
```
public CircleShape()
```


Construct a com.aspose.threed.CircleShape profile with default radius(5).

### CircleShape(double radius) {#CircleShape-double-}
```
public CircleShape(double radius)
```


Construct a com.aspose.threed.CircleShape profile with specified radius.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double |  |

### getRadius() {#getRadius--}
```
public double getRadius()
```


Gets the radius of the circle.

**Returns:**
double
### setRadius(double value) {#setRadius-double-}
```
public void setRadius(double value)
```


Sets the radius of the circle.

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
