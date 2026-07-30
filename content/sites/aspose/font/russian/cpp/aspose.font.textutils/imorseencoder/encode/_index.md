---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode метод"
linktitle: "Encode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode метод. Кодирует текст с помощью кода Морзе. Для расчёта алфавита входного текста используется эвристический анализ. Алфавит выбирается по первому слову в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Кодирует текст азбукой Морзе. Для расчёта алфавита входного текста используется эвристический анализ. Алфавит выбирается по первому слову.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

Закодированный текст, например "... --- ..." для входного текста "SOS"

## См. также

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Кодирует текст кодом Морзе.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

Закодированный текст, например "... --- ..." для входного текста "SOS"

## См. также

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
