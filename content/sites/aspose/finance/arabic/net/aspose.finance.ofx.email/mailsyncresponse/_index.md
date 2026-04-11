---
title: MailSyncResponse
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة استجابة مزامنة البريد الإلكتروني.
type: docs
weight: 2190
url: /ar/net/aspose.finance.ofx.email/mailsyncresponse/
---
## MailSyncResponse class

فئة استجابة مزامنة البريد الإلكتروني.

```csharp
public class MailSyncResponse : AbstractSyncResponse
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [MailSyncResponse](mailsyncresponse)() | يُهيئ نسخة جديدة من الفئة [`MailSyncResponse`](../mailsyncresponse). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | نعم إذا كان الرمز في طلب المزامنة أقدم من أقدم إدخال في جدول سجل الخادم. في هذه الحالة، فقد ضُعت بعض الاستجابات. لا إذا كان الرمز في طلب المزامنة أحدث من أو يطابق رمزًا في جدول سجل الخادم. |
| [MailTransactionResponses](../../aspose.finance.ofx.email/mailsyncresponse/mailtransactionresponses) { get; set; } | يحصل أو يعيّن مجموعة الـ[`MailTransactionResponse`](../mailtransactionresponse). |
| [OfxExtension](../../aspose.finance.ofx.email/mailsyncresponse/ofxextension) { get; set; } | الحصول أو تعيين [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | الحصول أو تعيين رمز المزامنة الجديد. |

### انظر أيضًا

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Email](../../aspose.finance.ofx.email)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
