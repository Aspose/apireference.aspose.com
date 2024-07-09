---
title: TtfMaxpTable
second_title: Aspose.Font for Java API Reference
description: Represents maxp table of the TTF font file
type: docs
weight: 96
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
| [getTag()](#getTag--) | Gets table tag. |
| [getVersion()](#getVersion--) | Gets fixed version 0x00010000 if (version 1.0). |
| [getTableVersion()](#getTableVersion--) | Gets format version. |
| [getNumGlyphs()](#getNumGlyphs--) | Gets uint16 numGlyphs the number of glyphs in the Font. |
| [getMaxPoints()](#getMaxPoints--) | Get uint16 maxPoints points in non-compound glyph. |
| [getMaxContours()](#getMaxContours--) | Gets uint16 maxContours contours in non-compound glyph. |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | Gets uint16 maxComponentPoints points in compound glyph. |
| [getMaxComponentContours()](#getMaxComponentContours--) | Gets uint16 maxComponentContours contours in compound glyph. |
| [getMaxZones()](#getMaxZones--) | Gets uint16 maxZones set to 2. |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0). |
| [getMaxStorage()](#getMaxStorage--) | Gets uint16 maxStorage number of Storage Area locations. |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | Gets uint16 maxFunctionDefs number of FDEFs. |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | Gets uint16 maxInstructionDefs number of IDEFs. |
| [getMaxStackElements()](#getMaxStackElements--) | Gets uint16 maxStackElements maximum stack depth. |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | Gets uint16 maxSizeOfInstructions byte count for glyph instructions. |
| [getMaxComponentElements()](#getMaxComponentElements--) | Gets uint16 maxComponentElements number of glyphs referenced at top level. |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs. |
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


Gets fixed version 0x00010000 if (version 1.0). Deprecated, use  TableVersion  property instead.

**Returns:**
float - Fixed version 0x00010000 if (version 1.0).
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


Gets format version. Use properties MajorNumber and MinorNUmber of object  Version16Dot16  in hexademical notation to detect version used.

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets uint16 numGlyphs the number of glyphs in the Font.

**Returns:**
int - UInt16 numGlyphs the number of glyphs in the Font.
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


Get uint16 maxPoints points in non-compound glyph.

**Returns:**
int - UInt16 maxPoints points in non-compound glyph.
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


Gets uint16 maxContours contours in non-compound glyph.

**Returns:**
int - UInt16 maxContours contours in non-compound glyph.
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


Gets uint16 maxComponentPoints points in compound glyph.

**Returns:**
int - UInt16 maxComponentPoints points in compound glyph.
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


Gets uint16 maxComponentContours contours in compound glyph.

**Returns:**
int - UInt16 maxComponentContours contours in compound glyph.
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


Gets uint16 maxZones set to 2.

**Returns:**
int - Uint16 maxZones set to 2.
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0).

**Returns:**
int - UInt16 maxTwilightPoints points used in Twilight Zone (Z0).
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


Gets uint16 maxStorage number of Storage Area locations.

**Returns:**
int - UInt16 maxStorage number of Storage Area locations.
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
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


Gets uint16 maxStackElements maximum stack depth.

**Returns:**
int - UInt16 maxStackElements maximum stack depth.
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


Gets uint16 maxSizeOfInstructions byte count for glyph instructions.

**Returns:**
int - UInt16 maxSizeOfInstructions byte count for glyph instructions.
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


Gets uint16 maxComponentElements number of glyphs referenced at top level.

**Returns:**
int - UInt16 maxComponentElements number of glyphs referenced at top level.
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs.

**Returns:**
int - Uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs.
