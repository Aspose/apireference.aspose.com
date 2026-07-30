---
title: "TtfGlyfTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу glyf файла шрифта TTF."
type: docs
weight: 98
url: /ru/java/com.aspose.font/ttfglyftable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGlyfTable extends TtfTableBase
```

Представляет "glyf" таблицу файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [containsGlyph(int glyphIndex)](#containsGlyph-int-) | Возвращает true, если таблица содержит глиф с glyphIndex. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getGlyph(long glyphIndex)](#getGlyph-long-) | Возвращает глиф по индексу глифа. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### containsGlyph(int glyphIndex) {#containsGlyph-int-}
```
public boolean containsGlyph(int glyphIndex)
```


Возвращает true, если таблица содержит глиф с glyphIndex.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphIndex | int | Индекс глифа. |

**Returns:**
boolean — True, если таблица содержит глиф для указанного индекса, иначе false.
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
### getGlyph(long glyphIndex) {#getGlyph-long-}
```
public Glyph getGlyph(long glyphIndex)
```


Возвращает глиф по индексу глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphIndex | long | Индекс глифа. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph Glyph related to index specified.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение от начала sfnt.

**Returns:**
long — Смещение от начала sfnt.
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

