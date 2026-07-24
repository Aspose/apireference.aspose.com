---
title: "XpsTileMode"
second_title: "Aspose.Page per Java API Reference"
description: "Valori validi della proprietà TileMode dei pennelli di piastrellatura."
type: docs
weight: 66
url: /it/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Valori validi della proprietà TileMode dei pennelli di tiling.
## Campi

| Campo | Descrizione |
| --- | --- |
| [FlipX](#FlipX) | La disposizione delle piastrelle è simile alla modalità Tile, ma le colonne alternate di piastrelle sono capovolte orizzontalmente. |
| [FlipXY](#FlipXY) | La disposizione delle piastrelle è simile alla modalità Tile, ma le colonne alternate di piastrelle sono capovolte orizzontalmente e le righe alternate di piastrelle sono capovolte verticalmente. |
| [FlipY](#FlipY) | La disposizione delle piastrelle è simile alla modalità Tile, ma le righe alternate di piastrelle sono capovolte verticalmente. |
| [None](#None) | In questa modalità, viene disegnata solo la singola piastrella di base. |
| [Tile](#Tile) | In questa modalità, la piastrella di base è disegnata e l'area rimanente viene riempita ripetendo la piastrella di base in modo che il bordo destro di ogni piastrella si trovi accanto al bordo sinistro della successiva, e il bordo inferiore di ogni piastrella si trovi accanto al bordo superiore della successiva. |
## Metodi

| Metodo | Descrizione |
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


La disposizione delle piastrelle è simile alla modalità Tile, ma le colonne alternate di piastrelle sono capovolte orizzontalmente. La piastrella di base è posizionata come specificato dalla viewport. Le piastrelle nelle colonne a sinistra e a destra di questa piastrella sono capovolte orizzontalmente.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


La disposizione delle piastrelle è simile alla modalità Tile, ma le colonne alternate di piastrelle sono capovolte orizzontalmente e le righe alternate di piastrelle sono capovolte verticalmente. La piastrella di base è posizionata come specificato dalla viewport.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


La disposizione delle piastrelle è simile alla modalità Tile, ma le righe alternate di piastrelle sono capovolte verticalmente. La piastrella di base è posizionata come specificato dalla viewport. Le righe sopra e sotto sono capovolte verticalmente.

### None {#None}
```
public static final XpsTileMode None
```


In questa modalità, viene disegnata solo la singola piastrella di base. L'area rimanente rimane trasparente.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


In questa modalità, la piastrella di base è disegnata e l'area rimanente viene riempita ripetendo la piastrella di base in modo che il bordo destro di ogni piastrella si trovi accanto al bordo sinistro della successiva, e il bordo inferiore di ogni piastrella si trovi accanto al bordo superiore della successiva.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

