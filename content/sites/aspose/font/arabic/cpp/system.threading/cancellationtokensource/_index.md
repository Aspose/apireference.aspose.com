---
title: "فئة System::Threading::CancellationTokenSource"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::CancellationTokenSource. مصدر رمز إلغاء يمكن استخدامه لتفعيل إشعارات الإلغاء في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


مصدر رمز إلغاء يمكن استخدامه لإطلاق إشعارات الإلغاء.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Cancel](./cancel/)() | ينقل طلب إلغاء. |
| [CancellationTokenSource](./cancellationtokensource/)() | ينشئ [CancellationTokenSource](./) جديدًا. |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | ينشئ مصدر رمز مرتبط يُلغي عندما يُلغى أي من الرموز المقدمة. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة بواسطة [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | يحصل على ما إذا تم طلب الإلغاء. |
| [get_Token](./get_token/)() const | يحصل على رمز الإلغاء المرتبط بهذا المصدر. |
## ملاحظات


يوفر آليات لإنشاء والتحكم في رموز الإلغاء لإلغاء العمليات بشكل تعاوني.
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
