---
title: "XpsContentElement"
second_title: "Référence API Aspose.Page pour Java"
description: "Encapsule les fonctionnalités des éléments de contenu XPS Canvas, Path et Glyphs."
type: docs
weight: 18
url: /fr/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Encapsule les fonctionnalités des éléments de contenu XPS : Canvas, Path et Glyphs.
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès aux enfants de l'élément par l'index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Renvoie la géométrie du chemin limitant la région rendue de l'élément. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Renvoie l'objet cible du lien hypertexte. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme de l'élément. |
| [getOpacityMask()](#getOpacityMask--) | Renvoie le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [getRenderTransform()](#getRenderTransform--) | Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implémentation de l'interface Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Définit la géométrie du chemin limitant la région rendue de l'élément. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Définit l'objet cible du lien hypertexte. |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme de l'élément. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [size()](#size--) | Renvoie le nombre d'éléments enfants. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

