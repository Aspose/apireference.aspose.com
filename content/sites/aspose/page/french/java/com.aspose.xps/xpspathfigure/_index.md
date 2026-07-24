---
title: "XpsPathFigure"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément PathFigure."
type: docs
weight: 41
url: /fr/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Classe encapsulant les fonctionnalités de l'élément PathFigure. Cet élément est composé d'un ensemble d'une ou plusieurs segments de ligne ou de courbe.
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(T obj)](#add-T-) | Ajoute un nouvel objet dans le tableau. |
| [deepClone()](#deepClone--) | Clone cette figure de chemin. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fournit l'accès à l'élément du tableau par l'index i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Renvoie la liste des segments de chemin enfants. |
| [getStartPoint()](#getStartPoint--) | Renvoie le point de départ du premier segment de la figure de chemin. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Insère un nouvel objet dans le tableau à la position spécifiée. |
| [isClosed()](#isClosed--) | Renvoie la valeur indiquant si la figure de chemin est fermée. |
| [isFilled()](#isFilled--) | Renvoie la valeur indiquant si la figure de chemin est utilisée pour calculer la zone de la géométrie de chemin contenant. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Supprime un objet du tableau. |
| [removeAt(int index)](#removeAt-int-) | Supprime un objet du tableau à la position spécifiée. |
| [setClosed(boolean value)](#setClosed-boolean-) | Définit la valeur indiquant si la figure de chemin est fermée. |
| [setFilled(boolean value)](#setFilled-boolean-) | Définit la valeur indiquant si la figure de chemin est utilisée pour calculer la zone de la géométrie de chemin contenant. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Définit le point de départ du premier segment de la figure de chemin. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Clone cette figure de chemin.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Renvoie la liste des segments de chemin enfants.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - La liste des segments de chemin enfants.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Renvoie le point de départ du premier segment de la figure de chemin.

**Returns:**
java.awt.geom.Point2D - Le point de départ du premier segment de la figure de chemin.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Renvoie la valeur indiquant si la figure de chemin est fermée.

**Returns:**
booléen - La valeur indiquant si la figure de chemin est fermée.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Renvoie la valeur indiquant si la figure de chemin est utilisée pour calculer la zone de la géométrie de chemin contenant.

**Returns:**
booléen - La valeur indiquant si la figure de chemin est utilisée dans le calcul de la zone de la géométrie de chemin contenant.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Définit la valeur indiquant si la figure de chemin est fermée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur indiquant si la figure de chemin est fermée. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Définit la valeur indiquant si la figure de chemin est utilisée pour calculer la zone de la géométrie de chemin contenant.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur indiquant si la figure de chemin est utilisée dans le calcul de la zone de la géométrie de chemin contenant. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Définit le point de départ du premier segment de la figure de chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.geom.Point2D | Le point de départ du premier segment de la figure de chemin. |

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

