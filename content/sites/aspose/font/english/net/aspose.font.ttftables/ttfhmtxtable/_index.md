---
title: Class TtfHmtxTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfHmtxTable class. Represents hmtx table of the TTF Font file
type: docs
weight: 1000
url: /net/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class

Represents "hmtx" table of the TTF Font file.

```csharp
public class TtfHmtxTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [AdditionalAdvanceWidth](../../aspose.font.ttftables/ttfhmtxtable/additionaladvancewidth/) { get; } | In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array 'leftSideBearing' which is correspondent to property [`LeftSidebearings`](./leftsidebearings/). But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above". |
| [HMetrics](../../aspose.font.ttftables/ttfhmtxtable/hmetrics/) { get; } | Gets horizontal metrics. |
| [LeftSidebearings](../../aspose.font.ttftables/ttfhmtxtable/leftsidebearings/) { get; } | Gets left side bearings. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| static [Tag](../../aspose.font.ttftables/ttfhmtxtable/tag/) { get; } | Gets table tag. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


