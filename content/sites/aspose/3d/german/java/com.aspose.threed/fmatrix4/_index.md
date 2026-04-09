---
title: FMatrix4
second_title: Aspose.3D für Java API-Referenz
description: 4x4-Matrix mit allen Komponenten vom Typ float.
type: docs
weight: 58
url: /de/java/com.aspose.threed/fmatrix4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class FMatrix4 implements Struct<FMatrix4>, Serializable
```

4x4-Matrix mit allen Komponenten vom Typ float.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)](#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-) | Initialisiere die Instanz von [FMatrix4](../../com.aspose.threed/fmatrix4) |
| [FMatrix4(Matrix4 mat)](#FMatrix4-com.aspose.threed.Matrix4-) | Initialisieren Sie die Instanz von [FMatrix4](../../com.aspose.threed/fmatrix4) aus einer [Matrix4](../../com.aspose.threed/matrix4)-Instanz. |
| [FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3)](#FMatrix4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-) | Konstruiert die Matrix aus 4 Zeilen. |
| [FMatrix4()](#FMatrix4--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [m00](#m00) | Das m00. |
| [m01](#m01) | Das m01. |
| [m02](#m02) | Das m02. |
| [m03](#m03) | Das m03. |
| [m10](#m10) | Das m10. |
| [m11](#m11) | Das m11. |
| [m12](#m12) | Das m12. |
| [m13](#m13) | Das m13. |
| [m20](#m20) | Das m20. |
| [m21](#m21) | Das m21. |
| [m22](#m22) | Das m22. |
| [m23](#m23) | Das m23. |
| [m30](#m30) | Das m30. |
| [m31](#m31) | Das m31. |
| [m32](#m32) | Das m32. |
| [m33](#m33) | Das m33. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [concatenate(FMatrix4 m2)](#concatenate-com.aspose.threed.FMatrix4-) | Verkettet die beiden Matrizen |
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Verkettet die beiden Matrizen |
| [copyFrom(FMatrix4 src)](#copyFrom-com.aspose.threed.FMatrix4-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getIdentity()](#getIdentity--) | Die Einheitsmatrix |
| [hashCode()](#hashCode--) |  |
| [inverse()](#inverse--) | Berechnet die Inversmatrix der aktuellen Instanz. |
| [mul(FMatrix4 left, FMatrix4 right)](#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-) | Verkette die beiden Matrizen |
| [mul(FMatrix4 lhs, float v)](#mul-com.aspose.threed.FMatrix4-float-) | Multipliziert die Matrix mit einem double-Wert. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [transpose()](#transpose--) | Transponiert diese Instanz. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {#FMatrix4-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-}
```
public FMatrix4(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33)
```


Initialisiere die Instanz von [FMatrix4](../../com.aspose.threed/fmatrix4)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m00 | float | Das m[0, 0] |
| m01 | float | Das m[0, 1] |
| m02 | float | Das m[0, 2] |
| m03 | float | Das m[0, 3] |
| m10 | float | Das m[1, 0] |
| m11 | float | Das m[1, 1] |
| m12 | float | Das m[1, 2] |
| m13 | float | Das m[1, 3] |
| m20 | float | Das m[2, 0] |
| m21 | float | Das m[2, 1] |
| m22 | float | Das m[2, 2] |
| m23 | float | Das m[2, 3] |
| m30 | float | Das m[3, 0] |
| m31 | float | Die m[3, 1] |
| m32 | float | Die m[3, 2] |
| m33 | float | Die m[3, 3] |

### FMatrix4(Matrix4 mat) {#FMatrix4-com.aspose.threed.Matrix4-}
```
public FMatrix4(Matrix4 mat)
```


Initialisieren Sie die Instanz von [FMatrix4](../../com.aspose.threed/fmatrix4) aus einer [Matrix4](../../com.aspose.threed/matrix4)-Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mat | [Matrix4](../../com.aspose.threed/matrix4) | Die [Matrix4](../../com.aspose.threed/matrix4) Instanz. |

### FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3) {#FMatrix4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-com.aspose.threed.FVector4-}
```
public FMatrix4(FVector4 r0, FVector4 r1, FVector4 r2, FVector4 r3)
```


Konstruiert die Matrix aus 4 Zeilen.

**Parameters:**
| Parameter | Typ | Beschreibung |
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


Das m00.

### m01 {#m01}
```
public float m01
```


Das m01.

### m02 {#m02}
```
public float m02
```


Das m02.

### m03 {#m03}
```
public float m03
```


Das m03.

### m10 {#m10}
```
public float m10
```


Das m10.

### m11 {#m11}
```
public float m11
```


Das m11.

### m12 {#m12}
```
public float m12
```


Das m12.

### m13 {#m13}
```
public float m13
```


Das m13.

### m20 {#m20}
```
public float m20
```


Das m20.

### m21 {#m21}
```
public float m21
```


Das m21.

### m22 {#m22}
```
public float m22
```


Das m22.

### m23 {#m23}
```
public float m23
```


Das m23.

### m30 {#m30}
```
public float m30
```


Das m30.

### m31 {#m31}
```
public float m31
```


Das m31.

### m32 {#m32}
```
public float m32
```


Das m32.

### m33 {#m33}
```
public float m33
```


Das m33.

### clone() {#clone--}
```
public FMatrix4 clone()
```


Klone aktuelle Instanz

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4)
### concatenate(FMatrix4 m2) {#concatenate-com.aspose.threed.FMatrix4-}
```
public FMatrix4 concatenate(FMatrix4 m2)
```


Verkettet die beiden Matrizen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m2 | [FMatrix4](../../com.aspose.threed/fmatrix4) | M2. |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - New matrix4
### concatenate(Matrix4 m2) {#concatenate-com.aspose.threed.Matrix4-}
```
public FMatrix4 concatenate(Matrix4 m2)
```


Verkettet die beiden Matrizen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m2 | [Matrix4](../../com.aspose.threed/matrix4) | M2. |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - New matrix4
### copyFrom(FMatrix4 src) {#copyFrom-com.aspose.threed.FMatrix4-}
```
public void copyFrom(FMatrix4 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Die Einheitsmatrix

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


Berechnet die Inversmatrix der aktuellen Instanz.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Inverse matrix4
### mul(FMatrix4 left, FMatrix4 right) {#mul-com.aspose.threed.FMatrix4-com.aspose.threed.FMatrix4-}
```
public static FMatrix4 mul(FMatrix4 left, FMatrix4 right)
```


Verkette die beiden Matrizen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| left | [FMatrix4](../../com.aspose.threed/fmatrix4) | Die linke Matrix zum Konkatenieren |
| right | [FMatrix4](../../com.aspose.threed/fmatrix4) | Die rechte Matrix zum Konkatenieren |

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - The concatenated matrix.
### mul(FMatrix4 lhs, float v) {#mul-com.aspose.threed.FMatrix4-float-}
```
public static FMatrix4 mul(FMatrix4 lhs, float v)
```


Multipliziert die Matrix mit einem double-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
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


Transponiert diese Instanz.

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

