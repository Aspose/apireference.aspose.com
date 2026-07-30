---
title: "TtcFontFileDefinition"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет определение файла для шрифта TTC."
type: docs
weight: 79
url: /ru/java/com.aspose.font/ttcfontfiledefinition/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontFileDefinition](../../com.aspose.font/fontfiledefinition)
```
public class TtcFontFileDefinition extends FontFileDefinition
```

Представляет определение файла для шрифта TTC.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)](#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-) | Создаёт определение файла, используя только содержимое файла. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileExtension()](#getFileExtension--) | Получает расширение файла. |
| [getFileName()](#getFileName--) | Получает имя файла. |
| [getFontIndex()](#getFontIndex--) | Получает индекс шрифта внутри TTC Font. |
| [getOffset()](#getOffset--) | Получает смещение внутри потока. |
| [getStreamSource()](#getStreamSource--) | Получает источник потока. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset) {#TtcFontFileDefinition-int-java.lang.String-com.aspose.font.StreamSource-long-}
```
public TtcFontFileDefinition(int fontIndex, String fileExtension, StreamSource streamSource, long offset)
```


Создаёт определение файла, используя только содержимое файла.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontIndex | int | Индекс шрифта в коллекции TTC шрифтов. |
| fileExtension | java.lang.String | Расширение коллекции файлов шрифтов. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник коллекции файлов шрифтов. |
| смещение | long | Смещение к данным шрифта в коллекции файлов шрифтов, см. заголовок TTC, таблицу смещений в спецификации файла шрифта OpenType |

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
### getFontIndex() {#getFontIndex--}
```
public long getFontIndex()
```


Получает индекс шрифта внутри TTC Font.

**Returns:**
long — индекс шрифта внутри TTC.
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

