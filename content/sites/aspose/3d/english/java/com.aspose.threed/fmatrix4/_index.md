---
title: FMatrix4
second_title: Aspose.3D for Java API Reference
description: Matrix 4x4 with all component in float type
type: docs
weight: 55
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
| [FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)](#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-) | Initialize the instance of com.aspose.threed.FMatrix4 |
| [FMatrix4(Matrix4 mat)](#FMatrix4-com.aspose.threed.Matrix4-) | Initialize the instance of com.aspose.threed.FMatrix4 from a com.aspose.threed.Matrix4 instance. |
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
| [IDENTITY](#IDENTITY) | The identity matrix |
## Methods

| Method | Description |
| --- | --- |
| [concatenate(FMatrix4 m2)](#concatenate-com.aspose.threed.FMatrix4-) | Concatenates the two matrices |
| [mul(FMatrix4 left, FMatrix4 right)](#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-) | Concatenate the two matrices |
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Concatenates the two matrices |
| [transpose()](#transpose--) | Transposes this instance. |
| [inverse()](#inverse--) | Calculate the inverse matrix of current instance. |
| [mul(FMatrix4 lhs, float v)](#mul-com.aspose.threed.FMatrix4-float-) | Multiply the matrix and double value |
| [clone()](#clone--) |  |
| [copyFrom(FMatrix4 src)](#copyFrom-com.aspose.threed.FMatrix4-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-}
```
public FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
```


Initialize the instance of com.aspose.threed.FMatrix4

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m00 | float |  |
| m01 | float |  |
| m02 | float |  |
| m03 | float |  |
| m10 | float |  |
| m11 | float |  |
| m12 | float |  |
| m13 | float |  |
| m20 | float |  |
| m21 | float |  |
| m22 | float |  |
| m23 | float |  |
| m30 | float |  |
| m31 | float |  |
| m32 | float |  |
| m33 | float |  |

### FMatrix4(Matrix4 mat) {#FMatrix4-com.aspose.threed.Matrix4-}
```
public FMatrix4(Matrix4 mat)
```


Initialize the instance of com.aspose.threed.FMatrix4 from a com.aspose.threed.Matrix4 instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mat | [Matrix4](../../com.aspose.threed/matrix4) |  |

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

### IDENTITY {#IDENTITY}
```
public static final FMatrix4 IDENTITY
```


The identity matrix

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
### mul(FMatrix4 left, FMatrix4 right) {#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-}
```
public static FMatrix4 mul(FMatrix4 left, FMatrix4 right)
```


Concatenate the two matrices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| left | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |
| right | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4)
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
### transpose() {#transpose--}
```
public FMatrix4 transpose()
```


Transposes this instance.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - The transposed matrix.
### inverse() {#inverse--}
```
public FMatrix4 inverse()
```


Calculate the inverse matrix of current instance.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Inverse matrix4
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
### clone() {#clone--}
```
public FMatrix4 clone()
```




**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4)
### copyFrom(FMatrix4 src) {#copyFrom-com.aspose.threed.FMatrix4-}
```
public void copyFrom(FMatrix4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

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
