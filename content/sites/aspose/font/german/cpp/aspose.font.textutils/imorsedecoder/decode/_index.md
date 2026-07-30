---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode method"
linktitle: "Decode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode method. Entschlüsselt Morsecode in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Entschlüsselt Morsecode.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| morseText | System::String | Durch Morsecode codierter Text, z.B. Text wie "... --- ..." (SOS) |
| Alphabet | MorseAlphabets | Alphabet des Morsecodes |
| inputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im codierten Text zu trennen |
| outputSeparator | char16_t | Symbol, das verwendet wird, um Wörter im decodierten Text zu trennen |

### ReturnValue

Decodierter Text

## Siehe auch

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
