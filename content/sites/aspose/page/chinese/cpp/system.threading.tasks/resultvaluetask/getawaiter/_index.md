---
title: "System::Threading::Tasks::ResultValueTask::GetAwaiter 方法"
linktitle: "GetAwaiter"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::GetAwaiter 方法。获取此任务的 awaiter，以在 C++ 中支持 await 表达式。"
type: docs
weight: 1000
url: /zh/cpp/system.threading.tasks/resultvaluetask/getawaiter/
---
## ResultValueTask::GetAwaiter method


获取此任务的 awaiter，以支持 await 表达式。

```cpp
Runtime::CompilerServices::ResultValueTaskAwaiter<T> System::Threading::Tasks::ResultValueTask<T>::GetAwaiter() const
```


### ReturnValue

ResultValueTaskAwaiter<T> 此任务的 awaiter 实例。
## 备注



此方法使得可以将 Await 方法与 [ResultValueTask](../) 一起使用。

## 另见

* Class [ResultValueTaskAwaiter](../../../system.runtime.compilerservices/resultvaluetaskawaiter/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
