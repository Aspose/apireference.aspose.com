---
title: "طريقة System::Threading::CancellationTokenSource::CreateLinkedTokenSource"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::CancellationTokenSource::CreateLinkedTokenSource. تُنشئ مصدر توكن مرتبط يُلغي عندما يُلغي أي من التوكنات المقدمة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


ينشئ مصدر رمز مرتبط يُلغي عندما يُلغى أي من الرموز المقدمة.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| token1 | const CancellationToken\& | التوكن الأول للإلغاء للمراقبة. |
| token2 | const CancellationToken\& | التوكن الثاني للإلغاء للمراقبة. |

### ReturnValue

مصدر توكن جديد سيُلغي عندما يُلغي أي من توكنات الإدخال.
## ملاحظات



المصدر المرجع سيلغي فورًا إذا كان أي من توكنات الإدخال مُلغى بالفعل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
