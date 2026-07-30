---
title: "System::Threading::CancellationTokenRegistration فئة"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::CancellationTokenRegistration فئة. يمثل تسجيلًا لرد نداء رمز إلغاء في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


يمثل تسجيلًا لاستدعاء رد نداء رمز الإلغاء.

```cpp
class CancellationTokenRegistration
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() | يقوم بإلغاء التسجيل وإزالة رد النداء من [CancellationTokenSource](../cancellationtokensource/). بعد استدعاء هذه الطريقة، لن يتم استدعاء رد النداء المسجل عندما يتم إلغاء [CancellationTokenSource](../cancellationtokensource/) المرتبط. |
## ملاحظات


تسمح هذه الفئة بإلغاء تسجيل رد نداء من رمز إلغاء. عند إلغاءها، تقوم بإزالة رد النداء من [CancellationTokenSource](../cancellationtokensource/).
يجب عدم إنشاء هذه الفئة مباشرةً - يتم إرجاعها بواسطة طرق تسجيل [CancellationToken](../cancellationtoken/).

## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
