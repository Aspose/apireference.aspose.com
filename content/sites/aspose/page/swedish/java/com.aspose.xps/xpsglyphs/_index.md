---
title: "XpsGlyphs"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in Glyphs-elementfunktioner."
type: docs
weight: 25
url: /sv/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Klass som inkapslar Glyphs-elementfunktioner. Detta element representerar en sekvens av enhetligt formaterad text från ett enda teckensnitt. Det tillhandahåller information som behövs för exakt rendering och stöder sök- och markeringsfunktioner i visningsprogram.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klona dessa glyfer. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Tillhandahåller åtkomst till elementets barn efter index i. |
| [getBidiLevel()](#getBidiLevel--) | Returnerar värdet som specificerar Unicode‑algoritmens bidi‑nestningsnivå. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Returnerar sökvägsgeometri som begränsar det renderade området för elementet. |
| [getFill()](#getFill--) | Returnerar borsten som används för att fylla formen på de renderade glyferna. |
| [getFont()](#getFont--) | Returnerar teckensnittresursen för TrueType‑teckensnittet som används för att sätta elementens text. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Returnerar teckensnittsstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter för det effektiva koordinatrymmet. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Returnerar hyperlänkens målobjekt. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar elementets enhetliga transparens. |
| [getOpacityMask()](#getOpacityMask--) | Returnerar penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [getOriginX()](#getOriginX--) | Returnerar x‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |
| [getOriginY()](#getOriginY--) | Returnerar y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |
| [getRenderTransform()](#getRenderTransform--) | Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [getStyleSimulations()](#getStyleSimulations--) | Returnerar värdet som specificerar en stil‑simulation. |
| [getUnicodeString()](#getUnicodeString--) | Returnerar strängen med text som renderas av Glyphs-elementet. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Returnerar värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke‑vridna glyfen. |
| [iterator()](#iterator--) | Implementering av Iterable‑gränssnittet. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Ställer in värdet som specificerar Unicode‑algoritmens bidi‑nästningsnivå. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Ställer in sökvägsgeometri som begränsar det renderade området för elementet. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Ställer in penseln som används för att fylla formen på de renderade glyferna. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Ställer in teckenstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter för det effektiva koordinatrymmet. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Ställer in hyperlänkens målobjekt. |
| [setOpacity(float value)](#setOpacity-float-) | Ställer in värdet som definierar elementets enhetliga transparens. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Ställer in penseln som specificerar en mask av alfa‑värden som appliceras på elementet på samma sätt som Opacity‑attributet, men som tillåter olika alfa‑värden för olika områden av elementet. |
| [setOriginX(float value)](#setOriginX-float-) | Ställer in x‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |
| [setOriginY(float value)](#setOriginY-float-) | Ställer in y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några). |
| [setSideways(boolean value)](#setSideways-boolean-) | Ställer in värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke‑vridna glyfen. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Ställer in värdet som specificerar en stil‑simulation. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Ställer in strängen med text som renderas av Glyphs-elementet. |
| [size()](#size--) | Returnerar antalet barn‑element. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Klona dessa glyfer.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Returnerar värdet som specificerar Unicode‑algoritmens bidi‑nästningsnivå. Jämna värden innebär layout från vänster till höger, ojämna värden innebär layout från höger till vänster. Layout från höger till vänster placerar sekvensens ursprung på högra sidan av den första glyfen, med positiva framstegsbredder (som representerar framsteg åt vänster) placerar efterföljande glyfer till vänster om föregående glyf.

**Returns:**
int – Värdet som specificerar Unicode‑algoritmens bidi‑nästningsnivå.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Returnerar borsten som används för att fylla formen på de renderade glyferna.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Returnerar teckensnittresursen för TrueType‑teckensnittet som används för att sätta elementens text.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Returnerar teckensnittsstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter för det effektiva koordinatrymmet.

**Returns:**
float – Teckenstorleken.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Returnerar x‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.

**Returns:**
float – X‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Returnerar y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.

**Returns:**
float – Y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Returnerar den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Returnerar värdet som specificerar en stil‑simulation.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Returnerar strängen med text som renderas av Glyphs-elementet. Texten specificeras som Unicode‑kodpunkter.

**Returns:**
java.lang.String – Strängen med text som renderas av Glyphs-elementet.
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


Returnerar värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke‑vridna glyfen.

**Returns:**
boolean – Värdet som indikerar att en glyf är vriden på sidan.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Ställer in värdet som specificerar Unicode‑algoritmens bidi‑nästningsnivå. Jämna värden innebär layout från vänster till höger, ojämna värden innebär layout från höger till vänster. Layout från höger till vänster placerar sekvensens ursprung på högra sidan av den första glyfen, med positiva framstegsbredder (som representerar framsteg åt vänster) placerar efterföljande glyfer till vänster om föregående glyf.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar Unicode‑algoritmens bidi‑nästningsnivå. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Ställer in sökvägsgeometri som begränsar det renderade området för elementet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Sökvägsgeometrin som begränsar det renderade området för elementet. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Ställer in penseln som används för att fylla formen på de renderade glyferna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Penseln som används för att fylla formen på de renderade glyferna. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Ställer in teckenstorleken i enheter för ritningsytan, uttryckt som ett flyttal i enheter för det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Teckenstorleken. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Ställer in x‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | X‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Ställer in y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Y‑koordinaten för den första glyfen i sekvensen, i enheter för det effektiva koordinatrymmet. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Ställer in den affina transformationsmatrisen som etablerar ett nytt koordinatramverk för alla attribut i elementet och för alla barn‑element (om några).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den affina transformationsmatrisen. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Ställer in värdet som indikerar att en glyf är vriden på sidan, där ursprunget definieras som den övre mitten av den icke‑vridna glyfen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | boolean | Värdet som indikerar att en glyf är vriden på sidan. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Ställer in värdet som specificerar en stil‑simulation.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Värdet som specificerar en stil‑simulering. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Ställer in textsträngen som renderas av Glyphs‑elementet. Texten specificeras som Unicode‑kodpunkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.lang.String | Textsträngen som renderas av Glyphs‑elementet. |

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

