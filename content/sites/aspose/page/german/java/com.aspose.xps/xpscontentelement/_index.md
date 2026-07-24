---
title: "XpsContentElement"
second_title: "Aspose.Page for Java API-Referenz"
description: "Kapselt Funktionen der XPS-Inhaltselemente Canvas, Path und Glyphs."
type: docs
weight: 18
url: /de/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Kapselt die Merkmale von XPS-Inhaltselementen: Canvas, Path und Glyphs.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf die Kind-Elemente des Elements über den Index i bereit. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Gibt die Pfadgeometrie zurück, die den gerenderten Bereich des Elements begrenzt. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Gibt das Zielobjekt des Hyperlinks zurück. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz des Elements definiert. |
| [getOpacityMask()](#getOpacityMask--) | Gibt den Pinsel zurück, der eine Maske von Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [getRenderTransform()](#getRenderTransform--) | Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementierung des Iterable-Interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Legt das Zielobjekt des Hyperlinks fest. |
| [setOpacity(float value)](#setOpacity-float-) | Legt den Wert fest, der die einheitliche Transparenz des Elements definiert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Legt den Pinsel fest, der eine Maske aus Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [size()](#size--) | Gibt die Anzahl der Kind-Elemente zurück. |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Stellt Zugriff auf die Kind-Elemente des Elements über den Index i bereit.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int | Index des Kind-Elements. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Gibt die Pfadgeometrie zurück, die den gerenderten Bereich des Elements begrenzt.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Gibt das Zielobjekt des Hyperlinks zurück.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Gibt den Wert zurück, der die einheitliche Transparenz des Elements definiert.

**Returns:**
float - Der Wert, der die einheitliche Transparenz des Elements definiert.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Gibt den Pinsel zurück, der eine Maske von Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementierung des Iterable-Interface.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Gibt den Enumerator für die Liste zurück.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Pfadgeometrie, die den gerenderten Bereich des Elements begrenzt. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Legt das Zielobjekt des Hyperlinks fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Zielobjekt des Hyperlinks. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Legt den Wert fest, der die einheitliche Transparenz des Elements definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Der Wert, der die einheitliche Transparenz des Elements definiert. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Legt den Pinsel fest, der eine Maske aus Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Der Pinsel, der eine Maske spezifiziert. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die affine Transformationsmatrix. |

### size() {#size--}
```
public int size()
```


Gibt die Anzahl der Kind-Elemente zurück.

**Returns:**
int - Die Anzahl der Kind-Elemente.
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

