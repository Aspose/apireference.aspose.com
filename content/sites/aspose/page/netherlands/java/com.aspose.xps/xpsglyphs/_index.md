---
title: "XpsGlyphs"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het Glyphs-element omvat."
type: docs
weight: 25
url: /nl/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Klasse die kenmerken van het Glyphs‑element incapsuleert. Dit element vertegenwoordigt een reeks uniform opgemaakte tekst uit één lettertype. Het levert de informatie die nodig is voor nauwkeurige weergave en ondersteunt zoek‑ en selectiefuncties in weergave‑consumenten.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kloon deze glyphs. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Biedt toegang tot de kinderen van het element via index i. |
| [getBidiLevel()](#getBidiLevel--) | Retourneert de waarde die het bidirectionele nestingsniveau van het Unicode‑algoritme specificeert. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Retourneert de padgeometrie die de gerenderde regio van het element beperkt. |
| [getFill()](#getFill--) | Retourneert de penseel die wordt gebruikt om de vorm van de gerenderde glyphs te vullen. |
| [getFont()](#getFont--) | Retourneert de lettertype‑resource voor het TrueType‑lettertype dat wordt gebruikt om de tekst van elementen te zetten. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Retourneert de lettergrootte in eenheden van het tekenoppervlak, weergegeven als een float in eenheden van de effectieve coördinatenruimte. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Retourneert het hyperlink-doelobject. |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van het element definieert. |
| [getOpacityMask()](#getOpacityMask--) | Retourneert de penseel die een masker van alfabewerkingen specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar verschillende alfabewerkingen voor verschillende gebieden van het element toestaat. |
| [getOriginX()](#getOriginX--) | Retourneert de x‑coördinaat van de eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [getOriginY()](#getOriginY--) | Retourneert de y‑coördinaat van de eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte. |
| [getRenderTransform()](#getRenderTransform--) | Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [getStyleSimulations()](#getStyleSimulations--) | Retourneert de waarde die een stijl‑simulatie specificeert. |
| [getUnicodeString()](#getUnicodeString--) | Retourneert de tekenreeks tekst die door het Glyphs‑element wordt gerenderd. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Retourneert de waarde die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van de niet‑gedraaide glyph. |
| [iterator()](#iterator--) | Implementatie van de Iterable-interface. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Stelt de waarde in die het bidirectionele nestingsniveau van het Unicode‑algoritme specificeert. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Stelt de padgeometrie in die de gerenderde regio van het element beperkt. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Stelt de penseel in die wordt gebruikt om de vorm van de gerenderde glyphs te vullen. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Stelt de lettergrootte in eenheden van het tekenoppervlak in, weergegeven als een float in eenheden van de effectieve coördinatenruimte. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Stelt het hyperlink-doelobject in. |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van het element definieert. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Stelt de penseel in die een masker van alfa-waarden specificeert dat op het element wordt toegepast op dezelfde manier als het Opacity-attribuut, maar waarmee verschillende alfa-waarden voor verschillende gebieden van het element mogelijk zijn. |
| [setOriginX(float value)](#setOriginX-float-) | Stelt de x‑coördinaat van de eerste glyph in de reeks in, in eenheden van de effectieve coördinatenruimte. |
| [setOriginY(float value)](#setOriginY-float-) | Stelt de y‑coördinaat van de eerste glyph in de reeks in, in eenheden van de effectieve coördinatenruimte. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig). |
| [setSideways(boolean value)](#setSideways-boolean-) | Stelt de waarde in die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van de niet‑gedraaide glyph. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Stelt de waarde in die een stijl‑simulatie specificeert. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Stelt de tekenreeks tekst in die door het Glyphs‑element wordt gerenderd. |
| [size()](#size--) | Retourneert het aantal kindelementen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Kloon deze glyphs.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Retourneert de waarde die het bidirectionele nestingsniveau van het Unicode‑algoritme specificeert. Even waarden duiden op een lay-out van links naar rechts, oneven waarden duiden op een lay-out van rechts naar links. Een lay-out van rechts naar links plaatst de oorsprong van de reeks aan de rechterkant van de eerste glyph, waarbij positieve voortschrijdende breedtes (die naar links voortschrijden) de volgende glyphs links van de vorige glyph plaatsen.

**Returns:**
int - De waarde die het bidirectionele nestingsniveau van het Unicode‑algoritme specificeert.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Retourneert de penseel die wordt gebruikt om de vorm van de gerenderde glyphs te vullen.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Retourneert de lettertype‑resource voor het TrueType‑lettertype dat wordt gebruikt om de tekst van elementen te zetten.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Retourneert de lettergrootte in eenheden van het tekenoppervlak, weergegeven als een float in eenheden van de effectieve coördinatenruimte.

**Returns:**
float - De lettergrootte.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Retourneert de x‑coördinaat van de eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte.

**Returns:**
float - De x-coördinaat van het eerste glyph in de run, in eenheden van de effectieve coördinatenruimte.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Retourneert de y‑coördinaat van de eerste glyph in de reeks, in eenheden van de effectieve coördinatenruimte.

**Returns:**
float - De y-coördinaat van het eerste glyph in de run, in eenheden van de effectieve coördinatenruimte.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Retourneert de affiene transformatie-matrix die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Retourneert de waarde die een stijl‑simulatie specificeert.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Retourneert de tekenreeks die door het Glyphs-element wordt gerenderd. De tekst wordt gespecificeerd als Unicode-codepunten.

**Returns:**
java.lang.String - De tekenreeks die door het Glyphs-element wordt gerenderd.
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


Retourneert de waarde die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van de niet‑gedraaide glyph.

**Returns:**
boolean - De waarde die aangeeft dat een glyph op zijn kant staat.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Stelt de waarde in die het bidirectionele nestingsniveau van het Unicode-algoritme specificeert. Even waarden impliceren een lay-out van links naar rechts, oneven waarden impliceren een lay-out van rechts naar links. Een lay-out van rechts naar links plaatst de oorsprong van de run aan de rechterkant van het eerste glyph, waarbij positieve voortschrijdende breedtes (die naar links bewegen) de volgende glyphs links van het vorige glyph plaatsen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het bidirectionele nestingsniveau van het Unicode-algoritme specificeert. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Stelt de padgeometrie in die de gerenderde regio van het element beperkt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | De padgeometrie die de gerenderde regio van het element beperkt. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Stelt de penseel in die wordt gebruikt om de vorm van de gerenderde glyphs te vullen.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | De kwast die wordt gebruikt om de vorm van de gerenderde glyphs te vullen. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Stelt de lettergrootte in eenheden van het tekenoppervlak in, weergegeven als een float in eenheden van de effectieve coördinatenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De lettergrootte. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Stelt de x‑coördinaat van de eerste glyph in de reeks in, in eenheden van de effectieve coördinatenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De x-coördinaat van het eerste glyph in de run, in eenheden van de effectieve coördinatenruimte. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Stelt de y‑coördinaat van de eerste glyph in de reeks in, in eenheden van de effectieve coördinatenruimte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De y-coördinaat van het eerste glyph in de run, in eenheden van de effectieve coördinatenruimte. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Stelt de affiene transformatiematrix in die een nieuw coördinatenstelsel vastlegt voor alle attributen van het element en voor alle kindelementen (indien aanwezig).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De affiene transformatiematrix. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Stelt de waarde in die aangeeft dat een glyph op zijn kant is gedraaid, waarbij de oorsprong wordt gedefinieerd als het bovenste midden van de niet‑gedraaide glyph.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De waarde die aangeeft dat een glyph op zijn kant staat. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Stelt de waarde in die een stijl‑simulatie specificeert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | De waarde die een stijl-simulatie specificeert. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Stelt de tekenreeks in die door het Glyphs-element wordt gerenderd. De tekst wordt gespecificeerd als Unicode-codepunten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.lang.String | De tekenreeks die door het Glyphs-element wordt gerenderd. |

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

