---
title: Class ImageDevice
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.Presentation.Image.ImageDevice فصل. فئة جهاز تكوين الصورة.
type: docs
weight: 350
url: /ar/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

فئة جهاز تكوين الصورة.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | إنشاء مثيل جديد . |
| [ImageDevice](imagedevice/#constructor_1)(Size) | إنشاء مثيل جديد بحجم وسائط محدد. |

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | يحصل / يحدد لون الخلفية. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | إرجاع أو تحديد تحويل الأحرف الحالية. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | إرجاع أو تحديد منشئ إخراج الجهاز الناتج. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | إرجاع الرقم المطلق للصفحة الحالية داخل المستند. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | إرجاع الرقم النسبي للصفحة الحالية داخل القسم الحالي. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | يحصل / يحدد الخط الحالي. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | يشير إلى ما إذا كان مثيل مكتبة Aspose.Page هذا مرخصًا. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | يحصل / يحدد التعتيم . |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | يحصل / يحدد الفرشاة لقناع العتامة. يتم تطبيق القناع على Paint أو Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | الحصول على / تعيين الفرشاة لملء المسارات . |
| [Properties](../../aspose.page/device/properties/) { get; set; } | خصائص الجهاز بما في ذلك البيانات الوصفية. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | إرجاع مصفوفات بايت الصور الناتجة. البعد الأول للمستندات الداخلية والثاني للصفحات داخل المستندات الداخلية. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | يقوم بتهيئة خيارات الحفظ . |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | يحصل / يحدد حجم وسائط الجهاز. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | الحصول على / تعيين حد رسم المسارات. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | إرجاع أو تحديد وضع عرض النص الحالي. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | إرجاع أو تحديد عرض ضغط النص الحالي. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | يكمل الصفحة . |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | تم الانتهاء من قسم المستند . |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | ينشئ مثيلًا جديدًا للجهاز بناءً على مثيل الجهاز هذا . يكتب حالة رسومات الجهاز هذه ، أي يُنشئApsCanvas مثيل (مثيلات) مع خصائص RenderTransform و Clip المقابلة. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | التخلص من مثيل هذا الجهاز. إنهاء حالة رسومات مثيل الجهاز هذه ، أي مفاتيح تبديل APS التي تُنشئ سياق إلى ملفApsCanvas من المستوى الأعلى ثم حالة رسومات هذا الجهازApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | يرسم المسار المحدد . |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | يرسم قوسًا . |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | يرسم صورة ذات تحويل وخلفية معينين . |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | يرسم مقطعًا مستقيماً . |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | رسم شكل بيضاوي . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | رسم poligone . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | رسم مضلع . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | يرسم مستطيلًا . |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | يرسم مستطيلاً مستديرًا . |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | يرسم سلسلة في الموضع المحدد . |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | يكمل المستند . |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | يملأ المسار المحدد . |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | يملأ قوسًا . |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | يملأ شكل بيضاوي . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | يملأ بوليغون . |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | يملأ بوليغون . |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | يملأ مستطيل . |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | يملأ مستطيل دائري . |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | يحصل على قيمة خاصية السلسلة . |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | يحصل على قيمة خاصية اللون . |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | يحصل على قيمة الخاصية المزدوجة . |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | الحصول على قيمة خاصية عدد صحيح . |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | يحصل على قيمة خاصية الهامش . |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | يحصل على قيمة خاصية المستطيل . |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | يحصل على قيمة خاصية الحجم . |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | إرجاع مصفوفة التحويل الحالية. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | تهيئة مقطع الجهاز. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | يقوم بتهيئة عدد الصفحات لإخراجها. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | الحصول على قيمة الخاصية المنطقية . |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | يبدأ صفحة جديدة بالعنوان المحدد. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | يبدأ صفحة جديدة بالعرض والارتفاع المحددين. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | يبدأ قسم مستند جديد. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | يضبط الأجهزة على الحالة الأولية . |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | يعيد ضبط الجهاز. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | يطبق دوران في اتجاه عقارب الساعة حول الأصل لمصفوفة التحويل الحالية. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | قم بتدوير مصفوفة التحويل الحالية حول نقطة. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | يطبق متجه المقياس المحدد على مصفوفة التحويل الحالية. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | يضيف المسار المحدد إلى مسار المقطع الحالي. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | يضبط مصفوفة التحويل الحالية. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | يطبق متجه القص المحدد على مصفوفة التحويل الحالية. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | يبدأ المستند . |
| override [ToString](../../aspose.page/device/tostring/)() | إرجاع اسم نوع الجهاز. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | ضرب مصفوفة التحويل الحالية بالمحددةMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | يطبق متجه الترجمة المحدد على مصفوفة التحويل الحالية. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | يقوم بتحديث معلمات الصفحة الحالية. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | يكتب تعليقًا . |

### أنظر أيضا

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* مساحة الاسم [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* المجسم [Aspose.Page](../../)


