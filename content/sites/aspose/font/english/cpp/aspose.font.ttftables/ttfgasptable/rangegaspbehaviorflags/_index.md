---
title: Aspose::Font::TtfTables::TtfGaspTable::RangeGaspBehaviorFlags enum
linktitle: RangeGaspBehaviorFlags
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfGaspTable::RangeGaspBehaviorFlags enum. Flags describing desired rasterizer behavior in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.ttftables/ttfgasptable/rangegaspbehaviorflags/
---
## RangeGaspBehaviorFlags enum


Flags describing desired rasterizer behavior.

```cpp
enum class RangeGaspBehaviorFlags : uint16_t
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| neither | 0 | Optional for very large sizes, typically ppem>2048 |
| GASP_GRIDFIT | 1 | Use gridfitting. |
| GASP_DOGRAY | 2 | Use grayscale rendering. |
| GASP_SYMMETRIC_GRIDFIT | 4 | Use gridfitting with ClearType symmetric smoothing Only supported in version 1 'gasp'. |
| GASP_SYMMETRIC_SMOOTHING | 8 | Use smoothing along multiple axes with ClearType® Only supported in version 1 'gasp'. |
| Reserved | 65520 | Reserved flags — set to 0. |

## See Also

* Class [TtfGaspTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
