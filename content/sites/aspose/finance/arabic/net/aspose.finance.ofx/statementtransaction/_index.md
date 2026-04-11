---
title: StatementTransaction
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تصف هذه الفئة معاملة واحدة. تحدد نوع المعاملة وتاريخ نشرها. يمكن للفئة أيضًا توفير معلومات إضافية لمساعدة العميل على التعرف على المعاملة مثل رقم الشيك واسم المستفيد والمذكرة. يمكن أن تحتوي المعاملة على رمز صناعي قياسي يمكن للعميل استخدامه لتصنيف المعاملة.
type: docs
weight: 5730
url: /ar/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

هذه الفئة تصف معاملة واحدة. تحدد نوع المعاملة وتاريخ نشرها. يمكن للفئة أيضًا توفير معلومات إضافية لمساعدة العميل على التعرف على المعاملة: رقم الشيك، اسم المستفيد، والمذكرة. يمكن أن تحتوي المعاملة على رمز صناعي قياسي يمكن للعميل استخدامه لتصنيف المعاملة.

```csharp
public class StatementTransaction
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [StatementTransaction](statementtransaction)() | ينشئ مثيلاً جديدًا من الفئة [`StatementTransaction`](../statementtransaction). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | يحصل أو يعيّن الحساب المستهدف، [`BankAccount`](../bankaccount) أو [`CreditCardAccount`](../creditcardaccount). |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | يحصل أو يعيّن تاريخ توفر الأموال (تاريخ القيمة). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | يحصل أو يعيّن رقم الشيك. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | يحصل أو يعيّن معرف المعاملة المصححة. إذا كان موجودًا، فإن FinancialInstitutionTransactionId للمعاملة المرسلة مسبقًا والتي تم تصحيحها بهذا السجل. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | يحصل أو يعيّن الإجراء التصحيحي. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | يحصل أو يضبط الـ [`Currency`](./currency). |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | يحصل أو يعيّن الاسم الموسع للمستفيد أو وصف المعاملة. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | يحصل أو يعيّن معرّف المعاملة الصادر عن المؤسسة المالية. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | يحصل أو يعيّن مجموعة [`ImageData`](../imagedata). |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | يحصل أو يعيّن مصدر النقد لهذه المعاملة. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | يحصل أو يعيّن المعلومات الإضافية. |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | يحصل أو يعيّن اسم المستفيد أو وصف المعاملة. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | يحصل أو يضبط أصل الـ [`Currency`](./currency). |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | يحصل أو يعيّن الـ[`Payee`](./payee). |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | يحصل أو يعيّن معرف المستفيد إذا كان متوفرًا. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | يحصل أو يعيّن تاريخ نشر المعاملة إلى الحساب. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | يحصل أو يعيّن رقم المرجع الذي يحدد المعاملة بشكل فريد. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | يحصل أو يعيّن معرف المعاملة المخصص من الخادم. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | يحصل أو يعيّن الرمز الصناعي القياسي. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | يحصل أو يعيّن مبلغ المعاملة. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | يحصل أو يعيّن نوع المعاملة. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | يحصل أو يعيّن تاريخ بدء المستخدم للمعاملة، إذا كان معروفًا. |

### انظر أيضًا

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
