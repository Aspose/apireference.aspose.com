---
title: "DimensionF"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe Dimension encapsule la largeur et la hauteur d'un composant en précision simple dans un seul objet."
type: docs
weight: 11
url: /fr/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

La classe `Dimension` encapsule la largeur et la hauteur d'un composant (en précision simple) dans un seul objet.

Normalement, les valeurs de `width` et `height` sont des entiers non négatifs. Les constructeurs qui vous permettent de créer une dimension n'empêchent pas de définir une valeur négative pour ces propriétés. Si la valeur de `width` ou `height` est négative, le comportement de certaines méthodes définies par d'autres objets est indéfini.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [DimensionF()](#DimensionF--) | Crée une instance de `Dimension` avec une largeur de zéro et une hauteur de zéro. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Crée une instance de `Dimension` dont la largeur et la hauteur sont les mêmes que celles de la dimension spécifiée. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Construit un `Dimension` et l'initialise à la largeur et à la hauteur spécifiées. |
## Champs

| Champ | Description |
| --- | --- |
| [height](#height) | La dimension de hauteur ; des valeurs négatives peuvent être utilisées. |
| [width](#width) | La dimension de largeur ; des valeurs négatives peuvent être utilisées. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Vérifie si deux objets dimension ont des valeurs égales. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Obtient la taille de cet objet `Dimension`. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Renvoie le code de hachage pour ce `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Définit la taille de cet objet `Dimension` à la taille spécifiée. |
| [setSize(double width, double height)](#setSize-double-double-) | Définit la taille de cet objet `Dimension` à la largeur et à la hauteur spécifiées en double précision. |
| [setSize(float width, float height)](#setSize-float-float-) | Définit la taille de cet objet `Dimension` à la largeur et à la hauteur spécifiées. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Renvoie une représentation sous forme de chaîne des valeurs des champs `height` et `width` de cet objet `Dimension`. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Crée une instance de `Dimension` avec une largeur de zéro et une hauteur de zéro.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Crée une instance de `Dimension` dont la largeur et la hauteur sont les mêmes que celles de la dimension spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | la dimension spécifiée pour les valeurs `width` et `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Construit un `Dimension` et l'initialise à la largeur et à la hauteur spécifiées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | la largeur spécifiée |
| hauteur | float | la hauteur spécifiée |

### height {#height}
```
public float height
```


La dimension de hauteur ; des valeurs négatives peuvent être utilisées.

### width {#width}
```
public float width
```


La dimension de largeur ; des valeurs négatives peuvent être utilisées.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Vérifie si deux objets dimension ont des valeurs égales.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Obtient la taille de cet objet `Dimension`. Cette méthode est incluse pour des raisons de complétude, afin de faire correspondre la méthode `getSize` définie par `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Renvoie le code de hachage pour ce `Dimension`.

**Returns:**
int - un code de hachage pour cet objet `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Définit la taille de cet objet `Dimension` à la taille spécifiée. Cette méthode est incluse pour des raisons de complétude, afin de faire correspondre la méthode `setSize` définie par `Component`.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | la nouvelle taille pour cet objet `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Définit la taille de cet objet `Dimension` à la largeur et à la hauteur spécifiées en double précision. Notez que si `width` ou `height` sont supérieurs à `Integer.MAX_VALUE`, ils seront réinitialisés à `Integer.MAX_VALUE`.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | double | la nouvelle largeur pour l'objet `Dimension` |
| hauteur | double | la nouvelle hauteur pour l'objet `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Définit la taille de cet objet `Dimension` à la largeur et à la hauteur spécifiées. Cette méthode est incluse pour des raisons de complétude, afin de faire correspondre la méthode `setSize` définie par `Component`.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float | la nouvelle largeur pour cet objet `Dimension` |
| hauteur | float | la nouvelle hauteur pour cet objet `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Renvoie une représentation sous forme de chaîne des valeurs des champs `height` et `width` de cet objet `Dimension`. Cette méthode est destinée à être utilisée uniquement à des fins de débogage, et le contenu ainsi que le format de la chaîne renvoyée peuvent varier selon les implémentations. La chaîne renvoyée peut être vide mais ne doit pas être `null`.

**Returns:**
java.lang.String - une représentation sous forme de chaîne de cet objet `Dimension`
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

