---
title: "XpsArcSegment"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het ArcSegment-element omvat."
type: docs
weight: 13
url: /nl/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Klasse die de kenmerken van het ArcSegment‑element incapsuleert. Dit element beschrijft een elliptische boog.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kloont dit boogsegment. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Retourneert het eindpunt van de elliptische boog. |
| [getRotationAngle()](#getRotationAngle--) | Retourneert de waarde die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |
| [getSize()](#getSize--) | Retourneert de x- en y‑straal van de elliptische boog als een x,y‑paar. |
| [getSweepDirection()](#getSweepDirection--) | Retourneert de waarde die de richting specificeert waarin de boog wordt getekend. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Retourneert de waarde die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer. |
| [isStroked()](#isStroked--) | Retourneert de waarde die aangeeft of de lijn voor dit segment van het pad wordt getekend. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Stelt de waarde in die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Stelt het eindpunt van de elliptische boog in. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Stelt de waarde in die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Stelt de x- en y-radius van de elliptische boog in als een x,y-paar. |
| [setStroked(boolean value)](#setStroked-boolean-) | Stelt de waarde in die aangeeft of de lijn voor dit segment van het pad wordt getekend. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Stelt de waarde in die de richting aangeeft waarin de boog wordt getekend. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Kloont dit boogsegment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Retourneert het eindpunt van de elliptische boog.

**Returns:**
java.awt.geom.Point2D - Het eindpunt van de elliptische boog.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Retourneert de waarde die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem.

**Returns:**
float - De waarde die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Retourneert de x- en y‑straal van de elliptische boog als een x,y‑paar.

**Returns:**
java.awt.geom.Dimension2D - De x- en y-radius van de elliptische boog als een x,y-paar.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Retourneert de waarde die de richting specificeert waarin de boog wordt getekend.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


Retourneert de waarde die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer.

**Returns:**
boolean - De waarde die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Retourneert de waarde die aangeeft of de lijn voor dit segment van het pad wordt getekend.

**Returns:**
boolean - De waarde die aangeeft of de lijn voor dit segment van het pad wordt getekend.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


Stelt de waarde in die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De waarde die bepaalt of de boog wordt getekend met een sweep van 180 graden of meer. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Stelt het eindpunt van de elliptische boog in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Point2D | Het eindpunt van de elliptische boog. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Stelt de waarde in die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De waarde die aangeeft hoe de ellips is geroteerd ten opzichte van het huidige coördinatensysteem. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Stelt de x- en y-radius van de elliptische boog in als een x,y-paar.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Dimension2D | De x- en y-radius van de elliptische boog als een x,y-paar. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Stelt de waarde in die aangeeft of de lijn voor dit segment van het pad wordt getekend.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De waarde die aangeeft of de lijn voor dit segment van het pad wordt getekend. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Stelt de waarde in die de richting aangeeft waarin de boog wordt getekend.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | De waarde die de richting aangeeft waarin de boog wordt getekend. |

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
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

