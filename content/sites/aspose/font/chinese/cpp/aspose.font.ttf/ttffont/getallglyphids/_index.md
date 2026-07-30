---
title: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds 方法"
linktitle: "GetAllGlyphIds"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds 方法。返回字体中所有字形 ID 的数组。字形 ID 是字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。支持通过 Post 表映射使用名称（字符串）来寻址 TTF 字体的字形。若为 CFF 字体，则在 C++ 中使用 CFF 结构通过名称来寻址字形。"
type: docs
weight: 1700
url: /zh/cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


返回 [Font](../../../aspose.font/font/) 中所有字形 ID 的数组。字形 ID 是字形的唯一编号，取决于字体类型。TTF [Font](../../../aspose.font/font/) 的字形 ID 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。支持通过 Post 表映射使用名称（字符串）来寻址 TTF 字体的字形。若为 CFF [Font](../../../aspose.font/font/)，则使用 CFF 结构通过名称来寻址字形。

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

字形标识符。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
