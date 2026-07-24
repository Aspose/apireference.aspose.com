---
title: "System::Threading::Tasks::ResultTask::GetAwaiter طريقة"
linktitle: "GetAwaiter"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter طريقة. يحصل على مُنتظر لهذه مهمة النتيجة لاستخدامه مع Await في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


يحصل على مُنتظر لهذه المهمة النتيجة للاستخدام مع Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## ملاحظات



عند الانتظار، سيستأنف الروتين المتزامن مع توفر قيمة النتيجة.

## انظر أيضًا

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
