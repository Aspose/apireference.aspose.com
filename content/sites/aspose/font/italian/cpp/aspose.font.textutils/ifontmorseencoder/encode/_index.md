---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode metodo"
linktitle: "Encode"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode metodo. Codifica il testo in codice Morse e restituisce il risultato come insieme di glifi (glyphId). Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Codifica il testo in codice Morse e restituisce il risultato come insieme di glifi (glyphId). Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi ai simboli punto e trattino da |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Codifica il testo in codice Morse e disegna il risultato in formato PNG. Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi ai simboli punto e trattino da |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int32_t | Valore dell'interlinea |
| maxWidth | int32_t | Larghezza massima in pixel per l'immagine |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

Testo, codificato in codice Morse, in formato PNG come flusso di byte

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Codifica il testo in codice Morse e disegna il risultato in formato PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi ai simboli punto e trattino da |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int32_t | Valore dell'interlinea |
| maxWidth | int32_t | Larghezza massima in pixel per l'immagine |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

Testo, codificato in codice Morse, in formato PNG come flusso di byte

## Vedi anche

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


Codifica il testo in codice Morse e restituisce il risultato come insieme di glifi (identificatori dei glifi).

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) per prendere i glifi relativi ai simboli punto e trattino da |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
