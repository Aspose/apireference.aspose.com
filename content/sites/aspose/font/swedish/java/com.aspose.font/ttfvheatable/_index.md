---
title: "TtfVheaTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar hhea-tabell i TTF-teckensnittfilen."
type: docs
weight: 112
url: /sv/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Representerar "hhea"-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Hämtar AdvanceHeightMax. |
| [getAscent()](#getAscent--) | Hämtar Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Hämtar CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Hämtar CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Hämtar CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Hämtar Descent. |
| [getLineGap()](#getLineGap--) | Hämtar LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Hämtar MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Hämtar MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Hämtar MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Hämtar MetricDataFormat. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getVersion()](#getVersion--) | Hämtar versionsnummer för den vertikala huvudtabellen. |
| [getYMaxExtent()](#getYMaxExtent--) | Hämtar \_yMaxExtent. |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Hämtar AdvanceHeightMax. Det maximala avståndet för höjd i FUnits som finns i teckensnittet.

**Returns:**
short - Det maximala avståndet för AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Hämtar Ascent. Avstånd i FUnits från mittlinjen till föregående radens \_descent.

**Returns:**
short - Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Hämtar CaretOffset.

**Returns:**
short - CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Hämtar CaretSlopeRise.

**Returns:**
short - CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Hämtar CaretSlopeRun.

**Returns:**
short - CaretSlopeRun.
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


Hämtar Descent. Avstånd i FUnits från mittlinjen till nästa radens \_ascent.

**Returns:**
short - Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Hämtar LineGap. Det vertikala typografiska gapet för detta teckensnitt.

**Returns:**
short - LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Hämtar MetricDataFormat.

**Returns:**
short - MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Hämtar MinBottomSideBearing. Den minsta mätningen för botten sidbäring som finns i teckensnittet, i FUnits.

**Returns:**
short - MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Hämtar MinTopSideBearing. Den minsta top sidebearing-mätningen som hittas i teckensnittet, i FUnits.

**Returns:**
short - Den MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Hämtar MetricDataFormat. Antalet framstegshöjder i den vertikala metriktabellen.

**Returns:**
int - Den MetricDataFormat.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Hämtar tabellens tagg.

**Returns:**
java.lang.String - Taggen.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Hämtar versionsnummer för den vertikala huvudtabellen.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Hämtar \_yMaxExtent.

**Returns:**
short - Den \_yMaxExtent.
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

