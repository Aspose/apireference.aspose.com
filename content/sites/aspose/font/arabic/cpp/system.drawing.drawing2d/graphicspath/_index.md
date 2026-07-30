---
title: "System::Drawing::Drawing2D::GraphicsPath فئة"
linktitle: "GraphicsPath"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Drawing2D::GraphicsPath فئة. تمثّل مجموعة من الخطوط والمنحنيات المتصلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


تمثّل مجموعة من الخطوط والمنحنيات المتصلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class GraphicsPath : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | يضيف القوس الإهليلجي المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | يضيف القوس الإهليلجي المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | يضيف القوس الإهليلجي المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | يضيف القوس الإهليلجي المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | يضيف المنحنى المكعب Bezier المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | يضيف المنحنى المكعب Bezier المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | يضيف المنحنى المكعب Bezier المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | يضيف المنحنى المكعب Bezier المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | يضيف تسلسلًا من المنحنيات المكعبة Bezier المتصلة إلى الشكل الحالي. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | يضيف تسلسلًا من المنحنيات المكعبة Bezier المتصلة إلى الشكل الحالي. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | يضيف المنحنى المغلق المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | يضيف المنحنى المغلق المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | يضيف المنحنى المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | يضيف المنحنى المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | يضيف المنحنى المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | يضيف المنحنى المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddEllipse](./addellipse/)(float, float, float, float) | يضيف القطع الناقص المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddEllipse](./addellipse/)(int, int, int, int) | يضيف القطع الناقص المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | يضيف القطع الناقص المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | يضيف القطع الناقص المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLine](./addline/)(const Point\&, const Point\&) | يضيف الخط المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | يضيف الخط المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLine](./addline/)(int, int, int, int) | يضيف الخط المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLine](./addline/)(float, float, float, float) | يضيف الخط المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | يضيف سلسلة القطع الخطية المتصلة المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | يضيف سلسلة القطع الخطية المتصلة المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | يضيف المسار المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | يضيف المضلع المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | يضيف المضلع المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | يضيف المستطيل المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | يضيف المستطيل المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | يضيف سلسلة المستطيلات المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | يضيف سلسلة المستطيلات المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| virtual [Clone](./clone/)() | ينشئ نسخة من الكائن الحالي. |
| [CloseAllFigures](./closeallfigures/)() | يغلق جميع الأشكال المفتوحة ويبدأ شكلًا جديدًا. |
| [CloseFigure](./closefigure/)() | يغلق الشكل الحالي ويبدأ شكلًا جديدًا. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [Flatten](./flatten/)() | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. يتم استخدام قيمة التسوية 0.25. |
| [Flatten](./flatten/)(const MatrixPtr\&) | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. يتم استخدام قيمة التسوية 0.25. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. |
| [get_FillMode](./get_fillmode/)() | يعيد وضع التعبئة للكائن الحالي. |
| [get_PathData](./get_pathdata/)() | يعيد كائن [PathData](../pathdata/) يحتوي على النقاط التي تُكوّن مسارًا ممثلاً بواسطة الكائن الحالي وأنواعها. |
| [get_PathPoints](./get_pathpoints/)() const | يعيد مصفوفة تحتوي على النقاط التي تُكوّن مسارًا ممثلاً بواسطة الكائن الحالي. |
| [get_PathTypes](./get_pathtypes/)() const | يعيد مصفوفة تحتوي على قيم تشير إلى أنواع النقاط التي تشكل مسارًا تمثله الكائن الحالي. |
| [get_PointCount](./get_pointcount/)() const | يعيد عدد النقاط في المسار الذي تمثله الكائن الحالي. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | يعيد كائن [RectangleF](../../system.drawing/rectanglef/) يمثل مستطيلًا يحدّ المسار الذي تمثله الكائن الحالي عندما يتم تحويله بالمصفوفة المحددة. |
| [GetFigureFlags](./getfigureflags/)() | يعيد قيمة هي مزيج بتّي من قيم Detail::FigureType تشير إلى أنواع الأشكال الموجودة داخل المسار الذي تمثله الكائن الحالي. |
| [GetLastPoint](./getlastpoint/)() const | يعيد كائن [PointF](../../system.drawing/pointf/) يمثل النقطة الأخيرة في المسار. |
| [GraphicsPath](./graphicspath/)(FillMode) | ينشئ نسخة جديدة من فئة [GraphicsPath](./) مع وضع التعبئة المحدد. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | ينشئ نسخة جديدة من كائن [GraphicsPath](./) يمثل المسار المحدد. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | ينشئ نسخة جديدة من كائن [GraphicsPath](./) يمثل المسار المحدد. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | يشير إلى ما إذا كانت النقطة المحددة موجودة داخل (تحت) مخطط هذا [GraphicsPath](./) عند رسمه بالقلم المحدد [Pen](../../system.drawing/pen/). غير مُنفَّذ. |
| [IsVisible](./isvisible/)(const PointF\&) | يحدد ما إذا كانت النقطة المحددة موجودة داخل المسار الذي تمثله الكائن الحالي. |
| [IsVisible](./isvisible/)(float, float) | يحدد ما إذا كانت النقطة المحددة موجودة داخل المسار الذي تمثله الكائن الحالي. |
| [Reset](./reset/)() | يفرغ المسار بإزالة جميع النقاط منه. |
| [Reverse](./reverse/)() | يعكس ترتيب النقاط في مصفوفة PathPoints لهذا [GraphicsPath](./). |
| [set_FillMode](./set_fillmode/)(FillMode) | يضبط وضع التعبئة للكائن الحالي. |
| [SetMarkers](./setmarkers/)() | غير مُنفّذ. |
| [StartFigure](./startfigure/)() | يبدأ شكلًا جديدًا. |
| [Transform](./transform/)(const MatrixPtr\&) | يحوّل المسار الذي تمثله الكائن الحالي بتطبيق مصفوفة التحويل المحددة عليه. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | يستبدل هذا المسار بخط محيط حول المسار الأصلي. |
| [~GraphicsPath](./~graphicspath/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
