---
title: Class RecognitionSettings
second_title: Aspose.OCR لمرجع .NET API
description: Aspose.OCR.RecognitionSettings فصل. إعدادات التعرف على الصورة . يحتوي على عناصر تسمح بتخصيص عملية التعرف .
type: docs
weight: 240
url: /ar/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

إعدادات التعرف على الصورة . يحتوي على عناصر تسمح بتخصيص عملية التعرف .

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | يقوم بتهيئة مثيل جديد لملف`RecognitionSettings`فئة بمجموعة كاملة من الخصائص. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | مجموعة الأحرف المسموح بها. لتحديد نوع الأحرف المسموح بها لنتيجة التعرف . |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | يسمح باستخدام خوارزمية إضافية لتصحيح التباين للصورة قبل التعرف عليها. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | تمكين استخدام شبكة عصبية إضافية لتحسين الصورة - تقليل التشويش . مفيد للصور التي تحتوي على نتائج مسح ضوئي ، وتشويه ، وبقع ، وموهجات ، وتدرجات ، وعناصر غريبة . |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | الحصول على أو تعيين علامة تشير إلى ما إذا كان يجب تمكين تصحيح الانحراف التلقائي للصورة. ممكّن (صحيح) افتراضيًا. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | يسمح بتحديد الوضع الأمثل لمناطق نوع المستند: مستند ، صورة ، نص عادي ، عمود ، صورة. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | تعيين قائمة سوداء لرموز التعرف. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | الحصول على أو تعيين اللغة المستخدمة في التعرف الضوئي على الحروف .  تحديد الأبجدية المستخدمة أثناء التعرف . متعدد اللغات افتراضيًا. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | يسمح بالتعرف على النص في الجداول (خطوط المناطق المحاطة). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | يسمح بتجهيز الصورة لـ OCR عن طريق ضبط طرق المعالجة المسبقة. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | الحصول على أو تعيين قائمة مناطق النص للمعالجة .  يسمح بتحديد المناطق التي تحتوي على نص يدويًا للتعرف بشكل أكثر دقة . إذا تم تعيين المناطق المخصصةDetectAreas و!:AutoSkew سيتم تجاهل الخصائص. تعطيل DetectAreas و AutoSkew . |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | يضبط التعرف على الصورة أحادي الخط. معطل (خطأ) افتراضيًا. قم بتعطيل كافة خطوات المعالجة المرتبطة بالتقسيم إلى أسطر. اضبط هذه المعلمة على "true" إذا كانت صورتك تحتوي على سطر واحد فقط. لتعطيل إعدادات RecognitionAreas ، لذلك سيتم تجاهل جميع إعدادات المناطق. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | الحصول على أو تعيين الزاوية بالدرجات لتدوير الصورة. سيؤدي تعيين هذه القيمة إلى تعطيل ملف[`AutoSkew`](../baserecognitionsettings/autoskew/) الخاصية ، بحيث لا يتم تطبيق تصحيح الانحراف التلقائي . صفر افتراضيًا. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | الحصول على أو تحديد عدد سلاسل الرسائل للمعالجة . بشكل افتراضي ، يعني 0 أن الصورة ستتم معالجتها بعدد الخيوط الذي يساوي عدد المعالجات . ThreadsCount = 1 يعني أنه سيتم معالجة الصورة في السلسلة الرئيسية. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | الحصول على أو تعيين قيمة حد مخصصة لترميز الصورة بالترميز . النطاق من 1 إلى 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | يسمح لك باستخدام خوارزميات إضافية خصيصًا للتعرف على الخطوط الصغيرة. مفيد للصور ذات الأحرف الصغيرة الحجم . |

### أنظر أيضا

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* مساحة الاسم [Aspose.OCR](../../aspose.ocr/)
* المجسم [Aspose.OCR](../../)


