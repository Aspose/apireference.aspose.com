---
title: "FontCharactersMerger"
second_title: "Справочник API Aspose.Font for Java"
description: "Объявляет функциональность для объединения шрифтов разных типов."
type: docs
weight: 35
url: /ru/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Объявляет функциональность для объединения шрифтов разных типов. Для операции слияния требуется пара шрифтов. Один шрифт из этой пары считается основным. Это означает, что многие характеристики, связанные с конечным объединённым шрифтом, такие как метрики, структура кодировки и другие, будут взяты из этого основного шрифта. Другой шрифт из пары (вторичный) предоставляет только глифы для конечного объединённого шрифта.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Получает основной шрифт. |
| [getSecondaryFont()](#getSecondaryFont--) | Получает вторичный шрифт. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Объединяет шрифты на основе переданных списков глифов. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Объединяет шрифты на основе переданных списков кодов символов. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | Эта версия метода предназначена для случаев, когда вы хотите явно задать коды символов для глифов в результирующем шрифте. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


Получает основной шрифт.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Получает вторичный шрифт.

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа с соответствующим глифом в новый результирующий шрифт.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Список глифов, которые нужно взять из основного шрифта. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Список глифов, которые нужно взять из вторичного шрифта. |
| newFontName | java.lang.String | Желаемое имя результирующего шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Объединяет шрифты на основе переданных списков кодов символов. Чтобы создать желаемый результирующий шрифт, просто передайте коды символов из оригинальных шрифтов, которые вы хотите включить в результирующий шрифт. Глифы, связанные с переданными кодами, будут найдены автоматически. Например, если вы хотите включить глифы, связанные с буквами A и B из первого шрифта, и глифы, связанные с буквами C и D из второго шрифта, просто вызовите этот метод так: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")`

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Коды, которые нужно взять из основного шрифта. |
| secondaryFontCharCodes | int[] | Коды, которые нужно взять из вторичного шрифта. |
| newFontName | java.lang.String | Желаемое имя результирующего шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


Эта версия метода предназначена для случаев, когда вы хотите явно задать коды символов для глифов в результирующем шрифте. Не обязательно, чтобы код предоставленного глифа был включён в оригинальный шрифт. Цель переданного кода состоит в том, чтобы он был связан с соответствующим идентификатором глифа в результирующем шрифте. Таким образом, правило обработки каждой пары, переданной параметром словаря [code, glyph identifier], состоит в том, что из оригинального шрифта берётся только идентификатор глифа, а затем он связывается с соответствующим кодом в результирующем шрифте. Это может быть полезно, когда некоторые коды из первого шрифта конфликтуют с теми же кодами из второго шрифта.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Словарь с парами [код символа, идентификатор глифа] из основного шрифта. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Словарь с парами [код символа, идентификатор глифа] из вторичного шрифта. |
| newFontName | java.lang.String | Желаемое имя результирующего шрифта. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
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

