---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode 方法"
linktitle: "GidToUnicode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode 方法。将字形 ID 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 ID 是整数索引，属于 (GlyphUInt32Id) 类的实例，使用 C++。"
type: docs
weight: 400
url: /zh/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


将字形 ID 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../../aspose.font.type1/) 的 ID 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | 要解码的符号的字形标识符。 |

### ReturnValue

与传入的字形 ID 相关的 Unicode 值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
