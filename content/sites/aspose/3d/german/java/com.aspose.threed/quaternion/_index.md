---
title: Quaternion
second_title: Aspose.3D für Java API-Referenz
description: Quaternion wird üblicherweise verwendet, um Rotationen in der Computergrafik durchzuführen.
type: docs
weight: 143
url: /de/java/com.aspose.threed/quaternion/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class Quaternion implements Struct<Quaternion>, Serializable
```

Quaternion wird üblicherweise verwendet, um Rotationen in der Computergrafik durchzuführen.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Quaternion(double w, double x, double y, double z)](#Quaternion-double-double-double-double-) | Initialisiert eine neue Instanz der [Quaternion](../../com.aspose.threed/quaternion)-Klasse. |
| [Quaternion()](#Quaternion--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [IDENTITY](#IDENTITY) | Der Identitäts-Quaternion. |
| [w](#w) | Die w‑Komponente. |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
| [z](#z) | Die z‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(Quaternion lhs, Quaternion rhs)](#add-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Operatorüberladung für + |
| [clone()](#clone--) |  |
| [concat(Quaternion rhs)](#concat-com.aspose.threed.Quaternion-) | Verkettet zwei Quaternionen |
| [conjugate()](#conjugate--) | Gibt einen konjugierten Quaternion des aktuellen Quaternion zurück |
| [copyFrom(Quaternion src)](#copyFrom-com.aspose.threed.Quaternion-) |  |
| [div(Quaternion lhs, double rhs)](#div-com.aspose.threed.Quaternion-double-) | Operatorüberladung für / |
| [dot(Quaternion q)](#dot-com.aspose.threed.Quaternion-) | Skalarprodukt |
| [equals(Object obj)](#equals-java.lang.Object-) | Prüft, ob zwei Quaternionen gleich sind |
| [eulerAngles()](#eulerAngles--) | Konvertiert den Quaternion in eine Rotation, die durch Euler-Winkel dargestellt wird. Alle Komponenten sind in Radiant. |
| [fromAngleAxis(double a, Vector3 axis)](#fromAngleAxis-double-com.aspose.threed.Vector3-) | Erstellt einen Quaternion um die gegebene Achse und rotiert im Uhrzeigersinn |
| [fromEulerAngle(Vector3 eulerAngle)](#fromEulerAngle-com.aspose.threed.Vector3-) | Erstellt einen Quaternion aus dem gegebenen Euler-Winkel |
| [fromEulerAngle(double pitch, double yaw, double roll)](#fromEulerAngle-double-double-double-) | Erstellt einen Quaternion aus dem gegebenen Euler-Winkel |
| [fromRotation(Vector3 orig, Vector3 dest)](#fromRotation-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Erstellt einen Quaternion, der von der ursprünglichen zur Zielrichtung rotiert |
| [getClass()](#getClass--) |  |
| [getLength()](#getLength--) | Gibt die Länge des Quaternion zurück |
| [hashCode()](#hashCode--) | Gibt den Hashcode des Quaternion zurück |
| [interpolate(float t, Quaternion from, Quaternion to)](#interpolate-float-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Füllt diesen Quaternion mit dem interpolierten Wert zwischen den angegebenen Quaternion-Argumenten für ein t zwischen von und bis. |
| [inverse()](#inverse--) | Gibt einen inversen Quaternion des aktuellen Quaternion zurück |
| [mul(Quaternion lhs, Quaternion rhs)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Operatorüberladung für \* |
| [mul(Quaternion q, Vector3 v)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector3-) | Operatorüberladung für \* |
| [mul(Quaternion q, Vector4 v)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector4-) | Operatorüberladung für \* |
| [mul(Quaternion lhs, double rhs)](#mul-com.aspose.threed.Quaternion-double-) | Operatorüberladung für \* |
| [mul(Vector3 v, Quaternion q)](#mul-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-) | Operatorüberladung für \* |
| [normalize()](#normalize--) | Normalisiert den Quaternion |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_eq(Quaternion lhs, Quaternion rhs)](#op-eq-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Gleichheitsoperator für Quaternion |
| [op_ne(Quaternion lhs, Quaternion rhs)](#op-ne-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Ungleichheitsoperator für Quaternion |
| [slerp(double t, Quaternion v1, Quaternion v2)](#slerp-double-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Führt eine sphärische lineare Interpolation zwischen zwei Werten durch |
| [toAngleAxis(double[] angle, Vector3 axis)](#toAngleAxis-double---com.aspose.threed.Vector3-) | Zerlegt den Quaternion in Winkel und Achse |
| [toMatrix()](#toMatrix--) | Konvertiert die durch den Quaternion dargestellte Rotation in eine Transformationsmatrix. |
| [toMatrix(Vector3 translation)](#toMatrix-com.aspose.threed.Vector3-) | Konvertiert die durch den Quaternion dargestellte Rotation in eine Transformationsmatrix. |
| [toString()](#toString--) | Gibt die Darstellung des Quaternion als Zeichenkette zurück |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Quaternion(double w, double x, double y, double z) {#Quaternion-double-double-double-double-}
```
public Quaternion(double w, double x, double y, double z)
```


Initialisiert eine neue Instanz der [Quaternion](../../com.aspose.threed/quaternion)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| w | double | w‑Komponente des Quaternion |
| x | double | x‑Komponente des Quaternion |
| y | double | y‑Komponente des Quaternion |
| z | double | z‑Komponente des Quaternion |

### Quaternion() {#Quaternion--}
```
public Quaternion()
```


### IDENTITY {#IDENTITY}
```
public static final Quaternion IDENTITY
```


Der Identitäts-Quaternion.

### w {#w}
```
public double w
```


Die w‑Komponente.

### x {#x}
```
public double x
```


Die x‑Komponente.

### y {#y}
```
public double y
```


Die y‑Komponente.

### z {#z}
```
public double z
```


Die z‑Komponente.

### add(Quaternion lhs, Quaternion rhs) {#add-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion add(Quaternion lhs, Quaternion rhs)
```


Operatorüberladung für +

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linkes Quaternion |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Rechtes Quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### clone() {#clone--}
```
public Quaternion clone()
```


Klone aktuelle Instanz

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### concat(Quaternion rhs) {#concat-com.aspose.threed.Quaternion-}
```
public Quaternion concat(Quaternion rhs)
```


Verkettet zwei Quaternionen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) |  |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### conjugate() {#conjugate--}
```
public Quaternion conjugate()
```


Gibt einen konjugierten Quaternion des aktuellen Quaternion zurück

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - The conjugate quaternion.
### copyFrom(Quaternion src) {#copyFrom-com.aspose.threed.Quaternion-}
```
public void copyFrom(Quaternion src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [Quaternion](../../com.aspose.threed/quaternion) |  |

### div(Quaternion lhs, double rhs) {#div-com.aspose.threed.Quaternion-double-}
```
public static Quaternion div(Quaternion lhs, double rhs)
```


Operatorüberladung für /

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linkes Quaternion |
| rhs | double | Rechtes Quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### dot(Quaternion q) {#dot-com.aspose.threed.Quaternion-}
```
public double dot(Quaternion q)
```


Skalarprodukt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Das Quaternion |

**Returns:**
double - Punktwert
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Prüft, ob zwei Quaternionen gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Das Objekt zum Prüfen der Gleichheit. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### eulerAngles() {#eulerAngles--}
```
public Vector3 eulerAngles()
```


Konvertiert den Quaternion in eine Rotation, die durch Euler-Winkel dargestellt wird. Alle Komponenten sind in Radiant.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### fromAngleAxis(double a, Vector3 axis) {#fromAngleAxis-double-com.aspose.threed.Vector3-}
```
public static Quaternion fromAngleAxis(double a, Vector3 axis)
```


Erstellt einen Quaternion um die gegebene Achse und rotiert im Uhrzeigersinn

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | double | Uhrzeigersinn‑Drehung in Radiant |
| axis | [Vector3](../../com.aspose.threed/vector3) | Achse |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromEulerAngle(Vector3 eulerAngle) {#fromEulerAngle-com.aspose.threed.Vector3-}
```
public static Quaternion fromEulerAngle(Vector3 eulerAngle)
```


Erstellt einen Quaternion aus dem gegebenen Euler-Winkel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| eulerAngle | [Vector3](../../com.aspose.threed/vector3) | Euler‑Winkel in Radiant |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromEulerAngle(double pitch, double yaw, double roll) {#fromEulerAngle-double-double-double-}
```
public static Quaternion fromEulerAngle(double pitch, double yaw, double roll)
```


Erstellt einen Quaternion aus dem gegebenen Euler-Winkel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Neigung | double | Neigung in Radiant |
| Gier | double | Gier in Radiant |
| Roll | double | Roll in Radiant |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromRotation(Vector3 orig, Vector3 dest) {#fromRotation-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Quaternion fromRotation(Vector3 orig, Vector3 dest)
```


Erstellt einen Quaternion, der von der ursprünglichen zur Zielrichtung rotiert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| orig | [Vector3](../../com.aspose.threed/vector3) | Ursprüngliche Richtung |
| dest | [Vector3](../../com.aspose.threed/vector3) | Zielrichtung |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLength() {#getLength--}
```
public double getLength()
```


Gibt die Länge des Quaternion zurück

**Returns:**
double - die Länge des Quaternion
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode des Quaternion zurück

**Returns:**
int - Der Hashcode des [Quaternion](../../com.aspose.threed/quaternion)
### interpolate(float t, Quaternion from, Quaternion to) {#interpolate-float-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion interpolate(float t, Quaternion from, Quaternion to)
```


Füllt diesen Quaternion mit dem interpolierten Wert zwischen den angegebenen Quaternion-Argumenten für ein t zwischen von und bis.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| t | float | Der Koeffizient zum Interpolieren. |
| from | [Quaternion](../../com.aspose.threed/quaternion) | Quell‑Quaternion. |
| to | [Quaternion](../../com.aspose.threed/quaternion) | Ziel‑Quaternion. |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - The interpolated quaternion.
### inverse() {#inverse--}
```
public Quaternion inverse()
```


Gibt einen inversen Quaternion des aktuellen Quaternion zurück

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Inverse quaternion.
### mul(Quaternion lhs, Quaternion rhs) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion mul(Quaternion lhs, Quaternion rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linkes Quaternion |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Rechtes Quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### mul(Quaternion q, Vector3 v) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Quaternion q, Vector3 v)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Das Rotations‑Quaternion |
| v | [Vector3](../../com.aspose.threed/vector3) | Vektor zum Drehen |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Rotated vector
### mul(Quaternion q, Vector4 v) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Quaternion q, Vector4 v)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Das Rotations‑Quaternion |
| v | [Vector4](../../com.aspose.threed/vector4) | Vektor zum Drehen |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Rotated vector
### mul(Quaternion lhs, double rhs) {#mul-com.aspose.threed.Quaternion-double-}
```
public static Quaternion mul(Quaternion lhs, double rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linkes Quaternion |
| rhs | double | Rechtes Quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### mul(Vector3 v, Quaternion q) {#mul-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-}
```
public static Vector3 mul(Vector3 v, Quaternion q)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) | Das Rotations‑Quaternion |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Vektor zum Drehen |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Rotated vector
### normalize() {#normalize--}
```
public Quaternion normalize()
```


Normalisiert den Quaternion

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Normalized quaternion.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_eq(Quaternion lhs, Quaternion rhs) {#op-eq-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static boolean op_eq(Quaternion lhs, Quaternion rhs)
```


Gleichheitsoperator für Quaternion

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linker Handwert. |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Rechter Handwert. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### op_ne(Quaternion lhs, Quaternion rhs) {#op-ne-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static boolean op_ne(Quaternion lhs, Quaternion rhs)
```


Ungleichheitsoperator für Quaternion

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Linker Handwert. |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Rechter Handwert. |

**Returns:**
boolean – Wahr, wenn zwei Quaternionen nicht gleich sind.
### slerp(double t, Quaternion v1, Quaternion v2) {#slerp-double-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion slerp(double t, Quaternion v1, Quaternion v2)
```


Führt eine sphärische lineare Interpolation zwischen zwei Werten durch

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| t | double | t liegt zwischen 0 und 1 |
| v1 | [Quaternion](../../com.aspose.threed/quaternion) | Erster Wert |
| v2 | [Quaternion](../../com.aspose.threed/quaternion) | Zweiter Wert |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### toAngleAxis(double[] angle, Vector3 axis) {#toAngleAxis-double---com.aspose.threed.Vector3-}
```
public void toAngleAxis(double[] angle, Vector3 axis)
```


Zerlegt den Quaternion in Winkel und Achse

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | double[] | Der Winkel zum Drehen, in Radiant. |
| axis | [Vector3](../../com.aspose.threed/vector3) | Die Achse, um die rotiert wird. |

### toMatrix() {#toMatrix--}
```
public Matrix4 toMatrix()
```


Konvertiert die durch den Quaternion dargestellte Rotation in eine Transformationsmatrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The matrix representation of current quaternion.
### toMatrix(Vector3 translation) {#toMatrix-com.aspose.threed.Vector3-}
```
public Matrix4 toMatrix(Vector3 translation)
```


Konvertiert die durch den Quaternion dargestellte Rotation in eine Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| translation | [Vector3](../../com.aspose.threed/vector3) | Der Translationsanteil der Matrix. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The matrix representation of current quaternion.
### toString() {#toString--}
```
public String toString()
```


Gibt die Darstellung des Quaternion als Zeichenkette zurück

**Returns:**
java.lang.String - Objektzeichenkette
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

