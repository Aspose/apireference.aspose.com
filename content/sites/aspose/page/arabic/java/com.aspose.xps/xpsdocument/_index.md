---
title: "XpsDocument"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تجسد الكيان الرئيسي لمستند XPS الذي يوفر طرق التعامل لأي عنصر XPS."
type: docs
weight: 19
url: /ar/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

فئة تجسد الكيان الرئيسي لمستند XPS الذي يوفر طرق التعامل لأي عنصر XPS.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | ينشئ مستند XPS فارغ بحجم صفحة افتراضي. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | يفتح مستند XPS موجود في المسار. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | يقوم بتحميل مستند موجود مخزن في الدفق كوثيقة XPS. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | يضيف عنصر محتوى (Canvas، Path، أو Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | يدرج عنصرًا (Canvas أو Path أو Glyphs) إلى الصفحة النشطة في موضع الفهرس. |
| [<T>remove(T element)](#-T-remove-T-) | يزيل عنصرًا من الصفحة النشطة. |
| [addCanvas()](#addCanvas--) | يضيف Canvas جديد إلى الصفحة النشطة. |
| [addDocument()](#addDocument--) | يضيف مستندًا فارغًا بحجم صفحة افتراضي ويختار المستند المضاف كالنشط. |
| [addDocument(boolean activate)](#addDocument-boolean-) | يضيف مستندًا فارغًا بحجم صفحة افتراضي. |
| [addDocument(float width, float height)](#addDocument-float-float-) | يضيف مستندًا فارغًا بأبعاد الصفحة الأولى (العرض والارتفاع) ويختار المستند المضاف كالنشط. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | يضيف مستندًا فارغًا بأبعاد الصفحة الأولى  width  و  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | يضيف رموزًا جديدة إلى الصفحة النشطة. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يضيف رموزًا جديدة إلى الصفحة النشطة. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | يضيف مدخل مخطط إلى المستند. |
| [addPage()](#addPage--) | يضيف صفحة فارغة إلى المستند بحجم الصفحة الافتراضي. |
| [addPage(boolean activate)](#addPage-boolean-) | يضيف صفحة فارغة إلى المستند بحجم الصفحة الافتراضي. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | يضيف صفحة إلى المستند ويختار الصفحة المضافة كصفحة نشطة. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | يضيف صفحة إلى المستند. |
| [addPage(float width, float height)](#addPage-float-float-) | يضيف صفحة فارغة إلى المستند بالعرض  width  والارتفاع  height . |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | يضيف صفحة فارغة إلى المستند بالعرض  width  والارتفاع  height . |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | يضيف مسارًا جديدًا إلى الصفحة النشطة. |
| [close()](#close--) | يتخلص من الكائن. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | ينشئ مقطع قوس إهليلجي مُحدَّد بالخط. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | ينشئ مقطع قوس إهليلجي جديد. |
| [createCanvas()](#createCanvas--) | ينشئ canvas جديد. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | ينشئ لونًا جديدًا. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | ينشئ مورد خط TrueType جديد من الدفق. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | ينشئ مورد خط TrueType جديد. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | ينشئ glyphs جديدة. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | ينشئ glyphs جديدة. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | ينشئ نقطة تدرج جديدة. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | ينشئ نقطة تدرج جديدة. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | ينشئ مورد ملف تعريف ICC جديد من  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | ينشئ مورد ملف تعريف ICC جديد من ملف تعريف ICC الموجود في  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | ينشئ مورد صورة جديد من  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | ينشئ مورد صورة جديد من ملف الصورة الموجود في  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة صورة جديدة. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة صورة جديدة. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | ينشئ فرشاة تدرج خطية جديدة. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | ينشئ فرشاة تدرج خطية جديدة. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | ينشئ مصفوفة تحويل افينية جديدة. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | ينشئ مسارًا جديدًا. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | ينشئ شكل مسار مفتوح جديد. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | ينشئ شكل مسار جديد. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | ينشئ شكل مسار مفتوح جديد. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | ينشئ شكل مسار جديد. |
| [createPathGeometry()](#createPathGeometry--) | ينشئ هندسة مسار جديدة. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | ينشئ هندسة مسار جديدة محددة بصيغة مختصرة. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | ينشئ مجموعة جديدة من المنحنيات المكعبة المتحددة B?zier. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | ينشئ مجموعة جديدة من المنحنيات المكعبة B?zier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | ينشئ رسمًا متعدد الأضلاع محددًا يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | ينشئ رسمًا متعدد الأضلاع يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | ينشئ مجموعة جديدة من المنحنيات التربيعية المتحددة B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | ينشئ مجموعة جديدة من المنحنيات التربيعية B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | ينشئ فرشاة لون صلب جديدة. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | ينشئ فرشاة لون صلب جديدة. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة بصرية جديدة. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | يرجع رقم المستند النشط. |
| [getActivePage()](#getActivePage--) | يرجع رقم الصفحة النشطة داخل المستند النشط. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | يرجع عدد المستندات داخل حزمة XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | يحصل على تذكرة الطباعة للمستند المفهرس بـ  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | يرجع تذكرة طباعة مهمة المستند. |
| [getPage()](#getPage--) | يرجع كائن  XpsPage  للصفحة النشطة. |
| [getPageCount()](#getPageCount--) | يعيد عدد الصفحات في المستند النشط. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | يحصل على تذكرة الطباعة للصفحة المفهرسة بـ  pageIndex  في المستند المفهرس بـ  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | يعيد إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS. |
| [getUtils()](#getUtils--) | يحصل على الكائن الذي يوفر أدوات تتجاوز واجهة برمجة تطبيقات معالجة XPS الرسمية. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | يدرج لوحة قماشية جديدة إلى الصفحة النشطة في موضع  index . |
| [insertDocument(int index)](#insertDocument-int-) | يدرج مستندًا فارغًا بحجم الصفحة الافتراضي في موضع  index ويختار المستند المدخل كنشط. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | يدرج مستندًا فارغًا بحجم الصفحة الافتراضي في موضع  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | يدرج مستندًا فارغًا بأبعاد الصفحة الأولى  width  و  height  في موضع  index ويختار المستند المدخل كنشط. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | يدرج مستندًا فارغًا بأبعاد الصفحة الأولى العرض والارتفاع في موضع الفهرس . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | يدرج رموزًا جديدة إلى الصفحة النشطة في موضع الفهرس . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يدرج رموزًا جديدة إلى الصفحة النشطة في موضع الفهرس . |
| [insertPage(int index)](#insertPage-int-) | يدرج صفحة فارغة إلى المستند بحجم الصفحة الافتراضي في موضع الفهرس ويختار الصفحة المدخلة كنشطة. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | يدرج صفحة فارغة إلى المستند بحجم الصفحة الافتراضي في موضع الفهرس. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | يدرج صفحة إلى المستند في موضع الفهرس ويختار الصفحة المدخلة كنشطة. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | يدرج صفحة إلى المستند في موضع الفهرس. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | يدرج صفحة فارغة إلى المستند بأبعاد محددة العرض والارتفاع في موضع الفهرس ويختار الصفحة المدخلة كنشطة. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | يدرج صفحة فارغة إلى المستند بأبعاد محددة العرض والارتفاع في موضع الفهرس. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | يدرج مسارًا جديدًا إلى الصفحة النشطة في موضع الفهرس. |
| [isLicensed()](#isLicensed--) | يشير إلى ما إذا كان ترخيص منتج Aspose.Page for Java تم الوصول إليه وصالح. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | دمج عدة ملفات XPS في مستند XPS واحد. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | دمج عدة ملفات XPS في مستند XPS واحد. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | دمج مستندات XPS إلى PDF باستخدام كائن Device . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | دمج مستندات XPS إلى PDF باستخدام كائن Device . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | يزيل عنصرًا في موضع الفهرس من الصفحة النشطة. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | يزيل مستندًا في موضع الفهرس. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | يزيل صفحة من المستند. |
| [removePageAt(int index)](#removePageAt-int-) | يزيل صفحة من المستند في موضع الفهرس. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | يحفظ المستند باستخدام كائن Device . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | يحفظ مستند XPS إلى تدفق. |
| [save(String path)](#save-java.lang.String-) | يحفظ مستند XPS إلى ملف XPS الموجود في المسار . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | يحفظ المستند إلى ملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف XPS المدخل. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | يحفظ المستند إلى ملف صورة في الدليل المحدد مع اسم الملف المحدد. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | يحفظ المستند بتنسيق صورة bitmap كمصفوفات بايت. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | يحفظ المستند بتنسيق PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | يحفظ المستند بتنسيق PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | يحفظ المستند بتنسيق PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | يحفظ المستند بتنسيق PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | يختار مستندًا نشطًا للتحرير. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | يختار صفحة مستند نشطة للتحرير. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | يربط الـ  printTicket  بالمستند المفهرس بواسطة  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | يضبط بطاقة طباعة وظيفة المستند. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | يربط الـ  printTicket  بالصفحة المفهرسة بواسطة  pageIndex  في المستند المفهرس بواسطة  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


ينشئ مستند XPS فارغ بحجم صفحة افتراضي.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


يفتح مستند XPS موجود في المسار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.lang.String | موقع المستند. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


يقوم بتحميل مستند موجود مخزن في الدفق كوثيقة XPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.InputStream | دفق المستند. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | خيارات تحميل المستند. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


يضيف عنصر محتوى (Canvas، Path، أو Glyphs)

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عنصر | T | العنصر المراد إضافته. |

**Returns:**
T - العنصر المضاف.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


يدرج عنصرًا (Canvas أو Path أو Glyphs) إلى الصفحة النشطة في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج العنصر فيه. |
| عنصر | T | العنصر المراد إدراجه. |

**Returns:**
T - العنصر المُدرج.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


يزيل عنصرًا من الصفحة النشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عنصر | T | العنصر المراد إزالته. |

**Returns:**
T - العنصر المُزال.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


يضيف Canvas جديد إلى الصفحة النشطة.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


يضيف مستندًا فارغًا بحجم صفحة افتراضي ويختار المستند المضاف كالنشط.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


يضيف مستندًا فارغًا بحجم صفحة افتراضي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار المستند المضاف كنشط. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


يضيف مستندًا فارغًا بأبعاد الصفحة الأولى (العرض والارتفاع) ويختار المستند المضاف كالنشط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض الصفحة الأولى. |
| height | float | ارتفاع الصفحة الأولى. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


يضيف مستندًا فارغًا بأبعاد الصفحة الأولى  width  و  height .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض الصفحة الأولى. |
| height | float | ارتفاع الصفحة الأولى. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار المستند المضاف كنشط. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


يضيف رموزًا جديدة إلى الصفحة النشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يضيف رموزًا جديدة إلى الصفحة النشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


يضيف مدخل مخطط إلى المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| وصف | java.lang.String | وصف الإدخال. |
| outlineLevel | int | مستوى المخطط. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | هدف الإدخال. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


يضيف صفحة فارغة إلى المستند بحجم الصفحة الافتراضي.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


يضيف صفحة فارغة إلى المستند بحجم الصفحة الافتراضي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المضافة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


يضيف صفحة إلى المستند ويختار الصفحة المضافة كصفحة نشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | الصفحة التي سيتم إضافتها. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


يضيف صفحة إلى المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | الصفحة التي سيتم إضافتها. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المضافة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


يضيف صفحة فارغة إلى المستند بالعرض  width  والارتفاع  height .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض صفحة جديدة. |
| height | float | ارتفاع صفحة جديدة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


يضيف صفحة فارغة إلى المستند بالعرض  width  والارتفاع  height .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض صفحة جديدة. |
| height | float | ارتفاع صفحة جديدة. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المضافة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


يضيف مسارًا جديدًا إلى الصفحة النشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


يتخلص من الكائن.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


ينشئ مقطع قوس إهليلجي مُحدَّد بالخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | java.awt.geom.Point2D | نقطة النهاية للقوس الإهليلجي. |
| الحجم | java.awt.geom.Dimension2D | نصف القطر x و y للقوس الإهليلجي كزوج x,y. |
| rotationAngle | float | يحدد كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي. |
| isLargeArc | منطقي | يحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | الاتجاه الذي يُرسم فيه القوس. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


ينشئ مقطع قوس إهليلجي جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | java.awt.geom.Point2D | نقطة النهاية للقوس الإهليلجي. |
| الحجم | java.awt.geom.Dimension2D | نصف القطر x و y للقوس الإهليلجي كزوج x,y. |
| rotationAngle | float | يحدد كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي. |
| isLargeArc | منطقي | يحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | الاتجاه الذي يُرسم فيه القوس. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


ينشئ canvas جديد.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | مورد ملف تعريف ICC. |
| components | float[] | مكوّنات اللون. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


ينشئ لونًا جديدًا في مساحة اللون scRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| r | float | مكوّن اللون الأحمر. |
| g | float | مكوّن اللون الأخضر. |
| b | float | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


ينشئ لونًا جديدًا في مساحة اللون scRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | float | مكوّن اللون ألفا. |
| r | float | مكوّن اللون الأحمر. |
| g | float | مكوّن اللون الأخضر. |
| b | float | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


ينشئ لونًا جديدًا في مساحة اللون sRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| r | int | مكوّن اللون الأحمر. |
| g | int | مكوّن اللون الأخضر. |
| b | int | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


ينشئ لونًا جديدًا في مساحة اللون sRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | int | مكوّن اللون ألفا. |
| r | int | مكوّن اللون الأحمر. |
| g | int | مكوّن اللون الأخضر. |
| b | int | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


ينشئ لونًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | مثيل لون أصلي للون RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.lang.String | المسار إلى ملف تعريف ICC. |
| components | float[] | مكوّنات اللون. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


ينشئ مورد خط TrueType جديد من الدفق.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.InputStream | الدفق الذي يحتوي على ملف تعريف ICC لاستخدامه كمورد. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


ينشئ مورد خط TrueType جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. راجع  XpsFont  ثوابت الفئة (التي هي أعلام بت) للقيم المتاحة للجمع. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


ينشئ glyphs جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


ينشئ glyphs جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


ينشئ نقطة تدرج جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | لون نقطة إيقاف التدرج. |
| الإزاحة | float | إزاحة التدرج. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


ينشئ نقطة تدرج جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | لون نقطة إيقاف التدرج. |
| الإزاحة | float | إزاحة التدرج. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


ينشئ مورد ملف تعريف ICC جديد من  stream .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.InputStream | الدفق الذي يحتوي على ملف تعريف ICC لاستخدامه كمورد. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


ينشئ مورد ملف تعريف ICC جديد من ملف تعريف ICC الموجود في  iccProfilePath .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| iccProfilePath | java.lang.String | المسار إلى ملف تعريف ICC لاستخدامه كمورد. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


ينشئ مورد صورة جديد من  stream .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.InputStream | الدفق الذي يحتوي على الصورة لاستخدامها كمورد. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


ينشئ مورد صورة جديد من ملف الصورة الموجود في  imagePath .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار الصورة | java.lang.String | المسار إلى الصورة لاستخدامها كمورد. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة صورة جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | مورد صورة. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة صورة جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار الصورة | java.lang.String | المسار إلى الصورة لاستخدامها كبلاطة فرشاة. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


ينشئ فرشاة تدرج خطية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للتدرج الخطي. |
| نقطة النهاية | java.awt.geom.Point2D | نقطة النهاية للتدرج الخطي. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


ينشئ فرشاة تدرج خطية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقاط التوقف للتدرج | java.util.List<com.aspose.xps.XpsGradientStop> | قائمة نقاط التوقف للتدرج. |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للتدرج الخطي. |
| نقطة النهاية | java.awt.geom.Point2D | نقطة النهاية للتدرج الخطي. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


ينشئ مصفوفة تحويل افينية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| m11 | float | العنصر 11. |
| m12 | float | العنصر 12. |
| m21 | float | العنصر 21. |
| m22 | float | العنصر 22. |
| m31 | float | العنصر 31. |
| m32 | float | العنصر 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


ينشئ مسارًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


ينشئ شكل مسار مفتوح جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


ينشئ شكل مسار جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| isClosed | منطقي | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "closed"، أي أن النقطة الأخيرة في القطعة الأخيرة من شكل المسار يتم ربطها بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "open"، ولا يتم ربط النقطة الأخيرة بنقطة البداية. ينطبق ذلك فقط إذا تم استخدام شكل المسار داخل عنصر Path يحدد خطًا. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


ينشئ شكل مسار مفتوح جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | قائمة بقطع المسار. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


ينشئ شكل مسار جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | قائمة بقطع المسار. |
| isClosed | منطقي | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "closed"، أي أن النقطة الأخيرة في القطعة الأخيرة من شكل المسار يتم ربطها بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "open"، ولا يتم ربط النقطة الأخيرة بنقطة البداية. ينطبق ذلك فقط إذا تم استخدام شكل المسار داخل عنصر Path يحدد خطًا. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


ينشئ هندسة مسار جديدة.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


ينشئ هندسة مسار جديدة محددة بصيغة مختصرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | الصيغة المختصرة لهندسة المسار. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | قائمة بأشكال المسار. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


ينشئ مجموعة جديدة من المنحنيات المكعبة المتحددة B?zier.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


ينشئ مجموعة جديدة من المنحنيات المكعبة B?zier.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


ينشئ رسمًا متعدد الأضلاع محددًا يحتوي على عدد عشوائي من الرؤوس الفردية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | مجموعة من الإحداثيات للقطع المتعددة التي تُعرّف مقطع الخط المتعدد. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


ينشئ رسمًا متعدد الأضلاع يحتوي على عدد عشوائي من الرؤوس الفردية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | مجموعة من الإحداثيات للقطع المتعددة التي تُعرّف مقطع الخط المتعدد. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


ينشئ مجموعة جديدة من المنحنيات التربيعية المتحددة B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier تربيعية. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


ينشئ مجموعة جديدة من المنحنيات التربيعية B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier تربيعية. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


ينشئ فرشاة تدرج شعاعي جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | نقطة المركز للتدرج الشعاعي (أي مركز القطع الناقص). |
| gradientOrigin | java.awt.geom.Point2D | نقطة الأصل للتدرج الشعاعي. |
| radiusX | float | نصف القطر في البُعد السيني للإهليلج الذي يحدد التدرج الشعاعي. |
| radiusY | float | نصف القطر في البُعد الصادي للإهليلج الذي يحدد التدرج الشعاعي. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


ينشئ فرشاة تدرج شعاعي جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقاط التوقف للتدرج | java.util.List<com.aspose.xps.XpsGradientStop> | قائمة نقاط التوقف للتدرج. |
| center | java.awt.geom.Point2D | نقطة المركز للتدرج الشعاعي (أي مركز القطع الناقص). |
| gradientOrigin | java.awt.geom.Point2D | نقطة الأصل للتدرج الشعاعي. |
| radiusX | float | نصف القطر في البُعد السيني للإهليلج الذي يحدد التدرج الشعاعي. |
| radiusY | float | نصف القطر في البُعد الصادي للإهليلج الذي يحدد التدرج الشعاعي. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


ينشئ فرشاة لون صلب جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | اللون للعناصر المملوءة. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


ينشئ فرشاة لون صلب جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | اللون للعناصر المملوءة. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة بصرية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | عنصر XPS (Canvas, Path أو Glyphs) لخاصية Visual للفرشاة البصرية. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


يرجع رقم المستند النشط.

**Returns:**
int - قيمة int.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


يرجع رقم الصفحة النشطة داخل المستند النشط.

**Returns:**
int - قيمة int.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


يرجع عدد المستندات داخل حزمة XPS.

**Returns:**
int - عدد المستندات داخل حزمة XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


يحصل على تذكرة الطباعة للمستند المفهرس بـ  documentIndex .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| documentIndex | int | فهرس المستند الذي يجب إرجاع تذكرة الطباعة الخاصة به. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


يرجع تذكرة طباعة مهمة المستند.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


يرجع كائن  XpsPage  للصفحة النشطة.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


يعيد عدد الصفحات في المستند النشط.

**Returns:**
int - عدد الصفحات في المستند النشط.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


يحصل على تذكرة الطباعة للصفحة المفهرسة بـ  pageIndex  في المستند المفهرس بـ  documentIndex .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| documentIndex | int | فهرس المستند. |
| pageIndex | int | فهرس الصفحة التي يجب إرجاع تذكرة الطباعة الخاصة بها. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


يعيد إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS.

**Returns:**
int - إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


يحصل على الكائن الذي يوفر أدوات تتجاوز واجهة برمجة تطبيقات معالجة XPS الرسمية.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


يدرج لوحة قماشية جديدة إلى الصفحة النشطة في موضع  index .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج لوحة رسم جديدة فيه. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


يدرج مستندًا فارغًا بحجم الصفحة الافتراضي في موضع  index ويختار المستند المدخل كنشط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج المستند فيه. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


يدرج مستندًا فارغًا بحجم الصفحة الافتراضي في موضع  index .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج المستند فيه. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار المستند المُدرج كنشط. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


يدرج مستندًا فارغًا بأبعاد الصفحة الأولى  width  و  height  في موضع  index ويختار المستند المدخل كنشط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج المستند فيه. |
| width | float | عرض الصفحة الأولى. |
| height | float | ارتفاع الصفحة الأولى. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


يدرج مستندًا فارغًا بأبعاد الصفحة الأولى العرض والارتفاع في موضع الفهرس .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج المستند فيه. |
| width | float | عرض الصفحة الأولى. |
| height | float | ارتفاع الصفحة الأولى. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار المستند المُدرج كنشط. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


يدرج رموزًا جديدة إلى الصفحة النشطة في موضع الفهرس .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج رموز جديدة فيه. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يدرج رموزًا جديدة إلى الصفحة النشطة في موضع الفهرس .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج رموز جديدة فيه. |
| fontFamily | java.lang.String | عائلة الخط. |
| fontSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


يدرج صفحة فارغة إلى المستند بحجم الصفحة الافتراضي في موضع الفهرس ويختار الصفحة المدخلة كنشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج الصفحة فيه. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


يدرج صفحة فارغة إلى المستند بحجم الصفحة الافتراضي في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج الصفحة فيه. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدرجة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


يدرج صفحة إلى المستند في موضع الفهرس ويختار الصفحة المدخلة كنشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إضافة الصفحة فيه. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | الصفحة التي سيتم إدراجها. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


يدرج صفحة إلى المستند في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إضافة الصفحة فيه. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | الصفحة التي سيتم إدراجها. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدرجة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


يدرج صفحة فارغة إلى المستند بأبعاد محددة العرض والارتفاع في موضع الفهرس ويختار الصفحة المدخلة كنشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج الصفحة فيه. |
| width | float | عرض صفحة جديدة. |
| height | float | ارتفاع صفحة جديدة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


يدرج صفحة فارغة إلى المستند بأبعاد محددة العرض والارتفاع في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج الصفحة فيه. |
| width | float | عرض صفحة جديدة. |
| height | float | ارتفاع صفحة جديدة. |
| تفعيل | منطقي | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدرجة كنشطة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


يدرج مسارًا جديدًا إلى الصفحة النشطة في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج مسار جديد فيه. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


يشير إلى ما إذا كان ترخيص منتج Aspose.Page for Java تم الوصول إليه وصالح.

**Returns:**
منطقي - قيمة منطقية
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


دمج عدة ملفات XPS في مستند XPS واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | ملفات XPS للدمج مع هذا المستند. |
| outStream | java.io.OutputStream | دفق الإخراج حيث يتم حفظ مستندات XPS المدمجة. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


دمج عدة ملفات XPS في مستند XPS واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | ملفات XPS للدمج مع هذا المستند. |
| outXpsFilePath | java.lang.String | مسار ملف XPS الناتج. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


دمج مستندات XPS إلى PDF باستخدام كائن Device .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | مسار ملف PDF الناتج. |
| filesForMerge | java.lang.String[] | ملفات XPS للدمج مع هذا المستند إلى جهاز إخراج. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | خيارات حفظ المستند. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


دمج مستندات XPS إلى PDF باستخدام كائن Device .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | ملفات XPS للدمج مع هذا المستند إلى جهاز إخراج. |
| pdfStream | java.io.OutputStream | دفق الإخراج لكتابة ملف PDF الناتج إليه. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | خيارات حفظ المستند. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


يزيل عنصرًا في موضع الفهرس من الصفحة النشطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إزالة العنصر منه. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


يزيل مستندًا في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إزالة المستند منه. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


يزيل صفحة من المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | الصفحة التي سيتم إزالتها. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


يزيل صفحة من المستند في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إزالة الصفحة منه. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


يحفظ المستند باستخدام كائن Device .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | مثيل  Device  . |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | خيارات حفظ المستند. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


يحفظ مستند XPS إلى تدفق.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.OutputStream | دفق مستند XPS ليتم حفظه في. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


يحفظ مستند XPS إلى ملف XPS الموجود في المسار .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.lang.String | موقع المستند. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


يحفظ المستند كملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف XPS المدخل. سيتطابق امتداد الملف مع تنسيق الصورة في معلمة "options". إذا تم تهيئة المستند باستخدام تدفق ليس FileInputStream، فسيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | خيارات حفظ المستند بتنسيق صورة bitmap. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


يحفظ المستند كملف صورة في الدليل المحدد مع اسم الملف المحدد. سيتطابق امتداد الملف مع تنسيق الصورة في معلمة "options".

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | خيارات حفظ المستند بتنسيق صورة bitmap. |
| outDir | java.lang.String | دليل الإخراج حيث سيتم حفظ ملف الصورة. |
| fileNameTemplate | java.lang.String | قالب اسم الملف للصورة (بدون امتداد). إذا كان ملف XPS المدخل صفحة واحدة فسيكون اسم الملف بالضبط، وإلا سيكون "\_[n]" حيث "n" - رقم الصفحة بدءًا من 1، وسيُضاف لاحقة إلى ذلك. سيتطابق امتداد الملف مع تنسيق الصورة في معلمة "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


يحفظ المستند بتنسيق صورة bitmap كمصفوفات بايت.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | خيارات حفظ المستند بتنسيق صورة bitmap. |

**Returns:**
byte[][][] - مصفوفات البايت للصور الناتجة. البُعد الأول مخصص للمستندات الداخلية والبُعد الثاني للصفحات داخل المستندات الداخلية.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


يحفظ المستند بتنسيق PDF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.OutputStream | التدفق لكتابة ملف PDF الناتج إليه. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | خيارات حفظ المستند بتنسيق PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


يحفظ المستند بتنسيق PDF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | مسار ملف PDF الناتج. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | خيارات حفظ المستند بتنسيق PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


يحفظ المستند بتنسيق PS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stream | java.io.OutputStream | التدفق لكتابة ملف PS الناتج إليه. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | خيارات حفظ المستند بتنسيق PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


يحفظ المستند بتنسيق PostSscript.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPsFilePath | java.lang.String | مسار ملف PostScript الناتج. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | خيارات حفظ المستند بتنسيق PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


يختار مستندًا نشطًا للتحرير.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| documentNumber | int | رقم المستند. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


يختار صفحة مستند نشطة للتحرير.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pageNumber | int | رقم الصفحة. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


يربط الـ  printTicket  بالمستند المفهرس بواسطة  documentIndex .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| documentIndex | int | فهرس المستند لربط تذكرة الطباعة به. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | تذكرة الطباعة للربط. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


يضبط بطاقة طباعة وظيفة المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | تذكرة طباعة مهمة المستند. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


يربط الـ  printTicket  بالصفحة المفهرسة بواسطة  pageIndex  في المستند المفهرس بواسطة  documentIndex .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| documentIndex | int | فهرس المستند. |
| pageIndex | int | فهرس الصفحة لربط تذكرة الطباعة بها. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | تذكرة الطباعة للربط. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

