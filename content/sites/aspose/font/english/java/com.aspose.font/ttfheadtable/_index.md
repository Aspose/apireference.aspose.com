---
title: TtfHeadTable
second_title: Aspose.Font for Java API Reference
description: Represents head table of the TTF Font file.
type: docs
weight: 98
url: /java/com.aspose.font/ttfheadtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfHeadTable extends TtfTableBase
```

Represents "head" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Gets uint32 checkSumAdjustment. |
| [getClass()](#getClass--) |  |
| [getCreated()](#getCreated--) | Gets longDateTime created international date. |
| [getFlags()](#getFlags--) | Gets uint16 flags. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals. |
| [getFontRevision()](#getFontRevision--) | Get fixed fontRevision set by font manufacturer. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Gets int16 glyphDataFormat 0 for current format. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Gets int16 indexToLocFormat 0 for short offsets, 1 for long. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Gets uint16 lowestRecPPEM smallest readable size in pixels. |
| [getMacStyle()](#getMacStyle--) | Gets uint16 macStyle. |
| [getMagicNumber()](#getMagicNumber--) | Gets uint32 magicNumber set to 0x5F0F3CF5. |
| [getModified()](#getModified--) | Gets longDateTime modified international date. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets uint16 unitsPerEM range from 64 to 16384. |
| [getVersion()](#getVersion--) | Fixed version 0x00010000 if (version 1.0). |
| [getXMax()](#getXMax--) | Gets FWord xMax for all glyph bounding boxes. |
| [getXMin()](#getXMin--) | Gets FWord xMin for all glyph bounding boxes. |
| [getYMax()](#getYMax--) | Gets FWord yMax for all glyph bounding boxes. |
| [getYMin()](#getYMin--) | Gets FWord yMin for all glyph bounding boxes. |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the 'head' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the 'head' table will not be wrong. That is OK.

**Returns:**
long - Uint32 checkSumAdjustment.
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


Gets longDateTime created international date.

**Returns:**
java.util.Date - LongDateTime created international date.
### getFlags() {#getFlags--}
```
public int getFlags()
```


Gets uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals.

**Returns:**
short - Int16 fontDirectionHint.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Get fixed fontRevision set by font manufacturer.

**Returns:**
float - Fixed fontRevision set by font manufacturer.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Gets int16 glyphDataFormat 0 for current format.

**Returns:**
short - Int16 glyphDataFormat 0 for current format.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Gets int16 indexToLocFormat 0 for short offsets, 1 for long.

**Returns:**
short - Int16 indexToLocFormat 0 for short offsets, 1 for long.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Gets uint16 lowestRecPPEM smallest readable size in pixels.

**Returns:**
int - UInt16 lowestRecPPEM smallest readable size in pixels.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Gets uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Gets uint32 magicNumber set to 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber set to 0x5F0F3CF5.
### getModified() {#getModified--}
```
public Date getModified()
```


Gets longDateTime modified international date.

**Returns:**
java.util.Date - LongDateTime modified international date.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets uint16 unitsPerEM range from 64 to 16384.

**Returns:**
long - UInt16 unitsPerEM range from 64 to 16384.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Fixed version 0x00010000 if (version 1.0).

**Returns:**
float - Fixed version 0x00010000 if (version 1.0).
### getXMax() {#getXMax--}
```
public short getXMax()
```


Gets FWord xMax for all glyph bounding boxes.

**Returns:**
short - FWord xMax for all glyph bounding boxes.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Gets FWord xMin for all glyph bounding boxes.

**Returns:**
short - FWord xMin for all glyph bounding boxes.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Gets FWord yMax for all glyph bounding boxes.

**Returns:**
short - FWord yMax for all glyph bounding boxes.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Gets FWord yMin for all glyph bounding boxes.

**Returns:**
short - FWord yMin for all glyph bounding boxes.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

