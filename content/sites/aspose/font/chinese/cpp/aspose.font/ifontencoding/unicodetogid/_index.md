---
title: "Aspose::Font::IFontEncoding::UnicodeToGid 方法"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontEncoding::UnicodeToGid 方法。将 unicode 解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1''s id 是字形名称，属于 (GlyphStringId) 类的实例。TTF''s id 是整数索引，属于 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 500
url: /zh/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


将 unicode 解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../../aspose.font.type1/)'s id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF's id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | uint32_t | 用于获取字形标识符的 Unicode。 |

### ReturnValue

与传入的 Unicode 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
