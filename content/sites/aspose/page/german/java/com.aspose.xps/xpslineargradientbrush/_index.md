---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Merkmale des LinearGradientBrush-Eigenschaftselements kapselt."
type: docs
weight: 34
url: /de/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Klasse, die die Eigenschaften des LinearGradientBrush‑Elements kapselt. Dieses Element wird verwendet, um einen linearen Farbverlaufspinsel entlang eines Vektors anzugeben.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klont diesen linearen Farbverlaufspinsel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Gibt den Wert zurück, der die Gamma‑Funktion für die Farbübergabe angibt. |
| [getEndPoint()](#getEndPoint--) | Gibt den Endpunkt des linearen Farbverlaufs zurück. |
| [getGradientStops()](#getGradientStops--) | Gibt die Liste der Farbverlaufsstopps zurück, die den Verlauf bilden. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [getSpreadMethod()](#getSpreadMethod--) | Gibt den Wert zurück, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll. |
| [getStartPoint()](#getStartPoint--) | Gibt den Startpunkt des linearen Farbverlaufs zurück. |
| [getTransform()](#getTransform--) | Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Setzt den Wert, der die Gamma‑Funktion für die Farbübergabe angibt. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Gibt den Endpunkt des linearen Farbverlaufs zurück bzw. setzt ihn. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Setzt die Liste der Farbverlaufsstopps, die den Verlauf bilden. |
| [setOpacity(float value)](#setOpacity-float-) | Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Setzt den Wert, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Legt den Startpunkt des linearen Farbverlaufs fest. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Klont diesen linearen Farbverlaufspinsel.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Gibt den Wert zurück, der die Gamma‑Funktion für die Farbübergabe angibt. Die Gamma‑Anpassung sollte nicht auf die Alphakomponente angewendet werden, falls angegeben.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Gibt den Endpunkt des linearen Farbverlaufs zurück.

**Returns:**
java.awt.geom.Point2D - Der Endpunkt des linearen Farbverlaufs.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Gibt die Liste der Farbverlaufsstopps zurück, die den Verlauf bilden.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Liste der Farbverlaufsstopps, die den Verlauf bilden.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert.

**Returns:**
float – Wert, der die einheitliche Transparenz der Pinselfüllung definiert.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Gibt den Wert zurück, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Gibt den Startpunkt des linearen Farbverlaufs zurück.

**Returns:**
java.awt.geom.Point2D - Der Startpunkt des linearen Farbverlaufs.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Legt den Wert fest, der die Gammafunktion für die Farbübergänge angibt. Die Gammaanpassung sollte nicht auf die Alphakomponente angewendet werden, falls angegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Wert, der die Gammafunktion für die Farbübergänge angibt. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Gibt den Endpunkt des linearen Farbverlaufs zurück bzw. setzt ihn.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Point2D | Der Endpunkt des linearen Farbverlaufs. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Setzt die Liste der Farbverlaufsstopps, die den Verlauf bilden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.util.List<com.aspose.xps.XpsGradientStop> | Liste der Farbverlaufsstopps, die den Verlauf bilden. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Setzt den Wert, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Wert, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Legt den Startpunkt des linearen Farbverlaufs fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.geom.Point2D | Der Startpunkt des linearen Farbverlaufs. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |

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

