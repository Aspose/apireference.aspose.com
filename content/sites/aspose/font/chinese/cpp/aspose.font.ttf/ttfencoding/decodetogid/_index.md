---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid 方法"
linktitle: "DecodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid 方法。TTF 字体的 DecodeToGlyphId 实现会查找 Unicode 表并返回对应 Unicode 字符的字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 ID 是整数索引，属于 (GlyphUInt32Id) 类的实例，使用 C++。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/) 的 DecodeToGlyphId 实现会查找 Unicode 表并返回对应 Unicode 字符的字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../../aspose.font.type1/) 的 ID 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入的字符代码相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
