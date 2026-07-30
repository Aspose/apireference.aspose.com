---
title: "Aspose::Font::IFontEncoding 类"
linktitle: "IFontEncoding"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontEncoding 类. 定义了 C++ 中字体编码的接口。"
type: docs
weight: 1400
url: /zh/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


定义了 [Font](../font/) 编码的接口。

```cpp
class IFontEncoding : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | 解码字符代码并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。注意：字符代码不一定是 Unicode。字符代码是 [Font](../font/) 编码 “表” 中的字符索引。 |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | 参数化解码方法。 |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | 对字形进行编码。对于 TTF 字体，charCode 是 Unicode。 |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | 将 Gid 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | 解码 Unicode 并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：[Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
