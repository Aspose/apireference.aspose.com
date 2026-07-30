---
title: "Aspose::Font::Cff::CffFont فئة"
linktitle: "CffFont"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Cff::CffFont فئة. تمثّل تنسيق الخط المدمج (CFF) في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.cff/cfffont/
---
## CffFont class


يمثّل تنسيق [Font](../../aspose.font/font/) المدمج (CFF).

```cpp
class CffFont : public Aspose::Font::Font
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | يحوّل [Font](../../aspose.font/font/) إلى تنسيق آخر. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | يحصل/يضبط الإعدادات المشتركة لخطوط CFF. تُستخدم هذه الإعدادات في سيناريوهات مختلفة ويمكن تغييرها لكل خط على حدة. |
| [get_Encoding](./get_encoding/)() override | يحصل على ترميز [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | يحصل على تعريف [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | يحصل على عائلة [Font](../../aspose.font/font/). لم يتم تنفيذ مُعيّن عائلة [Font](../../aspose.font/font/) بعد. |
| [get_FontName](./get_fontname/)() override | يحصل على اسم الوجه لـ [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | احصل على أسماء [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | يحصل على نمط [Font](../../aspose.font/font/). هذه قيمة محسوبة وممثلة بنوع عام. |
| [get_FontType](./get_fonttype/)() override | يحصل على نوع [Font](../../aspose.font/font/). تُرجع قيمة [FontType.CFF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | يحصل على مواصفة نوع معرف الحرف. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | يحصل على قيمة تشير إلى أن [Font](../../aspose.font/font/) هو cid-keyed. |
| [get_Metrics](./get_metrics/)() override | يحصل على مقاييس [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | يحصل على عدد الرموز في الـ [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | يحصل على أسماء [Font](../../aspose.font/font/) بوستسكريبت. |
| [get_Style](./get_style/)() override | يحصل على نمط [Font](../../aspose.font/font/). هذه قيمة نصية خام تُوفرها ملف [Font](../../aspose.font/font/). |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | يحصل على المُدخل لأول DICT من المستوى الأعلى في بنية Top DICT INDEX. |
| [GetAllGlyphIds](./getallglyphids/)() override | تُرجع مصفوفة من جميع معرّفات الحروف (glyph ids) المتاحة في [Font](../../aspose.font/font/). معرّف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. يمكن أن يكون معرّف حرف CFF [Font](../../aspose.font/font/) مثالًا على فئة ([GlyphStringId](../)) class أو فئة ([GlyphUInt32Id](../)) class. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | تُرجع الحرف بحسب معرّف الحرف. معرّف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. يمكن أن يكون معرّف حرف CFF [Font](../../aspose.font/font/) مثالًا على فئة ([GlyphStringId](../)) class أو فئة ([GlyphUInt32Id](../)) class. |
| [GetGlyphById](./getglyphbyid/)(System::String) | تُرجع الحرف بحسب اسم الحرف. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | يرجع الرمز بناءً على معرف الرمز. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | يحصل على الموفر لنوع بنية CFF INDEX المحدد. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | يحصل/يضبط الإعدادات المشتركة لخطوط CFF. تُستخدم هذه الإعدادات في سيناريوهات مختلفة ويمكن تغييرها لكل خط على حدة. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | يحصل على عائلة [Font](../../aspose.font/font/). لم يتم تنفيذ مُعيّن عائلة [Font](../../aspose.font/font/) بعد. |
| [set_FontName](./set_fontname/)(System::String) override | يضبط اسم وجه [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | يضبط نمط [Font](../../aspose.font/font/). هذه قيمة نصية خام تُوفرها ملف [Font](../../aspose.font/font/). |
## انظر أيضًا

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
