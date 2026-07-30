---
title: "الفئة Type1Font"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Type1.Type1Font. تمثل خط Type1"
type: docs
weight: 1460
url: /ar/net/aspose.font.type1/type1font/
---
## Type1Font class

يمثل Type1 Font.

```csharp
public class Type1Font : Font
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1font/encoding/) { get; } | يحصل على ترميز الخط. |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition/) { get; } | يحصل على تعريف الخط. |
| override [FontFamily](../../aspose.font.type1/type1font/fontfamily/) { get; set; } | الحصول على عائلة الخط. لم يتم تنفيذ مُعيّن عائلة الخط بعد. |
| override [FontName](../../aspose.font.type1/type1font/fontname/) { get; set; } | يحصل على اسم واجهة الخط. لم يتم تنفيذ مُعيّن اسم واجهة الخط بعد. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames/) { get; } | يحصل على أسماء الخط. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | يحصل على وظيفة حفظ الخط. |
| override [FontStyle](../../aspose.font.type1/type1font/fontstyle/) { get; } | يحصل على نمط الخط. هذه قيمة محسوبة وممثلة في نوع عام. |
| override [FontType](../../aspose.font.type1/type1font/fonttype/) { get; } | يحصل على نوع الخط. يعيد القيمة FontType.Type1. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype/) { get; } | مواصفات نوع Glyph id. |
| override [Metrics](../../aspose.font.type1/type1font/metrics/) { get; } | يحصل على مقاييس الخط. |
| override [NumGlyphs](../../aspose.font.type1/type1font/numglyphs/) { get; } | يحصل على عدد الرموز في الخط. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames/) { get; } | الحصول على أسماء الخط Postscript. |
| override [Style](../../aspose.font.type1/type1font/style/) { get; set; } | يحصل على نمط الخط. هذه قيمة سلسلة خام مقدمة من ملف الخط. لم يتم تنفيذ مُعيّن النمط بعد. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert/)(FontType) | يحوّل الخط إلى تنسيق آخر. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1font/getallglyphids/)() | يعيد مصفوفة من جميع معرفات القوالب المتاحة في الخط. معرف القالب هو رقم فريد للقالب، يعتمد على نوع الخط. يمكن أن يكون معرف قالب Type1 Font مثالًا على فئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) أو فئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| override [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid)(GlyphId) | يعيد القالب حسب معرف القالب. معرف القالب هو رقم فريد للقالب، يعتمد على نوع الخط. يمكن أن يكون معرف قالب Type1 Font مثالًا على فئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) أو فئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| virtual [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_1)(string) | يرجع الرمز حسب معرفه. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_2)(uint) | يرجع الرمز حسب معرفه. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | الحصول على تمثيل glyphs للنص. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | يحفظ الخط بالتنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save/)(string) | يحفظ الخط بالتنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

### انظر أيضاً

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


