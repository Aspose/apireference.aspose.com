---
title: "XpsImageBrush"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l’élément de propriété ImageBrush."
type: docs
weight: 33
url: /fr/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

Classe encapsulant les fonctionnalités de l'élément de propriété ImageBrush. Cet élément est utilisé pour remplir une région avec une image.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clone ce pinceau d'image. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | Renvoie la ressource d'image utilisée pour le pinceau. |
| [getImageSource()](#getImageSource--) | Renvoie l'URI d'une ressource d'image. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [getTileMode()](#getTileMode--) | Renvoie la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie. |
| [getTransform()](#getTransform--) | Renvoie la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [getViewbox()](#getViewbox--) | Renvoie la région du contenu source du pinceau qui doit être mappée sur le viewport. |
| [getViewport()](#getViewport--) | Renvoie la position et les dimensions de la première tuile du pinceau. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Définit la valeur spécifiant comment le carrelage est effectué dans la géométrie remplie. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Définit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Définit la région du contenu source du pinceau qui doit être mappée sur le viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Définit la position et les dimensions de la première tuile du pinceau. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


Clone ce pinceau d'image.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


Renvoie la ressource d'image utilisée pour le pinceau.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


Renvoie l'URI d'une ressource d'image.

**Returns:**
java.lang.String - L'URI d'une ressource d'image.
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

