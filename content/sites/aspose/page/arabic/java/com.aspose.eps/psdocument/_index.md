---
title: "PsDocument"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "هذه الفئة تغلف مستندات PS/EPS."
type: docs
weight: 16
url: /ar/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

هذه الفئة تغلف مستندات PS/EPS.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PsDocument()](#PsDocument--) | يُهيئ PsDocument فارغًا بصفحة مهيأة. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | يُهيئ PsDocument فارغًا بصفحة مهيأة. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | يُهيئ PsDocument فارغًا بصفحة مهيأة. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | يُهيئ PsDocument فارغًا. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | يُهيئ PsDocument فارغًا. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | يُهيئ PsDocument فارغًا عندما يكون عدد صفحات مستند Postscript معروفًا مسبقًا. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | يُهيئ PsDocument فارغًا عندما يكون عدد صفحات مستند Postscript معروفًا مسبقًا. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | يُهيئ PsDocument بملف PS/EPS كمدخل. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | يُهيئ PsDocument بتدفق ملف PS/EPS. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | يضيف قصًا إلى حالة الرسومات الحالية. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | يضيف قصًا إلى حالة الرسومات الحالية ثم يكتب عامل "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | يضيف مستطيل قص إلى حالة الرسومات الحالية. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | يضيف قصًا من مخطط النص المحدد بالخط المحدد. |
| [closePage()](#closePage--) | أكمل الصفحة الحالية. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | يحوّل خط Type 1 إلى TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | يحوّل خط Type 3 إلى TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | يحوّل خط Type 3 إلى TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | يقص PsDocument المحدد كملف EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | ارسم مسارًا تعسفيًا. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | ارسم صورةً مقنّعة. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | ارسم صورةً. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | ارسم صورةً محوّلة مع خلفية. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | ارسم صورةً شفافة محوّلة مع خلفية. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | يقرأ ملف EPS ويستخرج صندوق الحدود لصورة EPS من تعليق %%BoundingBox أو الحدود لحجم الصفحة الافتراضي (0, 0, 595, 842) إذا لم يكن موجودًا. |
| [extractEpsSize()](#extractEpsSize--) | يقرأ ملف EPS ويستخرج حجم صورة EPS من تعليق %%BoundingBox أو حجم الصفحة الافتراضي (595, 842) إذا لم يكن موجودًا. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | يستخرج النص من ملف PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | ملء مسار عشوائي. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | يضيف سلسلة نصية عن طريق ملء داخل الحروف. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | يحصل على عدد الصفحات في مستند PDF الناتج. |
| [getPaint()](#getPaint--) | يحصل على اللون في حالة الرسومات الحالية. |
| [getStroke()](#getStroke--) | يحصل على الحد في حالة الرسومات الحالية. |
| [getXmpMetadata()](#getXmpMetadata--) | يقرأ ملف PS/EPS ويستخرج XmpMetdata إذا كان موجودًا بالفعل أو يضيف واحدًا جديدًا إذا لم يكن موجودًا. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | يشير إلى ما إذا كان ترخيص منتج Aspose.Page for Java تم الوصول إليه وصالح. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | يدمج ملفات PS/EPS إلى جهاز. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | يدمج ملفات PS/EPS إلى جهاز. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | يدمج ملفات PS/EPS إلى جهاز. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | ينشئ صفحة جديدة ويجعلها الحالية. |
| [openPage(String pageName)](#openPage-java.lang.String-) | ينشئ صفحة جديدة بحجم المستند ويجعلها الحالية. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | يضيف سلسلة نصية عن طريق رسم حدود الحروف. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | يعيد تحجيم PsDocument المعطى كملف EPS. |
| [rotate(float angleRadians)](#rotate-float-) | يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية). |
| [rotate(int angleDegrees)](#rotate-int-) | يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية). |
| [save()](#save--) | يحفظ PsDocument المعطى كملف PS أو EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | يحفظ ملف PS/EPS إلى جهاز. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | يحفظ PsDocument المعطى إلى الدفق. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | يحفظ PsDocument المعطى كملف EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | يحفظ ملف PS/EPS إلى ملف صورة. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | يحفظ ملف PS/EPS إلى ملف صورة في الدليل المحدد بالاسم المحدد. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | يحفظ ملف PS/EPS إلى مصفوفات بايتات الصور. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | يحفظ ملف PS/EPS إلى دفق PDF إخراج. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | يحفظ ملف PS/EPS إلى ملف PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | يحفظ كائن BufferedImage إلى ملف EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | يحفظ كائن BufferedImage إلى ملف EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | يحفظ صورة PNG/JPEG/BMP/GIF من دفق الإدخال إلى دفق إخراج EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | يحفظ صورة PNG/JPEG/BMP/GIF من ملف إلى ملف EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | يضيف مقياسًا إلى حالة الرسومات الحالية (scale current matrix). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | يحدد تدفق إدخال. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | يضبط معلمات جهاز الصفحة (انظر المشغل "setpagedevice" مواصفات PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | يضبط حجم الصفحة. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | يضبط الطلاء في حالة الرسومات الحالية. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | يضبط الحد في حالة الرسومات الحالية. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | عيّن التحويل الحالي إلى هذا. |
| [shear(float shx, float shy)](#shear-float-float-) | يضيف تحويل قص إلى حالة الرسومات الحالية (shear current matrix). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | يضيف تحويلًا إلى حالة الرسومات الحالية (concatenates this matrix with current one). |
| [translate(float x, float y)](#translate-float-float-) | يضيف إزاحة إلى حالة الرسومات الحالية (translates current matrix). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | يكتب استعادة حالة الرسومات الحالية (انظر مواصفات PostScript للمشغل "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | يكتب حفظ حالة الرسومات الحالية (انظر مواصفات PostScript للمشغل "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


يُهيئ كائن PsDocument فارغ مع صفحة مهيأة. يُستخدم هذا المُنشئ فقط للعمليات الإضافية التي لا تتعلق بملفات PostScript، على سبيل المثال، تحويل الخطوط.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


يُهيئ PsDocument فارغًا بصفحة مهيأة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPsFilePath | java.lang.String | مسار ملف PS/EPS الناتج. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


يُهيئ PsDocument فارغًا بصفحة مهيأة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| psStream | java.io.OutputStream | التدفق الذي يُحفظ فيه ملف PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


يُهيئ PsDocument فارغًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPsFilePath | java.lang.String | مسار ملف PS/EPS الناتج. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| multipaged | منطقي | إذا كان false لن يتم تهيئة الصفحة. في هذه الحالة يجب تنفيذ تهيئة الصفحة عبر استدعاء صريح "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


يُهيئ PsDocument فارغًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| psStream | java.io.OutputStream | التدفق الذي يُحفظ فيه ملف PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| multipaged | منطقي | إذا كان false لن يتم تهيئة الصفحة. في هذه الحالة يجب تنفيذ تهيئة الصفحة عبر استدعاء صريح "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


يُهيئ PsDocument فارغًا عندما يكون عدد صفحات مستند Postscript معروفًا مسبقًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPsFilePath | java.lang.String | مسار ملف PS/EPS الناتج. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| numberOfPages | int | عدد الصفحات في مستند PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


يُهيئ PsDocument فارغًا عندما يكون عدد صفحات مستند Postscript معروفًا مسبقًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| psStream | java.io.OutputStream | التدفق الذي يُحفظ فيه ملف PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| numberOfPages | int | عدد الصفحات في مستند PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


يُهيئ PsDocument بملف PS/EPS كمدخل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| psFilePath | java.lang.String | مسار ملف PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


يُهيئ PsDocument بتدفق ملف PS/EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| psStream | java.io.InputStream | تدفق ملف PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


يضيف قصًا إلى حالة الرسومات الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| s | java.awt.Shape | مسار القص. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


يضيف قصًا إلى حالة الرسومات الحالية ثم يكتب معامل "newpath". من الضروري القيام بذلك لتجنب التلاقي بين مسار القص هذا وبعض المسارات اللاحقة مثل الرموز المرسومة باستخدام معامل "charpath".

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| s | java.awt.Shape | مسار القص. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


يضيف مستطيل قص إلى حالة الرسومات الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| مستطيل | java.awt.geom.Rectangle2D.Float | مستطيل القص. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


يضيف قصًا من مخطط النص المحدد بالخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص. |
| خط | java.awt.Font | الخط. |
| x | float | إحداثي X لموضع النص. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


أكمل الصفحة الحالية.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


يقوم بتحويل خط Type 1 إلى TrueType. سيكون اسم ملف الخط TTF المحول هو نفسه اسم خط Type 1 المدخل مع امتداد ".ttf". سيتم حفظ ملف TTF في دليل الإخراج المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | مسار ملف خط Type 1.. |
| outputDir | java.lang.String | دليل الإخراج حيث يتم حفظ خط TrueType الناتج. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


يقوم بتحويل خط Type 3 إلى TrueType. سيتم حفظ ملف TTF في تدفق الإخراج المقدم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | مسار ملف خط Type 3. |
| outputStream | java.io.OutputStream | تدفق الإخراج حيث يتم حفظ خط TrueType الناتج. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


يقوم بتحويل خط Type 3 إلى TrueType. سيكون اسم ملف الخط TTF المحول هو نفسه اسم خط Type 3 المدخل مع امتداد ".ttf". سيتم حفظ ملف TTF في دليل الإخراج المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | مسار ملف خط Type 3.. |
| outputDir | java.lang.String | دليل الإخراج حيث يتم حفظ خط TrueType الناتج. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


يقص مستند PsDocument المعطى كملف EPS. يحفظ ملف EPS الأصلي مع تحديث %%BoundingBox الموجود أو إنشاء واحد جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | صندوق القص (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


ارسم مسارًا تعسفيًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| shape | java.awt.Shape | المسار للتعبئة. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


ارسم صورةً مقنّعة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | الصورة للرسم. يجب أن تكون بتنسيق صورة RGB 24 بت. |
| alphaMask1bpp | java.awt.image.BufferedImage | قناع الصورة. يجب أن يكون بتنسيق صورة 1 بت. |
| transform | java.awt.geom.AffineTransform | المصفوفة لتحويل الصورة. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


ارسم صورةً.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | الصورة للرسم. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


ارسم صورةً محوّلة مع خلفية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | الصورة للرسم. |
| transform | java.awt.geom.AffineTransform | المصفوفة لتحويل الصورة. |
| bkg | java.awt.Color | الخلفية للصورة. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


ارسم صورة شفافة محوّلة مع الخلفية. إذا لم تحتوي الصورة على قناة ألفا فستُرسم كصورة غير شفافة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | الصورة للرسم. |
| transform | java.awt.geom.AffineTransform | المصفوفة لتحويل الصورة. |
| transparencyThreshold | int | حدّ يحدد من أي قيمة شفافية يتم تفسير البكسل على أنه شفاف تمامًا. جميع القيم الأقل من هذا الحد ستُفسّر على أنها غير شفافة تمامًا. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


يقرأ ملف EPS ويستخرج صندوق الحدود لصورة EPS من تعليق %%BoundingBox أو الحدود لحجم الصفحة الافتراضي (0, 0, 595, 842) إذا لم يكن موجودًا.

**Returns:**
int[] - الصندوق المحيط لصورة EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


يقرأ ملف EPS ويستخرج حجم صورة EPS من تعليق %%BoundingBox أو حجم الصفحة الافتراضي (595, 842) إذا لم يكن موجودًا.

**Returns:**
java.awt.Dimension - حجم صورة EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


يستخرج النص من ملف PS. يعمل فقط مع النص المكتوب بخطوط TrueType (النوع 42) أو الخطوط المركبة (النوع 0) التي تتكون من خطوط TrueType.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | خيارات الحفظ. |
| startPage | int | الصفحة التي يبدأ منها استخراج النص شاملًا. |
| endPage | int | الصفحة التي يجب استخراج النص منها بشكل شامل. |

**Returns:**
java.lang.String - النص الموجود في الصفحات المحددة من ملف PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


ملء مسار عشوائي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| shape | java.awt.Shape | المسار للتعبئة. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fillPaint | java.awt.Paint | التعبئة المستخدمة لطلاء داخل الحروف. |
| strokePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fillPaint | java.awt.Paint | التعبئة المستخدمة لطلاء داخل الحروف. |
| strokePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. advances مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| advances | float[] |  |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fillPaint | java.awt.Paint | التعبئة المستخدمة لطلاء داخل الحروف. |
| strokePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف ورسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fillPaint | java.awt.Paint | التعبئة المستخدمة لطلاء داخل الحروف. |
| strokePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fill | java.awt.Paint | التعبئة المستخدمة لطلاء الحروف. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fill | java.awt.Paint | التعبئة المستخدمة لطلاء الحروف. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| خط | java.awt.Font | الخط الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fill | java.awt.Paint | التعبئة المستخدمة لطلاء الحروف. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


يضيف سلسلة نصية عن طريق ملء داخل الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| خط | java.awt.Font | الخط الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| fill | java.awt.Paint | التعبئة المستخدمة لطلاء الحروف. |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


يحصل على عدد الصفحات في مستند PDF الناتج.

**Returns:**
int - عدد الصفحات.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


يحصل على اللون في حالة الرسومات الحالية.

**Returns:**
java.awt.Paint - الطلاء الحالي.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


يحصل على الحد في حالة الرسومات الحالية.

**Returns:**
java.awt.Stroke - الخط الحالي.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


يقرأ ملف PS/EPS ويستخرج XmpMetdata إذا كان موجودًا بالفعل أو يضيف واحدًا جديدًا إذا لم يكن موجودًا.

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


يشير إلى ما إذا كان ترخيص منتج Aspose.Page for Java تم الوصول إليه وصالح.

**Returns:**
منطقي - قيمة منطقية
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


يدمج ملفات PS/EPS إلى جهاز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | ملفات PS/EPS للدمج مع هذا الملف إلى جهاز إخراج. |
| device | [Device](../../com.aspose.page/device) | جهاز إخراج. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


يدمج ملفات PS/EPS إلى جهاز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | دفق PDF للإخراج. |
| filesForMerge | java.lang.String[] | ملفات PS/EPS للدمج مع هذا الملف إلى جهاز إخراج. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


يدمج ملفات PS/EPS إلى جهاز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | مسار ملف PDF للإخراج. |
| filesForMerge | java.lang.String[] | ملفات PS/EPS للدمج مع هذا الملف إلى جهاز إخراج. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public void openPage(float width, float height)
```


ينشئ صفحة جديدة ويجعلها الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض الصفحة الجديدة. |
| height | float | ارتفاع الصفحة الجديدة. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


ينشئ صفحة جديدة بحجم المستند ويجعلها الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pageName | java.lang.String | اسم الصفحة الجديدة. إذا كان null فإن اسم الصفحة سيكون رقم ترتيب الصفحة. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| outlinePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont الذي سيُستخدم لرسم النص. يمكن استخدامه مع خط مخصص موجود في مجلد مخصص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| outlinePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| advances | float[] | مصفوفة عرض الحروف. يجب أن يتطابق طولها مع عدد الحروف في السلسلة. |
| خط | java.awt.Font | الخط الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| outlinePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| خط | java.awt.Font | خط النظام الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


يضيف سلسلة نصية عن طريق رسم حدود الحروف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | java.lang.String | النص المراد إضافته. |
| خط | java.awt.Font | الخط الذي سيُستخدم لرسم النص. |
| x | float | الإحداثي X لأصل النص. |
| y | float | الإحداثي Y لأصل النص. |
| outlinePaint | java.awt.Paint | java.awt.Paint المستخدم لطلاء حدود الحروف. يمكن أن يكون أي فئة فرعية من فئة java.awt.Paint في JDK. |
| stroke | java.awt.Stroke | الخط المستخدم لرسم محيطات الحروف. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


يعيد تحجيم PsDocument المعطى كملف EPS. تُستخدم هذه الطريقة فقط بعد استخراج حجم EPS. يحفظ الملف EPS الأصلي مع تحديث %%BoundingBox الموجود أو يتم إنشاء واحد جديد. سيتم أيضًا تعيين مصفوفة تحويل الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | الحجم الجديد لصورة EPS بالوحدات المحددة. |
| units | [Units](../../com.aspose.page/units) | وحدات الحجم الجديد. يمكن أن تكون نقاطًا أو بوصات أو مليمترات أو سنتيمترات ونسب مئوية من الحجم الأصلي. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angleRadians | float | زاوية الدوران بالراديان. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


يضيف دورانًا عكس اتجاه عقارب الساعة حول الأصل إلى حالة الرسومات الحالية (تدوير المصفوفة الحالية).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| angleDegrees | int | زاوية الدوران بالدرجات. |

### save() {#save--}
```
public void save()
```


يحفظ PsDocument المعطى كملف PS أو EPS. تُستخدم هذه الطريقة فقط عندما يتم إنشاء PsDocument من الصفر.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


يحفظ ملف PS/EPS إلى جهاز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | جهاز إخراج. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


يحفظ PsDocument المعطى إلى الدفق. تُستخدم هذه الطريقة فقط بعد تحديث بيانات تعريف XMP. يحفظ ملف EPS الأصلي مع تحديث البيانات الوصفية الموجودة أو يتم إنشاء واحد جديد أثناء استدعاء طريقة getMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| epsStream | java.io.OutputStream | دفق ملف EPS للإخراج. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


يحفظ PsDocument المعطى كملف EPS. تُستخدم هذه الطريقة فقط بعد تحديث بيانات تعريف XMP. يحفظ ملف EPS الأصلي مع تحديث البيانات الوصفية الموجودة أو يتم إنشاء واحد جديد أثناء استدعاء طريقة getMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | مسار ملف EPS الناتج.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


يحفظ ملف PS/EPS كملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف PS المدخل. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"options\". إذا تم تهيئة المستند باستخدام تدفق ليس مشتقًا من FileInputStream، فسيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | يحتوي على المعلمات الضرورية لحفظ الصورة والعلامات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


يحفظ ملف PS/EPS كملف صورة في الدليل المحدد مع اسم الملف المحدد. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"options\".

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | يحتوي على المعلمات الضرورية لحفظ الصورة والعلامات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |
| outDir | java.lang.String | دليل الإخراج حيث سيتم حفظ ملف الصورة. |
| fileNameTemplate | java.lang.String | قالب اسم الملف للصورة (بدون الامتداد). إذا كان ملف PS/EPS المدخل صفحة واحدة فسيكون بالضبط اسم الملف، وإلا \"\\_[n]\" حيث \"n\" - رقم الصفحة بدءًا من 0، سيتم إلحاق لاحقة إلى ذلك. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"option\". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


يحفظ ملف PS/EPS إلى مصفوفات بايتات الصور.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | يحتوي على المعلمات الضرورية لحفظ الصورة والعلامات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

**Returns:**
byte[][] - بايتات الصور. مصفوفة بايت واحدة لكل صفحة.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


يحفظ ملف PS/EPS إلى دفق PDF إخراج.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | دفق PDF للإخراج. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


يحفظ ملف PS/EPS إلى ملف PDF.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | مسار ملف PDF للإخراج. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | يحتوي على علامات تحدد إخراج الأخطاء التي تم طرحها أثناء التحويل. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


يحفظ كائن BufferedImage إلى ملف EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | الصورة. |
| epsStream | java.io.OutputStream | تدفق إخراج EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | يحتوي على المعلمات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


يحفظ كائن BufferedImage إلى ملف EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | الصورة. |
| epsFilePath | java.lang.String | مسار ملف EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | يحتوي على المعلمات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


يحفظ صورة PNG/JPEG/BMP/GIF من دفق الإدخال إلى دفق إخراج EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageStream | java.io.InputStream | تدفق إدخال الصورة. |
| epsStream | java.io.OutputStream | تدفق إخراج EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | يحتوي على المعلمات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


يحفظ صورة PNG/JPEG/BMP/GIF من ملف إلى ملف EPS.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFilePath | java.lang.String | مسار ملف الصورة. |
| epsFilePath | java.lang.String | مسار ملف EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | يحتوي على المعلمات التي تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


يضيف مقياسًا إلى حالة الرسومات الحالية (scale current matrix).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xScale | float | المقياس في المحور X. |
| yScale | float | المقياس في المحور Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


يحدد تدفق إدخال.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| is | java.io.InputStream | تدفق الإدخال لملف PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


يضبط معلمات جهاز الصفحة (انظر المشغل \"setpagedevice\" في مواصفات PostScript). من بين هذه المعلمات يمكن أن تكون حجم الصفحة واللون وغيرها.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | معلمات الصفحة. في هذا القاموس يمكن أن تكون حجم الصفحة واللون إلخ. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


يضبط حجم الصفحة. لإنشاء صفحات بأحجام مختلفة في مستند واحد استخدم طريقة  setPageDevice  مباشرةً بعد هذه الطريقة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float | عرض الصفحة في ملف PostScript الناتج. |
| height | float | ارتفاع الصفحة في ملف PostScript الناتج. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


يضبط الطلاء في حالة الرسومات الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| paint | java.awt.Paint | الطلاء. يمكن أن يكون أي فئة فرعية من الفئة  Paint  الموجودة في JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


يضبط الحد في حالة الرسومات الحالية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stroke | java.awt.Stroke | الخط. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


عيّن التحويل الحالي إلى هذا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | التحويل. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


يضيف تحويل قص إلى حالة الرسومات الحالية (shear current matrix).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| shx | float | القص في المحور X. |
| shy | float | القص في المحور Y. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


يضيف تحويلًا إلى حالة الرسومات الحالية (concatenates this matrix with current one).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | التحويل. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


يضيف إزاحة إلى حالة الرسومات الحالية (translates current matrix).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإزاحة في اتجاه X. |
| y | float | الإزاحة في اتجاه Y. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


يكتب استعادة حالة الرسومات الحالية (انظر مواصفات PostScript للمشغل "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


يكتب حفظ حالة الرسومات الحالية (انظر مواصفات PostScript للمشغل "gsave").

