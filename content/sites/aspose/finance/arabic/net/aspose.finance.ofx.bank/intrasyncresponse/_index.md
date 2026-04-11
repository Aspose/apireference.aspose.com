---
title: IntraSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة المعاملة الداخلية.
type: docs
weight: 500
url: /ar/net/aspose.finance.ofx.bank/intrasyncresponse/
---
## IntraSyncResponse class

فئة استجابة مزامنة المعاملة الداخلية.

```csharp
public class IntraSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [IntraSyncResponse](intrasyncresponse)() | ينشئ مثيلاً جديداً من الفئة [`IntraSyncResponse`](../intrasyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncresponse/accountfrom) { get; set; } | يحصل أو يعيّن المصدر من [`BankAccount`](../../aspose.finance.ofx/bankaccount) أو [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) أو [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [IntraTransactionResponses](../../aspose.finance.ofx.bank/intrasyncresponse/intratransactionresponses) { get; set; } | يحصل أو يضبط مجموعة الـ [`IntraTransactionResponse`](../intratransactionresponse). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
