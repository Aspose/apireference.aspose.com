---
title: "TtfLtshTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу Linear Threshold файла шрифта TTF."
type: docs
weight: 103
url: /ru/java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Представляет таблицу Linear Threshold файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | Получает количество глифов (из "numGlyphs" в таблице 'maxp'). |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getVersion()](#getVersion--) | Получает версию таблицы. |
| [getYPel(int glyphNum)](#getYPel-int-) | Возвращает вертикальную высоту пикселя для глифа/нуля, если номер глифа некорректен. |
| [hashCode()](#hashCode--) |  |
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
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Получает количество глифов (из "numGlyphs" в таблице 'maxp').

**Returns:**
int - Количество глифов (из "numGlyphs" в таблице 'maxp').
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
### getVersion() {#getVersion--}
```
public int getVersion()
```


Получает версию таблицы.

**Returns:**
int - Версия таблицы.
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Возвращает вертикальную высоту пикселя для глифа/нуля, если номер глифа некорректен.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphNum | int | Номер глифа (индекс). |

**Returns:**
byte - Вертикальная высота пикселя для глифа/нуля, если номер глифа некорректен.
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

