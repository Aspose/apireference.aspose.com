---
title: BillStatusCodeEnum
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تعداد رمز حالة Bill.
type: docs
weight: 1470
url: /ar/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

تعداد رمز حالة Bill.

```csharp
public enum BillStatusCodeEnum
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| WITHDRAWN | `0` | المُصدر أو الناشر لم يعد يرغب في عرض هذه الفاتورة. |
| UNDELIVERABLE | `1` | فشلت محاولات تسليم هذه الفاتورة للمستهلك في الوقت المناسب. عادةً لا يُستخدم هذا الحالة عند تقديم فاتورة للمستهلك. ومع ذلك، تغطي الإشعارات التي تستخدم هذه الحالة العديد من الحالات المفيدة. |
| NEW | `2` | لم يرسل الخادم الفاتورة إلى العميل أو وكيل العميل. هذا هو رمز الحالة الأولي للفاتورة. |
| DELIVERED | `3` | أرسل الخادم الفاتورة إلى عميل أو وكيل عميل. |
| VIEWED | `4` | لقد رأى العميل الفاتورة. يعني الحالة السابقة كانت DELIVERED. |
| RETIRED | `5` | لم يعد العميل يرغب في رؤية هذه الفاتورة. يعني الحالة السابقة كانت DELIVERED. |

### انظر أيضًا

* namespace [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
