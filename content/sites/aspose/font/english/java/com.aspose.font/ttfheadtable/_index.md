---
title: TtfHeadTable
second_title: Aspose.Font for Java API Reference
description: Represents head table of the TTF Font file.
type: docs
weight: 79
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
| [getTag()](#getTag--) | Gets table tag. |
| [getVersion()](#getVersion--) | Fixed version 0x00010000 if (version 1.0). |
| [getFlags()](#getFlags--) | Gets uint16 flags. |
| [getFontRevision()](#getFontRevision--) | Get fixed fontRevision set by font manufacturer. |
| [getCheckSumAdjustment()](#getCheckSumAdjustment--) | Gets uint32 checkSumAdjustment. |
| [getMagicNumber()](#getMagicNumber--) | Gets uint32 magicNumber set to 0x5F0F3CF5. |
| [getUnitsPerEM()](#getUnitsPerEM--) | Gets uint16 unitsPerEM range from 64 to 16384. |
| [getCreated()](#getCreated--) | Gets longDateTime created international date. |
| [getModified()](#getModified--) | Gets longDateTime modified international date. |
| [getXMin()](#getXMin--) | Gets FWord xMin for all glyph bounding boxes. |
| [getYMin()](#getYMin--) | Gets FWord yMin for all glyph bounding boxes. |
| [getXMax()](#getXMax--) | Gets FWord xMax for all glyph bounding boxes. |
| [getYMax()](#getYMax--) | Gets FWord yMax for all glyph bounding boxes. |
| [getMacStyle()](#getMacStyle--) | Gets uint16 macStyle. |
| [getLowestRecPPEM()](#getLowestRecPPEM--) | Gets uint16 lowestRecPPEM smallest readable size in pixels. |
| [getFontDirectionHint()](#getFontDirectionHint--) | Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals. |
| [getIndexToLocFormat()](#getIndexToLocFormat--) | Gets int16 indexToLocFormat 0 for short offsets, 1 for long. |
| [getGlyphDataFormat()](#getGlyphDataFormat--) | Gets int16 glyphDataFormat 0 for current format. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getVersion() {#getVersion--}
```
public float getVersion()
```


Fixed version 0x00010000 if (version 1.0).

**Returns:**
float - Fixed version 0x00010000 if (version 1.0).
### getFlags() {#getFlags--}
```
public int getFlags()
```


Gets uint16 flags.

**Returns:**
int - UInt16 flags.
### getFontRevision() {#getFontRevision--}
```
public float getFontRevision()
```


Get fixed fontRevision set by font manufacturer.

**Returns:**
float - Fixed fontRevision set by font manufacturer.
### getCheckSumAdjustment() {#getCheckSumAdjustment--}
```
public long getCheckSumAdjustment()
```


Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the 'head' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the 'head' table will not be wrong. That is OK.

**Returns:**
long - Uint32 checkSumAdjustment.
### getMagicNumber() {#getMagicNumber--}
```
public long getMagicNumber()
```


Gets uint32 magicNumber set to 0x5F0F3CF5.

**Returns:**
long - UInt32 magicNumber set to 0x5F0F3CF5.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


Gets uint16 unitsPerEM range from 64 to 16384.

**Returns:**
long - UInt16 unitsPerEM range from 64 to 16384.
### getCreated() {#getCreated--}
```
public Date getCreated()
```


Gets longDateTime created international date.

**Returns:**
java.util.Date - LongDateTime created international date.
### getModified() {#getModified--}
```
public Date getModified()
```


Gets longDateTime modified international date.

**Returns:**
java.util.Date - LongDateTime modified international date.
### getXMin() {#getXMin--}
```
public short getXMin()
```


Gets FWord xMin for all glyph bounding boxes.

**Returns:**
short - FWord xMin for all glyph bounding boxes.
### getYMin() {#getYMin--}
```
public short getYMin()
```


Gets FWord yMin for all glyph bounding boxes.

**Returns:**
short - FWord yMin for all glyph bounding boxes.
### getXMax() {#getXMax--}
```
public short getXMax()
```


Gets FWord xMax for all glyph bounding boxes.

**Returns:**
short - FWord xMax for all glyph bounding boxes.
### getYMax() {#getYMax--}
```
public short getYMax()
```


Gets FWord yMax for all glyph bounding boxes.

**Returns:**
short - FWord yMax for all glyph bounding boxes.
### getMacStyle() {#getMacStyle--}
```
public int getMacStyle()
```


Gets uint16 macStyle.

**Returns:**
int - UInt16 macStyle.
### getLowestRecPPEM() {#getLowestRecPPEM--}
```
public int getLowestRecPPEM()
```


Gets uint16 lowestRecPPEM smallest readable size in pixels.

**Returns:**
int - UInt16 lowestRecPPEM smallest readable size in pixels.
### getFontDirectionHint() {#getFontDirectionHint--}
```
public short getFontDirectionHint()
```


Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals.

**Returns:**
short - Int16 fontDirectionHint.
### getIndexToLocFormat() {#getIndexToLocFormat--}
```
public short getIndexToLocFormat()
```


Gets int16 indexToLocFormat 0 for short offsets, 1 for long.

**Returns:**
short - Int16 indexToLocFormat 0 for short offsets, 1 for long.
### getGlyphDataFormat() {#getGlyphDataFormat--}
```
public short getGlyphDataFormat()
```


Gets int16 glyphDataFormat 0 for current format.

**Returns:**
short - Int16 glyphDataFormat 0 for current format.
