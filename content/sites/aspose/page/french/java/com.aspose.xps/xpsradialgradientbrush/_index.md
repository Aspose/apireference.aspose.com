---
title: "XpsRadialGradientBrush"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément de propriété RadialGradientBrush."
type: docs
weight: 48
url: /fr/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Classe encapsulant les fonctionnalités de l'élément de propriété RadialGradientBrush. Cet élément est utilisé pour spécifier un pinceau à dégradé radial.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clone ce pinceau à dégradé radial. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Renvoie le point central du dégradé radial (c'est-à-dire le centre de l'ellipse). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Renvoie la valeur spécifiant la fonction gamma pour l'interpolation des couleurs. |
| [getGradientOrigin()](#getGradientOrigin--) | Renvoie le point d'origine du dégradé radial. |
| [getGradientStops()](#getGradientStops--) | Renvoie la liste des arrêts de dégradé qui composent le dégradé. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [getRadiusX()](#getRadiusX--) | Renvoie le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| [getRadiusY()](#getRadiusY--) | Renvoie le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |
| [getSpreadMethod()](#getSpreadMethod--) | Renvoie la valeur décrivant comment le pinceau doit remplir la zone de contenu en dehors de la zone de dégradé principale et initiale. |
| [getTransform()](#getTransform--) | Renvoie la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Définit le point central du dégradé radial (c'est‑à‑dire le centre de l'ellipse). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Définit la valeur spécifiant la fonction gamma pour l'interpolation des couleurs. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Définit le point d'origine du dégradé radial. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Définit la liste des arrêts de dégradé qui composent le dégradé. |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme du remplissage du pinceau. |
| [setRadiusX(float value)](#setRadiusX-float-) | Définit le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |
| [setRadiusY(float value)](#setRadiusY-float-) | Définit le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Définit la valeur décrivant comment le pinceau doit remplir la zone de contenu en dehors de la zone de dégradé principale et initiale. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Définit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Clone ce pinceau à dégradé radial.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Renvoie le point central du dégradé radial (c'est-à-dire le centre de l'ellipse).

**Returns:**
java.awt.geom.Point2D - Le point central du dégradé radial.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Renvoie la valeur spécifiant la fonction gamma pour l'interpolation des couleurs. L'ajustement gamma ne doit pas être appliqué au composant alpha, si spécifié.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Renvoie le point d'origine du dégradé radial.

**Returns:**
java.awt.geom.Point2D - Le point d'origine du dégradé radial.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Renvoie la liste des arrêts de dégradé qui composent le dégradé.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Liste des arrêts de dégradé qui composent le dégradé.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Renvoie la valeur définissant la transparence uniforme du remplissage du pinceau.

**Returns:**
float - Valeur définissant la transparence uniforme du remplissage du pinceau.
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Renvoie le rayon dans la dimension x de l'ellipse qui définit le dégradé radial.

**Returns:**
float - Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Renvoie le rayon dans la dimension y de l'ellipse qui définit le dégradé radial.

**Returns:**
float - Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Renvoie la valeur décrivant comment le pinceau doit remplir la zone de contenu en dehors de la zone de dégradé principale et initiale.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Renvoie la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé à l'aide de la transformation de rendu effective locale.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Définit le point central du dégradé radial (c'est‑à‑dire le centre de l'ellipse).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.geom.Point2D | Le point central du dégradé radial. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Définit la valeur spécifiant la fonction gamma pour l'interpolation des couleurs. Le réglage gamma ne doit pas être appliqué au composant alpha, si spécifié.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Valeur spécifiant la fonction gamma pour l'interpolation des couleurs. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Définit le point d'origine du dégradé radial.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.geom.Point2D | Le point d’origine du dégradé radial. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Définit la liste des arrêts de dégradé qui composent le dégradé.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.util.List<com.aspose.xps.XpsGradientStop> | Liste des points d'arrêt du dégradé qui composent le dégradé. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Définit la valeur définissant la transparence uniforme du remplissage du pinceau.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Valeur définissant la transparence uniforme du remplissage du pinceau. |

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Définit le rayon dans la dimension x de l'ellipse qui définit le dégradé radial.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Le rayon dans la dimension x de l'ellipse qui définit le dégradé radial. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Définit le rayon dans la dimension y de l'ellipse qui définit le dégradé radial.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Le rayon dans la dimension y de l'ellipse qui définit le dégradé radial. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Définit la valeur décrivant comment le pinceau doit remplir la zone de contenu en dehors de la zone de dégradé principale et initiale.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Valeur décrivant comment le pinceau doit remplir la zone de contenu à l'extérieur de la zone de dégradé primaire et initiale. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Définit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé à l'aide de la transformation de rendu effective locale.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La transformation matricielle appliquée à l'espace de coordonnées du pinceau. |

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

