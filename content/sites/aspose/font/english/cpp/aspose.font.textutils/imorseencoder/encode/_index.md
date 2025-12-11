---
title: Aspose::Font::TextUtils::IMorseEncoder::Encode method
linktitle: Encode
second_title: Aspose.Font for C++
description: 'Aspose::Font::TextUtils::IMorseEncoder::Encode method. Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

Encoded text, ie "... --- ..." for the input text "SOS"

## See Also

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Encodes text by Morse code.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| text | System::String | Text to encode by Morse code |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | char16_t | Symbol used to separate words in input text |
| outputSeparator | char16_t | Symbol used to separate words in encoded text |

### ReturnValue

Encoded text, ie "... --- ..." for the input text "SOS"

## See Also

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
