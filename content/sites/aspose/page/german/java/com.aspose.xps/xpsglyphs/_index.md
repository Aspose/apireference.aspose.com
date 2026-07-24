---
title: "XpsGlyphs"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Merkmale des Glyphs-Elements kapselt."
type: docs
weight: 25
url: /de/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Klasse, die die Merkmale des Glyphs-Elements kapselt. Dieses Element stellt einen Lauf von einheitlich formatiertem Text aus einer einzigen Schriftart dar. Es liefert die für eine genaue Darstellung notwendigen Informationen und unterstützt Such- und Auswahlfunktionen in Anzeige‑Clients.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Kopiere diese Glyphs. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Stellt Zugriff auf die Kind-Elemente des Elements über den Index i bereit. |
| [getBidiLevel()](#getBidiLevel--) | Gibt den Wert zurück, der das bidirektionale Verschachtelungsniveau des Unicode‑Algorithmus angibt. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Gibt die Pfadgeometrie zurück, die den gerenderten Bereich des Elements begrenzt. |
| [getFill()](#getFill--) | Gibt den Pinsel zurück, der zum Füllen der Form der gerenderten Glyphs verwendet wird. |
| [getFont()](#getFont--) | Gibt die Schriftressource für die TrueType‑Schrift zurück, die zum Satz des Elementtexts verwendet wird. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Gibt die Schriftgröße in Einheiten der Zeichenfläche zurück, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Gibt das Zielobjekt des Hyperlinks zurück. |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz des Elements definiert. |
| [getOpacityMask()](#getOpacityMask--) | Gibt den Pinsel zurück, der eine Maske von Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [getOriginX()](#getOriginX--) | Gibt die x‑Koordinate des ersten Glyphs im Lauf zurück, in Einheiten des effektiven Koordinatenraums. |
| [getOriginY()](#getOriginY--) | Gibt die y‑Koordinate des ersten Glyphs im Lauf zurück, in Einheiten des effektiven Koordinatenraums. |
| [getRenderTransform()](#getRenderTransform--) | Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [getStyleSimulations()](#getStyleSimulations--) | Gibt den Wert zurück, der eine Stil‑Simulation angibt. |
| [getUnicodeString()](#getUnicodeString--) | Gibt die vom Glyphs‑Element gerenderte Textzeichenfolge zurück. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Gibt den Wert zurück, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert ist. |
| [iterator()](#iterator--) | Implementierung des Iterable-Interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Setzt den Wert, der das bidirektionale Verschachtelungsniveau des Unicode‑Algorithmus angibt. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Setzt den Pinsel, der zum Füllen der Form der gerenderten Glyphs verwendet wird. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Setzt die Schriftgröße in Einheiten der Zeichenfläche, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Legt das Zielobjekt des Hyperlinks fest. |
| [setOpacity(float value)](#setOpacity-float-) | Legt den Wert fest, der die einheitliche Transparenz des Elements definiert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Legt den Pinsel fest, der eine Maske aus Alpha-Werten spezifiziert, die auf das Element in derselben Weise wie das Opacity-Attribut angewendet wird, jedoch unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [setOriginX(float value)](#setOriginX-float-) | Setzt die x‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatenraums. |
| [setOriginY(float value)](#setOriginY-float-) | Setzt die y‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatenraums. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert. |
| [setSideways(boolean value)](#setSideways-boolean-) | Setzt den Wert, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert ist. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Setzt den Wert, der eine Stil‑Simulation angibt. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Setzt die vom Glyphs‑Element gerenderte Textzeichenfolge. |
| [size()](#size--) | Gibt die Anzahl der Kind-Elemente zurück. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Kopiere diese Glyphs.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Gibt den Wert zurück, der das bidirektionale Verschachtelungsniveau des Unicode‑Algorithmus angibt. Gerade Werte implizieren ein Layout von links nach rechts, ungerade Werte ein Layout von rechts nach links. Ein Rechts‑nach‑Links‑Layout positioniert den Laufursprung an der rechten Seite des ersten Glyphs, wobei positive Vorwärtsbreiten (die Fortschritte nach links darstellen) nachfolgende Glyphs links vom vorherigen Glyph platzieren.

**Returns:**
int – Der Wert, der das bidirektionale Verschachtelungsniveau des Unicode‑Algorithmus angibt.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Gibt den Pinsel zurück, der zum Füllen der Form der gerenderten Glyphs verwendet wird.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Gibt die Schriftressource für die TrueType‑Schrift zurück, die zum Satz des Elementtexts verwendet wird.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Gibt die Schriftgröße in Einheiten der Zeichenfläche zurück, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums.

**Returns:**
float - Die Schriftgröße.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Gibt die x‑Koordinate des ersten Glyphs im Lauf zurück, in Einheiten des effektiven Koordinatenraums.

**Returns:**
float - Die x‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatensystems.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Gibt die y‑Koordinate des ersten Glyphs im Lauf zurück, in Einheiten des effektiven Koordinatenraums.

**Returns:**
float - Die y‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatensystems.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Gibt die affine Transformationsmatrix zurück, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Gibt den Wert zurück, der eine Stil‑Simulation angibt.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Gibt die Zeichenkette zurück, die vom Glyphs‑Element gerendert wird. Der Text wird als Unicode‑Codepunkte angegeben.

**Returns:**
java.lang.String - Die Zeichenkette des Textes, die vom Glyphs‑Element gerendert wird.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Gibt den Wert zurück, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert ist.

**Returns:**
boolean - Der Wert, der angibt, dass ein Glyph seitlich gedreht ist.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Setzt den Wert, der die bidirektionale Verschachtelungsebene des Unicode‑Algorithmus angibt. Gerade Werte implizieren ein Layout von links nach rechts, ungerade Werte ein Layout von rechts nach links. Das Rechts‑nach‑Links‑Layout positioniert den Ursprung des Laufs auf der rechten Seite des ersten Glyphs, wobei positive Vorwärtsbreiten (die Fortschritte nach links darstellen) nachfolgende Glyphs links vom vorherigen Glyph platzieren.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der die bidirektionale Verschachtelungsebene des Unicode‑Algorithmus angibt. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Legt die Pfadgeometrie fest, die den gerenderten Bereich des Elements begrenzt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Die Pfadgeometrie, die den gerenderten Bereich des Elements begrenzt. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Setzt den Pinsel, der zum Füllen der Form der gerenderten Glyphs verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Der Pinsel, der zum Füllen der Form der gerenderten Glyphs verwendet wird. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Setzt die Schriftgröße in Einheiten der Zeichenfläche, ausgedrückt als Fließkommazahl in Einheiten des effektiven Koordinatenraums.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die Schriftgröße. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Setzt die x‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatenraums.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die x‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatensystems. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Setzt die y‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatenraums.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die y‑Koordinate des ersten Glyphs im Lauf, in Einheiten des effektiven Koordinatensystems. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Legt die affine Transformationsmatrix fest, die einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle Kind-Elemente (falls vorhanden) etabliert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die affine Transformationsmatrix. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Setzt den Wert, der anzeigt, dass ein Glyph seitlich gedreht ist, wobei der Ursprung als obere Mitte des nicht gedrehten Glyphs definiert ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Wert, der angibt, dass ein Glyph seitlich gedreht ist. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Setzt den Wert, der eine Stil‑Simulation angibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Der Wert, der eine Stil‑Simulation angibt. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Setzt die Zeichenkette des Textes, die vom Glyphs‑Element gerendert wird. Der Text wird als Unicode‑Codepunkte angegeben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Die Zeichenkette des Textes, die vom Glyphs‑Element gerendert wird. |

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

