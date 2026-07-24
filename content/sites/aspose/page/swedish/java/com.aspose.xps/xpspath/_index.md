---
title: "XpsPath"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in Path-elementfunktioner."
type: docs
weight: 40
url: /sv/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Klass som inkapslar Path-elementfunktioner. Detta element är det enda sättet att lägga till vektorgrafik och bilder på en fast sida. Det definierar en enda vektorgrafik som ska renderas på en sida.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar denna bana. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till elementets barn efter index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returnerar sökvägsgeometri som begränsar det renderade området för elementet. |
| [getData()](#getData--) | Returnerar geometrin för banan. |
| [getFill()](#getFill--) | Returnerar penseln som används för att måla geometrin som specificeras av Data‑egenskapen för banan. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returnerar hyperlänkens målobjekt. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar elementets enhetliga transparens. |
| [getOpacityMask()](#getOpacityMask--) | Returnerar penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [getRenderTransform()](#getRenderTransform--) | Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [getStroke()](#getStroke--) | Returnerar penseln som används för att rita strecket. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Returnerar arrayen som specificerar längden på streck och mellanrum för konturstrecket. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Returnerar värdet som specificerar hur ändarna på varje streck ritas. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Returnerar startpunkten för att upprepa dash‑arraymönstret. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Returnerar värdet som definierar formen på slutet av det sista strecket i ett streck. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Returnerar värdet som definierar formen på början av det första strecket i ett streck. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Returnerar förhållandet mellan maximal snedkantslängd och hälften av strecktjockleken. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Returnerar värdet som definierar formen på början av det första strecket i ett streck. |
| [getStrokeThickness()](#getStrokeThickness--) | Returnerar tjockleken på ett streck, i enheter av det effektiva koordinatrymdet (inkluderar banans renderingstransform). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementering av Iterable‑gränssnittet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ställer in sökvägsgeometri som begränsar det renderade området för elementet. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Ställer in geometrin för banan. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Ställer in penseln som används för att måla geometrin som specificeras av Data‑egenskapen för banan. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ställer in hyperlänkens målobjekt. |
| [setOpacity(float value)](#setOpacity-float-) | Ställer in värdet som definierar elementets enhetliga transparens. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ställer in penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Ställer in penseln som används för att rita strecket. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Ställer in arrayen som specificerar längden på streck och mellanrum för konturstrecket. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Ställer in värdet som specificerar hur ändarna på varje streck ritas. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Ställer in startpunkten för att upprepa dash‑arraymönstret. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Ställer in värdet som definierar formen på slutet av det sista strecket i ett streck. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Ställer in värdet som definierar formen på början av det första strecket i ett streck. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Ställer in förhållandet mellan maximal snedkantslängd och hälften av strecktjockleken. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Ställer in värdet som definierar formen på början av det första strecket i ett streck. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Ställer in tjockleken på ett streck, i enheter av det effektiva koordinatrymdet (inkluderar banans renderingstransform). |
| [size()](#size--) | Returnerar antalet barn‑element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Klonar denna bana.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Returnerar geometrin för banan.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returnerar penseln som används för att måla geometrin som specificeras av Data‑egenskapen för banan.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Returnerar penseln som används för att rita strecket.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Returnerar arrayen som specificerar längden på streck och mellanrum för konturstrecket.

**Returns:**
float[] - Arrayen som specificerar längden på streck och mellanrum för konturstrecket.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Returnerar värdet som specificerar hur ändarna på varje streck ritas.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Returnerar startpunkten för att upprepa dash array-mönstret. Om detta värde utelämnas aligneras dash array med stroke‑originen.

**Returns:**
float – Startpunkten för att upprepa dash array-mönstret.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Returnerar värdet som definierar formen på slutet av det sista strecket i ett streck.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Returnerar värdet som definierar formen på början av det första strecket i ett streck.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Returnerar förhållandet mellan maximal miter‑längd och hälften av stroke‑tjockleken. Detta värde är betydelsefullt endast om attributet StrokeLineJoin specificerar Miter.

**Returns:**
float – Förhållandet mellan maximal miter‑längd och hälften av stroke‑tjockleken.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Returnerar värdet som definierar formen på början av det första strecket i ett streck.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Returnerar tjockleken på en stroke, i enheter av det effektiva koordinatrymmet (inkluderar pathens render‑transform). Strokens ritning sker ovanpå gränsen för geometrin som specificeras av Path element\\u2019s Data property. Hälften av StrokeThickness sträcker sig utanför geometrin som specificeras av Data property och den andra hälften sträcker sig in i geometrin.

**Returns:**
float – Stroke‑tjockleken.
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Ställer in geometrin för banan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometrin för banan. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Ställer in penseln som används för att måla geometrin som specificeras av Data‑egenskapen för banan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Penseln som används för att måla den specificerade geometrin |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Ställer in penseln som används för att rita strecket.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Penseln som används för att rita strokens. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Ställer in arrayen som specificerar längden på streck och mellanrum för konturstrecket.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float[] | Arrayen som specificerar längden på streck och mellanrum för kontur‑strokens. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Ställer in värdet som specificerar hur ändarna på varje streck ritas.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Värdet som specificerar hur ändarna på varje streck ritas. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Ställer in startpunkten för att upprepa dash array-mönstret. Om detta värde utelämnas aligneras dash array med stroke‑originen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Startpunkten för att upprepa dash array-mönstret. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Ställer in värdet som definierar formen på slutet av det sista strecket i ett streck.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Värdet som definierar formen på slutet av det sista strecket i en stroke. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Ställer in värdet som definierar formen på början av det första strecket i ett streck.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Värdet som definierar formen på början av det första strecket i en stroke. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Ställer in förhållandet mellan maximal miter‑längd och hälften av stroke‑tjockleken. Detta värde är betydelsefullt endast om attributet StrokeLineJoin specificerar Miter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Förhållandet mellan maximal miter‑längd och hälften av stroke‑tjockleken. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Ställer in värdet som definierar formen på början av det första strecket i ett streck.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Värdet som definierar formen på början av det första strecket i en stroke. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Ställer in tjockleken på en stroke, i enheter av det effektiva koordinatrymdet (inkluderar pathens render‑transform). Strokens ritning sker ovanpå gränsen för geometrin som specificeras av Path element\\u2019s Data property. Hälften av StrokeThickness sträcker sig utanför geometrin som specificeras av Data property och den andra hälften sträcker sig in i geometrin.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Stroke‑tjockleken. |

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

