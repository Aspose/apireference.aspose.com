---
title: "System::Threading::Tasks::ResultValueTask::AsTask طريقة"
linktitle: "AsTask"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask طريقة. يحول هذا ResultValueTask إلى مؤشر مشترك إلى ResultTask<T> في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


يحول هذا [ResultValueTask](../) إلى مؤشر مشترك إلى [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## ملاحظات



إذا كان [ResultValueTask](../) يحتوي على نتيجة مباشرة، ينشئ مهمة مكتملة بتلك النتيجة. إذا كان يحتوي على مهمة، يرجع مؤشرًا مشتركًا إلى تلك المهمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
