---
title: Matrix4
second_title: Aspose.3D für Java API-Referenz
description: 4x4-Matrix-Implementierung.
type: docs
weight: 100
url: /de/java/com.aspose.threed/matrix4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class Matrix4 implements Struct<Matrix4>, Serializable
```

4x4-Matrix-Implementierung. **Beispiel:**

```
Matrix4 mat = Matrix4.rotateFromEuler(90, 0, 0);
      Matrix4 mat2 = Matrix4.translate(0, 10, -50);
      Matrix4 transform = Matrix4.mul(mat2, mat);
      Vector4 pos = new Vector4(10, 9, 0, 1);
      Vector4 transformed = Matrix4.mul(transform, pos);
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3)](#Matrix4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Konstruiert die Matrix aus 4 Zeilen. |
| [Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33)](#Matrix4-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-) | Initialisiert eine neue Instanz der [Matrix4](../../com.aspose.threed/matrix4) Struktur. |
| [Matrix4(FMatrix4 m)](#Matrix4-com.aspose.threed.FMatrix4-) | Erstelle [Matrix4](../../com.aspose.threed/matrix4) aus einer [FMatrix4](../../com.aspose.threed/fmatrix4)-Instanz |
| [Matrix4(double[] m)](#Matrix4-double---) | Initialisiert eine neue Instanz der [Matrix4](../../com.aspose.threed/matrix4) Struktur. |
| [Matrix4()](#Matrix4--) |  |
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
| [concatenate(Matrix4 m2)](#concatenate-com.aspose.threed.Matrix4-) | Verkettet die beiden Matrizen |
| [copyFrom(Matrix4 src)](#copyFrom-com.aspose.threed.Matrix4-) |  |
| [decompose(Vector3 translation, Vector3 scaling, Quaternion rotation)](#decompose-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-) | Zerlege die Transformationsmatrix. |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeterminant()](#getDeterminant--) | Gibt die Determinante der Matrix zurück. |
| [getIdentity()](#getIdentity--) | Gibt die Einheitsmatrix zurück. |
| [hashCode()](#hashCode--) |  |
| [inverse()](#inverse--) | Invertiert diese Instanz. |
| [mul(Matrix4 lhs, Matrix4 rhs)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Matrix4-) | Multipliziere die beiden Matrizen |
| [mul(Matrix4 lhs, Vector3 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector3-) | Multipliziere die Matrix und vector3 |
| [mul(Matrix4 lhs, Vector4 v)](#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector4-) | Multipliziere die Matrix und vector4 |
| [mul(Matrix4 lhs, double v)](#mul-com.aspose.threed.Matrix4-double-) | Multipliziert die Matrix mit einem double-Wert. |
| [normalize()](#normalize--) | Normalisiert diese Instanz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [rotate(Quaternion q)](#rotate-com.aspose.threed.Quaternion-) | Erstelle eine Rotationsmatrix aus einem Quaternion |
| [rotate(double angle, Vector3 axis)](#rotate-double-com.aspose.threed.Vector3-) | Erstelle eine Rotationsmatrix anhand des Rotationswinkels und der Achse |
| [rotateFromEuler(Vector3 eul)](#rotateFromEuler-com.aspose.threed.Vector3-) | Erstelle eine Rotationsmatrix aus einem Euler-Winkel |
| [rotateFromEuler(double rx, double ry, double rz)](#rotateFromEuler-double-double-double-) | Erstelle eine Rotationsmatrix aus einem Euler-Winkel |
| [scale(Vector3 s)](#scale-com.aspose.threed.Vector3-) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| [scale(double s)](#scale-double-) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| [scale(double sx, double sy, double sz)](#scale-double-double-double-) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert. |
| [setTRS(Vector3 translation, Vector3 rotation, Vector3 scale)](#setTRS-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initialisiert die Matrix mit Translation/Rotation/Skalierung |
| [toArray()](#toArray--) | Konvertiert die Matrix in ein Array. |
| [toString()](#toString--) | Gibt einen java.lang.String zurück, der die aktuelle [Matrix4](../../com.aspose.threed/matrix4) darstellt. |
| [translate(Vector3 t)](#translate-com.aspose.threed.Vector3-) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse übersetzt |
| [translate(double tx, double ty, double tz)](#translate-double-double-double-) | Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse übersetzt |
| [transpose()](#transpose--) | Transponiert diese Instanz. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3) {#Matrix4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public Matrix4(Vector4 r0, Vector4 r1, Vector4 r2, Vector4 r3)
```


Konstruiert die Matrix aus 4 Zeilen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r0 | [Vector4](../../com.aspose.threed/vector4) | R0. |
| r1 | [Vector4](../../com.aspose.threed/vector4) | R1. |
| r2 | [Vector4](../../com.aspose.threed/vector4) | R2. |
| r3 | [Vector4](../../com.aspose.threed/vector4) | R3. |

### Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {#Matrix4-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-double-}
```
public Matrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33)
```


Initialisiert eine neue Instanz der [Matrix4](../../com.aspose.threed/matrix4) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
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
|  | m33 | double | M33. **Beispiel:** |

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


Erstelle [Matrix4](../../com.aspose.threed/matrix4) aus einer [FMatrix4](../../com.aspose.threed/fmatrix4)-Instanz

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m | [FMatrix4](../../com.aspose.threed/fmatrix4) |  |

### Matrix4(double[] m) {#Matrix4-double---}
```
public Matrix4(double[] m)
```


Initialisiert eine neue Instanz der [Matrix4](../../com.aspose.threed/matrix4) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
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


Das m00.

### m01 {#m01}
```
public double m01
```


Das m01.

### m02 {#m02}
```
public double m02
```


Das m02.

### m03 {#m03}
```
public double m03
```


Das m03.

### m10 {#m10}
```
public double m10
```


Das m10.

### m11 {#m11}
```
public double m11
```


Das m11.

### m12 {#m12}
```
public double m12
```


Das m12.

### m13 {#m13}
```
public double m13
```


Das m13.

### m20 {#m20}
```
public double m20
```


Das m20.

### m21 {#m21}
```
public double m21
```


Das m21.

### m22 {#m22}
```
public double m22
```


Das m22.

### m23 {#m23}
```
public double m23
```


Das m23.

### m30 {#m30}
```
public double m30
```


Das m30.

### m31 {#m31}
```
public double m31
```


Das m31.

### m32 {#m32}
```
public double m32
```


Das m32.

### m33 {#m33}
```
public double m33
```


Das m33.

### clone() {#clone--}
```
public Matrix4 clone()
```


Klone aktuelle Instanz

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### concatenate(Matrix4 m2) {#concatenate-com.aspose.threed.Matrix4-}
```
public Matrix4 concatenate(Matrix4 m2)
```


Verkettet die beiden Matrizen

**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [Matrix4](../../com.aspose.threed/matrix4) |  |

### decompose(Vector3 translation, Vector3 scaling, Quaternion rotation) {#decompose-com.aspose.threed.Vector3-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-}
```
public boolean decompose(Vector3 translation, Vector3 scaling, Quaternion rotation)
```


Zerlege die Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| translation | [Vector3](../../com.aspose.threed/vector3) | Die Übersetzung. |
| scaling | [Vector3](../../com.aspose.threed/vector3) | Die Skalierung. |
| rotation | [Quaternion](../../com.aspose.threed/quaternion) | Die Rotation. |

**Returns:**
boolean - Wahr, wenn erfolgreich.
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
### getDeterminant() {#getDeterminant--}
```
public double getDeterminant()
```


Gibt die Determinante der Matrix zurück.

**Returns:**
double - die Determinante der Matrix.
### getIdentity() {#getIdentity--}
```
public static Matrix4 getIdentity()
```


Gibt die Einheitsmatrix zurück.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - the identity matrix.
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


Invertiert diese Instanz.

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


Multipliziere die beiden Matrizen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| rhs | [Matrix4](../../com.aspose.threed/matrix4) | Rhs. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Result matrix
### mul(Matrix4 lhs, Vector3 v) {#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Matrix4 lhs, Vector3 v)
```


Multipliziere die Matrix und vector3

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | [Vector3](../../com.aspose.threed/vector3) | V. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result matrix
### mul(Matrix4 lhs, Vector4 v) {#mul-com.aspose.threed.Matrix4-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Matrix4 lhs, Vector4 v)
```


Multipliziere die Matrix und vector4

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | [Vector4](../../com.aspose.threed/vector4) | V. |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result matrix
### mul(Matrix4 lhs, double v) {#mul-com.aspose.threed.Matrix4-double-}
```
public static Matrix4 mul(Matrix4 lhs, double v)
```


Multipliziert die Matrix mit einem double-Wert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Matrix4](../../com.aspose.threed/matrix4) | Lhs. |
| v | double | V. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - Result matrix
### normalize() {#normalize--}
```
public Matrix4 normalize()
```


Normalisiert diese Instanz.

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


Erstelle eine Rotationsmatrix aus einem Quaternion

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | q | [Quaternion](../../com.aspose.threed/quaternion) | Rotationsquaternion **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Rotationsoperation erstellt. |

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


Erstelle eine Rotationsmatrix anhand des Rotationswinkels und der Achse

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | double | Drehwinkel im Bogenmaß |
|  | axis | [Vector3](../../com.aspose.threed/vector3) | Rotationsachse **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Rotationsoperation erstellt. |

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


Erstelle eine Rotationsmatrix aus einem Euler-Winkel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | eul | [Vector3](../../com.aspose.threed/vector3) | Rotation im Bogenmaß **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Rotationsoperation erstellt. |

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


Erstelle eine Rotationsmatrix aus einem Euler-Winkel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rx | double | Rotation um die x-Achse im Bogenmaß |
| ry | double | Rotation um die y-Achse im Bogenmaß |
|  | rz | double | Rotation um die Z-Achse im Bogenmaß **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Rotationsoperation erstellt. |

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


Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | s | [Vector3](../../com.aspose.threed/vector3) | Skalierungsfaktoren gelten für die X-Achse, die Y-Achse und die Z-Achse **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Skalierungsoperation erstellt. |

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


Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | s | double | Skalierungsfaktoren gelten für alle Achsen **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Skalierungsoperation erstellt. |

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


Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse skaliert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sx | double | Skalierungsfaktoren gelten für die X-Achse |
| sy | double | Skalierungsfaktoren gelten für die Y-Achse |
|  | sz | double | Skalierungsfaktoren gelten für die Z-Achse **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Skalierungsoperation erstellt. |

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


Initialisiert die Matrix mit Translation/Rotation/Skalierung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| translation | [Vector3](../../com.aspose.threed/vector3) | Übersetzung. |
| rotation | [Vector3](../../com.aspose.threed/vector3) | Euler-Winkel für die Rotation, die Felder sind in Grad. |
| scale | [Vector3](../../com.aspose.threed/vector3) | Skalierung. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Konvertiert die Matrix in ein Array.

**Returns:**
double[] - Das Array.
### toString() {#toString--}
```
public String toString()
```


Gibt einen java.lang.String zurück, der die aktuelle [Matrix4](../../com.aspose.threed/matrix4) darstellt.

**Returns:**
java.lang.String - Ein java.lang.String, der die aktuelle [Matrix4](../../com.aspose.threed/matrix4) darstellt.
### translate(Vector3 t) {#translate-com.aspose.threed.Vector3-}
```
public static Matrix4 translate(Vector3 t)
```


Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse übersetzt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | t | [Vector3](../../com.aspose.threed/vector3) | Übersetzungsversatz **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Übersetzungsoperation erstellt. |

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


Erstellt eine Matrix, die entlang der x-Achse, der y-Achse und der z-Achse übersetzt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tx | double | X-Koordinaten-Offset |
| ty | double | Y-Koordinaten-Offset |
|  | tz | double | Z-Koordinaten-Offset **Beispiel:** Der folgende Code zeigt, wie man eine Matrix für die Übersetzungsoperation erstellt. |

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


Transponiert diese Instanz.

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

