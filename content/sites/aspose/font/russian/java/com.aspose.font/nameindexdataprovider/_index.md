---
title: "NameIndexDataProvider"
second_title: "Справочник API Aspose.Font for Java"
description: "Предоставляет настройки, общие для шрифтов CFF."
type: docs
weight: 68
url: /ru/java/com.aspose.font/nameindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class NameIndexDataProvider implements ICffIndexDataProvider
```

Предоставляет настройки, общие для шрифтов CFF.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [NameIndexDataProvider()](#NameIndexDataProvider--) |  |
## Методы

| Метод | Описание |
| --- | --- |
| [addName(String name)](#addName-java.lang.String-) | Добавляет имя шрифта в структуру Name INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Получает имя шрифта по указанному индексу. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Получает количество объектов в структуре CFF INDEX. |
| [getName(int index)](#getName-int-) | Получает имя шрифта по указанному индексу. |
| [getRawBytes()](#getRawBytes--) | Получает все байты структуры CFF INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeName(int index)](#removeName-int-) | Удаляет имя по указанному индексу. |
| [set(int index, String name)](#set-int-java.lang.String-) | Указывает имя шрифта по указанному индексу. |
| [setName(String name, int index)](#setName-java.lang.String-int-) | Устанавливает имя шрифта по указанному индексу. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NameIndexDataProvider() {#NameIndexDataProvider--}
```
public NameIndexDataProvider()
```


### addName(String name) {#addName-java.lang.String-}
```
public abstract void addName(String name)
```


Добавляет имя шрифта в структуру Name INDEX. Используйте этот метод с осторожностью, потому что каждое имя шрифта в структуре CFF Name INDEX должно иметь соответствующую структуру DICT в верхнем индексе Top DICT согласно спецификации CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String |  |

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
### get(int index) {#get-int-}
```
public abstract String get(int index)
```


Получает имя шрифта по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс шрифта. |

**Returns:**
java.lang.String - Имя шрифта.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public abstract int getCount()
```


Получает количество объектов в структуре CFF INDEX.

**Returns:**
int
### getName(int index) {#getName-int-}
```
public abstract String getName(int index)
```


Получает имя шрифта по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс шрифта. |

**Returns:**
java.lang.String - Имя шрифта.
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Получает все байты структуры CFF INDEX.

**Returns:**
byte[] - Байты структуры CFF INDEX
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




### removeName(int index) {#removeName-int-}
```
public abstract void removeName(int index)
```


Удаляет имя по указанному индексу. Используйте этот метод с осторожностью, потому что каждое имя шрифта в структуре CFF Name INDEX должно иметь соответствующую структуру DICT в верхнем индексе Top DICT согласно спецификации CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс шрифта. |

### set(int index, String name) {#set-int-java.lang.String-}
```
public abstract void set(int index, String name)
```


Указывает имя шрифта по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс шрифта. |
| имя | java.lang.String | Имя шрифта. |

### setName(String name, int index) {#setName-java.lang.String-int-}
```
public abstract void setName(String name, int index)
```


Устанавливает имя шрифта по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя шрифта. |
| индекс | int | Индекс шрифта. |

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

