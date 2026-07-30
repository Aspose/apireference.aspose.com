---
title: "Aspose::Font::Type1::Type1Encoding::GidToUnicode 方法"
linktitle: "GidToUnicode"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Type1::Type1Encoding::GidToUnicode 方法。将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 id 是整数索引，属于 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../) 的 id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | 要解码的符号的字形标识符。 |

### ReturnValue

与传入的字形 ID 相关的 Unicode 值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
