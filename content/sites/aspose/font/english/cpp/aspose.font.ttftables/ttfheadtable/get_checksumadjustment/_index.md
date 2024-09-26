---
title: Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment method
linktitle: get_CheckSumAdjustment
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment method. Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the ''head'' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the ''head'' table will not be wrong. That is OK in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.ttftables/ttfheadtable/get_checksumadjustment/
---
## TtfHeadTable::get_CheckSumAdjustment method


Gets uint32 checkSumAdjustment. To compute: set it to 0, calculate the checksum for the 'head' table and put it in the table directory, sum the entire font as uint32, then store B1B0AFBA - sum. The checksum for the 'head' table will not be wrong. That is OK.

```cpp
uint32_t Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment() const
```

## See Also

* Class [TtfHeadTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
