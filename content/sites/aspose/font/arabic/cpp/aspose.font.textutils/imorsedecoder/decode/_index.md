---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode method"
linktitle: "Decode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode method. يفك شفرة مورس في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


يفك شفرة مورس.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| morseText | System::String | نص مشفر بشفرة مورس، أي نص مثل "... --- ..."(SOS) |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المفكك |

### ReturnValue

نص مفكك

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
