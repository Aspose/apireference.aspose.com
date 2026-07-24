---
title: "XpsPath"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het Path-element omvat."
type: docs
weight: 40
url: /nl/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Klasse die de kenmerken van het Path‑element inkapselt. Dit element is het enige middel om vectorafbeeldingen en afbeeldingen toe te voegen aan een vaste pagina. Het definieert één vectorafbeelding die op een pagina wordt gerenderd.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kloont dit path. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot de kinderen van het element via index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Retourneert de padgeometrie die de gerenderde regio van het element beperkt. |
| [getData()](#getData--) | Retourneert de geometrie van het path. |
| [getFill()](#getFill--) | Retourneert de brush die wordt gebruikt om de geometrie te schilderen die is gespecificeerd door de Data‑eigenschap van het path. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Retourneert het hyperlink-doelobject. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van het element definieert. |
| [getOpacityMask()](#getOpacityMask--) | Retourneert de penseel die een masker van alfabewerkingen specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar verschillende alfabewerkingen voor verschillende gebieden van het element toestaat. |
| [getRenderTransform()](#getRenderTransform--) | Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [getStroke()](#getStroke--) | Retourneert de brush die wordt gebruikt om de stroke te tekenen. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Retourneert de array die de lengte van dashes en gaps van de omtrek‑stroke specificeert. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Retourneert de waarde die specificeert hoe de uiteinden van elk dash worden getekend. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Retourneert het startpunt voor het herhalen van het dash‑array‑patroon. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Retourneert de waarde die de vorm van het einde van de laatste dash in een stroke definieert. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Retourneert de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Retourneert de verhouding tussen de maximale miter‑lengte en de helft van de stroke‑dikte. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Retourneert de waarde die de vorm van het begin van de eerste dash in een stroke definieert. |
| [getStrokeThickness()](#getStrokeThickness--) | Retourneert de dikte van een stroke, in eenheden van de effectieve coördinatenruimte (inclusief de render‑transformatie van het path). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementatie van de Iterable-interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Stelt de padgeometrie in die de gerenderde regio van het element beperkt. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Stelt de geometrie van het path in. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Stelt de brush in die wordt gebruikt om de geometrie te schilderen die is gespecificeerd door de Data‑eigenschap van het path. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Stelt het hyperlink-doelobject in. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van het element definieert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Stelt de penseel in die een masker van alfa-waarden specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar waarmee verschillende alfa-waarden voor verschillende gebieden van het element mogelijk zijn. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Stelt de brush in die wordt gebruikt om de stroke te tekenen. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Stelt de array in die de lengte van dashes en gaps van de omtrek‑stroke specificeert. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Stelt de waarde in die specificeert hoe de uiteinden van elk dash worden getekend. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Stelt het startpunt in voor het herhalen van het dash‑array‑patroon. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Stelt de waarde in die de vorm van het einde van de laatste dash in een stroke definieert. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Stelt de waarde in die de vorm van het begin van de eerste dash in een stroke definieert. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Stelt de verhouding in tussen de maximale miter‑lengte en de helft van de stroke‑dikte. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Stelt de waarde in die de vorm van het begin van de eerste dash in een stroke definieert. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Stelt de dikte van een stroke in, in eenheden van de effectieve coördinatenruimte (inclusief de render‑transformatie van het path). |
| [size()](#size--) | Retourneert het aantal kindelementen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Kloont dit path.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Retourneert de geometrie van het path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Retourneert de brush die wordt gebruikt om de geometrie te schilderen die is gespecificeerd door de Data‑eigenschap van het path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Retourneert de brush die wordt gebruikt om de stroke te tekenen.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Retourneert de array die de lengte van dashes en gaps van de omtrek‑stroke specificeert.

**Returns:**
float[] - De array die de lengte van dashes en gaps van de omtrek‑stroke specificeert.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Retourneert de waarde die specificeert hoe de uiteinden van elk dash worden getekend.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Retourneert het startpunt voor het herhalen van het dash‑array‑patroon. Als deze waarde wordt weggelaten, wordt de dash‑array uitgelijnd met de oorsprong van de stroke.

**Returns:**
float - Het startpunt voor het herhalen van het dash-arraypatroon.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Retourneert de waarde die de vorm van het einde van de laatste dash in een stroke definieert.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Retourneert de waarde die de vorm van het begin van de eerste dash in een stroke definieert.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Retourneert de verhouding tussen de maximale miterlengte en de helft van de lijndikte. Deze waarde is alleen significant als het attribuut StrokeLineJoin de waarde Miter specificeert.

**Returns:**
float - De verhouding tussen de maximale miterlengte en de helft van de lijndikte.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Retourneert de waarde die de vorm van het begin van de eerste dash in een stroke definieert.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Retourneert de dikte van een lijn, in eenheden van de effectieve coördinatenruimte (inclusief de rendertransformatie van het pad). De lijn wordt getekend bovenop de grens van de geometrie die wordt gespecificeerd door de Path element\\u2019s Data property. De helft van de StrokeThickness strekt zich uit buiten de geometrie die door de Data property wordt gespecificeerd en de andere helft strekt zich uit binnen de geometrie.

**Returns:**
float - De dikte van een lijn.
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Stelt de geometrie van het path in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De geometrie van het pad. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Stelt de brush in die wordt gebruikt om de geometrie te schilderen die is gespecificeerd door de Data‑eigenschap van het path.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | De brush die wordt gebruikt om de gespecificeerde geometrie te schilderen. |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Stelt de brush in die wordt gebruikt om de stroke te tekenen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | De brush die wordt gebruikt om de lijn te tekenen. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Stelt de array in die de lengte van dashes en gaps van de omtrek‑stroke specificeert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float[] | De array die de lengte van streepjes en tussenruimtes van de omtreklijn specificeert. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Stelt de waarde in die specificeert hoe de uiteinden van elk dash worden getekend.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | De waarde die specificeert hoe de uiteinden van elk streepje worden getekend. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Stelt het startpunt in voor het herhalen van het dash-arraypatroon. Als deze waarde wordt weggelaten, wordt de dash-array uitgelijnd met de oorsprong van de lijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | Het startpunt voor het herhalen van het dash-arraypatroon. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Stelt de waarde in die de vorm van het einde van de laatste dash in een stroke definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | De waarde die de vorm van het einde van het laatste streepje in een lijn definieert. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Stelt de waarde in die de vorm van het begin van de eerste dash in een stroke definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | De waarde die de vorm van het begin van het eerste streepje in een lijn definieert. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Stelt de verhouding in tussen de maximale miterlengte en de helft van de lijndikte. Deze waarde is alleen significant als het attribuut StrokeLineJoin de waarde Miter specificeert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De verhouding tussen de maximale miterlengte en de helft van de lijndikte. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Stelt de waarde in die de vorm van het begin van de eerste dash in een stroke definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | De waarde die de vorm van het begin van het eerste streepje in een lijn definieert. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Stelt de dikte van een lijn in, in eenheden van de effectieve coördinatenruimte (inclusief de rendertransformatie van het pad). De lijn wordt getekend bovenop de grens van de geometrie die wordt gespecificeerd door de Path element\\u2019s Data property. De helft van de StrokeThickness strekt zich uit buiten de geometrie die door de Data property wordt gespecificeerd en de andere helft strekt zich uit binnen de geometrie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De dikte van een lijn. |

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

