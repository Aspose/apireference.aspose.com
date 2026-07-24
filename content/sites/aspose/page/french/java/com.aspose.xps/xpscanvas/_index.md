---
title: "XpsCanvas"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l’élément Canvas."
type: docs
weight: 16
url: /fr/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Classe encapsulant les fonctionnalités de l'élément Canvas. Cet élément regroupe les éléments ensemble. Par exemple, les éléments Glyphs et Path peuvent être groupés dans un canvas afin d'être identifiés comme une unité (comme une destination de lien hypertexte) ou d'appliquer une valeur de propriété composée à chaque élément enfant et ancêtre.
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Ajoute un élément à la liste des enfants de ce canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Insère un élément dans la liste des enfants de ce canvas à la position d'index. |
| [addCanvas()](#addCanvas--) | Ajoute un nouveau canvas à la liste des enfants de ce canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Ajoute de nouveaux glyphs à la liste des enfants de ce canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Ajoute un nouveau chemin à la liste des enfants de ce canvas. |
| [deepClone()](#deepClone--) | Clone ce canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès aux enfants de l'élément par l'index i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Renvoie la géométrie du chemin limitant la région rendue de l'élément. |
| [getEdgeMode()](#getEdgeMode--) | Renvoie la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Renvoie l'objet cible du lien hypertexte. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme de l'élément. |
| [getOpacityMask()](#getOpacityMask--) | Renvoie le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [getRenderTransform()](#getRenderTransform--) | Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Insère un nouveau canvas dans la liste des enfants de ce canvas à la position d'index. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Insère de nouveaux glyphs dans la liste des enfants de ce canvas à la position d'index. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Insère un nouveau chemin dans la liste des enfants de ce canvas à la position d'index. |
| [iterator()](#iterator--) | Implémentation de l'interface Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Définit la géométrie du chemin limitant la région rendue de l'élément. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Définit la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Définit l'objet cible du lien hypertexte. |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme de l'élément. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [size()](#size--) | Renvoie le nombre d'éléments enfants. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Ajoute un élément à la liste des enfants de ce canvas.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| élément | T | L'élément à ajouter. |

**Returns:**
T - Élément ajouté.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Insère un élément dans la liste des enfants de ce canvas à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un élément doit être inséré. |
| élément | T | L'élément à insérer. |

**Returns:**
T - Élément inséré.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Ajoute un nouveau canvas à la liste des enfants de ce canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Ajoute de nouveaux glyphs à la liste des enfants de ce canvas.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Famille de police. |
| fontSize | float | Taille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Style de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée T d'origine des glyphs. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Ajoute un nouveau chemin à la liste des enfants de ce canvas.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Clone ce canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Renvoie la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Insère un nouveau canvas dans la liste des enfants de ce canvas à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau canvas doit être inséré. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Insère de nouveaux glyphs dans la liste des enfants de ce canvas à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle de nouveaux glyphs doivent être insérés. |
| fontFamily | java.lang.String | Famille de police. |
| fontSize | float | Taille de police. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Style de police. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée T d'origine des glyphs. |
| unicodeString | java.lang.String | Chaîne à imprimer. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Insère un nouveau chemin dans la liste des enfants de ce canvas à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un nouveau path doit être inséré. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Définit la valeur qui contrôle la façon dont les bords des chemins à l'intérieur du canvas sont rendus.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Le mode de rendu des bords. |

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

