---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts yöntemi"
linktitle: "MergeFonts"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts yöntemi. Geçilen glif listelerine göre yazı tiplerini birleştirir. Geçilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glifle birlikte sonuçta oluşan yeni yazı tipine ekler. C++'ta."
type: docs
weight: 100
url: /tr/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Geçilen glif listelerine göre yazı tiplerini birleştirir. Geçilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glifle birlikte sonuçta oluşan yeni yazı tipine ekler.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | İlk yazı tipinden gliflerin listesi |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | İkinci yazı tipinden gliflerin listesi |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Geçirilen karakter kodu listelerine göre fontları birleştirir. İstenen sonuç fontunu oluşturmak için, sonuç fontuna dahil etmek istediğiniz orijinal fontlardan sembol kodlarını geçirin. Geçirilen kodlarla ilgili [Glyphs](../../../aspose.font.glyphs/) otomatik olarak bulunacaktır. Örneğin, ilk fonttan A ve B harfleriyle ilgili glifleri ve ikinci fonttan C ve D harfleriyle ilgili glifleri sonuç fontuna dahil etmek istiyorsanız, bu yöntemi şu şekilde çağırın: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | İlk yazı tipinden alınacak kodlar |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | İkinci yazı tipinden alınacak kodlar |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Bu yöntem sürümü, sonuç fontunda glifler için karakter kodlarını açıkça ayarlamak istediğiniz durumlar için tasarlanmıştır. Sağladığınız glif kodunun orijinal fontta bulunması zorunlu değildir. Geçirilen kodun anlamı, sonuç fontunda ilgili glif tanımlayıcısı ile ilişkilendirileceğidir. Bu nedenle, sözlük parametresi[code, glyph identifier] ile geçirilen her çiftin işlenme kuralı, yalnızca glif tanımlayıcısının orijinal fonttan alınması ve ardından sonuç fontunda ilgili kodla bağlanmasıdır. İlk fonttaki bazı kodlar ikinci fonttaki aynı kodlarla çakıştığında bu yardımcı olabilir.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | İlk yazı tipinden [sembol kodu, glif tanımlayıcısı] çiftlerini içeren sözlük |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | İkinci yazı tipinden [sembol kodu, glif tanımlayıcısı] çiftlerini içeren sözlük |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
