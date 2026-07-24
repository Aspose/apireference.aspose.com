---
title: "System::Threading::Tasks::ResultValueTask::get_Result 方法"
linktitle: "get_Result"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result 方法。获取已完成任务的结果（在 C++ 中）。"
type: docs
weight: 900
url: /zh/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


获取已完成任务的结果。

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T 结果值。
## 备注



如果任务由 [ResultTask<T>](../../resulttask/) 支持，此方法将等待结果并将其缓存。后续调用将返回缓存的值，而无需等待。

## 另见

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
