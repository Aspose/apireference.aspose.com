---
title: "TtfPostTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу post файла шрифта TTF."
type: docs
weight: 107
url: /ru/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Представляет таблицу "post" файла шрифта TTF
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Получает массив индексов глифов по имени глифа |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Получает фиксированный формат(version) этой таблицы. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Получает индекс глифа по имени глифа. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Получает имя глифа по индексу глифа. |
| [getItalicAngle()](#getItalicAngle--) | Получает фиксированный italicAngle — угол наклона в градусах. |
| [getMaxMemType1()](#getMaxMemType1--) | Получает uint32 maxMemType1 — максимальное использование памяти при загрузке TrueType Font как Type 1 Font. |
| [getMaxMemType42()](#getMaxMemType42--) | Получает uint32 maxMemType42 — максимальное использование памяти при загрузке TrueType font как Type 42 Font. |
| [getMinMemType1()](#getMinMemType1--) | Получает uint32 minMemType1 — минимальное использование памяти при загрузке TrueType Font как Type 1 Font. |
| [getMinMemType42()](#getMinMemType42--) | Получает uint32 minMemType42 — минимальное использование памяти при загрузке TrueType font как Type 42 Font. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTableFormat()](#getTableFormat--) | Получает фиксированный формат (версия) этой таблицы. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Получает FWord underlinePosition — позицию подчеркивания. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Получает FWord underlineThickness — толщину подчеркивания. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Указывает, что информация о PostScript‑именах глифов в этом файле шрифта не предоставлена. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Получает uint32 isFixedPitch. 0, если шрифт пропорционально распределён, ненулевое значение, если шрифт не пропорционален (т.е. моноширинный). |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Получает массив индексов глифов по имени глифа

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | java.lang.String | Имя глифа |

**Returns:**
long[] — массив индексов глифов
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFormat() {#getFormat--}
```
public float getFormat()
```


Получает фиксированный формат(version) этой таблицы.

**Returns:**
float — фиксированный формат (версия) этой таблицы.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Получает индекс глифа по имени глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | java.lang.String | Имя глифа. |

**Returns:**
long — индекс глифа. Когда информация о PostScript‑именах глифов в этом файле шрифта не предоставлена, возвращается индекс 0, который соответствует неопределённому глифу или глифу ".notdef".
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Получает имя глифа по индексу глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphIndex | long | Индекс глифа. |

**Returns:**
java.lang.String — имя глифа. Когда информация о PostScript‑именах глифов в этом файле шрифта не предоставлена, возвращается null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Получает фиксированный italicAngle — угол наклона в градусах.

**Returns:**
float — фиксированный italicAngle — угол наклона в градусах.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Получает uint32 maxMemType1 — максимальное использование памяти при загрузке TrueType Font как Type 1 Font.

**Returns:**
long — UInt32 maxMemType1 — максимальное использование памяти при загрузке TrueType Font как Type 1 Font.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Получает uint32 maxMemType42 — максимальное использование памяти при загрузке TrueType font как Type 42 Font.

**Returns:**
long — UInt32 maxMemType42 — максимальное использование памяти при загрузке TrueType font как Type 42 Font.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Получает uint32 minMemType1 — минимальное использование памяти при загрузке TrueType Font как Type 1 Font.

**Returns:**
long — UInt32 minMemType1 — минимальное использование памяти при загрузке TrueType Font как Type 1 Font.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Получает uint32 minMemType42 — минимальное использование памяти при загрузке TrueType font как Type 42 Font.

**Returns:**
long — UInt32 minMemType42 — минимальное использование памяти при загрузке TrueType font как Type 42 Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение от начала sfnt.

**Returns:**
long — Смещение от начала sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Получает фиксированный формат (версия) этой таблицы. Используйте свойства MajorNumber и MinorNUmber объекта Version16Dot16 в шестнадцатеричной нотации для определения используемой версии.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
### getTag() {#getTag--}
```
public static String getTag()
```


Получает тег таблицы.

**Returns:**
java.lang.String - Тег таблицы.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Ссылка на репозиторий таблицы TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Получает FWord underlinePosition — позицию подчеркивания.

**Returns:**
short — FWord underlinePosition — позиция подчеркивания.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Получает FWord underlineThickness — толщину подчеркивания.

**Returns:**
short — FWord underlineThickness — толщина подчеркивания.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Указывает, что информация о PostScript‑именах глифов в этом файле шрифта не предоставлена.

**Returns:**
boolean — True, если информация о PostScript‑именах глифов в этом файле шрифта не предоставлена. False в противном случае.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


Получает uint32 isFixedPitch. 0, если шрифт пропорционально распределён, ненулевое значение, если шрифт не пропорционален (т.е. моноширинный).

**Returns:**
long — UInt32 isFixedPitch. 0, если шрифт пропорционально распределён, ненулевое значение, если шрифт не пропорционален (т.е. моноширинный).
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

