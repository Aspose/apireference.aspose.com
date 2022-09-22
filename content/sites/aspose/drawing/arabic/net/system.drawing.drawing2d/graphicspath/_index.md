---
title: GraphicsPath
second_title: Aspose.Drawing لمرجع NET API
description: يمثل سلسلة من الخطوط والمنحنيات المتصلة.
type: docs
weight: 260
url: /ar/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

يمثل سلسلة من الخطوط والمنحنيات المتصلة.

```csharp
public class GraphicsPath : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | تهيئة مثيل جديد لفئة GraphicsPath بقيمة FillMode من Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPath`](../graphicspath)فئة مع المحدد FillMode التعداد . |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPath`](../graphicspath) فئة مع المحدد[`PathPointType`](../pathpointtype) وPointF المصفوفات . |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPath`](../graphicspath) فئة مع المحدد[`PathPointType`](../pathpointtype) وPoint المصفوفات . |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPath`](../graphicspath) فئة مع المحددPathPointType وPointF المصفوفات ومع المحددFillMode عنصر التعداد .. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | يقوم بتهيئة مثيل جديد لملف[`GraphicsPath`](../graphicspath) فئة مع المحددPathPointType وPoint المصفوفات ومع المحددFillMode عنصر التعداد .. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | الحصول على أو تعيين تعداد FillMode الذي يحدد كيفية تعبئة الأجزاء الداخلية من الأشكال في مسار الرسومات هذا. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | يحصل على أPathData التي تغلف مصفوفات من النقاط والأنواع لهذا الغرضGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | يحصل على النقاط الموجودة في المسار . |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | يحصل على أنواع النقاط المقابلة في ملفPathPoints مجموعة . |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | يحصل على عدد العناصر في ملفPathPoints أو الPathTypes مجموعة . |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | يلحق قوسًا بيضاويًا بالشكل الحالي. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | يلحق قوسًا بيضاويًا بالشكل الحالي. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | يضيف منحنى بيزير مكعبًا إلى الشكل الحالي. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | يضيف منحنى بيزير مكعبًا إلى الشكل الحالي. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | يضيف سلسلة من منحنيات بيزير المكعبة المتصلة إلى الشكل الحالي. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | يضيف سلسلة من منحنيات بيزير المكعبة المتصلة إلى الشكل الحالي. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | يضيف منحنى مغلق لهذا المسار. يتم استخدام منحنى العمود الفقري الأساسي لأن المنحنى ينتقل عبر كل نقطة في المصفوفة. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | يضيف منحنى مغلقًا إلى هذا المسار . يتم استخدام منحنى العمود الفقري الأساسي لأن المنحنى ينتقل عبر كل نقطة في المصفوفة. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | يضيف منحنى خدد إلى الشكل الحالي. يتم استخدام منحنى العمود الفقري الأساسي لأن المنحنى ينتقل عبر كل نقطة في المصفوفة. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | يضيف منحنى خدد إلى الشكل الحالي. يتم استخدام منحنى العمود الفقري الأساسي لأن المنحنى ينتقل عبر كل نقطة في المصفوفة. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | يضيف منحنى خدد إلى الشكل الحالي. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | يضيف منحنى خدد إلى الشكل الحالي. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | يضيف قطع ناقص إلى المسار الحالي. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | يضيف قطع ناقص إلى المسار الحالي. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | لإلحاق مقطع خط بمسار الرسومات هذا. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | لإلحاق مقطع خط بمسار الرسومات هذا. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | لإلحاق سلسلة من مقاطع الخطوط المتصلة بنهاية ذلكGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | لإلحاق سلسلة من مقاطع الخطوط المتصلة بنهاية ذلكGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | إلحاق مسار الرسومات المحدد بهذا المسار. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | يضيف المخطط التفصيلي لشكل دائري إلى هذا المسار. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | يضيف المخطط التفصيلي لشكل دائري إلى هذا المسار. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | يضيف مضلعًا إلى هذا المسار . |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | يضيف مضلعًا إلى هذا المسار . |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | يضيف مستطيلاً إلى هذا المسار . |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | يضيف مستطيلاً إلى هذا المسار . |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | إضافة سلسلة من المستطيلات إلى هذا المسار. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | إضافة سلسلة من المستطيلات إلى هذا المسار. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | يضيف سلسلة نصية إلى هذا المسار . |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | يضيف سلسلة نصية إلى هذا المسار . |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | يضيف سلسلة نصية إلى هذا المسار . |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | يضيف سلسلة نصية إلى هذا المسار . |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | عمل نسخة من كائن المسار الحالي. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | يغلق كل الأشكال المفتوحة في هذا المسار ويبدأ شكلًا جديدًا. يغلق كل شكل مفتوح عن طريق توصيل خط من نقطة النهاية الخاصة به إلى نقطة البداية. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | لإغلاق الشكل الحالي وبدء شكل جديد. إذا كان الشكل الحالي يحتوي على سلسلة من الخطوط والمنحنيات المتصلة ، فإن الطريقة تغلق الحلقة بربط خط من نقطة النهاية إلى نقطة البداية. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | يقوم بإصدار كافة الموارد المستخدمة بواسطة مسار الرسومات هذا. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | يحول كل منحنى في هذا المسار إلى سلسلة من مقاطع الخط المتصلة. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | إرجاع مستطيل يحد هذاGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | إرجاع مستطيل يحد هذاGraphicsPath عندما يكون هذا المسار هو يتحول بواسطة المحددMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | إرجاع مستطيل يحد هذاGraphicsPath عندما يكون المسار الحالي هو يتحول بواسطة المحددMatrix ورسمت مع المحددPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | يحصل على النقطة الأخيرة في صفيف PathPoints لهذا[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | يشير إلى ما إذا كانت النقطة المحددة متضمنة (أسفل) المخطط التفصيلي لهذاGraphicsPath عند رسمها مع المحددPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | يشير إلى ما إذا كانت النقطة المحددة متضمنة في هذاGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | يفرغ ملف[`PathPoints`](./pathpoints) و[`PathTypes`](./pathtypes)arrays ويقوم بتعيين ملف[`FillMode`](../fillmode) إلىAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | يعكس ترتيب النقاط في ملف[`PathPoints`](./pathpoints) مجموعة من هذا[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | يحدد علامة على هذا[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | يبدأ رقمًا جديدًا دون إغلاق الرقم الحالي. تتم إضافة جميع النقاط اللاحقة المضافة إلى المسار إلى هذا الشكل الجديد. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | يقوم بتطبيق مصفوفة تحويل على مسار الرسومات هذا. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | يطبق تحويل الالتواء ، المحدد بواسطة مستطيل ومتوازي أضلاع ، على هذا[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | يطبق تحويل الالتواء ، المحدد بواسطة مستطيل ومتوازي أضلاع ، على هذا[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | يطبق تحويل الالتواء ، المحدد بواسطة مستطيل ومتوازي أضلاع ، على هذا[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | يطبق تحويل الالتواء ، المحدد بواسطة مستطيل ومتوازي أضلاع ، على هذا[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | يضيف مخططًا تفصيليًا إضافيًا إلى المسار . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | يستبدل هذاGraphicsPath بمنحنيات تحيط بالمساحة المملوءة عندما يتم رسم هذا المسار بواسطة القلم المحدد. |

### أنظر أيضا

* مساحة الاسم [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
