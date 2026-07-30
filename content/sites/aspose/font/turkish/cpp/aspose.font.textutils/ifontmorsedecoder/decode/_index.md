---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode yöntemi"
linktitle: "Çöz"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode yöntemi. Morse kodunu çözer ve sonucu C++'da PNG formatında çizer."
type: docs
weight: 100
url: /tr/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Morse kodunu çözer ve sonucu PNG formatında çizer.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| morseText | System::String | Morse kodu ile kodlanmış metin, ör. "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) çözülen metinle ilgili glifleri almak için |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Satır aralığı türü. Piksel sayısı veya yazı tipi yüksekliğinin yüzdesi |
| lineSpacingValue | int32_t | Satır aralığının değeri |
| maxWidth | int32_t | Görüntü için piksel cinsinden maksimum genişlik |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Çözülmüş metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

PNG formatında bayt akışı olarak çözülen metin

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


Belirtilen fontun gliflerine Morse kodunu çözer.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| morseText | System::String | Morse kodu ile kodlanmış metin, ör. "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) çözülen metinle ilgili glifleri almak için |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Çözülmüş metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
