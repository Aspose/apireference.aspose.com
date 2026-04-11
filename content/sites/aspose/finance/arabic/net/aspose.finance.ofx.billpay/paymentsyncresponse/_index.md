---
title: PaymentSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة الدفع.
type: docs
weight: 1250
url: /ar/net/aspose.finance.ofx.billpay/paymentsyncresponse/
---
## PaymentSyncResponse class

فئة استجابة مزامنة الدفع.

```csharp
public class PaymentSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [PaymentSyncResponse](paymentsyncresponse)() | يُنشئ مثيلاً جديدًا للفئة [`PaymentSyncResponse`](../paymentsyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.billpay/paymentsyncresponse/bankaccountfrom) { get; set; } | يحصل أو يعيّن الـ from لـ [`BankAccount`](../../aspose.finance.ofx/bankaccount). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentsyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [PaymentTransactionResponses](../../aspose.finance.ofx.billpay/paymentsyncresponse/paymenttransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة [`PaymentTransactionResponse`](../paymenttransactionresponse). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
