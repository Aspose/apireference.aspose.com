---
title: EmfPlusDrawPath
second_title: Aspose.Imaging لمرجع NET API
description: يحدد سجل EmfPlusDrawPath رسم مسار رسومي.
type: docs
weight: 5990
url: /ar/net/aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawpath/
---
## EmfPlusDrawPath class

يحدد سجل EmfPlusDrawPath رسم مسار رسومي.

```csharp
public sealed class EmfPlusDrawPath : EmfPlusDrawingRecordType
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [EmfPlusDrawPath](emfplusdrawpath)(EmfPlusRecord) | يقوم بتهيئة مثيل جديد لملف[`EmfPlusDrawPath`](../emfplusdrawpath) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 32 بت والذي يجب أن يحدد عدد 32 بت المحاذي للعدد بايت من البيانات في حقل RecordData التالي. لا يتضمن هذا الرقم رأس السجل 12 بايت. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 16 بت يحتوي على معلومات لبعض السجلات حول كيفية تنفيذ العملية وبنية السجل. |
| [ObjectId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawpath/objectid) { get; set; } | الحصول على أو تحديد معرف الكائن . فهرس كائن EmfPlusPath (القسم 2.2.1.6) للرسم ، في EMF + Object Table. يجب أن تكون القيمة من صفر إلى 63 ، شاملة . |
| [PenId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawpath/penid) { get; set; } | الحصول على أو تعيين معرّف القلم عدد صحيح بدون إشارة 32 بت يحدد فهرسًا في EMF + Object Table لكائن EmfPlusPen (القسم 2.2.1.7) لاستخدامه في رسم EmfPlusPath . يجب أن تكون القيمة من صفر إلى 63 ، بما في ذلك |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 32 بت يحدد عدد محاذاة 32 بت من بايت في السجل بأكمله ، بما في ذلك رأس السجل 12 بايت والبيانات الخاصة بالسجل. |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | الحصول على عدد صحيح بدون إشارة 16 بت يحدد نوع السجل. |

### أنظر أيضا

* class [EmfPlusDrawingRecordType](../emfplusdrawingrecordtype)
* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
