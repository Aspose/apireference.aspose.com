---
title: InterSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة المعاملات بين البنوك.
type: docs
weight: 2470
url: /ar/net/aspose.finance.ofx.intertransfer/intersyncresponse/
---
## InterSyncResponse class

فئة استجابة مزامنة المعاملات بين البنوك.

```csharp
public class InterSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [InterSyncResponse](intersyncresponse)() | يُنشئ نسخة جديدة من الفئة [`InterSyncResponse`](../intersyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/intersyncresponse/accountfrom) { get; set; } | يحصل أو يعيّن المصدر من [`BankAccount`](../../aspose.finance.ofx/bankaccount) أو [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) أو [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [InterTransactionResponses](../../aspose.finance.ofx.intertransfer/intersyncresponse/intertransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة [`InterTransactionResponse`](../intertransactionresponse). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/intersyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
