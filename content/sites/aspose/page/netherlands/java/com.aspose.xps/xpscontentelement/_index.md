---
title: "XpsContentElement"
second_title: "Aspose.Page voor Java API-referentie"
description: "Omvat functies van XPS-inhoudselementen Canvas, Path en Glyphs."
type: docs
weight: 18
url: /nl/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Omvat de kenmerken van XPS-inhoudselementen: Canvas, Path en Glyphs.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot de kinderen van het element via index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Retourneert de padgeometrie die de gerenderde regio van het element beperkt. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Retourneert het hyperlink-doelobject. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van het element definieert. |
| [getOpacityMask()](#getOpacityMask--) | Retourneert de penseel die een masker van alfabewerkingen specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar verschillende alfabewerkingen voor verschillende gebieden van het element toestaat. |
| [getRenderTransform()](#getRenderTransform--) | Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementatie van de Iterable-interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Stelt de padgeometrie in die de gerenderde regio van het element beperkt. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Stelt het hyperlink-doelobject in. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van het element definieert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Stelt de penseel in die een masker van alfa-waarden specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar waarmee verschillende alfa-waarden voor verschillende gebieden van het element mogelijk zijn. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [size()](#size--) | Retourneert het aantal kindelementen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

