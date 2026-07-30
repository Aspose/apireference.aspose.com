---
title: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts metodu"
linktitle: "MergeFonts"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts metodu. Geçirilen glif listelerine göre fontları birleştirir. Geçirilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glif ile birlikte C++'ta yeni sonuç fontuna ekler."
type: docs
weight: 300
url: /tr/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Geçirilen glif listelerine göre yazı tiplerini birleştirir. Geçirilen her glif için bir karakter kodu arar ve bulunan karakter kodunu ilgili glif ile birlikte sonuç yeni yazı tipine ekler.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Birincil fonttan alınacak gliflerin listesi |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | İkincil fonttan alınacak gliflerin listesi |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Geçirilen karakter kodu listelerine göre fontları birleştirir. İstenen sonuç fontunu oluşturmak için, sonuç fontuna dahil etmek istediğiniz orijinal fontlardan sembol kodlarını geçirin. Geçirilen kodlarla ilgili [Glyphs](../../../aspose.font.glyphs/) otomatik olarak bulunacaktır. Örneğin, ilk fonttan A ve B harfleriyle ilgili glifleri ve ikinci fonttan C ve D harfleriyle ilgili glifleri sonuç fontuna dahil etmek istiyorsanız, bu yöntemi şu şekilde çağırın: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Birincil fonttan alınacak kodlar |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | İkincil fonttan alınacak kodlar |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Bu yöntem sürümü, sonuç fontunda glifler için karakter kodlarını açıkça ayarlamak istediğiniz durumlar için tasarlanmıştır. Sağladığınız glif kodunun orijinal fontta bulunması zorunlu değildir. Geçirilen kodun anlamı, sonuç fontunda ilgili glif tanımlayıcısı ile ilişkilendirileceğidir. Bu nedenle, sözlük parametresi[code, glyph identifier] ile geçirilen her çiftin işlenme kuralı, yalnızca glif tanımlayıcısının orijinal fonttan alınması ve ardından sonuç fontunda ilgili kodla bağlanmasıdır. İlk fonttaki bazı kodlar ikinci fonttaki aynı kodlarla çakıştığında bu yardımcı olabilir.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Birincil fonttan [sembol kodu, glif tanımlayıcısı] çiftlerini içeren sözlük |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | İkincil fonttan [sembol kodu, glif tanımlayıcısı] çiftlerini içeren sözlük |
| newFontName | System::String | Sonuç fontu için istenen ad |

### ReturnValue

Birleştirilmiş font

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
