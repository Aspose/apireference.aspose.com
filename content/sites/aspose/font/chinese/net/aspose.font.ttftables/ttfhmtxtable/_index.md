---
title: "类 TtfHmtxTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfHmtxTable 类。表示 TTF 字体文件的 hmtx 表"
type: docs
weight: 1110
url: /zh/net/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class

表示 "hmtx" 表的 TTF 字体文件。

```csharp
public class TtfHmtxTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [AdditionalAdvanceWidth](../../aspose.font.ttftables/ttfhmtxtable/additionaladvancewidth/) { get; } | 在 hmtx 表中可能出现字形总数不等于 hhea.numberOfHMetrics 的情况。对于这些情况，hmtx 表包含额外的数组 'leftSideBearing'，它对应属性 [`LeftSidebearings`](./leftsidebearings/)。但索引从 hhea.numOfLongHorMetrics 到 maxp.numGlyphs 的字形也具有宽度。这些宽度根据 hmtx 表的规范具有如下值："这里的 advanceWidth 被假定为与上述最后一项的 advanceWidth 相同"。 |
| [HMetrics](../../aspose.font.ttftables/ttfhmtxtable/hmetrics/) { get; } | 获取水平度量。 |
| [LeftSidebearings](../../aspose.font.ttftables/ttfhmtxtable/leftsidebearings/) { get; } | 获取左侧字距。 |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| static [Tag](../../aspose.font.ttftables/ttfhmtxtable/tag/) { get; } | 获取表标签。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


