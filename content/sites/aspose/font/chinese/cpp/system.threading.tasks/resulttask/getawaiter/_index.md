---
title: "System::Threading::Tasks::ResultTask::GetAwaiter 方法"
linktitle: "GetAwaiter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter 方法。获取此结果任务的 awaiter，以便在 C++ 中与 Await 一起使用。"
type: docs
weight: 600
url: /zh/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


获取此结果任务的 awaiter，以供 Await 使用。

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## 备注



当被 await 时，协程将在结果值可用时恢复执行

## 另见

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
