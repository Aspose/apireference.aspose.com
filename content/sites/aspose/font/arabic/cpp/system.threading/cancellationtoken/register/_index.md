---
title: "System::Threading::CancellationToken::Register طريقة"
linktitle: "تسجيل"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::CancellationToken::Register. تسجل رد نداء سيتم استدعاؤه عندما يُطلب الإلغاء في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


يسجل استدعاءً عكسيًا سيتم استدعاؤه عند طلب الإلغاء.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| callback | const Action<>\& | الـ [Action<>](../../../system/action/) للتنفيذ عندما يُطلب الإلغاء. |

### ReturnValue

كائن [CancellationTokenRegistration](../../cancellationtokenregistration/) يمكن استخدامه لإلغاء تسجيل رد النداء.
## ملاحظات



إذا كان الإلغاء قد طُلب بالفعل، سيتم استدعاء رد النداء فورًا.

## انظر أيضًا

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
