---
title: WireSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة معاملة التحويل البنكي.
type: docs
weight: 6440
url: /ar/net/aspose.finance.ofx.wiretransfer/wiresyncresponse/
---
## WireSyncResponse class

فئة استجابة مزامنة معاملة التحويل البنكي.

```csharp
public class WireSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [WireSyncResponse](wiresyncresponse)() | ينشئ مثلاً جديداً من الفئة [`WireSyncResponse`](../wiresyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/bankaccountfrom) { get; set; } | يحصل أو يعيّن الـ from لـ [`BankAccount`](../../aspose.finance.ofx/bankaccount). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [OfxExtension](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |
| [WireTransactionResponses](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/wiretransactionresponses) { get; set; } | يحصل أو يضبط مجموعة [`WireTransactionResponse`](../wiretransactionresponse). |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.WireTransfer](../../aspose.finance.ofx.wiretransfer)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
