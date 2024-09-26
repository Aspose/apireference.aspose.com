---
title: Aspose::Font::TtfTables::TtfMaxpTable class
linktitle: TtfMaxpTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfMaxpTable class. Represents "maxp" table of the TTF Font file in C++.'
type: docs
weight: 1200
url: /cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


Represents "maxp" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methods

| Method | Description |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Gets uint16 maxComponentContours contours in compound glyph. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Gets uint16 maxComponentElements number of glyphs referenced at top level. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Gets uint16 maxComponentPoints points in compound glyph. |
| [get_MaxContours](./get_maxcontours/)() const | Gets uint16 maxContours contours in non-compound glyph. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | Gets uint16 maxFunctionDefs number of FDEFs. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | Gets uint16 maxInstructionDefs number of IDEFs. |
| [get_MaxPoints](./get_maxpoints/)() const | Gets uint16 maxPoints points in non-compound glyph. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | Gets uint16 maxSizeOfInstructions byte count for glyph instructions. |
| [get_MaxStackElements](./get_maxstackelements/)() const | Gets uint16 maxStackElements maximum stack depth. |
| [get_MaxStorage](./get_maxstorage/)() const | Gets uint16 maxStorage number of Storage Area locations. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0). |
| [get_MaxZones](./get_maxzones/)() const | Gets uint16 maxZones set to 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | Gets uint16 numGlyphs the number of glyphs in the [Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | Gets format version. Use properties MajorNumber and MinorNUmber of object [Version16Dot16](../) in hexademical notation to detect version used. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
| [get_Version](./get_version/)() const | Gets fixed version 0x00010000 if (version 1.0). Deprecated, use [TableVersion](../) property instead. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
