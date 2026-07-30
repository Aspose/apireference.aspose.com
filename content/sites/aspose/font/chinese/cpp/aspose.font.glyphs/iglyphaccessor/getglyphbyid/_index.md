---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById 方法"
linktitle: "GetGlyphById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById 方法。根据字形 ID 返回字形。字形 ID 是针对字形的唯一编号，取决于字体类型。GlyphId 是派生对象。例如：Type1 的 ID 是字形名称，属于 (GlyphStringId) 类的实例。TTF 的 ID 是整数索引，属于 (GlyphUInt32Id) 类的实例（C++）。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


根据字形 ID 返回字形。[Glyph](../../glyph/) ID 是针对字形的唯一编号，取决于字体类型。[GlyphId](../../glyphid/) 是派生对象。例如：[Type1](../../../aspose.font.type1/) 的 ID 是字形名称，属于 ([GlyphStringId](../../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([GlyphUInt32Id](../../glyphuint32id/)) 类的实例。

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | System::SharedPtr\<GlyphId\> | 字形 ID。 |

### ReturnValue

[Glyph](../../glyph/)

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
