---
title: "TtfVheaTable"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die hhea-Tabelle der TTF-Schriftdatei dar."
type: docs
weight: 112
url: /de/java/com.aspose.font/ttfvheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVheaTable extends TtfTableBase
```

Stellt die "hhea"-Tabelle der TTF-Schriftdatei dar.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceHeightMax()](#getAdvanceHeightMax--) | Ruft AdvanceHeightMax ab. |
| [getAscent()](#getAscent--) | Liest Ascent. |
| [getCaretOffset()](#getCaretOffset--) | Liest CaretOffset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Liest CaretSlopeRise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Liest CaretSlopeRun. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Liest Descent. |
| [getLineGap()](#getLineGap--) | Liest LineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Liest MetricDataFormat. |
| [getMinBottomSideBearing()](#getMinBottomSideBearing--) | Liest MinBottomSideBearing. |
| [getMinTopSideBearing()](#getMinTopSideBearing--) | Liest MinTopSideBearing. |
| [getNumOfLongVerMetrics()](#getNumOfLongVerMetrics--) | Liest MetricDataFormat. |
| [getOffset()](#getOffset--) | Liefert den Offset vom Anfang des sfnt. |
| [getTag()](#getTag--) | Liest das Tabellen-Tag. |
| [getTtfTables()](#getTtfTables--) | Verweis auf das TTF-Tabellen-Repository. |
| [getVersion()](#getVersion--) | Liest Versionsnummer der vertikalen Header-Tabelle. |
| [getYMaxExtent()](#getYMaxExtent--) | Liest \_yMaxExtent. |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdvanceHeightMax() {#getAdvanceHeightMax--}
```
public short getAdvanceHeightMax()
```


Liest AdvanceHeightMax. Die maximale Vorwärts-Höhenmessung in FUnits, die in der Schriftart gefunden wurde.

**Returns:**
short - Der AdvanceHeightMax.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Liest Ascent. Abstand in FUnits von der Mittellinie zur vorherigen Zeile\\u2019s \_descent.

**Returns:**
short - Der Ascent.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Liest CaretOffset.

**Returns:**
short - Der CaretOffset.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Liest CaretSlopeRise.

**Returns:**
short - Der CaretSlopeRise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Liest CaretSlopeRun.

**Returns:**
short - Der CaretSlopeRun.
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


Liest Descent. Abstand in FUnits von der Mittellinie zur nächsten Zeile\\u2019s \_ascent.

**Returns:**
short - Der Descent.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Liest LineGap. Der vertikale typografische Abstand für diese Schriftart.

**Returns:**
short - Der LineGap.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Liest MetricDataFormat.

**Returns:**
short - Der MetricDataFormat.
### getMinBottomSideBearing() {#getMinBottomSideBearing--}
```
public short getMinBottomSideBearing()
```


Liest MinBottomSideBearing. Die minimale untere Seitenrandmessung, die in der Schriftart gefunden wurde, in FUnits.

**Returns:**
short - Der MinBottomSideBearing.
### getMinTopSideBearing() {#getMinTopSideBearing--}
```
public short getMinTopSideBearing()
```


Ermittelt MinTopSideBearing. Die minimale obere Seitenrandmessung, die in der Schrift gefunden wurde, in FUnits.

**Returns:**
short - Das MinTopSideBearing.
### getNumOfLongVerMetrics() {#getNumOfLongVerMetrics--}
```
public int getNumOfLongVerMetrics()
```


Ermittelt MetricDataFormat. Anzahl der advance heights in der vertikalen Metriktabelle.

**Returns:**
int - Das MetricDataFormat.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Liefert den Offset vom Anfang des sfnt.

**Returns:**
long - Offset vom Anfang des sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Liest das Tabellen-Tag.

**Returns:**
java.lang.String - Das Tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Verweis auf das TTF-Tabellen-Repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public Version16Dot16 getVersion()
```


Liest Versionsnummer der vertikalen Header-Tabelle.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - The Version number of the vertical header table.
### getYMaxExtent() {#getYMaxExtent--}
```
public short getYMaxExtent()
```


Liest \_yMaxExtent.

**Returns:**
short - Das \_yMaxExtent.
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

