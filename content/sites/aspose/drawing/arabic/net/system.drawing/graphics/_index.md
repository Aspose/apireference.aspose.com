---
title: Graphics
second_title: Aspose.Drawing لمرجع NET API
description: يغلف سطح الرسم .
type: docs
weight: 530
url: /ar/net/system.drawing/graphics/
---
## Graphics class

يغلف سطح الرسم .

```csharp
public class Graphics : IDisposable
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | يحصل أو يحدد أRegion الذي يحد من منطقة الرسم لهذاGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | يحصل على أ[`RectangleF`](../rectanglef) الهيكل الذي يحد منطقة القطع من هذا[`Graphics`](../graphics) . |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | الحصول على أو تعيين قيمة تحدد كيفية رسم الصور المركبة لهذاGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | الحصول على أو تعيين جودة عرض الصور المركبة المرسومة لهذا الغرضGraphics . |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | يحصل على الدقة الأفقية لهذاGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | يحصل على الدقة الرأسية لهذاGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | الحصول على أو تعيين وضع الاستيفاء المرتبط بهذه الرسومات. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | يحصل على قيمة تشير إلى ما إذا كانت منطقة القطع من هذاGraphics فارغ . |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | يحصل على قيمة تشير إلى ما إذا كانت منطقة القطع المرئية من هذاGraphics فارغ . |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | الحصول على أو تعيين القياس بين وحدات العالم ووحدات الصفحة لهذا الغرضGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | الحصول على أو تعيين وحدة القياس المستخدمة لإحداثيات الصفحة في هذاGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | الحصول على أو تعيين قيمة تحدد كيفية إزاحة وحدات البكسل أثناء عرض هذاGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | الحصول على أو تحديد أصل العرض لهذاGraphics للترددات ولفرشاة الفتحات. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | الحصول على جودة العرض لهذه الرسومات أو تعيينها. |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | الحصول على أو تعيين قيمة تصحيح جاما لعرض النص. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | الحصول على أو تحديد وضع العرض للنص المرتبط بهذاGraphics . |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | الحصول على أو تعيين نسخة من تحويل العالم الهندسي لهذا الغرضGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | يحصل على المستطيل المحيط لمنطقة القطع المرئية لهذاGraphics . |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | ينشئ ملفًا جديدًاGraphics من المقبض المحدد إلى النافذة. |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | لإنشاء رسومات جديدة من الصورة المحددة. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | يضيف تعليقًا للتيارMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | يحفظ حاوية رسومات بالحالة الحالية لهذاGraphics ويفتح حاوية رسومات جديدة ويستخدمها. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | يحفظ حاوية رسومات بالحالة الحالية لهذاGraphics ويفتح ويستخدم حاوية رسومات جديدة مع تحويل المقياس المحدد. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | يحفظ حاوية رسومات بالحالة الحالية لهذاGraphics ويفتح ويستخدم حاوية رسومات جديدة مع تحويل المقياس المحدد. |
| [Clear](../../system.drawing/graphics/clear)(Color) | يمسح سطح الرسم بالكامل ويملأه بلون الخلفية المحدد. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | يقوم بنقل كتلة بت لبيانات اللون ، المقابلة لمستطيل من وحدات البكسل ، من الشاشة إلى سطح رسمGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | يقوم بنقل كتلة بت لبيانات اللون ، المقابلة لمستطيل من وحدات البكسل ، من الشاشة إلى سطح رسمGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | يقوم بنقل كتلة بت لبيانات اللون ، المقابلة لمستطيل من وحدات البكسل ، من الشاشة إلى سطح رسمGraphics . |
| [Dispose](../../system.drawing/graphics/dispose)() | يقوم بإصدار كافة الموارد المستخدمة بواسطة هذه الرسومات . |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | يرسم قوسًا يمثل جزءًا من القطع الناقص المحدد بواسطة بنية RectangleF. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | يرسم قوسًا يمثل جزءًا من القطع الناقص المحدد بواسطة زوج من الإحداثيات والعرض والارتفاع. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | يرسم شريحة بيزير محددة بأربعة هياكل PointF . |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | يرسم شريحة بيزير محددة بأربعة أزواج مرتبة من الإحداثيات التي تمثل النقاط. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | رسم سلسلة من شرائح بيزيير من مصفوفةPoint الهياكل . |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | رسم سلسلة من شرائح بيزيير من مصفوفةPointF الهياكل . |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | يرسم شريحة أساسية مغلقة محددة بمجموعة منPointF الهياكل . |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | يرسم شريحة أساسية مغلقة محددة بمجموعة منPoint الهياكل . |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | يرسم خطًا رئيسيًا مغلقًا محددًا بمجموعة من هياكل PointF باستخدام شد محدد. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | يرسم شريحة أساسية مغلقة محددة بمجموعة منPoint الهياكل باستخدام التوتر المحدد. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPointF الهياكل . |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPoint الهياكل . |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPointF الهياكل باستخدام التوتر المحدد. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPoint الهياكل باستخدام التوتر المحدد. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPointF الهياكل التي تستخدم توترًا محددًا. يبدأ الرسم في الإزاحة من بداية المصفوفة. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPointF الهياكل التي تستخدم توترًا محددًا. يبدأ الرسم في الإزاحة من بداية المصفوفة. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | يرسم العمود الفقري الأساسي من خلال مصفوفة محددة منPoint الهياكل التي تستخدم توترًا محددًا. يبدأ الرسم في الإزاحة من بداية المصفوفة. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | رسم قطع ناقص معرّف بمستطيل إحاطة F. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | رسم شكل بيضاوي محدد بواسطة مستطيل محيط محدد بواسطة زوج من الإحداثيات وارتفاع وعرض . |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | يرسم الصورة التي يمثلها المحددIcon داخل المنطقة المحددة من قبل أRectangle هيكل . |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | يرسم الصورة التي يمثلها المحددIcon في الإحداثيات المحددة. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | يرسم الصورة التي يمثلها المحددIcon بدون تحجيم الصورة. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | رسم الصورة المحددة باستخدام حجمها المادي الأصلي في الموقع المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | رسم ملفImage ، باستخدام حجمه الفعلي الأصلي ، في الموقع المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | رسم ملفImage في الموقع المحدد وبالشكل والحجم المحددين. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | رسم ملفЕ:Image في الموقع المحدد وبالشكل والحجم المحددين. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | رسم الصورة المحددة في المكان المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | رسم الصورة المحددة في المكان المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | رسم ملفImage ، باستخدام حجمه الفعلي الأصلي ، في الموقع المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | يرسم الصورة المحددة ، باستخدام حجمها المادي الأصلي ، في الموقع المحدد بواسطة زوج إحداثيات . |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | رسم الجزء المحدد من الصورة المحددة في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | رسم الجزء المحدد منImage في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | رسم الجزء المحدد من الصورة المحددة في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | رسم الجزء المحدد من الصورة المحددة في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | رسم ملفImage ، باستخدام حجمه الفعلي الأصلي ، في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | رسم جزء من الصورة في مكان محدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | رسم الصورة المحددة في المكان المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | رسم جزء من الصورة في مكان محدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | رسم الجزء المحدد من الصورة المحددة في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | رسم الجزء المحدد منImage في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | رسم الجزء المحدد منImage في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | رسم الجزء المحدد منImage في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | رسم الجزء المحدد منImage في الموقع المحدد وبالحجم المحدد. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | رسم الجزء المحدد من الصورة المحددة في الموقع المحدد وبالحجم المحدد. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | رسم صورة محددة باستخدام حجمها الفعلي الأصلي في مكان محدد. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | رسم صورة محددة باستخدام حجمها الفعلي الأصلي في مكان محدد. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | يرسم الصورة المحددة باستخدام حجمها المادي الأصلي في الموقع المحدد بواسطة زوج إحداثيات . |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | يرسم الصورة المحددة باستخدام حجمها المادي الأصلي في الموقع المحدد بواسطة زوج إحداثيات . |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | يرسم الصورة المحددة دون تغيير الحجم ويقطعها ، إذا لزم الأمر ، لتلائم المستطيل المحدد. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | يرسم خطًا يربط بين اثنينPoint الهياكل . |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | يرسم خطًا يربط بنيتين من طراز PointF . |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | يرسم خطًا يربط بين النقطتين المحددتين بواسطة أزواج الإحداثيات. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | يرسم خطًا يربط بين النقطتين المحددتين بواسطة أزواج الإحداثيات. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | يرسم سلسلة من مقاطع الخطوط التي تربط صفيفًا من ملفاتPointF الهياكل . |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | يرسم سلسلة من مقاطع الخطوط التي تربط صفيفًا من ملفاتPoint الهياكل . |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | يرسم مسار رسومات . |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | يرسم شكل دائري محدد بواسطة شكل بيضاوي محدد ببنية RectangleF وخطين نصف قطريين. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | يرسم شكل دائري محدد بواسطة شكل بيضاوي محدد بواسطة زوج إحداثيات ، وعرض ، وارتفاع ، وخطين نصف قطريين. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | يرسم مضلعًا محددًا بمصفوفة من هياكل PointF . |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | يرسم مضلعًا محددًا بمصفوفة منPoint الهياكل . |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | رسم مستطيل محدد ببنية مستطيل. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | رسم مستطيل محدد بواسطة زوج إحداثيات وعرض وارتفاع. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | رسم مستطيل محدد بواسطة زوج إحداثيات وعرض وارتفاع. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | يرسم سلسلة من المستطيلات المحددة بواسطةRectangleF الهياكل . |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | يرسم سلسلة من المستطيلات المحددة بواسطةRectangle الهياكل . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | رسم السلسلة النصية المحددة بالموقع المحددBrush وFont الكائنات . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | رسم السلسلة النصية المحددة في المستطيل المحدد بالقيمة المحددةBrush وFont كائنات باستخدام سمات التنسيق المحددةStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | رسم السلسلة النصية المحددة بالموقع المحددBrush وFont الكائنات . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | رسم السلسلة النصية المحددة بالموقع المحددBrush و Font كائنات باستخدام سمات التنسيق المحددةStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | رسم السلسلة النصية المحددة في المستطيل المحدد بالقيمة المحددةBrush وFont كائنات باستخدام سمات التنسيق المحددةStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | رسم السلسلة النصية المحددة بالموقع المحددBrush و Font كائنات باستخدام سمات التنسيق المحددةStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | لإغلاق حاوية الرسومات الحالية واستعادة حالة ذلكGraphics إلى الحالة المحفوظة بواسطة مكالمة إلىBeginContainer طريقة . |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | يرسل السجلات في مستطيل محدد من S.[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في الملف المحدد[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل سجلات[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | يحدّث منطقة المقطع لهذاGraphics لاستبعاد المنطقة المحددة بواسطةRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | يحدّث منطقة المقطع لهذاGraphics لاستبعاد المنطقة المحددة بواسطةRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | يملأ الجزء الداخلي لمنحنى العمود الفقري الأساسي المحدد بواسطة مصفوفة منPointF الهياكل . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | يملأ الجزء الداخلي لمنحنى العمود الفقري الأساسي المحدد بواسطة مصفوفة منPoint الهياكل . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | يملأ الجزء الداخلي لمنحنى العمود الفقري الأساسي المحدد بواسطة مصفوفة منPointF الهياكل باستخدام وضع التعبئة المحدد. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | يملأ الجزء الداخلي لمنحنى العمود الفقري الأساسي المحدد بواسطة مصفوفة منPoint الهياكل باستخدام وضع التعبئة المحدد. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | يملأ الجزء الداخلي لمنحنى العمود الفقري المغلق المحدد بواسطة مجموعة من هياكل PointF باستخدام وضع التعبئة والشد المحدد. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | يملأ الجزء الداخلي لمنحنى العمود الفقري الأساسي المحدد بواسطة مصفوفة منPoint الهياكل باستخدام وضع التعبئة المحدد. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | يملأ الجزء الداخلي من القطع الناقص المحدد بواسطة مستطيل محيط محدد بواسطة بنية RectangleF . |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | يملأ الجزء الداخلي من القطع الناقص المحدد بواسطة مستطيل محيط محدد بواسطة زوج من الإحداثيات والعرض والارتفاع. |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | يملأ الجزء الداخلي لمسار الرسومات . |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | يملأ الجزء الداخلي لقسم دائري محدد بواسطة شكل بيضاوي محدد ببنية مستطيل وخطين نصف قطريين. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | يملأ الجزء الداخلي لقسم دائري محدد بواسطة شكل بيضاوي محدد بواسطة زوج من الإحداثيات والعرض والارتفاع وخطين نصف قطريين. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | يملأ الجزء الداخلي لقسم دائري محدد بواسطة شكل بيضاوي محدد بواسطة زوج من الإحداثيات والعرض والارتفاع وخطين نصف قطريين. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | يملأ الجزء الداخلي من المضلع المحدد بواسطة مصفوفة من النقاط المحددة بواسطةPointF الهياكل . |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | يملأ الجزء الداخلي من المضلع المحدد بواسطة مصفوفة من النقاط المحددة بواسطةPoint الهياكل . |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | يملأ الجزء الداخلي من المضلع المحدد بواسطة مجموعة من النقاط المحددة بواسطة هياكل PointF باستخدام وضع التعبئة المحدد. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | يملأ الجزء الداخلي من المضلع المحدد بواسطة مصفوفة من النقاط المحددة بواسطةPoint الهياكل باستخدام وضع التعبئة المحدد. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | يملأ الجزء الداخلي من المستطيل المحدد بواسطة بنية RectangleF . |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | يملأ الجزء الداخلي من المستطيل المحدد بواسطة زوج من الإحداثيات والعرض والارتفاع . |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | يملأ الأجزاء الداخلية لسلسلة من المستطيلات المحددة بواسطةRectangleF الهياكل . |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | يملأ الأجزاء الداخلية لسلسلة من المستطيلات المحددة بواسطةRectangle الهياكل . |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | يملأ الجزء الداخلي للمنطقة . |
| [Flush](../../system.drawing/graphics/flush#flush)() | يفرض تنفيذ جميع عمليات الرسومات المعلقة ويعود على الفور دون انتظار انتهاء العمليات. |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | يفرض تنفيذ جميع عمليات الرسومات المعلقة بطريقة الانتظار أو عدم الانتظار ، كما هو محدد ، للعودة قبل انتهاء العمليات. |
| [GetHdc](../../system.drawing/graphics/gethdc)() | يحصل على المؤشر لسياق الجهاز المرتبط بهذاGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | يحصل على أقرب لون إلى اللون المحددColor هيكل . |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | يحدّث منطقة المقطع لهذاGraphics إلى تقاطع منطقة المقطع الحالية والمحددةRectangle هيكل . |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | يحدّث منطقة المقطع لهذاGraphics إلى تقاطع منطقة المقطع الحالية والمحددةRectangleF هيكل . |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | يحدّث منطقة المقطع لهذاGraphics إلى تقاطع منطقة المقطع الحالية والمحددةRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | يشير إلى ما إذا كان الملفPoint يتم احتواء الهيكل داخل منطقة المقطع المرئي من هذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | يشير إلى ما إذا كان الملفPointF يتم احتواء الهيكل داخل منطقة المقطع المرئي من هذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | يشير إلى ما إذا كان المستطيل المحدد بواسطة ملفRectangle يتم احتواء الهيكل داخل منطقة المقطع المرئي من هذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | يشير إلى ما إذا كان المستطيل المحدد بواسطة ملفRectangleF يتم احتواء الهيكل داخل منطقة المقطع المرئي من هذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | يشير إلى ما إذا كانت النقطة المحددة بواسطة زوج من الإحداثيات مضمنة في منطقة المقطع المرئية لهذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | يشير إلى ما إذا كانت النقطة المحددة بواسطة زوج من الإحداثيات مضمنة في منطقة المقطع المرئية لهذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | يشير إلى ما إذا كان المستطيل المحدد بواسطة زوج من الإحداثيات والعرض والارتفاع متضمن في منطقة المقطع المرئي من هذاGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | يشير إلى ما إذا كان المستطيل المحدد بواسطة زوج من الإحداثيات والعرض والارتفاع متضمن في منطقة المقطع المرئي من هذاGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | يحصل على مجموعة منRegion كائنات ، كل منها يحد نطاقًا من مواضع الأحرف داخل السلسلة المحددة. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | يضاعف التحول العالمي لهذاGraphics وحددMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | يضاعف التحول العالمي لهذاGraphics و selected الMatrix بالترتيب المحدد. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | يصدر مؤشر سياق الجهاز الذي تم الحصول عليه بواسطة استدعاء سابق لـ GetHdc طريقة هذاGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | يصدر مؤشر سياق الجهاز الذي تم الحصول عليه بواسطة استدعاء سابق لـGetHdc طريقة من هذاGraphics . |
| [ResetClip](../../system.drawing/graphics/resetclip)() | يعيد تعيين منطقة المقطع لهذاGraphics إلى منطقة لانهائية. |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | يعيد تعيين مصفوفة تحويل العالم لهذاGraphics إلى مصفوفة الهوية. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | يعيد هذه الحالة[`Graphics`](../graphics) للدولة التي يمثلها أ[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | يطبق الاستدارة المحددة على مصفوفة التحويل الخاصة بذلكGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | يطبق الاستدارة المحددة على مصفوفة التحويل الخاصة بذلكGraphics بالترتيب المحدد. |
| [Save](../../system.drawing/graphics/save)() | يحفظ الوضع الحالي لهذا[`Graphics`](../graphics) ويحدد الحالة المحفوظة بامتداد[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | يطبق عملية القياس المحددة على مصفوفة التحويل الخاصة بذلكGraphics من خلال إلحاق it بمصفوفة تحويل الكائن. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | يطبق عملية القياس المحددة على مصفوفة التحويل الخاصة بذلكGraphics بالترتيب المحدد. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى خاصية Clip للملف المحدد[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى المحدد[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة العملية المحددة التي تجمع بين منطقة المقطع الحالية والمستطيل المحدد بواسطة أ[`Rectangle`](../rectangle) هيكل . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة العملية المحددة التي تجمع بين منطقة المقطع الحالية والمستطيل المحدد بواسطة أ[`RectangleF`](../rectanglef) هيكل . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة عملية الجمع المحددة لمنطقة القصاصة الحالية وخاصية المقطع المحدد[`Graphics`](../graphics) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة العملية المحددة التي تجمع بين منطقة المقطع الحالية والمحددة[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة العملية المحددة التي تجمع بين منطقة المقطع الحالية والمستطيل المحدد بواسطة أ[`Rectangle`](../rectangle) هيكل . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | يحدد منطقة القطع لهذا[`Graphics`](../graphics) إلى نتيجة العملية المحددة التي تجمع بين منطقة المقطع الحالية والمستطيل المحدد بواسطة أ[`RectangleF`](../rectanglef) هيكل . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | يحدد منطقة القطع لهذاGraphicsإلى نتيجة العملية المحددة التي تجمع منطقة المقطع الحالية والمحددةRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | يحول مصفوفة من النقاط من مساحة إحداثية إلى أخرى باستخدام العالم الحالي وتحولات الصفحة لهذاGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | يحول مصفوفة من النقاط من مساحة إحداثية إلى أخرى باستخدام العالم الحالي وتحولات الصفحة لهذاGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | يترجم منطقة القطع الخاصة بهذاGraphics بكميات محددة في الاتجاهين الأفقي والعمودي. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | يترجم منطقة القطع الخاصة بهذاGraphics بكميات محددة في الاتجاهين الأفقي والعمودي. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | يغير أصل النظام الإحداثي عن طريق إرفاق الترجمة المحددة مسبقًا بمصفوفة التحويل الخاصة بذلكGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | يغير أصل النظام الإحداثي عن طريق تطبيق الترجمة المحددة على مصفوفة التحويل من هذاGraphics بالترتيب المحدد. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | يوفر طريقة رد الاتصال لتقرير متى[`DrawImage`](./drawimage) يجب أن تلغي الطريقة التنفيذ قبل الأوان وتتوقف عن رسم صورة. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | يوفر طريقة رد الاتصال لـ[`EnumerateMetafile`](./enumeratemetafile) طريقة. |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
