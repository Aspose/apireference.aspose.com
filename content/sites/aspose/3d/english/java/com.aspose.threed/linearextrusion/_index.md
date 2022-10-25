---
title: LinearExtrusion
second_title: Aspose.3D for Java API Reference
description: Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension.
type: docs
weight: 86
url: /java/com.aspose.threed/linearextrusion/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class LinearExtrusion extends Entity implements IMeshConvertible
```

Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension.
## Constructors

| Constructor | Description |
| --- | --- |
| [LinearExtrusion()](#LinearExtrusion--) | Constructor of instance com.aspose.threed.LinearExtrusion. |
| [LinearExtrusion(Profile shape, double height)](#LinearExtrusion-com.aspose.threed.Profile-double-) | Constructor of instance com.aspose.threed.LinearExtrusion. |
## Methods

| Method | Description |
| --- | --- |
| [getShape()](#getShape--) | The base shape to be extruded. |
| [setShape(Profile value)](#setShape-com.aspose.threed.Profile-) | The base shape to be extruded. |
| [getDirection()](#getDirection--) | The direction of extrusion, default value is (0, 0, 1) |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | The direction of extrusion, default value is (0, 0, 1) |
| [getHeight()](#getHeight--) | The height of the extruded geometry, default value is 1.0 |
| [setHeight(double value)](#setHeight-double-) | The height of the extruded geometry, default value is 1.0 |
| [getSlices()](#getSlices--) | The slices of the twisted extruded geometry, default value is 1. |
| [setSlices(int value)](#setSlices-int-) | The slices of the twisted extruded geometry, default value is 1. |
| [getCenter()](#getCenter--) | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. |
| [setCenter(boolean value)](#setCenter-boolean-) | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. |
| [getTwistOffset()](#getTwistOffset--) | The offset that used in twisting, default value is (0, 0, 0). |
| [setTwistOffset(Vector3 value)](#setTwistOffset-com.aspose.threed.Vector3-) | The offset that used in twisting, default value is (0, 0, 0). |
| [getTwist()](#getTwist--) | The number of degrees of through which the shape is extruded. |
| [setTwist(double value)](#setTwist-double-) | The number of degrees of through which the shape is extruded. |
| [toMesh()](#toMesh--) | Convert the extrusion to mesh. |
### LinearExtrusion() {#LinearExtrusion--}
```
public LinearExtrusion()
```


Constructor of instance com.aspose.threed.LinearExtrusion.

### LinearExtrusion(Profile shape, double height) {#LinearExtrusion-com.aspose.threed.Profile-double-}
```
public LinearExtrusion(Profile shape, double height)
```


Constructor of instance com.aspose.threed.LinearExtrusion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shape | [Profile](../../com.aspose.threed/profile) |  |
| height | double |  |

### getShape() {#getShape--}
```
public Profile getShape()
```


The base shape to be extruded.

**Returns:**
[Profile](../../com.aspose.threed/profile)
### setShape(Profile value) {#setShape-com.aspose.threed.Profile-}
```
public void setShape(Profile value)
```


The base shape to be extruded.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Profile](../../com.aspose.threed/profile) | New value |

### getDirection() {#getDirection--}
```
public Vector3 getDirection()
```


The direction of extrusion, default value is (0, 0, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public void setDirection(Vector3 value)
```


The direction of extrusion, default value is (0, 0, 1)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


The height of the extruded geometry, default value is 1.0

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


The height of the extruded geometry, default value is 1.0

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getSlices() {#getSlices--}
```
public int getSlices()
```


The slices of the twisted extruded geometry, default value is 1.

**Returns:**
int
### setSlices(int value) {#setSlices-int-}
```
public void setSlices(int value)
```


The slices of the twisted extruded geometry, default value is 1.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getCenter() {#getCenter--}
```
public boolean getCenter()
```


If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2.

**Returns:**
boolean
### setCenter(boolean value) {#setCenter-boolean-}
```
public void setCenter(boolean value)
```


If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getTwistOffset() {#getTwistOffset--}
```
public Vector3 getTwistOffset()
```


The offset that used in twisting, default value is (0, 0, 0).

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setTwistOffset(Vector3 value) {#setTwistOffset-com.aspose.threed.Vector3-}
```
public void setTwistOffset(Vector3 value)
```


The offset that used in twisting, default value is (0, 0, 0).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getTwist() {#getTwist--}
```
public double getTwist()
```


The number of degrees of through which the shape is extruded.

**Returns:**
double
### setTwist(double value) {#setTwist-double-}
```
public void setTwist(double value)
```


The number of degrees of through which the shape is extruded.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert the extrusion to mesh.

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
