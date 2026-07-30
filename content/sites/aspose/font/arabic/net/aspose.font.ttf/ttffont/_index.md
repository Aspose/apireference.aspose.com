---
title: "الفئة TtfFont"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Ttf.TtfFont. تمثل خط TrueType (TTF)."
type: docs
weight: 870
url: /ar/net/aspose.font.ttf/ttffont/
---
## TtfFont class

يمثل خط TrueType (TTF).

```csharp
public class TtfFont : Font
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont/) { get; } | يحصل على خط CFF إذا كان موجودًا. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding/) { get; } | يحصل على ترميز الخط. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition/) { get; } | يحصل على تعريف الخط. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily/) { get; set; } | يحصل أو يضبط عائلة الخط. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname/) { get; set; } | يحصل أو يضبط اسم واجهة الخط. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames/) { get; } | يحصل على أسماء الخط. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | يحصل على وظيفة حفظ الخط. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle/) { get; } | يحصل على نمط الخط. هذه قيمة محسوبة وممثلة في نوع عام. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype/) { get; } | يحصل على نوع الخط. يُعيد قيمة FontType.TTF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype/) { get; } | يحصل على مواصفات نوع معرف الرمز. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic/) { get; } | يرجع true في حالة كون الخط رمزيًا. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics/) { get; } | يحصل على مقاييس الخط. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs/) { get; } | يحصل على عدد الرموز في الخط. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames/) { get; } | يحصل على أسماء خط Postscript. |
| override [Style](../../aspose.font.ttf/ttffont/style/) { get; set; } | يحصل أو يضبط نمط الخط. هذه قيمة نصية خام مقدمة من ملف الخط. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables/) { get; } | يحصل على جداول TTF. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert/#convert)(FontType) | يحوّل الخط إلى تنسيق آخر. |
| [Convert](../../aspose.font.ttf/ttffont/convert/#convert_1)(FontType, ICollection&lt;uint&gt;) | يحوّل الخط إلى تنسيق آخر مع مجموعة أحرف محدودة |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids/)() | يرجع مصفوفة من جميع معرفات الرموز المتاحة في الخط. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)). دعم عنونة الرموز بالاسم (سلسلة) متاح لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لتوجيه الرموز بالاسم. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid)(GlyphId) | يرجع الرمز حسب معرفه. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)). دعم عنونة الرموز بالاسم (سلسلة) متاح لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لتوجيه الرموز بالاسم. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_1)(string) | يرجع الرمز حسب اسمه. دعم عنونة الرموز بالاسم (سلسلة) متاح لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لتوجيه الرموز بالاسم. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_2)(uint) | يرجع الرمز حسب معرفه. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | يحصل على شكل باستخدام معرف الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. يمكن أن يكون معرف شكل خط TTF مثالًا على فئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) أو فئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) . دعم عنونة الشكل بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعنونة الأشكال بالاسم. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_1)(string, GlyphIdList) | يحصل على شكل باستخدام اسم الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_2)(uint, GlyphIdList) | يحصل على شكل باستخدام فهرس الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext/)(string) | احصل على تمثيل الأشكال للنص. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | يحفظ الخط بالتنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save/)(string) | يحفظ الخط بالتنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

### انظر أيضاً

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


