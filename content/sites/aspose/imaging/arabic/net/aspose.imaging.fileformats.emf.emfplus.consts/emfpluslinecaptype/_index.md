---
title: EmfPlusLineCapType
second_title: Aspose.Imaging لمرجع NET API
description: يحدد تعداد LineCapType أنواع الأحرف الاستهلالية للسطر لاستخدامها في نهايات الأسطر المرسومة باستخدام أقلام الرسومات.
type: docs
weight: 4890
url: /ar/net/aspose.imaging.fileformats.emf.emfplus.consts/emfpluslinecaptype/
---
## EmfPlusLineCapType enumeration

يحدد تعداد LineCapType أنواع الأحرف الاستهلالية للسطر لاستخدامها في نهايات الأسطر المرسومة باستخدام أقلام الرسومات.

```csharp
public enum EmfPlusLineCapType
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| LineCapTypeFlat | `0` | تحديد غطاء خط تربيعي. يجب أن تكون نهاية السطر هي آخر نقطة في السطر. |
| LineCapTypeSquare | `1` | تحديد سقف لخط مربع. يجب أن يقع مركز المربع في آخر نقطة في السطر. عرض المربع هو عرض الخط . |
| LineCapTypeRound | `2` | تحديد غطاء خط دائري. يجب أن يقع مركز الدائرة في آخر نقطة في الخط. قطر الدائرة هو عرض الخط . |
| LineCapTypeTriangle | `3` | تحديد غطاء خط مثلث. يجب أن تكون قاعدة المثلث موجودة في آخر نقطة في الخط. قاعدة المثلث هي عرض الخط. |
| LineCapTypeNoAnchor | `16` | تحديد أن نهاية السطر غير مثبتة . |
| LineCapTypeSquareAnchor | `17` | تحديد أن نهاية السطر مثبتة بغطاء خط مربع. يجب أن يقع مركز المربع في آخر نقطة في السطر. ارتفاع وعرض المربع هما عرض الخط . |
| LineCapTypeRoundAnchor | `18` | تحديد أن نهاية السطر مثبتة بغطاء خط دائري. يجب أن يقع مركز الدائرة في آخر نقطة في الخط. يجب أن تكون الدائرة أكبر من الخط. |
| LineCapTypeDiamondAnchor | `19` | تحديد أن نهاية السطر مثبتة بغطاء خط على شكل معين ، وهو مربع يتحول بزاوية 45 درجة. يجب أن يقع مركز الماس في آخر نقطة في السطر. يجب أن يكون الماس أعرض من الخط . |
| LineCapTypeArrowAnchor | `20` | تحديد أن نهاية السطر مرتبطة بشكل رأس سهم. يجب أن تكون نقطة رأس السهم موجودة في آخر نقطة في السطر. يجب أن يكون رأس السهم أعرض من الخط. |
| LineCapTypeAnchorMask | `240` | يتم استخدام القناع للتحقق مما إذا كان غطاء الخط هو غطاء التثبيت. |
| LineCapTypeCustom | `255` | تحديد سقف مخصص للسطر . |

### ملاحظات

يتم تحديد قبعات خطوط الرسومات بواسطة[`EmfPlusPen`](../../aspose.imaging.fileformats.emf.emfplus.objects/emfpluspen) كائنات (القسم 2.2.1.7) .

### أنظر أيضا

* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.EmfPlus.Consts](../../aspose.imaging.fileformats.emf.emfplus.consts)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
