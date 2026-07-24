---
title: "XpsVisualBrush"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément de propriété VisualBrush."
type: docs
weight: 54
url: /fr/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

Classe encapsulant les fonctionnalités de l'élément de propriété VisualBrush. Cet élément est utilisé pour remplir une région avec un dessin.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clone ce pinceau visuel. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [getTileMode()](#getTileMode--) | Renvoie la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie. |
| [getTransform()](#getTransform--) | Renvoie la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [getViewbox()](#getViewbox--) | Renvoie la région du contenu source du pinceau qui doit être mappée sur le viewport. |
| [getViewport()](#getViewport--) | Renvoie la position et les dimensions de la première tuile du pinceau. |
| [getVisual()](#getVisual--) | Renvoie un élément Path, Glyphs ou Canvas utilisé pour dessiner le contenu source du pinceau\u2019s. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Définit la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Définit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Définit la région du contenu source du pinceau qui doit être mappée sur le viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Définit la position et les dimensions de la première tuile du pinceau. |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | Définit  visual  comme élément Visual du pinceau visuel. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


Clone ce pinceau visuel.

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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


Renvoie la valeur définissant la transparence uniforme du remplissage du pinceau.

**Returns:**
float - Valeur définissant la transparence uniforme du remplissage du pinceau.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Renvoie la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Renvoie la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé à l'aide de la transformation de rendu effective locale.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Renvoie la région du contenu source du pinceau qui doit être mappée sur le viewport.

**Returns:**
java.awt.geom.Rectangle2D - La région du contenu source du pinceau qui doit être mappée sur le viewport.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Renvoie la position et les dimensions de la première tuile du pinceau. Les tuiles suivantes sont positionnées par rapport à cette tuile, comme spécifié par le mode de carrelage.

**Returns:**
java.awt.geom.Rectangle2D - La position et les dimensions de la première tuile du pinceau.
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


Renvoie un élément Path, Glyphs ou Canvas utilisé pour dessiner le contenu source du pinceau\u2019s.

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


Définit la valeur définissant la transparence uniforme du remplissage du pinceau.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Valeur définissant la transparence uniforme du remplissage du pinceau. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Définit la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Valeur spécifiant comment le carrelage est effectué dans la géométrie remplie. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Définit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé à l'aide de la transformation de rendu effective locale.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La transformation matricielle appliquée à l'espace de coordonnées du pinceau. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Définit la région du contenu source du pinceau qui doit être mappée sur le viewport.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.geom.Rectangle2D | La région du contenu source du pinceau qui doit être mappée sur le viewport. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Définit la position et les dimensions de la première tuile du pinceau. Les tuiles suivantes sont positionnées par rapport à cette tuile, comme spécifié par le mode de carrelage.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.geom.Rectangle2D | La position et les dimensions de la première tuile de pinceau. |

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


Définit  visual  comme élément Visual du pinceau visuel.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | L'élément. |

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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

