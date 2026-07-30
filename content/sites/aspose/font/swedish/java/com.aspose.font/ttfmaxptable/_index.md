---
title: "TtfMaxpTable"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar maxp-tabellen i TTF-fontfilen"
type: docs
weight: 104
url: /sv/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Representerar "maxp"-tabellen i TTF-typsnittsfilen
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Hämtar uint16 maxComponentContours konturer i sammansatt glyf. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Hämtar uint16 maxComponentDepth rekursionsnivåer, sätt till 0 om fonten bara har enkla glyfer. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Hämtar uint16 maxComponentElements antal glyfer som refereras på toppnivå. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Hämtar uint16 maxComponentPoints punkter i sammansatt glyf. |
| [getMaxContours()](#getMaxContours--) | Hämtar uint16 maxContours konturer i icke-sammansatt glyf. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Hämtar uint16 maxFunctionDefs antal FDEF:ar. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Hämtar uint16 maxInstructionDefs antal IDEF:ar. |
| [getMaxPoints()](#getMaxPoints--) | Hämta uint16 maxPoints punkter i icke-sammansatt glyf. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Hämtar uint16 maxSizeOfInstructions byteantal för glyfinstruktioner. |
| [getMaxStackElements()](#getMaxStackElements--) | Hämtar uint16 maxStackElements maximal stackdjup. |
| [getMaxStorage()](#getMaxStorage--) | Hämtar uint16 maxStorage antal lagringsområdesplatser. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Hämtar uint16 maxTwilightPoints punkter som används i Twilight Zone (Z0). |
| [getMaxZones()](#getMaxZones--) | Hämtar uint16 maxZones satt till 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Hämtar uint16 numGlyphs antalet glyfer i Fonten. |
| [getOffset()](#getOffset--) | Hämtar förskjutning från början av sfnt. |
| [getTableVersion()](#getTableVersion--) | Hämtar formatversion. |
| [getTag()](#getTag--) | Hämtar tabellens tagg. |
| [getTtfTables()](#getTtfTables--) | Referens till TTF-tabellarkivet. |
| [getVersion()](#getVersion--) | Hämtar fast version 0x00010000 om (version 1.0). |
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


Hämtar uint16 maxComponentContours konturer i sammansatt glyf.

**Returns:**
int - UInt16 maxComponentContours konturer i sammansatt glyf.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Hämtar uint16 maxComponentDepth rekursionsnivåer, sätt till 0 om fonten bara har enkla glyfer.

**Returns:**
int - Uint16 maxComponentDepth nivåer av rekursion, sätt till 0 om teckensnittet bara har enkla glyfer.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Hämtar uint16 maxComponentElements antal glyfer som refereras på toppnivå.

**Returns:**
int - UInt16 maxComponentElements antal glyfer som refereras på toppnivå.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Hämtar uint16 maxComponentPoints punkter i sammansatt glyf.

**Returns:**
int - UInt16 maxComponentPoints punkter i sammansatt glyf.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Hämtar uint16 maxContours konturer i icke-sammansatt glyf.

**Returns:**
int - UInt16 maxContours konturer i icke-sammansatt glyf.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Hämtar uint16 maxFunctionDefs antal FDEF:ar.

**Returns:**
int - UInt16 maxFunctionDefs antal FDEF:er.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Hämtar uint16 maxInstructionDefs antal IDEF:ar.

**Returns:**
int - UInt16 maxInstructionDefs antal IDEF:er.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Hämta uint16 maxPoints punkter i icke-sammansatt glyf.

**Returns:**
int - UInt16 maxPoints punkter i icke-sammansatt glyf.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Hämtar uint16 maxSizeOfInstructions byteantal för glyfinstruktioner.

**Returns:**
int - UInt16 maxSizeOfInstructions byteantal för glyfinstruktioner.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Hämtar uint16 maxStackElements maximal stackdjup.

**Returns:**
int - UInt16 maxStackElements maximal stackdjup.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Hämtar uint16 maxStorage antal lagringsområdesplatser.

**Returns:**
int - UInt16 maxStorage antal lagringsområdesplatser.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Hämtar uint16 maxTwilightPoints punkter som används i Twilight Zone (Z0).

**Returns:**
int - UInt16 maxTwilightPoints punkter som används i Twilight Zone (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Hämtar uint16 maxZones satt till 2.

**Returns:**
int - Uint16 maxZones satt till 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Hämtar uint16 numGlyphs antalet glyfer i Fonten.

**Returns:**
int - UInt16 numGlyphs antalet glyfer i teckensnittet.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Hämtar förskjutning från början av sfnt.

**Returns:**
long - Förskjutning från början av sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Hämtar formatversion. Använd egenskaperna MajorNumber och MinorNUmber i objektet Version16Dot16 i hexadecimal notation för att upptäcka vilken version som används.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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


Hämtar fast version 0x00010000 om (version 1.0). Föråldrad, använd egenskapen TableVersion istället.

**Returns:**
float - Fast version 0x00010000 om (version 1.0).
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

