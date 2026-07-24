---
title: "System::Threading::Tasks::ResultValueTask::AsTask メソッド"
linktitle: "AsTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::AsTask メソッド。 この ResultValueTask を C++ で ResultTask<T> への共有ポインタに変換します。"
type: docs
weight: 200
url: /ja/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


この [ResultValueTask](../) を [ResultTask<T>](../../resulttask/) への共有ポインタに変換します。

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## 備考



もし [ResultValueTask](../) が直接結果を持つ場合、その結果で完了したタスクを作成します。タスクを持つ場合は、そのタスクへの共有ポインタを返します。

## 参照

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
