---
title: "XpsContentElement"
second_title: "Aspose.Page för Java API-referens"
description: "Inkapslar funktioner i XPS-innehållselement Canvas Path och Glyphs."
type: docs
weight: 18
url: /sv/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Kapslar in funktioner för XPS‑innehållselement: Canvas, Path och Glyphs.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till elementets barn efter index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returnerar sökvägsgeometri som begränsar det renderade området för elementet. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returnerar hyperlänkens målobjekt. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar elementets enhetliga transparens. |
| [getOpacityMask()](#getOpacityMask--) | Returnerar penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [getRenderTransform()](#getRenderTransform--) | Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementering av Iterable‑gränssnittet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ställer in sökvägsgeometri som begränsar det renderade området för elementet. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ställer in hyperlänkens målobjekt. |
| [setOpacity(float value)](#setOpacity-float-) | Ställer in värdet som definierar elementets enhetliga transparens. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ställer in penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [size()](#size--) | Returnerar antalet barn‑element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

