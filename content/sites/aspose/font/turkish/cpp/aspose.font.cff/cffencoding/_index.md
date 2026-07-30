---
title: "Aspose::Font::Cff::CffEncoding sınıfı"
linktitle: "CffEncoding"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffEncoding sınıfı. C++'ta CFF Yazı Tipi kodlamasını temsil eder."
type: docs
weight: 100
url: /tr/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


CFF [Font](../../aspose.font/font/) kodlamasını temsil eder.

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Geçilen charCode için Gid değerini alır. Bu yöntem CFF CIDFonts için tasarlanmıştır; burada charCode geçerli bir CID değeri olmalıdır. Glif kimliği, yazı tipi türüne bağlı olarak bir glif için benzersiz bir sayıdır. CFF [Font](../../aspose.font/font/) glif kimliği ([GlyphStringId](../)) sınıfının bir örneği ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametreli çözümleme yöntemi. CFF [Font](../../aspose.font/font/) türü için desteklenmez. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Glifi kodlar. CFF [Font](../../aspose.font/font/) türleri için desteklenmez. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | İsim ile karakter kodu kodlama haritasını döndürür. Not: karakter kodu bir unicode değildir. Karakter kodu, [Font](../../aspose.font/font/) kodlamasındaki "tablo" içinde bir karakter indeksidir. |
| [GetNameToGidIndex](./getnametogidindex/)() | İsim ile karakter kodu kodlama haritasını döndürür. Not: Karakter kodu bir unicode değildir. Karakter kodu, [Font](../../aspose.font/font/) kodlamasındaki "tablo" içinde bir karakter indeksidir. |
| [GetNameToSidIndex](./getnametosidindex/)() | İsim ile karakter kodu kodlama haritasını döndürür. Not: Karakter kodu bir unicode değildir. Karakter kodu, [Font](../../aspose.font/font/) kodlamasındaki "tablo" içinde bir karakter indeksidir. |
| [GetSidName](./getsidname/)(int32_t) | Belirtilen SID için ismi alır. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Gid'yi unicode'a çözer. Glif kimliği, yazı tipi türüne bağlı olarak bir glif için benzersiz bir sayıdır. CFF [Font](../../aspose.font/font/) glif kimliği ([GlyphStringId](../)) sınıfının bir örneği ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Bir unicode'ı çözer ve glif kimliğini döndürür. Glif kimliği, yazı tipi türüne bağlı olarak bir glif için benzersiz bir sayıdır. CFF [Font](../../aspose.font/font/) glif kimliği ([GlyphStringId](../)) sınıfının bir örneği ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. |
## Ayrıca Bakınız

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
