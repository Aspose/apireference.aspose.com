---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode метод"
linktitle: "Encode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode метод. Кодирует текст в морзянку и возвращает результат в виде набора глифов (glyphId). Для вычисления алфавита входного текста используется эвристический анализ в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Кодирует текст азбукой Морзе и возвращает результат в виде набора глифов (glyphId). Для расчёта алфавита входного текста используется эвристический анализ.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с символами точка и тире, из |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Кодирует текст азбукой Морзе и рисует результат в формате PNG. Для расчёта алфавита входного текста используется эвристический анализ.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с символами точка и тире, из |
| fontSize | double | [Font](../../../aspose.font/font/) размер |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int32_t | Значение межстрочного интервала |
| maxWidth | int32_t | Максимальная ширина в пикселях для изображения |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

Текст, закодированный морзянкой, в формате PNG в виде потока байтов

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Кодирует текст азбукой Морзе и рисует результат в формате PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с символами точка и тире, из |
| fontSize | double | [Font](../../../aspose.font/font/) размер |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int32_t | Значение межстрочного интервала |
| maxWidth | int32_t | Максимальная ширина в пикселях для изображения |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

Текст, закодированный морзянкой, в формате PNG в виде потока байтов

## См. также

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


Кодирует текст азбукой Морзе и возвращает результат в виде набора глифов (идентификаторы глифов).

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | System::String | Текст для кодирования морзянкой |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) для получения глифов, связанных с символами точка и тире, из |
| алфавит | MorseAlphabets | Алфавит кода Морзе |
| inputSeparator | char16_t | Символ, используемый для разделения слов во входном тексте |
| outputSeparator | char16_t | Символ, используемый для разделения слов в закодированном тексте |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
