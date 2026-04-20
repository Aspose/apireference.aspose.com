---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode method"
linktitle: "Encode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode method. يرمز النص بشيفرة مورس ويعيد النتيجة كمجموعة من الرموز (glyphId). يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


يقوم بترميز النص بشفرة مورس ويعيد النتيجة كمجموعة من الرموز (glyphId). يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة برموز النقطة والشرطة من |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


يقوم بترميز النص بشفرة مورس ويرسم النتيجة بصيغة PNG. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة برموز النقطة والشرطة من |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int32_t | قيمة تباعد الأسطر |
| maxWidth | int32_t | العرض الأقصى بالبكسلات للصورة |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

النص، المشفر بشيفرة مورس، بصيغة PNG كتيار من البايتات

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


يقوم بترميز النص باستخدام شفرة مورس ويرسم النتيجة بصيغة PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة برموز النقطة والشرطة من |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int32_t | قيمة تباعد الأسطر |
| maxWidth | int32_t | العرض الأقصى بالبكسلات للصورة |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

النص، المشفر بشيفرة مورس، بصيغة PNG كتيار من البايتات

## انظر أيضًا

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


يقوم بترميز النص باستخدام شفرة مورس ويعيد النتيجة كمجموعة من الرموز (معرفات الرموز).

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | System::String | النص المراد ترميزه بشيفرة مورس |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة برموز النقطة والشرطة من |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
