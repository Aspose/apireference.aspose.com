---
title: BillPayMessageSetV1
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: الإصدار 1 من مجموعة رسائل دفع الفواتير.
type: docs
weight: 4420
url: /ar/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

الإصدار 1 من مجموعة رسائل دفع الفواتير.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1)() | ينشئ مثيلاً جديدًا من الفئة [`BillPayMessageSetV1`](../billpaymessagesetv1). |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext) { get; set; } | يحصل أو يضبط ما إذا كان موفر الدفع يدعم معلومات سياق تقديم الفاتورة في عمليات الدفع. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee) { get; set; } | يحصل أو يضبط ما إذا كان المستخدم يمكنه إضافة المستفيدين. إذا كان خاطئًا، يُقيد المستخدم بالمستفيدين الذين أضيفوا إلى قائمة المستفيدين الخاصة بالمستخدم بواسطة نظام الدفع. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels) { get; set; } | يحصل أو يضبط ما إذا كان يسمح بتعديلات على النماذج. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments) { get; set; } | يحصل أو يضبط ما إذا كان يسمح بتعديلات على المدفوعات. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal) { get; set; } | يحصل أو يضبط الإزاحة إلى تاريخ السحب. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay) { get; set; } | يحصل أو يضبط العدد الافتراضي للأيام للدفع بالشيك (باستثناء التحويل). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment) { get; set; } | يحصل أو يضبط ما إذا كان يدعم تحديد مبلغ مختلف للدفعة الأولى التي يولدها النموذج |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment) { get; set; } | يحصل أو يضبط ما إذا كان يدعم تحديد مبلغ مختلف للدفعة الأخيرة التي يولدها النموذج |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment) { get; set; } | يحصل أو يضبط ما إذا كان يدعم دفعة الأعمال !:ExtendedPayment. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore) { get; set; } | الحصول أو تعيين [`MessageSetCore`](../abstractmessagesetversion/messagesetcore). |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow) { get; set; } | يحصل أو يضبط نافذة النموذج؛ عدد الأيام قبل جدولة المعاملة المتكررة للمعالجة التي يتم فيها إنشاءها على النظام. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress) { get; set; } | يحصل أو يضبط ما إذا كان يدعم المدفوعات للمستفيدين المحددين بواسطة عنوان الفوترة، أي الـ [`Payee`](../../aspose.finance.ofx/payee). |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid) { get; set; } | يحصل أو يضبط ما إذا كان يدعم المدفوعات للمستفيدين المحددين بواسطة معرف المستفيد المقدم من الخادم. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer) { get; set; } | يحصل أو يضبط ما إذا كانت المدفوعات للمستفيدين المحددين بواسطة حساب الوجهة |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow) { get; set; } | يحصل أو يضبط عدد الأيام بعد معالجة المعاملة التي يمكن فيها الاستعلام عن حالتها. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs) { get; set; } | يحصل أو يضبط أيام الأسبوع التي لا يحدث فيها أي معالجة. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime) { get; set; } | يحصل أو يضبط وقت اليوم الذي ينتهي فيه معالجة اليوم. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods) { get; set; } | إذا كان صحيحًا، يدعم الخادم التواصل لتغييرات حالة الدفع التي يبدأها الخادم عبر رسالة !:PaymentModResponse. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw) { get; set; } | يحصل أو يضبط عدد الأيام قبل تاريخ المعالجة التي تُسحب فيها الأموال للدفع عن طريق التحويل. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay) { get; set; } | الحصول أو تعيين العدد الافتراضي للأيام للدفع عن طريق التحويل. |

### انظر أيضًا

* class [AbstractMessageSetVersion](../abstractmessagesetversion)
* namespace [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
