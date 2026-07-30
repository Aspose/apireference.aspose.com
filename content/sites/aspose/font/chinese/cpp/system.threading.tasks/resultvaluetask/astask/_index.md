---
title: "System::Threading::Tasks::ResultValueTask::AsTask 方法"
linktitle: "AsTask"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask 方法。将此 ResultValueTask 转换为 C++ 中指向 ResultTask<T> 的共享指针。"
type: docs
weight: 200
url: /zh/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


将此 [ResultValueTask](../) 转换为指向 [ResultTask<T>](../../resulttask/) 的共享指针。

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## 备注



如果 [ResultValueTask](../) 包含直接结果，则创建一个带有该结果的已完成任务。如果它包含一个任务，则返回指向该任务的共享指针。

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
