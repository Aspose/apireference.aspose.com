---
title: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid 方法"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid 方法。返回对应 Unicode 的 GlyphId。如果字体不包含该 Unicode 的字形，则返回 notdef。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 id 是整数索引，属于 (GlyphUInt32Id) 类的实例，在 C++ 中。"
type: docs
weight: 600
url: /zh/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


返回对应 Unicode 的 GlyphId。如果字体不包含该 Unicode 的字形，则返回 notdef。Glyph id 是字形的唯一编号，取决于字体类型。例如： [Type1](../../) 的 id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | uint32_t | 用于获取字形标识符的 Unicode。 |

### ReturnValue

与传入的 Unicode 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
