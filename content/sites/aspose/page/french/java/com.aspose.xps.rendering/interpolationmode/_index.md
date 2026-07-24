---
title: "InterpolationMode"
second_title: "Référence API Aspose.Page pour Java"
description: "Spécifie l'algorithme utilisé lorsque les images sont redimensionnées ou pivotées."
type: docs
weight: 20
url: /fr/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Spécifie l'algorithme utilisé lorsque les images sont redimensionnées ou pivotées.
## Champs

| Champ | Description |
| --- | --- |
| [Bicubic](#Bicubic) | Spécifie l'interpolation bicubique. |
| [Bilinear](#Bilinear) | Spécifie l'interpolation bilinéaire. |
| [Default](#Default) | Spécifie le mode par défaut. |
| [High](#High) | Spécifie une interpolation de haute qualité. |
| [HighQualityBicubic](#HighQualityBicubic) | Spécifie une interpolation bicubique de haute qualité. |
| [HighQualityBilinear](#HighQualityBilinear) | Spécifie une interpolation bilinéaire de haute qualité. |
| [Low](#Low) | Spécifie une interpolation de faible qualité. |
| [NearestNeighbor](#NearestNeighbor) | Spécifie l'interpolation du plus proche voisin. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Spécifie l'interpolation bicubique. Aucun préfiltrage n'est effectué. Ce mode n'est pas adapté à la réduction d'une image en dessous de 25 % de sa taille originale.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Spécifie l'interpolation bilinéaire. Aucun préfiltrage n'est effectué. Ce mode n'est pas adapté à la réduction d'une image en dessous de 50 % de sa taille originale.

### Default {#Default}
```
public static final InterpolationMode Default
```


Spécifie le mode par défaut.

### High {#High}
```
public static final InterpolationMode High
```


Spécifie une interpolation de haute qualité.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Spécifie une interpolation bicubique de haute qualité. Un préfiltrage est effectué pour garantir une réduction de haute qualité. Ce mode produit les images transformées de la plus haute qualité.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Spécifie une interpolation bilinéaire de haute qualité. Un préfiltrage est effectué pour garantir une réduction de haute qualité.

### Low {#Low}
```
public static final InterpolationMode Low
```


Spécifie une interpolation de faible qualité.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Spécifie l'interpolation du plus proche voisin.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

