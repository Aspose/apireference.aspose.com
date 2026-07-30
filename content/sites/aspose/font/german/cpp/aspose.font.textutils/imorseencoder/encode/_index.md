---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode method"
linktitle: "Encode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode method. Codiert Text mittels Morsecode. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu ermitteln. Das Alphabet wird durch das erste Wort in C++ ausgewählt."
type: docs
weight: 100
url: /de/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Kodiert Text mit Morsecode. Heuristische Analyse wird verwendet, um das Alphabet des Eingabetextes zu berechnen. Das Alphabet wird anhand des ersten Wortes ausgewählt.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

Codierter Text, z. B. "... --- ..." für den Eingabetext "SOS"

## Siehe auch

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Kodiert Text mittels Morsecode.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | System::String | Text, der mit Morsecode codiert werden soll |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im Eingabetext zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |

### ReturnValue

Codierter Text, z. B. "... --- ..." für den Eingabetext "SOS"

## Siehe auch

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
