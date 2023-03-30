---
title: TtfHmtxTable.AdditionalAdvanceWidth
second_title: Aspose.Font for .NET API Reference
description: TtfHmtxTable property. In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array leftSideBearing which is correspondent to property LeftSidebearings. But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above
type: docs
weight: 10
url: /net/aspose.font.ttftables/ttfhmtxtable/additionaladvancewidth/
---
## TtfHmtxTable.AdditionalAdvanceWidth property

In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array 'leftSideBearing' which is correspondent to property [`LeftSidebearings`](../leftsidebearings/). But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

```csharp
public ushort AdditionalAdvanceWidth { get; }
```

### See Also

* class [TtfHmtxTable](../)
* namespace [Aspose.Font.TtfTables](../../ttfhmtxtable/)
* assembly [Aspose.Font](../../../)


