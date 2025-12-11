---
title: Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum
linktitle: AxisValueTableFlags
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum. Specifies axis value table flags in C++.'
type: docs
weight: 1200
url: /cpp/aspose.font.ttftables/ttfstattable/axisvaluetableflags/
---
## AxisValueTableFlags enum


Specifies axis value table flags.

```cpp
enum class AxisValueTableFlags : uint16_t
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| OlderSiblingFontAttribute | n/a | If set, this axis value table provides axis value information that is applicable to other fonts within the same font family. This is used if the other fonts were released earlier and did not include information about values for some axis. If newer versions of the other fonts include the information themselves and are present, then this table is ignored. |
| ElidableAxisValueName | n/a | If set, it indicates that the axis value represents the “normal” value for the axis and may be omitted when composing name strings. |
| Reserved | n/a | Reserved for future use. |

## See Also

* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
