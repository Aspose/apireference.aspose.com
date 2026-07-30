---
title: "TtfHeadTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу head файла шрифта TTF."
type: docs
weight: 99
url: /ru/java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Представляет "head" таблицу файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Получает uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Получает longDateTime созданную международную дату. |
| [getFlags()](#getFlags--) | Получает uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Получает int16 fontDirectionHint. 0 Смешанные направленные глифы; 1 Только сильно слева направо глифы; 2 Как 1, но также содержит нейтральные; -1 Только сильно справа налево глифы; -2 Как -1, но также содержит нейтральные. |
| [getFontRevision()](#getFontRevision--) | Получает фиксированный fontRevision, установленный производителем шрифта. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Получает int16 glyphDataFormat 0 для текущего формата. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Получает int16 indexToLocFormat 0 для коротких смещений, 1 для длинных. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Получает uint16 lowestRecPPEM — наименьший читаемый размер в пикселях. |
| [getMacStyle()](#getMacStyle--) | Получает uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Получает uint32 magicNumber, установленный в 0x5F0F3CF5. |
| [getModified()](#getModified--) | Получает longDateTime изменённую международную дату. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Получает uint16 unitsPerEM в диапазоне от 64 до 16384. |
| [getVersion()](#getVersion--) | Фиксированная версия 0x00010000, если (версия 1.0). |
| [getXMax()](#getXMax--) | Получает FWord xMax для всех ограничительных рамок глифов. |
| [getXMin()](#getXMin--) | Получает FWord xMin для всех ограничительных рамок глифов. |
| [getYMax()](#getYMax--) | Получает FWord yMax для всех ограничительных рамок глифов. |
| [getYMin()](#getYMin--) | Получает FWord yMin для всех ограничительных рамок глифов. |
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
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Получает uint32 checkSumAdjustment. Для вычисления: установить его в 0, вычислить контрольную сумму для таблицы 'head' и поместить её в каталог таблиц, просуммировать весь шрифт как uint32, затем сохранить B1B0AFBA - сумма. Контрольная сумма для таблицы 'head' не будет ошибочной. Это нормально.

**Returns:**
long — Uint32 checkSumAdjustment.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreated() {#getCreated--}
```
public Date getCreated()
```


Получает longDateTime созданную международную дату.

**Returns:**
java.util.Date — LongDateTime созданная международная дата.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Получает uint16 flags.

**Returns:**
int — UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Получает int16 fontDirectionHint. 0 Смешанные направленные глифы; 1 Только сильно слева направо глифы; 2 Как 1, но также содержит нейтральные; -1 Только сильно справа налево глифы; -2 Как -1, но также содержит нейтральные.

**Returns:**
short — Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Получает фиксированный fontRevision, установленный производителем шрифта.

**Returns:**
float — Fixed fontRevision, установленный производителем шрифта.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Получает int16 glyphDataFormat 0 для текущего формата.

**Returns:**
short - Int16 glyphDataFormat 0 для текущего формата.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Получает int16 indexToLocFormat 0 для коротких смещений, 1 для длинных.

**Returns:**
short - Int16 indexToLocFormat 0 для коротких смещений, 1 для длинных.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Получает uint16 lowestRecPPEM — наименьший читаемый размер в пикселях.

**Returns:**
int - UInt16 lowestRecPPEM наименьший читаемый размер в пикселях.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Получает uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Получает uint32 magicNumber, установленный в 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber установлен в 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


Получает longDateTime изменённую международную дату.

**Returns:**
java.util.Date - LongDateTime изменённая международная дата.
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
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Получает uint16 unitsPerEM в диапазоне от 64 до 16384.

**Returns:**
long - UInt16 unitsPerEM диапазон от 64 до 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Фиксированная версия 0x00010000, если (версия 1.0).

**Returns:**
float - Фиксированная версия 0x00010000, если (версия 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Получает FWord xMax для всех ограничительных рамок глифов.

**Returns:**
short - FWord xMax для всех ограничительных рамок глифов.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Получает FWord xMin для всех ограничительных рамок глифов.

**Returns:**
short - FWord xMin для всех ограничительных рамок глифов.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Получает FWord yMax для всех ограничительных рамок глифов.

**Returns:**
short - FWord yMax для всех ограничительных рамок глифов.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Получает FWord yMin для всех ограничительных рамок глифов.

**Returns:**
short - FWord yMin для всех ограничительных рамок глифов.
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

