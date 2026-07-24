---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::CancellationTokenRegistration class. تمثّل تسجيلًا لرد اتصال رمز الإلغاء في C++."
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
| [Dispose](./dispose/)() | يُفرغ التسجيل ويزيل رد الاتصال من [CancellationTokenSource](../cancellationtokensource/) المرتبط. بعد استدعاء هذه الطريقة، لن يتم استدعاء رد الاتصال المسجَّل عندما يتم إلغاء [CancellationTokenSource](../cancellationtokensource/) المرتبط. |
## ملاحظات


تسمح هذه الفئة بإلغاء تسجيل رد الاتصال من رمز إلغاء. عند إفراغها، تقوم بإزالة رد الاتصال من [CancellationTokenSource](../cancellationtokensource/) المرتبط.
يجب عدم إنشاء هذه الفئة مباشرةً - يتم إرجاعها بواسطة طرق تسجيل [CancellationToken](../cancellationtoken/).

## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
