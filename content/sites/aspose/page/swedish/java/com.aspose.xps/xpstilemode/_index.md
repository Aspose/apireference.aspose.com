---
title: "XpsTileMode"
second_title: "Aspose.Page för Java API-referens"
description: "Giltiga värden för TileMode-egenskapen hos kaklade penslar."
type: docs
weight: 66
url: /sv/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Giltiga värden för tiling‑penslarnas egenskap TileMode.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [FlipX](#FlipX) | Tile-arrangemanget liknar Tile-tillståndet, men alternerande kolumner av rutor vänds horisontellt. |
| [FlipXY](#FlipXY) | Tile-arrangemanget liknar Tile-tillståndet, men alternerande kolumner av rutor vänds horisontellt och alternerande rader av rutor vänds vertikalt. |
| [FlipY](#FlipY) | Tile-arrangemanget liknar Tile-tillståndet, men alternerande rader av rutor vänds vertikalt. |
| [None](#None) | I detta läge ritas endast den enda basrutan. |
| [Tile](#Tile) | I detta läge ritas basrutan och det återstående området fylls genom att upprepa basrutan så att högra kanten på varje ruta ligger mot vänstra kanten på nästa, och den nedre kanten på varje ruta ligger mot den övre kanten på nästa. |
## Metoder

| Metod | Beskrivning |
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


Tile-arrangemanget liknar Tile-tillståndet, men alternerande kolumner av rutor vänds horisontellt. Basrutan placeras enligt vad som anges av viewporten. Rutor i kolumnerna till vänster och höger om denna ruta vänds horisontellt.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Tile-arrangemanget liknar Tile-tillståndet, men alternerande kolumner av rutor vänds horisontellt och alternerande rader av rutor vänds vertikalt. Basrutan placeras enligt vad som anges av viewporten.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Tile-arrangemanget liknar Tile-tillståndet, men alternerande rader av rutor vänds vertikalt. Basrutan placeras enligt vad som anges av viewporten. Rader ovanför och under vänds vertikalt.

### None {#None}
```
public static final XpsTileMode None
```


I detta läge ritas endast den enda basrutan. Det återstående området lämnas transparent.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


I detta läge ritas basrutan och det återstående området fylls genom att upprepa basrutan så att högra kanten på varje ruta ligger mot vänstra kanten på nästa, och den nedre kanten på varje ruta ligger mot den övre kanten på nästa.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

