---
title: "Aspose::Font::TtfTables::TtfStatTable 类"
linktitle: "TtfStatTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfStatTable 类。表示 C++ 中 OpenType 字体的样式属性表 (STAT)。"
type: docs
weight: 1700
url: /zh/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


表示 OpenType 字体的 Style Attributes Table(STAT)。

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| 枚举 | 描述 |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | 指定轴值表标志。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | 向表中添加 Axis Record 结构。 |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | 向表中添加 Axis Value Table 结构。 |
| [ClearAxisRecords](./clearaxisrecords/)() | 从表中移除所有轴记录。 |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | 从表中移除所有轴值表。 |
| [get_AxisRecords](./get_axisrecords/)() | 返回设计轴数组。轴数组是 Axis Record 类型结构的数组。规格：轴记录提供单个设计轴的信息。 |
| [get_AxisValueCount](./get_axisvaluecount/)() | 返回轴值表的数量。 |
| [get_AxisValueTables](./get_axisvaluetables/)() | 返回 Axis Value Tables 数组。规格：轴值表提供关于特定设计变体轴上某个特定样式属性值，或设计变体轴值组合的详细信息，以及这些值与用作子系列名称元素的标签之间的关系。 |
| [get_DesignAxisCount](./get_designaxiscount/)() | 返回轴记录的数量。规格：在包含 'fvar' 表的字体中，此值必须大于或等于 'fvar' 表中的 axisCount 值。对于所有字体，如果 axisValueCount 大于零，则此值必须大于零。 |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | 规格：当将名称投射到特定字体模型后产生仅包含可省略元素的子系列名称时使用的备用名称。 |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | 规格：当将名称投射到特定字体模型后产生仅包含可省略元素的子系列名称时使用的备用名称 ID。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
