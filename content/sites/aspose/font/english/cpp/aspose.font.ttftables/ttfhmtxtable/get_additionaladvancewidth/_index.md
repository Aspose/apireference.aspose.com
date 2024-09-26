---
title: Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth method
linktitle: get_AdditionalAdvanceWidth
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth method. In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array ''leftSideBearing'' which is correspondent to property LeftSidebearings. But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above" in C++.'
type: docs
weight: 400
url: /cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array 'leftSideBearing' which is correspondent to property [LeftSidebearings](../). But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## See Also

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
