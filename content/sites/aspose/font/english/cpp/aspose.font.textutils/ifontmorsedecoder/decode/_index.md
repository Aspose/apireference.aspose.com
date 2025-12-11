---
title: Aspose::Font::TextUtils::IFontMorseDecoder::Decode method
linktitle: Decode
second_title: Aspose.Font for C++
description: 'Aspose::Font::TextUtils::IFontMorseDecoder::Decode method. Deciphers Morse code and draws result in PNG-format in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Deciphers Morse code and draws result in PNG-format.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| morseText | System::String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to decoded text from |
| fontSize | double | [Font](../../../aspose.font/font/) size |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | int32_t | Value of line spacing |
| maxWidth | int32_t | Max width in pixels for image |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in encoded text |
| outputSeparator | char16_t | Symbol used to separate words in decoded text |

### ReturnValue

Decoded text in PNG-format as stream of bytes

## See Also

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


Deciphers Morse code into glyphs of the specified font.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| morseText | System::String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to decoded text from |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in encoded text |
| outputSeparator | char16_t | Symbol used to separate words in decoded text |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
