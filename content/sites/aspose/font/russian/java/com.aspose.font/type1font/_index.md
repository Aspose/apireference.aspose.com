---
title: "Type1Font"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет шрифт Type1."
type: docs
weight: 115
url: /ru/java/com.aspose.font/type1font/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class Type1Font extends Font
```

Представляет шрифт Type1.
## Методы

| Метод | Описание |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Преобразует шрифт в другой формат. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Возвращает массив всех идентификаторов глифов, доступных в шрифте. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | Получает кодировку шрифта. |
| [getFontDefinition()](#getFontDefinition--) | Получает определение шрифта. |
| [getFontFamily()](#getFontFamily--) | Получает семейство шрифта. |
| [getFontName()](#getFontName--) | Получает имя гарнитуры шрифта. |
| [getFontNames()](#getFontNames--) | Получает имена шрифта. |
| [getFontSaver()](#getFontSaver--) | Получает функциональность сохранения шрифта. |
| [getFontStyle()](#getFontStyle--) | Получает стиль шрифта. |
| [getFontType()](#getFontType--) | Получает тип шрифта. |
| [getGlyphAccessor()](#getGlyphAccessor--) | Доступ к глифам шрифта. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Возвращает глиф по идентификатору глифа. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | Возвращает глиф по идентификатору глифа. |
| [getGlyphById(long id)](#getGlyphById-long-) | Возвращает глиф по идентификатору глифа. |
| [getGlyphIdType()](#getGlyphIdType--) | Спецификация типа идентификатора глифа. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Получает представление глифов для текста. |
| [getMetrics()](#getMetrics--) | Получает метрики шрифта. |
| [getNumGlyphs()](#getNumGlyphs--) | Получает количество глифов в шрифте. |
| [getPostscriptNames()](#getPostscriptNames--) | Получает имена PostScript‑шрифта. |
| [getStyle()](#getStyle--) | Получает стиль шрифта. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Открывает шрифт, используя объект FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Открывает шрифт, используя тип шрифта и массив байтов данных шрифта. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Открывает шрифт, используя тип шрифта и источник потока. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Открывает шрифт, используя тип шрифта и имя файла шрифта. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Сохраняет шрифт в оригинальном формате. |
| [save(String fileName)](#save-java.lang.String-) | Сохраняет шрифт в оригинальном формате. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Сохраняет шрифт в указанный формат. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Сеттер семейства шрифта пока не реализован. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Сеттер имени гарнитуры шрифта пока не реализован. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Сеттер стиля пока не реализован. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Преобразует шрифт в другой формат.

> ```
> Note: TTF Font type is now supported only.
> ```

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип формата шрифта для преобразования. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public GlyphId[] getAllGlyphIds()
```


Возвращает массив всех идентификаторов глифов, доступных в шрифте. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа Type1 Font может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ).

**Returns:**
com.aspose.font.GlyphId[]
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


Получает кодировку шрифта.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


Получает определение шрифта.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


Получает семейство шрифта.

**Returns:**
java.lang.String - Семейство шрифта.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Получает имя гарнитуры шрифта.

**Returns:**
java.lang.String - Имя гарнитуры шрифта.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Получает имена шрифта.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


Получает функциональность сохранения шрифта.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


Получает стиль шрифта. Это значение вычисляется и представляется в обобщённом типе.

**Returns:**
int - Стиль шрифта. Обычно комбинация константных флагов класса FontStyle или 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Получает тип шрифта. Возвращает значение FontType.Type1.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


Доступ к глифам шрифта. Получает глифы и идентификаторы глифов.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public Glyph getGlyphById(GlyphId id)
```


Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа Type1 Font может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


Возвращает глиф по идентификатору глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | java.lang.String | Идентификатор глифа. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


Возвращает глиф по идентификатору глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | long | Идентификатор глифа. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Спецификация типа идентификатора глифа.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype)
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Получает представление глифов для текста.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| text | java.lang.String | Входной текст. |

**Returns:**
com.aspose.font.GlyphId[] — массив GlyphId.
### getMetrics() {#getMetrics--}
```
public IFontMetrics getMetrics()
```


Получает метрики шрифта.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Получает количество глифов в шрифте.

**Returns:**
int — количество глифов в шрифте.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Получает имена PostScript‑шрифта.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names
### getStyle() {#getStyle--}
```
public String getStyle()
```


Получает стиль шрифта. Это необработанное строковое значение, предоставляемое файлом шрифта.

**Returns:**
java.lang.String — стиль шрифта.
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
public static Font open(FontDefinition fontDefinition)
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
public static Font open(FontType fontType, byte[] fontData)
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
public static Font open(FontType fontType, StreamSource fontStreamSource)
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
public static Font open(FontType fontType, String fileName)
```


Открывает шрифт, используя тип шрифта и имя файла шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип шрифта. |
| fileName | java.lang.String | Имя файла шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Сохраняет шрифт в оригинальном формате.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | java.io.OutputStream | Поток для сохранения шрифта. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Сохраняет шрифт в оригинальном формате.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileName | java.lang.String | Файл для сохранения шрифта. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


Сохраняет шрифт в указанный формат.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | java.io.OutputStream | поток для сохранения шрифта |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | желаемый формат |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public void setFontFamily(String value)
```


Сеттер семейства шрифта пока не реализован.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Новое семейство шрифтов. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Сеттер имени гарнитуры шрифта пока не реализован.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Новое имя начертания шрифта. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Сеттер Style пока не реализован. Это необработанное строковое значение, предоставляемое файлом шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Новый стиль шрифта. |

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

