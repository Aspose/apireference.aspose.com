---
title: EmfPlusDrawImage
second_title: Aspose.Imaging لمرجع NET API
description: يحدد سجل EmfPlusDrawImage رسم صورة بحجم.
type: docs
weight: 5960
url: /ar/net/aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/
---
## EmfPlusDrawImage class

يحدد سجل EmfPlusDrawImage رسم صورة بحجم.

```csharp
public sealed class EmfPlusDrawImage : EmfPlusDrawingRecordType
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [EmfPlusDrawImage](emfplusdrawimage)(EmfPlusRecord) | يقوم بتهيئة مثيل جديد لملف[`EmfPlusDrawImage`](../emfplusdrawimage) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Compressed](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/compressed) { get; set; } | الحصول على أو تعيين قيمة تشير إلى ما إذا كانت PointData مضغوطة أم لا. إذا تم تعيينها ، تحتوي RectData على كائن EmfPlusRect (القسم 2.2.2.38) . إذا تم مسحها ، تحتوي RectData على كائن EmfPlusRectF (القسم 2.2.2.39) . |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 32 بت والذي يجب أن يحدد عدد 32 بت المحاذي للعدد بايت من البيانات في حقل RecordData التالي. لا يتضمن هذا الرقم رأس السجل 12 بايت. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 16 بت يحتوي على معلومات لبعض السجلات حول كيفية تنفيذ العملية وبنية السجل. |
| [ImageAttributesId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/imageattributesid) { get; set; } | الحصول على أو تعيين معرف سمات الصورة عدد صحيح بدون إشارة 32 بت يحدد فهرس كائن EmfPlusImageAttributes اختياري (القسم 2.2.1.5) في EMF + Object Table . |
| [ObjectId](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/objectid) { get; set; } | الحصول على أو تحديد معرف الكائن . فهرس كائن EmfPlusImage (القسم 2.2.1.4) في EMF + Object Table ، والذي يحدد الصورة المراد عرضها. يجب أن تكون القيمة من صفر إلى 63 ، شاملة . |
| [RectData](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/rectdata) { get; set; } | الحصول على أو تعيين البيانات المستقيمة إما كائن EmfPlusRect أو EmfPlusRectF يحدد المربع المحيط للصورة. يتم تحجيم جزء الصورة المحدد بواسطة حقل SrcRect ليلائم هذا المستطيل. |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | الحصول على أو تعيين عدد صحيح بدون إشارة 32 بت يحدد عدد محاذاة 32 بت من بايت في السجل بأكمله ، بما في ذلك رأس السجل 12 بايت والبيانات الخاصة بالسجل. |
| [SrcRect](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/srcrect) { get; set; } | الحصول على أو تعيين المصدر rect كائن EmfPlusRectF يحدد جزءًا من الصورة ليتم عرضه. يتم تحجيم جزء الصورة المحدد بواسطة هذا المستطيل ليلائم الوجهة المستطيل المحدد بواسطة حقل RectData. |
| [SrcUnit](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusdrawimage/srcunit) { get; set; } | الحصول على أو تعيين الوحدة المصدر عدد صحيح موقع 32 بت يحدد وحدات حقل SrcRect . يجب أن يكون عضو UnitTypePixel في تعداد نوع الوحدة (القسم 2.1.1.33) . |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | الحصول على عدد صحيح بدون إشارة 16 بت يحدد نوع السجل. |

### أنظر أيضا

* class [EmfPlusDrawingRecordType](../emfplusdrawingrecordtype)
* مساحة الاسم [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
