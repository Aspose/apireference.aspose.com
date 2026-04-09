---
title: FVector2
second_title: Aspose.3D für Java API-Referenz
description: Ein Float-Vektor mit zwei Komponenten.
type: docs
weight: 59
url: /de/java/com.aspose.threed/fvector2/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class FVector2 implements Struct<FVector2>, Serializable
```

Ein Float-Vektor mit zwei Komponenten.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FVector2(float x, float y)](#FVector2-float-float-) | Initialisiert eine neue Instanz von [FVector2](../../com.aspose.threed/fvector2). |
| [FVector2(Vector2 vec)](#FVector2-com.aspose.threed.Vector2-) | Initialisiert eine neue Instanz von [FVector2](../../com.aspose.threed/fvector2). |
| [FVector2()](#FVector2--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(FVector2 a, FVector2 b)](#add-com.aspose.threed.FVector2-com.aspose.threed.FVector2-) | \+ Operatorüberladung |
| [clone()](#clone--) |  |
| [copyFrom(FVector2 src)](#copyFrom-com.aspose.threed.FVector2-) |  |
| [create(FVector2 v)](#create-com.aspose.threed.FVector2-) | Expliziter Konvertierungsoperator zum Umwandeln von FVector2 nach Vector2 |
| [equals(FVector2 rhs)](#equals-com.aspose.threed.FVector2-) | Prüfen, ob zwei Vektoren gleich sind |
| [equals(Object obj)](#equals-java.lang.Object-) | Prüfen, ob zwei Vektoren gleich sind |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Gibt den Hashcode dieser Instanz zurück |
| [mul(FVector2 a, float b)](#mul-com.aspose.threed.FVector2-float-) | \* Operatorüberladung |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_eq(FVector2 a, FVector2 b)](#op-eq-com.aspose.threed.FVector2-com.aspose.threed.FVector2-) | == Operatorüberladung |
| [op_ne(FVector2 a, FVector2 b)](#op-ne-com.aspose.threed.FVector2-com.aspose.threed.FVector2-) | != Operatorüberladung |
| [sub(FVector2 a, FVector2 b)](#sub-com.aspose.threed.FVector2-com.aspose.threed.FVector2-) | \- Operatorüberladung |
| [toString()](#toString--) | Gibt einen String zurück, der das [FVector2](../../com.aspose.threed/fvector2) darstellt |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FVector2(float x, float y) {#FVector2-float-float-}
```
public FVector2(float x, float y)
```


Initialisiert eine neue Instanz von [FVector2](../../com.aspose.threed/fvector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Komponente des Vektors |
| y | float | Y-Komponente des Vektors |

### FVector2(Vector2 vec) {#FVector2-com.aspose.threed.Vector2-}
```
public FVector2(Vector2 vec)
```


Initialisiert eine neue Instanz von [FVector2](../../com.aspose.threed/fvector2).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [Vector2](../../com.aspose.threed/vector2) | Vector2 im Double‑Typ |

### FVector2() {#FVector2--}
```
public FVector2()
```


### x {#x}
```
public float x
```


Die x‑Komponente.

### y {#y}
```
public float y
```


Die y‑Komponente.

### add(FVector2 a, FVector2 b) {#add-com.aspose.threed.FVector2-com.aspose.threed.FVector2-}
```
public static FVector2 add(FVector2 a, FVector2 b)
```


\+ Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector2](../../com.aspose.threed/fvector2) | Erster Vektor |
| b | [FVector2](../../com.aspose.threed/fvector2) | Zweiter Vektor |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - The sum of two vectors.
### clone() {#clone--}
```
public FVector2 clone()
```


Klone aktuelle Instanz

**Returns:**
[FVector2](../../com.aspose.threed/fvector2)
### copyFrom(FVector2 src) {#copyFrom-com.aspose.threed.FVector2-}
```
public void copyFrom(FVector2 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [FVector2](../../com.aspose.threed/fvector2) |  |

### create(FVector2 v) {#create-com.aspose.threed.FVector2-}
```
public static Vector2 create(FVector2 v)
```


Expliziter Konvertierungsoperator zum Umwandeln von FVector2 nach Vector2

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [FVector2](../../com.aspose.threed/fvector2) | Vector 2 im Float‑Typ. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### equals(FVector2 rhs) {#equals-com.aspose.threed.FVector2-}
```
public boolean equals(FVector2 rhs)
```


Prüfen, ob zwei Vektoren gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [FVector2](../../com.aspose.threed/fvector2) |  |

**Returns:**
boolean - Wahr, wenn alle Komponenten gleich sind.
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
boolean - Wahr, wenn die Eingabe ein Vektor ist und alle Komponenten gleich sind.
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


Gibt den Hashcode dieser Instanz zurück

**Returns:**
int - Der Hashcode des Vektors.
### mul(FVector2 a, float b) {#mul-com.aspose.threed.FVector2-float-}
```
public static FVector2 mul(FVector2 a, float b)
```


\* Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector2](../../com.aspose.threed/fvector2) | Erster Vektor |
| b | float | Zweiter Vektor |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - The product of two vectors.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_eq(FVector2 a, FVector2 b) {#op-eq-com.aspose.threed.FVector2-com.aspose.threed.FVector2-}
```
public static boolean op_eq(FVector2 a, FVector2 b)
```


== Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector2](../../com.aspose.threed/fvector2) | Erster Vektor |
| b | [FVector2](../../com.aspose.threed/fvector2) | Zweiter Vektor |

**Returns:**
boolean - Wahr, wenn alle Komponenten gleich sind.
### op_ne(FVector2 a, FVector2 b) {#op-ne-com.aspose.threed.FVector2-com.aspose.threed.FVector2-}
```
public static boolean op_ne(FVector2 a, FVector2 b)
```


!= Operator overloading

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector2](../../com.aspose.threed/fvector2) | Erster Vektor |
| b | [FVector2](../../com.aspose.threed/fvector2) | Zweiter Vektor |

**Returns:**
boolean - Wahr, wenn irgendeine Komponente unterschiedlich ist.
### sub(FVector2 a, FVector2 b) {#sub-com.aspose.threed.FVector2-com.aspose.threed.FVector2-}
```
public static FVector2 sub(FVector2 a, FVector2 b)
```


\- Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector2](../../com.aspose.threed/fvector2) | Erster Vektor |
| b | [FVector2](../../com.aspose.threed/fvector2) | Zweiter Vektor |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - The difference of two vectors.
### toString() {#toString--}
```
public String toString()
```


Gibt einen String zurück, der das [FVector2](../../com.aspose.threed/fvector2) darstellt

**Returns:**
java.lang.String - String‑Darstellung des aktuellen Vektors.
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

