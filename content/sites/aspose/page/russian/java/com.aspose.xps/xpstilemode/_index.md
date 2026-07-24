---
title: "XpsTileMode"
second_title: "Справочник API Aspose.Page для Java"
description: "Допустимые значения свойства TileMode кистей заливки."
type: docs
weight: 66
url: /ru/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Допустимые значения свойства TileMode мозаичных кистей.
## Поля

| Поле | Описание |
| --- | --- |
| [FlipX](#FlipX) | Расположение плиток аналогично режиму Tile, но чередующиеся столбцы плиток отражаются по горизонтали. |
| [FlipXY](#FlipXY) | Расположение плиток аналогично режиму Tile, но чередующиеся столбцы плиток отражаются по горизонтали, а чередующиеся строки плиток — по вертикали. |
| [FlipY](#FlipY) | Расположение плиток аналогично режиму Tile, но чередующиеся строки плиток отражаются по вертикали. |
| [None](#None) | В этом режиме рисуется только одна базовая плитка. |
| [Tile](#Tile) | В этом режиме базовая плитка рисуется, а оставшаяся область заполняется повторением базовой плитки так, чтобы правый край каждой плитки соприкасался с левым краем следующей, а нижний край каждой плитки — с верхним краем следующей. |
## Методы

| Метод | Описание |
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


Расположение плиток аналогично режиму Tile, но чередующиеся столбцы плиток отражаются по горизонтали. Базовая плитка позиционируется согласно указанному вьюпорту. Плитки в столбцах слева и справа от этой плитки отражаются по горизонтали.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Расположение плиток аналогично режиму Tile, но чередующиеся столбцы плиток отражаются по горизонтали, а чередующиеся строки плиток — по вертикали. Базовая плитка позиционируется согласно указанному вьюпорту.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Расположение плиток аналогично режиму Tile, но чередующиеся строки плиток отражаются по вертикали. Базовая плитка позиционируется согласно указанному вьюпорту. Строки выше и ниже отражаются по вертикали.

### None {#None}
```
public static final XpsTileMode None
```


В этом режиме рисуется только одна базовая плитка. Оставшаяся область остаётся прозрачной.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


В этом режиме базовая плитка рисуется, а оставшаяся область заполняется повторением базовой плитки так, чтобы правый край каждой плитки соприкасался с левым краем следующей, а нижний край каждой плитки — с верхним краем следующей.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

