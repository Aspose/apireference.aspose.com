---
title: Aspose::Font::TextUtils::IMorseDecoder::Decode method
linktitle: Decode
second_title: Aspose.Font for C++
description: 'Aspose::Font::TextUtils::IMorseDecoder::Decode method. Deciphers Morse code in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Deciphers Morse code.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| morseText | System::String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in encoded text |
| outputSeparator | char16_t | Symbol used to separate words in decoded text |

### ReturnValue

Decoded text

## See Also

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
