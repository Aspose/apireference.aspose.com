---
title: "Aspose::Font::Font::GetGlyphById 方法"
linktitle: "GetGlyphById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Font::GetGlyphById 方法。根据字形 ID 返回字形。字形 ID 是针对字形的唯一编号，取决于字体类型。GlyphId 为派生对象。例如：Type1 的 ID 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 ID 是整数索引，属于 C++ 中的 (GlyphUInt32Id) 类的实例。"
type: docs
weight: 1700
url: /zh/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


返回按字形 ID 的字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId - 派生对象。例如：[Type1](../../../aspose.font.type1/) 的 ID 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | System::SharedPtr\<Glyphs::GlyphId\> | 字形 id。 |

### ReturnValue

Glyph。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
