---
title: Class PsDocument
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.EPS.PsDocument فصل. تحتوي هذه الفئة على مستندات PS / EPS .
type: docs
weight: 140
url: /ar/net/aspose.page.eps/psdocument/
---
## PsDocument class

تحتوي هذه الفئة على مستندات PS / EPS .

```csharp
public sealed class PsDocument : Document
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | يتم التهيئة`PsDocument` مع دفق ملف PS / EPS . |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | تهيئة فارغة`PsDocument` مع الصفحة التي تمت تهيئتها. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | تهيئة فارغة`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | تهيئة فارغة`PsDocument` عندما يكون عدد صفحات مستند بوستسكريبت معروفًا مسبقًا. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | إرجاع عدد الصفحات في مستند PDF الناتج. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | إضافة مقطع إلى حالة الرسومات الحالية . |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | يضيف مقطعًا إلى حالة الرسومات الحالية ويكتب عامل "مسار جديد". من الضروري القيام بهروب من التقاء مسار القطع هذا وبعض المسارات اللاحقة مثل الحروف الرسومية الموضحة باستخدام عامل التشغيل "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | إضافة مستطيل القطع إلى حالة الرسومات الحالية. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | إكمال الصفحة الحالية . |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | ارسم مسارًا عشوائيًا . |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | ارسم صورة مقنعة . |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | ارسم صورة . |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | ارسم صورة محولة بالخلفية . |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | املأ مسارًا عشوائيًا . |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | يضيف سلسلة نصية عن طريق ملء interrior من الحروف الرسومية ورسم ملامح الحروف الرسومية. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | يضيف سلسلة نصية عن طريق ملء interrior من الحروف الرسومية ورسم ملامح الحروف الرسومية. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | يضيف سلسلة نصية عن طريق ملء interrior من glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | يضيف سلسلة نصية عن طريق ملء interrior من glyphs. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | الحصول على رسم لحالة الرسومات الحالية . |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | يحصل على ضربة حالة الرسومات الحالية . |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | يقرأ ملف PS / EPS ويستخرج XmpMetdata إذا كان موجودًا بالفعل أو قم بإضافة ملف جديد إذا لم يكن موجودًا. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | يدمج ملفات PS / EPS بجهاز. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | إنشاء صفحة جديدة وجعلها حالية . |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | يضيف سلسلة نصية عن طريق رسم ملامح الحروف الرسومية . |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | يضيف سلسلة نصية عن طريق رسم ملامح الحروف الرسومية . |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | يضيف التدوير إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية) . |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | حفظ معين`PsDocument` كملف EPS. تُستخدم هذه الطريقة فقط عندما تم إنشاء وثيقة PsDocument من البداية. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | حفظ معين`PsDocument` كملف EPS. يتم استخدام هذه الطريقة فقط بعد تحديث بيانات تعريف XMP . تقوم بحفظ ملف EPS الأولي ببيانات وصفية حالية محدثة أو ملف جديد تم إنشاؤه أثناء استدعاء طريقة GetMetadata. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | يحفظ ملف PS / EPS على الجهاز. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | يضيف مقياسًا إلى حالة الرسومات الحالية (مقياس المصفوفة الحالية) . |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | يعين معلمات جهاز الصفحة (راجع تحليل PostScript "setpagedevice" للمشغل) . من بينها يمكن أن يكون حجم الصفحة ولونها وما إلى ذلك. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | يحدد حجم الصفحة. لإنشاء صفحات بأحجام مختلفة في وثيقة واحدة ، استخدم[`SetPageDevice`](./setpagedevice/) طريقة بعد هذه الطريقة مباشرة. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | تعيين الطلاء في حالة الرسومات الحالية. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | يضبط الشطب في حالة الرسومات الحالية. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | يضيف تحويل القص إلى حالة الرسومات الحالية (مصفوفة القص الحالية). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | يضيف تحويلًا إلى حالة الرسومات الحالية (يربط هذه المصفوفة بالمصفوفة الحالية) . |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | يضيف الترجمة إلى حالة الرسومات الحالية (يترجم المصفوفة الحالية) . |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | يكتب استعادة حالة الرسومات الحالية (راجع مواصفات PostScript على عامل التشغيل "grestore") . |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | يكتب حفظ حالة الرسومات الحالية (راجع مواصفات PostScript على عامل التشغيل "gsave") . |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | حفظ كائن الصورة النقطية في تدفق إخراج EPS . |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | حفظ كائن الصورة النقطية في ملف EPS . |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | يحفظ صورة PNG / JPEG / TIFF / BMP / GIF / EMF من دفق الإدخال إلى تدفق إخراج EPS . |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | يحفظ صورة PNG / JPEG / TIFF / BMP / GIF / EMF من ملف إلى ملف EPS. |

### أنظر أيضا

* class [Document](../../aspose.page/document/)
* مساحة الاسم [Aspose.Page.EPS](../../aspose.page.eps/)
* المجسم [Aspose.Page](../../)


