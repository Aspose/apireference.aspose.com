---
title: "Aspose::Font::Ttf::TtfEncoding sınıfı"
linktitle: "TtfEncoding"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfEncoding sınıfı. C++'ta TTF Font kodlamasını temsil eder."
type: docs
weight: 400
url: /tr/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


TTF [Font](../../aspose.font/font/) kodlamasını temsil eder.

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | TTF [Font](../../aspose.font/font/)'ın DecodeToGlyphId uygulaması unicode tablosunu bulur ve unicode karakteri için glif kimliğini döndürür. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. Örneğin: [Type1](../../aspose.font.type1/)'ın kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği ise bir int indeksidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametreli sürüm, belirli bir CMap tablosu (unicode olmayan) kullanılmasına izin verir. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Glifi kodlar. TTF Fontları için karakter kodu unicode'dir. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glyph id'yi unicode'a çözer. Glyph id bir glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'nin id'si bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin id'si bir int dizinidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Bir unicode'ı çözer ve glyph id'sini döndürür. |
## Ayrıca Bakınız

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
