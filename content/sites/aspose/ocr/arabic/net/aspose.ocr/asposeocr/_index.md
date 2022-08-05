---
title: AsposeOcr
second_title: Aspose.OCR لمرجع .NET API
description: واجهة برمجة التطبيقات الرئيسية لمكتبة Aspose OCR
type: docs
weight: 20
url: /ar/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

واجهة برمجة التطبيقات الرئيسية لمكتبة Aspose OCR

```csharp
public class AsposeOcr
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | يقوم بتهيئة مثيل جديد لملف[`AsposeOcr`](../asposeocr) class. مُنشئ فارغ . |
| [AsposeOcr](asposeocr#constructor_1)(string) | يقوم بتهيئة مثيل جديد لملف[`AsposeOcr`](../asposeocr) class. اضبط الأحرف المسموح بها بخاصية الأبجدية. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | حساب زاوية انحراف الصورة. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | حساب زاوية انحراف الصورة. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | حساب زاوية الانحراف لصورة من URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | تصحيح النص (استبدال الكلمات التي بها أخطاء إملائية) . |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. دعم GIF و PNG و JPEG و BMP و TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. دعم GIF و PNG و JPEG و BMP و TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | استخدم المعالجة المسبقة للصور لتحسين دقة OCR. قم بإنشاء قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | استخدم المعالجة المسبقة للصور لتحسين دقة OCR. قم بإنشاء قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | التعرف على النص من صورة DJVU متعددة الصفحات. يتعرف على ملف DJVU مع القدرة على التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings) . يدعم DJVU فقط. لا يدعم أنواع الصور الأخرى. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | يتعرف على النص على الصورة . |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | يتعرف على النص على الصورة . |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | يتعرف على النص على الصورة .  يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../recognitionsettings) . يدعم GIF و PNG و JPEG و BMP و TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | يتعرف على النص على الصورة . |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | التعرف على النص الموجود في الصورة بجودة جيدة. لا يستخدم تصحيح الانحراف واكتشاف المناطق. يعمل في الوضع السريع. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | التعرف على النص الموجود في الصورة بجودة جيدة. لا يستخدم تصحيح الانحراف واكتشاف المناطق. يعمل في الوضع السريع. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | يتعرف على النص الموجود في الصورة المقدم بواسطة رابط URI . |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | يتعرف على النص الموجود على الصورة المقدم من رابط URI. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | يتعرف على الصورة التي تحتوي على سطر واحد من النص. لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | يتعرف على الصورة التي تحتوي على سطر واحد من النص. لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | يتعرف على صور متعددة من القائمة بالإعدادات الافتراضية. المحفوظات والمجلدات غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | يتعرف على صور متعددة معبأة في أرشيف ZIP أو من مجلد بإعدادات افتراضية. المحفوظات والمجلدات المتداخلة غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | يتعرف على صور متعددة من القائمة .  المحفوظات والمجلدات غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | يتعرف على صور متعددة معبأة في أرشيف ZIP أو من المجلد. المحفوظات والمجلدات المتداخلة غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF . |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`RecognitionSettings`](../recognitionsettings) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث . |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`RecognitionSettings`](../recognitionsettings) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث . |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | التعرف على النص من صورة TIFF متعددة الصفحات. يتعرف على ملف TIFF مع إمكانية التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings) . يدعم TIFF (TIF) فقط. لا يدعم أنواع الصور الأخرى. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | يسمح بالحصول على مستند متعدد الصفحات من قائمة كائنات RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | يسمح بالحصول على مستند متعدد الصفحات من قائمة كائنات RecognitionResult |

### أنظر أيضا

* مساحة الاسم [Aspose.OCR](../../aspose.ocr)
* المجسم [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
