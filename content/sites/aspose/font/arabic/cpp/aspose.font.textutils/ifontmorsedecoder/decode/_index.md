---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode method"
linktitle: "Decode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode method. يفك شيفرة مورس ويرسم النتيجة بصيغة PNG في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


يفك شفرة مورس ويرسم النتيجة بصيغة PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| morseText | System::String | نص مشفر بشفرة مورس، أي نص مثل "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة بالنص المفكوك من |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int32_t | قيمة تباعد الأسطر |
| maxWidth | int32_t | العرض الأقصى بالبكسلات للصورة |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المفكك |

### ReturnValue

النص المفكوك بصيغة PNG كتيار من البايتات

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


يفك شفرة مورس إلى رموز الخط المحدد.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| morseText | System::String | نص مشفر بشفرة مورس، أي نص مثل "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [الخط](../../../aspose.font/font/) لأخذ الرموز المرتبطة بالنص المفكوك من |
| أبجدية | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المشفر |
| outputSeparator | char16_t | رمز يستخدم لفصل الكلمات في النص المفكك |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
