---
title: "الفئة Font"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Font. تمثل الفئة الأساسية للخط."
type: docs
weight: 270
url: /ar/net/aspose.font/font/
---
## Font class

يمثل الفئة الأساسية Font.

```csharp
public abstract class Font : IFont, IFontSaver, IGlyphAccessor
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| abstract [Encoding](../../aspose.font/font/encoding/) { get; } | يحصل على ترميز الخط. |
| abstract [FontDefinition](../../aspose.font/font/fontdefinition/) { get; } | يحصل على تعريف الخط. |
| abstract [FontFamily](../../aspose.font/font/fontfamily/) { get; set; } | يحصل أو يضبط عائلة الخط. |
| abstract [FontName](../../aspose.font/font/fontname/) { get; set; } | يحصل أو يضبط اسم واجهة الخط. |
| abstract [FontNames](../../aspose.font/font/fontnames/) { get; } | يحصل على أسماء الخط. |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | يحصل على وظيفة حفظ الخط. |
| abstract [FontStyle](../../aspose.font/font/fontstyle/) { get; } | يحصل على نمط الخط. هذه قيمة محسوبة وممثلة في نوع عام. |
| abstract [FontType](../../aspose.font/font/fonttype/) { get; } | يحصل على نوع الخط. Type1، TrueType، إلخ. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز. |
| abstract [GlyphIdType](../../aspose.font/font/glyphidtype/) { get; } | مواصفات نوع معرف الحرف. للمستهلكين الذين يحتاجون إلى معرفة النوع الحقيقي لـ 'bytes[]'. |
| abstract [Metrics](../../aspose.font/font/metrics/) { get; } | يحصل على مقاييس الخط. |
| abstract [NumGlyphs](../../aspose.font/font/numglyphs/) { get; } | يحصل على عدد الرموز في الخط. |
| abstract [PostscriptNames](../../aspose.font/font/postscriptnames/) { get; } | الحصول على أسماء الخط Postscript. |
| abstract [Style](../../aspose.font/font/style/) { get; set; } | يحصل أو يضبط نمط الخط. هذه قيمة نصية خام مقدمة من ملف الخط. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| static [Open](../../aspose.font/font/open/#open_3)(FontDefinition) | يفتح خطًا باستخدام كائن FontDefinition. |
| static [Open](../../aspose.font/font/open/#open_1)(FontType, byte[]) | يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط. |
| static [Open](../../aspose.font/font/open/#open)(FontType, StreamSource) | يفتح خطًا باستخدام نوع الخط ومصدر التيار. |
| static [Open](../../aspose.font/font/open/#open_2)(FontType, string) | يفتح خطًا باستخدام نوع الخط واسم ملف الخط. |
| abstract [Convert](../../aspose.font/font/convert/)(FontType) | يحوّل الخط إلى تنسيق آخر. |
| abstract [GetAllGlyphIds](../../aspose.font/font/getallglyphids/)() | يعيد جميع معرفات الحروف المتاحة في الخط. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) class. معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) class. |
| abstract [GetGlyphById](../../aspose.font/font/getglyphbyid/)(GlyphId) | يرجع الحرف وفقًا لمعرّف الحرف. معرّف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرّف Type1 هو اسم الحرف، وهو مثال على فئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)). معرّف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | الحصول على تمثيل glyphs للنص. |
| virtual [Save](../../aspose.font/font/save/#save)(Stream) | يحفظ الخط بالتنسيق الأصلي. |
| virtual [Save](../../aspose.font/font/save/#save_1)(string) | يحفظ الخط بالتنسيق الأصلي. |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | يحفظ الخط بالتنسيق المحدد. |

### انظر أيضاً

* interface [IFont](../ifont/)
* interface [IFontSaver](../ifontsaver/)
* interface [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


