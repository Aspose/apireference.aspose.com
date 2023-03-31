---
title: Class TemplateProcessor
second_title: Aspose.OMR لمرجع .NET API
description: Aspose.OMR.Api.TemplateProcessor فصل. فئة لمعالجة القوالب والصور .  كل مثيل من هذه الفئة يعمل مع قالب ريال عماني واحد . إنه قادر على التعرف على صور القالب المحدد في المنشئ.
type: docs
weight: 30
url: /ar/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

فئة لمعالجة القوالب والصور .  كل مثيل من هذه الفئة يعمل مع قالب ريال عماني واحد . إنه قادر على التعرف على صور القالب المحدد في المنشئ.

```csharp
public class TemplateProcessor
```

## طُرق

| اسم | وصف |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | تحديث نتيجة التعرف باستخدام معلمات دقيقة. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | يتعرف على الصور من المجلد |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | التعرف على الصورة من تيار الذاكرة |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | يتعرف على الصورة |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | يتعرف على قالب متعدد الصفحات |

### أمثلة

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### أنظر أيضا

* مساحة الاسم [Aspose.OMR.Api](../../aspose.omr.api/)
* المجسم [Aspose.OMR](../../)


