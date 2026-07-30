---
title: "Aspose::Font::TextUtils::IFontMorseEncoder فئة"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder فئة. يعلن عن الوظيفة التي تقوم بترميز النص باستخدام شفرة مورس والحصول على النتيجة كرموز خط في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


يعلن عن وظيفة لتشفير النص بشفرة مورس والحصول على النتيجة كرموز الخط.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | يقوم بترميز النص باستخدام شفرة مورس ويعيد النتيجة كمجموعة من الرموز (معرفات الرموز). |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | يقوم بترميز النص بشفرة مورس ويعيد النتيجة كمجموعة من الرموز (glyphId). يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | يقوم بترميز النص باستخدام شفرة مورس ويرسم النتيجة بصيغة PNG. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | يقوم بترميز النص بشفرة مورس ويرسم النتيجة بصيغة PNG. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
