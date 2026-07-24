---
title: "XpsTileMode"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Valores válidos de la propiedad TileMode de los pinceles de mosaico."
type: docs
weight: 66
url: /es/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Valores válidos de la propiedad TileMode de los pinceles de mosaico.
## Campos

| Campo | Descripción |
| --- | --- |
| [FlipX](#FlipX) | La disposición de los mosaicos es similar al modo Tile, pero las columnas alternas de mosaicos se invierten horizontalmente. |
| [FlipXY](#FlipXY) | La disposición de los mosaicos es similar al modo Tile, pero las columnas alternas de mosaicos se invierten horizontalmente y las filas alternas de mosaicos se invierten verticalmente. |
| [FlipY](#FlipY) | La disposición de los mosaicos es similar al modo Tile, pero las filas alternas de mosaicos se invierten verticalmente. |
| [None](#None) | En este modo, solo se dibuja el mosaico base único. |
| [Tile](#Tile) | En este modo, se dibuja el mosaico base y el área restante se rellena repitiendo el mosaico base de modo que el borde derecho de cada mosaico toque el borde izquierdo del siguiente, y el borde inferior de cada mosaico toque el borde superior del siguiente. |
## Métodos

| Método | Descripción |
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


La disposición de los mosaicos es similar al modo Tile, pero las columnas alternas de mosaicos se invierten horizontalmente. El mosaico base se posiciona según lo especificado por la ventana gráfica. Los mosaicos en las columnas a la izquierda y a la derecha de este mosaico se invierten horizontalmente.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


La disposición de los mosaicos es similar al modo Tile, pero las columnas alternas de mosaicos se invierten horizontalmente y las filas alternas de mosaicos se invierten verticalmente. El mosaico base se posiciona según lo especificado por la ventana gráfica.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


La disposición de los mosaicos es similar al modo Tile, pero las filas alternas de mosaicos se invierten verticalmente. El mosaico base se posiciona según lo especificado por la ventana gráfica. Las filas arriba y abajo se invierten verticalmente.

### None {#None}
```
public static final XpsTileMode None
```


En este modo, solo se dibuja el mosaico base único. El área restante queda transparente.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


En este modo, se dibuja el mosaico base y el área restante se rellena repitiendo el mosaico base de modo que el borde derecho de cada mosaico toque el borde izquierdo del siguiente, y el borde inferior de cada mosaico toque el borde superior del siguiente.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String |  |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

