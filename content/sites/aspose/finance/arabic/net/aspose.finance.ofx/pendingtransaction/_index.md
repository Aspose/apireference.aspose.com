---
title: PendingTransaction
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: هذه الفئة تصف معاملة معلقة واحدة. تقوم بتحديد نوع المعاملة وتاريخ بدءها. يمكن للفئة أيضًا توفير معلومات إضافية لمساعدة العميل في التعرف على المعاملة رقم الشيك اسم المستفيد والمذكرة.
type: docs
weight: 4270
url: /ar/net/aspose.finance.ofx/pendingtransaction/
---
## PendingTransaction class

هذه الفئة تصف معاملة معلقة واحدة. تحدد نوع المعاملة وتاريخ بدءها. يمكن للفئة أيضًا توفير معلومات إضافية لمساعدة العميل على التعرف على المعاملة: رقم الشيك، اسم المستفيد، والمذكرة.

```csharp
public class PendingTransaction
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [PendingTransaction](pendingtransaction)() | ينشئ مثيلًا جديدًا من الفئة [`PendingTransaction`](../pendingtransaction). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [Currency](../../aspose.finance.ofx/pendingtransaction/currency) { get; set; } | يحصل أو يضبط الـ [`Currency`](./currency). |
| [ExpireDate](../../aspose.finance.ofx/pendingtransaction/expiredate) { get; set; } | يحصل أو يعيّن تاريخ انتهاء الحجز على هذه المعاملة. صالح فقط عندما يكون TransactionType هو HOLD. |
| [ExtendedName](../../aspose.finance.ofx/pendingtransaction/extendedname) { get; set; } | يحصل أو يعيّن الاسم الموسع للمستفيد أو وصف المعاملة. |
| [ImageDatas](../../aspose.finance.ofx/pendingtransaction/imagedatas) { get; set; } | يحصل أو يعيّن مجموعة [`ImageData`](../imagedata). |
| [Memo](../../aspose.finance.ofx/pendingtransaction/memo) { get; set; } | يحصل أو يعيّن المعلومات الإضافية |
| [Name](../../aspose.finance.ofx/pendingtransaction/name) { get; set; } | يحصل أو يعيّن اسم المستفيد أو وصف المعاملة. |
| [OriginCurrency](../../aspose.finance.ofx/pendingtransaction/origincurrency) { get; set; } | يحصل أو يضبط أصل الـ [`Currency`](./currency). |
| [ReferenceNumber](../../aspose.finance.ofx/pendingtransaction/referencenumber) { get; set; } | يحصل أو يعيّن رقم المرجع، إن وجد، للمعاملة. |
| [TransactionAmount](../../aspose.finance.ofx/pendingtransaction/transactionamount) { get; set; } | يحصل أو يعيّن مبلغ المعاملة. |
| [TransactionDate](../../aspose.finance.ofx/pendingtransaction/transactiondate) { get; set; } | يحصل أو يعيّن تاريخ بدء المعاملة. |
| [TransactionType](../../aspose.finance.ofx/pendingtransaction/transactiontype) { get; set; } | يحصل أو يعيّن نوع المعاملة. |

### انظر أيضًا

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
