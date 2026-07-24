---
title: "XpsTileMode"
second_title: "Référence API Aspose.Page pour Java"
description: "Valeurs valides de la propriété TileMode des pinceaux de carrelage."
type: docs
weight: 66
url: /fr/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Valeurs valides de la propriété TileMode des pinceaux de mosaïque.
## Champs

| Champ | Description |
| --- | --- |
| [FlipX](#FlipX) | L'agencement des tuiles est similaire au mode Tile, mais les colonnes alternées de tuiles sont retournées horizontalement. |
| [FlipXY](#FlipXY) | L'agencement des tuiles est similaire au mode Tile, mais les colonnes alternées de tuiles sont retournées horizontalement et les rangées alternées de tuiles sont retournées verticalement. |
| [FlipY](#FlipY) | L'agencement des tuiles est similaire au mode Tile, mais les rangées alternées de tuiles sont retournées verticalement. |
| [None](#None) | Dans ce mode, seule la tuile de base unique est dessinée. |
| [Tile](#Tile) | Dans ce mode, la tuile de base est dessinée et la zone restante est remplie en répétant la tuile de base de façon que le bord droit de chaque tuile touche le bord gauche de la suivante, et le bord inférieur de chaque tuile touche le bord supérieur de la suivante. |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


L'agencement des tuiles est similaire au mode Tile, mais les colonnes alternées de tuiles sont retournées horizontalement. La tuile de base est positionnée comme spécifié par le viewport. Les tuiles dans les colonnes à gauche et à droite de cette tuile sont retournées horizontalement.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


L'agencement des tuiles est similaire au mode Tile, mais les colonnes alternées de tuiles sont retournées horizontalement et les rangées alternées de tuiles sont retournées verticalement. La tuile de base est positionnée comme spécifié par le viewport.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


L'agencement des tuiles est similaire au mode Tile, mais les rangées alternées de tuiles sont retournées verticalement. La tuile de base est positionnée comme spécifié par le viewport. Les rangées au-dessus et en dessous sont retournées verticalement.

### None {#None}
```
public static final XpsTileMode None
```


Dans ce mode, seule la tuile de base unique est dessinée. La zone restante reste transparente.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


Dans ce mode, la tuile de base est dessinée et la zone restante est remplie en répétant la tuile de base de façon que le bord droit de chaque tuile touche le bord gauche de la suivante, et le bord inférieur de chaque tuile touche le bord supérieur de la suivante.

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

