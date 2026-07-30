---
title: "TtfEncoding"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет кодировку шрифта TTF."
type: docs
weight: 92
url: /ru/java/com.aspose.font/ttfencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding)
```
public class TtfEncoding implements IFontEncoding
```

Представляет кодировку шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [decodeToGid(long unicode)](#decodeToGid-long-) | Реализация DecodeToGlyphId шрифта TTF ищет таблицу Unicode и возвращает идентификатор глифа для символа Unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Параметризованная версия позволяет использовать конкретную таблицу CMap (не Unicode). |
| [encode(long gid, long charCode)](#encode-long-long-) | Кодирует глиф. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [gidToUnicode(GlyphId glyphId)](#gidToUnicode-com.aspose.font.GlyphId-) | Декодирует идентификатор глифа в Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Декодирует Unicode и возвращает идентификатор глифа. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long unicode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long unicode)
```


Реализация DecodeToGlyphId шрифта TTF ищет таблицу Unicode и возвращает идентификатор глифа для символа Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — это имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — это целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | long | Код символа, для которого нужно получить идентификатор глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Параметризованная версия позволяет использовать конкретную таблицу CMap (не Unicode).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Реализация интерфейса IEncodingParameters. |
| charCode | long | Код символа для получения идентификатора глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Кодирует глиф. Для шрифтов TTF код символа — Unicode.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | long | Идентификатор глифа. |
| charCode | long | Код символа. |

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
### gidToUnicode(GlyphId glyphId) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId glyphId)
```


Декодирует идентификатор глифа в Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — это имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — это целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа символа для декодирования. |

**Returns:**
long — значение Unicode, связанное с переданным идентификатором глифа.
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
### unicodeToGid(long unicode) {#unicodeToGid-long-}
```
public GlyphId unicodeToGid(long unicode)
```


Декодирует Unicode и возвращает идентификатор глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | long | Unicode, для которого нужно получить идентификатор глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to unicode passed.
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

