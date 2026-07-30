---
title: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth 方法"
linktitle: "get_AdditionalAdvanceWidth"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth 方法。在 hmtx 表中，可能出现字形总数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外的数组 ''leftSideBearing''，它对应属性 LeftSidebearings。但从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的索引的字形也有宽度。这些宽度根据 hmtx 表的规范具有如下值：\"Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above\"（C++）。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


在 hmtx 表中可能出现总字形数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外的数组 'leftSideBearing'，它对应属性 [LeftSidebearings](../)。但是索引从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的字形也具有宽度。这些宽度根据 hmtx 表的规范具有如下值：\"这里的 advanceWidth 被假定为与上面最后一个条目的 advanceWidth 相同\"。

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## 另见

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
