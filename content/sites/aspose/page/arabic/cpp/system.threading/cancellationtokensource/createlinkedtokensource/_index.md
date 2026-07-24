---
title: "طريقة System::Threading::CancellationTokenSource::CreateLinkedTokenSource"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::CancellationTokenSource::CreateLinkedTokenSource. ينشئ مصدر رمز مرتبط يُلغى عندما يُلغى أي من الرموز المقدمة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


ينشئ مصدر رمز مرتبط يلغي عندما يُلغى أي من الرموز المقدمة.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| token1 | const CancellationToken\& | رمز الإلغاء الأول للمراقبة. |
| token2 | const CancellationToken\& | رمز الإلغاء الثاني للمراقبة. |

### ReturnValue

مصدر رمز جديد سيُلغى عندما يُلغى أي من رمزي الإدخال.
## ملاحظات



المصدر المعاد سيُلغى فورًا إذا كان أي من رمزي الإدخال مُلغى بالفعل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
