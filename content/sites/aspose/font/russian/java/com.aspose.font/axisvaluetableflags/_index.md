---
title: "TtfStatTable.AxisValueTableFlags"
second_title: "Справочник API Aspose.Font for Java"
description: "Указывает флаги таблицы значений оси"
type: docs
weight: 10
url: /ru/java/com.aspose.font/ttfstattable.axisvaluetableflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TtfStatTable.AxisValueTableFlags extends Enum<TtfStatTable.AxisValueTableFlags>
```

Указывает флаги таблицы значений оси
## Поля

| Поле | Описание |
| --- | --- |
| [ElidableAxisValueName](#ElidableAxisValueName) | Если установлен, это указывает, что значение оси представляет "normal" значение для оси и может быть опущено при составлении строк имен. |
| [OlderSiblingFontAttribute](#OlderSiblingFontAttribute) | Если установлен, эта таблица значений оси предоставляет информацию о значениях оси, применимую к другим шрифтам в той же семье шрифтов. |
| [Reserved](#Reserved) | Зарезервировано для будущего использования |
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
### ElidableAxisValueName {#ElidableAxisValueName}
```
public static final TtfStatTable.AxisValueTableFlags ElidableAxisValueName
```


Если установлен, это указывает, что значение оси представляет "normal" значение для оси и может быть опущено при составлении строк имен.

### OlderSiblingFontAttribute {#OlderSiblingFontAttribute}
```
public static final TtfStatTable.AxisValueTableFlags OlderSiblingFontAttribute
```


Если установлен, эта таблица значений оси предоставляет информацию о значениях оси, применимую к другим шрифтам в той же семье шрифтов. Это используется, если другие шрифты были выпущены ранее и не включали информацию о значениях некоторых осей. Если более новые версии других шрифтов включают эту информацию сами и присутствуют, то эта таблица игнорируется.

### Reserved {#Reserved}
```
public static final TtfStatTable.AxisValueTableFlags Reserved
```


Зарезервировано для будущего использования

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
public static TtfStatTable.AxisValueTableFlags valueOf(String name)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

**Returns:**
[AxisValueTableFlags](../../com.aspose.font/axisvaluetableflags)
### values() {#values--}
```
public static TtfStatTable.AxisValueTableFlags[] values()
```




**Returns:**
com.aspose.font.TtfStatTable.AxisValueTableFlags[]
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

