---
title: "StreamResult"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет результат операции в виде потока."
type: docs
weight: 18
url: /ru/java/com.aspose.page.plugins/streamresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StreamResult implements IOperationResult
```

Представляет результат операции в виде потока.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StreamResult(OutputStream stream)](#StreamResult-java.io.OutputStream-) | Инициализирует новый экземпляр с указанным объектом потока. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Получает необработанные данные. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Указывает, является ли результат массивом байтов. |
| [isFile()](#isFile--) | Указывает, является ли результат путем к выходному файлу. |
| [isStream()](#isStream--) | Указывает, является ли результат путем к выходному файлу. |
| [isString()](#isString--) | Указывает, является ли результат строкой. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Пытается преобразовать результат в файл. |
| [toStream()](#toStream--) | Пытается преобразовать результат в объект потока. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamResult(OutputStream stream) {#StreamResult-java.io.OutputStream-}
```
public StreamResult(OutputStream stream)
```


Инициализирует новый экземпляр с указанным объектом потока.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.OutputStream | Объект потока |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public final Object getData()
```


Получает необработанные данные.

**Returns:**
java.lang.Object - Объект, представляющий выходные данные.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Указывает, является ли результат массивом байтов.

**Returns:**
boolean -  true  если результат является массивом байтов; иначе  false .
### isFile() {#isFile--}
```
public final boolean isFile()
```


Указывает, является ли результат путем к выходному файлу.

**Returns:**
boolean -  true  если результат является файлом; иначе  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Указывает, является ли результат путем к выходному файлу.

**Returns:**
boolean -  true  если результат является объектом потока; иначе  false .
### isString() {#isString--}
```
public final boolean isString()
```


Указывает, является ли результат строкой.

**Returns:**
boolean -  true  если результат является строкой; иначе  false .
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Пытается преобразовать результат в файл.

**Returns:**
java.lang.String - Строка, представляющая путь к выходному файлу, если результат является файлом; иначе  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Пытается преобразовать результат в объект потока.

**Returns:**
java.io.OutputStream - Объект потока, представляющий выходные данные, если результат является потоком; иначе  null .
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

