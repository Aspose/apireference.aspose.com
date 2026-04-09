---
title: Vector3
second_title: Aspose.3D für Java API-Referenz
description: Ein Vektor mit drei Komponenten.
type: docs
weight: 202
url: /de/java/com.aspose.threed/vector3/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.threed.Struct, java.io.Serializable
```
public final class Vector3 implements Comparable<Vector3>, Struct<Vector3>, Serializable
```

Ein Vektor mit drei Komponenten.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Vector3(double x, double y, double z)](#Vector3-double-double-double-) | Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur. |
| [Vector3(FVector3 vec)](#Vector3-com.aspose.threed.FVector3-) | Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur. |
| [Vector3(double v)](#Vector3-double-) | Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur. |
| [Vector3(Vector4 vec4)](#Vector3-com.aspose.threed.Vector4-) | Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur. |
| [Vector3()](#Vector3--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
| [z](#z) | Die z‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(Vector3 lhs, Vector3 rhs)](#add-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operatorüberladung für + |
| [angleBetween(Vector3 dir)](#angleBetween-com.aspose.threed.Vector3-) | Berechnet den inneren Winkel zwischen zwei Richtungen. Zwei Richtungen können nicht normalisierte Vektoren sein. |
| [angleBetween(Vector3 dir, Vector3 up)](#angleBetween-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Berechnet den inneren Winkel zwischen zwei Richtungen. Zwei Richtungen können nicht normalisierte Vektoren sein. |
| [clone()](#clone--) |  |
| [compareTo(Vector3 other)](#compareTo-com.aspose.threed.Vector3-) | Vergleicht den aktuellen Vektor mit einer anderen Instanz. |
| [copyFrom(Vector3 src)](#copyFrom-com.aspose.threed.Vector3-) |  |
| [cos()](#cos--) | Berechnet den Kosinus jeder Komponente |
| [create(Vector3 v)](#create-com.aspose.threed.Vector3-) | Expliziter Konvertierungsoperator, um Vector3 nach FVector3 zu konvertieren |
| [cross(Vector3 rhs)](#cross-com.aspose.threed.Vector3-) | Kreuzprodukt von zwei Vektoren |
| [div(Vector3 lhs, Vector3 rhs)](#div-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operatorüberladung für / |
| [div(Vector3 lhs, double rhs)](#div-com.aspose.threed.Vector3-double-) | Operatorüberladung für / |
| [dot(Vector3 rhs)](#dot-com.aspose.threed.Vector3-) | Gibt das Skalarprodukt von zwei Vektoren zurück |
| [equals(Object obj)](#equals-java.lang.Object-) | Prüft, ob zwei Vector3 gleich sind |
| [get(int idx)](#get-int-) | Gibt die Komponente des Vektors nach Index zurück. |
| [getClass()](#getClass--) |  |
| [getLength()](#getLength--) | Gibt die Länge dieses Vektors zurück. |
| [getLength2()](#getLength2--) | Gibt das Quadrat der Länge zurück. |
| [getOne()](#getOne--) | Gibt den Einheitsvektor (1, 1, 1) zurück. |
| [getUnitX()](#getUnitX--) | Gibt den Einheitsvektor (1, 0, 0) zurück. |
| [getUnitY()](#getUnitY--) | Gibt den Einheitsvektor (0, 1, 0) zurück. |
| [getUnitZ()](#getUnitZ--) | Gibt den Einheitsvektor (0, 0, 1) zurück. |
| [getZero()](#getZero--) | Gibt den Einheitsvektor (0, 0, 0) zurück. |
| [hashCode()](#hashCode--) | Gibt den Hashcode von Vector3 zurück. |
| [mul(Vector3 lhs, Vector3 rhs)](#mul-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operatorüberladung für \* |
| [mul(Vector3 lhs, double rhs)](#mul-com.aspose.threed.Vector3-double-) | Operatorüberladung für \* |
| [mul(double lhs, Vector3 rhs)](#mul-double-com.aspose.threed.Vector3-) | Operatorüberladung für \* |
| [negative(Vector3 v)](#negative-com.aspose.threed.Vector3-) | Operatorüberladung für - |
| [normalize()](#normalize--) | Normalisiert diese Instanz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_eq(Vector3 lhs, Vector3 rhs)](#op-eq-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Gleichheitsoperator für Vector3 |
| [op_ne(Vector3 lhs, Vector3 rhs)](#op-ne-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Ungleichheitsoperator für Vector3 |
| [set(double newX, double newY, double newZ)](#set-double-double-double-) | Setzt die x/y/z-Komponente in einem Aufruf. |
| [set(int idx, double value)](#set-int-double-) | Setzt die Komponente des Vektors per Index. |
| [sin()](#sin--) | Berechnet den Sinus jeder Komponente. |
| [sub(Vector3 lhs, Vector3 rhs)](#sub-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operatorüberladung für - (Minus) |
| [toString()](#toString--) | Gibt einen java.lang.String zurück, der das aktuelle [Vector3](../../com.aspose.threed/vector3) darstellt. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Vector3(double x, double y, double z) {#Vector3-double-double-double-}
```
public Vector3(double x, double y, double z)
```


Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Koordinate. |
| y | double | Die y-Koordinate. |
| z | double | Die z-Koordinate. |

### Vector3(FVector3 vec) {#Vector3-com.aspose.threed.FVector3-}
```
public Vector3(FVector3 vec)
```


Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [FVector3](../../com.aspose.threed/fvector3) | Die x-Koordinate. |

### Vector3(double v) {#Vector3-double-}
```
public Vector3(double v)
```


Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | double | V. |

### Vector3(Vector4 vec4) {#Vector3-com.aspose.threed.Vector4-}
```
public Vector3(Vector4 vec4)
```


Initialisiert eine neue Instanz der [Vector3](../../com.aspose.threed/vector3) Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec4 | [Vector4](../../com.aspose.threed/vector4) | Vec4. |

### Vector3() {#Vector3--}
```
public Vector3()
```


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

### add(Vector3 lhs, Vector3 rhs) {#add-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 add(Vector3 lhs, Vector3 rhs)
```


Operatorüberladung für +

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Der rechte Vektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### angleBetween(Vector3 dir) {#angleBetween-com.aspose.threed.Vector3-}
```
public double angleBetween(Vector3 dir)
```


Berechnet den inneren Winkel zwischen zwei Richtungen. Zwei Richtungen können nicht normalisierte Vektoren sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dir | [Vector3](../../com.aspose.threed/vector3) | Der Richtungsvektor zum Vergleich |

**Returns:**
double - innerer Winkel in Radiant
### angleBetween(Vector3 dir, Vector3 up) {#angleBetween-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public double angleBetween(Vector3 dir, Vector3 up)
```


Berechnet den inneren Winkel zwischen zwei Richtungen. Zwei Richtungen können nicht normalisierte Vektoren sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dir | [Vector3](../../com.aspose.threed/vector3) | Der Richtungsvektor zum Vergleich |
| up | [Vector3](../../com.aspose.threed/vector3) | Der Aufwärtsvektor der gemeinsamen Ebene der beiden Richtungen |

**Returns:**
double - innerer Winkel in Radiant
### clone() {#clone--}
```
public Vector3 clone()
```


Klone aktuelle Instanz

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### compareTo(Vector3 other) {#compareTo-com.aspose.threed.Vector3-}
```
public int compareTo(Vector3 other)
```


Vergleicht den aktuellen Vektor mit einer anderen Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
int
### copyFrom(Vector3 src) {#copyFrom-com.aspose.threed.Vector3-}
```
public void copyFrom(Vector3 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [Vector3](../../com.aspose.threed/vector3) |  |

### cos() {#cos--}
```
public Vector3 cos()
```


Berechnet den Kosinus jeder Komponente

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Calculated [Vector3](../../com.aspose.threed/vector3).
### create(Vector3 v) {#create-com.aspose.threed.Vector3-}
```
public static FVector3 create(Vector3 v)
```


Expliziter Konvertierungsoperator, um Vector3 nach FVector3 zu konvertieren

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### cross(Vector3 rhs) {#cross-com.aspose.threed.Vector3-}
```
public Vector3 cross(Vector3 rhs)
```


Kreuzprodukt von zwei Vektoren

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Rechter Handwert. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Cross product of two [Vector3](../../com.aspose.threed/vector3)s.
### div(Vector3 lhs, Vector3 rhs) {#div-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 div(Vector3 lhs, Vector3 rhs)
```


Operatorüberladung für /

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Der rechte Vektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### div(Vector3 lhs, double rhs) {#div-com.aspose.threed.Vector3-double-}
```
public static Vector3 div(Vector3 lhs, double rhs)
```


Operatorüberladung für /

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | double | Der rechte double-Wert |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### dot(Vector3 rhs) {#dot-com.aspose.threed.Vector3-}
```
public double dot(Vector3 rhs)
```


Gibt das Skalarprodukt von zwei Vektoren zurück

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Rechter Handwert. |

**Returns:**
double - Das Skalarprodukt der beiden Vektoren.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Prüft, ob zwei Vector3 gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Das Objekt zum Prüfen der Gleichheit. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### get(int idx) {#get-int-}
```
public double get(int idx)
```


Gibt die Komponente des Vektors nach Index zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int |  |

**Returns:**
double - Komponenten des Vektors nach Index.
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


Gibt die Länge dieses Vektors zurück.

**Returns:**
double - Die Länge dieses Vektors.
### getLength2() {#getLength2--}
```
public double getLength2()
```


Gibt das Quadrat der Länge zurück.

**Returns:**
double - Das Quadrat der Länge.
### getOne() {#getOne--}
```
public static Vector3 getOne()
```


Gibt den Einheitsvektor (1, 1, 1) zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - unit vector (1, 1, 1)
### getUnitX() {#getUnitX--}
```
public static Vector3 getUnitX()
```


Gibt den Einheitsvektor (1, 0, 0) zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - unit vector (1, 0, 0)
### getUnitY() {#getUnitY--}
```
public static Vector3 getUnitY()
```


Gibt den Einheitsvektor (0, 1, 0) zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - unit vector (0, 1, 0)
### getUnitZ() {#getUnitZ--}
```
public static Vector3 getUnitZ()
```


Gibt den Einheitsvektor (0, 0, 1) zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - unit vector (0, 0, 1)
### getZero() {#getZero--}
```
public static Vector3 getZero()
```


Gibt den Einheitsvektor (0, 0, 0) zurück.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - unit vector (0, 0, 0)
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode von Vector3 zurück.

**Returns:**
int - Der Hashcode des [Vector3](../../com.aspose.threed/vector3)
### mul(Vector3 lhs, Vector3 rhs) {#mul-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Vector3 lhs, Vector3 rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Der rechte Vektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### mul(Vector3 lhs, double rhs) {#mul-com.aspose.threed.Vector3-double-}
```
public static Vector3 mul(Vector3 lhs, double rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | double | Der rechte double-Wert |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### mul(double lhs, Vector3 rhs) {#mul-double-com.aspose.threed.Vector3-}
```
public static Vector3 mul(double lhs, Vector3 rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | double | Der linke Skalar |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Der rechte Vektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### negative(Vector3 v) {#negative-com.aspose.threed.Vector3-}
```
public static Vector3 negative(Vector3 v)
```


Operatorüberladung für -

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) | Der Ursprungvektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### normalize() {#normalize--}
```
public Vector3 normalize()
```


Normalisiert diese Instanz.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Normalized vector.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_eq(Vector3 lhs, Vector3 rhs) {#op-eq-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static boolean op_eq(Vector3 lhs, Vector3 rhs)
```


Gleichheitsoperator für Vector3

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Linker Handwert. |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Rechter Handwert. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### op_ne(Vector3 lhs, Vector3 rhs) {#op-ne-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static boolean op_ne(Vector3 lhs, Vector3 rhs)
```


Ungleichheitsoperator für Vector3

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Linker Handwert. |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Rechter Handwert. |

**Returns:**
boolean - Wahr, wenn zwei Vektoren nicht gleich sind.
### set(double newX, double newY, double newZ) {#set-double-double-double-}
```
public void set(double newX, double newY, double newZ)
```


Setzt die x/y/z-Komponente in einem Aufruf.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newX | double | Die x‑Komponente. |
| newY | double | Die y‑Komponente. |
| newZ | double | Die z‑Komponente. |

### set(int idx, double value) {#set-int-double-}
```
public void set(int idx, double value)
```


Setzt die Komponente des Vektors per Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | int |  |
| Wert | double | Neuer Wert |

### sin() {#sin--}
```
public Vector3 sin()
```


Berechnet den Sinus jeder Komponente.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Calculated [Vector3](../../com.aspose.threed/vector3).
### sub(Vector3 lhs, Vector3 rhs) {#sub-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 sub(Vector3 lhs, Vector3 rhs)
```


Operatorüberladung für - (Minus)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Der linke Vektor |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Der rechte Vektor |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### toString() {#toString--}
```
public String toString()
```


Gibt einen java.lang.String zurück, der das aktuelle [Vector3](../../com.aspose.threed/vector3) darstellt.

**Returns:**
java.lang.String - Ein java.lang.String, der das aktuelle [Vector3](../../com.aspose.threed/vector3) repräsentiert.
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

