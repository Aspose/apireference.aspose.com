---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGid 方法。"
linktitle: "DecodeToGid"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGid 方法。获取传入 charCode 的 Gid。此方法专为 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。字形 ID 是字形的唯一编号，取决于字体类型。CFF Font 的字形 ID 可以是 C++ 中的 (GlyphStringId) 类或 (GlyphUInt32Id) 类的实例。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


获取传入 charCode 的 Gid。此方法专为 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。字形 ID 是字形的唯一编号，取决于字体类型。CFF [Font](../../../aspose.font/font/) 的字形 ID 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | uint32_t | 用于获取字形标识符的字符代码（CID）。 |

### ReturnValue

与传入的 CID 相关的字形标识符。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
