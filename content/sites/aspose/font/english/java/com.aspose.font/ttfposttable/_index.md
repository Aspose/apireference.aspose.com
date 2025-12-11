---
title: TtfPostTable
second_title: Aspose.Font for Java API Reference
description: Represents post table of the TTF font file
type: docs
weight: 106
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
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIndexesForGlyphName(String glyphName)](#getAllGlyphIndexesForGlyphName-java.lang.String-) | Gets array of glyphs indexes by glyph name |
| [getClass()](#getClass--) |  |
| [getFormat()](#getFormat--) | Gets fixed format(version) of this table. |
| [getGlyphIndex(String glyphName)](#getGlyphIndex-java.lang.String-) | Gets glyph index by glyph name. |
| [getGlyphName(long glyphIndex)](#getGlyphName-long-) | Gets glyph name by glyph index. |
| [getItalicAngle()](#getItalicAngle--) | Gets fixed italicAngle Italic angle in degrees. |
| [getMaxMemType1()](#getMaxMemType1--) | Gets uint32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font. |
| [getMaxMemType42()](#getMaxMemType42--) | Gets uint32 maxMemType42 Maximum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [getMinMemType1()](#getMinMemType1--) | Gets uint32 minMemType1 Minimum memory usage when a TrueType Font is downloaded as a Type 1 Font. |
| [getMinMemType42()](#getMinMemType42--) | Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTableFormat()](#getTableFormat--) | Gets fixed format (version) of this table. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getUnderlinePosition()](#getUnderlinePosition--) | Gets FWord underlinePosition Underline position. |
| [getUnderlineThickness()](#getUnderlineThickness--) | Gets FWord underlineThickness Underline thickness. |
| [hasNoPostScriptNames()](#hasNoPostScriptNames--) | Indicates that no PostScript name information is provided for the glyphs in this font file. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced). |
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


Gets fixed format(version) of this table.

**Returns:**
float - Fixed format(version) of this table.
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
long - Glyph index. When no PostScript name information is provided for the glyphs in this font file, returns the index 0, which is the undefined glyph or ".notdef" glyph.
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
java.lang.String - Glyph name. When no PostScript name information is provided for the glyphs in this font file, returns null.
### getItalicAngle() {#getItalicAngle--}
```
public float getItalicAngle()
```


Gets fixed italicAngle Italic angle in degrees.

**Returns:**
float - Fixed italicAngle Italic angle in degrees.
### getMaxMemType1() {#getMaxMemType1--}
```
public long getMaxMemType1()
```


Gets uint32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font.

**Returns:**
long - UInt32 maxMemType1 Maximum memory usage when a TrueType Font is downloaded as a Type 1 Font.
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
### getMinMemType42() {#getMinMemType42--}
```
public long getMinMemType42()
```


Gets uint32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font.

**Returns:**
long - UInt32 minMemType42 Minimum memory usage when a TrueType font is downloaded as a Type 42 Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTableFormat() {#getTableFormat--}
```
public Version16Dot16 getTableFormat()
```


Gets fixed format (version) of this table. Use properties MajorNumber and MinorNUmber of object  Version16Dot16  in hexademical notation to detect version used.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Fixed format (version) of this table.
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
### hasNoPostScriptNames() {#hasNoPostScriptNames--}
```
public boolean hasNoPostScriptNames()
```


Indicates that no PostScript name information is provided for the glyphs in this font file.

**Returns:**
boolean - True, if no PostScript name information is provided for the glyphs in this font file. False, otherwise.
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


Gets uint32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced).

**Returns:**
long - UInt32 isFixedPitch. 0 if the font is proportionally spaced, non-zero if the Font is not proportionally spaced (i.e. monospaced).
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

