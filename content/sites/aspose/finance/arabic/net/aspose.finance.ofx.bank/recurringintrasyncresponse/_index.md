---
title: RecurringIntraSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة المعاملة المتكررة داخل البنك.
type: docs
weight: 600
url: /ar/net/aspose.finance.ofx.bank/recurringintrasyncresponse/
---
## RecurringIntraSyncResponse class

فئة استجابة مزامنة المعاملة المتكررة داخل البنك.

```csharp
public class RecurringIntraSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [RecurringIntraSyncResponse](recurringintrasyncresponse)() | ينشئ مثيلاً جديدًا للفئة [`RecurringIntraSyncResponse`](../recurringintrasyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncresponse/accountfrom) { get; set; } | يحصل أو يعيّن المصدر من [`BankAccount`](../../aspose.finance.ofx/bankaccount) أو [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) أو [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [RecurringIntraTransactionResponses](../../aspose.finance.ofx.bank/recurringintrasyncresponse/recurringintratransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة الـ [`RecurringIntraTransactionResponse`](../recurringintratransactionresponse). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
