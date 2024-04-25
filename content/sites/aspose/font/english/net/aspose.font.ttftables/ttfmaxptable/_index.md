---
title: Class TtfMaxpTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfMaxpTable class. Represents maxp table of the TTF Font file
type: docs
weight: 1070
url: /net/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class

Represents "maxp" table of the TTF Font file.

```csharp
public class TtfMaxpTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [MaxComponentContours](../../aspose.font.ttftables/ttfmaxptable/maxcomponentcontours/) { get; } | Gets uint16 maxComponentContours contours in compound glyph. |
| [MaxComponentDepth](../../aspose.font.ttftables/ttfmaxptable/maxcomponentdepth/) { get; } | Gets uint16 maxComponentDepth levels of recursion, set to 0 if font has only simple glyphs. |
| [MaxComponentElements](../../aspose.font.ttftables/ttfmaxptable/maxcomponentelements/) { get; } | Gets uint16 maxComponentElements number of glyphs referenced at top level. |
| [MaxComponentPoints](../../aspose.font.ttftables/ttfmaxptable/maxcomponentpoints/) { get; } | Gets uint16 maxComponentPoints points in compound glyph. |
| [MaxContours](../../aspose.font.ttftables/ttfmaxptable/maxcontours/) { get; } | Gets uint16 maxContours contours in non-compound glyph. |
| [MaxFunctionDefs](../../aspose.font.ttftables/ttfmaxptable/maxfunctiondefs/) { get; } | Gets uint16 maxFunctionDefs number of FDEFs. |
| [MaxInstructionDefs](../../aspose.font.ttftables/ttfmaxptable/maxinstructiondefs/) { get; } | Gets uint16 maxInstructionDefs number of IDEFs. |
| [MaxPoints](../../aspose.font.ttftables/ttfmaxptable/maxpoints/) { get; } | Gets uint16 maxPoints points in non-compound glyph. |
| [MaxSizeOfInstructions](../../aspose.font.ttftables/ttfmaxptable/maxsizeofinstructions/) { get; } | Gets uint16 maxSizeOfInstructions byte count for glyph instructions. |
| [MaxStackElements](../../aspose.font.ttftables/ttfmaxptable/maxstackelements/) { get; } | Gets uint16 maxStackElements maximum stack depth. |
| [MaxStorage](../../aspose.font.ttftables/ttfmaxptable/maxstorage/) { get; } | Gets uint16 maxStorage number of Storage Area locations. |
| [MaxTwilightPoints](../../aspose.font.ttftables/ttfmaxptable/maxtwilightpoints/) { get; } | Gets uint16 maxTwilightPoints points used in Twilight Zone (Z0). |
| [MaxZones](../../aspose.font.ttftables/ttfmaxptable/maxzones/) { get; } | Gets uint16 maxZones set to 2. |
| [NumGlyphs](../../aspose.font.ttftables/ttfmaxptable/numglyphs/) { get; } | Gets uint16 numGlyphs the number of glyphs in the Font. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TableVersion](../../aspose.font.ttftables/ttfmaxptable/tableversion/) { get; } | Gets format version. Use properties MajorNumber and MinorNUmber of object [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) in hexademical notation to detect version used. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| [Version](../../aspose.font.ttftables/ttfmaxptable/version/) { get; } | Gets fixed version 0x00010000 if (version 1.0). Deprecated, use [`TableVersion`](./tableversion/) property instead. |
| static [Tag](../../aspose.font.ttftables/ttfmaxptable/tag/) { get; } | Gets table tag. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


