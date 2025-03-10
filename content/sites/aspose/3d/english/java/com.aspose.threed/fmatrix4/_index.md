---
title: FMatrix4
second_title: Aspose.3D for Java API Reference
description: Matrix 4x4 with all component in float type
type: docs
weight: 56
url: /java/com.aspose.threed/fmatrix4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class FMatrix4 implements Struct<FMatrix4>, Serializable
```

Matrix 4x4 with all component in float type
## Constructors

| Constructor | Description |
| --- | --- |
| [FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)](#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-) | Initialize the instance of [FMatrix4](../../com.aspose.threed/fmatrix4) |
| [FMatrix4(Matrix4 mat)](#FMatrix4-com.aspose.threed.Matrix4-) | Initialize the instance of [FMatrix4](../../com.aspose.threed/fmatrix4) from a [Matrix4](../../com.aspose.threed/matrix4) instance. |
| [FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3)](#FMatrix4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-) | Constructs matrix from 4 rows. |
| [FMatrix4()](#FMatrix4--) |  |
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
| [concatenate(FMatrix4 m2)](#concatenate-com.aspose.threed.FMatrix4-) | Concatenates the two matrices |
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Concatenates the two matrices |
| [copyFrom(FMatrix4 src)](#copyFrom-com.aspose.threed.FMatrix4-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getIdentity()](#getIdentity--) | The identity matrix |
| [hashCode()](#hashCode--) |  |
| [inverse()](#inverse--) | Calculate the inverse matrix of current instance. |
| [mul(FMatrix4 left, FMatrix4 right)](#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-) | Concatenate the two matrices |
| [mul(FMatrix4 lhs, float v)](#mul-com.aspose.threed.FMatrix4-float-) | Multiply the matrix and double value |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [transpose()](#transpose--) | Transposes this instance. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-}
```
public FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
```


Initialize the instance of [FMatrix4](../../com.aspose.threed/fmatrix4)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m00 | float | The m[0, 0] |
| m01 | float | The m[0, 1] |
| m02 | float | The m[0, 2] |
| m03 | float | The m[0, 3] |
| m10 | float | The m[1, 0] |
| m11 | float | The m[1, 1] |
| m12 | float | The m[1, 2] |
| m13 | float | The m[1, 3] |
| m20 | float | The m[2, 0] |
| m21 | float | The m[2, 1] |
| m22 | float | The m[2, 2] |
| m23 | float | The m[2, 3] |
| m30 | float | The m[3, 0] |
| m31 | float | The m[3, 1] |
| m32 | float | The m[3, 2] |
| m33 | float | The m[3, 3] |

### FMatrix4(Matrix4 mat) {#FMatrix4-com.aspose.threed.Matrix4-}
```
public FMatrix4(Matrix4 mat)
```


Initialize the instance of [FMatrix4](../../com.aspose.threed/fmatrix4) from a [Matrix4](../../com.aspose.threed/matrix4) instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mat | [Matrix4](../../com.aspose.threed/matrix4) | The [Matrix4](../../com.aspose.threed/matrix4) instance. |

### FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3) {#FMatrix4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-}
```
public FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3)
```


Constructs matrix from 4 rows.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r0 | [FVector4](../../com.aspose.threed/fvector4) | R0. |
| r1 | [FVector4](../../com.aspose.threed/fvector4) | R1. |
| r2 | [FVector4](../../com.aspose.threed/fvector4) | R2. |
| r3 | [FVector4](../../com.aspose.threed/fvector4) | R3. |

### FMatrix4() {#FMatrix4--}
```
public FMatrix4()
```


### m00 {#m00}
```
public float m00
```


The m00.

### m01 {#m01}
```
public float m01
```


The m01.

### m02 {#m02}
```
public float m02
```


The m02.

### m03 {#m03}
```
public float m03
```


The m03.

### m10 {#m10}
```
public float m10
```


The m10.

### m11 {#m11}
```
public float m11
```


The m11.

### m12 {#m12}
```
public float m12
```


The m12.

### m13 {#m13}
```
public float m13
```


The m13.

### m20 {#m20}
```
public float m20
```


The m20.

### m21 {#m21}
```
public float m21
```


The m21.

### m22 {#m22}
```
public float m22
```


The m22.

### m23 {#m23}
```
public float m23
```


The m23.

### m30 {#m30}
```
public float m30
```


The m30.

### m31 {#m31}
```
public float m31
```


The m31.

### m32 {#m32}
```
public float m32
```


The m32.

### m33 {#m33}
```
public float m33
```


The m33.

### clone() {#clone--}
```
public FMatrix4 clone()
```


Clone current instance

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4)
### concatenate(FMatrix4 m2) {#concatenate-com.aspose.threed.FMatrix4-}
```
public FMatrix4 concatenate(FMatrix4 m2)
```


Concatenates the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m2 | [FMatrix4](../../com.aspose.threed/fmatrix4) | M2. |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - New matrix4
### concatenate(Matrix4 m2) {#concatenate-com.aspose.threed.Matrix4-}
```
public FMatrix4 concatenate(Matrix4 m2)
```


Concatenates the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m2 | [Matrix4](../../com.aspose.threed/matrix4) | M2. |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - New matrix4
### copyFrom(FMatrix4 src) {#copyFrom-com.aspose.threed.FMatrix4-}
```
public void copyFrom(FMatrix4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

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
### getIdentity() {#getIdentity--}
```
public static FMatrix4 getIdentity()
```


The identity matrix

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - The identity matrix
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### inverse() {#inverse--}
```
public FMatrix4 inverse()
```


Calculate the inverse matrix of current instance.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Inverse matrix4
### mul(FMatrix4 left, FMatrix4 right) {#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-}
```
public static FMatrix4 mul(FMatrix4 left, FMatrix4 right)
```


Concatenate the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [FMatrix4](../../com.aspose.threed/fmatrix4) | The left matrix to concatenate |
| right | [FMatrix4](../../com.aspose.threed/fmatrix4) | The right matrix to concatenate |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - The concatenated matrix.
### mul(FMatrix4 lhs, float v) {#mul-com.aspose.threed.FMatrix4-float-}
```
public static FMatrix4 mul(FMatrix4 lhs, float v)
```


Multiply the matrix and double value

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [FMatrix4](../../com.aspose.threed/fmatrix4) | Lhs. |
| v | float | V. |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Result matrix
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transpose() {#transpose--}
```
public FMatrix4 transpose()
```


Transposes this instance.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - The transposed matrix.
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

