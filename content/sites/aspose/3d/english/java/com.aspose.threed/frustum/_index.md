---
title: Frustum
second_title: Aspose.3D for Java API Reference
description: The base class of com.aspose.threed.Camera and com.aspose.threed.Light
type: docs
weight: 64
url: /java/com.aspose.threed/frustum/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IOrientable](../../com.aspose.threed/iorientable)
```
public abstract class Frustum extends Entity implements IOrientable
```

The base class of com.aspose.threed.Camera and com.aspose.threed.Light
## Methods

| Method | Description |
| --- | --- |
| [getRotationMode()](#getRotationMode--) | Gets the frustum's orientation mode This property only works when the com.aspose.threed.Frustum\#getTarget is null. |
| [setRotationMode(RotationMode value)](#setRotationMode-com.aspose.threed.RotationMode-) | Sets the frustum's orientation mode This property only works when the com.aspose.threed.Frustum\#getTarget is null. |
| [getNearPlane()](#getNearPlane--) | Gets the frustum's near plane distance. |
| [setNearPlane(double value)](#setNearPlane-double-) | Sets the frustum's near plane distance. |
| [getFarPlane()](#getFarPlane--) | Gets the frustum's far plane distance. |
| [setFarPlane(double value)](#setFarPlane-double-) | Sets the frustum's far plane distance. |
| [getAspect()](#getAspect--) | Gets the aspect ratio of the frustum |
| [setAspect(double value)](#setAspect-double-) | Sets the aspect ratio of the frustum |
| [getOrthoHeight()](#getOrthoHeight--) | Gets the height when frustum in orthographic projection. |
| [setOrthoHeight(double value)](#setOrthoHeight-double-) | Sets the height when frustum in orthographic projection. |
| [getUp()](#getUp--) | Gets the up direction of the camera |
| [setUp(Vector3 value)](#setUp-com.aspose.threed.Vector3-) | Sets the up direction of the camera |
| [getLookAt()](#getLookAt--) | Gets the the interested position that the camera is looking at. |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Sets the the interested position that the camera is looking at. |
| [getDirection()](#getDirection--) | Gets the direction that the camera is looking at. |
| [setDirection(Vector3 value)](#setDirection-com.aspose.threed.Vector3-) | Sets the direction that the camera is looking at. |
| [getTarget()](#getTarget--) | Gets the target that the camera is looking at. |
| [setTarget(Node value)](#setTarget-com.aspose.threed.Node-) | Sets the target that the camera is looking at. |
### getRotationMode() {#getRotationMode--}
```
public RotationMode getRotationMode()
```


Gets the frustum's orientation mode This property only works when the com.aspose.threed.Frustum\#getTarget is null. If the value is com.aspose.threed.RotationMode\#FIXED\_TARGET, the direction is always calculated by the property com.aspose.threed.Frustum\#getLookAt Otherwise the com.aspose.threed.Frustum\#getLookAt is always calculated by the com.aspose.threed.Frustum\#getDirection

**Returns:**
[RotationMode](../../com.aspose.threed/rotationmode)
### setRotationMode(RotationMode value) {#setRotationMode-com.aspose.threed.RotationMode-}
```
public void setRotationMode(RotationMode value)
```


Sets the frustum's orientation mode This property only works when the com.aspose.threed.Frustum\#getTarget is null. If the value is com.aspose.threed.RotationMode\#FIXED\_TARGET, the direction is always calculated by the property com.aspose.threed.Frustum\#getLookAt Otherwise the com.aspose.threed.Frustum\#getLookAt is always calculated by the com.aspose.threed.Frustum\#getDirection

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RotationMode](../../com.aspose.threed/rotationmode) | New value |

### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Gets the frustum's near plane distance.

**Returns:**
double
### setNearPlane(double value) {#setNearPlane-double-}
```
public void setNearPlane(double value)
```


Sets the frustum's near plane distance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Gets the frustum's far plane distance.

**Returns:**
double
### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Sets the frustum's far plane distance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAspect() {#getAspect--}
```
public double getAspect()
```


Gets the aspect ratio of the frustum

**Returns:**
double
### setAspect(double value) {#setAspect-double-}
```
public void setAspect(double value)
```


Sets the aspect ratio of the frustum

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getOrthoHeight() {#getOrthoHeight--}
```
public double getOrthoHeight()
```


Gets the height when frustum in orthographic projection.

**Returns:**
double
### setOrthoHeight(double value) {#setOrthoHeight-double-}
```
public void setOrthoHeight(double value)
```


Sets the height when frustum in orthographic projection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getUp() {#getUp--}
```
public Vector3 getUp()
```


Gets the up direction of the camera

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setUp(Vector3 value) {#setUp-com.aspose.threed.Vector3-}
```
public void setUp(Vector3 value)
```


Sets the up direction of the camera

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Gets the the interested position that the camera is looking at.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setLookAt(Vector3 value) {#setLookAt-com.aspose.threed.Vector3-}
```
public void setLookAt(Vector3 value)
```


Sets the the interested position that the camera is looking at.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getDirection() {#getDirection--}
```
public Vector3 getDirection()
```


Gets the direction that the camera is looking at. Changes on this property will also affects the com.aspose.threed.Frustum\#getLookAt and com.aspose.threed.Frustum\#getTarget.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setDirection(Vector3 value) {#setDirection-com.aspose.threed.Vector3-}
```
public void setDirection(Vector3 value)
```


Sets the direction that the camera is looking at. Changes on this property will also affects the com.aspose.threed.Frustum\#getLookAt and com.aspose.threed.Frustum\#getTarget.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getTarget() {#getTarget--}
```
public Node getTarget()
```


Gets the target that the camera is looking at. If the user supports this property, it should be prior to com.aspose.threed.Frustum\#getLookAt property.

**Returns:**
[Node](../../com.aspose.threed/node)
### setTarget(Node value) {#setTarget-com.aspose.threed.Node-}
```
public void setTarget(Node value)
```


Sets the target that the camera is looking at. If the user supports this property, it should be prior to com.aspose.threed.Frustum\#getLookAt property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

