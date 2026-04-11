---
title: StopCheckSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة إيقاف الفحص.
type: docs
weight: 750
url: /ar/net/aspose.finance.ofx.bank/stopchecksyncresponse/
---
## StopCheckSyncResponse class

فئة استجابة مزامنة إيقاف الفحص.

```csharp
public class StopCheckSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [StopCheckSyncResponse](stopchecksyncresponse)() | ينشئ نسخة جديدة من الفئة [`StopCheckSyncResponse`](../stopchecksyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.bank/stopchecksyncresponse/bankaccountfrom) { get; set; } | يحصل أو يعيّن الـ from لـ [`BankAccount`](../../aspose.finance.ofx/bankaccount). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.bank/stopchecksyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [StopCheckTransactionResponses](../../aspose.finance.ofx.bank/stopchecksyncresponse/stopchecktransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة [`StopCheckTransactionResponse`](../stopchecktransactionresponse). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
