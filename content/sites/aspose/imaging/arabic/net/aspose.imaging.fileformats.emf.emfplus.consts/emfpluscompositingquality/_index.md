---
title: EmfPlusCompositingQuality
second_title: Aspose.Imaging لمرجع NET API
description: تعداد الجودة يحدد مستويات الجودة لإنشاء صور مركبة
type: docs
weight: 4730
url: /ar/net/aspose.imaging.fileformats.emf.emfplus.consts/emfpluscompositingquality/
---
## EmfPlusCompositingQuality enumeration

تعداد الجودة يحدد مستويات الجودة لإنشاء صور مركبة

```csharp
public enum EmfPlusCompositingQuality : byte
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| CompositingQualityDefault | `1` | لم يتم إجراء تصحيح جاما. يتحكم تصحيح جاما في السطوع والتباين الكليين للصورة. بدون تصحيح جاما ، يمكن أن تظهر الصور المركبة فاتحة جدًا أو مظلمة جدًا. |
| CompositingQualityHighSpeed | `2` | لم يتم إجراء تصحيح جاما. يفضل سرعة التركيب على حساب الجودة. من حيث النتيجة ، لا يوجد فرق بين هذه القيمة و CompositingQualityDefault . |
| CompositingQualityHighQuality | `3` | يتم إجراء تصحيح جاما. يتم تفضيل جودة التركيب على حساب السرعة. |
| CompositingQualityGammaCorrected | `4` | قم بتمكين تصحيح جاما لتركيب عالي الجودة بسرعة أقل. من حيث النتيجة ، لا يوجد فرق بين هذه القيمة و CompositingQualityHighQuality . |
| CompositingQualityAssumeLinear | `5` | لم يتم إجراء تصحيح جاما ؛ ومع ذلك ، فإن استخدام القيم الخطية يؤدي إلى جودة أفضل من الافتراضية بسرعة أقل قليلاً. |

### أنظر أيضا

* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.EmfPlus.Consts](../../aspose.imaging.fileformats.emf.emfplus.consts)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
