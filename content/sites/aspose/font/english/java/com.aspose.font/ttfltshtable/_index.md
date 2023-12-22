---
title: TtfLtshTable
second_title: Aspose.Font for Java API Reference
description: Represents Linear Threshold table of the TTF Font file.
type: docs
weight: 87
url: /java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Represents Linear Threshold table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets the table tag. |
| [getVersion()](#getVersion--) | Gets the table version. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets the number of glyphs (from "numGlyphs" in 'maxp' table). |
| [getYPel(int glyphNum)](#getYPel-int-) | Returns the vertical pel height for glyph/zero if glyph number is incorrect. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets the table tag.

**Returns:**
java.lang.String - The table tag.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Gets the table version.

**Returns:**
int - The table version.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets the number of glyphs (from "numGlyphs" in 'maxp' table).

**Returns:**
int - The number of glyphs (from "numGlyphs" in 'maxp' table).
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Returns the vertical pel height for glyph/zero if glyph number is incorrect.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphNum | int | A glyph number (index). |

**Returns:**
byte - The vertical pel height for glyph/zero if glyph number is incorrect.
