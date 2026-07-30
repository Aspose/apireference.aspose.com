---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode metodo"
linktitle: "Encode"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode metodo. Codifica il testo in codice Morse. Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input. L'alfabeto è selezionato dalla prima parola in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Codifica il testo in codice Morse. Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input. L'alfabeto è selezionato dalla prima parola.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

Testo codificato, ad es. "... --- ..." per il testo di input "SOS"

## Vedi anche

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Codifica il testo in codice Morse.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | System::String | Testo da codificare in codice Morse |
| alfabeto | MorseAlphabets | Alfabeto del codice Morse |
| inputSeparator | char16_t | Simbolo usato per separare le parole nel testo di input |
| outputSeparator | char16_t | Simbolo usato per separare le parole nel testo codificato |

### ReturnValue

Testo codificato, ad es. "... --- ..." per il testo di input "SOS"

## Vedi anche

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
