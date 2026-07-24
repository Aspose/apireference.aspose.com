---
title: "الفئة Aspose::Page::XPS::XpsDocument"
linktitle: "XpsDocument"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsDocument. فئة تُجسّد الكيان الرئيسي لوثيقة XPS التي توفر طرق معالجة لأي عنصر XPS في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


فئة تُجسّد الكيان الرئيسي لوثيقة [XPS](../) التي توفر طرق معالجة لأي عنصر [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(T) | يضيف عنصر محتوى (Canvas أو Path أو Glyphs). |
| [AddCanvas](./addcanvas/)() | يضيف لوحة رسم جديدة إلى الصفحة النشطة. |
| [AddDocument](./adddocument/)(bool) | يضيف مستندًا فارغًا بحجم صفحة افتراضي. |
| [AddDocument](./adddocument/)(float, float, bool) | يضيف مستندًا فارغًا بأبعاد الصفحة الأولى *width* و *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | يضيف رموزًا جديدة إلى الصفحة النشطة. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | يضيف رموزًا جديدة إلى الصفحة النشطة. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | يضيف مدخل مخطط إلى المستند. |
| [AddPage](./addpage/)(bool) | يضيف صفحة فارغة إلى المستند بحجم صفحة افتراضي. |
| [AddPage](./addpage/)(float, float, bool) | يضيف صفحة فارغة إلى المستند بأبعاد *width* و *height* محددة. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | يضيف صفحة إلى المستند. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | يضيف مسارًا جديدًا إلى الصفحة النشطة. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | ينشئ مقطع قوس بيضاوي جديد. |
| [CreateCanvas](./createcanvas/)() | ينشئ canvas جديد. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | ينشئ لونًا جديدًا. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | ينشئ مورد خط **TrueType** جديد. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | ينشئ مورد خط **TrueType** جديد من تدفق. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | ينشئ glyphs جديدة. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | ينشئ glyphs جديدة. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | ينشئ نقطة تدرج جديدة. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | ينشئ نقطة تدرج جديدة. |
| [CreateIccProfile](./createiccprofile/)(System::String) | ينشئ مورد ملف تعريف ICC جديد من ملف تعريف ICC الموجود في *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | ينشئ مورد ملف تعريف ICC جديد من *stream*. |
| [CreateImage](./createimage/)(System::String) | ينشئ مورد صورة جديد من ملف الصورة الموجود في *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | ينشئ مورد صورة جديد من *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة صورة جديدة. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة صورة جديدة. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | ينشئ فرشاة تدرج خطية جديدة. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | ينشئ فرشاة تدرج خطية جديدة. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | ينشئ مصفوفة تحويل أفينية جديدة. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | ينشئ مسارًا جديدًا. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | ينشئ شكل مسار جديد. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | ينشئ شكل مسار جديد. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | ينشئ هندسة مسار جديدة محددة بصيغة مختصرة. |
| [CreatePathGeometry](./createpathgeometry/)() | ينشئ هندسة مسار جديدة. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ مجموعة جديدة من منحنيات بيزيه المكعبة. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ رسمًا متعدد الأضلاع جديدًا يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ مجموعة جديدة من منحنيات بيزيه التربيعية من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | ينشئ فرشاة لون صلب جديدة. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | ينشئ فرشاة لون صلب جديدة. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة بصرية جديدة. |
| [Dispose](./dispose/)() override | يُفرغ الكائن. |
| [get_ActiveDocument](./get_activedocument/)() | يحصل على رقم المستند النشط. |
| [get_ActivePage](./get_activepage/)() | يحصل على رقم الصفحة النشطة داخل المستند النشط. |
| [get_DocumentCount](./get_documentcount/)() | يعيد عدد المستندات داخل حزمة [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | يعيد/يضبط تذكرة طباعة مهمة المستند. |
| [get_Page](./get_page/)() | يعيد كائن [XpsPage](../) للصفحة النشطة. |
| [get_PageCount](./get_pagecount/)() | يرجع عدد الصفحات في المستند النشط. |
| [get_TotalPageCount](./get_totalpagecount/)() | يعيد العدد الإجمالي للصفحات في جميع المستندات داخل مستند [XPS](../). |
| [get_Utils](./get_utils/)() const | يحصل على الكائن الذي يوفر أدوات إضافية تتجاوز واجهة برمجة تطبيقات معالجة [XPS](../) الرسمية. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | يعيد تذكرة الطباعة للمستند المفهرس بواسطة *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | يعيد تذكرة الطباعة للصفحة المفهرسة بواسطة *pageIndex* في المستند المفهرس بواسطة *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | يدرج عنصرًا (Canvas, Path, أو Glyphs) إلى الصفحة النشطة في موضع *index* . |
| [InsertCanvas](./insertcanvas/)(int32_t) | يدرج لوحة قماشية جديدة إلى الصفحة النشطة في موضع *index* . |
| [InsertDocument](./insertdocument/)(int32_t, bool) | يدرج مستندًا فارغًا بحجم صفحة افتراضي في موضع *index* . |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | يدرج مستندًا فارغًا بأبعاد الصفحة الأولى *width* و *height* في موضع *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | يدرج رموزًا جديدة إلى الصفحة النشطة في موضع *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | يدرج رموزًا جديدة إلى الصفحة النشطة في موضع *index* . |
| [InsertPage](./insertpage/)(int32_t, bool) | يدرج صفحة فارغة إلى المستند بحجم صفحة افتراضي في موضع *index* . |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | يدرج صفحة فارغة إلى المستند بأبعاد محددة *width* و *height* في موضع *index* . |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | يدرج صفحة إلى المستند في موضع *index* . |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | يدرج مسارًا جديدًا إلى الصفحة النشطة في موضع *index* . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | دمج عدة ملفات [XPS](../) في مستند [XPS](../) واحد. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | دمج عدة ملفات [XPS](../) في مستند [XPS](../) واحد. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | دمج مستندات [XPS](../) إلى PDF باستخدام كائن [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | دمج مستندات [XPS](../) إلى PDF باستخدام كائن [Device](../). |
| [Remove](./remove/)(T) | يزيل عنصرًا من الصفحة النشطة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل عنصرًا في موضع *index* من الصفحة النشطة. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | يزيل مستندًا في موضع *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | يزيل صفحة من المستند. |
| [RemovePageAt](./removepageat/)(int32_t) | يزيل صفحة من المستند في موضع *index*. |
| [Save](./save/)(System::String) | يحفظ مستند [XPS](../) إلى ملف [XPS](../) موجود في *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | يحفظ مستند [XPS](../) إلى تدفق. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | يحفظ المستند إلى ملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف [XPS](../) الإدخال. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"options\". إذا تم تهيئة المستند باستخدام تدفق ليس FileStream، سيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | يحفظ المستند إلى ملف صورة في الدليل المحدد مع اسم الملف المحدد. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"options\". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | يحفظ المستند بتنسيق صورة bitmap كمصفوفات بايت. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | يحفظ المستند بتنسيق PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | يحفظ المستند بتنسيق PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | يحفظ المستند بتنسيق PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | يحفظ المستند بتنسيق PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | يختار مستندًا نشطًا للتحرير. |
| [SelectActivePage](./selectactivepage/)(int32_t) | يختار صفحة مستند نشطة للتحرير. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | يعيد/يضبط تذكرة طباعة مهمة المستند. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | يربط *printTicket* بالمستند المفهرس بواسطة *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | يربط *printTicket* بالصفحة المفهرسة بواسطة *pageIndex* في المستند المفهرس بواسطة *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | ينشئ مستند [XPS](../) فارغ بحجم صفحة افتراضي. |
| [XpsDocument](./xpsdocument/)(System::String) | يفتح مستند [XPS](../) موجود في *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | يفتح مستندًا موجودًا في *path* كمستند [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | يحمّل مستندًا موجودًا مخزنًا في *stream* كمستند [XPS](../). |
## انظر أيضًا

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
