---
title: "System::Drawing::Drawing2D::GraphicsPath فئة"
linktitle: "GraphicsPath"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Drawing2D::GraphicsPath فئة. تمثّل مجموعة من الخطوط والمنحنيات المتصلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


يمثل مجموعة من الخطوط والمنحنيات المتصلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | يضيف منحنى بيزيه مكعب المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | يضيف منحنى بيزيه مكعب المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | يضيف منحنى بيزيه مكعب المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | يضيف منحنى بيزيه مكعب المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | يضيف تسلسلًا من منحنيات بيزيه مكعبة متصلة إلى الشكل الحالي. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | يضيف تسلسلًا من منحنيات بيزيه مكعبة متصلة إلى الشكل الحالي. |
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
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | يضيف سلسلة من مقاطع الخط المتصلة المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | يضيف سلسلة من مقاطع الخط المتصلة المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | يضيف المسار المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | يضيف المخطط الخارجي لشكل الفطيرة المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | يضيف المضلع المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | يضيف المضلع المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | يضيف المستطيل المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | يضيف المستطيل المحدد إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | يضيف سلسلة من المستطيلات المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | يضيف سلسلة من المستطيلات المحددة إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | يضيف سلسلة نصية إلى المسار الممثل بواسطة الكائن الحالي. |
| virtual [Clone](./clone/)() | ينشئ نسخة من الكائن الحالي. |
| [CloseAllFigures](./closeallfigures/)() | يغلق جميع الأشكال المفتوحة ويبدأ شكلًا جديدًا. |
| [CloseFigure](./closefigure/)() | يغلق الشكل الحالي ويبدأ شكلًا جديدًا. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي تم الحصول عليها بواسطة الكائن الحالي. |
| [Flatten](./flatten/)() | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. يتم استخدام قيمة التسوية 0.25. |
| [Flatten](./flatten/)(const MatrixPtr\&) | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. يتم استخدام قيمة التسوية 0.25. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | يقوم بتسوية كل منحنى في المسار عن طريق تحويله إلى سلسلة من الخطوط المتصلة. |
| [get_FillMode](./get_fillmode/)() | يرجع وضع التعبئة للكائن الحالي. |
| [get_PathData](./get_pathdata/)() | يرجع كائنًا من نوع [PathData](../pathdata/) يحتوي على النقاط التي تشكل مسارًا ممثلاً بواسطة الكائن الحالي وأنواعها. |
| [get_PathPoints](./get_pathpoints/)() const | يرجع مصفوفة تحتوي على النقاط التي تشكل مسارًا ممثلاً بواسطة الكائن الحالي. |
| [get_PathTypes](./get_pathtypes/)() const | يرجع مصفوفة تحتوي على القيم التي تشير إلى أنواع النقاط التي تشكل مسارًا ممثلاً بواسطة الكائن الحالي. |
| [get_PointCount](./get_pointcount/)() const | يرجع عدد النقاط في المسار الممثل بواسطة الكائن الحالي. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | يرجع كائنًا من نوع [RectangleF](../../system.drawing/rectanglef/) يمثل مستطيلًا يحد المسار الممثل بواسطة الكائن الحالي عندما يتم تحويله بالمصفوفة المحددة. |
| [GetFigureFlags](./getfigureflags/)() | يعيد قيمة هي مجموعة بتية من قيم Detail::FigureType تشير إلى أنواع الأشكال الموجودة داخل المسار الممثل بواسطة الكائن الحالي. |
| [GetLastPoint](./getlastpoint/)() const | يعيد كائن [PointF](../../system.drawing/pointf/) يمثل النقطة الأخيرة في المسار. |
| [GraphicsPath](./graphicspath/)(FillMode) | ينشئ نسخة جديدة من فئة [GraphicsPath](./) مع وضع التعبئة المحدد. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | ينشئ نسخة جديدة من كائن [GraphicsPath](./) يمثل المسار المحدد. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | ينشئ نسخة جديدة من كائن [GraphicsPath](./) يمثل المسار المحدد. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | يشير إلى ما إذا كانت النقطة المحددة موجودة داخل (تحت) حدود هذا [GraphicsPath](./) عند رسمه باستخدام [Pen](../../system.drawing/pen/) المحدد. غير مُنفَّذ. |
| [IsVisible](./isvisible/)(const PointF\&) | يحدد ما إذا كانت النقطة المحددة موجودة داخل المسار المُمثل بواسطة الكائن الحالي. |
| [IsVisible](./isvisible/)(float, float) | يحدد ما إذا كانت النقطة المحددة موجودة داخل المسار المُمثل بواسطة الكائن الحالي. |
| [Reset](./reset/)() | يفرغ المسار بإزالة جميع النقاط منه. |
| [Reverse](./reverse/)() | يعكس ترتيب النقاط في مصفوفة PathPoints لهذا [GraphicsPath](./). |
| [set_FillMode](./set_fillmode/)(FillMode) | يضبط وضع التعبئة للكائن الحالي. |
| [SetMarkers](./setmarkers/)() | غير مُنفَّذ. |
| [StartFigure](./startfigure/)() | يبدأ شكلاً جديداً. |
| [Transform](./transform/)(const MatrixPtr\&) | يحوّل المسار المُمثل بواسطة الكائن الحالي بتطبيق مصفوفة التحويل المحددة عليه. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | يستبدل هذا المسار بحد حول المسار الأصلي. |
| [~GraphicsPath](./~graphicspath/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
