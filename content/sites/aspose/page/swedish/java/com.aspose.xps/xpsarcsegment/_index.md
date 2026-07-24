---
title: "XpsArcSegment"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för ArcSegment‑elementet."
type: docs
weight: 13
url: /sv/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Klassen kapslar in ArcSegment-elementets egenskaper. Detta element beskriver en elliptisk båge.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar detta arc‑segment. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Returnerar slutpunkten för den elliptiska bågen. |
| [getRotationAngle()](#getRotationAngle--) | Returnerar värdet som indikerar hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet. |
| [getSize()](#getSize--) | Returnerar x‑ och y‑radien för den elliptiska bågen som ett x,y‑par. |
| [getSweepDirection()](#getSweepDirection--) | Returnerar värdet som specificerar riktningen i vilken bågen ritas. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Returnerar värdet som avgör om bågen ritas med en svepning på 180 grader eller mer. |
| [isStroked()](#isStroked--) | Returnerar värdet som specificerar om strecket för detta segment av vägen ritas. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Ställer in värdet som bestämmer om bågen ritas med en svepning på 180 grader eller mer. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Ställer in slutpunkten för den elliptiska bågen. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Ställer in värdet som anger hur ellipsen roteras i förhållande till det aktuella koordinatsystemet. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Ställer in x- och y-radien för den elliptiska bågen som ett x,y-par. |
| [setStroked(boolean value)](#setStroked-boolean-) | Ställer in värdet som specificerar om strecket för detta segment av vägen ritas. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Ställer in värdet som specificerar riktningen i vilken bågen ritas. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Klonar detta arc‑segment.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Returnerar slutpunkten för den elliptiska bågen.

**Returns:**
java.awt.geom.Point2D - Slutpunkten för den elliptiska bågen.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Returnerar värdet som indikerar hur ellipsen är roterad i förhållande till det aktuella koordinatsystemet.

**Returns:**
float - Värdet som anger hur ellipsen roteras i förhållande till det aktuella koordinatsystemet.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Returnerar x‑ och y‑radien för den elliptiska bågen som ett x,y‑par.

**Returns:**
java.awt.geom.Dimension2D - x- och y-radien för den elliptiska bågen som ett x,y-par.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Returnerar värdet som specificerar riktningen i vilken bågen ritas.

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


Returnerar värdet som avgör om bågen ritas med en svepning på 180 grader eller mer.

**Returns:**
boolean - Värdet som bestämmer om bågen ritas med en svepning på 180 grader eller mer.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Returnerar värdet som specificerar om strecket för detta segment av vägen ritas.

**Returns:**
boolean – Värdet som specificerar om strecket för detta segment av vägen ritas.
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


Ställer in värdet som bestämmer om bågen ritas med en svepning på 180 grader eller mer.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Värdet som bestämmer om bågen ritas med en svepning på 180 grader eller mer. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Ställer in slutpunkten för den elliptiska bågen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Point2D | Slutpunkten på den elliptiska bågen. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Ställer in värdet som anger hur ellipsen roteras i förhållande till det aktuella koordinatsystemet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Värdet som anger hur ellipsen roteras i förhållande till det aktuella koordinatsystemet. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Ställer in x- och y-radien för den elliptiska bågen som ett x,y-par.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Dimension2D | x- och y-radien för den elliptiska bågen som ett x,y-par. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Ställer in värdet som specificerar om strecket för detta segment av vägen ritas.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Värdet som specificerar om strecket för detta segment av vägen ritas. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Ställer in värdet som specificerar riktningen i vilken bågen ritas.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Värdet som specificerar riktningen i vilken bågen ritas. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

