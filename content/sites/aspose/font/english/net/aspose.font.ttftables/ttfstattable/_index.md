---
title: Class TtfStatTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfStatTable class. Represents Style Attributes TableSTAT of the OpenType font
type: docs
weight: 1200
url: /net/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class

Represents Style Attributes Table(STAT) of the OpenType font.

```csharp
public class TtfStatTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [AxisRecords](../../aspose.font.ttftables/ttfstattable/axisrecords/) { get; } | Returns design axes array. Axes array is array of structures of type Axis Record. Spec: the axis record provides information about a single design axis. |
| [AxisValueCount](../../aspose.font.ttftables/ttfstattable/axisvaluecount/) { get; } | Returns the number of axis value tables. |
| [AxisValueTables](../../aspose.font.ttftables/ttfstattable/axisvaluetables/) { get; } | Returns array of Axis Value Tables. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names. |
| [DesignAxisCount](../../aspose.font.ttftables/ttfstattable/designaxiscount/) { get; } | Returns the number of axis records. Spec: in a font with an 'fvar' table, this value must be greater than or equal to the axisCount value in the 'fvar' table. In all fonts, must be greater than zero if axisValueCount is greater than zero. |
| [ElidedFallbackName](../../aspose.font.ttftables/ttfstattable/elidedfallbackname/) { get; } | Spec: Name used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [ElidedFallbackNameId](../../aspose.font.ttftables/ttfstattable/elidedfallbacknameid/) { get; } | Spec: Name ID used as fallback when projection of names into a particular font model produces a subfamily name containing only elidable elements. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| static [Tag](../../aspose.font.ttftables/ttfstattable/tag/) { get; } | Gets table tag. |

## Methods

| Name | Description |
| --- | --- |
| [AddAxisRecord](../../aspose.font.ttftables/ttfstattable/addaxisrecord/)(AxisRecord) | Adds an Axis Record structure to the table. |
| [AddAxisValueTable](../../aspose.font.ttftables/ttfstattable/addaxisvaluetable/)(AxisValueTableBase) | Adds an Axis Value Table structure to the table. |
| [ClearAxisRecords](../../aspose.font.ttftables/ttfstattable/clearaxisrecords/)() | Removes all axis records from the table. |
| [ClearAxisValueTables](../../aspose.font.ttftables/ttfstattable/clearaxisvaluetables/)() | Removes all axis value tables from the table. |

## Other Members

| Name | Description |
| --- | --- |
| class [AxisRecord](../../aspose.font.ttftables/ttfstattable.axisrecord) | Represents Axis Record structure. Spec: the axis record provides information about a single design axis. |
| class [AxisValue](../../aspose.font.ttftables/ttfstattable.axisvalue) | Represents AxisValue record. |
| abstract class [AxisValueTableBase](../../aspose.font.ttftables/ttfstattable.axisvaluetablebase) | Base class for Axis Value Table structure. Spec: Axis Value Tables provide details regarding a specific style-attribute value on some specific axis of design variation, or a combination of design-variation axis values, and the relationship of those values to labels used as elements in subfamily names. |
| [Flags] enum [AxisValueTableFlags](../../aspose.font.ttftables/ttfstattable.axisvaluetableflags) | Specifies axis value table flags |
| class [AxisValueTableFormat1](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat1) | Represents Axis value table format 1 |
| class [AxisValueTableFormat2](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat2) | Represents Axis value table format 2 |
| class [AxisValueTableFormat3](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat3) | Represents Axis value table format 3 |
| class [AxisValueTableFormat4](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat4) | Represents Axis value table format 4 |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


