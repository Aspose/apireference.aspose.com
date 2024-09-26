---
title: Aspose::Font::TtfTables::TtfHmtxTable class
linktitle: TtfHmtxTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfHmtxTable class. Represents "hmtx" table of the TTF Font file in C++.'
type: docs
weight: 900
url: /cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


Represents "hmtx" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## Methods

| Method | Description |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | In hmtx table could be the cases when total number of glyphs is not equal to hhea.numberOfHMetrics. For these cases hmtx table contains additional array 'leftSideBearing' which is correspondent to property [LeftSidebearings](../). But glyphs with indexes from hhea.numOfLongHorMetrics to maxp.numGlyphs also have widths. And these widths in accordance to specification for hmtx table have such values: "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above". |
| [get_HMetrics](./get_hmetrics/)() | Gets horizontal metrics. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | Gets left side bearings. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
