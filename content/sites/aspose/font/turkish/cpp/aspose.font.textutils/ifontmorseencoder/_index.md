---
title: "Aspose::Font::TextUtils::IFontMorseEncoder class"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder sınıfı. C++'ta metni Morse kodu ile kodlamak ve sonucu font glifleri olarak almak için işlevselliği bildirir."
type: docs
weight: 200
url: /tr/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Metni Morse koduyla kodlamak ve sonucu yazı tipi glifleri olarak elde etmek için işlevselliği bildirir.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Metni Morse kodu ile kodlar ve sonucu glifler (glif tanımlayıcıları) kümesi olarak döndürür. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Metni Morse kodu ile kodlar ve sonucu glifler (glyphId) kümesi olarak döndürür. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Metni Morse kodu ile kodlar ve sonucu PNG formatında çizer. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Metni Morse kodu ile kodlar ve sonucu PNG formatında çizer. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
