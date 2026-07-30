---
title: "FileSystemStreamSource"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет источник потока, основанный на файловой системе."
type: docs
weight: 31
url: /ru/java/com.aspose.font/filesystemstreamsource/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.StreamSource](../../com.aspose.font/streamsource)
```
public class FileSystemStreamSource extends StreamSource
```

Представляет источник потока, основанный на файловой системе.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [FileSystemStreamSource(String fileName)](#FileSystemStreamSource-java.lang.String-) | Инициализирует новый объект FileSystemStreamSource. |
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует объект FileSystemStreamSource. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileName()](#getFileName--) | Получает имя файла. |
| [getFontStream()](#getFontStream--) | Возвращает поток файла шрифта. |
| [getOffset()](#getOffset--) | Получает смещение внутри источника. |
| [hashCode()](#hashCode--) |  |
| [mustCloseAfterUse()](#mustCloseAfterUse--) | Наследники могут предотвратить закрытие потока. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setFileName(String value)](#setFileName-java.lang.String-) | Устанавливает имя файла. |
| [setOffset(long value)](#setOffset-long-) | Устанавливает смещение внутри источника. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileSystemStreamSource(String fileName) {#FileSystemStreamSource-java.lang.String-}
```
public FileSystemStreamSource(String fileName)
```


Инициализирует новый объект FileSystemStreamSource.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileName | java.lang.String | Имя файла. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Клонирует объект FileSystemStreamSource.

**Returns:**
java.lang.Object — копия объекта FileSystemStreamSource.
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
### getFileName() {#getFileName--}
```
public String getFileName()
```


Получает имя файла.

**Returns:**
java.lang.String — имя файла.
### getFontStream() {#getFontStream--}
```
public InputStream getFontStream()
```


Возвращает поток файла шрифта. Не забудьте закрыть поток после использования.

**Returns:**
java.io.InputStream - поток файла шрифта.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение внутри источника.

**Returns:**
long - Смещение внутри источника.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mustCloseAfterUse() {#mustCloseAfterUse--}
```
public boolean mustCloseAfterUse()
```


Наследники могут предотвратить закрытие потока. Возвращает true, если источник потока хочет, чтобы поток был закрыт после использования. В противном случае возвращает false.

**Returns:**
boolean - True, если источник потока хочет, чтобы поток был закрыт после использования, иначе false.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setFileName(String value) {#setFileName-java.lang.String-}
```
public void setFileName(String value)
```


Устанавливает имя файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Имя файла. |

### setOffset(long value) {#setOffset-long-}
```
public void setOffset(long value)
```


Устанавливает смещение внутри источника.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | long | Смещение внутри источника. |

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

