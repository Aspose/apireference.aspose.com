---
title: "System::Threading::Tasks::ValueTask::ValueTask 构造函数"
linktitle: "ValueTask"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ValueTask::ValueTask 构造函数。构造一个在 C++ 中空的、未初始化的 ValueTask。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


构造一个空的、未初始化的 [ValueTask](../)。

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## 备注



任务尚未完成且不包含结果。尝试获取结果将抛出异常。

## 另见

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


从指向 [Task](../../task/) 的共享指针构造一个 [ValueTask](../)。

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const TaskPtr\& | 要包装的任务。对于空任务可以为 null。 |
## 备注



[ValueTask](../) 将表示提供的任务的状态。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
