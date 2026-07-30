---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode yöntemi"
linktitle: "Encode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode yöntemi. Metni Morse koduyla kodlar ve sonucu glifler(glyphId) kümesi olarak döndürür. Girdi metninin alfabesini hesaplamak için C++'da sezgisel analiz kullanılır."
type: docs
weight: 100
url: /tr/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Metni Morse kodu ile kodlar ve sonucu glifler (glyphId) kümesi olarak döndürür. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) nokta ve tire sembollerine ilişkin glifleri almak için |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Metni Morse kodu ile kodlar ve sonucu PNG formatında çizer. Girdi metninin alfabesini hesaplamak için sezgisel analiz kullanılır.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) nokta ve tire sembollerine ilişkin glifleri almak için |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Satır aralığı türü. Piksel sayısı veya yazı tipi yüksekliğinin yüzdesi |
| lineSpacingValue | int32_t | Satır aralığının değeri |
| maxWidth | int32_t | Görüntü için piksel cinsinden maksimum genişlik |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

Morse koduyla kodlanmış metin, PNG formatında bayt akışı olarak

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Metni Morse kodu ile kodlar ve sonucu PNG formatında çizer.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) nokta ve tire sembollerine ilişkin glifleri almak için |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Satır aralığı türü. Piksel sayısı veya yazı tipi yüksekliğinin yüzdesi |
| lineSpacingValue | int32_t | Satır aralığının değeri |
| maxWidth | int32_t | Görüntü için piksel cinsinden maksimum genişlik |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

Morse koduyla kodlanmış metin, PNG formatında bayt akışı olarak

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


Metni Morse kodu ile kodlar ve sonucu glifler (glif tanımlayıcıları) kümesi olarak döndürür.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | System::String | Morse koduyla kodlanacak metin |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) nokta ve tire sembollerine ilişkin glifleri almak için |
| alfabe | MorseAlphabets | Morse kodu alfabesi |
| inputSeparator | char16_t | Girdi metnindeki kelimeleri ayırmak için kullanılan sembol |
| outputSeparator | char16_t | Kodlanmış metinde kelimeleri ayırmak için kullanılan sembol |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
