---
title: "TtfVheaTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу hhea файла шрифта TTF."
type: docs
weight: 112
url: /ru/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Представляет таблицу "hhea" файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Получает AdvanceHeightMax. |
| [getAscent()](#getAscent--) | Получает Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Получает CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Получает CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Получает CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Получает Descent. |
| [getLineGap()](#getLineGap--) | Получает LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Получает MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Получает MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Получает MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Получает MetricDataFormat. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getVersion()](#getVersion--) | Получает номер версии вертикальной таблицы заголовка. |
| [getYMaxExtent()](#getYMaxExtent--) | Получает \_yMaxExtent. |
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
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Получает AdvanceHeightMax. Максимальное измерение высоты продвижения в FUnits, найденное в шрифте.

**Returns:**
short - значение AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Получает Ascent. Расстояние в FUnits от центральной линии до предыдущей строки\\u2019s \_descent.

**Returns:**
short - значение Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Получает CaretOffset.

**Returns:**
short - значение CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Получает CaretSlopeRise.

**Returns:**
short - значение CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Получает CaretSlopeRun.

**Returns:**
short - значение CaretSlopeRun.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescent() {#getDescent--}
```
public short getDescent()
```


Получает Descent. Расстояние в FUnits от центральной линии до следующей строки\\u2019s \_ascent.

**Returns:**
short - значение Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Получает LineGap. Вертикальный типографический зазор для этого шрифта.

**Returns:**
short - значение LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Получает MetricDataFormat.

**Returns:**
short - значение MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Получает MinBottomSideBearing. Минимальное измерение нижнего бокового отступа, найденное в шрифте, в FUnits.

**Returns:**
short - значение MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Получает MinTopSideBearing. Минимальное измерение верхнего бокового отступа, найденное в шрифте, в FUnits.

**Returns:**
short - MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Получает MetricDataFormat. Количество высот продвижения в таблице вертикальных метрик.

**Returns:**
int - MetricDataFormat.
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
java.lang.String - Тег.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Ссылка на репозиторий таблицы TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Получает номер версии вертикальной таблицы заголовка.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Получает \_yMaxExtent.

**Returns:**
short - значение \_yMaxExtent.
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

