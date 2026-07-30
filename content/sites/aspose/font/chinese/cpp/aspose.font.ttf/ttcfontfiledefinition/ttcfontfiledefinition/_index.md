---
title: "Aspose::Font::Ttf::TtcFontFileDefinition::TtcFontFileDefinition 构造函数"
linktitle: "TtcFontFileDefinition"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtcFontFileDefinition::TtcFontFileDefinition 构造函数。仅使用文件内容在 C++ 中创建文件定义。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.ttf/ttcfontfiledefinition/ttcfontfiledefinition/
---
## TtcFontFileDefinition::TtcFontFileDefinition constructor


仅使用文件内容创建文件定义。

```cpp
Aspose::Font::Ttf::TtcFontFileDefinition::TtcFontFileDefinition(int32_t fontIndex, System::String fileExtension, System::SharedPtr<Aspose::Font::Sources::StreamSource> streamSource, int64_t offset)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontIndex | int32_t | TTC 字体集合中字体的索引。 |
| fileExtension | System::String | 字体文件集合的扩展名。 |
| streamSource | System::SharedPtr\<Aspose::Font::Sources::StreamSource\> | 字体文件集合的来源。 |
| offset | int64_t | 字体文件集合中字体数据的偏移量，参见 OpenType [Font](../../../aspose.font/font/) 文件规范中的 TTC Header、Offset Table。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [TtcFontFileDefinition](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
