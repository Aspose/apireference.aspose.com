---
title: PayeeSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة قائمة المستفيدين.
type: docs
weight: 1020
url: /ar/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

فئة استجابة مزامنة قائمة المستفيدين.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse)() | يُنشئ مثيلاً جديدًا من الفئة [`PayeeSyncResponse`](../payeesyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة الـ [`PayeeTransactionResponse`](../payeetransactionresponse). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
