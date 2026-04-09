---
title: EndPoint
second_title: Aspose.3D für Java API-Referenz
description: Der Endpunkt zum Trimmen der Kurve kann ein Parameterwert oder ein kartesischer Punkt sein.
type: docs
weight: 51
url: /de/java/com.aspose.threed/endpoint/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class EndPoint implements Struct<EndPoint>, Serializable
```

Der Endpunkt zum Trimmen der Kurve, kann ein Parameterwert oder ein kartesischer Punkt sein.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [EndPoint(Vector3 point)](#EndPoint-com.aspose.threed.Vector3-) | Erzeugen Sie ein [EndPoint](../../com.aspose.threed/endpoint) aus einem kartesischen Punkt. |
| [EndPoint(double v)](#EndPoint-double-) | Erzeugen Sie ein [EndPoint](../../com.aspose.threed/endpoint) aus einem reellen Parameter. |
| [EndPoint()](#EndPoint--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [copyFrom(EndPoint src)](#copyFrom-com.aspose.threed.EndPoint-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [fromDegree(double degree)](#fromDegree-double-) | Erstellen Sie einen Endpunkt, gemessen in Grad. |
| [fromRadian(double degree)](#fromRadian-double-) | Erstellen Sie einen Endpunkt, gemessen in Bogenmaß. |
| [getAsPoint()](#getAsPoint--) | Gibt den Endpunkt als kartesischen Punkt zurück oder wirft eine Ausnahme. |
| [getAsValue()](#getAsValue--) | Gibt den Endpunkt als reellen Parameter zurück oder wirft eine Ausnahme. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isCartesianPoint()](#isCartesianPoint--) | Ist der Endpunkt ein kartesischer Punkt? |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Gibt eine Zeichenkettenrepräsentation des aktuellen Endpunkts zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EndPoint(Vector3 point) {#EndPoint-com.aspose.threed.Vector3-}
```
public EndPoint(Vector3 point)
```


Erzeugen Sie ein [EndPoint](../../com.aspose.threed/endpoint) aus einem kartesischen Punkt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| point | [Vector3](../../com.aspose.threed/vector3) | Punkt zum Erzeugen |

### EndPoint(double v) {#EndPoint-double-}
```
public EndPoint(double v)
```


Erzeugen Sie ein [EndPoint](../../com.aspose.threed/endpoint) aus einem reellen Parameter.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | double | Der reelle Zahlenparameter zum Erzeugen eines Endpunkts |

### EndPoint() {#EndPoint--}
```
public EndPoint()
```


### clone() {#clone--}
```
public EndPoint clone()
```


Klone aktuelle Instanz

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint)
### copyFrom(EndPoint src) {#copyFrom-com.aspose.threed.EndPoint-}
```
public void copyFrom(EndPoint src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [EndPoint](../../com.aspose.threed/endpoint) |  |

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
### fromDegree(double degree) {#fromDegree-double-}
```
public static EndPoint fromDegree(double degree)
```


Erstellen Sie einen Endpunkt, gemessen in Grad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Grad | double | Der Wert in Grad |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - An end point constructed from degree
### fromRadian(double degree) {#fromRadian-double-}
```
public static EndPoint fromRadian(double degree)
```


Erstellen Sie einen Endpunkt, gemessen in Bogenmaß.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Grad | double | Der Wert im Bogenmaß |

**Returns:**
[EndPoint](../../com.aspose.threed/endpoint) - An end point constructed from radian
### getAsPoint() {#getAsPoint--}
```
public Vector3 getAsPoint()
```


Gibt den Endpunkt als kartesischen Punkt zurück oder wirft eine Ausnahme.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the end point as Cartesian point, or thrown an exception.
### getAsValue() {#getAsValue--}
```
public double getAsValue()
```


Gibt den Endpunkt als reellen Parameter zurück oder wirft eine Ausnahme.

**Returns:**
double – der Endpunkt als reeller Parameter oder wirft eine Ausnahme.
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




**Returns:**
int
### isCartesianPoint() {#isCartesianPoint--}
```
public boolean isCartesianPoint()
```


Ist der Endpunkt ein kartesischer Punkt?

**Returns:**
boolean – Ist der Endpunkt ein kartesischer Punkt?
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


Gibt eine Zeichenkettenrepräsentation des aktuellen Endpunkts zurück.

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

