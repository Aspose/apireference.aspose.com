---
title: Aspose::Font::TtfTables::TtfHeadTable class
linktitle: TtfHeadTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfHeadTable class. Represents "head" table of the TTF Font file in C++.'
type: docs
weight: 700
url: /cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


Represents "head" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methods

| Method | Description |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the 'head' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the 'head' table will not be wrong. That is OK. |
| [get_Created](./get_created/)() const | Gets longDateTime created international date. |
| [get_Flags](./get_flags/)() const | Gets uint16 flags. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | Gets int16 fontDirectionHint. 0 Mixed directional glyphs; 1 Only strongly left to right glyphs; 2 Like 1 but also contains neutrals; -1 Only strongly right to left glyphs; -2 Like -1 but also contains neutrals. |
| [get_FontRevision](./get_fontrevision/)() const | Gets fixed fontRevision set by font manufacturer. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | Gets int16 glyphDataFormat 0 for current format. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | Gets int16 indexToLocFormat 0 for short offsets, 1 for long. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | Gets uint16 lowestRecPPEM smallest readable size in pixels. |
| [get_MacStyle](./get_macstyle/)() const | Gets uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | Gets uint32 magicNumber set to 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | Gets longDateTime modified international date. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
| [get_UnitsPerEM](./get_unitsperem/)() const | Gets uint16 unitsPerEm range from 64 to 16384. |
| [get_Version](./get_version/)() const | Fixed version 0x00010000 if (version 1.0). |
| [get_XMax](./get_xmax/)() const | Gets FWord xMax for all glyph bounding boxes. |
| [get_XMin](./get_xmin/)() const | Gets FWord xMin for all glyph bounding boxes. |
| [get_YMax](./get_ymax/)() const | Gets FWord yMax for all glyph bounding boxes. |
| [get_YMin](./get_ymin/)() const | Gets FWord yMin for all glyph bounding boxes. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
