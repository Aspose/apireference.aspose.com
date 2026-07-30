---
title: "Type1Encoding"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет кодировку шрифта Type1."
type: docs
weight: 114
url: /ru/java/com.aspose.font/type1encoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class Type1Encoding implements IFontEncoding, ISupportsNameAddressing
```

Представляет кодировку шрифта Type1.
## Методы

| Метод | Описание |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Декодирует Gid в unicode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Параметризованный метод декодирования. |
| [encode(long gid, long charCode)](#encode-long-long-) | Кодирует глиф. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Возвращает карту сопоставления имени с кодом символа. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Декодирует Gid в Unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Возвращает GlyphId для Unicode. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Декодирует Gid в unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| charCode | long | Код символа, для которого нужно получить идентификатор глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to character code passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Параметризованный метод декодирования. Не поддерживается для шрифтов типа Type1.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Не поддерживается для шрифтов типа Type1. |
| charCode | long | Не поддерживается для шрифтов типа Type1. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Not supported for Type1 Font type.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Кодирует глиф. Для шрифтов TTF код символа — unicode. Не поддерживается для шрифтов типа Type1.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | long | Идентификатор глифа. |
| charCode | long | Код символа, связанный с идентификатором глифа. |

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
### getNameToCharCodeIndex() {#getNameToCharCodeIndex--}
```
public NameToCodeMap getNameToCharCodeIndex()
```


Возвращает карту сопоставления имени с кодом символа. Примечание: код символа не является unicode. Код символа — индекс символа в таблице кодировки шрифта.

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | [GlyphId](../../com.aspose.font/glyphid) | Идентификатор глифа символа для декодирования. |

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


Возвращает GlyphId для Unicode. Или notdef, если шрифт не содержит глифа для данного Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса ( GlyphStringId ). Идентификатор TTF — целочисленный индекс, экземпляр класса ( GlyphUInt32Id ).

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

