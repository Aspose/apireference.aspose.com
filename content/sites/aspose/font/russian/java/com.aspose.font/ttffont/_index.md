---
title: "TtfFont"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет шрифт TrueType TTF."
type: docs
weight: 94
url: /ru/java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

Представляет шрифт TrueType (TTF).
## Методы

| Метод | Описание |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | Преобразует шрифт в другой формат. |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | Преобразует шрифт в другой формат с ограниченным набором символов  *Примечание: тип шрифта TTF теперь поддерживается только.* |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | Возвращает массив всех идентификаторов глифов, доступных в шрифте. |
| [getCffFont()](#getCffFont--) | Получает CFF-шрифт, если он присутствует. |
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
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | Возвращает глиф по имени глифа. |
| [getGlyphById(long id)](#getGlyphById-long-) | Возвращает глиф по идентификатору глифа. |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | Получает глиф по переданному имени глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | Получает глиф по переданному индексу глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. |
| [getGlyphIdType()](#getGlyphIdType--) | Получает спецификацию типа идентификатора глифа. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Получить представление глифов для текста. |
| [getMetrics()](#getMetrics--) | Получает метрики шрифта. |
| [getNumGlyphs()](#getNumGlyphs--) | Получает количество глифов в шрифте. |
| [getPostscriptNames()](#getPostscriptNames--) | Получает имена шрифтов Postscript. |
| [getStyle()](#getStyle--) | Получает стиль шрифта. |
| [getTtfTables()](#getTtfTables--) | Получает таблицы TTF. |
| [hashCode()](#hashCode--) |  |
| [isSymbolic()](#isSymbolic--) | Возвращает true, если шрифт является символическим. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | Открывает шрифт, используя объект FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | Открывает шрифт, используя тип шрифта и массив байтов данных шрифта. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Открывает шрифт, используя тип шрифта и источник потока. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | Открывает шрифт, используя тип шрифта и имя файла шрифта. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Сохраняет шрифт в оригинальном формате. |
| [save(String fileName)](#save-java.lang.String-) | Сохраняет шрифт в оригинальном формате. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | Сохраняет шрифт в указанный формат. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | Устанавливает семейство шрифта. |
| [setFontName(String value)](#setFontName-java.lang.String-) | Устанавливает имя гарнитуры шрифта. |
| [setStyle(String value)](#setStyle-java.lang.String-) | Устанавливает стиль шрифта. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


Преобразует шрифт в другой формат. Примечание: тип шрифта TTF сейчас поддерживается только.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип формата шрифта для преобразования. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


Преобразует шрифт в другой формат с ограниченным набором символов  *Примечание: тип шрифта TTF теперь поддерживается только.*

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Тип формата шрифта для преобразования. |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | Ограничивающий набор символов. |

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


Возвращает массив всех идентификаторов глифов, доступных в шрифте. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ). Адресация глифов по имени (строка) поддерживается для шрифтов TTF через отображение таблицы Post. В случае шрифта CFF используются структуры CFF для адресации глифов по имени.

**Returns:**
com.aspose.font.GlyphId[] - Идентификаторы глифов.
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


Получает CFF-шрифт, если он присутствует.

**Returns:**
[Font](../../com.aspose.font/font) - CFF Font.
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
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
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


Получает тип шрифта. Возвращает значение FontType.TTF.

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


Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF‑шрифта может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ). Адресация глифа по имени (string) поддерживается для TTF‑шрифтов через сопоставление таблицы Post. Если шрифт CFF, для адресации глифов по имени используются структуры CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


Возвращает глиф по имени глифа. Адресация глифа по имени (string) поддерживается для TTF‑шрифтов через сопоставление таблицы Post. Если шрифт CFF, для адресации глифов по имени используются структуры CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | java.lang.String | Идентификатор строки глифа. |

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
| id | long | Индекс глифа. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


Получает глиф по переданному идентификатору глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF‑шрифта может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ). Адресация глифа по имени (string) поддерживается для TTF‑шрифтов через сопоставление таблицы Post. Если шрифт CFF, для адресации глифов по имени используются структуры CFF.

--------------------

Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Список идентификаторов глифов для заполнения. |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


Получает глиф по переданному имени глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа.

--------------------

Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | java.lang.String | Имя глифа. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Список идентификаторов глифов для заполнения. |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


Получает глиф по переданному индексу глифа и заполняет переданный список идентификаторов глифов компонентами этого глифа.

--------------------

Необходимо передать пустую коллекцию componentsToPopulate, которая будет содержать список идентификаторов компонентов глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| id | long | Индекс глифа. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | Список идентификаторов глифов для заполнения. |

### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


Получает спецификацию типа идентификатора глифа.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


Получить представление глифов для текста.

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


Получает имена шрифтов Postscript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


Получает стиль шрифта. Это необработанное строковое значение, предоставляемое файлом шрифта.

**Returns:**
java.lang.String — стиль шрифта.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Получает таблицы TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - TTF tables.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSymbolic() {#isSymbolic--}
```
public boolean isSymbolic()
```


Возвращает true, если шрифт является символическим.

**Returns:**
boolean — true, если шрифт символический.
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


Устанавливает семейство шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Новое семейство шрифтов. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


Устанавливает имя гарнитуры шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Новое имя начертания шрифта. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


Устанавливает стиль шрифта. Это необработанное строковое значение, предоставленное файлом шрифта.

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

