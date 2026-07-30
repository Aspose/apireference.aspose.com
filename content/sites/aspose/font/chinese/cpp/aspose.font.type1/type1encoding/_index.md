---
title: "Aspose::Font::Type1::Type1Encoding 类"
linktitle: "Type1Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Type1::Type1Encoding 类。表示 C++ 中的 Type1Font 编码。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


表示 [Type1](../)[Font](../../aspose.font/font/) 编码。

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | 将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：[Type1](../) 的 id 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | 参数化解码方法。不支持 [Type1](../)[Font](../../aspose.font/font/) 类型。 |
| [Encode](./encode/)(uint32_t, uint32_t) override | 对字形进行编码。对于 TTF 字体，字符码是 unicode。不支持 [Type1](../)[Font](../../aspose.font/font/) 类型。 |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是 [Font](../../aspose.font/font/) 编码 "table" 中的字符索引。 |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：[Type1](../) 的 id 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | 返回对应 unicode 的 GlyphId。如果字体不包含该 unicode 的字形，则返回 notdef。Glyph id 是字形的唯一编号，取决于字体类型。例如：[Type1](../) 的 id 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 id 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
## 另见

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
