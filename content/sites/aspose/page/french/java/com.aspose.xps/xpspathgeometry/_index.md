---
title: "XpsPathGeometry"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément de propriété PathGeometry."
type: docs
weight: 42
url: /fr/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Classe encapsulant les fonctionnalités de l'élément de propriété PathGeometry. Cet élément contient un ensemble de figures de chemin spécifiées soit avec l'attribut Figures, soit avec un élément enfant PathFigure.
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(T obj)](#add-T-) | Ajoute un nouvel objet dans le tableau. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Ajoute un segment de chemin à la liste des segments enfants de la dernière figure de chemin. |
| [deepClone()](#deepClone--) | Clone cette géométrie de chemin. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès à l'élément du tableau par l'index i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Renvoie la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région. |
| [getPathFigures()](#getPathFigures--) | Renvoie la liste des figures de chemin enfants. |
| [getTransform()](#getTransform--) | Renvoie la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Insère un nouvel objet dans le tableau à la position spécifiée. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Insère un segment de chemin dans la liste des segments enfants de la dernière figure de chemin à la position d'index. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Supprime un objet du tableau. |
| [removeAt(int index)](#removeAt-int-) | Supprime un objet du tableau à la position spécifiée. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin à la position d'index. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Définit la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Définit la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé. |
| [size()](#size--) | Renvoie le nombre d'éléments. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Ajoute un nouvel objet dans le tableau.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | L'objet à ajouter. |

**Returns:**
T - Objet ajouté.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Ajoute un segment de chemin à la liste des segments enfants de la dernière figure de chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Le segment de chemin à ajouter. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Clone cette géométrie de chemin.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
public T get(int i)
```


Fournit l'accès à l'élément du tableau par l'index i.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| i | int | Index de l'élément. |

**Returns:**
T - L'élément à la position i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Renvoie la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Renvoie la liste des figures de chemin enfants.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - La liste des figures de chemin enfants.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Renvoie la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Insère un nouvel objet dans le tableau à la position spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | La position où insérer un objet. |
| obj | T | L'objet à insérer. |

**Returns:**
T - Objet inséré.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Insère un segment de chemin dans la liste des segments enfants de la dernière figure de chemin à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un segment doit être inséré. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Un segment de chemin à insérer. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Supprime un objet du tableau.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | L'objet à supprimer. |

**Returns:**
T - Objet supprimé.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Supprime un objet du tableau à la position spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | La position à laquelle supprimer un objet. |

**Returns:**
T - Objet supprimé.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Le segment de chemin à supprimer. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Supprime un segment de chemin de la liste des segments enfants de la dernière figure de chemin à la position d'index.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| index | int | Position à laquelle un segment de chemin doit être supprimé. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Définit la valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | La valeur spécifiant comment les zones d'intersection des formes géométriques sont combinées pour former une région. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Définit la matrice de transformation affine établissant la transformation matricielle locale appliquée à tous les éléments enfants et descendants de la géométrie de chemin avant son utilisation pour le remplissage, le découpage ou le tracé.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice de transformation affine. |

### size() {#size--}
```
public int size()
```


Renvoie le nombre d'éléments.

**Returns:**
int - Le nombre d'éléments.
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

