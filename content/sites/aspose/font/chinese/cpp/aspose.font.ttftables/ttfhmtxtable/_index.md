---
title: "Aspose::Font::TtfTables::TtfHmtxTable 类"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable 类。表示 C++ 中 TTF 字体文件的 \\\"hmtx\\\" 表。"
type: docs
weight: 900
url: /zh/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


表示 TTF [Font](../../aspose.font/font/) 文件的 \"hmtx\" 表。

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | 在 hmtx 表中可能出现总字形数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外的数组 'leftSideBearing'，它对应属性 [LeftSidebearings](../)。但是索引从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的字形也具有宽度。这些宽度根据 hmtx 表的规范具有如下值：\"这里的 advanceWidth 被假定为与上面最后一个条目的 advanceWidth 相同\"。 |
| [get_HMetrics](./get_hmetrics/)() | 获取水平度量。 |
| [get_LeftSidebearings](./get_leftsidebearings/)() | 获取左侧间距。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
