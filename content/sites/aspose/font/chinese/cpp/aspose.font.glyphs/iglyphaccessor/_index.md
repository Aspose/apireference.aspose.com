---
title: "Aspose::Font::Glyphs::IGlyphAccessor 类"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor 类。定义在 C++ 中检索指定字形标识符和字形的功能。"
type: docs
weight: 1000
url: /zh/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


定义检索指定字形标识符和字形的功能。

```cpp
class IGlyphAccessor : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) id 类型规范。 |
| virtual [GetAllGlyphIds](./getallglyphids/)() | 返回所有字形 ID，可在 [Font](../../aspose.font/font/) 中获取。 [Glyph](../glyph/) ID 是字形的唯一编号，取决于字体类型。例如： [Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../glyphuint32id/)) 类的实例。 |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | 根据字形 ID 返回字形。 [Glyph](../glyph/) ID 是字形的唯一编号，取决于字体类型。[GlyphId](../glyphid/) - 派生对象。例如： [Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../glyphuint32id/)) 类的实例。 |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | 获取文本的字形表示。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
