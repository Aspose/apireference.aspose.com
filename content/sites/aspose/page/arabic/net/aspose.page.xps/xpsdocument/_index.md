---
title: Class XpsDocument
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsDocument فصل. فئة تتضمن الكيان الرئيسي لمستند XPS الذي يوفر طرق manipulation لأي عنصر XPS .
type: docs
weight: 470
url: /ar/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

فئة تتضمن الكيان الرئيسي لمستند XPS الذي يوفر طرق manipulation لأي عنصر XPS .

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | إنشاء مستند XPS فارغ بحجم الصفحة الافتراضي. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | يفتح مستند XPS موجود موجود في*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | تحميل مستند موجود مخزّن في ملف*stream* كمستند XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | يفتح مستندًا موجودًا موجودًا في*path* كمستند XPS. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | الحصول على رقم المستند النشط . |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | الحصول على رقم الصفحة النشط داخل المستند النشط. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | إرجاع عدد المستندات داخل حزمة XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | إرجاع / تعيين تذكرة طباعة مهمة المستند |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | إرجاع ملف[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) مثال للصفحة النشطة. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | إرجاع عدد الصفحات في المستند النشط. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | إرجاع العدد الإجمالي للصفحات في كافة المستندات داخل مستند XPS. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | إضافة عنصر محتوى (لوحة قماشية أو مسار أو صور رمزية) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | إضافة لوحة قماشية جديدة إلى الصفحة النشطة. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | إضافة مستند فارغ بحجم الصفحة الافتراضي. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | إضافة مستند فارغ بأبعاد الصفحة الأولى *width* و*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | إضافة صور رمزية جديدة إلى الصفحة النشطة. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | إضافة صور رمزية جديدة إلى الصفحة النشطة. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | إضافة إدخال مخطط تفصيلي إلى المستند. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | إضافة صفحة فارغة إلى المستند بحجم الصفحة الافتراضي. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | إضافة صفحة إلى المستند. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | إضافة صفحة فارغة إلى المستند مع تحديد *width* و*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | يضيف مسارًا جديدًا إلى الصفحة النشطة. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | لإنشاء مقطع قوس بيضاوي جديد. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | إنشاء لوحة قماشية جديدة . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | ينشئ لونًا جديدًا . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | ينشئ لونًا جديدًا في فضاء اللون المستند إلى ICC . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | ينشئ لونًا جديدًا في فضاء اللون المستند إلى ICC . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | لإنشاء لون جديد في مساحة ألوان scRGB . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | لإنشاء لون جديد في مساحة ألوان sRGB . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | لإنشاء لون جديد في مساحة ألوان scRGB . |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | لإنشاء لون جديد في مساحة ألوان sRGB . |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | إنشاء مورد خطوط TrueType جديد خارج الدفق. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | إنشاء مورد خطوط TrueType جديد . |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | إنشاء صور رمزية جديدة . |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | إنشاء صور رمزية جديدة . |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | إنشاء نقطة توقف تدرج جديدة . |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | إنشاء نقطة توقف تدرج جديدة . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | إنشاء مورد ملف تعريف ICC جديد من*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | إنشاء مورد ملف تعريف ICC جديد خارج ملف ملف تعريف ICC الموجود في *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | يُنشئ مصدر صورة جديدًا من*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | لإنشاء مورد صورة جديد خارج ملف الصورة الموجود في*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | ينشئ فرشاة صورة جديدة . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | ينشئ فرشاة صورة جديدة . |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | ينشئ فرشاة متدرجة خطية جديدة . |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | ينشئ فرشاة متدرجة خطية جديدة . |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | ينشئ مصفوفة تحويل أفيني جديدة . |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | ينشئ مسارًا جديدًا . |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | ينشئ شكل مسار جديد . |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | ينشئ شكل مسار جديد . |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | لإنشاء هندسة مسار جديد . |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | إنشاء هندسة مسار جديدة بقائمة محددة من أرقام المسار. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | إنشاء هندسة مسار جديدة محددة بشكل مختصر. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | ينشئ مجموعة جديدة من منحنيات بيزير المكعبة . |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | ينشئ رسمًا متعدد الأضلاع جديدًا يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | يقوم بإنشاء مجموعة جديدة من منحنيات بيزير التربيعية من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس ، باستخدام نقاط تحكم محددة. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | ينشئ فرشاة تدرج لوني شعاعي جديدة . |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | ينشئ فرشاة تدرج لوني شعاعي جديدة . |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | لإنشاء فرشاة ألوان صلبة جديدة . |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | لإنشاء فرشاة ألوان صلبة جديدة . |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | لإنشاء فرشاة بصرية جديدة . |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | التخلص من المثيل . |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | إرجاع بطاقة الطباعة للمستند المفهرس بواسطة*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | إرجاع بطاقة الطباعة للصفحة المفهرسة بواسطة*pageIndex* في المستند المفهرس بواسطة*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | إدراج عنصر (لوحة قماشية أو مسار أو صور رمزية) في الصفحة النشطة في*index* الموضع . |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | يتم إدراج لوحة قماشية جديدة في الصفحة النشطة في*index* الموضع . |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | يُدرج مستندًا فارغًا بحجم الصفحة الافتراضي في*index* الموضع . |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | يُدرج مستندًا فارغًا بأبعاد الصفحة الأولى *width* و*height* في*index* الموضع . |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | يتم إدراج صور رمزية جديدة في الصفحة النشطة في*index* الموضع . |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | يتم إدراج صور رمزية جديدة في الصفحة النشطة في*index* الموضع . |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | يُدرج صفحة فارغة في المستند بحجم الصفحة الافتراضي في*index* الموضع . |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | يقوم بإدراج صفحة في المستند في*index* الموضع . |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | إدراج صفحة فارغة في المستند مع تحديد *width* و*height* في*index* الموضع . |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | يُدرج مسارًا جديدًا للصفحة النشطة في*index* الموضع . |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | دمج عدة ملفات XPS في مستند XPS واحد. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | دمج مستندات XPS في PDF باستخدام ملف[`Device`](../../aspose.page/device/) المثال. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | يزيل عنصرًا من الصفحة النشطة. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | يزيل عنصر في*index* الموضع من الصفحة النشطة. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | يزيل مستند في*index* الموضع . |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | يزيل صفحة من المستند. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | يزيل صفحة من المستند في*index* الموضع . |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | يحفظ مستند XPS للدفق . |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | يحفظ مستند XPS في ملف XPS الموجود في*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | يحفظ المستند باستخدام امتداد[`Device`](../../aspose.page/device/) المثال. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | تحديد مستند نشط للتحرير . |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | تحديد صفحة مستند نشطة للتحرير . |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | يربط ملف*printTicket* إلى المستند المفهرس بواسطة*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | يربط ملف*printTicket* إلى الصفحة المفهرسة بواسطة*pageIndex* في المستند المفهرس بواسطة*documentIndex* . |

### أنظر أيضا

* class [Document](../../aspose.page/document/)
* مساحة الاسم [Aspose.Page.XPS](../../aspose.page.xps/)
* المجسم [Aspose.Page](../../)


