---
title: "FontFactory"
second_title: "Справочник API Aspose.Font for Java"
description: "Содержит функциональность для открытия шрифтов разных типов и другие методы для создания различных объектов."
type: docs
weight: 41
url: /ru/java/com.aspose.font/fontfactory/
---
**Inheritance:**
java.lang.Object
```
public class FontFactory
```

Содержит функциональность для открытия шрифтов разных типов и другие методы для создания различных объектов.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [FontFactory()](#FontFactory--) | Конструктор |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Открывает шрифт, используя объект FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Открывает шрифт, используя тип шрифта и массив байтов данных шрифта. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Открывает шрифт, используя тип шрифта и источник потока. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Открывает шрифт, используя тип шрифта и имя файла шрифта. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontFactory() {#FontFactory--}
```
public FontFactory()
```


Конструктор

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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public Font open(FontDefinition fontDefinition)
```


Открывает шрифт, используя объект FontDefinition.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | Объект определения шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public Font open(FontType fontType, byte[] fontData)
```


Открывает шрифт, используя тип шрифта и массив байтов данных шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fontData | byte[] | Массив байтов для загрузки шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public Font open(FontType fontType, StreamSource fontStreamSource)
```


Открывает шрифт, используя тип шрифта и источник потока.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | Потоковый источник для шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public Font open(FontType fontType, String fileName)
```


Открывает шрифт, используя тип шрифта и имя файла шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileName | java.lang.String | Имя файла шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
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

