---
title: Html5SaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for HTML5
type: docs
weight: 73
url: /java/com.aspose.threed/html5saveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class Html5SaveOptions extends SaveOptions
```

Save options for HTML5
## Constructors

| Constructor | Description |
| --- | --- |
| [Html5SaveOptions()](#Html5SaveOptions--) | Constructor of com.aspose.threed.Html5SaveOptions with all default settings. |
## Methods

| Method | Description |
| --- | --- |
| [getShowGrid()](#getShowGrid--) | Display a grid in the scene. |
| [setShowGrid(boolean value)](#setShowGrid-boolean-) | Display a grid in the scene. |
| [getShowRulers()](#getShowRulers--) | Display rulers of x/y/z axes in the scene to measure the model. |
| [setShowRulers(boolean value)](#setShowRulers-boolean-) | Display rulers of x/y/z axes in the scene to measure the model. |
| [getShowUI()](#getShowUI--) | Display a simple UI in the scene. |
| [setShowUI(boolean value)](#setShowUI-boolean-) | Display a simple UI in the scene. |
| [getOrientationBox()](#getOrientationBox--) | Display a orientation box. |
| [setOrientationBox(boolean value)](#setOrientationBox-boolean-) | Display a orientation box. |
| [getUpVector()](#getUpVector--) | Gets the up vector, value can be "x"/"y"/"z", default value is "y" |
| [setUpVector(String value)](#setUpVector-java.lang.String-) | Sets the up vector, value can be "x"/"y"/"z", default value is "y" |
| [getFarPlane()](#getFarPlane--) | Gets the far plane of the camera, default value is 1000. |
| [setFarPlane(double value)](#setFarPlane-double-) | Sets the far plane of the camera, default value is 1000. |
| [getNearPlane()](#getNearPlane--) | Gets the near plane of the camera, default value is 1 |
| [setNearPlane(double value)](#setNearPlane-double-) | Sets the near plane of the camera, default value is 1 |
| [getLookAt()](#getLookAt--) | Gets the default look at position, default value is (0, 0, 0) |
| [setLookAt(Vector3 value)](#setLookAt-com.aspose.threed.Vector3-) | Sets the default look at position, default value is (0, 0, 0) |
| [getCameraPosition()](#getCameraPosition--) | Gets the initial position of the camera, default value is (10, 10, 10) |
| [setCameraPosition(Vector3 value)](#setCameraPosition-com.aspose.threed.Vector3-) | Sets the initial position of the camera, default value is (10, 10, 10) |
| [getFieldOfView()](#getFieldOfView--) | Gets the field of the view, default value is 45, measured in degree. |
| [setFieldOfView(double value)](#setFieldOfView-double-) | Sets the field of the view, default value is 45, measured in degree. |
### Html5SaveOptions() {#Html5SaveOptions--}
```
public Html5SaveOptions()
```


Constructor of com.aspose.threed.Html5SaveOptions with all default settings.

### getShowGrid() {#getShowGrid--}
```
public boolean getShowGrid()
```


Display a grid in the scene. Default value is true.

**Returns:**
boolean
### setShowGrid(boolean value) {#setShowGrid-boolean-}
```
public void setShowGrid(boolean value)
```


Display a grid in the scene. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getShowRulers() {#getShowRulers--}
```
public boolean getShowRulers()
```


Display rulers of x/y/z axes in the scene to measure the model. Default value is false.

**Returns:**
boolean
### setShowRulers(boolean value) {#setShowRulers-boolean-}
```
public void setShowRulers(boolean value)
```


Display rulers of x/y/z axes in the scene to measure the model. Default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getShowUI() {#getShowUI--}
```
public boolean getShowUI()
```


Display a simple UI in the scene. Default value is true.

**Returns:**
boolean
### setShowUI(boolean value) {#setShowUI-boolean-}
```
public void setShowUI(boolean value)
```


Display a simple UI in the scene. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getOrientationBox() {#getOrientationBox--}
```
public boolean getOrientationBox()
```


Display a orientation box. Default value is true.

**Returns:**
boolean
### setOrientationBox(boolean value) {#setOrientationBox-boolean-}
```
public void setOrientationBox(boolean value)
```


Display a orientation box. Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getUpVector() {#getUpVector--}
```
public String getUpVector()
```


Gets the up vector, value can be "x"/"y"/"z", default value is "y"

**Returns:**
java.lang.String
### setUpVector(String value) {#setUpVector-java.lang.String-}
```
public void setUpVector(String value)
```


Sets the up vector, value can be "x"/"y"/"z", default value is "y"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getFarPlane() {#getFarPlane--}
```
public double getFarPlane()
```


Gets the far plane of the camera, default value is 1000.

**Returns:**
double
### setFarPlane(double value) {#setFarPlane-double-}
```
public void setFarPlane(double value)
```


Sets the far plane of the camera, default value is 1000.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getNearPlane() {#getNearPlane--}
```
public double getNearPlane()
```


Gets the near plane of the camera, default value is 1

**Returns:**
double
### setNearPlane(double value) {#setNearPlane-double-}
```
public void setNearPlane(double value)
```


Sets the near plane of the camera, default value is 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getLookAt() {#getLookAt--}
```
public Vector3 getLookAt()
```


Gets the default look at position, default value is (0, 0, 0)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setLookAt(Vector3 value) {#setLookAt-com.aspose.threed.Vector3-}
```
public void setLookAt(Vector3 value)
```


Sets the default look at position, default value is (0, 0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getCameraPosition() {#getCameraPosition--}
```
public Vector3 getCameraPosition()
```


Gets the initial position of the camera, default value is (10, 10, 10)

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setCameraPosition(Vector3 value) {#setCameraPosition-com.aspose.threed.Vector3-}
```
public void setCameraPosition(Vector3 value)
```


Sets the initial position of the camera, default value is (10, 10, 10)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getFieldOfView() {#getFieldOfView--}
```
public double getFieldOfView()
```


Gets the field of the view, default value is 45, measured in degree.

**Returns:**
double
### setFieldOfView(double value) {#setFieldOfView-double-}
```
public void setFieldOfView(double value)
```


Sets the field of the view, default value is 45, measured in degree.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

