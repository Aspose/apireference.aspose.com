---
title: Class TtfHeadTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfHeadTable class. Represents head table of the TTF Font file
type: docs
weight: 990
url: /net/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class

Represents "head" table of the TTF Font file.

```csharp
public class TtfHeadTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [CheckSumAdjustment](../../aspose.font.ttftables/ttfheadtable/checksumadjustment/) { get; } | Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the 'head' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the 'head' table will not be wrong. That is OK. |
| [Created](../../aspose.font.ttftables/ttfheadtable/created/) { get; } | Gets longDateTime created international date. |
| [Flags](../../aspose.font.ttftables/ttfheadtable/flags/) { get; } | Gets uint16 flags. |
| [FontDirectionHint](../../aspose.font.ttftables/ttfheadtable/fontdirectionhint/) { get; } | Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals. |
| [FontRevision](../../aspose.font.ttftables/ttfheadtable/fontrevision/) { get; } | Gets fixed fontRevision set by font manufacturer. |
| [GlyphDataFormat](../../aspose.font.ttftables/ttfheadtable/glyphdataformat/) { get; } | Gets int16 glyphDataFormat 0 for current format. |
| [IndexToLocFormat](../../aspose.font.ttftables/ttfheadtable/indextolocformat/) { get; } | Gets int16 indexToLocFormat 0 for short offsets, 1 for long. |
| [LowestRecPPEM](../../aspose.font.ttftables/ttfheadtable/lowestrecppem/) { get; } | Gets uint16 lowestRecPPEM smallest readable size in pixels. |
| [MacStyle](../../aspose.font.ttftables/ttfheadtable/macstyle/) { get; } | Gets uint16 macStyle. |
| [MagicNumber](../../aspose.font.ttftables/ttfheadtable/magicnumber/) { get; } | Gets uint32 magicNumber set to 0x5F0F3CF5. |
| [Modified](../../aspose.font.ttftables/ttfheadtable/modified/) { get; } | Gets longDateTime modified international date. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| [UnitsPerEM](../../aspose.font.ttftables/ttfheadtable/unitsperem/) { get; } | Gets uint16 unitsPerEm range from 64 to 16384. |
| [Version](../../aspose.font.ttftables/ttfheadtable/version/) { get; } | Fixed version 0x00010000 if (version 1.0). |
| [XMax](../../aspose.font.ttftables/ttfheadtable/xmax/) { get; } | Gets FWord xMax for all glyph bounding boxes. |
| [XMin](../../aspose.font.ttftables/ttfheadtable/xmin/) { get; } | Gets FWord xMin for all glyph bounding boxes. |
| [YMax](../../aspose.font.ttftables/ttfheadtable/ymax/) { get; } | Gets FWord yMax for all glyph bounding boxes. |
| [YMin](../../aspose.font.ttftables/ttfheadtable/ymin/) { get; } | Gets FWord yMin for all glyph bounding boxes. |
| static [Tag](../../aspose.font.ttftables/ttfheadtable/tag/) { get; } | Gets table tag. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


