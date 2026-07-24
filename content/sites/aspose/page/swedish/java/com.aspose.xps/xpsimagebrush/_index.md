---
title: "XpsImageBrush"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för ImageBrush-egenskapselement."
type: docs
weight: 33
url: /sv/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

Klass som inkapslar ImageBrush-egenskapselementfunktioner. Detta element används för att fylla ett område med en bild.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar denna bildpensel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | Returnerar bildresurs som används för penseln. |
| [getImageSource()](#getImageSource--) | Returnerar URI:n för en bildresurs. |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [getTileMode()](#getTileMode--) | Returnerar värdet som specificerar hur kakling utförs i den fyllda geometrin. |
| [getTransform()](#getTransform--) | Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [getViewbox()](#getViewbox--) | Returnerar regionen av brushens källinnehåll som ska mappas till visningsområdet. |
| [getViewport()](#getViewport--) | Returnerar positionen och dimensionerna för den första penselkakan. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Sätter värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Sätter värdet som specificerar hur kakling utförs i den fyllda geometrin. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Ställer in området för penselns källinnehåll som ska avbildas på visningsytan. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Ställer in positionen och dimensionerna för den första penseltegeln. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


Klonar denna bildpensel.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getImage() {#getImage--}
```
public XpsImage getImage()
```


Returnerar bildresurs som används för penseln.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


Returnerar URI:n för en bildresurs.

**Returns:**
java.lang.String - URI:n för en bildresurs.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen.

**Returns:**
float - Värde som definierar den enhetliga transparensen för penselfyllningen.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Returnerar värdet som specificerar hur kakling utförs i den fyllda geometrin.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Returnerar regionen av brushens källinnehåll som ska mappas till visningsområdet.

**Returns:**
java.awt.geom.Rectangle2D - Området för penselns källinnehåll som ska avbildas på visningsytan.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Returnerar positionen och dimensionerna för den första penseltegeln. Efterföljande tegel läggs ut relativt denna tegel, enligt den angivna tegelläget.

**Returns:**
java.awt.geom.Rectangle2D - Positionen och dimensionerna för den första penseltegeln.
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


Sätter värdet som definierar den enhetliga transparensen för penselfyllningen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Värde som definierar den enhetliga transparensen för penselfyllningen. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Sätter värdet som specificerar hur kakling utförs i den fyllda geometrin.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Värde som specificerar hur tegling utförs i den fyllda geometrin. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matrisomvandlingen som tillämpas på penselns koordinatrymd. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Ställer in området för penselns källinnehåll som ska avbildas på visningsytan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | Området för penselns källinnehåll som ska avbildas på visningsytan. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Ställer in positionen och dimensionerna för den första penseltegeln. Efterföljande tegel placeras relativt denna tegel, enligt det angivna tegelläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.awt.geom.Rectangle2D | Positionen och dimensionerna för den första penseltegeln. |

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

