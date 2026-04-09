---
title: BoundingBox2D
second_title: Aspose.3D für Java API-Referenz
description: Die achsenorientierte Begrenzungsbox für
type: docs
weight: 25
url: /de/java/com.aspose.threed/boundingbox2d/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class BoundingBox2D implements Struct<BoundingBox2D>, Serializable
```

Die achsenorientierte Begrenzungsbox für [Vector2](../../com.aspose.threed/vector2)
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [BoundingBox2D(Vector2 minimum, Vector2 maximum)](#BoundingBox2D-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten |
| [BoundingBox2D()](#BoundingBox2D--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [INFINITE](#INFINITE) | Die unendliche Begrenzungsbox |
| [NULL](#NULL) | Die Null-Begrenzungsbox |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [copyFrom(BoundingBox2D src)](#copyFrom-com.aspose.threed.BoundingBox2D-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getExtent()](#getExtent--) | Gibt den Umfang der Begrenzungsbox zurück. |
| [getMaximum()](#getMaximum--) | Der maximale Eckpunkt der Begrenzungsbox |
| [getMinimum()](#getMinimum--) | Der minimale Eckpunkt der Begrenzungsbox |
| [hashCode()](#hashCode--) |  |
| [merge(BoundingBox2D bb)](#merge-com.aspose.threed.BoundingBox2D-) | Fügt die neue Box in die aktuelle Begrenzungsbox ein. |
| [merge(Vector2 pt)](#merge-com.aspose.threed.Vector2-) | Fügt die neue Box in die aktuelle Begrenzungsbox ein. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Gibt die Zeichenkettenrepräsentation der Begrenzungsbox zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BoundingBox2D(Vector2 minimum, Vector2 maximum) {#BoundingBox2D-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public BoundingBox2D(Vector2 minimum, Vector2 maximum)
```


Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| minimum | [Vector2](../../com.aspose.threed/vector2) | Der minimale Eckpunkt |
| maximum | [Vector2](../../com.aspose.threed/vector2) | Der maximale Eckpunkt |

### BoundingBox2D() {#BoundingBox2D--}
```
public BoundingBox2D()
```


### INFINITE {#INFINITE}
```
public static final BoundingBox2D INFINITE
```


Die unendliche Begrenzungsbox

### NULL {#NULL}
```
public static final BoundingBox2D NULL
```


Die Null-Begrenzungsbox

### clone() {#clone--}
```
public BoundingBox2D clone()
```


Klone aktuelle Instanz

**Returns:**
[BoundingBox2D](../../com.aspose.threed/boundingbox2d)
### copyFrom(BoundingBox2D src) {#copyFrom-com.aspose.threed.BoundingBox2D-}
```
public void copyFrom(BoundingBox2D src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [BoundingBox2D](../../com.aspose.threed/boundingbox2d) |  |

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
### getExtent() {#getExtent--}
```
public BoundingBoxExtent getExtent()
```


Gibt den Umfang der Begrenzungsbox zurück.

**Returns:**
[BoundingBoxExtent](../../com.aspose.threed/boundingboxextent) - the extent of the bounding box.
### getMaximum() {#getMaximum--}
```
public Vector2 getMaximum()
```


Der maximale Eckpunkt der Begrenzungsbox

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The maximum corner of the bounding box
### getMinimum() {#getMinimum--}
```
public Vector2 getMinimum()
```


Der minimale Eckpunkt der Begrenzungsbox

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The minimum corner of the bounding box
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### merge(BoundingBox2D bb) {#merge-com.aspose.threed.BoundingBox2D-}
```
public void merge(BoundingBox2D bb)
```


Fügt die neue Box in die aktuelle Begrenzungsbox ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bb | [BoundingBox2D](../../com.aspose.threed/boundingbox2d) | Die zu zusammenzufügende Begrenzungsbox |

### merge(Vector2 pt) {#merge-com.aspose.threed.Vector2-}
```
public void merge(Vector2 pt)
```


Fügt die neue Box in die aktuelle Begrenzungsbox ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pt | [Vector2](../../com.aspose.threed/vector2) | Der zusammenzufügende Punkt |

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


Gibt die Zeichenkettenrepräsentation der Begrenzungsbox zurück.

**Returns:**
java.lang.String
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

