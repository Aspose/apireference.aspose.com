---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode metodo"
linktitle: "Decodifica"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode metodo. Decifra il codice Morse in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Decifra il codice Morse.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| morseText | System::String | Testo codificato in codice Morse, ad es. testo come "... --- ..." (SOS) |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo decodificato |

### ReturnValue

Testo decodificato

## Vedi anche

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
