---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode метод"
linktitle: "Decode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode метод. Расшифровывает морзянку и рисует результат в формате PNG в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Расшифровывает азбуку Морзе и рисует результат в формате PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| morseText | System::String | Текст, закодированный кодом Морзе, например текст "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с декодированным текстом, из |
| fontSize | double | [Font](../../../aspose.font/font/) размер |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int32_t | Значение межстрочного интервала |
| maxWidth | int32_t | Максимальная ширина в пикселях для изображения |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в раскодированном тексте |

### ReturnValue

Декодированный текст в формате PNG в виде потока байтов

## См. также

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


Расшифровывает азбуку Морзе в глифы указанного шрифта.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| morseText | System::String | Текст, закодированный кодом Морзе, например текст "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с декодированным текстом, из |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в раскодированном тексте |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
