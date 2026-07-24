---
title: "XpsTileMode"
second_title: "Java için Aspose.Page API Referansı"
description: "Döşeme fırçalarının TileMode özelliğinin geçerli değerleri."
type: docs
weight: 66
url: /tr/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Döşeme fırçalarının TileMode özelliğinin geçerli değerleri.
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [FlipX](#FlipX) | Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif sütunları yatay olarak çevrilir. |
| [FlipXY](#FlipXY) | Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif sütunları yatay olarak ve alternatif satırları dikey olarak çevrilir. |
| [FlipY](#FlipY) | Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif satırları dikey olarak çevrilir. |
| [None](#None) | Bu modda yalnızca tek temel döşeme çizilir. |
| [Tile](#Tile) | Bu modda, temel döşeme çizilir ve kalan alan, temel döşemenin tekrarlanmasıyla doldurulur; böylece her döşemenin sağ kenarı bir sonrakinin sol kenarıyla, alt kenarı ise bir sonrakinin üst kenarıyla birleşir. |
## Yöntemler

| Yöntem | Açıklama |
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


Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif sütunları yatay olarak çevrilir. Temel döşeme, görünüm penceresi tarafından belirtildiği gibi konumlandırılır. Bu döşemenin sol ve sağ sütunlarındaki döşemeler yatay olarak çevrilir.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif sütunları yatay olarak çevrilir ve alternatif satırları dikey olarak çevrilir. Temel döşeme, görünüm penceresi tarafından belirtildiği gibi konumlandırılır.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Döşeme düzeni Tile döşeme moduna benzer, ancak döşemelerin alternatif satırları dikey olarak çevrilir. Temel döşeme, görünüm penceresi tarafından belirtildiği gibi konumlandırılır. Üstte ve alttaki satırlar dikey olarak çevrilir.

### None {#None}
```
public static final XpsTileMode None
```


Bu modda, yalnızca tek temel döşeme çizilir. Kalan alan şeffaf bırakılır.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


Bu modda, temel döşeme çizilir ve kalan alan, temel döşemenin tekrarlanmasıyla doldurulur; böylece her döşemenin sağ kenarı bir sonrakinin sol kenarıyla, alt kenarı ise bir sonrakinin üst kenarıyla birleşir.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | java.lang.String |  |

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

