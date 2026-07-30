---
title: "Aspose::Font::IFontEncoding sınıfı"
linktitle: "IFontEncoding"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontEncoding sınıfı. C++'da Yazı tipi kodlaması için bir arayüz tanımlar."
type: docs
weight: 1400
url: /tr/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Bir [Font](../font/) kodlaması için bir arabirim tanımlar.

```cpp
class IFontEncoding : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Bir karakter kodunu çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'ın kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir tam sayı indekstir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. Not: karakter kodu mutlaka Unicode olmak zorunda değildir. Karakter kodu, [Font](../font/) kodlaması "tablosu" içinde bir karakter indeksidir. |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Parametreli çözümleme yöntemi. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Glifi kodlar. TTF Yazı Tipleri için charCode Unicode'dur. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Gid'yi Unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'ın kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir tam sayı indekstir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Bir Unicode değerini çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'ın kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir tam sayı indekstir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
