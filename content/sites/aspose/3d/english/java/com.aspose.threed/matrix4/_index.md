---
title: Matrix4
second_title: Aspose.3D for Java API Reference
description: 4x4 matrix implementation.
type: docs
weight: 91
url: /java/com.aspose.threed/matrix4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class Matrix4 implements Struct<Matrix4>, Serializable
```

4x4 matrix implementation.
## Constructors

| Constructor | Description |
| --- | --- |
| [Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3)](#Matrix4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Constructs matrix from 4 rows. |
| [Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33)](#Matrix4-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-) | Initializes a new instance of the com.aspose.threed.Matrix4 struct. |
| [Matrix4(FMatrix4 m)](#Matrix4-com.aspose.threed.FMatrix4-) | Construct com.aspose.threed.Matrix4 from an com.aspose.threed.FMatrix4 instance |
| [Matrix4(double[] m)](#Matrix4-double---) | Initializes a new instance of the com.aspose.threed.Matrix4 struct. |
| [Matrix4()](#Matrix4--) |  |
## Fields

| Field | Description |
| --- | --- |
| [m00](#m00) | The m00. |
| [m01](#m01) | The m01. |
| [m02](#m02) | The m02. |
| [m03](#m03) | The m03. |
| [m10](#m10) | The m10. |
| [m11](#m11) | The m11. |
| [m12](#m12) | The m12. |
| [m13](#m13) | The m13. |
| [m20](#m20) | The m20. |
| [m21](#m21) | The m21. |
| [m22](#m22) | The m22. |
| [m23](#m23) | The m23. |
| [m30](#m30) | The m30. |
| [m31](#m31) | The m31. |
| [m32](#m32) | The m32. |
| [m33](#m33) | The m33. |
## Methods

| Method | Description |
| --- | --- |
| [getIdentity()](#getIdentity--) | Gets the identity matrix. |
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Concatenates the two matrices |
| [transpose()](#transpose--) | Transposes this instance. |
| [normalize()](#normalize--) | Normalizes this instance. |
| [inverse()](#inverse--) | Inverses this instance. |
| [getDeterminant()](#getDeterminant--) | Gets the determinant of the matrix. |
| [mul(Matrix4 lhs, Matrix4 rhs)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Matrix4-) | Multiply the two matrices |
| [mul(Matrix4 lhs, Vector3 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector3-) | Multiply the matrix and vector3 |
| [setTRS(Vector3 translation, Vector3 rotation, Vector3 scale)](#setTRS-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initializes the matrix with translation/rotation/scale |
| [mul(Matrix4 lhs, Vector4 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector4-) | Multiply the matrix and vector4 |
| [mul(Matrix4 lhs, double v)](#mul-com.aspose.threed.Matrix4-double-) | Multiply the matrix and double value |
| [toArray()](#toArray--) | Converts matrix to array. |
| [decompose(Vector3 translation, Vector3 scaling, Quaternion rotation)](#decompose-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-) | Decompose the transformation matrix. |
| [toString()](#toString--) | Returns a java.lang.String that represents the current com.aspose.threed.Matrix4. |
| [translate(Vector3 t)](#translate-com.aspose.threed.Vector3-) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [translate(double tx, double ty, double tz)](#translate-double-double-double-) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [scale(Vector3 s)](#scale-com.aspose.threed.Vector3-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale(double s)](#scale-double-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale(double sx, double sy, double sz)](#scale-double-double-double-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [rotateFromEuler(Vector3 eul)](#rotateFromEuler-com.aspose.threed.Vector3-) | Create a rotation matrix from Euler angle |
| [rotateFromEuler(double rx, double ry, double rz)](#rotateFromEuler-double-double-double-) | Create a rotation matrix from Euler angle |
| [rotate(double angle, Vector3 axis)](#rotate-double-com.aspose.threed.Vector3-) | Create a rotation matrix by rotation angle and axis |
| [rotate(Quaternion q)](#rotate-com.aspose.threed.Quaternion-) | Create a rotation matrix from a quaternion |
| [clone()](#clone--) |  |
| [copyFrom(Matrix4 src)](#copyFrom-com.aspose.threed.Matrix4-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3) {#Matrix4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3)
```


Constructs matrix from 4 rows.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r0 | [Vector4](../../com.aspose.threed/vector4) | R0. |
| r1 | [Vector4](../../com.aspose.threed/vector4) | R1. |
| r2 | [Vector4](../../com.aspose.threed/vector4) | R2. |
| r3 | [Vector4](../../com.aspose.threed/vector4) | R3. |

### Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {#Matrix4-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-}
```
public Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33)
```


Initializes a new instance of the com.aspose.threed.Matrix4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m00 | double | M00. |
| m01 | double | M01. |
| m02 | double | M02. |
| m03 | double | M03. |
| m10 | double | M10. |
| m11 | double | M11. |
| m12 | double | M12. |
| m13 | double | M13. |
| m20 | double | M20. |
| m21 | double | M21. |
| m22 | double | M22. |
| m23 | double | M23. |
| m30 | double | M30. |
| m31 | double | M31. |
| m32 | double | M32. |
| m33 | double | M33. |

### Matrix4(FMatrix4 m) {#Matrix4-com.aspose.threed.FMatrix4-}
```
public Matrix4(FMatrix4 m)
```


Construct com.aspose.threed.Matrix4 from an com.aspose.threed.FMatrix4 instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

### Matrix4(double[] m) {#Matrix4-double---}
```
public Matrix4(double[] m)
```


Initializes a new instance of the com.aspose.threed.Matrix4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | double[] | M. |

### Matrix4() {#Matrix4--}
```
public Matrix4()
```


### m00 {#m00}
```
public double m00
```


The m00.

### m01 {#m01}
```
public double m01
```


The m01.

### m02 {#m02}
```
public double m02
```


The m02.

### m03 {#m03}
```
public double m03
```


The m03.

### m10 {#m10}
```
public double m10
```


The m10.

### m11 {#m11}
```
public double m11
```


The m11.

### m12 {#m12}
```
public double m12
```


The m12.

### m13 {#m13}
```
public double m13
```


The m13.

### m20 {#m20}
```
public double m20
```


The m20.

### m21 {#m21}
```
public double m21
```


The m21.

### m22 {#m22}
```
public double m22
```


The m22.

### m23 {#m23}
```
public double m23
```


The m23.

### m30 {#m30}
```
public double m30
```


The m30.

### m31 {#m31}
```
public double m31
```


The m31.

### m32 {#m32}
```
public double m32
```


The m32.

### m33 {#m33}
```
public double m33
```


The m33.

### getIdentity() {#getIdentity--}
```
public static Matrix4 getIdentity()
```


Gets the identity matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### concatenate(Matrix4 m2) {#concatenate-com.aspose.threed.Matrix4-}
```
public Matrix4 concatenate(Matrix4 m2)
```


Concatenates the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m2 | [Matrix4](../../com.aspose.threed/matrix4) | M2. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - New matrix4
### transpose() {#transpose--}
```
public Matrix4 transpose()
```


Transposes this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The transposed matrix.
### normalize() {#normalize--}
```
public Matrix4 normalize()
```


Normalizes this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Normalize matrix4
### inverse() {#inverse--}
```
public Matrix4 inverse()
```


Inverses this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Inverse matrix4
### getDeterminant() {#getDeterminant--}
```
public double getDeterminant()
```


Gets the determinant of the matrix.

**Returns:**
double
### mul(Matrix4 lhs, Matrix4 rhs) {#mul-com.aspose.threed.Matrix4-com.aspose.threed.Matrix4-}
```
public static Matrix4 mul(Matrix4 lhs, Matrix4 rhs)
```


Multiply the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| rhs | [Matrix4](../../com.aspose.threed/matrix4) | Rhs. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Result matrix
### mul(Matrix4 lhs, Vector3 v) {#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Matrix4 lhs, Vector3 v)
```


Multiply the matrix and vector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | [Vector3](../../com.aspose.threed/vector3) | V. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result matrix
### setTRS(Vector3 translation, Vector3 rotation, Vector3 scale) {#setTRS-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public void setTRS(Vector3 translation, Vector3 rotation, Vector3 scale)
```


Initializes the matrix with translation/rotation/scale

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| translation | [Vector3](../../com.aspose.threed/vector3) | Translation. |
| rotation | [Vector3](../../com.aspose.threed/vector3) | Euler angles for rotation, fields are in degree. |
| scale | [Vector3](../../com.aspose.threed/vector3) | Scale. |

### mul(Matrix4 lhs, Vector4 v) {#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Matrix4 lhs, Vector4 v)
```


Multiply the matrix and vector4

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | [Vector4](../../com.aspose.threed/vector4) | V. |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result matrix
### mul(Matrix4 lhs, double v) {#mul-com.aspose.threed.Matrix4-double-}
```
public static Matrix4 mul(Matrix4 lhs, double v)
```


Multiply the matrix and double value

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | double | V. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Result matrix
### toArray() {#toArray--}
```
public double[] toArray()
```


Converts matrix to array.

**Returns:**
double[] - The array.
### decompose(Vector3 translation, Vector3 scaling, Quaternion rotation) {#decompose-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-}
```
public boolean decompose(Vector3 translation, Vector3 scaling, Quaternion rotation)
```


Decompose the transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| translation | [Vector3](../../com.aspose.threed/vector3) | The translation. |
| scaling | [Vector3](../../com.aspose.threed/vector3) | The scaling. |
| rotation | [Quaternion](../../com.aspose.threed/quaternion) | The rotation. |

**Returns:**
boolean - True if successed.
### toString() {#toString--}
```
public String toString()
```


Returns a java.lang.String that represents the current com.aspose.threed.Matrix4.

**Returns:**
java.lang.String - A java.lang.String that represents the current com.aspose.threed.Matrix4.
### translate(Vector3 t) {#translate-com.aspose.threed.Vector3-}
```
public static Matrix4 translate(Vector3 t)
```


Creates a matrix that translates along the x-axis, the y-axis and the z-axis

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| t | [Vector3](../../com.aspose.threed/vector3) | Translate offset |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### translate(double tx, double ty, double tz) {#translate-double-double-double-}
```
public static Matrix4 translate(double tx, double ty, double tz)
```


Creates a matrix that translates along the x-axis, the y-axis and the z-axis

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| tx | double | X-coordinate offset |
| ty | double | Y-coordinate offset |
| tz | double | Z-coordinate offset |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### scale(Vector3 s) {#scale-com.aspose.threed.Vector3-}
```
public static Matrix4 scale(Vector3 s)
```


Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | [Vector3](../../com.aspose.threed/vector3) | Scaling factories applies to the x-axis, the y-axis and the z-axis |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### scale(double s) {#scale-double-}
```
public static Matrix4 scale(double s)
```


Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | double | Scaling factories applies to all axex |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### scale(double sx, double sy, double sz) {#scale-double-double-double-}
```
public static Matrix4 scale(double sx, double sy, double sz)
```


Creates a matrix that scales along the x-axis, the y-axis and the z-axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | double | Scaling factories applies to the x-axis |
| sy | double | Scaling factories applies to the y-axis |
| sz | double | Scaling factories applies to the z-axis |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### rotateFromEuler(Vector3 eul) {#rotateFromEuler-com.aspose.threed.Vector3-}
```
public static Matrix4 rotateFromEuler(Vector3 eul)
```


Create a rotation matrix from Euler angle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| eul | [Vector3](../../com.aspose.threed/vector3) | Rotation in radian |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### rotateFromEuler(double rx, double ry, double rz) {#rotateFromEuler-double-double-double-}
```
public static Matrix4 rotateFromEuler(double rx, double ry, double rz)
```


Create a rotation matrix from Euler angle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rx | double | Rotation in x axis in radian |
| ry | double | Rotation in y axis in radian |
| rz | double | Rotation in z axis in radian |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### rotate(double angle, Vector3 axis) {#rotate-double-com.aspose.threed.Vector3-}
```
public static Matrix4 rotate(double angle, Vector3 axis)
```


Create a rotation matrix by rotation angle and axis

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | double | Rotate angle in radian |
| axis | [Vector3](../../com.aspose.threed/vector3) | Rotation axis |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### rotate(Quaternion q) {#rotate-com.aspose.threed.Quaternion-}
```
public static Matrix4 rotate(Quaternion q)
```


Create a rotation matrix from a quaternion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Rotation quaternion |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### clone() {#clone--}
```
public Matrix4 clone()
```




**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### copyFrom(Matrix4 src) {#copyFrom-com.aspose.threed.Matrix4-}
```
public void copyFrom(Matrix4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Matrix4](../../com.aspose.threed/matrix4) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
