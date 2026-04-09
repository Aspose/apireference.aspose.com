---
title: Vector4
second_title: Aspose.3D für Java API-Referenz
description: Ein Vektor mit vier Komponenten.
type: docs
weight: 203
url: /de/java/com.aspose.threed/vector4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.threed.Struct, java.io.Serializable
```
public final class Vector4 implements Comparable<Vector4>, Struct<Vector4>, Serializable
```

Ein Vektor mit vier Komponenten.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Vector4(Vector3 vec, double w)](#Vector4-com.aspose.threed.Vector3-double-) | Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur. |
| [Vector4(Vector3 vec)](#Vector4-com.aspose.threed.Vector3-) | Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur. |
| [Vector4(FVector4 vec)](#Vector4-com.aspose.threed.FVector4-) | Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur. |
| [Vector4(double x, double y, double z)](#Vector4-double-double-double-) | Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur. |
| [Vector4(double x, double y, double z, double w)](#Vector4-double-double-double-double-) | Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur. |
| [Vector4()](#Vector4--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [w](#w) | Die w‑Komponente. |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
| [z](#z) | Die z‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(Vector4 lhs, Vector4 rhs)](#add-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operatorüberladung für + |
| [clone()](#clone--) |  |
| [compareTo(Vector4 other)](#compareTo-com.aspose.threed.Vector4-) | Vergleicht den aktuellen Vektor mit einer anderen Instanz. |
| [copyFrom(Vector4 src)](#copyFrom-com.aspose.threed.Vector4-) |  |
| [create(Vector4 v)](#create-com.aspose.threed.Vector4-) | Expliziter Konvertierungsoperator, um Vector4 in FVector4 zu casten |
| [equals(Object obj)](#equals-java.lang.Object-) | Prüfen, ob zwei Vektoren gleich sind |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Liefert den Hashcode dieses Vektors |
| [mul(Vector4 lhs, Vector4 rhs)](#mul-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operatorüberladung für \* |
| [mul(Vector4 lhs, double rhs)](#mul-com.aspose.threed.Vector4-double-) | Operatorüberladung für \* |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [set(double newX, double newY, double newZ)](#set-double-double-double-) | Setzt die xyz-Komponenten des Vektors gleichzeitig, w wird auf 1 gesetzt. |
| [set(double newX, double newY, double newZ, double newW)](#set-double-double-double-double-) | Setzt alle Komponenten des Vektors gleichzeitig. |
| [sub(Vector4 lhs, Vector4 rhs)](#sub-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operatorüberladung für - (Minus) |
| [toString()](#toString--) | Gibt einen java.lang.String zurück, der das aktuelle [Vector4](../../com.aspose.threed/vector4) repräsentiert. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Vector4(Vector3 vec, double w) {#Vector4-com.aspose.threed.Vector3-double-}
```
public Vector4(Vector3 vec, double w)
```


Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vektor. |
| w | double | Die Breite. |

### Vector4(Vector3 vec) {#Vector4-com.aspose.threed.Vector3-}
```
public Vector4(Vector3 vec)
```


Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vektor. |

### Vector4(FVector4 vec) {#Vector4-com.aspose.threed.FVector4-}
```
public Vector4(FVector4 vec)
```


Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [FVector4](../../com.aspose.threed/fvector4) | Vektor. |

### Vector4(double x, double y, double z) {#Vector4-double-double-double-}
```
public Vector4(double x, double y, double z)
```


Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Koordinate. |
| y | double | Die y-Koordinate. |
| z | double | Die z-Koordinate. |

### Vector4(double x, double y, double z, double w) {#Vector4-double-double-double-double-}
```
public Vector4(double x, double y, double z, double w)
```


Initialisiert eine neue Instanz der [Vector4](../../com.aspose.threed/vector4)-Struktur.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x-Koordinate. |
| y | double | Die y-Koordinate. |
| z | double | Die z-Koordinate. |
| w | double | Die Breite. |

### Vector4() {#Vector4--}
```
public Vector4()
```


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

### add(Vector4 lhs, Vector4 rhs) {#add-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 add(Vector4 lhs, Vector4 rhs)
```


Operatorüberladung für +

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | Der linke Vektor |
| rhs | [Vector4](../../com.aspose.threed/vector4) | Der rechte Vektor |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### clone() {#clone--}
```
public Vector4 clone()
```


Klone aktuelle Instanz

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### compareTo(Vector4 other) {#compareTo-com.aspose.threed.Vector4-}
```
public int compareTo(Vector4 other)
```


Vergleicht den aktuellen Vektor mit einer anderen Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | [Vector4](../../com.aspose.threed/vector4) |  |

**Returns:**
int
### copyFrom(Vector4 src) {#copyFrom-com.aspose.threed.Vector4-}
```
public void copyFrom(Vector4 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [Vector4](../../com.aspose.threed/vector4) |  |

### create(Vector4 v) {#create-com.aspose.threed.Vector4-}
```
public static FVector4 create(Vector4 v)
```


Expliziter Konvertierungsoperator, um Vector4 in FVector4 zu casten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector4](../../com.aspose.threed/vector4) |  |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Prüfen, ob zwei Vektoren gleich sind

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
### hashCode() {#hashCode--}
```
public int hashCode()
```


Liefert den Hashcode dieses Vektors

**Returns:**
int
### mul(Vector4 lhs, Vector4 rhs) {#mul-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Vector4 lhs, Vector4 rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | Der linke Vektor |
| rhs | [Vector4](../../com.aspose.threed/vector4) | Der rechte Vektor |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### mul(Vector4 lhs, double rhs) {#mul-com.aspose.threed.Vector4-double-}
```
public static Vector4 mul(Vector4 lhs, double rhs)
```


Operatorüberladung für \*

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | Der linke Vektor |
| rhs | double | Der rechte double-Wert |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### set(double newX, double newY, double newZ) {#set-double-double-double-}
```
public void set(double newX, double newY, double newZ)
```


Setzt die xyz-Komponenten des Vektors gleichzeitig, w wird auf 1 gesetzt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newX | double | Neue X-Komponente. |
| newY | double | Neue Y-Komponente. |
| newZ | double | Neue Z-Komponente. |

### set(double newX, double newY, double newZ, double newW) {#set-double-double-double-double-}
```
public void set(double newX, double newY, double newZ, double newW)
```


Setzt alle Komponenten des Vektors gleichzeitig.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newX | double | Neue X-Komponente. |
| newY | double | Neue Y-Komponente. |
| newZ | double | Neue Z-Komponente. |
| newW | double | Neue W-Komponente. |

### sub(Vector4 lhs, Vector4 rhs) {#sub-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 sub(Vector4 lhs, Vector4 rhs)
```


Operatorüberladung für - (Minus)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | Der linke Vektor |
| rhs | [Vector4](../../com.aspose.threed/vector4) | Der rechte Vektor |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### toString() {#toString--}
```
public String toString()
```


Gibt einen java.lang.String zurück, der das aktuelle [Vector4](../../com.aspose.threed/vector4) repräsentiert.

**Returns:**
java.lang.String - Ein java.lang.String, der den aktuellen [Vector4](../../com.aspose.threed/vector4) darstellt.
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

