---
title: Class PreprocessingFilter
second_title: Aspose.OCR لمرجع .NET API
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter فصل. الفئة الأساسية لأوامر معالجة الصور.
type: docs
weight: 170
url: /ar/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

الفئة الأساسية لأوامر معالجة الصور.

الفئة الأساسية لأوامر معالجة الصور.

```csharp
public class PreprocessingFilter : IEnumerable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Constructor |

## طُرق

| اسم | وصف |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | تمكين استخدام شبكة عصبية إضافية لتحسين الصورة - تقليل التشويش . مفيد للصور التي تحتوي على نتائج مسح ضوئي ، وتشويه ، وبقع ، وموهجات ، وتدرجات ، وعناصر غريبة . |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | تمكين استخدام شبكة عصبية إضافية لتحسين جزء الصورة - تقليل التشويش . مفيد للصور التي تحتوي على نتائج مسح ضوئي ، وتشويه ، وبقع ، وموهجات ، وتدرجات ، وعناصر غريبة . |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | يصحح التشوهات الهندسية في الصورة تلقائيًا. كثرة الموارد بشكل كبير! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | تمكين التصحيح التلقائي لانحراف الصورة. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | تمكين التصحيح التلقائي لانحراف جزء الصورة. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | تحويل صورة إلى صورة بالأبيض والأسود. الصور الثنائية هي الصور التي تحتوي وحدات البكسل على قيمتي كثافة محتملتين فقط. يتم عرضها عادةً باللونين الأسود والأبيض. عدديًا ، غالبًا ما تكون القيمتان 0 للأسود و 255 للأبيض . يتم إنتاج الصور الثنائية بواسطة عتبة الصورة تلقائيًا. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | يحول جزءًا من الصورة إلى صورة بالأبيض والأسود. الصور الثنائية هي الصور التي تحتوي وحدات البكسل على قيمتي كثافة محتملتين فقط. يتم عرضها عادةً باللونين الأسود والأبيض. عدديًا ، غالبًا ما تكون القيمتان 0 للأسود و 255 للأبيض . يتم إنتاج الصور الثنائية بواسطة عتبة الصورة تلقائيًا. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | مرشح تصحيح التباين . |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | مرشح تصحيح التباين لجزء من الصورة. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | يضيف التوسيع وحدات بكسل إلى حدود الكائنات في الصورة. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | يضيف التوسيع بكسلات إلى حدود الكائنات في جزء من الصورة. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | قلب الألوان تلقائيًا في صورة المستند. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | قلب الألوان تلقائيًا في جزء من الصورة. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | يتم تشغيل المرشح المتوسط خلال كل عنصر من عناصر الصورة واستبدال كل بكسل بمتوسط وحدات البكسل المجاورة له. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | يتم تشغيل المرشح المتوسط من خلال كل عنصر في جزء الصورة واستبدال كل بكسل بمتوسط وحدات البكسل المجاورة له. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | إعادة تحجيم الصورة - دقة الصورة ذات المستوى الأعلى أو الأصغر . InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | إعادة تحجيم الصورة - دقة صورة أعلى أو تصغير الحجم . |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | تدوير الصورة الأصلية . |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | تدوير جزء من الصورة . |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | إعادة تحجيم الصورة - دقة الصورة ذات المستوى الأعلى أو الأصغر . InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | إعادة تحجيم الصورة - دقة صورة أعلى أو تصغير الحجم . |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | قم بإنشاء صورة ثنائية بناءً على تعيين قيمة حدية على كثافة البكسل للصورة الأصلية. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | قم بإنشاء جزء ثنائي من الصورة بناءً على تعيين قيمة حدية على كثافة البكسل لجزء الصورة الأصلي. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | تحويل الصورة إلى صورة ذات تدرج رمادي. تحتوي الصورة ذات التدرج الرمادي على 256 مستوى من الضوء في الصورة (0 إلى 255) . |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | أضف عامل التصفية الجديد إلى المجموعة لمزيد من تشغيل جميع العمليات. الاتساق في مسائل المجموعة. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | لإدراك واجهة قابلة للتعديل. |

### أنظر أيضا

* مساحة الاسم [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* المجسم [Aspose.OCR](../../)


