---
title: EmfPointEnum
second_title: Aspose.Imaging لمرجع NET API
description: يتم استخدام تعداد النقاط لتحديد كيفية استخدام نقطة في استدعاء الرسم.
type: docs
weight: 2790
url: /ar/net/aspose.imaging.fileformats.emf.emf.consts/emfpointenum/
---
## EmfPointEnum enumeration

يتم استخدام تعداد النقاط لتحديد كيفية استخدام نقطة في استدعاء الرسم.

```csharp
[Flags]
public enum EmfPointEnum : byte
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| PT_CLOSEFIGURE | `1` | يمكن دمج نوع PT_LINETO أو PT_BEZIERTO مع هذه القيمة باستخدام عامل التشغيل bitwise أو للإشارة إلى أن النقطة المقابلة هي النقطة الأخيرة في الشكل وأن الرقم مغلق |
| PT_LINETO | `2` | يحدد أنه يجب رسم خط من الموضع الحالي إلى هذه النقطة ، والذي يصبح بعد ذلك الموضع الحالي الجديد |
| PT_BEZIERTO | `4` | تحدد أن هذه النقطة هي نقطة تحكم أو نقطة نهاية لمنحنى بيزير. |
| PT_MOVETO | `6` | تحديد أن هذه النقطة تبدأ شكلًا منفصلاً. تصبح هذه النقطة هي الموضع الحالي الجديد. |

### أنظر أيضا

* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.Emf.Consts](../../aspose.imaging.fileformats.emf.emf.consts)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
