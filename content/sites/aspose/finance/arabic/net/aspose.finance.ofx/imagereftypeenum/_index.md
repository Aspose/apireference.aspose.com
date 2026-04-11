---
title: ImageRefTypeEnum
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تعداد نوع مرجع الصورة.
type: docs
weight: 2320
url: /ar/net/aspose.finance.ofx/imagereftypeenum/
---
## ImageRefTypeEnum enumeration

تعداد نوع مرجع الصورة.

```csharp
public enum ImageRefTypeEnum
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| OPAQUE | `0` | يتم الوصول إلى الصورة عبر طلب OFX صريح [`ImageRequest`](../../aspose.finance.ofx.image/imagerequest) ، والذي سيتبعه بيانات الصورة. |
| URL | `1` | يتم الوصول إلى الصورة مباشرةً عبر عنوان URL المقدم. لا يمكن استرجاع الصورة عبر طلب صورة OFX. التوقع هو أن العميل لن يقدم المصادقة وسيقوم ببساطة بمتابعة عنوان URL المقدم. |
| FORMURL | `2` | يتم الوصول إلى الصورة مباشرةً عبر عنوان URL مشفر. لا يمكن استرجاع الصورة عبر طلب صورة OFX. التوقع هو أن العميل سيُرسل المصادقة إلى الخادم. |

### انظر أيضًا

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
