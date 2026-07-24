---
title: "System::Threading::Tasks::TaskScheduler 类"
linktitle: "TaskScheduler"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::TaskScheduler 类。表示一个在 C++ 中处理将任务排入线程队列的底层工作对象。"
type: docs
weight: 400
url: /zh/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


表示一个处理将任务排入线程队列的底层工作的对象。

```cpp
class TaskScheduler : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | 创建一个与当前线程关联的 [TaskScheduler](./)。 |
| static [get_Current](./get_current/)() | 获取与当前正在执行的任务关联的 [TaskScheduler](./)。 |
| static [get_Default](./get_default/)() | 获取框架提供的默认 [TaskScheduler](./) 实例。 |
| [get_Id](./get_id/)() const | 获取此 [TaskScheduler](./) 的唯一 ID。 |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | 指示此 [TaskScheduler](./) 能够支持的最大并发级别。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
