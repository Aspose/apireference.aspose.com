---
title: "XpsCanvas"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Merkmale des Canvas-Elements kapselt."
type: docs
weight: 16
url: /de/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Klasse, die die Eigenschaften des Canvas-Elements kapselt. Dieses Element gruppiert Elemente zusammen. Zum Beispiel können Glyphen- und Pfad-Elemente in einem Canvas gruppiert werden, um als Einheit (als Hyperlink-Ziel) identifiziert zu werden oder um einen zusammengesetzten Eigenschaftswert auf jedes Kind- und Vorfahren-Element anzuwenden.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Fügt ein Element zur Kindliste dieses Canvas hinzu. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Fügt ein Element in die Kindliste dieses Canvas an der  index  Position ein. |
| [addCanvas()](#addCanvas--) | Fügt ein neues Canvas zur Kindliste dieses Canvas hinzu. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphen zur Kindliste dieses Canvas hinzu. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Fügt einen neuen Pfad zur Kindliste dieses Canvas hinzu. |
| [deepClone()](#deepClone--) | Klont dieses Canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf die Kind-Elemente des Elements über den Index i bereit. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Gibt die Pfadgeometrie zurück, die den gerenderten Bereich des Elements begrenzt. |
| [getEdgeMode()](#getEdgeMode--) | Gibt den Wert zurück, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Gibt das Zielobjekt des Hyperlinks zurück. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz des Elements definiert. |
| [getOpacityMask()](#getOpacityMask--) | Gibt den Pinsel zurück, der eine Maske von Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [getRenderTransform()](#getRenderTransform--) | Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Fügt ein neues Canvas in die Kindliste dieses Canvas an der  index  Position ein. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Fügt neue Glyphen in die Kindliste dieses Canvas an der  index  Position ein. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Fügt einen neuen Pfad in die Kindliste dieses Canvas an der  index  Position ein. |
| [iterator()](#iterator--) | Implementierung des Iterable-Interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Setzt den Wert, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Legt das Zielobjekt des Hyperlinks fest. |
| [setOpacity(float value)](#setOpacity-float-) | Legt den Wert fest, der die einheitliche Transparenz des Elements definiert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Legt den Pinsel fest, der eine Maske aus Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [size()](#size--) | Gibt die Anzahl der Kind-Elemente zurück. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Fügt ein Element zur Kindliste dieses Canvas hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Element | T | Das Element zum Hinzufügen. |

**Returns:**
T - Hinzugefügtes Element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Fügt ein Element in die Kindliste dieses Canvas an der  index  Position ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein Element eingefügt werden soll. |
| Element | T | Das Element zum Einfügen. |

**Returns:**
T - Eingefügtes Element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Fügt ein neues Canvas zur Kindliste dieses Canvas hinzu.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen zur Kindliste dieses Canvas hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFamily | java.lang.String | Schriftfamilie. |
| fontSize | float | Schriftgröße. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Schriftstil. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | T-Koordinate des Glyphen-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Fügt einen neuen Pfad zur Kindliste dieses Canvas hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Klont dieses Canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Gibt den Wert zurück, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Fügt ein neues Canvas in die Kindliste dieses Canvas an der  index  Position ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neues Canvas eingefügt werden soll. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Fügt neue Glyphen in die Kindliste dieses Canvas an der  index  Position ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der neue Glyphen eingefügt werden sollen. |
| fontFamily | java.lang.String | Schriftfamilie. |
| fontSize | float | Schriftgröße. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Schriftstil. |
| originX | float | X-Koordinate des Glyph-Ursprungs. |
| originY | float | T-Koordinate des Glyphen-Ursprungs. |
| unicodeString | java.lang.String | Zu druckende Zeichenkette. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Fügt einen neuen Pfad in die Kindliste dieses Canvas an der  index  Position ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, an der ein neuer Pfad eingefügt werden soll. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Geometrie des Pfads. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Setzt den Wert, der steuert, wie die Kanten von Pfaden innerhalb des Canvas gerendert werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Der Kantendarstellungsmodus. |

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

