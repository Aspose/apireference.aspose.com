---
title: RecurringInterSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة المعاملات المتكررة بين البنوك.
type: docs
weight: 2570
url: /ar/net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
---
## RecurringInterSyncResponse class

فئة استجابة مزامنة المعاملات المتكررة بين البنوك.

```csharp
public class RecurringInterSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [RecurringInterSyncResponse](recurringintersyncresponse)() | يُنشئ مثيلاً جديداً من الفئة [`RecurringInterSyncResponse`](../recurringintersyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/accountfrom) { get; set; } | يحصل أو يعيّن المصدر من [`BankAccount`](../../aspose.finance.ofx/bankaccount) أو [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) أو [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [RecurringInterTransactionResponses](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurringintertransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة الـ[`RecurringInterTransactionResponse`](../recurringintertransactionresponse). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
