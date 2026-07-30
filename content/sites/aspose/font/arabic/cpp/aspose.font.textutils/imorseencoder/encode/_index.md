---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode method"
linktitle: "Encode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode method. يشفر النص بشفرة مورس. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل. يتم اختيار الأبجدية بالكلمة الأولى في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


يقوم بترميز النص باستخدام شفرة مورس. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل. يتم اختيار الأبجدية بناءً على الكلمة الأولى.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

النص المشفر، مثال "... --- ..." للنص المدخل "SOS"

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


يشفر النص بشفرة مورس.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

النص المشفر، مثال "... --- ..." للنص المدخل "SOS"

## انظر أيضًا

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
