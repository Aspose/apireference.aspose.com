---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode Methode"
linktitle: "Decode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode Methode. Entschlüsselt Morsecode und zeichnet das Ergebnis im PNG-Format in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Entschlüsselt Morsecode und zeichnet das Ergebnis im PNG-Format.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| morseText | System::String | Durch Morsecode codierter Text, z.B. Text wie "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf den decodierten Text beziehen, aus |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int32_t | Wert des Zeilenabstands |
| maxWidth | int32_t | Maximale Breite in Pixeln für das Bild |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im decodierten Text zu trennen |

### ReturnValue

Decodierter Text im PNG-Format als Bytestrom

## Siehe auch

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


Entschlüsselt Morsecode in Glyphen der angegebenen Schriftart.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| morseText | System::String | Durch Morsecode codierter Text, z.B. Text wie "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf den decodierten Text beziehen, aus |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im decodierten Text zu trennen |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
