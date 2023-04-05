---
title: Class Device
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.Device فصل. هذه الفئة تغلف تقديم المستند إلى جهاز مجردة. يتم تنفيذ عرض المستند صفحة بصفحة.
type: docs
weight: 20
url: /ar/net/aspose.page/device/
---
## Device class

هذه الفئة تغلف تقديم المستند إلى جهاز مجردة. يتم تنفيذ عرض المستند صفحة بصفحة.

```csharp
public abstract class Device
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Device](device/)(Size) | يتم التهيئة`Device` بحجم الصفحة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | إرجاع أو تحديد الخلفية الحالية للصفحة. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | إرجاع أو تحديد تحويل الأحرف الحالية. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | إرجاع أو تحديد منشئ إخراج الجهاز الناتج. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | إرجاع أو تحديد الخط الحالي. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | يشير إلى ما إذا كان مثيل مكتبة Aspose.Page هذا مرخصًا. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | إرجاع أو تحديد العتامة الحالية. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | إرجاع أو تحديد قناع العتامة الحالي. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | إرجاع أو تحديد الطلاء الحالي. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | خصائص الجهاز بما في ذلك البيانات الوصفية. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | خيارات لإدارة عملية العرض . |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | إرجاع أو تحديد حجم الصفحة. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | إرجاع أو تحديد السكتة الدماغية الحالية . |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | إرجاع أو تحديد وضع عرض النص الحالي. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | إرجاع أو تحديد عرض ضغط النص الحالي. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | لإنشاء نسخة من هذا الجهاز . |
| virtual [Dispose](../../aspose.page/device/dispose/)() | التخلص من الجهاز . |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | يرسم مسارًا . |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | يرسم قوسًا . |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | يرسم صورة ذات تحويل وخلفية معينين . |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | يرسم مقطعًا مستقيماً . |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | رسم شكل بيضاوي . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | رسم poligone . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | رسم مضلع . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | يرسم مستطيلًا . |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | يرسم مستطيلاً مستديرًا . |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | يرسم سلسلة عند نقطة معينة . |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | إجراء التحضير اللازم للجهاز بعد تقديم المستند. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | يملأ المسار . |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | يملأ قوسًا . |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | يملأ شكل بيضاوي . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | يملأ بوليغون . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | يملأ بوليغون . |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | يملأ مستطيل . |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | يملأ مستطيل دائري . |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | يحصل على قيمة خاصية السلسلة . |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | يحصل على قيمة خاصية اللون . |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | يحصل على قيمة الخاصية المزدوجة . |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | الحصول على قيمة خاصية عدد صحيح . |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | يحصل على قيمة خاصية الهامش . |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | يحصل على قيمة خاصية المستطيل . |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | يحصل على قيمة خاصية الحجم . |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | يحصل على التحويل الحالي . |
| virtual [InitClip](../../aspose.page/device/initclip/)() | تهيئة مقطع الجهاز. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | الحصول على قيمة الخاصية المنطقية . |
| virtual [ReNew](../../aspose.page/device/renew/)() | إعادة تعيين الجهاز إلى الحالة الأولية للمستند بأكمله. تستخدم لإعادة تعيين تيار الإخراج. |
| virtual [Reset](../../aspose.page/device/reset/)() | إعادة ضبط الجهاز على الحالة الأولية للصفحة. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | قم بتدوير مصفوفة التحويل الحالية. استدعاءات الكتابة التحويل (التحويل) . الدوران بزاوية موجبة ثيتا تدور النقاط على المحور x الموجب باتجاه المحور y الموجب . |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | قم بتدوير مصفوفة التحويل الحالية حول نقطة. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | مقياس مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | يحدد مقطع الجهاز. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | يحدد التحويل الحالي . |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | لقص مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | إجراء التحضير اللازم للجهاز قبل بدء تقديم المستند. |
| override [ToString](../../aspose.page/device/tostring/)() | إرجاع اسم نوع الجهاز. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | تحويل مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | يترجم مصفوفة التحويل الحالية. المكالمات writeTransform (التحويل) . |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | يكتب تعليقًا . |

## مجالات

| اسم | وصف |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | إصدار الجهاز الحالي. |

### أنظر أيضا

* مساحة الاسم [Aspose.Page](../../aspose.page/)
* المجسم [Aspose.Page](../../)


