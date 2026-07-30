---
title: "Aspose::Font::IFontEncoding::GidToUnicode 方法"
linktitle: "GidToUnicode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontEncoding::GidToUnicode 方法。将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1''s id 是字形名称，属于 (GlyphStringId) 类的实例。TTF''s id 是整数索引，属于 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 400
url: /zh/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../../aspose.font.type1/)'s id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF's id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | 要解码的符号的字形标识符。 |

### ReturnValue

与传入的字形 ID 相关的 Unicode 值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
