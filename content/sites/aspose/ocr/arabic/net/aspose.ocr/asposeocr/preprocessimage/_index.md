---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. استخدم المعالجة المسبقة للصور لتحسين دقة التعرف الضوئي على الحروف . أنشئ قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية PreprocessingFilter filter  new PreprocessingFilter  PreprocessingFilter.  تصفية المعالجة المسبقة. الحد الفاصل 150 PreprocessingFilter.Binarize  PreprocessingFilter.Rotate 180 PreprocessingFilter.Resize 30003000 Asprose.OCR.FilterFilters.Inarize  PreprocessingFilter.Dilate   أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط.
type: docs
weight: 100
url: /ar/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

استخدم المعالجة المسبقة للصور لتحسين دقة التعرف الضوئي على الحروف . أنشئ قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | المسار الكامل للصورة. |
| filters | PreprocessingFilter | مرشحات تحسين الصورة[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### قيمة الإرجاع

دفق بالصورة المعدلة حتى تتمكن من حفظها أو التعرف عليها.

### أنظر أيضا

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

استخدم المعالجة المسبقة للصور لتحسين دقة التعرف الضوئي على الحروف . أنشئ قائمة بالفلاتر التي سيتم تطبيقها على صورة الإدخال بالترتيب الذي تحدده. مثال لإنشاء عوامل التصفية: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter. ، تصفية المعالجة المسبقة. الحد الفاصل (150)، PreprocessingFilter.Binarize ()، PreprocessingFilter.Rotate (180)، PreprocessingFilter.Resize (3000،3000، Asprose.OCR.FilterFilters.Inarize) )، PreprocessingFilter.Dilate () }؛ أنت لست بحاجة إلى كل منهم. قم بتعيين ما تحتاجه فقط.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | تيار الذاكرة الذي يحتوي على الصورة. |
| filters | PreprocessingFilter | مرشحات تحسين الصورة[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### قيمة الإرجاع

دفق بالصورة المعدلة حتى تتمكن من حفظها أو التعرف عليها.

### أنظر أيضا

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


