---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger sınıfı"
linktitle: "IFontCharactersMerger"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger sınıfı. TrueType yazı tiplerini birleştirmek için yardımcı işlevselliği bildirir. parametre olarak verilen font1 yazı tipi birincil olarak kabul edilir. Bu, ölçümler, kodlama yapısı ve diğerleri gibi birleştirilmiş son yazı tipine ilişkin birçok özelliğin bu birincil yazı tipinden alınacağı anlamına gelir C++'de."
type: docs
weight: 200
url: /tr/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


TrueType yazı tiplerini birleştirmek için yardımcı işlevselliği bildirir. Parametre olarak verilen [Font](../../aspose.font/font/) birincil olarak kabul edilir. Bu, ölçümler, kodlama yapısı ve diğerleri gibi birleştirilmiş son yazı tipine ilişkin birçok özelliğin bu birincil yazı tipinden alınacağı anlamına gelir.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Geçilen glif listelerine göre yazı tiplerini birleştirir. Geçilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glifle birlikte sonuçta oluşan yeni yazı tipine ekler. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Geçirilen karakter kodu listelerine göre yazı tiplerini birleştirir. İstenen sonuç yazı tipini oluşturmak için, sonuç yazı tipine dahil etmek istediğiniz orijinal yazı tiplerinden sembol kodlarını sadece geçirin. Geçirilen kodlarla ilgili [Glyphs](../../aspose.font.glyphs/) otomatik olarak bulunacaktır. Örneğin, sonuç yazı tipine ilk yazı tipinden A ve B harflerine, ikinci yazı tipinden C ve D harflerine ait glifleri dahil etmek istiyorsanız, bu yöntemi şu şekilde çağırın: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Bu yöntem sürümü, sonuç fontunda glifler için karakter kodlarını açıkça ayarlamak istediğiniz durumlar için tasarlanmıştır. Sağladığınız glif kodunun orijinal fontta bulunması zorunlu değildir. Geçirilen kodun anlamı, sonuç fontunda ilgili glif tanımlayıcısı ile ilişkilendirileceğidir. Bu nedenle, sözlük parametresi[code, glyph identifier] ile geçirilen her çiftin işlenme kuralı, yalnızca glif tanımlayıcısının orijinal fonttan alınması ve ardından sonuç fontunda ilgili kodla bağlanmasıdır. İlk fonttaki bazı kodlar ikinci fonttaki aynı kodlarla çakıştığında bu yardımcı olabilir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
