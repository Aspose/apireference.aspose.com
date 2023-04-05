---
title: Class ImageDevice
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.EPS.Device.ImageDevice فصل. تضم هذه الفئة تحويل المستند إلى صورة.
type: docs
weight: 40
url: /ar/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

تضم هذه الفئة تحويل المستند إلى صورة.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | تهيئة مثيل جديد لـ`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | تهيئة مثيل جديد لـ`ImageDevice` بتنسيق الصورة المحدد. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | تهيئة مثيل جديد لـ`ImageDevice` بحجم الصفحة المحدد. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | تهيئة مثيل جديد لـ`ImageDevice` بالحجم المحدد للصفحة وتنسيق الصورة. |

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | إرجاع أو تحديد تحويل الأحرف الحالية. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | إرجاع أو تحديد منشئ إخراج الجهاز الناتج. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | رقم الصفحة الحالية . |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | إرجاع أو تحديد الخط الحالي. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | تنسيق الصورة . |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | إرجاع الصور الناتجة بالبايت ، مصفوفة بايت واحدة لصفحة واحدة. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | يشير إلى ما إذا كان مثيل مكتبة Aspose.Page هذا مرخصًا. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | إرجاع أو تحديد الخلفية الحالية للصفحة. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | إرجاع أو تحديد قناع العتامة الحالي. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | إرجاع أو تحديد الطلاء الحالي. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | خصائص الجهاز بما في ذلك البيانات الوصفية. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | خيارات لإدارة عملية العرض . |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | إرجاع أو تحديد حجم الصفحة. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | إرجاع أو تحديد السكتة الدماغية الحالية . |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | إرجاع أو تحديد وضع عرض النص الحالي. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | إرجاع أو تحديد عرض ضغط النص الحالي. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | إجراء التحضير اللازم للجهاز بعد تقديم الصفحة. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | لإنشاء نسخة من هذا الجهاز . |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | التخلص من الجهاز . |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | يرسم مسارًا . |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | يرسم قوسًا . |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | يرسم صورة ذات تحويل وخلفية معينين . |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | يرسم مقطعًا مستقيماً . |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | رسم شكل بيضاوي . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | رسم poligone . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | رسم مضلع . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | يرسم مستطيلًا . |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | يرسم مستطيلاً مستديرًا . |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | يرسم سلسلة عند نقطة معينة . |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | إجراء التحضير اللازم للجهاز بعد تقديم المستند. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | يملأ المسار . |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | يملأ قوسًا . |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | يملأ شكل بيضاوي . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | يملأ بوليغون . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | يملأ بوليغون . |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | يملأ مستطيل . |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | يملأ مستطيل دائري . |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | يحصل على قيمة خاصية السلسلة . (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | يحصل على قيمة خاصية اللون . (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | يحصل على قيمة الخاصية المزدوجة . (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | الحصول على قيمة خاصية عدد صحيح . (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | يحصل على قيمة خاصية الهوامش. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | يحصل على قيمة خاصية المستطيل . (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | يحصل على قيمة خاصية الحجم . (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | يحصل على التحويل الحالي . |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | يقوم بتهيئة مقطع من الجهاز. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | يقوم بتهيئة عدد الصفحات لإخراجها. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | الحصول على قيمة الخاصية المنطقية . (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | يجعل التحضير اللازم للجهاز قبل عرض الصفحة. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | إجراء التحضير اللازم للجهاز قبل عرض كل صفحة. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | إعادة تعيين الجهاز إلى الحالة الأولية للمستند بأكمله. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | إعادة ضبط الجهاز على الحالة الأولية للصفحة. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | قم بتدوير مصفوفة التحويل الحالية فوق المحور Z. استدعاءات الكتابة التحويل (التحويل) . الدوران بزاوية موجبة ثيتا تدور النقاط على المحور x الموجب باتجاه المحور y الموجب . |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | قم بتدوير مصفوفة التحويل الحالية حول نقطة. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | مقياس مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | مقاطع الشكل. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | يحدد التحويل الحالي . |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | لقص مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | إجراء التحضير اللازم للجهاز قبل بدء تقديم المستند. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | إرجاع اسم نوع الجهاز. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | تحويل مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | يترجم مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | تحديث معلمات الصفحة من جهاز آخر متعدد الصفحات. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | يكتب تعليقًا . |

## مجالات

| اسم | وصف |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | مفتاح خاصية "الخلفية". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | مفتاح خاصية "لون الخلفية". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | مفتاح خاصية "تضمين الخط في المستند". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | قيمة خاصية "إصدار الأخطاء". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | قيمة خاصية "إصدار التحذيرات". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | مفتاح خاصية "احتواء المحتوى مع الصفحة". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | مفتاح خاصية "الاتجاه". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | مفتاح خاصية "هوامش الصفحة". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | مفتاح خاصية "حجم الصفحة". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | قيمة الممتلكات "المُنتِج". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | مفتاح خاصية "شفاف". |

### أنظر أيضا

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* مساحة الاسم [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* المجسم [Aspose.Page](../../)


