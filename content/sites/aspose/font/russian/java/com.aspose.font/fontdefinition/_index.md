---
title: "FontDefinition"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет определение набора файлов Font."
type: docs
weight: 38
url: /ru/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

Представляет определение набора файлов шрифта. Этот класс содержит поля, которые не связаны с внутренними данными шрифта. Эти поля описывают размещение шрифта и другие данные, необходимые для загрузки шрифта из какого-либо источника шрифта (файл, память и т.д.).
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Создаёт определение шрифта в одном файле. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Создаёт определение шрифта из нескольких файлов. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Создаёт определение шрифта из нескольких файлов. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Создаёт определение шрифта из нескольких файлов. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Создаёт определение шрифта из нескольких файлов. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | Получает коллекцию определений файлов. |
| [getFontName()](#getFontName--) | Возвращает имя шрифта. |
| [getFontNames()](#getFontNames--) | Получает имена шрифтов как MultiLanguageString. |
| [getFontType()](#getFontType--) | Получает тип шрифта. |
| [getPostscriptName()](#getPostscriptName--) | Получает имя Postscript шрифта. |
| [getPostscriptNames()](#getPostscriptNames--) | Получает имена Postscript шрифтов как MultiLanguageString. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | Возвращает FontDefinition для источника потока шрифта и типа шрифта. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | Возвращает FontDefinition для файла шрифта и типа шрифта. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileExtension | java.lang.String | Расширение файла шрифта. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontName | java.lang.String | Имя шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileExtension | java.lang.String | Расширение файла шрифта. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontName | java.lang.String | Имя шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


Создаёт определение шрифта в одном файле.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontName | java.lang.String | Имя шрифта. |
| postscriptName | java.lang.String | Имя Postscript шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


Создаёт определение шрифта из нескольких файлов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Массив объектов FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Создаёт определение шрифта из нескольких файлов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontName | java.lang.String | Имя шрифта. |
| postscriptName | java.lang.String | Имя Postscript шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Массив объектов FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


Создаёт определение шрифта из нескольких файлов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Имена шрифтов. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Имена Postscript шрифтов. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Создаёт определение шрифта из нескольких файлов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Имена шрифтов. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Имена Postscript шрифтов. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Массив объектов FontFileDefinition. |

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
### getFileDefinitions() {#getFileDefinitions--}
```
public FontFileDefinition[] getFileDefinitions()
```


Получает коллекцию определений файлов.

**Returns:**
com.aspose.font.FontFileDefinition[] - Коллекция определений файлов.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Возвращает имя шрифта.

**Returns:**
java.lang.String - Имя шрифта.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Получает имена шрифтов как MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Получает тип шрифта.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


Получает имя Postscript шрифта.

**Returns:**
java.lang.String - Имя Postscript шрифта.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Получает имена Postscript шрифтов как MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names as a  MultiLanguageString .
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




### open(StreamSource source, FontType fontType) {#open-com.aspose.font.StreamSource-com.aspose.font.FontType-}
```
public static FontDefinition open(StreamSource source, FontType fontType)
```


Возвращает FontDefinition для источника потока шрифта и типа шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Источник потока шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


Возвращает FontDefinition для файла шрифта и типа шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileName | java.lang.String | Имя файла шрифта. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
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

