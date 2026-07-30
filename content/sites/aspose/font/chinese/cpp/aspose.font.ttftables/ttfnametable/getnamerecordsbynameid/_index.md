---
title: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId 方法"
linktitle: "GetNameRecordsByNameId"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId 方法。返回所有 NameRecord 结构，其 NameId 字段等于传入的 nameId 值。如果未找到记录，将返回空数组（在 C++ 中）。"
type: docs
weight: 900
url: /zh/cpp/aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/
---
## TtfNameTable::GetNameRecordsByNameId method


返回所有 [NameRecord](../namerecord/) 结构，其 [NameId](../nameid/) 字段等于传入的 *nameId* 值。如果未找到记录，将返回空数组。

```cpp
System::ArrayPtr<System::SharedPtr<TtfNameTable::NameRecord>> Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId(TtfNameTable::NameId nameId)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称标识符 |

### ReturnValue

包含 [NameRecord](../namerecord/) 结构的数组

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameRecord](../namerecord/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
