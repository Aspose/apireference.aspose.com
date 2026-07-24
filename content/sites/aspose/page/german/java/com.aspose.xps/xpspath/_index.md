---
title: "XpsPath"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die Path-Element-Merkmale kapselt."
type: docs
weight: 40
url: /de/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Klasse, die die Eigenschaften des Path-Elements kapselt. Dieses Element ist das einzige Mittel, um Vektorgrafiken und Bilder zu einer festen Seite hinzuzufügen. Es definiert eine einzelne Vektorgrafik, die auf einer Seite gerendert wird.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klonen dieses Pfads. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf die Kind-Elemente des Elements über den Index i bereit. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Gibt die Pfadgeometrie zurück, die den gerenderten Bereich des Elements begrenzt. |
| [getData()](#getData--) | Gibt die Geometrie des Pfads zurück. |
| [getFill()](#getFill--) | Gibt den Pinsel zurück, der zum Malen der durch die Data-Eigenschaft des Pfads angegebenen Geometrie verwendet wird. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Gibt das Zielobjekt des Hyperlinks zurück. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz des Elements definiert. |
| [getOpacityMask()](#getOpacityMask--) | Gibt den Pinsel zurück, der eine Maske von Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [getRenderTransform()](#getRenderTransform--) | Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [getStroke()](#getStroke--) | Gibt den Pinsel zurück, der zum Zeichnen des Strichs verwendet wird. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Gibt das Array zurück, das die Länge von Strichen und Lücken des Konturstrichs angibt. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Gibt den Wert zurück, der angibt, wie die Enden jedes Strichs gezeichnet werden. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Gibt den Startpunkt für die Wiederholung des Strich-Array-Musters zurück. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Gibt den Wert zurück, der die Form des Endes des letzten Strichs in einem Strich definiert. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Gibt den Wert zurück, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Gibt das Verhältnis zwischen der maximalen Kehllänge und der Hälfte der Strichdicke zurück. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Gibt den Wert zurück, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [getStrokeThickness()](#getStrokeThickness--) | Gibt die Dicke eines Strichs zurück, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfads). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementierung des Iterable-Interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Setzt die Geometrie des Pfads. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Setzt den Pinsel, der zum Malen der durch die Data-Eigenschaft des Pfads angegebenen Geometrie verwendet wird. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Legt das Zielobjekt des Hyperlinks fest. |
| [setOpacity(float value)](#setOpacity-float-) | Legt den Wert fest, der die einheitliche Transparenz des Elements definiert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Legt den Pinsel fest, der eine Maske aus Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Setzt den Pinsel, der zum Zeichnen des Strichs verwendet wird. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Setzt das Array, das die Länge von Strichen und Lücken des Konturstrichs angibt. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Setzt den Wert, der angibt, wie die Enden jedes Strichs gezeichnet werden. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Setzt den Startpunkt für die Wiederholung des Strich-Array-Musters. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Setzt den Wert, der die Form des Endes des letzten Strichs in einem Strich definiert. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Setzt den Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Setzt das Verhältnis zwischen der maximalen Kehllänge und der Hälfte der Strichdicke. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Setzt den Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Setzt die Dicke eines Strichs, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfads). |
| [size()](#size--) | Gibt die Anzahl der Kind-Elemente zurück. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Klonen dieses Pfads.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Gibt die Geometrie des Pfads zurück.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Gibt den Pinsel zurück, der zum Malen der durch die Data-Eigenschaft des Pfads angegebenen Geometrie verwendet wird.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Gibt den Pinsel zurück, der zum Zeichnen des Strichs verwendet wird.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Gibt das Array zurück, das die Länge von Strichen und Lücken des Konturstrichs angibt.

**Returns:**
float[] - Das Array, das die Länge von Strichen und Lücken des Konturstrichs angibt.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Gibt den Wert zurück, der angibt, wie die Enden jedes Strichs gezeichnet werden.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Gibt den Startpunkt für die Wiederholung des Strich-Array-Musters zurück. Wenn dieser Wert weggelassen wird, richtet sich das Strich-Array nach dem Ursprung des Strichs.

**Returns:**
float - Der Startpunkt für die Wiederholung des Stricharray-Musters.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Gibt den Wert zurück, der die Form des Endes des letzten Strichs in einem Strich definiert.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Gibt den Wert zurück, der die Form des Anfangs des ersten Strichs in einem Strich definiert.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Gibt das Verhältnis zwischen der maximalen Miter-Länge und der Hälfte der Strichstärke zurück. Dieser Wert ist nur von Bedeutung, wenn das Attribut StrokeLineJoin den Wert Miter angibt.

**Returns:**
float - Das Verhältnis zwischen der maximalen Miter-Länge und der Hälfte der Strichstärke.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Gibt den Wert zurück, der die Form des Anfangs des ersten Strichs in einem Strich definiert.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Gibt die Dicke eines Strichs zurück, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfads). Der Strich wird über der Begrenzung der Geometrie gezeichnet, die durch die Data-Eigenschaft des Path-Elements\u2019s Data property angegeben ist. Die Hälfte der StrokeThickness erstreckt sich außerhalb der durch die Data-Eigenschaft angegebenen Geometrie und die andere Hälfte innerhalb der Geometrie.

**Returns:**
float - Die Dicke eines Strichs.
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Setzt die Geometrie des Pfads.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Setzt den Pinsel, der zum Malen der durch die Data-Eigenschaft des Pfads angegebenen Geometrie verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Der Pinsel, der zum Zeichnen der angegebenen Geometrie verwendet wird |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Setzt den Pinsel, der zum Zeichnen des Strichs verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Der Pinsel, der zum Zeichnen des Strichs verwendet wird. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Setzt das Array, das die Länge von Strichen und Lücken des Konturstrichs angibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float[] | Das Array, das die Länge von Strichen und Lücken des Umrissstrichs angibt. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Setzt den Wert, der angibt, wie die Enden jedes Strichs gezeichnet werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Der Wert, der angibt, wie die Enden jedes Strichs gezeichnet werden. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Legt den Startpunkt für die Wiederholung des Stricharray-Musters fest. Wenn dieser Wert weggelassen wird, richtet sich das Stricharray nach dem Ursprung des Strichs aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Der Startpunkt für die Wiederholung des Stricharray-Musters. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Setzt den Wert, der die Form des Endes des letzten Strichs in einem Strich definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Der Wert, der die Form des Endes des letzten Strichs in einem Strich definiert. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Setzt den Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Der Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Legt das Verhältnis zwischen der maximalen Miter-Länge und der Hälfte der Strichstärke fest. Dieser Wert ist nur von Bedeutung, wenn das Attribut StrokeLineJoin den Wert Miter angibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Das Verhältnis zwischen der maximalen Miter-Länge und der Hälfte der Strichstärke. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Setzt den Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Der Wert, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Legt die Dicke eines Strichs fest, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfads). Der Strich wird über der Begrenzung der Geometrie gezeichnet, die durch die Data-Eigenschaft des Path-Elements\u2019s Data property angegeben ist. Die Hälfte der StrokeThickness erstreckt sich außerhalb der durch die Data-Eigenschaft angegebenen Geometrie und die andere Hälfte innerhalb der Geometrie.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die Dicke eines Strichs. |

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

