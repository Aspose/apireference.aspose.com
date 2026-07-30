---
title: "الفئة CffFont"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Cff.CffFont. تمثّل تنسيق الخط المدمج CFF"
type: docs
weight: 30
url: /ar/net/aspose.font.cff/cfffont/
---
## CffFont class

يمثل تنسيق الخط المدمج (CFF).

```csharp
public class CffFont : Font
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [CommonFontsSettings](../../aspose.font.cff/cfffont/commonfontssettings/) { get; set; } | الحصول/التعيين الإعدادات المشتركة لخطوط CFF. تُستخدم هذه الإعدادات في سيناريوهات مختلفة ويمكن تغييرها لكل خط على حدة. |
| override [Encoding](../../aspose.font.cff/cfffont/encoding/) { get; } | يحصل على ترميز الخط. |
| override [FontDefinition](../../aspose.font.cff/cfffont/fontdefinition/) { get; } | يحصل على تعريف الخط. |
| override [FontFamily](../../aspose.font.cff/cfffont/fontfamily/) { get; set; } | الحصول على عائلة الخط. لم يتم تنفيذ مُعيّن عائلة الخط بعد. |
| override [FontName](../../aspose.font.cff/cfffont/fontname/) { get; set; } | الحصول أو التعيين لاسم واجهة الخط. |
| override [FontNames](../../aspose.font.cff/cfffont/fontnames/) { get; } | الحصول على أسماء الخط. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | يحصل على وظيفة حفظ الخط. |
| override [FontStyle](../../aspose.font.cff/cfffont/fontstyle/) { get; } | يحصل على نمط الخط. هذه قيمة محسوبة وممثلة في نوع عام. |
| override [FontType](../../aspose.font.cff/cfffont/fonttype/) { get; } | الحصول على نوع الخط. إرجاع قيمة FontType.CFF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز. |
| override [GlyphIdType](../../aspose.font.cff/cfffont/glyphidtype/) { get; } | يحصل على مواصفات نوع معرف الرمز. |
| [IsCidKeyedFont](../../aspose.font.cff/cfffont/iscidkeyedfont/) { get; } | الحصول على القيمة التي تشير إلى أن الخط يستخدم cid-keyed. |
| override [Metrics](../../aspose.font.cff/cfffont/metrics/) { get; } | يحصل على مقاييس الخط. |
| override [NumGlyphs](../../aspose.font.cff/cfffont/numglyphs/) { get; } | يحصل على عدد الرموز في الخط. |
| override [PostscriptNames](../../aspose.font.cff/cfffont/postscriptnames/) { get; } | الحصول على أسماء الخط Postscript. |
| override [Style](../../aspose.font.cff/cfffont/style/) { get; set; } | الحصول أو التعيين لنمط الخط. هذه قيمة نصية خام مقدمة من ملف الخط. |
| [TopDictDataProvider](../../aspose.font.cff/cfffont/topdictdataprovider/) { get; } | الحصول على accessor لأول DICT من المستوى الأعلى في بنية Top DICT INDEX. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| override [Convert](../../aspose.font.cff/cfffont/convert/)(FontType) | يحوّل الخط إلى تنسيق آخر. |
| override [GetAllGlyphIds](../../aspose.font.cff/cfffont/getallglyphids/)() | إرجاع مصفوفة من جميع معرفات glyph المتاحة في الخط. معرف glyph هو رقم فريد للglyph، يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط CFF مثالًا على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| override [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid)(GlyphId) | إرجاع glyph حسب معرف glyph. معرف glyph هو رقم فريد للglyph، يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط CFF مثالًا على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid_1)(string) | إرجاع glyph حسب اسم glyph. |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid_2)(uint) | يرجع الرمز حسب معرفه. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | الحصول على تمثيل glyphs للنص. |
| [GetIndexDataProvider](../../aspose.font.cff/cfffont/getindexdataprovider/)(CffIndexProviderType) | الحصول على الموفر للنوع المحدد من بنية CFF INDEX. |
| virtual [Save](../../aspose.font/font/save/)(Stream) | يحفظ الخط بالتنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save/)(string) | يحفظ الخط بالتنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

### انظر أيضاً

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


