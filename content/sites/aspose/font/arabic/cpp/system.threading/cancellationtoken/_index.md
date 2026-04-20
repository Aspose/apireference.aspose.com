---
title: "System::Threading::CancellationToken فئة"
linktitle: "CancellationToken"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::CancellationToken فئة. تنشر إشعارًا بأن العمليات يجب إلغاؤها. توفر هذه الفئة آلية للإلغاء التعاوني بين الخيوط، مما يسمح لخيط واحد بإبلاغ الآخرين بأن العملية يجب إلغاؤها في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


ينشر إشعارًا بأن العمليات يجب إلغاؤها. توفر هذه الفئة آلية للإلغاء التعاوني بين الخيوط، مما يسمح لخيط واحد بإشعار الآخرين بأن العملية يجب إلغاؤها.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | منشئ افتراضي. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | يحصل على ما إذا كان هذا الرمز قادرًا على أن يكون في الحالة الملغاة. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | يحصل على ما إذا تم طلب الإلغاء لهذا الرمز. |
| static [get_None](./get_none/)() | يرجع قيمة فارغة من نوع [System::Threading::CancellationToken](./). |
| [Register](./register/)(const Action<>\&) const | يسجل استدعاءً عكسيًا سيتم استدعاؤه عند طلب الإلغاء. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | يرمي استثناء OperationCanceledException إذا تم طلب الإلغاء. |
## ملاحظات



يمكن إلغاء [CancellationToken](./) فقط من خلال مصدره المرتبط [CancellationTokenSource](../cancellationtokensource/).

## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
