---
title: "XpsGlyphs"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l’élément Glyphs."
type: docs
weight: 25
url: /fr/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Classe encapsulant les fonctionnalités de l'élément Glyphs. Cet élément représente une séquence de texte uniformément formaté provenant d'une seule police. Il fournit les informations nécessaires à un rendu précis et prend en charge les fonctionnalités de recherche et de sélection dans les visualiseurs.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clonez ces glyphes. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès aux enfants de l'élément par l'index i. |
| [getBidiLevel()](#getBidiLevel--) | Renvoie la valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Renvoie la géométrie du chemin limitant la région rendue de l'élément. |
| [getFill()](#getFill--) | Renvoie le pinceau utilisé pour remplir la forme des glyphes rendus. |
| [getFont()](#getFont--) | Renvoie la ressource de police pour la police TrueType utilisée pour composer le texte des éléments. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Renvoie la taille de la police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Renvoie l'objet cible du lien hypertexte. |
| [getOpacity()](#getOpacity--) | Renvoie la valeur définissant la transparence uniforme de l'élément. |
| [getOpacityMask()](#getOpacityMask--) | Renvoie le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [getOriginX()](#getOriginX--) | Renvoie la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [getOriginY()](#getOriginY--) | Renvoie la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [getRenderTransform()](#getRenderTransform--) | Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [getStyleSimulations()](#getStyleSimulations--) | Renvoie la valeur spécifiant une simulation de style. |
| [getUnicodeString()](#getUnicodeString--) | Renvoie la chaîne de texte rendue par l'élément Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Renvoie la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné. |
| [iterator()](#iterator--) | Implémentation de l'interface Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Définit la valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Définit la géométrie du chemin limitant la région rendue de l'élément. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Définit le pinceau utilisé pour remplir la forme des glyphes rendus. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Définit la taille de la police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Définit l'objet cible du lien hypertexte. |
| [setOpacity(float value)](#setOpacity-float-) | Définit la valeur définissant la transparence uniforme de l'élément. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Définit le pinceau spécifiant un masque de valeurs alpha appliqué à l'élément de la même manière que l'attribut Opacity, mais permettant des valeurs alpha différentes pour différentes zones de l'élément. |
| [setOriginX(float value)](#setOriginX-float-) | Définit la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [setOriginY(float value)](#setOriginY-float-) | Définit la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |
| [setSideways(boolean value)](#setSideways-boolean-) | Définit la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Définit la valeur spécifiant une simulation de style. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Définit la chaîne de texte rendue par l'élément Glyphs. |
| [size()](#size--) | Renvoie le nombre d'éléments enfants. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Clonez ces glyphes.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Renvoie la valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode. Les valeurs paires impliquent une disposition de gauche à droite, les valeurs impaires une disposition de droite à gauche. La disposition de droite à gauche place l'origine de la séquence du côté droit du premier glyphe, les largeurs d'avance positives (représentant des avances vers la gauche) plaçant les glyphes suivants à gauche du glyphe précédent.

**Returns:**
int - La valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Renvoie le pinceau utilisé pour remplir la forme des glyphes rendus.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Renvoie la ressource de police pour la police TrueType utilisée pour composer le texte des éléments.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Renvoie la taille de la police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif.

**Returns:**
float - La taille de police.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Renvoie la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif.

**Returns:**
float - La coordonnée x du premier glyphe dans la séquence, en unités de l'espace de coordonnées effectif.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Renvoie la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif.

**Returns:**
float - La coordonnée y du premier glyphe dans la séquence, en unités de l'espace de coordonnées effectif.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Renvoie la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Renvoie la valeur spécifiant une simulation de style.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Renvoie la chaîne de texte rendue par l'élément Glyphs. Le texte est spécifié sous forme de points de code Unicode.

**Returns:**
java.lang.String - La chaîne de texte rendue par l'élément Glyphs.
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


Renvoie la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné.

**Returns:**
boolean - La valeur indiquant qu'un glyphe est tourné sur le côté.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Définit la valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode. Les valeurs paires impliquent une disposition de gauche à droite, les valeurs impaires impliquent une disposition de droite à gauche. La disposition de droite à gauche place l'origine de la séquence du côté droit du premier glyphe, les largeurs d'avance positives (représentant des avances vers la gauche) plaçant les glyphes suivants à gauche du glyphe précédent.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau d'imbrication bidirectionnelle de l'algorithme Unicode. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Définit la géométrie du chemin limitant la région rendue de l'élément.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La géométrie du chemin limitant la région rendue de l'élément. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Définit le pinceau utilisé pour remplir la forme des glyphes rendus.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Le pinceau utilisé pour remplir la forme des glyphes rendus. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Définit la taille de la police en unités de surface de dessin, exprimée comme un flottant dans les unités de l'espace de coordonnées effectif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La taille de police. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Définit la coordonnée x du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La coordonnée x du premier glyphe dans la séquence, en unités de l'espace de coordonnées effectif. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Définit la coordonnée y du premier glyphe de la séquence, en unités de l'espace de coordonnées effectif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La coordonnée y du premier glyphe dans la séquence, en unités de l'espace de coordonnées effectif. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice de transformation affine. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Définit la valeur indiquant qu'un glyphe est tourné sur le côté, l'origine étant définie comme le centre supérieur du glyphe non tourné.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur indiquant qu'un glyphe est tourné sur le côté. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Définit la valeur spécifiant une simulation de style.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | La valeur spécifiant une simulation de style. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Définit la chaîne de texte rendue par l'élément Glyphs. Le texte est spécifié sous forme de points de code Unicode.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.lang.String | La chaîne de texte rendue par l'élément Glyphs. |

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

