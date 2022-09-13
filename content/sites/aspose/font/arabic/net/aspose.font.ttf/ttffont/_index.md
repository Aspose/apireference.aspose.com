---
title: TtfFont
second_title: Aspose.Font لمرجع .NET API
description: يمثل خط TrueType TTF .
type: docs
weight: 630
url: /ar/net/aspose.font.ttf/ttffont/
---
## TtfFont class

يمثل خط TrueType (TTF) .

```csharp
public class TtfFont : Font
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | الحصول على خط CFF إذا كان موجودًا. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | يحصل على ترميز الخط . |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | يحصل على تعريف الخط . |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | الحصول على عائلة الخطوط أو تعيينها . |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | الحصول على اسم الخط أو تعيينه . |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | يحصل على أسماء الخطوط . |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | يحصل على وظيفة حفظ الخط. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | الحصول على نمط الخط. هذه قيمة محسوبة وممثلة في النوع المعمم . |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | الحصول على نوع الخط . إرجاع نوع الخط. قيمة TTF . |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | موصّل الخط الرسومي. استرداد معرفات الحروف الرسومية والحروف الرسومية. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | الحصول على مواصفات نوع معرف الصورة الرمزية . |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | إرجاع صحيح في حال كان الخط رمزيًا . |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | الحصول على مقاييس الخط. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | الحصول على عدد الحروف الرسومية في الخط. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | يحصل على أسماء خطوط التذييل. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | الحصول على نمط الخط أو تعيينه . هذه قيمة سلسلة أولية يتم توفيرها بواسطة ملف الخط. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | الحصول على جداول TTF . |

## طُرق

| اسم | وصف |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | تحويل الخط إلى تنسيق آخر. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | إرجاع مصفوفة لجميع معرفات الحروف الرسومية ، المتوفرة في Font. معرف Glyph هو رقم فريد للحرف الرسومي ، وهو نوع الخط المعتمد.[`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) فئة أو ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. يتم دعم عنونة الاسم (السلسلة) glyph لخطوط TTF عبر تعيين جدول النشر. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | إرجاع الصورة الرمزية بواسطة معرف الصورة الرمزية . معرف الصورة الرمزية هو رقم فريد للحرف الرسومي ، وهو نوع الخط المعتمد . يمكن أن يكون معرف الصورة الرمزية للخط TTF مثيلاً لـ ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) فئة أو ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. يتم دعم عنونة الاسم (السلسلة) glyph لخطوط TTF عبر تعيين جدول النشر. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | إرجاع الحرف الرسومي بواسطة اسم الصورة الرمزية. يتم دعم عنونة الاسم (السلسلة) للحروف الرسومية لخطوط TTF عبر تعيين جدول النشر. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | إرجاع الصورة الرمزية بواسطة معرف الصورة الرمزية . |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | يحصل على حرف رسومي بواسطة معرف الصورة الرمزية الذي تم تمريره ويملأ القائمة التي تم تمريرها لمعرفات الصورة الرمزية بمكونات من هذا الحرف الرسومي . معرف Glyph هو رقم فريد للحرف الرسومي ، وهو نوع الخط التابع.[`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) فئة أو ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. يتم دعم عنونة الاسم (السلسلة) glyph لخطوط TTF عبر تعيين جدول النشر. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | يحصل على حرف رسومي من خلال اسم الصورة الرمزية الذي تم تمريره ويملأ القائمة التي تم تمريرها لمعرفات الحروف الرسومية بمكونات من هذا الحرف الرسومي . |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | يحصل على حرف رسومي بواسطة فهرس الصورة الرمزية الذي تم تمريره ويملأ القائمة التي تم تمريرها لمعرفات الحروف الرسومية بمكونات من هذا الصورة الرمزية . |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | الحصول على تمثيل الحروف الرسومية للنص . |
| virtual [Save](../../aspose.font/font/save)(Stream) | يحفظ الخط في التنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save)(string) | يحفظ الخط في التنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

### أنظر أيضا

* class [Font](../../aspose.font/font)
* مساحة الاسم [Aspose.Font.Ttf](../../aspose.font.ttf)
* المجسم [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
