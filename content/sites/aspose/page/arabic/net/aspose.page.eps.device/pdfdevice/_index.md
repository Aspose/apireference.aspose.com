---
title: PdfDevice
second_title: Aspose.Page لمرجع NET API
description: تضم هذه الفئة تحويل المستند إلى PDF .
type: docs
weight: 60
url: /ar/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

تضم هذه الفئة تحويل المستند إلى PDF .

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | تهيئة مثيل جديد لـ[`PdfDevice`](../pdfdevice) مع تيار الإخراج. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | تهيئة مثيل جديد لـ[`PdfDevice`](../pdfdevice) مع تدفق الإخراج والحجم المحدد للصفحة. |

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | إرجاع أو تحديد الخلفية الحالية للصفحة. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | إرجاع أو تحديد تحويل الأحرف الحالية. |
| [Creator](../../aspose.page/device/creator) { get; set; } | إرجاع أو تحديد منشئ إخراج الجهاز الناتج. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber) { get; } | رقم الصفحة الحالية . |
| override [Font](../../aspose.page.eps.device/pdfdevice/font) { set; } | تحديد الخط الحالي. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | يشير إلى ما إذا كان مثيل مكتبة Aspose.Page هذا مرخصًا. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | إرجاع أو تحديد العتامة الحالية. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | إرجاع أو تحديد قناع العتامة الحالي. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream) { get; set; } | تحديد أو إرجاع تدفق الإخراج. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint) { set; } | إرجاع أو تحديد الطلاء الحالي. |
| [Properties](../../aspose.page/device/properties) { get; set; } | خصائص الجهاز بما في ذلك البيانات الوصفية. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | خيارات لإدارة عملية العرض . |
| virtual [Size](../../aspose.page/device/size) { get; set; } | إرجاع أو تحديد حجم الصفحة. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke) { set; } | إرجاع أو تحديد السكتة الدماغية الحالية. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | إرجاع أو تحديد وضع عرض النص الحالي. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | إرجاع أو تحديد عرض ضغط النص الحالي. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage)() | إجراء التحضير اللازم للجهاز بعد تقديم الصفحة. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create)() | لإنشاء نسخة من هذا الجهاز . |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose)() | التخلص من سياق الرسومات. إذا كانت الاستعادة عند الإنشاء صحيحة ، فسيتم استدعاء writeGraphicsRestore (). |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw)(GraphicsPath) | يرسم مسارًا . |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | يرسم قوسًا . |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage)(Bitmap, Matrix, Color) | يرسم صورة ذات تحويل وخلفية معينين . |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | يرسم مقطعًا مستقيماً . |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | رسم شكل بيضاوي . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | رسم poligone . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | رسم مضلع . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | رسم مستطيل . |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | يرسم مستطيلاً مستديرًا . |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring)(string, double, double) | يرسم سلسلة عند نقطة معينة . |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument)() | إجراء التحضير اللازم للجهاز بعد تقديم المستند. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill)(GraphicsPath) | يملأ المسار . |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | يملأ قوسًا . |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | يملأ شكل بيضاوي . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | يملأ بوليغون . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | يملأ بوليغون . |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | يملأ مستطيل . |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | يملأ مستطيل دائري. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | يحصل على قيمة خاصية السلسلة . |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | يحصل على قيمة خاصية اللون . |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | يحصل على قيمة الخاصية المزدوجة . |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | الحصول على قيمة خاصية عدد صحيح . |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | يحصل على قيمة خاصية الهامش . |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | الحصول على قيمة خاصية المستطيل . |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | يحصل على قيمة خاصية الحجم . |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform)() | يحصل على التحويل الحالي. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip)() | تهيئة مقطع الجهاز. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers)() | يقوم بتهيئة عدد الصفحات لإخراجها. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | الحصول على قيمة الخاصية المنطقية . |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage_1)(string) | يجعل التحضير اللازم للجهاز قبل عرض الصفحة. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage)(float, float) | إجراء التحضير اللازم للجهاز قبل عرض كل صفحة. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew)() | إعادة تعيين الجهاز إلى الحالة الأولية للمستند بأكمله. تستخدم لإعادة تعيين دفق الإخراج. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset)() | إذا تم تعيين معلمات جهاز الصفحة ، فإن هذه الطريقة تسمح بإعادة دفق الكتابة إلى بداية الصفحة. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate#rotate)(double) | قم بتدوير التحويل الحالي على المحور Z. استدعاءات الكتابة التحويل (التحويل). الدوران بزاوية موجبة ثيتا تدور النقاط على المحور x الموجب باتجاه المحور y الموجب . |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | قم بتدوير مصفوفة التحويل الحالية حول نقطة. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale)(double, double) | مقياس مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip)(GraphicsPath) | يحدد مقطع الجهاز. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform)(Matrix) | يحدد التحويل الحالي. نظرًا لأن معظم تنسيقات الإخراج لا تنفذ هذه الوظيفة ، يتم حساب التحويل العكسي للتحويل الحالي وضربه في التحويل ليتم تعيينه ، ثم يتم إعادة توجيه النتيجة بواسطة call لكتابة التحويل (التحويل) . |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear)(double, double) | لقص مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument)() | إجراء التحضير اللازم للجهاز قبل بدء تقديم المستند. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring)() | إرجاع اسم نوع الجهاز. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform)(Matrix) | تحويل مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate)(double, double) | يترجم مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters)(IMultiPageDevice) | تحديث معلمات الصفحة من جهاز آخر متعدد الصفحات. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment)(string) | يكتب تعليقًا . |

## مجالات

| اسم | وصف |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author) | قيمة خاصية "المؤلف". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background) | مفتاح خاصية "الخلفية". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color) | مفتاح خاصية "لون الخلفية". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress) | مفتاح الخاصية "ضغط". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts) | مفتاح خاصية "تضمين الخط في المستند". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as) | مفتاح الخاصية "ما هو نوع الخط المستخدم للتضمين". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors) | قيمة خاصية "إصدار الأخطاء". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings) | قيمة خاصية "إصدار التحذيرات". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page) | مفتاح خاصية "احتواء المحتوى مع الصفحة". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords) | قيمة خاصية "الكلمات الرئيسية". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation) | مفتاح خاصية "الاتجاه". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins) | مفتاح خاصية "هوامش الصفحة". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size) | مفتاح خاصية "حجم الصفحة". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject) | قيمة خاصية "الموضوع". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title) | قيمة خاصية "العنوان". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent) | مفتاح خاصية "شفاف". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version) | مفتاح خاصية "الإصدار". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5) | قيمة خاصية "إصدار Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as) | مفتاح خاصية "تنسيق الصور". |

### أنظر أيضا

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* interface [IStreamable](../../aspose.page/istreamable)
* مساحة الاسم [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* المجسم [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
