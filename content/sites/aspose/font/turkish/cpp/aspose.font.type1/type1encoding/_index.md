---
title: "Aspose::Font::Type1::Type1Encoding sınıfı"
linktitle: "Type1Encoding"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Type1::Type1Encoding sınıfı. C++'ta Type1Font kodlamasını temsil eder."
type: docs
weight: 200
url: /tr/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


[Type1](../)[Font](../../aspose.font/font/) kodlamasını temsil eder.

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Gid'yi unicode'a çözer. Glyph kimliği, font tipine bağlı olarak bir glyph için benzersiz bir sayıdır. Örneğin: [Type1](../)'ın kimliği bir glyph adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametreli çözümleme yöntemi. [Type1](../)[Font](../../aspose.font/font/) tipi için desteklenmez. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Glyph'i kodlar. TTF Fontları için karakter kodu unicode'dur. [Type1](../)[Font](../../aspose.font/font/) tipleri için desteklenmez. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | İsim ile karakter kodu kodlama haritasını döndürür. Not: Karakter kodu bir unicode değildir. Karakter kodu, [Font](../../aspose.font/font/) kodlamasındaki "tablo" içinde bir karakter indeksidir. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gid'yi Unicode'a çözer. Glyph kimliği, font tipine bağlı olarak bir glyph için benzersiz bir sayıdır. Örneğin: [Type1](../)'ın kimliği bir glyph adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Unicode için GlyphId döndürür. Veya font unicode için glyph içermiyorsa notdef döndürür. Glyph kimliği, font tipine bağlı olarak bir glyph için benzersiz bir sayıdır. Örneğin: [Type1](../)'ın kimliği bir glyph adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
## Ayrıca Bakınız

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
