---
title: "类 TtfStatTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfStatTable 类。表示 OpenType 字体的样式属性表 STAT"
type: docs
weight: 1300
url: /zh/net/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class

表示 OpenType 字体的 Style Attributes Table(STAT) 表。

```csharp
public class TtfStatTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [AxisRecords](../../aspose.font.ttftables/ttfstattable/axisrecords/) { get; } | 返回设计轴数组。轴数组是 Axis Record 类型结构的数组。规范：轴记录提供单个设计轴的信息。 |
| [AxisValueCount](../../aspose.font.ttftables/ttfstattable/axisvaluecount/) { get; } | 返回轴值表的数量。 |
| [AxisValueTables](../../aspose.font.ttftables/ttfstattable/axisvaluetables/) { get; } | 返回轴值表数组。规范：轴值表提供有关特定样式属性值在某个特定设计变体轴上，或设计变体轴值组合上的详细信息，以及这些值与用作子族名称元素的标签之间的关系。 |
| [DesignAxisCount](../../aspose.font.ttftables/ttfstattable/designaxiscount/) { get; } | 返回轴记录的数量。规范：在包含 'fvar' 表的字体中，此值必须大于或等于 'fvar' 表中的 axisCount 值。在所有字体中，如果 axisValueCount 大于零，则必须大于零。 |
| [ElidedFallbackName](../../aspose.font.ttftables/ttfstattable/elidedfallbackname/) { get; } | 规范：当名称投射到特定字体模型产生仅包含可省略元素的子族名称时使用的备用名称。 |
| [ElidedFallbackNameId](../../aspose.font.ttftables/ttfstattable/elidedfallbacknameid/) { get; } | 规范：当名称投射到特定字体模型产生仅包含可省略元素的子族名称时使用的备用名称 ID。 |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| static [Tag](../../aspose.font.ttftables/ttfstattable/tag/) { get; } | 获取表标签。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [AddAxisRecord](../../aspose.font.ttftables/ttfstattable/addaxisrecord/)(AxisRecord) | 向表中添加 Axis Record 结构。 |
| [AddAxisValueTable](../../aspose.font.ttftables/ttfstattable/addaxisvaluetable/)(AxisValueTableBase) | 向表中添加轴值表结构。 |
| [ClearAxisRecords](../../aspose.font.ttftables/ttfstattable/clearaxisrecords/)() | 从表中移除所有轴记录。 |
| [ClearAxisValueTables](../../aspose.font.ttftables/ttfstattable/clearaxisvaluetables/)() | 从表中移除所有轴值表。 |

## 其他成员

| 名称 | 描述 |
| --- | --- |
| class [AxisRecord](../../aspose.font.ttftables/ttfstattable.axisrecord) | 表示 Axis Record 结构。规范：轴记录提供单个设计轴的信息。 |
| class [AxisValue](../../aspose.font.ttftables/ttfstattable.axisvalue) | 表示 AxisValue 记录。 |
| abstract class [AxisValueTableBase](../../aspose.font.ttftables/ttfstattable.axisvaluetablebase) | 轴值表结构的基类。规范：轴值表提供有关特定样式属性值在某个特定设计变体轴上，或设计变体轴值组合上的详细信息，以及这些值与用作子族名称元素的标签之间的关系。 |
| [Flags] enum [AxisValueTableFlags](../../aspose.font.ttftables/ttfstattable.axisvaluetableflags) | 指定轴值表标志 |
| class [AxisValueTableFormat1](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat1) | 表示轴值表格式 1 |
| class [AxisValueTableFormat2](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat2) | 表示轴值表格式 2 |
| class [AxisValueTableFormat3](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat3) | 表示轴值表格式 3 |
| class [AxisValueTableFormat4](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat4) | 表示轴值表格式 4 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


