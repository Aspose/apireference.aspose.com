---
title: "StringIndexDataProvider"
second_title: "Справочник API Aspose.Font for Java"
description: "Объявляет функциональность для доступа к структуре CFF String INDEX."
type: docs
weight: 75
url: /ru/java/com.aspose.font/stringindexdataprovider/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.ICffIndexDataProvider](../../com.aspose.font/icffindexdataprovider)
```
public abstract class StringIndexDataProvider implements ICffIndexDataProvider
```

Объявляет функциональность для доступа к структуре CFF String INDEX.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StringIndexDataProvider()](#StringIndexDataProvider--) |  |
## Методы

| Метод | Описание |
| --- | --- |
| [addString(String value)](#addString-java.lang.String-) | Добавляет строку в структуру CFF String INDEX. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Получает/устанавливает строку по указанному индексу. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Количество объектов в структуре CFF INDEX. |
| [getRawBytes()](#getRawBytes--) | Получает все байты структуры CFF INDEX. |
| [getString(int index)](#getString-int-) | Получает строку по указанному индексу из структуры CFF String INDEX. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeString(int index)](#removeString-int-) | Удаляет строку из структуры CFF String Index по указанному индексу. |
| [set(int index, String value)](#set-int-java.lang.String-) |  |
| [setString(String value, int index)](#setString-java.lang.String-int-) | Устанавливает строку в структуру CFF String Index по указанному индексу. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringIndexDataProvider() {#StringIndexDataProvider--}
```
public StringIndexDataProvider()
```


### addString(String value) {#addString-java.lang.String-}
```
public abstract void addString(String value)
```


Добавляет строку в структуру CFF String INDEX.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Значение строки |

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


Получает/устанавливает строку по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс строки, индекс означает порядковый номер в структуре CFF INDEX, а не SID |

**Returns:**
java.lang.String - Строка
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


Количество объектов в структуре CFF INDEX.

**Returns:**
int
### getRawBytes() {#getRawBytes--}
```
public abstract byte[] getRawBytes()
```


Получает все байты структуры CFF INDEX.

**Returns:**
byte[] - Байты структуры CFF INDEX
### getString(int index) {#getString-int-}
```
public abstract String getString(int index)
```


Получает строку по указанному индексу из структуры CFF String INDEX.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс строки, индекс означает порядковый номер в структуре CFF INDEX, а не SID |

**Returns:**
java.lang.String - Строка
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




### removeString(int index) {#removeString-int-}
```
public abstract void removeString(int index)
```


Удаляет строку из структуры CFF String Index по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс строки, индекс означает порядковый номер в структуре CFF INDEX, а не SID |

### set(int index, String value) {#set-int-java.lang.String-}
```
public abstract void set(int index, String value)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int |  |
| значение | java.lang.String |  |

### setString(String value, int index) {#setString-java.lang.String-int-}
```
public abstract void setString(String value, int index)
```


Устанавливает строку в структуру CFF String Index по указанному индексу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Значение строки |
| индекс | int | Индекс строки, индекс означает порядковый номер в структуре CFF INDEX, а не SID |

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

