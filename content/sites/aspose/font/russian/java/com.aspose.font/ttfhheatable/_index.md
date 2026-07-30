---
title: "TtfHheaTable"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет таблицу hhea файла шрифта TTF."
type: docs
weight: 100
url: /ru/java/com.aspose.font/ttfhheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHheaTable extends TtfTableBase
```

Представляет таблицу "hhea" файла шрифта TTF.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceWidthMax()](#getAdvanceWidthMax--) | Получает uFWord advanceWidthMax, которое должно быть согласовано с горизонтальными метриками. |
| [getAscent()](#getAscent--) | Получает подъем. |
| [getCaretOffset()](#getCaretOffset--) | Получает смещение каретки. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Получает наклон каретки по вертикали. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Получает наклон каретки по горизонтали. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Получает спуск. |
| [getLineGap()](#getLineGap--) | Получает lineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Получает формат данных метрик. |
| [getMinLeftSideBearing()](#getMinLeftSideBearing--) | Получает значение MinLeftSideBearing. |
| [getMinRightSideBearing()](#getMinRightSideBearing--) | Получает значение MinRightSideBearing. |
| [getNumOfLongHorMetrics()](#getNumOfLongHorMetrics--) | Получает uint16 numOfLongHorMetrics — количество ширин продвижения в таблице метрик. |
| [getOffset()](#getOffset--) | Получает смещение от начала sfnt. |
| [getTag()](#getTag--) | Получает тег таблицы. |
| [getTtfTables()](#getTtfTables--) | Ссылка на репозиторий таблицы TTF. |
| [getVersion()](#getVersion--) | Получает версию. |
| [getXMaxExtent()](#getXMaxExtent--) | Получает значение XMaxExtent. |
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
### getAdvanceWidthMax() {#getAdvanceWidthMax--}
```
public int getAdvanceWidthMax()
```


Получает uFWord advanceWidthMax, которое должно быть согласовано с горизонтальными метриками.

**Returns:**
int - uFWord advanceWidthMax должно быть согласовано с горизонтальными метриками.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Получает подъем.

**Returns:**
short - Подъем.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Получает смещение каретки.

**Returns:**
short - Смещение каретки.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Получает наклон каретки по вертикали.

**Returns:**
short - Наклон каретки по вертикали.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Получает наклон каретки по горизонтали.

**Returns:**
short - Наклон каретки по горизонтали.
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


Получает спуск.

**Returns:**
short - Спуск.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Получает lineGap.

**Returns:**
short - Межстрочный интервал.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Получает формат данных метрик.

**Returns:**
short - Формат данных метрик.
### getMinLeftSideBearing() {#getMinLeftSideBearing--}
```
public short getMinLeftSideBearing()
```


Получает значение MinLeftSideBearing.

**Returns:**
short - Значение MinLeftSideBearing.
### getMinRightSideBearing() {#getMinRightSideBearing--}
```
public short getMinRightSideBearing()
```


Получает значение MinRightSideBearing.

**Returns:**
short - Значение MinRightSideBearing.
### getNumOfLongHorMetrics() {#getNumOfLongHorMetrics--}
```
public int getNumOfLongHorMetrics()
```


Получает uint16 numOfLongHorMetrics — количество ширин продвижения в таблице метрик.

**Returns:**
int - UInt16 numOfLongHorMetrics количество ширин продвижения в таблице метрик.
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
public float getVersion()
```


Получает версию.

**Returns:**
float - Версия формата таблицы.
### getXMaxExtent() {#getXMaxExtent--}
```
public short getXMaxExtent()
```


Получает значение XMaxExtent.

**Returns:**
short - Значение XMaxExtent.
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

