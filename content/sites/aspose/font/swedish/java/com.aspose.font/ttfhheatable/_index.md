---
title: "TtfHheaTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar hhea-tabell i TTF-teckensnittfilen."
type: docs
weight: 100
url: /sv/java/com.aspose.font/ttfhheatable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHheaTable extends TtfTableBase
```

Representerar "hhea"-tabellen i TTF-typsnittsfilen.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdvanceWidthMax()](#getAdvanceWidthMax--) | Hämtar uFWord advanceWidthMax måste vara konsekvent med horisontella metriker. |
| [getAscent()](#getAscent--) | Hämtar ascenten. |
| [getCaretOffset()](#getCaretOffset--) | Hämtar markörens offset. |
| [getCaretSlopeRise()](#getCaretSlopeRise--) | Hämtar markörens slop rise. |
| [getCaretSlopeRun()](#getCaretSlopeRun--) | Hämtar markörens slop run. |
| [getClass()](#getClass--) |  |
| [getDescent()](#getDescent--) | Hämtar descenten. |
| [getLineGap()](#getLineGap--) | Hämtar lineGap. |
| [getMetricDataFormat()](#getMetricDataFormat--) | Hämtar formatet för metrisk data. |
| [getMinLeftSideBearing()](#getMinLeftSideBearing--) | Hämtar värdet för MinLeftSideBearing. |
| [getMinRightSideBearing()](#getMinRightSideBearing--) | Hämtar värdet för MinRightSideBearing. |
| [getNumOfLongHorMetrics()](#getNumOfLongHorMetrics--) | Hämtar uint16 numOfLongHorMetrics antal framstegsbredder i metriktabellen. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getVersion()](#getVersion--) | Hämtar versionen. |
| [getXMaxExtent()](#getXMaxExtent--) | Hämtar värdet för XMaxExtent. |
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
### getAdvanceWidthMax() {#getAdvanceWidthMax--}
```
public int getAdvanceWidthMax()
```


Hämtar uFWord advanceWidthMax måste vara konsekvent med horisontella metriker.

**Returns:**
int - uFWord advanceWidthMax måste vara konsekvent med horisontella metriker.
### getAscent() {#getAscent--}
```
public short getAscent()
```


Hämtar ascenten.

**Returns:**
short - Ascenten.
### getCaretOffset() {#getCaretOffset--}
```
public short getCaretOffset()
```


Hämtar markörens offset.

**Returns:**
short - Offset för markören.
### getCaretSlopeRise() {#getCaretSlopeRise--}
```
public short getCaretSlopeRise()
```


Hämtar markörens slop rise.

**Returns:**
short - Markörens slop rise.
### getCaretSlopeRun() {#getCaretSlopeRun--}
```
public short getCaretSlopeRun()
```


Hämtar markörens slop run.

**Returns:**
short - Markörens slop run.
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


Hämtar descenten.

**Returns:**
short - Nedstigningen.
### getLineGap() {#getLineGap--}
```
public short getLineGap()
```


Hämtar lineGap.

**Returns:**
short - Radavståndet.
### getMetricDataFormat() {#getMetricDataFormat--}
```
public short getMetricDataFormat()
```


Hämtar formatet för metrisk data.

**Returns:**
short - Formatet för metriskdata.
### getMinLeftSideBearing() {#getMinLeftSideBearing--}
```
public short getMinLeftSideBearing()
```


Hämtar värdet för MinLeftSideBearing.

**Returns:**
short - Värdet för MinLeftSideBearing.
### getMinRightSideBearing() {#getMinRightSideBearing--}
```
public short getMinRightSideBearing()
```


Hämtar värdet för MinRightSideBearing.

**Returns:**
short - Värdet för MinRightSideBearing.
### getNumOfLongHorMetrics() {#getNumOfLongHorMetrics--}
```
public int getNumOfLongHorMetrics()
```


Hämtar uint16 numOfLongHorMetrics antal framstegsbredder i metriktabellen.

**Returns:**
int - UInt16 numOfLongHorMetrics antal framstegsbredder i metrisk tabell.
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
java.lang.String - Tabellens tagg.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referens till TTF-tabellarkivet.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Hämtar versionen.

**Returns:**
float - Tabellformatversion.
### getXMaxExtent() {#getXMaxExtent--}
```
public short getXMaxExtent()
```


Hämtar värdet för XMaxExtent.

**Returns:**
short - Värdet för XMaxExtent.
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

