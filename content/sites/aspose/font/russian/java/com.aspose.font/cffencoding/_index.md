---
title: "CffEncoding"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет кодировку CFF _font."
type: docs
weight: 18
url: /ru/java/com.aspose.font/cffencoding/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFontEncoding](../../com.aspose.font/ifontencoding), [com.aspose.font.ISupportsNameAddressing](../../com.aspose.font/isupportsnameaddressing)
```
public class CffEncoding implements IFontEncoding, ISupportsNameAddressing
```

Представляет кодировку CFF \_font.
## Методы

| Метод | Описание |
| --- | --- |
| [decodeToGid(long charCode)](#decodeToGid-long-) | Получает Gid для переданного charCode. |
| [decodeToGidParameterized(IEncodingParameters parameters, long charCode)](#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-) | Параметризованный метод декодирования. |
| [encode(long gid, long charCode)](#encode-long-long-) | Кодирует глиф. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNameToCharCodeIndex()](#getNameToCharCodeIndex--) | Возвращает карту сопоставления имени с кодом символа. |
| [getNameToGidIndex()](#getNameToGidIndex--) | Возвращает карту сопоставления имени с кодом символа. |
| [getNameToSidIndex()](#getNameToSidIndex--) | Возвращает карту сопоставления имени с кодом символа. |
| [getSidName(int sid)](#getSidName-int-) | Получает имя для указанного SID. |
| [gidToUnicode(GlyphId gid)](#gidToUnicode-com.aspose.font.GlyphId-) | Декодирует Gid в unicode. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [unicodeToGid(long unicode)](#unicodeToGid-long-) | Декодирует Unicode и возвращает идентификатор глифа. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### decodeToGid(long charCode) {#decodeToGid-long-}
```
public GlyphId decodeToGid(long charCode)
```


Получает Gid для переданного charCode. Этот метод предназначен для CFF CIDFonts, где charCode должен быть действительным значением CID. Glyph id — уникальный номер глифа, зависящий от типа \_font. Glyph id шрифта CFF может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| charCode | long | Код символа (CID) для получения идентификатора глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to CID passed.
### decodeToGidParameterized(IEncodingParameters parameters, long charCode) {#decodeToGidParameterized-com.aspose.font.IEncodingParameters-long-}
```
public GlyphId decodeToGidParameterized(IEncodingParameters parameters, long charCode)
```


Параметризованный метод декодирования. Не поддерживается для типа шрифта CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | [IEncodingParameters](../../com.aspose.font/iencodingparameters) | Реализация интерфейса IEncodingParameters. |
| charCode | long | Код символа, для которого нужно получить идентификатор глифа. |

**Returns:**
[GlyphId](../../com.aspose.font/glyphid) - Glyph identifier related to charCode passed.
### encode(long gid, long charCode) {#encode-long-long-}
```
public void encode(long gid, long charCode)
```


Кодирует глиф. Не поддерживается для типов шрифтов CFF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | long | Glyph id |
| charCode | long | CharCode, связанный с glyph id. |

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


Возвращает отображение имени в кодировку символов. Примечание: код символа не является юникодом. Код символа — это индекс символа в таблице кодировки шрифта "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToGidIndex() {#getNameToGidIndex--}
```
public NameToCodeMap getNameToGidIndex()
```


Возвращает отображение имени в кодировку символов. Примечание: код символа не является юникодом. Код символа — это индекс символа в таблице кодировки шрифта "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getNameToSidIndex() {#getNameToSidIndex--}
```
public NameToCodeMap getNameToSidIndex()
```


Возвращает отображение имени в кодировку символов. Примечание: код символа не является юникодом. Код символа — это индекс символа в таблице кодировки шрифта "table".

**Returns:**
[NameToCodeMap](../../com.aspose.font/nametocodemap) - Name to character code encoding map.
### getSidName(int sid) {#getSidName-int-}
```
public String getSidName(int sid)
```


Получает имя для указанного SID.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sid | int | String идентификатор. |

**Returns:**
java.lang.String - Имя из String INDEX, если найдено.
### gidToUnicode(GlyphId gid) {#gidToUnicode-com.aspose.font.GlyphId-}
```
public long gidToUnicode(GlyphId gid)
```


Декодирует Gid в unicode. Glyph id — уникальный номер глифа, зависящий от типа \_font. Glyph id шрифта CFF может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ).

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


Декодирует unicode и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа \_font. Glyph id шрифта CFF может быть экземпляром класса ( GlyphStringId ) или класса ( GlyphUInt32Id ).

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

