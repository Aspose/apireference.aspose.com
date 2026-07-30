---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode 方法"
linktitle: "GidToUnicode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode 方法。将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。CFF Font 的 glyph id 可以是 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 800
url: /zh/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。CFF [Font](../../../aspose.font/font/) glyph id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | 要解码的符号的字形标识符。 |

### ReturnValue

与传入的字形 ID 相关的 Unicode 值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
