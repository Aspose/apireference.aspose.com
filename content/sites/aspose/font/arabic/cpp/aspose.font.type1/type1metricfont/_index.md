---
title: "فئة Aspose::Font::Type1::Type1MetricFont"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Type1::Type1MetricFont. تنفيذ خط مقياس Type1. تم إنشاء هذا الخط type1 باستخدام المقاييس فقط. وظائف استرجاع الرموز وبعض الوظائف الأخرى التي تتطلب خطًا حقيقيًا غير مسموح بها، والوظائف غير المسموح بها تُطلق استثناء Type1NotSupportedException. تُستخدم الخصائص الأخرى (FontName, Weight, Metrics و Encoding) من ملف المقاييس في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | يتم تعريف الترميز في ملف المقاييس. StandardAdobeEncoding: يتم ملء الترميز تلقائيًا. |
| [get_FontFamily](./get_fontfamily/)() override | يحصل على عائلة [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | يحصل على اسم [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | يحصل على نمط [Font](../../aspose.font/font/). هذه قيمة محسوبة وممثلة بنوع عام. |
| [get_NumGlyphs](./get_numglyphs/)() override | يحصل على عدد الرموز في الـ [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | يحصل على نمط [Font](../../aspose.font/font/). |
| [GetAllGlyphIds](./getallglyphids/)() override | يعيد جميع معرفات الرموز المتاحة في [Font](../../aspose.font/font/). غير مدعوم لنوع [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::String) override | يعيد الرمز حسب معرفه. غير مدعوم لنوع [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يعيد الرمز حسب معرفه. غير مدعوم لنوع [Type1MetricFont](./). |
## انظر أيضًا

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
