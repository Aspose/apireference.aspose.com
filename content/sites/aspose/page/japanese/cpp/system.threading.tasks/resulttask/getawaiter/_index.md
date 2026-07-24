---
title: "System::Threading::Tasks::ResultTask::GetAwaiter メソッド"
linktitle: "GetAwaiter"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::GetAwaiter メソッド。C++ の Await で使用するためのこの結果タスクの awaiter を取得します。"
type: docs
weight: 500
url: /ja/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Await と共に使用するための、この結果タスクの awaiter を取得します。

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## 備考



await されると、コルーチンは結果値が利用可能な状態で再開します。

## 参照

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
