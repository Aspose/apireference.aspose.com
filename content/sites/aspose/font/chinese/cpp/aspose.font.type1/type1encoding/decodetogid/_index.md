---
title: "Aspose::Font::Type1::Type1Encoding::DecodeToGid 方法"
linktitle: "DecodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Type1::Type1Encoding::DecodeToGid 方法。将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 id 是整数索引，属于 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../) 的 id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | uint32_t | 用于获取字形标识符的字符代码。 |

### ReturnValue

与传入的字符代码相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
