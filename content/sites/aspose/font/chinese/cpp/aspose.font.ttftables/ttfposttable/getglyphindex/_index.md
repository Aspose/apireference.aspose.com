---
title: "Aspose::Font::TtfTables::TtfPostTable::GetGlyphIndex 方法"
linktitle: "GetGlyphIndex"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfPostTable::GetGlyphIndex 方法。获取按字形名称的字形索引，在 C++ 中。"
type: docs
weight: 1400
url: /zh/cpp/aspose.font.ttftables/ttfposttable/getglyphindex/
---
## TtfPostTable::GetGlyphIndex method


获取按字形名称的字形索引。

```cpp
uint32_t Aspose::Font::TtfTables::TtfPostTable::GetGlyphIndex(System::String glyphName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | System::String | 字形名称。 |

### ReturnValue

字形索引。当此字体文件的字形未提供 PostScript 名称信息时，返回索引 0，即未定义字形或 \".notdef\" 字形。

## 另见

* Class [String](../../../system/string/)
* Class [TtfPostTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
