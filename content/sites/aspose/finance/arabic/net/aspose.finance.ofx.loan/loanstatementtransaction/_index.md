---
title: LoanStatementTransaction
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تصف هذه الفئة معاملة واحدة. تحدد نوع المعاملة وتاريخ نشرها. يمكن للفئة أيضًا تقديم معلومات إضافية لمساعدة العميل على التعرف على رقم الشيك واسم المعاملة ومذكرة وصور المعاملة.
type: docs
weight: 3980
url: /ar/net/aspose.finance.ofx.loan/loanstatementtransaction/
---
## LoanStatementTransaction class

هذه الفئة تصف معاملة واحدة. تحدد نوع المعاملة وتاريخ نشرها. يمكن للفئة أيضًا توفير معلومات إضافية لمساعدة العميل على التعرف على المعاملة: رقم الشيك، الاسم، المذكرة والصور.

```csharp
public class LoanStatementTransaction
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [LoanStatementTransaction](loanstatementtransaction)() | يُنشئ مثيلاً جديدًا لفئة [`LoanStatementTransaction`](../loanstatementtransaction). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx.loan/loanstatementtransaction/accountto) { get; set; } | يحصل أو يعيّن حساب الوجهة، [`BankAccount`](../../aspose.finance.ofx/bankaccount) أو [`LoanAccount`](../../aspose.finance.ofx/loanaccount). |
| [CheckNumber](../../aspose.finance.ofx.loan/loanstatementtransaction/checknumber) { get; set; } | يحصل أو يعيّن رقم الشيك. |
| [CorrectFITransactionId](../../aspose.finance.ofx.loan/loanstatementtransaction/correctfitransactionid) { get; set; } | يحصل أو يعيّن معرّف المعاملة المصححة. إذا كان موجودًا، فإن FITransactionId للمعاملة المرسلة مسبقًا والتي تم تصحيحها بهذا السجل. |
| [CorrectiveAction](../../aspose.finance.ofx.loan/loanstatementtransaction/correctiveaction) { get; set; } | يحصل أو يعيّن الإجراء التصحيحي. |
| [Currency](../../aspose.finance.ofx.loan/loanstatementtransaction/currency) { get; set; } | يحصل أو يضبط الـ [`Currency`](./currency). |
| [ExtendedName](../../aspose.finance.ofx.loan/loanstatementtransaction/extendedname) { get; set; } | يحصل أو يعيّن الاسم الموسع للمستفيد أو وصف المعاملة. |
| [FITransactionId](../../aspose.finance.ofx.loan/loanstatementtransaction/fitransactionid) { get; set; } | يحصل أو يعيّن معرّف المعاملة الصادر عن المؤسسة المالية. |
| [ImageDatas](../../aspose.finance.ofx.loan/loanstatementtransaction/imagedatas) { get; set; } | يحصل أو يعيّن مجموعة من [`ImageData`](../../aspose.finance.ofx/imagedata). |
| [LoanTransactionAmount](../../aspose.finance.ofx.loan/loanstatementtransaction/loantransactionamount) { get; set; } | يحصل أو يعيّن الـ [`LoanTransactionAmount`](./loantransactionamount). |
| [LoanTransactionType](../../aspose.finance.ofx.loan/loanstatementtransaction/loantransactiontype) { get; set; } | يحصل أو يعيّن نوع معاملة القرض. |
| [Memo](../../aspose.finance.ofx.loan/loanstatementtransaction/memo) { get; set; } | يحصل أو يعيّن المعلومات الإضافية. |
| [Name](../../aspose.finance.ofx.loan/loanstatementtransaction/name) { get; set; } | يحصل أو يعيّن اسم المستفيد أو وصف المعاملة. |
| [OriginCurrency](../../aspose.finance.ofx.loan/loanstatementtransaction/origincurrency) { get; set; } | يحصل أو يضبط أصل الـ [`Currency`](./currency). |
| [PostedDate](../../aspose.finance.ofx.loan/loanstatementtransaction/posteddate) { get; set; } | يحصل أو يعيّن تاريخ نشر المعاملة إلى الحساب. |
| [ReferenceNumber](../../aspose.finance.ofx.loan/loanstatementtransaction/referencenumber) { get; set; } | يحصل أو يعيّن رقم المرجع الذي يحدد المعاملة بشكل فريد. |
| [ServerTransactionId](../../aspose.finance.ofx.loan/loanstatementtransaction/servertransactionid) { get; set; } | يحصل أو يعيّن معرف المعاملة المخصص من الخادم. |
| [TransactionAmount](../../aspose.finance.ofx.loan/loanstatementtransaction/transactionamount) { get; set; } | يحصل أو يعيّن مبلغ المعاملة. |
| [UserDate](../../aspose.finance.ofx.loan/loanstatementtransaction/userdate) { get; set; } | يحصل أو يعيّن تاريخ بدء المستخدم للمعاملة، إذا كان معروفًا. |

### انظر أيضًا

* namespace [Aspose.Finance.Ofx.Loan](../../aspose.finance.ofx.loan)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
