---
title: "الفئة Aspose::Font::Ttf::TtfFont"
linktitle: "TtfFont"
second_title: "Aspose.Font لـ C++"
description: "الفئة Aspose::Font::Ttf::TtfFont. تمثل خط TrueType (TTF) في C++."
type: docs
weight: 600
url: /ar/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


تمثل خط TrueType [Font](../../aspose.font/font/) (TTF).

```cpp
class TtfFont : public Aspose::Font::Font
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | يحوّل [Font](../../aspose.font/font/) إلى تنسيق آخر. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | يحوّل [Font](../../aspose.font/font/) إلى تنسيق آخر مع مجموعة أحرف محدودة. |
| virtual [get_CffFont](./get_cfffont/)() | يحصل على خط CFF [Font](../../aspose.font/font/) إذا كان موجوداً. |
| [get_Encoding](./get_encoding/)() override | يحصل على ترميز [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | يحصل على تعريف [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | يحصل أو يضبط عائلة [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | يحصل أو يضبط اسم الوجه [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | يحصل على أسماء [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | يحصل على نمط [Font](../../aspose.font/font/). هذه قيمة محسوبة وممثلة بنوع عام. |
| [get_FontType](./get_fonttype/)() override | يحصل على نوع [Font](../../aspose.font/font/). يُرجع قيمة [FontType.TTF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | يحصل على مواصفة نوع معرف الحرف. |
| [get_IsSymbolic](./get_issymbolic/)() | يرجع true في حال كان [Font](../../aspose.font/font/) رمزيًا. |
| [get_Metrics](./get_metrics/)() override | يحصل على مقاييس [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | يحصل على عدد الرموز في الـ [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | يحصل على أسماء خطوط Postscript [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | يحصل أو يضبط نمط الـ [Font](../../aspose.font/font/). هذه قيمة نصية خام يتم توفيرها بواسطة ملف الـ [Font](../../aspose.font/font/). |
| virtual [get_TtfTables](./get_ttftables/)() | يحصل على جداول TTF. |
| [GetAllGlyphIds](./getallglyphids/)() override | يرجع مصفوفة من جميع معرفات الرموز المتاحة في الـ [Font](../../aspose.font/font/). معرف الرمز هو رقم فريد للرمز، ويعتمد على نوع الخط. يمكن أن يكون معرف رمز TTF [Font](../../aspose.font/font/) مثالاً على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل الـ [Font](../../aspose.font/font/)، تُستخدم هياكل CFF لعناوين الرموز بالاسم. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يرجع الرمز بناءً على معرف الرمز. معرف الرمز هو رقم فريد للرمز، ويعتمد على نوع الخط. يمكن أن يكون معرف رمز TTF [Font](../../aspose.font/font/) مثالاً على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل الـ [Font](../../aspose.font/font/)، تُستخدم هياكل CFF لعناوين الرموز بالاسم. |
| [GetGlyphById](./getglyphbyid/)(System::String) | يرجع الرمز بناءً على اسمه. يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل الـ [Font](../../aspose.font/font/)، تُستخدم هياكل CFF لعناوين الرموز بالاسم. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | يرجع الرمز بناءً على معرف الرمز. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | يحصل على رمز بناءً على معرف الرمز الممرَّر ويملأ القائمة الممرَّرة لمعرفات الرموز بمكونات هذا الرمز. معرف الرمز هو رقم فريد للرمز، ويعتمد على نوع الخط. يمكن أن يكون معرف رمز TTF [Font](../../aspose.font/font/) مثالاً على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل الـ [Font](../../aspose.font/font/)، تُستخدم هياكل CFF لعناوين الرموز بالاسم. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | يحصل على رمز بناءً على الاسم الممرَّر ويملأ القائمة الممرَّرة لمعرفات الرموز بمكونات هذا الرمز. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | يحصل على رمز بناءً على الفهرس الممرَّر ويملأ القائمة الممرَّرة لمعرفات الرموز بمكونات هذا الرمز. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | احصل على تمثيل الرموز للنص. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | يحصل أو يضبط عائلة [Font](../../aspose.font/font/). |
| [set_FontName](./set_fontname/)(System::String) override | يحصل أو يضبط اسم الوجه [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | يحصل أو يضبط نمط الـ [Font](../../aspose.font/font/). هذه قيمة نصية خام يتم توفيرها بواسطة ملف الـ [Font](../../aspose.font/font/). |
## انظر أيضًا

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
