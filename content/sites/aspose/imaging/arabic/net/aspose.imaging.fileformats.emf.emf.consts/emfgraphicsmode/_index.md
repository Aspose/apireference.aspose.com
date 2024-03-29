---
title: EmfGraphicsMode
second_title: Aspose.Imaging لمرجع NET API
description: يتم استخدام تعداد وضع الرسومات لتحديد كيفية تفسير بيانات الشكل مثل إحداثيات المستطيل.
type: docs
weight: 2680
url: /ar/net/aspose.imaging.fileformats.emf.emf.consts/emfgraphicsmode/
---
## EmfGraphicsMode enumeration

يتم استخدام تعداد وضع الرسومات لتحديد كيفية تفسير بيانات الشكل مثل إحداثيات المستطيل.

```csharp
public enum EmfGraphicsMode
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| GM_COMPATIBLE | `1` | يجب كتابة نص TrueType من اليسار إلى اليمين والجانب الأيمن لأعلى ، حتى إذا تم تدوير باقي الرسومات حول المحور السيني أو المحور الصادي بسبب التحول الحالي من العالم إلى الجهاز في سياق جهاز التشغيل . يجب فقط تحجيم ارتفاع النص. يجب رسم الأقواس باستخدام اتجاه القوس الحالي في سياق جهاز التشغيل ، ولكن يجب ألا تحترم التحويل الحالي من عالم إلى جهاز ، والذي قد يتطلب دورانًا على طول المحور السيني أو المحور الصادي . العالم- يجب تعديل التحويل إلى جهاز فقط عن طريق تغيير نطاقات وأصول النافذة ومنفذ العرض ، باستخدام سجلات EMR_SETWINDOWEXTEX (القسم 2.3.11.30) و EMR_SETVIEWPORTEXTEX (القسم 2.3.11.28) ، وسجلات EMR_SETWINDOWORGEX (القسم 2.3.11GEX.31) (القسم 2.3.11.30) على التوالي. b تغيير التحويل مباشرة باستخدام EMR_MODIFYWORLDTRANSFORM (القسم 2.3.12.1) أو سجلات EMR_SETWORLDTRANSFORM (القسم 2.3.12.2) قد لا يتم دعمها. |
| GM_ADVANCED | `2` | يجب أن يتوافق إخراج نص TrueType تمامًا مع التحول الحالي من العالم إلى الجهاز في سياق جهاز التشغيل. يجب رسم الأقواس في اتجاه عكس اتجاه عقارب الساعة في الفضاء العالمي ؛ ومع ذلك ، يجب أن تحترم كل من نقاط التحكم القوسية والأقواس نفسها تمامًا التحول الحالي من العالم إلى الجهاز في سياق جهاز التشغيل. يمكن تعديل التحويل من عالم إلى جهاز مباشرةً باستخدام سجلات EMR_MODIFYWORLDTRANSFORM أو EMR_SETWORLDTRANSFORM ، أو بشكل غير مباشر عن طريق تغيير نطاقات النافذة وإطار العرض والأصول ، باستخدام سجلات EMR_SETWINDOWEXTEX (القسم 2.3.11.30) و EMR_SETVIEWPORTEXTEX (القسم 2.3.11.28) ، سجلات و EMR_SETWINDOWORGEX (القسم 2.3.11.31) وسجلات EMR_SETVIPORT (القسم 2.3.11.31) وقسم EMR_SETVIEWPORT. ، على التوالي. في وضع الرسومات GM_ADVANCED ، يجب تضمين الحواف السفلية وأقصى اليمين عند رسم المستطيلات. |

### أنظر أيضا

* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.Emf.Consts](../../aspose.imaging.fileformats.emf.emf.consts)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
