---
title: Class AsposeOcr
second_title: Aspose.OCR لمرجع .NET API
description: Aspose.OCR.AsposeOcr فصل. واجهة برمجة التطبيقات الرئيسية لمكتبة Aspose OCR
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
| [AsposeOcr](asposeocr/#constructor)() | يقوم بتهيئة مثيل جديد لملف`AsposeOcr` class. مُنشئ فارغ . |
| [AsposeOcr](asposeocr/#constructor_1)(string) | يقوم بتهيئة مثيل جديد لملف`AsposeOcr` class. اضبط الأحرف المسموح بها بخاصية الأبجدية. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | حساب زاوية انحراف الصورة. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | حساب زاوية انحراف الصورة. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | حساب زاوية الانحراف لصورة من URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | تحقق مما إذا كانت الصورتان تحتويان على نفس النص. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | تصحيح النص (استبدال الكلمات التي بها أخطاء إملائية) . |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | تحقق مما إذا كان نص الصورة يطابق التعبير العادي المقدم. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | تحقق مما إذا كانت الصورة تحتوي على جزء النص المقدم. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | قارن النصوص الموجودة على الصورتين وأعد رقمًا يمثل مدى تشابههما (من 0 إلى 1) . |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | استخدم المعالجة المسبقة للصور لتحسين دقة التعرف الضوئي على الحروف . أنشئ قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | استخدم المعالجة المسبقة للصور لتحسين دقة التعرف الضوئي على الحروف . أنشئ قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | يتعرف على لوحة السيارة. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | يتعرف على لوحة السيارة. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | التعرف على النص من صورة DJVU متعددة الصفحات. يتعرف على ملف DJVU مع القدرة على التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . يدعم DJVU فقط. لا يدعم أنواع الصور الأخرى. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | التعرف على النص من صورة DJVU متعددة الصفحات. يتعرف على ملف DJVU مع القدرة على التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . يدعم DJVU فقط. لا يدعم أنواع الصور الأخرى. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | يتعرف على النص الموجود في بطاقة الهوية. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | يتعرف على النص الموجود في بطاقة الهوية. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | يتعرف على النص على الصورة. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | يتعرف على النص على الصورة. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | يتعرف على النص على الصورة.  يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../recognitionsettings/) . يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | يتعرف على النص على الصورة. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | يتعرف على النص على الصورة. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | يتعرف على النص على الصورة. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | التعرف على النص الموجود في الصورة بجودة جيدة. لا يستخدم تصحيح الانحراف واكتشاف المناطق. يعمل في الوضع السريع. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | التعرف على النص الموجود في الصورة بجودة جيدة. لا يستخدم تصحيح الانحراف واكتشاف المناطق. يعمل في الوضع السريع. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | يتعرف على النص في الصورة المقدمة في نوع base64 . |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | يتعرف على النص الموجود في الصورة المقدم من رابط URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | يتعرف على النص الموجود في صورة الفاتورة . |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | يتعرف على النص الموجود في صورة الفاتورة . |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | يتعرف على الصورة التي تحتوي على سطر واحد من النص. لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | يتعرف على الصورة التي تحتوي على سطر واحد من النص. لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | يتعرف على صور متعددة من القائمة بالإعدادات الافتراضية. المحفوظات والمجلدات غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | يتعرف على صور متعددة معبأة في أرشيف مضغوط أو من مجلد بإعدادات افتراضية. المحفوظات والمجلدات المتداخلة غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | يتعرف على صور متعددة من القائمة .  المحفوظات والمجلدات غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | يتعرف على صور متعددة معبأة في أرشيف ZIP أو من المجلد. المحفوظات والمجلدات المتداخلة غير مدعومة. أقصى قدر من الصور المعالجة هو 20. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | يتعرف على النص الموجود في جوازات السفر . |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | يتعرف على النص الموجود في جوازات السفر . |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`RecognitionSettings`](../recognitionsettings/) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث . |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | التعرف على النص من ملف pdf الممسوح ضوئيًا (استخراج الصور). يتعرف على ملف pdf مع إمكانية التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . يدعم ملفات PDF الممسوحة ضوئيًا فقط. لا يدعم ملف PDF القابل للبحث . |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | يتعرف على النص على الصورة. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | يتعرف على النص على الصورة. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | التعرف على النص من صورة TIFF متعددة الصفحات. يتعرف على ملف TIFF مع إمكانية التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . يدعم TIFF (TIF) فقط. لا يدعم أنواع الصور الأخرى. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | التعرف على النص من صورة TIFF متعددة الصفحات. يتعرف على ملف TIFF مع إمكانية التحديد[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . يدعم TIFF (TIF) فقط. لا يدعم أنواع الصور الأخرى. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | يسمح بالحصول على مستند متعدد الصفحات من قائمة كائنات RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | يسمح بالحصول على مستند متعدد الصفحات من قائمة كائنات RecognitionResult |

## الأحداث

| اسم | وصف |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | حدث لتتبع تقدم التعرف على الصور متعددة الصفحات. |

### أنظر أيضا

* مساحة الاسم [Aspose.OCR](../../aspose.ocr/)
* المجسم [Aspose.OCR](../../)


