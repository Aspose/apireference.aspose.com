---
title: "XpsTilingBrush"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die gemeinsame Merkmale der Kachelpinsel-Elemente VisualBrush und ImageBrush kapselt."
type: docs
weight: 51
url: /de/java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Klasse, die gemeinsame Merkmale von Kachelpinsel-Elementen (VisualBrush und ImageBrush) kapselt.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [getTileMode()](#getTileMode--) | Gibt den Wert zurück, der angibt, wie das Kacheln in der gefüllten Geometrie durchgeführt wird. |
| [getTransform()](#getTransform--) | Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [getViewbox()](#getViewbox--) | Gibt den Bereich des Quellinhalts des Pinsels zurück, der auf den Ansichtsbereich abgebildet werden soll. |
| [getViewport()](#getViewport--) | Gibt die Position und Abmessungen der ersten Pinselkachel zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Setzt den Wert, der angibt, wie das Kacheln in der gefüllten Geometrie durchgeführt wird. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Setzt den Bereich des Quellinhalts des Pinsels, der auf den Ansichtsbereich abgebildet werden soll. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Setzt die Position und Abmessungen der ersten Pinselkachel. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert.

**Returns:**
float – Wert, der die einheitliche Transparenz der Pinselfüllung definiert.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Gibt den Wert zurück, der angibt, wie das Kacheln in der gefüllten Geometrie durchgeführt wird.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Gibt den Bereich des Quellinhalts des Pinsels zurück, der auf den Ansichtsbereich abgebildet werden soll.

**Returns:**
java.awt.geom.Rectangle2D – Der Bereich des Quellinhalts des Pinsels, der auf den Ansichtsbereich abgebildet werden soll.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Gibt die Position und Abmessungen der ersten Pinselkachel zurück. Nachfolgende Kacheln werden relativ zu dieser Kachel positioniert, wie durch den Kachelmodus angegeben.

**Returns:**
java.awt.geom.Rectangle2D – Die Position und Abmessungen der ersten Pinselkachel.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Setzt den Wert, der angibt, wie das Kacheln in der gefüllten Geometrie durchgeführt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Wert, der angibt, wie das Kacheln in der gefüllten Geometrie durchgeführt wird. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Setzt den Bereich des Quellinhalts des Pinsels, der auf den Ansichtsbereich abgebildet werden soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Rectangle2D | Der Bereich des Quellinhalts des Pinsels, der auf den Ansichtsbereich abgebildet werden soll. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Setzt die Position und Abmessungen der ersten Pinselkachel. Nachfolgende Kacheln werden relativ zu dieser Kachel positioniert, wie durch den Kachelmodus angegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Rectangle2D | Die Position und die Abmessungen des ersten Pinseltiles. |

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

