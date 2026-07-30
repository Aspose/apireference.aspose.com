---
title: "TtfPostTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar post-tabellen i TTF-typsnittsfilen"
type: docs
weight: 107
url: /sv/java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Representerar "post"-tabellen i TTF-typsnittsfilen
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Hämtar en array av teckenindex efter teckennamn |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Hämtar fast format (version) för denna tabell. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Hämtar teckenindex efter teckennamn. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Hämtar teckennamn efter teckenindex. |
| [getItalicAngle()](#getItalicAngle--) | Hämtar fixed italicAngle kursiv vinkel i grader. |
| [getMaxMemType1()](#getMaxMemType1--) | Hämtar uint32 maxMemType1 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt. |
| [getMaxMemType42()](#getMaxMemType42--) | Hämtar uint32 maxMemType42 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt. |
| [getMinMemType1()](#getMinMemType1--) | Hämtar uint32 minMemType1 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt. |
| [getMinMemType42()](#getMinMemType42--) | Hämtar uint32 minMemType42 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTableFormat()](#getTableFormat--) | Hämtar fixed format (version) för denna tabell. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Hämtar FWord underlinePosition understrykningsposition. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Hämtar FWord underlineThickness understrykningstjocklek. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Indikerar att ingen PostScript-namnsinformation tillhandahålls för glyferna i den här teckensnittsfilen. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Hämtar uint32 isFixedPitch. 0 om teckensnittet har proportionell teckenbredd, icke-noll om teckensnittet inte har proportionell teckenbredd (dvs. monospaced). |
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
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Hämtar en array av teckenindex efter teckennamn

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphName | java.lang.String | Glyfnamn |

**Returns:**
long[] - array av glyfindex
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


Hämtar fast format (version) för denna tabell.

**Returns:**
float - Fixed format(version) för denna tabell.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Hämtar teckenindex efter teckennamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphName | java.lang.String | Glyfnamn. |

**Returns:**
long - Glyfindex. När ingen PostScript-namnsinformation tillhandahålls för glyferna i den här teckensnittsfilen, returneras index 0, vilket är den odefinierade glyfen eller ".notdef"-glyfen.
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Hämtar teckennamn efter teckenindex.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| glyphIndex | long | Glyfindex. |

**Returns:**
java.lang.String - Glyfnamn. När ingen PostScript-namnsinformation tillhandahålls för glyferna i den här teckensnittsfilen, returneras null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Hämtar fixed italicAngle kursiv vinkel i grader.

**Returns:**
float - Fixed italicAngle kursiv vinkel i grader.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Hämtar uint32 maxMemType1 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt.

**Returns:**
long - UInt32 maxMemType1 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Hämtar uint32 maxMemType42 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt.

**Returns:**
long - UInt32 maxMemType42 Maximalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Hämtar uint32 minMemType1 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt.

**Returns:**
long - UInt32 minMemType1 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 1-typsnitt.
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Hämtar uint32 minMemType42 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt.

**Returns:**
long - UInt32 minMemType42 Minimalt minnesanvändning när ett TrueType-typsnitt hämtas som ett Type 42-typsnitt.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Hämtar fixed format (version) för denna tabell. Använd egenskaperna MajorNumber och MinorNUmber i objektet Version16Dot16 i hexadecimal notation för att upptäcka vilken version som används.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
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
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Hämtar FWord underlinePosition understrykningsposition.

**Returns:**
short - FWord underlinePosition understrykningsposition.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Hämtar FWord underlineThickness understrykningstjocklek.

**Returns:**
short - FWord underlineThickness understrykningstjocklek.
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Indikerar att ingen PostScript-namnsinformation tillhandahålls för glyferna i den här teckensnittsfilen.

**Returns:**
boolean - True, om ingen PostScript-namnsinformation tillhandahålls för glyferna i den här teckensnittsfilen. False, annars.
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


Hämtar uint32 isFixedPitch. 0 om teckensnittet har proportionell teckenbredd, icke-noll om teckensnittet inte har proportionell teckenbredd (dvs. monospaced).

**Returns:**
long - UInt32 isFixedPitch. 0 om teckensnittet har proportionell teckenbredd, icke-noll om teckensnittet inte har proportionell teckenbredd (dvs. monospaced).
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

