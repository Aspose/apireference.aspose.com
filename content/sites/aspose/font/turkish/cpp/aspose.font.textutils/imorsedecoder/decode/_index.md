---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode method"
linktitle: "Çöz"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode method. C++'da Morse kodunu çözer."
type: docs
weight: 100
url: /tr/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Morse kodunu çözer.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| morseText | System::String | Morse kodu ile kodlanmış metin, ör. "... --- ..." (SOS) |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Çözülmüş metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

Çözülmüş metin

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
