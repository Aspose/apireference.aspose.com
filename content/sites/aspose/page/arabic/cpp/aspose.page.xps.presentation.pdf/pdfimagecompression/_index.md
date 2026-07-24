---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression تعداد"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression تعداد. يحدد نوع الضغط المطبق على الصور في ملف PDF في C++."
type: docs
weight: 700
url: /ar/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


يحدد نوع الضغط المطبق على الصور في ملف PDF.

```cpp
enum class PdfImageCompression
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Auto | 0 | يختار تلقائيًا أكثر ضغط مناسب لكل صورة. |
| لا شيء | 1 | يحفظ بايتات الصورة الخام مما يؤدي إلى أحجام ملفات PDF أكبر. |
| Rle | 2 | ضغط طول التشغيل. |
| Flate | 3 | ضغط Flate. |
| LzwBaselinePredictor | 4 | يقتصر اختيار المتنبئ على متنبئ PNG Paeth لتسريع العملية. في الممارسة العملية يحقق أداءً مفاجئًا جيدًا. أفضل من [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | اختيار المتنبئ أكثر تعقيدًا ويجب أن ينتج أحجام صور أصغر ولكنه يستغرق وقتًا أطول. |
| Jpeg | 6 | ضغط JPEG. لا يدعم الشفافية. |

## انظر أيضًا

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
