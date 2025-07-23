---
title: TtfMaxpTable
second_title: Aspose.Font for Java API Reference
description: Represents maxp table of the TTF font file
type: docs
weight: 103
url: /java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

Represents "maxp" table of the TTF font file
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | Gets uint16 maxComponentContours contours in compound glyph. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Gets uint16 maxComponentElements number of glyphs referenced at top level. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Gets uint16 maxComponentPoints points in compound glyph. |
| [getMaxContours()](#getMaxContours--) | Gets uint16 maxContours contours in non-compound glyph. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Gets uint16 maxFunctionDefs number of FDEFs. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Gets uint16 maxInstructionDefs number of IDEFs. |
| [getMaxPoints()](#getMaxPoints--) | Get uint16 maxPoints points in non-compound glyph. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Gets uint16 maxSizeOfInstructions byte count for glyph instructions. |
| [getMaxStackElements()](#getMaxStackElements--) | Gets uint16 maxStackElements maximum stack depth. |
| [getMaxStorage()](#getMaxStorage--) | Gets uint16 maxStorage number of Storage Area locations. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0). |
| [getMaxZones()](#getMaxZones--) | Gets uint16 maxZones set to 2. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets uint16 numGlyphs the number of glyphs in the Font. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTableVersion()](#getTableVersion--) | Gets format version. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getVersion()](#getVersion--) | Gets fixed version 0x00010000 if (version 1.0). |
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


Gets uint16 maxComponentContours contours in compound glyph.

**Returns:**
int - UInt16 maxComponentContours contours in compound glyph.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs.

**Returns:**
int - Uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Gets uint16 maxComponentElements number of glyphs referenced at top level.

**Returns:**
int - UInt16 maxComponentElements number of glyphs referenced at top level.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Gets uint16 maxComponentPoints points in compound glyph.

**Returns:**
int - UInt16 maxComponentPoints points in compound glyph.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Gets uint16 maxContours contours in non-compound glyph.

**Returns:**
int - UInt16 maxContours contours in non-compound glyph.
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


Gets uint16 maxFunctionDefs number of FDEFs.

**Returns:**
int - UInt16 maxFunctionDefs number of FDEFs.
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


Gets uint16 maxInstructionDefs number of IDEFs.

**Returns:**
int - UInt16 maxInstructionDefs number of IDEFs.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Get uint16 maxPoints points in non-compound glyph.

**Returns:**
int - UInt16 maxPoints points in non-compound glyph.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Gets uint16 maxSizeOfInstructions byte count for glyph instructions.

**Returns:**
int - UInt16 maxSizeOfInstructions byte count for glyph instructions.
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Gets uint16 maxStackElements maximum stack depth.

**Returns:**
int - UInt16 maxStackElements maximum stack depth.
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Gets uint16 maxStorage number of Storage Area locations.

**Returns:**
int - UInt16 maxStorage number of Storage Area locations.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0).

**Returns:**
int - UInt16 maxTwilightPoints points used in Twilight Zone (Z0).
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Gets uint16 maxZones set to 2.

**Returns:**
int - Uint16 maxZones set to 2.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets uint16 numGlyphs the number of glyphs in the Font.

**Returns:**
int - UInt16 numGlyphs the number of glyphs in the Font.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Gets format version. Use properties MajorNumber and MinorNUmber of object  Version16Dot16  in hexademical notation to detect version used.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


Gets fixed version 0x00010000 if (version 1.0). Deprecated, use  TableVersion  property instead.

**Returns:**
float - Fixed version 0x00010000 if (version 1.0).
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

