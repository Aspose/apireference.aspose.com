---
title: FVector3
second_title: Aspose.3D für Java API-Referenz
description: Ein Float-Vektor mit drei Komponenten.
type: docs
weight: 60
url: /de/java/com.aspose.threed/fvector3/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class FVector3 implements Struct<FVector3>, Serializable
```

Ein Float-Vektor mit drei Komponenten.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FVector3(float x, float y, float z)](#FVector3-float-float-float-) | Initialisiert eine neue Instanz von [FVector3](../../com.aspose.threed/fvector3). |
| [FVector3(Vector3 vec)](#FVector3-com.aspose.threed.Vector3-) | Initialisiert eine neue Instanz von [FVector3](../../com.aspose.threed/fvector3). |
| [FVector3(Vector4 vec)](#FVector3-com.aspose.threed.Vector4-) | Initialisiert eine neue Instanz von [FVector4](../../com.aspose.threed/fvector4). |
| [FVector3()](#FVector3--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [x](#x) | Die x‑Komponente. |
| [y](#y) | Die y‑Komponente. |
| [z](#z) | Die y‑Komponente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(FVector3 a, FVector3 b)](#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \+ Operatorüberladung |
| [clone()](#clone--) |  |
| [copyFrom(FVector3 src)](#copyFrom-com.aspose.threed.FVector3-) |  |
| [create(FVector3 v)](#create-com.aspose.threed.FVector3-) | Expliziter Konvertierungsoperator, um FVector3 in Vector3 zu casten |
| [cross(FVector3 rhs)](#cross-com.aspose.threed.FVector3-) | Kreuzprodukt von zwei Vektoren |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOne()](#getOne--) | Der Einheitsskalenvektor, bei dem alle Komponenten 1 sind |
| [getZero()](#getZero--) | Der Nullvektor. |
| [hashCode()](#hashCode--) |  |
| [mul(FVector3 a, float b)](#mul-com.aspose.threed.FVector3-float-) | \* Operatorüberladung |
| [negative(FVector3 a)](#negative-com.aspose.threed.FVector3-) | \- Operatorüberladung |
| [normalize()](#normalize--) | Normalisiert diese Instanz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [sub(FVector3 a, FVector3 b)](#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \- Operatorüberladung |
| [toString()](#toString--) | Gibt eine Zeichenkette zurück, die das [FVector3](../../com.aspose.threed/fvector3) darstellt |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FVector3(float x, float y, float z) {#FVector3-float-float-float-}
```
public FVector3(float x, float y, float z)
```


Initialisiert eine neue Instanz von [FVector3](../../com.aspose.threed/fvector3).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Komponente des Vektors |
| y | float | Y-Komponente des Vektors |
| z | float | Z-Komponente des Vektors |

### FVector3(Vector3 vec) {#FVector3-com.aspose.threed.Vector3-}
```
public FVector3(Vector3 vec)
```


Initialisiert eine neue Instanz von [FVector3](../../com.aspose.threed/fvector3).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vector3 im double-Typ |

### FVector3(Vector4 vec) {#FVector3-com.aspose.threed.Vector4-}
```
public FVector3(Vector4 vec)
```


Initialisiert eine neue Instanz von [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vec | [Vector4](../../com.aspose.threed/vector4) | Vector4 im double-Typ |

### FVector3() {#FVector3--}
```
public FVector3()
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

### z {#z}
```
public float z
```


Die y‑Komponente.

### add(FVector3 a, FVector3 b) {#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 add(FVector3 a, FVector3 b)
```


\+ Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | Erster Vektor |
| b | [FVector3](../../com.aspose.threed/fvector3) | Zweiter Vektor |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### clone() {#clone--}
```
public FVector3 clone()
```


Klone aktuelle Instanz

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### copyFrom(FVector3 src) {#copyFrom-com.aspose.threed.FVector3-}
```
public void copyFrom(FVector3 src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [FVector3](../../com.aspose.threed/fvector3) |  |

### create(FVector3 v) {#create-com.aspose.threed.FVector3-}
```
public static Vector3 create(FVector3 v)
```


Expliziter Konvertierungsoperator, um FVector3 in Vector3 zu casten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [FVector3](../../com.aspose.threed/fvector3) | Vector3 im float-Typ |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### cross(FVector3 rhs) {#cross-com.aspose.threed.FVector3-}
```
public FVector3 cross(FVector3 rhs)
```


Kreuzprodukt von zwei Vektoren

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rhs | [FVector3](../../com.aspose.threed/fvector3) | Rechter Handwert. |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Cross product of two [FVector3](../../com.aspose.threed/fvector3)s.
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
### getOne() {#getOne--}
```
public static FVector3 getOne()
```


Der Einheitsskalenvektor, bei dem alle Komponenten 1 sind

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The unit scale vector with all components are all 1
### getZero() {#getZero--}
```
public static FVector3 getZero()
```


Der Nullvektor.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The Zero vector.
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### mul(FVector3 a, float b) {#mul-com.aspose.threed.FVector3-float-}
```
public static FVector3 mul(FVector3 a, float b)
```


\* Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | Erster Vektor |
| b | float | Zweiter Vektor |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The product of two vectors
### negative(FVector3 a) {#negative-com.aspose.threed.FVector3-}
```
public static FVector3 negative(FVector3 a)
```


\- Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | Eingabevektor |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The negative vector
### normalize() {#normalize--}
```
public FVector3 normalize()
```


Normalisiert diese Instanz.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Normalized vector.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### sub(FVector3 a, FVector3 b) {#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 sub(FVector3 a, FVector3 b)
```


\- Operatorüberladung

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | Erster Vektor |
| b | [FVector3](../../com.aspose.threed/fvector3) | Zweiter Vektor |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The difference of two vectors
### toString() {#toString--}
```
public String toString()
```


Gibt eine Zeichenkette zurück, die das [FVector3](../../com.aspose.threed/fvector3) darstellt

**Returns:**
java.lang.String - Zeichenkettenrepräsentation dieses Vektors.
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

