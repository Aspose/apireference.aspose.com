---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger sınıfı"
linktitle: "FontCharactersMerger"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger sınıfı. Farklı tipteki yazı tiplerini birleştirme işlevselliğini bildirir. Birleştirme işlemi için yazı tipi çifti gerekir. Bu çiftin bir yazı tipi birincil olarak kabul edilir. Bu, ölçümler, kodlama yapısı ve diğerleri gibi son birleştirilmiş yazı tipine ilişkin birçok özelliğin bu birincil yazı tipinden alınacağı anlamına gelir. Çiftten bir diğer yazı tipi (ikincil) sadece C++'da son birleştirilmiş yazı tipine glifler sağlar."
type: docs
weight: 100
url: /tr/cpp/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class


Farklı tipteki yazı tiplerini birleştirme işlevselliğini bildirir. Birleştirme işlemi için yazı tipi çifti gerekir. Bu çiftin bir yazı tipi birincil olarak kabul edilir. Bu, ölçümler, kodlama yapısı ve diğerleri gibi son birleştirilmiş yazı tipiyle ilgili birçok özelliğin bu birincil yazı tipinden alınacağı anlamına gelir. Çiftin diğer yazı tipi (ikincil) yalnızca son birleştirilmiş yazı tipi için glif sağlar.

```cpp
class FontCharactersMerger : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_PrimaryFont](./get_primaryfont/)() | Birincil yazı tipini alır. |
| virtual [get_SecondaryFont](./get_secondaryfont/)() | İkincil yazı tipini alır. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Geçirilen glif listelerine göre yazı tiplerini birleştirir. Geçirilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glif ile birlikte sonuç yeni yazı tipine ekler. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Geçirilen karakter kodu listelerine göre yazı tiplerini birleştirir. İstenen sonuç yazı tipini oluşturmak için, sonuç yazı tipine dahil etmek istediğiniz orijinal yazı tiplerinden sembol kodlarını sadece geçirin. Geçirilen kodlarla ilgili [Glyphs](../../aspose.font.glyphs/) otomatik olarak bulunacaktır. Örneğin, sonuç yazı tipine ilk yazı tipinden A ve B harflerine, ikinci yazı tipinden C ve D harflerine ait glifleri dahil etmek istiyorsanız, bu yöntemi şu şekilde çağırın: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Bu yöntem sürümü, sonuç fontunda glifler için karakter kodlarını açıkça ayarlamak istediğiniz durumlar için tasarlanmıştır. Sağladığınız glif kodunun orijinal fontta bulunması zorunlu değildir. Geçirilen kodun anlamı, sonuç fontunda ilgili glif tanımlayıcısı ile ilişkilendirileceğidir. Bu nedenle, sözlük parametresi[code, glyph identifier] ile geçirilen her çiftin işlenme kuralı, yalnızca glif tanımlayıcısının orijinal fonttan alınması ve ardından sonuç fontunda ilgili kodla bağlanmasıdır. İlk fonttaki bazı kodlar ikinci fonttaki aynı kodlarla çakıştığında bu yardımcı olabilir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Common_FontMerger](../)
* Library [Aspose.Font for C++](../../)
