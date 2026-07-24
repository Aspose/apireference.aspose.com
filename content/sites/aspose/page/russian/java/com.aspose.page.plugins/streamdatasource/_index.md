---
title: "StreamDataSource"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет потоковый источник данных для операций загрузки и сохранения плагина."
type: docs
weight: 17
url: /ru/java/com.aspose.page.plugins/streamdatasource/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IDataSource](../../com.aspose.page.plugins/idatasource)
```
public final class StreamDataSource implements IDataSource
```

Представляет потоковый источник данных для операций загрузки и сохранения плагина.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StreamDataSource(Object data)](#StreamDataSource-java.lang.Object-) | Инициализирует новый потоковый источник данных с указанным объектом потока. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Получает объект потока текущего источника данных. |
| [getDataType()](#getDataType--) | Тип источника данных (поток). |
| [getInputStream()](#getInputStream--) |  |
| [getOutputStream()](#getOutputStream--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StreamDataSource(Object data) {#StreamDataSource-java.lang.Object-}
```
public StreamDataSource(Object data)
```


Инициализирует новый потоковый источник данных с указанным объектом потока.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | java.lang.Object | Объект потока |

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


Получает объект потока текущего источника данных.

**Returns:**
java.lang.Object
### getDataType() {#getDataType--}
```
public final int getDataType()
```


Тип источника данных (поток).

**Returns:**
int
### getInputStream() {#getInputStream--}
```
public final InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getOutputStream() {#getOutputStream--}
```
public final OutputStream getOutputStream()
```




**Returns:**
java.io.OutputStream
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

