---
title: RenderingOptions.AnalyzeFonts
second_title: Aspose.PDF for .NET API Reference
description: خاصية RenderingOptions. تستبدل الخطوط حسب الحاجة لضمان عرض جميع الأحرف في النص. يتبع خوارزمية استبدال الخطوط هذه الخطوات 1. إذا قام المستخدم بتعيين خاصية DefaultFontName بشكل صريح، تحقق مما إذا كان الخط المحدد يمكنه عرض الأحرف المطلوبة. 2. إذا لم يتم تعيين خط محدد من قبل المستخدم، ابحث في الخطوط المضافة عبر !FontRepository.Sources. 3. تحليل النص لتحديد الأبجدية أو الكتابة الخاصة به واقتراح أسماء الخطوط وفقًا لذلك. حاول تحديد واستخدام هذه الخطوط من النظام. 4. كخيار احتياطي، ابحث في النظام عن أي خط قادر على عرض الأحرف المطلوبة.
type: docs
weight: 20
url: /ar/net/aspose.pdf/renderingoptions/analyzefonts/
---
## خاصية RenderingOptions.AnalyzeFonts

تستبدل الخطوط حسب الحاجة لضمان عرض جميع الأحرف في النص. يتبع خوارزمية استبدال الخطوط هذه الخطوات: 1. إذا قام المستخدم بتعيين خاصية DefaultFontName بشكل صريح، تحقق مما إذا كان الخط المحدد يمكنه عرض الأحرف المطلوبة. 2. إذا لم يتم تعيين خط محدد من قبل المستخدم، ابحث في الخطوط المضافة عبر !:FontRepository.Sources. 3. تحليل النص لتحديد الأبجدية أو الكتابة الخاصة به واقتراح أسماء الخطوط وفقًا لذلك. حاول تحديد واستخدام هذه الخطوط من النظام. 4. كخيار احتياطي، ابحث في النظام عن أي خط قادر على عرض الأحرف المطلوبة.

```csharp
public bool AnalyzeFonts { get; set; }
```

### انظر أيضًا

* class [RenderingOptions](../)
* namespace [Aspose.Pdf](../../../aspose.pdf/)
* assembly [Aspose.PDF](../../../)