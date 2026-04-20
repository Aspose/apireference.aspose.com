---
title: "فئة Aspose::Font::Font"
linktitle: "خط"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Font. تمثل الفئة الأساسية Font في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.font/font/
---
## Font class


تمثل الفئة الأساسية [Font](./).

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | تحول [Font](./) إلى تنسيق آخر. |
| virtual [get_Encoding](./get_encoding/)() | يحصل على ترميز [Font](./). |
| virtual [get_FontDefinition](./get_fontdefinition/)() | يحصل على تعريف [Font](./). |
| virtual [get_FontFamily](./get_fontfamily/)() | يحصل أو يضبط عائلة [Font](./). |
| virtual [get_FontName](./get_fontname/)() | يحصل أو يضبط اسم الوجه [Font](./). |
| virtual [get_FontNames](./get_fontnames/)() | يحصل على أسماء [Font](./). |
| [get_FontSaver](./get_fontsaver/)() override | يحصل على وظيفة الحفظ لـ [Font](./). |
| virtual [get_FontStyle](./get_fontstyle/)() | يحصل على نمط [Font](./). هذه قيمة محسوبة وممثلة بنوع عام. |
| virtual [get_FontType](./get_fonttype/)() | يحصل على نوع [Font](./). |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) مُدخل الرموز. يسترجع الرموز ومعرفات الرموز. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | تحديد نوع معرف الرمز. للمستهلكين الذين يحتاجون إلى معرفة النوع الحقيقي لـ 'bytes[]'. |
| virtual [get_Metrics](./get_metrics/)() | يحصل على مقاييس [Font](./). |
| virtual [get_NumGlyphs](./get_numglyphs/)() | يحصل على عدد الرموز في [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | يحصل على أسماء PostScript لـ [Font](./). |
| virtual [get_Style](./get_style/)() | يحصل أو يضبط نمط [Font](./). هذه قيمة سلسلة خام مقدمة من ملف [Font](./). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | يعيد جميع معرفات الرموز المتاحة في [Font](./). معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم رمز، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | يعيد الرمز حسب معرفه. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم رمز، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)). |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | يحصل على تمثيل الرموز للنص. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | يفتح خطًا باستخدام كائن FontDefinition. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | يفتح خطًا باستخدام نوع الخط ومصدر الدفق. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | يفتح خطًا باستخدام نوع الخط واسم ملف الخط. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | يحفظ [Font](./) بالتنسيق الأصلي. |
| [Save](./save/)(System::String) override | يحفظ [Font](./) بالتنسيق الأصلي. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | يحفظ [Font](./) بالتنسيق المحدد. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | يحصل أو يضبط عائلة [Font](./). |
| virtual [set_FontName](./set_fontname/)(System::String) | يحصل أو يضبط اسم الوجه [Font](./). |
| virtual [set_Style](./set_style/)(System::String) | يحصل أو يضبط نمط [Font](./). هذه قيمة سلسلة خام مقدمة من ملف [Font](./). |
## انظر أيضًا

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
