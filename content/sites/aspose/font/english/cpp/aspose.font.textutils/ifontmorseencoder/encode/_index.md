---
title: Aspose::Font::TextUtils::IFontMorseEncoder::Encode method
linktitle: Encode
second_title: Aspose.Font for C++
description: 'Aspose::Font::TextUtils::IFontMorseEncoder::Encode method. Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to symbols dot and dash from |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to symbols dot and dash from |
| fontSize | double | [Font](../../../aspose.font/font/) size |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | int32_t | Value of line spacing |
| maxWidth | int32_t | Max width in pixels for image |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

Text, encoded by Morse code, in PNG-format as stream of bytes

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Encodes text by Morse code and draws result in PNG-format.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to symbols dot and dash from |
| fontSize | double | [Font](../../../aspose.font/font/) size |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | int32_t | Value of line spacing |
| maxWidth | int32_t | Max width in pixels for image |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

Text, encoded by Morse code, in PNG-format as stream of bytes

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


Encodes text by Morse code and returns result as set of glyphs(glyph identifiers).

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) to take glyphs related to symbols dot and dash from |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
