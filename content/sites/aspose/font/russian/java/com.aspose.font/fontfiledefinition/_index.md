---
title: "FontFileDefinition"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет определение файла Font."
type: docs
weight: 42
url: /ru/java/com.aspose.font/fontfiledefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFileDefinition
```

Представляет определение файла Font.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [FontFileDefinition(StreamSource streamSource)](#FontFileDefinition-com.aspose.font.StreamSource-) | Создаёт определение файла, используя только содержимое файла. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-) | Создаёт определение файла, используя только содержимое файла. |
| [FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)](#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-) | Создаёт определение файла, используя только содержимое файла. |
| [FontFileDefinition(File fontFile)](#FontFileDefinition-java.io.File-) | Создает определение файла, используя файл шрифта (представленный объектом File) и содержимое файла. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Получает расширение файла. |
| [getFileName()](#getFileName--) | Получает имя файла. |
| [getOffset()](#getOffset--) | Получает смещение внутри потока. |
| [getStreamSource()](#getStreamSource--) | Получает источник потока. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFileDefinition(StreamSource streamSource) {#FontFileDefinition-com.aspose.font.StreamSource-}
```
public FontFileDefinition(StreamSource streamSource)
```


Создаёт определение файла, используя только содержимое файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |

### FontFileDefinition(String fileExtension, StreamSource streamSource) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource)
```


Создаёт определение файла, используя только содержимое файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileExtension | java.lang.String | Расширение файла шрифта. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |

### FontFileDefinition(String fileExtension, StreamSource streamSource, long offset) {#FontFileDefinition-java.lang.String-com.aspose.font.StreamSource-long-}
```
public FontFileDefinition(String fileExtension, StreamSource streamSource, long offset)
```


Создаёт определение файла, используя только содержимое файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileExtension | java.lang.String | Расширение файла шрифта. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |
| смещение | long | Смещение к данным шрифта в источнике потока. |

### FontFileDefinition(File fontFile) {#FontFileDefinition-java.io.File-}
```
public FontFileDefinition(File fontFile)
```


Создает определение файла, используя файл шрифта (представленный объектом File) и содержимое файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFile | java.io.File | Объект File. |

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
### getFileExtension() {#getFileExtension--}
```
public String getFileExtension()
```


Получает расширение файла.

**Returns:**
java.lang.String — расширение файла.
### getFileName() {#getFileName--}
```
public String getFileName()
```


Получает имя файла.

**Returns:**
java.lang.String — имя файла.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение внутри потока.

**Returns:**
long — смещение внутри потока.
### getStreamSource() {#getStreamSource--}
```
public StreamSource getStreamSource()
```


Получает источник потока.

**Returns:**
[StreamSource](../../com.aspose.font/streamsource) - The stream source.
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

