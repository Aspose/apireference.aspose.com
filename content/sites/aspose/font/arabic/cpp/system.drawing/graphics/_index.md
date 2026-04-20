---
title: "System::Drawing::Graphics class"
linktitle: "Graphics"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Graphics class. يمثل سطح رسم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.drawing/graphics/
---
## Graphics class


يمثل سطح رسم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Graphics : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | غير مُنفّذ. |
| [BeginContainer](./begincontainer/)() | يحفظ حاوية بحالة الكائن الحالية، يفتح ويستخدم حاوية جديدة ويعيد الحاوية المحفوظة. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | يحفظ حاوية بحالة الكائن الحالية، يفتح ويستخدم حاوية جديدة ويعيد الحاوية المحفوظة. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | يحفظ حاوية بحالة الكائن الحالية، يفتح ويستخدم حاوية جديدة ويعيد الحاوية المحفوظة. |
| [Clear](./clear/)(Color) | يمسح سطح الرسم الممثل بالكائن الحالي ويملأه باللون المحدد. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | غير مُنفّذ. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | غير مُنفّذ. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | يرسم القوس المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | يرسم القوس المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | يرسم القوس المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | يرسم القوس المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | غير مُنفّذ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | غير مُنفّذ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | غير مُنفّذ. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | يرسم سلسلة من المنحنيات البيزية باستخدام القلم المحدد. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | يرسم سلسلة من المنحنيات البيزية باستخدام القلم المحدد. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | يرسم منحنى مغلق باستخدام القلم المحدد. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | يرسم منحنى مغلق باستخدام القلم المحدد. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | يرسم منحنى باستخدام القلم المحدد. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | يرسم منحنى باستخدام القلم المحدد. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | يرسم منحنى باستخدام القلم المحدد. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | يرسم منحنى باستخدام القلم المحدد. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | يرسم الإهليلج المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | يرسم الإهليلج المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | يرسم الإهليلج المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | يرسم الإهليلج المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | غير مُنفّذ. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | غير مُنفّذ. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | يرسم الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | يرسم الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | يرسم الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | يرسم المنطقة المحددة من الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | يرسم المنطقة المحددة من الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة إلى المستطيل المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | غير مُنفّذ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | يرسم المنطقة المحددة من الصورة المحددة في الموقع المحدد. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | يرسم الصورة المحددة باستخدام حجمها الفيزيائي الأصلي في الموقع المحدد. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | يرسم صورة محددة باستخدام حجمها الفيزيائي الأصلي في موقع محدد. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | يرسم صورة محددة باستخدام حجمها الفيزيائي الأصلي في موقع محدد. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | يرسم صورة محددة باستخدام حجمها الفيزيائي الأصلي في موقع محدد. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | غير مُنفّذ. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | يرسم الخط المحدد باستخدام القلم المحدد. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | يرسم الخط المحدد باستخدام القلم المحدد. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | يرسم الخط المحدد باستخدام القلم المحدد. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | يرسم الخط المحدد باستخدام القلم المحدد. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | يرسم سلسلة من مقاطع الخط باستخدام القلم المحدد. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | يرسم سلسلة من مقاطع الخط باستخدام القلم المحدد. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يرسم المسار المحدد باستخدام القلم المحدد. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | يرسم قطعة الفطيرة المحددة باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | يرسم قطعة الفطيرة المحددة باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | يرسم قطعة الفطيرة المحددة باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | يرسم قطعة الفطيرة المحددة باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | يرسم مضلعًا باستخدام القلم المحدد. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | يرسم مضلعًا باستخدام القلم المحدد. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | يرسم المستطيل المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | يرسم المستطيل المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | يرسم المستطيل المحدد باستخدام القلم المحدد على السطح الممثل بالكائن الحالي. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | يرسم سلسلة من المستطيلات باستخدام القلم المحدد. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | يرسم سلسلة من المستطيلات باستخدام القلم المحدد. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | يرسم السلسلة المحددة داخل المستطيل المحدد باستخدام الخط والفرشاة المحددين. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | يغلق الحاوية الحالية ويستعيد حالة هذا الكائن من حالة الحاوية المحفوظة. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | غير مُنفّذ. |
| [ExcludeClip](./excludeclip/)(Rectangle) | غير مُنفّذ. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | غير مُنفّذ. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | يرسم منحنى مغلق باستخدام الفرشاة المحددة. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | يرسم منحنى مغلق باستخدام الفرشاة المحددة. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | يملأ داخل الإهليلج المحدد بالمستطيل المحيط باستخدام الفرشاة المحددة. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | يملأ داخل الإهليلج المحدد بالمستطيل المحيط باستخدام الفرشاة المحددة. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | يملأ داخل الإهليلج المحدد بالمستطيل المحيط باستخدام الفرشاة المحددة. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | يملأ داخل الإهليلج المحدد بالمستطيل المحيط باستخدام الفرشاة المحددة. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يملأ داخل المسار المحدد باستخدام الفرشاة المحددة. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | يملأ الفطيرة المحددة باستخدام الفرشاة المحددة على السطح الممثل بواسطة الكائن الحالي. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | يملأ الفطيرة المحددة باستخدام الفرشاة المحددة على السطح الممثل بواسطة الكائن الحالي. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | يملأ الفطيرة المحددة باستخدام الفرشاة المحددة على السطح الممثل بواسطة الكائن الحالي. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | يملأ داخل المضلع المحدد باستخدام الفرشاة المحددة. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | يملأ داخل المضلع المحدد باستخدام الفرشاة المحددة. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | يملأ المستطيل المحدد بالفرشاة المحددة. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | يملأ المستطيل المحدد بالفرشاة المحددة. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | يملأ المستطيل المحدد بالفرشاة المحددة. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | يملأ المستطيل المحدد بالفرشاة المحددة. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | يملأ سلسلة من المستطيلات باستخدام الفرشاة المحددة. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | يملأ سلسلة من المستطيلات باستخدام الفرشاة المحددة. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | يملأ داخل المنطقة المحددة باستخدام الفرشاة المحددة. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | يُطلق التنفيذ الفوري لجميع عمليات الرسم المعلقة. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | غير مُنفّذ. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | غير مُنفّذ. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | ينشئ كائنًا جديدًا من نوع [Graphics](./) من الصورة المحددة. |
| [get_Clip](./get_clip/)() | يعيد كائنًا من نوع [Region](../region/) يمثل منطقة تحدّ حدود مساحة الرسم للسطح الممثل بواسطة كائن [Graphics](./) الحالي. |
| [get_ClipBounds](./get_clipbounds/)() const | يعيد مستطيلًا يحدّ منطقة القص للسطح الممثل بواسطة الكائن الحالي. |
| [get_CompositingMode](./get_compositingmode/)() | يعيد قيمة تُظهر كيفية رسم الصور المركبة على السطح الممثل بواسطة الكائن الحالي. |
| [get_CompositingQuality](./get_compositingquality/)() | يعيد قيمة تُظهر مستوى الجودة المستخدم عند تركيب الصور. |
| [get_DpiX](./get_dpix/)() | يعيد الدقة الأفقية. |
| [get_DpiY](./get_dpiy/)() | يعيد الدقة العمودية. |
| [get_InterpolationMode](./get_interpolationmode/)() | يعيد قيمة تُظهر وضع الاستيفاء المرتبط بالكائن الحالي. |
| [get_IsClipEmpty](./get_isclipempty/)() const | غير مُنفّذ. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | غير مُنفّذ. |
| [get_PageScale](./get_pagescale/)() const | يعيد مقياس التحويل بين وحدات العالم ووحدات الصفحة لكائن [Graphics](./) الحالي. |
| [get_PageUnit](./get_pageunit/)() const | يعيد وحدات القياس المستخدمة لإحداثيات الصفحة على السطح الممثل بواسطة الكائن الحالي. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | يعيد قيمة تُظهر كيفية إزاحة البكسلات أثناء التصيير على السطح الممثل بواسطة الكائن الحالي. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | يعيد كائنًا من نوع [Point](../point/) يمثل أصل التصيير لكائن [Graphics](./) الحالي لتقنية التمويه وللفُرش المتشابكة. |
| [get_SmoothingMode](./get_smoothingmode/)() | يعيد قيمة تُظهر وضع التهدئة المستخدم أثناء التصيير على السطح الممثل بواسطة الكائن الحالي. |
| [get_TextContrast](./get_textcontrast/)() const | غير مُنفّذ. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | يعيد قيمة تُظهر جودة تصيير النص. |
| [get_Transform](./get_transform/)() | يعيد التحويل الهندسي للعالم لكائن [Graphics](./) الحالي. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | يعيد كائنًا من نوع [RectangleF](../rectanglef/) يمثل مستطيلًا محيطًا لمنطقة القص المرئية لكائن [Graphics](./) الحالي. |
| [GetHdc](./gethdc/)() | غير مُنفّذ. |
| [GetNearestColor](./getnearestcolor/)(Color) | غير مُنفّذ. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | يحدّث منطقة القص لهذا الكائن إلى تقاطع القص الحالي والقص المحدد. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | يحدّث منطقة القص لهذا الكائن إلى تقاطع القص الحالي والقص المحدد. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | يحدّث منطقة القص لهذا الكائن إلى تقاطع القص الحالي والقص المحدد. |
| [IsVisible](./isvisible/)(Point) | يحدد ما إذا كانت النقطة المحددة موجودة داخل منطقة القص المرئية لكائن [Graphics](./) الحالي. |
| [IsVisible](./isvisible/)(PointF) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(Rectangle) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(RectangleF) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(float, float) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(float, float, float, float) | غير مُنفّذ. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | غير مُنفّذ. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | إرجاع مصفوفة من المناطق، كل منها يحد مواضع الأحرف في السلسلة المحددة. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | إرجاع حجم السلسلة المحددة عند رسمها بالخط المحدد وبالصيغة المحددة. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | إرجاع حجم السلسلة المحددة عند رسمها بالخط المحدد وبالصيغة المحددة. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | غير مُنفّذ. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | إرجاع حجم السلسلة المحددة عند رسمها بالخط المحدد وبالصيغة المحددة. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | يضرب مصفوفة التحويل العالمي لكائن [Graphics](./) الحالي بالمصفوفة المحددة. |
| [ReleaseHdc](./releasehdc/)() | غير مُنفّذ. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | غير مُنفّذ. |
| [ResetClip](./resetclip/)() | يعيد تعيين منطقة القص لهذا الرسم إلى منطقة لا نهائية. |
| [ResetTransform](./resettransform/)() | يعيد تعيين مصفوفة التحويل العالمي للكائن الحالي لتصبح مصفوفة هوية. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | يستعيد حالة هذا الكائن من الحالة المحفوظة. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | يطبق الدوران المحدد على مصفوفة التحويل العالمي لكائن [Graphics](./) الحالي بالترتيب المحدد. |
| [Save](./save/)() | يحفظ الحالة الحالية لهذا الكائن ويعيد الحالة المحفوظة. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | يطبق متجه المقياس المحدد على مصفوفة التحويل العالمي للكائن الحالي. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | يضبط منطقة تحدد مساحة الرسم لسطح الرسم الممثَّل بواسطة الكائن الحالي. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | يضبط قيمة تحدد كيفية رسم الصور المركبة على السطح الممثَّل بواسطة الكائن الحالي. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | يضبط قيمة تحدد مستوى الجودة المستخدم عند تركيب الصور. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | يضبط قيمة تشير إلى وضع الاستيفاء المرتبط بالكائن الحالي. |
| [set_PageScale](./set_pagescale/)(float) | يضبط التحجيم بين وحدات العالم ووحدات الصفحة لكائن [Graphics](./) الحالي. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | يضبط وحدات القياس المستخدمة لإحداثيات الصفحة على السطح الممثَّل بواسطة الكائن الحالي. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | يضبط قيمة تحدد كيفية إزاحة البكسلات أثناء التصيير على السطح الممثَّل بواسطة الكائن الحالي. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | يضبط كائن [Point](../point/) يحدد أصل التصيير لكائن [Graphics](./) الحالي للتنقيط وللفُرَش المتشابكة. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | يضبط قيمة تحدد وضع التنعيم المستخدم أثناء التصيير على السطح الممثَّل بواسطة الكائن الحالي. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | غير مُنفّذ. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | يضبط قيمة تحدد جودة تصيير النص. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | يضبط التحويل الهندسي العالمي لكائن [Graphics](./) الحالي. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | يضبط منطقة القص لسطح الرسم الممثَّل بواسطة كائن [Graphics](./) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | يضبط منطقة القص لسطح الرسم الممثَّل بواسطة كائن [Graphics](./) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | يضبط منطقة القص لسطح الرسم الممثَّل بواسطة كائن [Graphics](./) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | غير مُنفّذ. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | يضبط منطقة القص لسطح الرسم الممثَّل بواسطة كائن [Graphics](./) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة بواسطة مسار رسومي. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | غير مُنفّذ. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | غير مُنفّذ. |
| [TranslateClip](./translateclip/)(int, int) | غير مُنفّذ. |
| [TranslateClip](./translateclip/)(float, float) | غير مُنفّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | يطبق متجه الإزاحة المحدد على مصفوفة التحويل العالمي لكائن [Graphics](./) الحالي. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | نوع كائن دالة رد الاتصال المستخدم كمعامل لطريقة DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | نوع كائن دالة رد الاتصال المستخدم كمعامل لطريقة EnumerateMetafile. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
