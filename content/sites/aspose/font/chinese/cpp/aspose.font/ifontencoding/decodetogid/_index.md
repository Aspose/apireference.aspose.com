---
title: "Aspose::Font::IFontEncoding::DecodeToGid 方法"
linktitle: "DecodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontEncoding::DecodeToGid 方法。将字符码解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1''s id 是字形名称，属于 (GlyphStringId) 类的实例。TTF''s id 是整数索引，属于 (GlyphUInt32Id) 类的实例。注意：字符码不一定是 unicode。字符码是 Font 编码 \"table\" 中的字符索引，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


将字符码解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../../aspose.font.type1/)'s id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF's id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。注意：字符码不一定是 unicode。字符码是 [Font](../../font/) 编码 "table" 中的字符索引。

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入的 charCode 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
