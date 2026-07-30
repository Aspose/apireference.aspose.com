---
title: "Aspose::Font::Cff::CffEncoding 类"
linktitle: "CffEncoding"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffEncoding 类。表示在 C++ 中的 CFF 字体编码。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


表示 CFF [Font](../../aspose.font/font/) 编码。

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | 获取传入的 charCode 对应的 Gid。此方法针对 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。Glyph id 是字形的唯一编号，取决于字体类型。CFF [Font](../../aspose.font/font/) 的 glyph id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。 |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | 参数化解码方法。不支持 CFF [Font](../../aspose.font/font/) 类型。 |
| [Encode](./encode/)(uint32_t, uint32_t) override | 对字形进行编码。不支持 CFF [Font](../../aspose.font/font/) 类型。 |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是 [Font](../../aspose.font/font/) 编码 "table" 中的字符索引。 |
| [GetNameToGidIndex](./getnametogidindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是 [Font](../../aspose.font/font/) 编码 "table" 中的字符索引。 |
| [GetNameToSidIndex](./getnametosidindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是 [Font](../../aspose.font/font/) 编码 "table" 中的字符索引。 |
| [GetSidName](./getsidname/)(int32_t) | 获取指定 SID 的名称。 |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。CFF [Font](../../aspose.font/font/) 的 glyph id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。 |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | 将 unicode 解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。CFF [Font](../../aspose.font/font/) 的 glyph id 可以是 ([GlyphStringId](../)) 类或 ([GlyphUInt32Id](../)) 类的实例。 |
## 另见

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
