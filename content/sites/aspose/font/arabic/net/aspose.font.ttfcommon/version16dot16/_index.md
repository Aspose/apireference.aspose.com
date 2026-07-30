---
title: "الفئة Version16Dot16"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfCommon.Version16Dot16. تمثل نوع البيانات Version16Dot16"
type: docs
weight: 970
url: /ar/net/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class

يمثل نوع البيانات Version16Dot16

```csharp
public class Version16Dot16 : ICloneable
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [Version16Dot16](version16dot16/#constructor)() | الباني |
| [Version16Dot16](version16dot16/#constructor_1)(ushort, ushort) | الباني |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [MajorNumber](../../aspose.font.ttfcommon/version16dot16/majornumber/) { get; set; } | يحصل أو يعيّن رقم الإصدار الرئيسي. القيمة ذات معنى فقط في التدوين الست عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: {0, 0, 80, 0}، والذي له تمثيل ست عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن `Version16Dot16` 0 و20480 على التوالي. وهذه القيم في الشكل الست عشري هي 0x0000 و0x5000. |
| [MinorNumber](../../aspose.font.ttfcommon/version16dot16/minornumber/) { get; set; } | يحصل أو يعيّن رقم الإصدار الفرعي. القيمة ذات معنى فقط في التدوين الست عشري، على سبيل المثال الإصدار 0.5 لـ 'maxp' في ملفات الخط الفعلية هو 4 بايت: {0, 0, 80, 0}، والذي له تمثيل ست عشري 0x00005000. بعد قراءة هذا الإصدار من ملف الخط، سيكون رقم الإصدار الرئيسي والفرعي للكائن `Version16Dot16` 0 و20480 على التوالي. وهذه القيم في الشكل الست عشري هي 0x0000 و0x5000. |
| [RawBytes](../../aspose.font.ttfcommon/version16dot16/rawbytes/) { get; } | يحصل على جميع البتات الخام لرقم إصدار Version16Dot16 كمصفوفة بايت بحجم 4 بايت. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| virtual [Clone](../../aspose.font.ttfcommon/version16dot16/clone/)() | إنشاء نسخة من كائن `Version16Dot16`. |
| override [ToString](../../aspose.font.ttfcommon/version16dot16/tostring/)() | إرجاع قيمة الإصدار كسلسلة منسقة. على سبيل المثال \"0.5\", \"1.1\", \"3.0\" إلخ. |

### انظر أيضاً

* namespace [Aspose.Font.TtfCommon](../../aspose.font.ttfcommon/)
* assembly [Aspose.Font](../../)


