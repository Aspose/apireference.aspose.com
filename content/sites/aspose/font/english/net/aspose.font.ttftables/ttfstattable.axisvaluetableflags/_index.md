---
title: Enum TtfStatTable.AxisValueTableFlags
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfStatTableAxisValueTableFlags enum. Specifies axis value table flags
type: docs
weight: 1340
url: /net/aspose.font.ttftables/ttfstattable.axisvaluetableflags/
---
## TtfStatTable.AxisValueTableFlags enumeration

Specifies axis value table flags

```csharp
[Flags]
public enum AxisValueTableFlags : ushort
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| OlderSiblingFontAttribute | `1` | If set, this axis value table provides axis value information that is applicable to other fonts within the same font family. This is used if the other fonts were released earlier and did not include information about values for some axis. If newer versions of the other fonts include the information themselves and are present, then this table is ignored. |
| ElidableAxisValueName | `2` | If set, it indicates that the axis value represents the “normal” value for the axis and may be omitted when composing name strings. |
| Reserved | `FFFC` | Reserved for future use |

### See Also

* class [TtfStatTable](../ttfstattable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


