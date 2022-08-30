---
title: PdfDevice
second_title: Aspose.Page لمرجع NET API
description: فئة جهاز تكوين الصورة.
type: docs
weight: 340
url: /ar/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

فئة جهاز تكوين الصورة.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | إنشاء مثيل جديد . |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | إنشاء مثيل جديد بحجم وسائط محدد. |

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | يحصل / يحدد لون الخلفية. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | إرجاع أو تحديد تحويل الأحرف الحالية. |
| [Creator](../../aspose.page/device/creator) { get; set; } | إرجاع أو تحديد منشئ إخراج الجهاز الناتج. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | إرجاع الرقم المطلق للصفحة الحالية مع طباعة المستند. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | إرجاع رقم الصفحة الحالية ضمن الجزء الحالي. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | يحصل / يحدد الخط الحالي. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر ، أي RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | يشير إلى ما إذا كان مثيل مكتبة Aspose.Page هذا مرخصًا. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | يحصل / يحدد التعتيم . |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | يحصل / يحدد الفرشاة لقناع العتامة. يتم تطبيق القناع على Paint أو Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | الحصول على / تعيين الفرشاة لملء المسارات . |
| [Properties](../../aspose.page/device/properties) { get; set; } | خصائص الجهاز بما في ذلك البيانات الوصفية. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | يقوم بتهيئة خيارات الحفظ . |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | يحصل / يحدد حجم وسائط الجهاز. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | الحصول على / تعيين حد رسم المسارات. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | إرجاع أو تحديد وضع عرض النص الحالي. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | إرجاع أو تحديد عرض ضغط النص الحالي. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | إضافة عنصر مخطط مع آخر كائن كهدف له. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | إضافة عنصر مخطط مع نقطة الأصل كهدف له. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | يكمل الصفحة . |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | تم الانتهاء من قسم المستند . |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | ينشئ مثيلًا جديدًا للجهاز بناءً على مثيل الجهاز هذا . يكتب حالة رسومات الجهاز هذه ، أي يُنشئApsCanvas مثيل (مثيلات) مع خصائص RenderTransform و Clip المقابلة. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | التخلص من مثيل هذا الجهاز. إنهاء حالة رسومات مثيل الجهاز هذه ، أي مفاتيح تبديل APS التي تُنشئ سياق إلى ملفApsCanvas من المستوى الأعلى ثم حالة رسومات هذا الجهازApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | يرسم المسار المحدد . |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | يرسم قوسًا . |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | يرسم صورة ذات تحويل وخلفية معينين . |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | يرسم مقطعًا مستقيماً . |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | رسم شكل بيضاوي . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | رسم poligone . |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | رسم مضلع . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | رسم شكل متعدد الخطوط . |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | رسم مستطيل . |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | يرسم مستطيلاً مستديرًا . |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | يرسم سلسلة في الموضع المحدد . |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | يكمل المستند . |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | يملأ المسار المحدد . |
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
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | إرجاع مصفوفة التحويل الحالية. |
| virtual [InitClip](../../aspose.page/device/initclip)() | تهيئة مقطع الجهاز. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | يقوم بتهيئة عدد الصفحات لإخراجها. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | الحصول على قيمة الخاصية المنطقية . |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | يبدأ صفحة جديدة بالعنوان المحدد. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | يبدأ صفحة جديدة بالعرض والارتفاع المحددين. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | يبدأ قسم مستند جديد. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | يضبط الأجهزة على الحالة الأولية . |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | يعيد ضبط الجهاز. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | يطبق دوران في اتجاه عقارب الساعة حول الأصل لمصفوفة التحويل الحالية. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | قم بتدوير مصفوفة التحويل الحالية حول نقطة. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | يطبق متجه المقياس المحدد على مصفوفة التحويل الحالية. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | يضيف المسار المحدد إلى مسار المقطع الحالي. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | يعين الارتباط التشعبي برقم صفحة كهدف له. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | تعيين الارتباط التشعبي باستخدام URI خارجي كهدف له. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | يضبط مصفوفة التحويل الحالية. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | يطبق متجه القص المحدد على مصفوفة التحويل الحالية. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | يبدأ المستند . |
| override [ToString](../../aspose.page/device/tostring)() | إرجاع اسم نوع الجهاز. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | ضرب مصفوفة التحويل الحالية بالمحددةMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | يطبق متجه الترجمة المحدد على مصفوفة التحويل الحالية. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | يقوم بتحديث معلمات الصفحة الحالية. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | يكتب تعليقًا . |

### أنظر أيضا

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* مساحة الاسم [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* المجسم [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
