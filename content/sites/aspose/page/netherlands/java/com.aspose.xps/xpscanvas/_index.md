---
title: "XpsCanvas"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het Canvas-element omvat."
type: docs
weight: 16
url: /nl/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Klasse die Canvas-elementeigenschappen incapsuleert. Dit element groepeert elementen samen. Bijvoorbeeld, Glyphs- en Path-elementen kunnen in een canvas worden gegroepeerd om als één eenheid te worden geïdentificeerd (als een hyperlinkbestemming) of om een samengestelde eigenschapswaarde toe te passen op elk kind- en voorouderelement.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Voegt een element toe aan de kindlijst van dit canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Voegt een element in op de kindlijst van dit canvas op indexpositie. |
| [addCanvas()](#addCanvas--) | Voegt een nieuw canvas toe aan de kindlijst van dit canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs toe aan de kindlijst van dit canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad toe aan de kindlijst van dit canvas. |
| [deepClone()](#deepClone--) | Kopieert dit canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot de kinderen van het element via index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Retourneert de padgeometrie die de gerenderde regio van het element beperkt. |
| [getEdgeMode()](#getEdgeMode--) | Retourneert de waarde die bepaalt hoe de randen van paden binnen het canvas worden gerenderd. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Retourneert het hyperlink-doelobject. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van het element definieert. |
| [getOpacityMask()](#getOpacityMask--) | Retourneert de penseel die een masker van alfabewerkingen specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar verschillende alfabewerkingen voor verschillende gebieden van het element toestaat. |
| [getRenderTransform()](#getRenderTransform--) | Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Voegt een nieuw canvas in op de kindlijst van dit canvas op indexpositie. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Voegt nieuwe glyphs in op de kindlijst van dit canvas op indexpositie. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Voegt een nieuw pad in op de kindlijst van dit canvas op indexpositie. |
| [iterator()](#iterator--) | Implementatie van de Iterable-interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Stelt de padgeometrie in die de gerenderde regio van het element beperkt. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Stelt de waarde in die bepaalt hoe de randen van paden binnen het canvas worden gerenderd. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Stelt het hyperlink-doelobject in. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van het element definieert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Stelt de penseel in die een masker van alfa-waarden specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar waarmee verschillende alfa-waarden voor verschillende gebieden van het element mogelijk zijn. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [size()](#size--) | Retourneert het aantal kindelementen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Voegt een element toe aan de kindlijst van dit canvas.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| element | T | Het element om toe te voegen. |

**Returns:**
T - Toegevoegd element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Voegt een element in op de kindlijst van dit canvas op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een element moet worden ingevoegd. |
| element | T | Het element om in te voegen. |

**Returns:**
T - Ingevoegd element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Voegt een nieuw canvas toe aan de kindlijst van dit canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs toe aan de kindlijst van dit canvas.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | java.lang.String | Lettertypefamilie. |
| fontSize | float | Lettergrootte. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lettertype stijl. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Glyphs oorsprong T-coördinaat. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Voegt een nieuw pad toe aan de kindlijst van dit canvas.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Kopieert dit canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Biedt toegang tot de kinderen van het element via index i.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int | Index van kindelement. |

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


Retourneert de padgeometrie die de gerenderde regio van het element beperkt.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Retourneert de waarde die bepaalt hoe de randen van paden binnen het canvas worden gerenderd.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Retourneert het hyperlink-doelobject.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Retourneert de waarde die de uniforme transparantie van het element definieert.

**Returns:**
float - De waarde die de uniforme transparantie van het element definieert.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Retourneert de penseel die een masker van alfabewerkingen specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar verschillende alfabewerkingen voor verschillende gebieden van het element toestaat.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig).

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


Voegt een nieuw canvas in op de kindlijst van dit canvas op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw canvas moet worden ingevoegd. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Voegt nieuwe glyphs in op de kindlijst van dit canvas op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop nieuwe glyphs moeten worden ingevoegd. |
| fontFamily | java.lang.String | Lettertypefamilie. |
| fontSize | float | Lettergrootte. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Lettertype stijl. |
| originX | float | X-coördinaat van de oorsprong van de glyphs. |
| originY | float | Glyphs oorsprong T-coördinaat. |
| unicodeString | java.lang.String | Te printen tekenreeks. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Voegt een nieuw pad in op de kindlijst van dit canvas op indexpositie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie waarop een nieuw pad moet worden ingevoegd. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementatie van de Iterable-interface.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Retourneert enumerator voor de lijst.
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


Stelt de padgeometrie in die de gerenderde regio van het element beperkt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De padgeometrie die de gerenderde regio van het element beperkt. |

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Stelt de waarde in die bepaalt hoe de randen van paden binnen het canvas worden gerenderd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | De randrenderingsmodus. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Stelt het hyperlink-doelobject in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Hyperlink-doelobject. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Stelt de waarde in die de uniforme transparantie van het element definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De waarde die de uniforme transparantie van het element definieert. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Stelt de penseel in die een masker van alfa-waarden specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar waarmee verschillende alfa-waarden voor verschillende gebieden van het element mogelijk zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | De penseel die een masker specificeert. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De affiene transformatiematrix. |

### size() {#size--}
```
public int size()
```


Retourneert het aantal kindelementen.

**Returns:**
int - Het aantal kindelementen.
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

