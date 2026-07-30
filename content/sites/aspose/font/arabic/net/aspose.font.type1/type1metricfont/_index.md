---
title: "الفئة Type1MetricFont"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Type1.Type1MetricFont. تنفيذ خط مقياس Type1. تم إنشاء هذا الخط Type1 باستخدام المقاييس فقط. وظائف استرجاع القوالب وبعض الوظائف الأخرى التي تتطلب خطًا حقيقيًا غير مسموح بها؛ الوظائف غير المسموح بها تُطلق استثناء Type1NotSupportedException. تُستخدم الخصائص الأخرى FontName وWeight وMetrics وEncoding من ملف المقاييس."
type: docs
weight: 1480
url: /ar/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

تنفيذ خط مقياس Type1. تم إنشاء هذا الخط type1 باستخدام المقاييس فقط. وظائف استرجاع الرموز وبعض الوظائف الأخرى التي تتطلب خطًا حقيقيًا غير مسموح بها، وتقوم الوظائف غير المسموح بها بإلقاء استثناء Type1NotSupportedException. تُستخدم الخصائص الأخرى (FontName، Weight، Metrics و Encoding) من ملف المقاييس.

```csharp
public class Type1MetricFont : Type1Font
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding/) { get; } | يتم تعريف الترميز في ملف المقاييس. StandardAdobeEncoding: يتم ملء الترميز تلقائيًا. |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition/) { get; } | يحصل على تعريف الخط. |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily/) { get; } | يحصل على عائلة الخط. |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname/) { get; } | يحصل على اسم الخط. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames/) { get; } | يحصل على أسماء الخط. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | يحصل على وظيفة حفظ الخط. |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle/) { get; } | يحصل على نمط الخط. هذه قيمة محسوبة وممثلة في نوع عام. |
| override [FontType](../../aspose.font.type1/type1font/fonttype/) { get; } | يحصل على نوع الخط. يعيد القيمة FontType.Type1. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype/) { get; } | مواصفات نوع Glyph id. |
| override [Metrics](../../aspose.font.type1/type1font/metrics/) { get; } | يحصل على مقاييس الخط. |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs/) { get; } | يحصل على عدد الرموز في الخط. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames/) { get; } | الحصول على أسماء الخط Postscript. |
| override [Style](../../aspose.font.type1/type1metricfont/style/) { get; } | يحصل على نمط الخط. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert/)(FontType) | يحوّل الخط إلى تنسيق آخر. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids/)() | يعيد جميع معرفات القوالب المتاحة في الخط. غير مدعوم لنوع `Type1MetricFont`. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid/#getglyphbyid)(GlyphId) | يرجع الحرف حسب معرّف الحرف. غير مدعوم لنوع `Type1MetricFont`. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid/#getglyphbyid_1)(string) | يرجع الحرف حسب معرّف الحرف. غير مدعوم لنوع `Type1MetricFont`. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/)(uint) | يرجع الرمز حسب معرفه. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | الحصول على تمثيل glyphs للنص. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | يحفظ الخط بالتنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save/)(string) | يحفظ الخط بالتنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

## أمثلة

ملاحظة: إذا كان ملف القياسات يحدد الترميز كـ "FontSpecific"، يجب على المستخدم توفير الترميز المحدد بالطريقة التالية:

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

### انظر أيضاً

* class [Type1Font](../type1font/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


