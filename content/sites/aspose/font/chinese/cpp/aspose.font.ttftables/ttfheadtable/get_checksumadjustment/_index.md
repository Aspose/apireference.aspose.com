---
title: "Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment 方法"
linktitle: "get_CheckSumAdjustment"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment 方法。获取 uint32 checkSumAdjustment。计算方法：将其设为 0，计算 ''head'' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。''head'' 表的校验和不会错误。这在 C++ 中是可以的。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.ttftables/ttfheadtable/get_checksumadjustment/
---
## TtfHeadTable::get_CheckSumAdjustment method


获取 uint32 checkSumAdjustment。计算方法：先将其设为 0，计算 'head' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。'head' 表的校验和不会出错。这样即可。

```cpp
uint32_t Aspose::Font::TtfTables::TtfHeadTable::get_CheckSumAdjustment() const
```

## 另见

* Class [TtfHeadTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
