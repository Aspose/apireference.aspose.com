---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode metodo"
linktitle: "Decodifica"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode metodo. Decifra il codice Morse e disegna il risultato in formato PNG in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Decifra il codice Morse e disegna il risultato in formato PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| morseText | System::String | Testo codificato in codice Morse, ad es. testo come "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi al testo decodificato da |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int32_t | Valore dell'interlinea |
| maxWidth | int32_t | Larghezza massima in pixel per l'immagine |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo decodificato |

### ReturnValue

Testo decodificato in formato PNG come flusso di byte

## Vedi anche

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


Decifra il codice Morse in glifi del font specificato.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| morseText | System::String | Testo codificato in codice Morse, ad es. testo come "... --- ..." (SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi al testo decodificato da |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo decodificato |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
