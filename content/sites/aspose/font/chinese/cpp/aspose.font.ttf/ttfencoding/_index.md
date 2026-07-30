---
title: "Aspose::Font::Ttf::TtfEncoding 类"
linktitle: "TtfEncoding"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfEncoding 类。表示 C++ 中的 TTF 字体编码。"
type: docs
weight: 400
url: /zh/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


表示 TTF [Font](../../aspose.font/font/) 编码。

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | TTF [Font](../../aspose.font/font/) 的 DecodeToGlyphId 实现会查找 Unicode 表并返回 Unicode 字符的字形 id。字形 id 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 id 是字形名称，属于 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，属于 ([GlyphUInt32Id](../)) 类的实例。 |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | 参数化版本允许使用特定的 CMap 表（而非 Unicode）。 |
| [Encode](./encode/)(uint32_t, uint32_t) override | 对字形进行编码。对于 TTF 字体，字符码是 Unicode。 |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 将字形 ID 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | 解码 Unicode 并返回字形 ID。 |
## 另见

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
