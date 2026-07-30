---
title: "AxisRecord"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет структуру записи Axis."
type: docs
weight: 10
url: /ru/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Представляет структуру Axis Record. Spec: запись оси предоставляет информацию об одной оси дизайна.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Конструктор |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Возвращает поле axisNameID. |
| [getAxisOrdering()](#getAxisOrdering--) | Возвращает поле axisOrdering. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Возвращает тег, идентифицирующий ось вариации дизайна. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Конструктор

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| tag | java.lang.String | Tag, spec: Тег, идентифицирующий ось вариации дизайна |
| axisNameId | int | Идентификатор имени для записей в таблице 'name', которые предоставляют строку отображения для этой оси. |
| axisOrdering | int | Значение, которое приложения могут использовать для определения первичной сортировки названий гарнитур, либо для упорядочения меток при составлении названий семейства или гарнитуры. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Возвращает поле axisNameID. Spec: Поле axisNameID предоставляет идентификатор имени, который можно использовать для получения строк из таблицы 'name', которые могут использоваться для ссылки на ось в пользовательском интерфейсе приложения.

**Returns:**
int - поле axisNameID.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Возвращает поле axisOrdering. Spec: Значение, которое приложения могут использовать для определения первичной сортировки названий гарнитур, либо для упорядочения меток при составлении названий семейства или гарнитуры.

**Returns:**
int - поле axisOrdering.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Возвращает тег, идентифицирующий ось вариации дизайна. Spec: Каждая запись оси имеет тег, обозначающий ось. Значения тегов должны соответствовать правилам тегов осей, описанным в реестре OpenType Design-Variation Axis Tag Registry.

**Returns:**
java.lang.String - Тег, идентифицирующий ось вариации дизайна.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

