---
title: "XpsGradientBrush"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die gemeinsamen Merkmale von LinerGradientBrush- und RadialGradientBrush-Elementen kapselt."
type: docs
weight: 26
url: /de/java/com.aspose.xps/xpsgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsGradientBrush extends XpsTransformableBrush
```

Klasse, die die gemeinsamen Merkmale von LinerGradientBrush- und RadialGradientBrush-Elementen kapselt.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Gibt den Wert zurück, der die Gamma‑Funktion für die Farbübergabe angibt. |
| [getGradientStops()](#getGradientStops--) | Gibt die Liste der Farbverlaufsstopps zurück, die den Verlauf bilden. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [getSpreadMethod()](#getSpreadMethod--) | Gibt den Wert zurück, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll. |
| [getTransform()](#getTransform--) | Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Setzt den Wert, der die Gamma‑Funktion für die Farbübergabe angibt. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Setzt die Liste der Farbverlaufsstopps, die den Verlauf bilden. |
| [setOpacity(float value)](#setOpacity-float-) | Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Setzt den Wert, der beschreibt, wie der Pinsel den Inhaltsbereich außerhalb des primären, initialen Farbverlaufsbereichs füllen soll. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Gibt den Wert zurück, der die Gamma‑Funktion für die Farbübergabe angibt. Die Gamma‑Anpassung sollte nicht auf die Alphakomponente angewendet werden, falls angegeben.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
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

