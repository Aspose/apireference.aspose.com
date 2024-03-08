---
title: Matrix4
second_title: Aspose.3D for Java API Reference
description: 4x4 matrix implementation.
type: docs
weight: 94
url: /java/com.aspose.threed/matrix4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class Matrix4 implements Struct<Matrix4>, Serializable
```

4x4 matrix implementation. **Example:**

```
Matrix4 mat = Matrix4.rotateFromEuler(90, 0, 0);
      Matrix4 mat2 = Matrix4.translate(0, 10, -50);
      Matrix4 transform = Matrix4.mul(mat2, mat);
      Vector4 pos = new Vector4(10, 9, 0, 1);
      Vector4 transformed = Matrix4.mul(transform, pos);
```
## Constructors

| Constructor | Description |
| --- | --- |
| [Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3)](#Matrix4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Constructs matrix from 4 rows. |
| [Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33)](#Matrix4-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-) | Initializes a new instance of the [Matrix4](../../com.aspose.threed/matrix4) struct. |
| [Matrix4(FMatrix4 m)](#Matrix4-com.aspose.threed.FMatrix4-) | Construct [Matrix4](../../com.aspose.threed/matrix4) from an [FMatrix4](../../com.aspose.threed/fmatrix4) instance |
| [Matrix4(double[] m)](#Matrix4-double---) | Initializes a new instance of the [Matrix4](../../com.aspose.threed/matrix4) struct. |
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
| [clone()](#clone--) |  |
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Concatenates the two matrices |
| [copyFrom(Matrix4 src)](#copyFrom-com.aspose.threed.Matrix4-) |  |
| [decompose(Vector3 translation, Vector3 scaling, Quaternion rotation)](#decompose-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-) | Decompose the transformation matrix. |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeterminant()](#getDeterminant--) | Gets the determinant of the matrix. |
| [getIdentity()](#getIdentity--) | Gets the identity matrix. |
| [hashCode()](#hashCode--) |  |
| [inverse()](#inverse--) | Inverses this instance. |
| [mul(Matrix4 lhs, Matrix4 rhs)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Matrix4-) | Multiply the two matrices |
| [mul(Matrix4 lhs, Vector3 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector3-) | Multiply the matrix and vector3 |
| [mul(Matrix4 lhs, Vector4 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector4-) | Multiply the matrix and vector4 |
| [mul(Matrix4 lhs, double v)](#mul-com.aspose.threed.Matrix4-double-) | Multiply the matrix and double value |
| [normalize()](#normalize--) | Normalizes this instance. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [rotate(Quaternion q)](#rotate-com.aspose.threed.Quaternion-) | Create a rotation matrix from a quaternion |
| [rotate(double angle, Vector3 axis)](#rotate-double-com.aspose.threed.Vector3-) | Create a rotation matrix by rotation angle and axis |
| [rotateFromEuler(Vector3 eul)](#rotateFromEuler-com.aspose.threed.Vector3-) | Create a rotation matrix from Euler angle |
| [rotateFromEuler(double rx, double ry, double rz)](#rotateFromEuler-double-double-double-) | Create a rotation matrix from Euler angle |
| [scale(Vector3 s)](#scale-com.aspose.threed.Vector3-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale(double s)](#scale-double-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale(double sx, double sy, double sz)](#scale-double-double-double-) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [setTRS(Vector3 translation, Vector3 rotation, Vector3 scale)](#setTRS-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initializes the matrix with translation/rotation/scale |
| [toArray()](#toArray--) | Converts matrix to array. |
| [toString()](#toString--) | Returns a java.lang.String that represents the current [Matrix4](../../com.aspose.threed/matrix4). |
| [translate(Vector3 t)](#translate-com.aspose.threed.Vector3-) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [translate(double tx, double ty, double tz)](#translate-double-double-double-) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [transpose()](#transpose--) | Transposes this instance. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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


Initializes a new instance of the [Matrix4](../../com.aspose.threed/matrix4) struct.

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
| m33 | double | M33. **Example:**

```
var mat = new Matrix4(
         1, 0, 0, 0,
         0, 1, 0, 0,
         0, 0, 1, 0,
         10, 20, 0, 1);
     var pos = new Vector3(10, 0, -1);
     var transformed = Matrix4.mul(mat, pos);
``` |

### Matrix4(FMatrix4 m) {#Matrix4-com.aspose.threed.FMatrix4-}
```
public Matrix4(FMatrix4 m)
```


Construct [Matrix4](../../com.aspose.threed/matrix4) from an [FMatrix4](../../com.aspose.threed/fmatrix4) instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

### Matrix4(double[] m) {#Matrix4-double---}
```
public Matrix4(double[] m)
```


Initializes a new instance of the [Matrix4](../../com.aspose.threed/matrix4) struct.

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

### clone() {#clone--}
```
public Matrix4 clone()
```




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
[Matrix4](../../com.aspose.threed/matrix4) - New matrix4 **Example:**

```
Matrix4 t = Matrix4.translate(0, 10, 9);
     Matrix4 s = Matrix4.scale(10, 10, 10);
     Matrix4 transform = t.concatenate(s);
     Vector3 pos = new Vector3(10, 0, -1);
     Vector3 transformed = Matrix4.mul(transform, pos);
```
### copyFrom(Matrix4 src) {#copyFrom-com.aspose.threed.Matrix4-}
```
public void copyFrom(Matrix4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Matrix4](../../com.aspose.threed/matrix4) |  |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDeterminant() {#getDeterminant--}
```
public double getDeterminant()
```


Gets the determinant of the matrix.

**Returns:**
double
### getIdentity() {#getIdentity--}
```
public static Matrix4 getIdentity()
```


Gets the identity matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### inverse() {#inverse--}
```
public Matrix4 inverse()
```


Inverses this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Inverse matrix4 **Example:** The following code shows how to inverse a matrix

```
Matrix4 t = Matrix4.translate(0, 10, 9);
     Matrix4 mat = t.inverse();
     System.out.printf("Inversed Matrix: %s", mat);
```
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
### normalize() {#normalize--}
```
public Matrix4 normalize()
```


Normalizes this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Normalize matrix4
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### rotate(Quaternion q) {#rotate-com.aspose.threed.Quaternion-}
```
public static Matrix4 rotate(Quaternion q)
```


Create a rotation matrix from a quaternion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Rotation quaternion **Example:** The following code shows how to create a matrix for rotate operation.

```
var t = Matrix4.rotate(Quaternion.fromAngleAxis(Math.PI, Vector3.getUnitY()));
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| axis | [Vector3](../../com.aspose.threed/vector3) | Rotation axis **Example:** The following code shows how to create a matrix for rotate operation.

```
var t = Matrix4.rotate(Math.PI, new Vector3(0, 1, 0));
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| eul | [Vector3](../../com.aspose.threed/vector3) | Rotation in radian **Example:** The following code shows how to create a matrix for rotate operation.

```
var t = Matrix4.rotateFromEuler(new Vector3(0, Math.PI, 0));
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| rz | double | Rotation in z axis in radian **Example:** The following code shows how to create a matrix for rotate operation.

```
var t = Matrix4.rotateFromEuler(0, Math.PI, 0);
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| s | [Vector3](../../com.aspose.threed/vector3) | Scaling factories applies to the x-axis, the y-axis and the z-axis **Example:** The following code shows how to create a matrix for scale operation.

```
var t = Matrix4.scale(new Vector3(10, 10, 10));
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| s | double | Scaling factories applies to all axex **Example:** The following code shows how to create a matrix for scale operation.

```
var t = Matrix4.scale(10);
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| sz | double | Scaling factories applies to the z-axis **Example:** The following code shows how to create a matrix for scale operation.

```
var t = Matrix4.scale(10, 20, 10);
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
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

### toArray() {#toArray--}
```
public double[] toArray()
```


Converts matrix to array.

**Returns:**
double[] - The array.
### toString() {#toString--}
```
public String toString()
```


Returns a java.lang.String that represents the current [Matrix4](../../com.aspose.threed/matrix4).

**Returns:**
java.lang.String - A java.lang.String that represents the current [Matrix4](../../com.aspose.threed/matrix4).
### translate(Vector3 t) {#translate-com.aspose.threed.Vector3-}
```
public static Matrix4 translate(Vector3 t)
```


Creates a matrix that translates along the x-axis, the y-axis and the z-axis

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| t | [Vector3](../../com.aspose.threed/vector3) | Translate offset **Example:** The following code shows how to create a matrix for translate operation.

```
Matrix4 t = Matrix4.translate(new Vector3(10, 0, 0));
     Vector3 pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

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
| tz | double | Z-coordinate offset **Example:** The following code shows how to create a matrix for translate operation.

```
var t = Matrix4.translate(10, 0, 0);
     var pos = new Vector3(1, 1, 10);
     System.out.printf("Transformed: %s", Matrix4.mul(t, pos));
``` |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### transpose() {#transpose--}
```
public Matrix4 transpose()
```


Transposes this instance.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The transposed matrix. **Example:** The following code shows how to transpose a matrix

```
Matrix4 t = Matrix4.translate(0, 10, 9);
     Matrix4 mat = t.transpose();
     System.out.printf("Transposed Matrix: %s", mat);
```
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

