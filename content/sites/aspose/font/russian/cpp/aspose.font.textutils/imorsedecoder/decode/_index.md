---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode метод"
linktitle: "Decode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode метод. Расшифровывает код Морзе в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Расшифровывает код Морзе.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| morseText | System::String | Текст, закодированный кодом Морзе, например текст "... --- ..." (SOS) |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в раскодированном тексте |

### ReturnValue

Расшифрованный текст

## См. также

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
