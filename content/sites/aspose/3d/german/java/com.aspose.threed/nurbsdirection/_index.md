---
title: NurbsDirection
second_title: Aspose.3D für Java API-Referenz
description: Ein 3D  hat zwei Richtungen, die  und  die  definiert Daten für jede Richtung.
type: docs
weight: 113
url: /de/java/com.aspose.threed/nurbsdirection/
---

**Inheritance:**
java.lang.Object
```
public class NurbsDirection
```

Ein 3D [NurbsSurface](../../com.aspose.threed/nurbssurface) hat zwei Richtungen, die [NurbsSurface.getU](../../com.aspose.threed/nurbssurface\#getU) und [NurbsSurface.getV](../../com.aspose.threed/nurbssurface\#getV), die [NurbsDirection](../../com.aspose.threed/nurbsdirection) definiert Daten für jede Richtung. Eine Richtung ist tatsächlich eine NURBS-Kurve, das bedeutet, sie wird auch durch ihr [getOrder](../../com.aspose.threed/nurbsdirection\#getOrder), ein [getKnotVectors](../../com.aspose.threed/nurbsdirection\#getKnotVectors) und eine Menge gewichteter Kontrollpunkte (definiert in [NurbsSurface](../../com.aspose.threed/nurbssurface)) definiert.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [NurbsDirection()](#NurbsDirection--) | Erstelle eine neue Instanz von [NurbsDirection](../../com.aspose.threed/nurbsdirection) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Gibt die Anzahl der Kontrollpunkte in der aktuellen Richtung zurück. |
| [getDegree()](#getDegree--) | Ruft den Grad einer NURBS-Kurve ab, der Grad ist definiert als Ordnung - 1 |
| [getDivisions()](#getDivisions--) | Liefert die Anzahl der Unterteilungen zwischen benachbarten Kontrollpunkten in der aktuellen Richtung. |
| [getKnotVectors()](#getKnotVectors--) | Ruft den Knotenvektor ab, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen. |
| [getMultiplicity()](#getMultiplicity--) | Ruft die Multiplizität ab. |
| [getOrder()](#getOrder--) | Ruft die Ordnung einer NURBS-Kurve ab, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen. |
| [getType()](#getType--) | Liefert den Typ der aktuellen Richtung. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCount(int value)](#setCount-int-) | Setzt die Anzahl der Kontrollpunkte in der aktuellen Richtung. |
| [setDegree(int value)](#setDegree-int-) | Setzt den Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1 |
| [setDivisions(int value)](#setDivisions-int-) | Legt die Anzahl der Unterteilungen zwischen benachbarten Kontrollpunkten in der aktuellen Richtung fest. |
| [setOrder(int value)](#setOrder-int-) | Setzt die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen. |
| [setType(NurbsType value)](#setType-com.aspose.threed.NurbsType-) | Legt den Typ der aktuellen Richtung fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NurbsDirection() {#NurbsDirection--}
```
public NurbsDirection()
```


Erstelle eine neue Instanz von [NurbsDirection](../../com.aspose.threed/nurbsdirection)

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public int getCount()
```


Gibt die Anzahl der Kontrollpunkte in der aktuellen Richtung zurück.

**Returns:**
int - die Anzahl der Kontrollpunkte in der aktuellen Richtung.
### getDegree() {#getDegree--}
```
public int getDegree()
```


Ruft den Grad einer NURBS-Kurve ab, der Grad ist definiert als Ordnung - 1

**Returns:**
int - der Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1
### getDivisions() {#getDivisions--}
```
public int getDivisions()
```


Liefert die Anzahl der Unterteilungen zwischen benachbarten Kontrollpunkten in der aktuellen Richtung.

**Returns:**
int - die Anzahl der Unterteilungen zwischen benachbarten Kontrollpunkten in der aktuellen Richtung.
### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Ruft den Knotenvektor ab, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen.

**Returns:**
java.util.List<java.lang.Double> - der Knotenvektor, er ist eine Sequenz von Parameterwerten, die bestimmen, wo und wie die Kontrollpunkte die NURBS-Kurve beeinflussen.
### getMultiplicity() {#getMultiplicity--}
```
public List<Integer> getMultiplicity()
```


Ruft die Multiplizität ab.

**Returns:**
java.util.List<java.lang.Integer> – die Multiplizität.
### getOrder() {#getOrder--}
```
public int getOrder()
```


Ruft die Ordnung einer NURBS-Kurve ab, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen.

**Returns:**
int – die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die jeden Punkt der Kurve beeinflussen.
### getType() {#getType--}
```
public NurbsType getType()
```


Liefert den Typ der aktuellen Richtung.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype) - the type of the current direction.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setCount(int value) {#setCount-int-}
```
public void setCount(int value)
```


Setzt die Anzahl der Kontrollpunkte in der aktuellen Richtung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDegree(int value) {#setDegree-int-}
```
public void setDegree(int value)
```


Setzt den Grad einer NURBS-Kurve, der Grad ist definiert als Ordnung - 1

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDivisions(int value) {#setDivisions-int-}
```
public void setDivisions(int value)
```


Legt die Anzahl der Unterteilungen zwischen benachbarten Kontrollpunkten in der aktuellen Richtung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setOrder(int value) {#setOrder-int-}
```
public void setOrder(int value)
```


Setzt die Ordnung einer NURBS-Kurve, sie definiert die Anzahl benachbarter Kontrollpunkte, die einen beliebigen Punkt auf der Kurve beeinflussen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setType(NurbsType value) {#setType-com.aspose.threed.NurbsType-}
```
public void setType(NurbsType value)
```


Legt den Typ der aktuellen Richtung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | Neuer Wert |

### toString() {#toString--}
```
public String toString()
```




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

