---
title: "XpsVisualBrush"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het VisualBrush-eigenschapselement omvat."
type: docs
weight: 54
url: /nl/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

Klasse die de eigenschappen van het VisualBrush-property-element omvat. Dit element wordt gebruikt om een gebied te vullen met een tekening.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kloont deze visual brush. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Retourneert de waarde die de uniforme transparantie van de kwastvulling definieert. |
| [getTileMode()](#getTileMode--) | Retourneert de waarde die aangeeft hoe tegelpatronen worden uitgevoerd in de gevulde geometrie. |
| [getTransform()](#getTransform--) | Retourneert de matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. |
| [getViewbox()](#getViewbox--) | Retourneert het gebied van de broninhoud van de kwast dat naar het viewport moet worden gemapt. |
| [getViewport()](#getViewport--) | Retourneert de positie en afmetingen van de eerste kwasttegel. |
| [getVisual()](#getVisual--) | Retourneert een Path-, Glyphs- of Canvas-element dat wordt gebruikt om de broninhoud van de brush te tekenen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Stelt de waarde in die de uniforme transparantie van de kwastvulling definieert. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Stelt de waarde in die aangeeft hoe tegelpatronen worden uitgevoerd in de gevulde geometrie. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Stelt de matrixtransformatie in die op de coördinatenruimte van de kwast wordt toegepast. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Stelt het gebied in van de broninhoud van de kwast dat naar het viewport moet worden gemapt. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Stelt de positie en afmetingen in van de eerste kwasttegel. |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | Stelt visual in als Visual-element van de visual brush. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


Kloont deze visual brush.

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Retourneert de waarde die de uniforme transparantie van de kwastvulling definieert.

**Returns:**
float - Waarde die de uniforme transparantie van de kwastvulling definieert.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Retourneert de waarde die aangeeft hoe tegelpatronen worden uitgevoerd in de gevulde geometrie.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Retourneert de matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de kwast te verkrijgen. Het viewport voor de kwast wordt getransformeerd met behulp van de lokale effectieve rendertransformatie.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Retourneert het gebied van de broninhoud van de kwast dat naar het viewport moet worden gemapt.

**Returns:**
java.awt.geom.Rectangle2D - Het gebied van de broninhoud van de kwast dat naar het viewport moet worden gemapt.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Retourneert de positie en afmetingen van de eerste kwasttegel. Volgende tegels worden gepositioneerd ten opzichte van deze tegel, zoals gespecificeerd door de tegelmodus.

**Returns:**
java.awt.geom.Rectangle2D - De positie en afmetingen van de eerste kwasttegel.
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


Retourneert een Path-, Glyphs- of Canvas-element dat wordt gebruikt om de broninhoud van de brush te tekenen.

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - A Path, Glyphs, or Canvas element used to draw the brush\\u2019s source content.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Stelt de waarde in die de uniforme transparantie van de kwastvulling definieert.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | Waarde die de uniforme transparantie van de kwastvulling definieert. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Stelt de waarde in die aangeeft hoe tegelpatronen worden uitgevoerd in de gevulde geometrie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Waarde die aangeeft hoe tegelpatronen worden uitgevoerd in de gevulde geometrie. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Stelt de matrixtransformatie in die op de coördinatenruimte van de kwast wordt toegepast. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de kwast te verkrijgen. Het viewport voor de kwast wordt getransformeerd met behulp van de lokale effectieve rendertransformatie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De matrixtransformatie die op de coördinatenruimte van de kwast wordt toegepast. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Stelt het gebied in van de broninhoud van de kwast dat naar het viewport moet worden gemapt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Rectangle2D | Het gebied van de broninhoud van de kwast dat naar het viewport moet worden gemapt. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Stelt de positie en afmetingen in van de eerste kwasttegel. Volgende tegels worden gepositioneerd ten opzichte van deze tegel, zoals gespecificeerd door de tegelmodus.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.geom.Rectangle2D | De positie en afmetingen van de eerste penseel-tegel. |

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


Stelt visual in als Visual-element van de visual brush.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Het element. |

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

