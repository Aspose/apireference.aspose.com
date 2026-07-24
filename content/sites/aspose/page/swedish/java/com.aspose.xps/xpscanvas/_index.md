---
title: "XpsCanvas"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för Canvas‑elementet."
type: docs
weight: 16
url: /sv/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Klass som inkapslar Canvas-elementfunktioner. Detta element grupperar element tillsammans. Till exempel kan Glyphs- och Path-element grupperas i en canvas för att identifieras som en enhet (som en hyperlänkmål) eller för att tillämpa ett sammansatt egenskapsvärde på varje barn- och förfaderelement.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Lägger till ett element i den här canvasens barnlista. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Infogar ett element i den här canvasens barnlista på indexpositionen. |
| [addCanvas()](#addCanvas--) | Lägger till en ny canvas i den här canvasens barnlista. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Lägger till nya glyfer i den här canvasens barnlista. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Lägger till en ny bana i den här canvasens barnlista. |
| [deepClone()](#deepClone--) | Klonar denna canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till elementets barn efter index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returnerar sökvägsgeometri som begränsar det renderade området för elementet. |
| [getEdgeMode()](#getEdgeMode--) | Returnerar värdet som styr hur kanterna på banor inom canvasen renderas. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returnerar hyperlänkens målobjekt. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar elementets enhetliga transparens. |
| [getOpacityMask()](#getOpacityMask--) | Returnerar penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [getRenderTransform()](#getRenderTransform--) | Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Infogar en ny canvas i den här canvasens barnlista på indexpositionen. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Infogar nya glyfer i den här canvasens barnlista på indexpositionen. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Infogar en ny bana i den här canvasens barnlista på indexpositionen. |
| [iterator()](#iterator--) | Implementering av Iterable‑gränssnittet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ställer in sökvägsgeometri som begränsar det renderade området för elementet. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Ställer in värdet som styr hur kanterna på banor inom canvas renderas. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ställer in hyperlänkens målobjekt. |
| [setOpacity(float value)](#setOpacity-float-) | Ställer in värdet som definierar elementets enhetliga transparens. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ställer in penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [size()](#size--) | Returnerar antalet barn‑element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Lägger till ett element i den här canvasens barnlista.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| element | T | Elementet att lägga till. |

**Returns:**
T - Tillagt element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Infogar ett element i den här canvasens barnlista på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där ett element ska infogas. |
| element | T | Elementet att infoga. |

**Returns:**
T - Infogat element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Lägger till en ny canvas i den här canvasens barnlista.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Lägger till nya glyfer i den här canvasens barnlista.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyphs ursprungliga T-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Lägger till en ny bana i den här canvasens barnlista.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Klonar denna canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Tillhandahåller åtkomst till elementets barn efter index i.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| i | int | Index för barn‑element. |

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


Returnerar sökvägsgeometri som begränsar det renderade området för elementet.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Returnerar värdet som styr hur kanterna på banor inom canvasen renderas.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Returnerar hyperlänkens målobjekt.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returnerar värdet som definierar elementets enhetliga transparens.

**Returns:**
float - Värdet som definierar den enhetliga transparensen för elementet.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Returnerar penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några).

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


Infogar en ny canvas i den här canvasens barnlista på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny duk ska infogas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Infogar nya glyfer i den här canvasens barnlista på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där nya glyfer ska infogas. |
| fontFamily | java.lang.String | Typsnittsfamilj. |
| fontSize | float | Typsnittsstorlek. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Teckenstil. |
| originX | float | Glyfer ursprung X-koordinat. |
| originY | float | Glyphs ursprungliga T-koordinat. |
| unicodeString | java.lang.String | Sträng som ska skrivas ut. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Infogar en ny bana i den här canvasens barnlista på indexpositionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Position där en ny bana ska infogas. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementering av Iterable‑gränssnittet.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Returnerar en enumerator för listan.
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


Ställer in sökvägsgeometri som begränsar det renderade området för elementet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Sökvägsgeometrin som begränsar det renderade området för elementet. |

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Ställer in värdet som styr hur kanterna på banor inom canvas renderas.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Kantrenderingsläget. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Ställer in hyperlänkens målobjekt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Hyperlänkens målobjekt. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Ställer in värdet som definierar elementets enhetliga transparens.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Värdet som definierar den enhetliga transparensen för elementet. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Ställer in penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Penseln som specificerar en mask. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den affina transformationsmatrisen. |

### size() {#size--}
```
public int size()
```


Returnerar antalet barn‑element.

**Returns:**
int - Antalet underordnade element.
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

