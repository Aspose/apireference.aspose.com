---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode method"
linktitle: "Encode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode yöntemi. Metni Morse koduyla kodlar. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır. Alfabe, C++'da ilk kelimeye göre seçilir."
type: docs
weight: 100
url: /tr/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Metni Morse kodu ile kodlar. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır. Alfabe ilk kelimeye göre seçilir.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

Kodlanmış metin, örn. "... --- ..." giriş metni "SOS" için

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Metni Morse kodu ile kodlar.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

Kodlanmış metin, örn. "... --- ..." giriş metni "SOS" için

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
