---
title: RevolvedAreaSolid
second_title: Aspose.3D for Java API Reference
description: This class represents a solid model by revolving a cross section provided by a profile about an axis.
type: docs
weight: 140
url: /java/com.aspose.threed/revolvedareasolid/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class RevolvedAreaSolid extends Entity implements IMeshConvertible
```

This class represents a solid model by revolving a cross section provided by a profile about an axis.
## Constructors

| Constructor | Description |
| --- | --- |
| [RevolvedAreaSolid()](#RevolvedAreaSolid--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getAngleStart()](#getAngleStart--) | Gets the starting angle of the revolving procedure, measured in radian, default value is 0. |
| [setAngleStart(double value)](#setAngleStart-double-) | Sets the starting angle of the revolving procedure, measured in radian, default value is 0. |
| [getAngleEnd()](#getAngleEnd--) | Gets the ending angle of the revolving procedure, measured in radian, default value is pi. |
| [setAngleEnd(double value)](#setAngleEnd-double-) | Sets the ending angle of the revolving procedure, measured in radian, default value is pi. |
| [getAxis()](#getAxis--) | Gets the axis direction, default value is (0, 1, 0). |
| [setAxis(Vector3 value)](#setAxis-com.aspose.threed.Vector3-) | Sets the axis direction, default value is (0, 1, 0). |
| [getOrigin()](#getOrigin--) | Gets the origin point of the revolving, default value is (0, 0, 0). |
| [setOrigin(Vector3 value)](#setOrigin-com.aspose.threed.Vector3-) | Sets the origin point of the revolving, default value is (0, 0, 0). |
| [getShape()](#getShape--) | Gets the base profile used to revolve. |
| [setShape(Profile value)](#setShape-com.aspose.threed.Profile-) | Sets the base profile used to revolve. |
| [toMesh()](#toMesh--) | Convert the com.aspose.threed.RevolvedAreaSolid into a mesh. |
### RevolvedAreaSolid() {#RevolvedAreaSolid--}
```
public RevolvedAreaSolid()
```


### getAngleStart() {#getAngleStart--}
```
public double getAngleStart()
```


Gets the starting angle of the revolving procedure, measured in radian, default value is 0.

**Returns:**
double
### setAngleStart(double value) {#setAngleStart-double-}
```
public void setAngleStart(double value)
```


Sets the starting angle of the revolving procedure, measured in radian, default value is 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAngleEnd() {#getAngleEnd--}
```
public double getAngleEnd()
```


Gets the ending angle of the revolving procedure, measured in radian, default value is pi.

**Returns:**
double
### setAngleEnd(double value) {#setAngleEnd-double-}
```
public void setAngleEnd(double value)
```


Sets the ending angle of the revolving procedure, measured in radian, default value is pi.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAxis() {#getAxis--}
```
public Vector3 getAxis()
```


Gets the axis direction, default value is (0, 1, 0).

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setAxis(Vector3 value) {#setAxis-com.aspose.threed.Vector3-}
```
public void setAxis(Vector3 value)
```


Sets the axis direction, default value is (0, 1, 0).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getOrigin() {#getOrigin--}
```
public Vector3 getOrigin()
```


Gets the origin point of the revolving, default value is (0, 0, 0).

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setOrigin(Vector3 value) {#setOrigin-com.aspose.threed.Vector3-}
```
public void setOrigin(Vector3 value)
```


Sets the origin point of the revolving, default value is (0, 0, 0).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getShape() {#getShape--}
```
public Profile getShape()
```


Gets the base profile used to revolve.

**Returns:**
[Profile](../../com.aspose.threed/profile)
### setShape(Profile value) {#setShape-com.aspose.threed.Profile-}
```
public void setShape(Profile value)
```


Sets the base profile used to revolve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Profile](../../com.aspose.threed/profile) | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert the com.aspose.threed.RevolvedAreaSolid into a mesh.

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
