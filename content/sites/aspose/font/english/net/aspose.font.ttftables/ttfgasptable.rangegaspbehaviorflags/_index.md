---
title: Enum TtfGaspTable.RangeGaspBehaviorFlags
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfGaspTableRangeGaspBehaviorFlags enum. Flags describing desired rasterizer behavior
type: docs
weight: 950
url: /net/aspose.font.ttftables/ttfgasptable.rangegaspbehaviorflags/
---
## TtfGaspTable.RangeGaspBehaviorFlags enumeration

Flags describing desired rasterizer behavior.

```csharp
[Flags]
public enum RangeGaspBehaviorFlags : ushort
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| neither | `0` | Optional for very large sizes, typically ppem&gt;2048 |
| GASP_GRIDFIT | `1` | Use gridfitting |
| GASP_DOGRAY | `2` | Use grayscale rendering |
| GASP_SYMMETRIC_GRIDFIT | `4` | Use gridfitting with ClearType symmetric smoothing Only supported in version 1 'gasp' |
| GASP_SYMMETRIC_SMOOTHING | `8` | Use smoothing along multiple axes with ClearType® Only supported in version 1 'gasp' |
| Reserved | `FFF0` | Reserved flags — set to 0 |

### See Also

* class [TtfGaspTable](../ttfgasptable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


