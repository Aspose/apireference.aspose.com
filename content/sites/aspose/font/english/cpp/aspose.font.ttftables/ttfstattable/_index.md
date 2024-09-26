---
title: Aspose::Font::TtfTables::TtfStatTable class
linktitle: TtfStatTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfStatTable class. Represents Style Attributes Table(STAT) of the OpenType font in C++.'
type: docs
weight: 1700
url: /cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


Represents Style Attributes Table(STAT) of the OpenType font.

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

| Enum | Description |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Specifies axis value table flags. |
## Methods

| Method | Description |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Adds an Axis Record structure to the table. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Adds an Axis Value Table structure to the table. |
| [ClearAxisRecords](./clearaxisrecords/)() | Removes all axis records from the table. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Removes all axis value tables from the table. |
| [get_AxisRecords](./get_axisrecords/)() | Returns design axes array. Axes array is array of structures of type Axis Record. Spec: the axis record provides information about a single design axis. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Returns the number of axis value tables. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Returns array of Axis Value Tables. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Returns the number of axis records. Spec: in a font with an 'fvar' table, this value must be greater than or equal to the axisCount value in the 'fvar' table. In all fonts, must be greater than zero if axisValueCount is greater than zero. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
