---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode Methode"
linktitle: "Encode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode Methode. Codiert Text in Morsecode und gibt das Ergebnis als Menge von Glyphen (glyphId) zurück. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes in C++ zu berechnen."
type: docs
weight: 100
url: /de/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Kodiert Text in Morsecode und gibt das Ergebnis als Menge von Glyphen (glyphId) zurück. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu berechnen.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf die Symbole Punkt und Strich beziehen, aus |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Kodiert Text in Morsecode und zeichnet das Ergebnis im PNG-Format. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu berechnen.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf die Symbole Punkt und Strich beziehen, aus |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int32_t | Wert des Zeilenabstands |
| maxWidth | int32_t | Maximale Breite in Pixeln für das Bild |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

Text, codiert mit Morsecode, im PNG-Format als Bytestrom

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Kodiert Text mit Morsecode und zeichnet das Ergebnis im PNG-Format.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf die Symbole Punkt und Strich beziehen, aus |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int32_t | Wert des Zeilenabstands |
| maxWidth | int32_t | Maximale Breite in Pixeln für das Bild |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

Text, codiert mit Morsecode, im PNG-Format als Bytestrom

## Siehe auch

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


Kodiert Text mit Morsecode und gibt das Ergebnis als Menge von Glyphen (Glyphen-Identifikatoren) zurück.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) zum Abrufen von Glyphen, die sich auf die Symbole Punkt und Strich beziehen, aus |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
