---
title: "Aspose::Font::TtfTables::TtfCMapTable class"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfCMapTable 类。表示 C++ 中 TTF 字体文件的 \\\"cmap\\\" 表。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


表示 TTF [Font](../../aspose.font/font/) 文件的 \"cmap\" 表。

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | 搜索并返回 Unicode CMap。如果存在 ucs-4 CMap，则优先返回它；否则返回它能找到的任何 Unicode CMap。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
| [GetAllSubtables](./getallsubtables/)() | 返回 CMap 表中的所有子表。 |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | 返回针对 planformId 和 platformSpecificId 的 CMap 子表。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
