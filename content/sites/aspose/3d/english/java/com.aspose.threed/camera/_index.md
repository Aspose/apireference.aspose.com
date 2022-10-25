---
title: Camera
second_title: Aspose.3D for Java API Reference
description: The camera describes the eye point of the viewer looking at the scene.
type: docs
weight: 25
url: /java/com.aspose.threed/camera/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Frustum](../../com.aspose.threed/frustum)

**All Implemented Interfaces:**
[com.aspose.threed.IOrientable](../../com.aspose.threed/iorientable)
```
public class Camera extends Frustum implements IOrientable
```

The camera describes the eye point of the viewer looking at the scene.
## Constructors

| Constructor | Description |
| --- | --- |
| [Camera()](#Camera--) | Initializes a new instance of the com.aspose.threed.Camera class. |
| [Camera(ProjectionType projectionType)](#Camera-com.aspose.threed.ProjectionType-) | Initializes a new instance of the com.aspose.threed.Camera class. |
| [Camera(String name)](#Camera-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Camera class. |
| [Camera(String name, ProjectionType projectionType)](#Camera-java.lang.String-com.aspose.threed.ProjectionType-) | Initializes a new instance of the com.aspose.threed.Camera class. |
## Methods

| Method | Description |
| --- | --- |
| [getApertureMode()](#getApertureMode--) | Gets the camera's aperture mode |
| [setApertureMode(ApertureMode value)](#setApertureMode-com.aspose.threed.ApertureMode-) | Sets the camera's aperture mode |
| [getFieldOfView()](#getFieldOfView--) | Gets the camera's field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZONTAL or com.aspose.threed.ApertureMode\#VERTICAL |
| [setFieldOfView(double value)](#setFieldOfView-double-) | Sets the camera's field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZONTAL or com.aspose.threed.ApertureMode\#VERTICAL |
| [getFieldOfViewX()](#getFieldOfViewX--) | Gets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT |
| [setFieldOfViewX(double value)](#setFieldOfViewX-double-) | Sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT |
| [getFieldOfViewY()](#getFieldOfViewY--) | Gets the camera's vertical field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT |
| [setFieldOfViewY(double value)](#setFieldOfViewY-double-) | Sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT |
| [getWidth()](#getWidth--) | Gets the view plane's width measured in inches |
| [setWidth(double value)](#setWidth-double-) | Sets the view plane's width measured in inches |
| [getHeight()](#getHeight--) | Gets the view plane's height measured in inches |
| [setHeight(double value)](#setHeight-double-) | Sets the view plane's height measured in inches |
| [getAspectRatio()](#getAspectRatio--) | Gets the view plane aspect ratio. |
| [setAspectRatio(double value)](#setAspectRatio-double-) | Sets the view plane aspect ratio. |
| [getMagnification()](#getMagnification--) | Gets the magnification used in orthographic camera |
| [setMagnification(Vector2 value)](#setMagnification-com.aspose.threed.Vector2-) | Sets the magnification used in orthographic camera |
| [getProjectionType()](#getProjectionType--) | Gets the camera's projection type. |
| [setProjectionType(ProjectionType value)](#setProjectionType-com.aspose.threed.ProjectionType-) | Sets the camera's projection type. |
| [moveForward(double distance)](#moveForward-double-) | Move camera forward towards its direction or target. |
### Camera() {#Camera--}
```
public Camera()
```


Initializes a new instance of the com.aspose.threed.Camera class.

### Camera(ProjectionType projectionType) {#Camera-com.aspose.threed.ProjectionType-}
```
public Camera(ProjectionType projectionType)
```


Initializes a new instance of the com.aspose.threed.Camera class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projection type. |

### Camera(String name) {#Camera-java.lang.String-}
```
public Camera(String name)
```


Initializes a new instance of the com.aspose.threed.Camera class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### Camera(String name, ProjectionType projectionType) {#Camera-java.lang.String-com.aspose.threed.ProjectionType-}
```
public Camera(String name, ProjectionType projectionType)
```


Initializes a new instance of the com.aspose.threed.Camera class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| projectionType | [ProjectionType](../../com.aspose.threed/projectiontype) | Projection type. |

### getApertureMode() {#getApertureMode--}
```
public ApertureMode getApertureMode()
```


Gets the camera's aperture mode

**Returns:**
[ApertureMode](../../com.aspose.threed/aperturemode)
### setApertureMode(ApertureMode value) {#setApertureMode-com.aspose.threed.ApertureMode-}
```
public void setApertureMode(ApertureMode value)
```


Sets the camera's aperture mode

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ApertureMode](../../com.aspose.threed/aperturemode) | New value |

### getFieldOfView() {#getFieldOfView--}
```
public double getFieldOfView()
```


Gets the camera's field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZONTAL or com.aspose.threed.ApertureMode\#VERTICAL

**Returns:**
double
### setFieldOfView(double value) {#setFieldOfView-double-}
```
public void setFieldOfView(double value)
```


Sets the camera's field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZONTAL or com.aspose.threed.ApertureMode\#VERTICAL

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getFieldOfViewX() {#getFieldOfViewX--}
```
public double getFieldOfViewX()
```


Gets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT

**Returns:**
double
### setFieldOfViewX(double value) {#setFieldOfViewX-double-}
```
public void setFieldOfViewX(double value)
```


Sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getFieldOfViewY() {#getFieldOfViewY--}
```
public double getFieldOfViewY()
```


Gets the camera's vertical field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT

**Returns:**
double
### setFieldOfViewY(double value) {#setFieldOfViewY-double-}
```
public void setFieldOfViewY(double value)
```


Sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is com.aspose.threed.ApertureMode\#HORIZ\_AND\_VERT

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getWidth() {#getWidth--}
```
public double getWidth()
```


Gets the view plane's width measured in inches

**Returns:**
double
### setWidth(double value) {#setWidth-double-}
```
public void setWidth(double value)
```


Sets the view plane's width measured in inches

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


Gets the view plane's height measured in inches

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Sets the view plane's height measured in inches

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getAspectRatio() {#getAspectRatio--}
```
public double getAspectRatio()
```


Gets the view plane aspect ratio.

**Returns:**
double
### setAspectRatio(double value) {#setAspectRatio-double-}
```
public void setAspectRatio(double value)
```


Sets the view plane aspect ratio.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getMagnification() {#getMagnification--}
```
public Vector2 getMagnification()
```


Gets the magnification used in orthographic camera

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setMagnification(Vector2 value) {#setMagnification-com.aspose.threed.Vector2-}
```
public void setMagnification(Vector2 value)
```


Sets the magnification used in orthographic camera

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getProjectionType() {#getProjectionType--}
```
public ProjectionType getProjectionType()
```


Gets the camera's projection type. By default the perspective projection is used.

**Returns:**
[ProjectionType](../../com.aspose.threed/projectiontype)
### setProjectionType(ProjectionType value) {#setProjectionType-com.aspose.threed.ProjectionType-}
```
public void setProjectionType(ProjectionType value)
```


Sets the camera's projection type. By default the perspective projection is used.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ProjectionType](../../com.aspose.threed/projectiontype) | New value |

### moveForward(double distance) {#moveForward-double-}
```
public void moveForward(double distance)
```


Move camera forward towards its direction or target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| distance | double | How long to move forward |

