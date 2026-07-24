---
title: "InterpolationMode"
second_title: "Справочник API Aspose.Page для Java"
description: "Указывает алгоритм, используемый при масштабировании или вращении изображений."
type: docs
weight: 20
url: /ru/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Указывает алгоритм, используемый при масштабировании или вращении изображений.
## Поля

| Поле | Описание |
| --- | --- |
| [Bicubic](#Bicubic) | Указывает бикубическую интерполяцию. |
| [Bilinear](#Bilinear) | Указывает билинейную интерполяцию. |
| [Default](#Default) | Указывает режим по умолчанию. |
| [High](#High) | Указывает интерполяцию высокого качества. |
| [HighQualityBicubic](#HighQualityBicubic) | Указывает высококачественную бикубическую интерполяцию. |
| [HighQualityBilinear](#HighQualityBilinear) | Указывает высококачественную билинейную интерполяцию. |
| [Low](#Low) | Указывает интерполяцию низкого качества. |
| [NearestNeighbor](#NearestNeighbor) | Указывает интерполяцию ближайшего соседа. |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Указывает бикубическую интерполяцию. Предварительная фильтрация не выполняется. Этот режим не подходит для уменьшения изображения ниже 25 % от его исходного размера.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Указывает билинейную интерполяцию. Предварительная фильтрация не выполняется. Этот режим не подходит для уменьшения изображения ниже 50 % от его исходного размера.

### Default {#Default}
```
public static final InterpolationMode Default
```


Указывает режим по умолчанию.

### High {#High}
```
public static final InterpolationMode High
```


Указывает интерполяцию высокого качества.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Указывает высококачественную бикубическую интерполяцию. Выполняется предварительная фильтрация для обеспечения высокого качества уменьшения. Этот режим обеспечивает наивысшее качество преобразованных изображений.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Указывает высококачественную билинейную интерполяцию. Выполняется предварительная фильтрация для обеспечения высокого качества уменьшения.

### Low {#Low}
```
public static final InterpolationMode Low
```


Указывает интерполяцию низкого качества.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Указывает интерполяцию ближайшего соседа.

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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

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

