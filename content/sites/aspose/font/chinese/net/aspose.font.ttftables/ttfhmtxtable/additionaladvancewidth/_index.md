---
title: "TtfHmtxTable.AdditionalAdvanceWidth"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfHmtxTable 属性。在 hmtx 表中可能出现字形总数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外数组 leftSideBearing，对应属性 LeftSidebearings。但索引从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的字形也具有宽度。这些宽度根据 hmtx 表的规范具有如下值：此处假设 advanceWidth 与上面最后一个条目的 advanceWidth 相同。"
type: docs
weight: 10
url: /zh/net/aspose.font.ttftables/ttfhmtxtable/additionaladvancewidth/
---
## TtfHmtxTable.AdditionalAdvanceWidth property

在 hmtx 表中可能出现字形总数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外数组 'leftSideBearing'，对应属性 [`LeftSidebearings`](../leftsidebearings/)。但索引从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的字形也具有宽度。这些宽度根据 hmtx 表的规范具有如下值：“此处假设 advanceWidth 与上面最后一个条目的 advanceWidth 相同”。

```csharp
public ushort AdditionalAdvanceWidth { get; }
```

### 另见

* class [TtfHmtxTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


