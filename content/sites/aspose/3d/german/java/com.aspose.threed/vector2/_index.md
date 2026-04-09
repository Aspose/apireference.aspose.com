---
title: Vector2
second_title: Aspose.3D für Java API-Referenz
description: Ein Vektor mit zwei Komponenten.
type: docs
weight: 201
url: /de/java/com.aspose.threed/vector2/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.threed.Struct, java.io.Serializable
```
public final class Vector2 implements Comparable<Vector2>, Struct<Vector2>, Serializable
```

Ein Vektor mit zwei Komponenten.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Vector2(double s)](#Vector2-double-) | Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2). |
| [Vector2(Vector3 s)](#Vector2-com.aspose.threed.Vector3-) | Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2). |
| [Vector2(FVector2 vec)](#Vector2-com.aspose.threed.FVector2-) | Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2). |
| [Vector2(double x, double y)](#Vector2-double-double-) | Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2). |
| [Vector2()](#Vector2--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(Vector2 lhs, Vector2 rhs)](#add-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Additionsoperator für Vector2 |
| [clone()](#clone--) |  |
| [compareTo(Vector2 other)](#compareTo-com.aspose.threed.Vector2-) | Vergleicht den aktuellen Vektor mit einer anderen Instanz. |
| [copyFrom(Vector2 src)](#copyFrom-com.aspose.threed.Vector2-) |  |
| [create(Vector2 v)](#create-com.aspose.threed.Vector2-) | Expliziter Konvertierungsoperator, um Vector2 in FVector2 zu casten |
| [cross(Vector2 v)](#cross-com.aspose.threed.Vector2-) | Kreuzprodukt von zwei Vektoren |
| [div(Vector2 lhs, double rhs)](#div-com.aspose.threed.Vector2-double-) | Divisionsoperator für Vector2 |
| [dot(Vector2 rhs)](#dot-com.aspose.threed.Vector2-) | Gibt das Skalarprodukt von zwei Vektoren zurück |
| [equals(Vector2 rhs)](#equals-com.aspose.threed.Vector2-) | Überprüfen, ob zwei Vector2 gleich sind |
| [equals(Object obj)](#equals-java.lang.Object-) | Überprüfen, ob zwei Vector2 gleich sind |
| [getClass()](#getClass--) |  |
| [getLength()](#getLength--) | Gibt die Länge zurück. |
| [getU()](#getU--) | Gibt die U-Komponente zurück, wenn die [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. |
| [getV()](#getV--) | Gibt die V-Komponente zurück, wenn die [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. |
| [hashCode()](#hashCode--) | Gibt den Hashcode von Vector2 zurück |
| [mul(Vector2 lhs, double rhs)](#mul-com.aspose.threed.Vector2-double-) | Multiplikationsoperator für Vector2 |
| [mul(double lhs, Vector2 rhs)](#mul-double-com.aspose.threed.Vector2-) | Multiplikationsoperator für Vector2 |
| [normalize()](#normalize--) | Normalisiert diese Instanz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_eq(Vector2 lhs, Vector2 rhs)](#op-eq-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Gleichheitsoperator für Vector2 |
| [op_ne(Vector2 lhs, Vector2 rhs)](#op-ne-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Ungleichheitsoperator für Vector2 |
| [setU(double value)](#setU-double-) | Setzt die U-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. |
| [setV(double value)](#setV-double-) | Setzt die V-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. |
| [sub(Vector2 lhs, Vector2 rhs)](#sub-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Subtraktionsoperator für Vector2 |
| [toString()](#toString--) | Gibt einen java.lang.String zurück, der das aktuelle [Vector2](../../com.aspose.threed/vector2) darstellt. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Vector2(double s) {#Vector2-double-}
```
public Vector2(double s)
```


Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | double | S. |

### Vector2(Vector3 s) {#Vector2-com.aspose.threed.Vector3-}
```
public Vector2(Vector3 s)
```


Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | [Vector3](../../com.aspose.threed/vector3) | S. |

### Vector2(FVector2 vec) {#Vector2-com.aspose.threed.FVector2-}
```
public Vector2(FVector2 vec)
```


Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [FVector2](../../com.aspose.threed/fvector2) | Vektor in float. |

### Vector2(double x, double y) {#Vector2-double-double-}
```
public Vector2(double x, double y)
```


Initialisiert eine neue Instanz der Struktur [Vector2](../../com.aspose.threed/vector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Koordinate. |
| y | double | Die y-Koordinate. |

### Vector2() {#Vector2--}
```
public Vector2()
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

### add(Vector2 lhs, Vector2 rhs) {#add-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static Vector2 add(Vector2 lhs, Vector2 rhs)
```


Additionsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of addition.
### clone() {#clone--}
```
public Vector2 clone()
```


Klone aktuelle Instanz

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### compareTo(Vector2 other) {#compareTo-com.aspose.threed.Vector2-}
```
public int compareTo(Vector2 other)
```


Vergleicht den aktuellen Vektor mit einer anderen Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
int
### copyFrom(Vector2 src) {#copyFrom-com.aspose.threed.Vector2-}
```
public void copyFrom(Vector2 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [Vector2](../../com.aspose.threed/vector2) |  |

### create(Vector2 v) {#create-com.aspose.threed.Vector2-}
```
public static FVector2 create(Vector2 v)
```


Expliziter Konvertierungsoperator, um Vector2 in FVector2 zu casten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2)
### cross(Vector2 v) {#cross-com.aspose.threed.Vector2-}
```
public double cross(Vector2 v)
```


Kreuzprodukt von zwei Vektoren

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
double
### div(Vector2 lhs, double rhs) {#div-com.aspose.threed.Vector2-double-}
```
public static Vector2 div(Vector2 lhs, double rhs)
```


Divisionsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | double | Rechter Handwert. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of division.
### dot(Vector2 rhs) {#dot-com.aspose.threed.Vector2-}
```
public double dot(Vector2 rhs)
```


Gibt das Skalarprodukt von zwei Vektoren zurück

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
double - Das Skalarprodukt der beiden Vektoren.
### equals(Vector2 rhs) {#equals-com.aspose.threed.Vector2-}
```
public boolean equals(Vector2 rhs)
```


Überprüfen, ob zwei Vector2 gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Der Wert der rechten Seite. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Überprüfen, ob zwei Vector2 gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Das zu vergleichende Objekt. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
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


Gibt die Länge zurück.

**Returns:**
double - die Länge.
### getU() {#getU--}
```
public double getU()
```


Liest die U-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der x-Komponente.

**Returns:**
double - die U-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der x-Komponente.
### getV() {#getV--}
```
public double getV()
```


Liest die V-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der y-Komponente.

**Returns:**
double - die V-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der y-Komponente.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode von Vector2 zurück

**Returns:**
int - Der Hashcode des [Vector2](../../com.aspose.threed/vector2)
### mul(Vector2 lhs, double rhs) {#mul-com.aspose.threed.Vector2-double-}
```
public static Vector2 mul(Vector2 lhs, double rhs)
```


Multiplikationsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | double | Rechter Handwert. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of multiply.
### mul(double lhs, Vector2 rhs) {#mul-double-com.aspose.threed.Vector2-}
```
public static Vector2 mul(double lhs, Vector2 rhs)
```


Multiplikationsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | double | Linker Handwert. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of multiply.
### normalize() {#normalize--}
```
public Vector2 normalize()
```


Normalisiert diese Instanz.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - Normalized vector.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_eq(Vector2 lhs, Vector2 rhs) {#op-eq-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static boolean op_eq(Vector2 lhs, Vector2 rhs)
```


Gleichheitsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
boolean - Wahr, wenn alle Komponenten identisch gleich sind.
### op_ne(Vector2 lhs, Vector2 rhs) {#op-ne-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static boolean op_ne(Vector2 lhs, Vector2 rhs)
```


Ungleichheitsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
boolean - Wahr, wenn zwei Vektoren nicht gleich sind.
### setU(double value) {#setU-double-}
```
public void setU(double value)
```


Setzt die U-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der x-Komponente.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setV(double value) {#setV-double-}
```
public void setV(double value)
```


Setzt die V-Komponente, wenn das [Vector2](../../com.aspose.threed/vector2) als Mapping-Koordinate verwendet wird. Es ist ein Alias der y-Komponente.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### sub(Vector2 lhs, Vector2 rhs) {#sub-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static Vector2 sub(Vector2 lhs, Vector2 rhs)
```


Subtraktionsoperator für Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Linker Handwert. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Rechter Handwert. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of substraction.
### toString() {#toString--}
```
public String toString()
```


Gibt einen java.lang.String zurück, der das aktuelle [Vector2](../../com.aspose.threed/vector2) darstellt.

**Returns:**
java.lang.String - Ein java.lang.String, der das aktuelle [Vector2](../../com.aspose.threed/vector2) darstellt.
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

