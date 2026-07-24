---
title: "XpsArcSegment"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Merkmale des ArcSegment-Elements kapselt."
type: docs
weight: 13
url: /de/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Klasse, die die Eigenschaften des ArcSegment-Elements kapselt. Dieses Element beschreibt einen elliptischen Bogen.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klont dieses ArcSegment. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Gibt den Endpunkt des elliptischen Bogens zurück. |
| [getRotationAngle()](#getRotationAngle--) | Gibt den Wert zurück, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist. |
| [getSize()](#getSize--) | Gibt den x- und y-Radius des elliptischen Bogens als x,y-Paar zurück. |
| [getSweepDirection()](#getSweepDirection--) | Gibt den Wert zurück, der die Richtung angibt, in der der Bogen gezeichnet wird. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Gibt den Wert zurück, der bestimmt, ob der Bogen mit einem Sweep von 180 Grad oder mehr gezeichnet wird. |
| [isStroked()](#isStroked--) | Gibt den Wert zurück, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Legt den Wert fest, der bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Legt den Endpunkt des elliptischen Bogens fest. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Legt den Wert fest, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Legt den x- und y-Radius des elliptischen Bogens als x,y-Paar fest. |
| [setStroked(boolean value)](#setStroked-boolean-) | Setzt den Wert, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Legt den Wert fest, der die Richtung angibt, in der der Bogen gezeichnet wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Klont dieses ArcSegment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Gibt den Endpunkt des elliptischen Bogens zurück.

**Returns:**
java.awt.geom.Point2D - Der Endpunkt des elliptischen Bogens.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Gibt den Wert zurück, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist.

**Returns:**
float - Der Wert, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Gibt den x- und y-Radius des elliptischen Bogens als x,y-Paar zurück.

**Returns:**
java.awt.geom.Dimension2D - Der x- und y-Radius des elliptischen Bogens als x,y-Paar.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Gibt den Wert zurück, der die Richtung angibt, in der der Bogen gezeichnet wird.

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


Gibt den Wert zurück, der bestimmt, ob der Bogen mit einem Sweep von 180 Grad oder mehr gezeichnet wird.

**Returns:**
boolean - Der Wert, der bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Gibt den Wert zurück, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird.

**Returns:**
boolean - Der Wert, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird.
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


Legt den Wert fest, der bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Wert, der bestimmt, ob der Bogen mit einem Winkel von 180 Grad oder mehr gezeichnet wird. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Legt den Endpunkt des elliptischen Bogens fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Point2D | Der Endpunkt des elliptischen Bogens. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Legt den Wert fest, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Der Wert, der angibt, wie die Ellipse relativ zum aktuellen Koordinatensystem gedreht ist. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Legt den x- und y-Radius des elliptischen Bogens als x,y-Paar fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Dimension2D | Der x- und y-Radius des elliptischen Bogens als x,y-Paar. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Setzt den Wert, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Wert, der angibt, ob die Kontur für dieses Segment des Pfads gezeichnet wird. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Legt den Wert fest, der die Richtung angibt, in der der Bogen gezeichnet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Der Wert, der die Richtung angibt, in der der Bogen gezeichnet wird. |

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

