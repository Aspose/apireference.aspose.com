---
title: "TtfMaxpTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу maxp файла шрифта TTF."
type: docs
weight: 104
url: /ru/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Представляет таблицу "maxp" файла шрифта TTF
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Получает uint16 maxComponentContours контуров в составном глифе. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Получает uint16 maxComponentDepth уровней рекурсии, устанавливается в 0, если шрифт содержит только простые глифы. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Получает uint16 maxComponentElements количество глифов, ссылок на верхнем уровне. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Получает uint16 maxComponentPoints точек в составном глифе. |
| [getMaxContours()](#getMaxContours--) | Получает uint16 maxContours контуров в несоставном глифе. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Получает uint16 maxFunctionDefs количество FDEF. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Получает uint16 maxInstructionDefs количество IDEF. |
| [getMaxPoints()](#getMaxPoints--) | Получает uint16 maxPoints точек в несоставном глифе. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Получает uint16 maxSizeOfInstructions количество байтов для инструкций глифа. |
| [getMaxStackElements()](#getMaxStackElements--) | Получает uint16 maxStackElements максимальную глубину стека. |
| [getMaxStorage()](#getMaxStorage--) | Получает uint16 maxStorage количество ячеек области хранения. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Получает uint16 maxTwilightPoints точек, используемых в зоне Twilight (Z0). |
| [getMaxZones()](#getMaxZones--) | Получает uint16 maxZones, установленное в 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Получает uint16 numGlyphs количество глифов в шрифте. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTableVersion()](#getTableVersion--) | Получает версию формата. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getVersion()](#getVersion--) | Получает фиксированную версию 0x00010000, если (версия 1.0). |
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
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


Получает uint16 maxComponentContours контуров в составном глифе.

**Returns:**
int - UInt16 maxComponentContours контуров в составном глифе.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Получает uint16 maxComponentDepth уровней рекурсии, устанавливается в 0, если шрифт содержит только простые глифы.

**Returns:**
int - Uint16 maxComponentDepth уровней рекурсии, установить 0, если шрифт содержит только простые глифы.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Получает uint16 maxComponentElements количество глифов, ссылок на верхнем уровне.

**Returns:**
int - UInt16 maxComponentElements количество глифов, на которые есть ссылки на верхнем уровне.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Получает uint16 maxComponentPoints точек в составном глифе.

**Returns:**
int - UInt16 maxComponentPoints точек в составном глифе.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Получает uint16 maxContours контуров в несоставном глифе.

**Returns:**
int - UInt16 maxContours контуров в несоставном глифе.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Получает uint16 maxFunctionDefs количество FDEF.

**Returns:**
int - UInt16 maxFunctionDefs количество FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Получает uint16 maxInstructionDefs количество IDEF.

**Returns:**
int - UInt16 maxInstructionDefs количество IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Получает uint16 maxPoints точек в несоставном глифе.

**Returns:**
int - UInt16 maxPoints точек в несоставном глифе.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Получает uint16 maxSizeOfInstructions количество байтов для инструкций глифа.

**Returns:**
int - UInt16 maxSizeOfInstructions количество байтов для инструкций глифа.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Получает uint16 maxStackElements максимальную глубину стека.

**Returns:**
int - UInt16 maxStackElements максимальная глубина стека.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Получает uint16 maxStorage количество ячеек области хранения.

**Returns:**
int - UInt16 maxStorage количество мест в области хранения.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Получает uint16 maxTwilightPoints точек, используемых в зоне Twilight (Z0).

**Returns:**
int - UInt16 maxTwilightPoints точек, используемых в зоне сумерек (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Получает uint16 maxZones, установленное в 2.

**Returns:**
int - Uint16 maxZones установить значение 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Получает uint16 numGlyphs количество глифов в шрифте.

**Returns:**
int - UInt16 numGlyphs количество глифов в шрифте.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Получает смещение от начала sfnt.

**Returns:**
long — Смещение от начала sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Получает версию формата. Используйте свойства MajorNumber и MinorNUmber объекта Version16Dot16 в шестнадцатеричной нотации для определения используемой версии.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
public float getVersion()
```


Получает фиксированную версию 0x00010000, если (версия 1.0). Устарело, используйте свойство TableVersion вместо него.

**Returns:**
float - Фиксированная версия 0x00010000, если (версия 1.0).
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

