---
title: "System::Threading::Tasks::ResultTask::GetAwaiter طريقة"
linktitle: "GetAwaiter"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter طريقة. يحصل على Awaiter لهذا مهمة النتيجة للاستخدام مع Await في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


يحصل على مُنتظر لهذه مهمة النتيجة للاستخدام مع Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## ملاحظات



عند الانتظار، سيستأنف الـ coroutine مع توفر قيمة النتيجة.

## انظر أيضًا

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
