---
title: "Aspose::Font::Glyphs::GlyphId 类"
linktitle: "GlyphId"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Glyphs::GlyphId 类。表示字体中可用的字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，是 (GlyphStringId) 类的实例。TTF 的 ID 是整数索引，是 C++ 中 (GlyphUInt32Id) 类的实例。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


表示可在 [Font](../../aspose.font/font/) 中使用的字形 ID。[Glyph](../glyph/) ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../glyphuint32id/)) 类的实例。

```cpp
class GlyphId : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 如果两个字形 ID 不相等，则返回 true。 |
| virtual [GetHashCode](./gethashcode/)() const | 返回对象的哈希码。 |
| virtual [ToGlyphStringId](./toglyphstringid/)() | 虚拟转换为 [GlyphUInt32Id](../glyphuint32id/)。[GlyphUInt32Id](../glyphuint32id/) 重写以返回实例。 |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | 虚拟转换为 [GlyphUInt32Id](../glyphuint32id/)。[GlyphUInt32Id](../glyphuint32id/) 重写以返回实例。 |
| virtual [ToString](./tostring/)() const | 返回字形 ID 的字符串表示形式。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
