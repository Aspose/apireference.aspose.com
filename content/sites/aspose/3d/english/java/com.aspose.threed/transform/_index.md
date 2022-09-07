---
title: Transform
second_title: Aspose.3D for Java API Reference
description: A transform contains information that allow access to objects translate/scale/rotation or transform matrix at minimum cost
 This is used by local transform.
type: docs
weight: 170
url: /java/com.aspose.threed/transform/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Transform extends A3DObject
```

A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost This is used by local transform.
## Methods

| Method | Description |
| --- | --- |
| [getGeometricTranslation()](#getGeometricTranslation--) | Gets the geometric translation. |
| [setGeometricTranslation(Vector3 value)](#setGeometricTranslation-com.aspose.threed.Vector3-) | Sets the geometric translation. |
| [getGeometricScaling()](#getGeometricScaling--) | Gets the geometric scaling. |
| [setGeometricScaling(Vector3 value)](#setGeometricScaling-com.aspose.threed.Vector3-) | Sets the geometric scaling. |
| [getGeometricRotation()](#getGeometricRotation--) | Gets the geometric Euler rotation(measured in degree). |
| [setGeometricRotation(Vector3 value)](#setGeometricRotation-com.aspose.threed.Vector3-) | Sets the geometric Euler rotation(measured in degree). |
| [setGeometricTranslation(double x, double y, double z)](#setGeometricTranslation-double-double-double-) | Sets the geometric translation. |
| [setGeometricScaling(double sx, double sy, double sz)](#setGeometricScaling-double-double-double-) | Sets the geometric scaling. |
| [setGeometricRotation(double rx, double ry, double rz)](#setGeometricRotation-double-double-double-) | Sets the geometric Euler rotation(measured in degree). |
| [getTranslation()](#getTranslation--) | Gets the translation |
| [setTranslation(Vector3 value)](#setTranslation-com.aspose.threed.Vector3-) | Sets the translation |
| [setTranslation(double tx, double ty, double tz)](#setTranslation-double-double-double-) | Sets the translation of current transform. |
| [setScale(double sx, double sy, double sz)](#setScale-double-double-double-) | Sets the scale of current transform. |
| [setEulerAngles(double rx, double ry, double rz)](#setEulerAngles-double-double-double-) | Sets the Euler angles in degrees of current transform. |
| [setRotation(double rw, double rx, double ry, double rz)](#setRotation-double-double-double-double-) | Sets the rotation(as quaternion components) of current transform. |
| [setPreRotation(double rx, double ry, double rz)](#setPreRotation-double-double-double-) | Sets the pre-rotation represented in degree |
| [setPostRotation(double rx, double ry, double rz)](#setPostRotation-double-double-double-) | Sets the post-rotation represented in degree |
| [getScale()](#getScale--) | Gets the scale |
| [setScale(Vector3 value)](#setScale-com.aspose.threed.Vector3-) | Sets the scale |
| [getPreRotation()](#getPreRotation--) | Gets the pre-rotation represented in degree |
| [setPreRotation(Vector3 value)](#setPreRotation-com.aspose.threed.Vector3-) | Sets the pre-rotation represented in degree |
| [getPostRotation()](#getPostRotation--) | Gets the post-rotation represented in degree |
| [setPostRotation(Vector3 value)](#setPostRotation-com.aspose.threed.Vector3-) | Sets the post-rotation represented in degree |
| [getEulerAngles()](#getEulerAngles--) | Gets the rotation represented in Euler angles, measured in degree |
| [setEulerAngles(Vector3 value)](#setEulerAngles-com.aspose.threed.Vector3-) | Sets the rotation represented in Euler angles, measured in degree |
| [getRotation()](#getRotation--) | Gets the rotation represented in quaternion. |
| [setRotation(Quaternion value)](#setRotation-com.aspose.threed.Quaternion-) | Sets the rotation represented in quaternion. |
| [getTransformMatrix()](#getTransformMatrix--) | Gets the transform matrix. |
| [setTransformMatrix(Matrix4 value)](#setTransformMatrix-com.aspose.threed.Matrix4-) | Sets the transform matrix. |
### getGeometricTranslation() {#getGeometricTranslation--}
```
public Vector3 getGeometricTranslation()
```


Gets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setGeometricTranslation(Vector3 value) {#setGeometricTranslation-com.aspose.threed.Vector3-}
```
public void setGeometricTranslation(Vector3 value)
```


Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getGeometricScaling() {#getGeometricScaling--}
```
public Vector3 getGeometricScaling()
```


Gets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setGeometricScaling(Vector3 value) {#setGeometricScaling-com.aspose.threed.Vector3-}
```
public void setGeometricScaling(Vector3 value)
```


Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getGeometricRotation() {#getGeometricRotation--}
```
public Vector3 getGeometricRotation()
```


Gets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setGeometricRotation(Vector3 value) {#setGeometricRotation-com.aspose.threed.Vector3-}
```
public void setGeometricRotation(Vector3 value)
```


Sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setGeometricTranslation(double x, double y, double z) {#setGeometricTranslation-double-double-double-}
```
public Transform setGeometricTranslation(double x, double y, double z)
```


Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setGeometricScaling(double sx, double sy, double sz) {#setGeometricScaling-double-double-double-}
```
public Transform setGeometricScaling(double sx, double sy, double sz)
```


Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | double |  |
| sy | double |  |
| sz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setGeometricRotation(double rx, double ry, double rz) {#setGeometricRotation-double-double-double-}
```
public Transform setGeometricRotation(double rx, double ry, double rz)
```


Sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rx | double |  |
| ry | double |  |
| rz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### getTranslation() {#getTranslation--}
```
public Vector3 getTranslation()
```


Gets the translation

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setTranslation(Vector3 value) {#setTranslation-com.aspose.threed.Vector3-}
```
public void setTranslation(Vector3 value)
```


Sets the translation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setTranslation(double tx, double ty, double tz) {#setTranslation-double-double-double-}
```
public Transform setTranslation(double tx, double ty, double tz)
```


Sets the translation of current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| tx | double |  |
| ty | double |  |
| tz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setScale(double sx, double sy, double sz) {#setScale-double-double-double-}
```
public Transform setScale(double sx, double sy, double sz)
```


Sets the scale of current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | double |  |
| sy | double |  |
| sz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setEulerAngles(double rx, double ry, double rz) {#setEulerAngles-double-double-double-}
```
public Transform setEulerAngles(double rx, double ry, double rz)
```


Sets the Euler angles in degrees of current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rx | double |  |
| ry | double |  |
| rz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setRotation(double rw, double rx, double ry, double rz) {#setRotation-double-double-double-double-}
```
public Transform setRotation(double rw, double rx, double ry, double rz)
```


Sets the rotation(as quaternion components) of current transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rw | double |  |
| rx | double |  |
| ry | double |  |
| rz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setPreRotation(double rx, double ry, double rz) {#setPreRotation-double-double-double-}
```
public Transform setPreRotation(double rx, double ry, double rz)
```


Sets the pre-rotation represented in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rx | double |  |
| ry | double |  |
| rz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### setPostRotation(double rx, double ry, double rz) {#setPostRotation-double-double-double-}
```
public Transform setPostRotation(double rx, double ry, double rz)
```


Sets the post-rotation represented in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rx | double |  |
| ry | double |  |
| rz | double |  |

**Returns:**
[Transform](../../com.aspose.threed/transform)
### getScale() {#getScale--}
```
public Vector3 getScale()
```


Gets the scale

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setScale(Vector3 value) {#setScale-com.aspose.threed.Vector3-}
```
public void setScale(Vector3 value)
```


Sets the scale

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getPreRotation() {#getPreRotation--}
```
public Vector3 getPreRotation()
```


Gets the pre-rotation represented in degree

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setPreRotation(Vector3 value) {#setPreRotation-com.aspose.threed.Vector3-}
```
public void setPreRotation(Vector3 value)
```


Sets the pre-rotation represented in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getPostRotation() {#getPostRotation--}
```
public Vector3 getPostRotation()
```


Gets the post-rotation represented in degree

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setPostRotation(Vector3 value) {#setPostRotation-com.aspose.threed.Vector3-}
```
public void setPostRotation(Vector3 value)
```


Sets the post-rotation represented in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getEulerAngles() {#getEulerAngles--}
```
public Vector3 getEulerAngles()
```


Gets the rotation represented in Euler angles, measured in degree

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setEulerAngles(Vector3 value) {#setEulerAngles-com.aspose.threed.Vector3-}
```
public void setEulerAngles(Vector3 value)
```


Sets the rotation represented in Euler angles, measured in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getRotation() {#getRotation--}
```
public Quaternion getRotation()
```


Gets the rotation represented in quaternion.

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### setRotation(Quaternion value) {#setRotation-com.aspose.threed.Quaternion-}
```
public void setRotation(Quaternion value)
```


Sets the rotation represented in quaternion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Quaternion](../../com.aspose.threed/quaternion) | New value |

### getTransformMatrix() {#getTransformMatrix--}
```
public Matrix4 getTransformMatrix()
```


Gets the transform matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setTransformMatrix(Matrix4 value) {#setTransformMatrix-com.aspose.threed.Matrix4-}
```
public void setTransformMatrix(Matrix4 value)
```


Sets the transform matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

