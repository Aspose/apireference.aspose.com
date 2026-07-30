---
title: "Aspose::Font::Cff::CffEncoding::UnicodeToGid 方法。"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffEncoding::UnicodeToGid 方法。解码 Unicode 并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。CFF Font 的字形 ID 可以是 C++ 中的 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。"
type: docs
weight: 900
url: /zh/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


解码 Unicode 并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。CFF [Font](../../../aspose.font/font/) 的字形 ID 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | uint32_t | 用于获取字形标识符的 Unicode。 |

### ReturnValue

与传入的 Unicode 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
