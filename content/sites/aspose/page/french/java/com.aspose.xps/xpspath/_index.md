---
title: "XpsPath"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément Path."
type: docs
weight: 40
url: /fr/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Classe encapsulant les fonctionnalités de l'élément Path. Cet élément est le seul moyen d'ajouter des graphiques vectoriels et des images à une page fixe. Il définit un seul graphique vectoriel à rendre sur une page.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clone ce path. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès aux enfants de l'élément par l'index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Renvoie la géométrie du chemin limitant la région rendue de l'élément. |
| [getData()](#getData--) | Renvoie la géométrie du path. |
| [getFill()](#getFill--) | Renvoie le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du path. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Renvoie l'objet cible du lien hypertexte. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme de l'élément. |
| [getOpacityMask()](#getOpacityMask--) | Renvoie le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [getRenderTransform()](#getRenderTransform--) | Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [getStroke()](#getStroke--) | Renvoie le pinceau utilisé pour tracer le trait. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Renvoie le tableau spécifiant la longueur des tirets et des espaces du trait de contour. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Renvoie la valeur spécifiant comment les extrémités de chaque tiret sont dessinées. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Renvoie le point de départ pour répéter le motif du tableau de tirets. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Renvoie la valeur définissant la forme de l'extrémité du dernier tiret d'un trait. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Renvoie la valeur définissant la forme du début du premier tiret d'un trait. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Renvoie le rapport entre la longueur maximale du joint et la moitié de l'épaisseur du trait. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Renvoie la valeur définissant la forme du début du premier tiret d'un trait. |
| [getStrokeThickness()](#getStrokeThickness--) | Renvoie l'épaisseur d'un trait, en unités de l'espace de coordonnées effectif (inclut la transformation de rendu du path). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implémentation de l'interface Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Définit la géométrie du chemin limitant la région rendue de l'élément. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Définit la géométrie du path. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Définit le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du path. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Définit l'objet cible du lien hypertexte. |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme de l'élément. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Définit le pinceau utilisé pour tracer le trait. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Définit le tableau spécifiant la longueur des tirets et des espaces du trait de contour. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Définit la valeur spécifiant comment les extrémités de chaque tiret sont dessinées. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Définit le point de départ pour répéter le motif du tableau de tirets. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Définit la valeur définissant la forme de l'extrémité du dernier tiret d'un trait. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Définit la valeur définissant la forme du début du premier tiret d'un trait. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Définit le rapport entre la longueur maximale du joint et la moitié de l'épaisseur du trait. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Définit la valeur définissant la forme du début du premier tiret d'un trait. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Définit l'épaisseur d'un trait, en unités de l'espace de coordonnées effectif (inclut la transformation de rendu du path). |
| [size()](#size--) | Renvoie le nombre d'éléments enfants. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Clone ce path.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Fournit l'accès aux enfants de l'élément par l'index i.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| i | int | Indice de l'élément enfant. |

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


Renvoie la géométrie du chemin limitant la région rendue de l'élément.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Renvoie la géométrie du path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Renvoie le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Renvoie l'objet cible du lien hypertexte.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Renvoie la valeur définissant la transparence uniforme de l'élément.

**Returns:**
float - La valeur définissant la transparence uniforme de l'élément.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Renvoie le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Renvoie le pinceau utilisé pour tracer le trait.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Renvoie le tableau spécifiant la longueur des tirets et des espaces du trait de contour.

**Returns:**
float[] - Le tableau spécifiant la longueur des tirets et des espaces du trait de contour.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Renvoie la valeur spécifiant comment les extrémités de chaque tiret sont dessinées.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Renvoie le point de départ pour répéter le motif du tableau de tirets. Si cette valeur est omise, le tableau de tirets s'aligne avec l'origine du trait.

**Returns:**
float - Le point de départ pour répéter le motif du tableau de tirets.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Renvoie la valeur définissant la forme de l'extrémité du dernier tiret d'un trait.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Renvoie la valeur définissant la forme du début du premier tiret d'un trait.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Renvoie le rapport entre la longueur maximale du joint en onglet et la moitié de l'épaisseur du trait. Cette valeur n'est significative que si l'attribut  StrokeLineJoin  spécifie  Miter .

**Returns:**
float - Le rapport entre la longueur maximale du joint en onglet et la moitié de l'épaisseur du trait.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Renvoie la valeur définissant la forme du début du premier tiret d'un trait.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Renvoie l'épaisseur d'un trait, en unités de l'espace de coordonnées effectif (inclut la transformation de rendu du chemin). Le trait est dessiné au-dessus de la frontière de la géométrie spécifiée par la propriété Data de l'élément Path element\\u2019s. La moitié du StrokeThickness s'étend à l'extérieur de la géométrie spécifiée par la propriété Data et l'autre moitié s'étend à l'intérieur de la géométrie.

**Returns:**
float - L'épaisseur d'un trait.
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


Implémentation de l'interface Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Renvoie l'énumérateur pour la liste.
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


Définit la géométrie du chemin limitant la région rendue de l'élément.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin limitant la région rendue de l'élément. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Définit la géométrie du path.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Définit le pinceau utilisé pour peindre la géométrie spécifiée par la propriété Data du path.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Le pinceau utilisé pour peindre la géométrie spécifiée |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Définit l'objet cible du lien hypertexte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Objet cible du lien hypertexte. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Définit la valeur définissant la transparence uniforme de l'élément.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La valeur définissant la transparence uniforme de l'élément. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Le pinceau spécifiant un masque. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice de transformation affine. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Définit le pinceau utilisé pour tracer le trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Le pinceau utilisé pour dessiner le trait. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Définit le tableau spécifiant la longueur des tirets et des espaces du trait de contour.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float[] | Le tableau spécifiant la longueur des tirets et des espaces du contour du trait. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Définit la valeur spécifiant comment les extrémités de chaque tiret sont dessinées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | La valeur spécifiant comment les extrémités de chaque tiret sont dessinées. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Définit le point de départ pour répéter le motif du tableau de tirets. Si cette valeur est omise, le tableau de tirets s'aligne avec l'origine du trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Le point de départ pour répéter le motif du tableau de tirets. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Définit la valeur définissant la forme de l'extrémité du dernier tiret d'un trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | La valeur définissant la forme de l'extrémité du dernier tiret d'un trait. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Définit la valeur définissant la forme du début du premier tiret d'un trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | La valeur définissant la forme du début du premier tiret d'un trait. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Définit le rapport entre la longueur maximale du joint en onglet et la moitié de l'épaisseur du trait. Cette valeur n'est significative que si l'attribut  StrokeLineJoin  spécifie  Miter .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | Le rapport entre la longueur maximale du joint en onglet et la moitié de l'épaisseur du trait. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Définit la valeur définissant la forme du début du premier tiret d'un trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | La valeur définissant la forme du début du premier tiret d'un trait. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Définit l'épaisseur d'un trait, en unités de l'espace de coordonnées effectif (inclut la transformation de rendu du chemin). Le trait est dessiné au-dessus de la frontière de la géométrie spécifiée par la propriété Data de l'élément Path element\\u2019s. La moitié du StrokeThickness s'étend à l'extérieur de la géométrie spécifiée par la propriété Data et l'autre moitié s'étend à l'intérieur de la géométrie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | L'épaisseur d'un trait. |

### size() {#size--}
```
public int size()
```


Renvoie le nombre d'éléments enfants.

**Returns:**
int - Le nombre d'éléments enfants.
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

