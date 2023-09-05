---
title: TtfPostTable
second_title: Aspose.Font for Java API Reference
description: Represents post table of the TTF font file
type: docs
weight: 87
url: /java/com.aspose.font/ttfposttable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfPostTable extends TtfTableBase
```

Represents "post" table of the TTF font file
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets table tag. |
| [getFormat()](#getFormat--) | Gets fixed format(version) of this table. |
| [getTableFormat()](#getTableFormat--) | Gets fixed format (version) of this table. |
| [getItalicAngle()](#getItalicAngle--) | Gets fixed italicAngle Italic angle in degrees. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Gets FWord underlinePosition Underline position. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Gets FWord underlineThickness Underline thickness. |
| [isFixedPitch()](#isFixedPitch--) | Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced). |
| [getMinMemType42()](#getMinMemType42--) | Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [getMaxMemType42()](#getMaxMemType42--) | Gets uint32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [getMinMemType1()](#getMinMemType1--) | Gets uint32 minMemType1 Minimum memory usage when a TrueType Font is downloaded as a Type 1 Font. |
| [getMaxMemType1()](#getMaxMemType1--) | Gets uint32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Gets glyph name by glyph index. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Gets glyph index by glyph name. |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Gets array of glyphs indexes by glyph name |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Indicates that no PostScript name information is provided for the glyphs in this font file. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getFormat() {#getFormat--}
```
public float getFormat()
```


Gets fixed format(version) of this table.

**Returns:**
float - Fixed format(version) of this table.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Gets fixed format (version) of this table. Use properties MajorNumber and MinorNUmber of object  Version16Dot16  in hexademical notation to detect version used.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Gets fixed italicAngle Italic angle in degrees.

**Returns:**
float - Fixed italicAngle Italic angle in degrees.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public short getUnderlinePosition()
```


Gets FWord underlinePosition Underline position.

**Returns:**
short - FWord underlinePosition Underline position.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public short getUnderlineThickness()
```


Gets FWord underlineThickness Underline thickness.

**Returns:**
short - FWord underlineThickness Underline thickness.
### isFixedPitch() {#isFixedPitch--}
```
public long isFixedPitch()
```


Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced).

**Returns:**
long - UInt32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced).
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font.

**Returns:**
long - UInt32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font.
### getMaxMemType42() {#getMaxMemType42--}
```
public long getMaxMemType42()
```


Gets uint32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 Font.

**Returns:**
long - UInt32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 Font.
### getMinMemType1() {#getMinMemType1--}
```
public long getMinMemType1()
```


Gets uint32 minMemType1 Minimum memory usage when a TrueType Font is downloaded as a Type 1 Font.

**Returns:**
long - UInt32 minMemType1 Minimum memory usage when a TrueType Font is downloaded as a Type 1 Font.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Gets uint32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font.

**Returns:**
long - UInt32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font.
### getGlyphName(long glyphIndex) {#getGlyphName-long-}
```
public String getGlyphName(long glyphIndex)
```


Gets glyph name by glyph index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphIndex | long | Glyph index. |

**Returns:**
java.lang.String - Glyph name.
### getGlyphIndex(String glyphName) {#getGlyphIndex-java.lang.String-}
```
public long getGlyphIndex(String glyphName)
```


Gets glyph index by glyph name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph name. |

**Returns:**
long - Glyph index
### getAllGlyphIndexesForGlyphName(String glyphName) {#getAllGlyphIndexesForGlyphName-java.lang.String-}
```
public long[] getAllGlyphIndexesForGlyphName(String glyphName)
```


Gets array of glyphs indexes by glyph name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | java.lang.String | Glyph name |

**Returns:**
long[] - array of glyphs indexes
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Indicates that no PostScript name information is provided for the glyphs in this font file.

**Returns:**
boolean - True, if no PostScript name information is provided for the glyphs in this font file. False, otherwise.
