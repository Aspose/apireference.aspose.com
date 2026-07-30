---
title: "System::Threading::Tasks::ParallelOptions 类"
linktitle: "ParallelOptions"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ParallelOptions 类。存储用于配置 C++ 中 Parallel 类方法操作的选项。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/paralleloptions/
---
## ParallelOptions class


存储用于配置 [Parallel](../parallel/) 类方法操作的选项。

```cpp
class ParallelOptions : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_CancellationToken](./get_cancellationtoken/)() | 获取与此 [ParallelOptions](./) 实例关联的 [CancellationToken](../../system.threading/cancellationtoken/)。 |
| [get_MaxDegreeOfParallelism](./get_maxdegreeofparallelism/)() | 获取此 [ParallelOptions](./) 实例启用的最大并行度。 |
| [get_TaskScheduler](./get_taskscheduler/)() | 获取与此 [ParallelOptions](./) 实例关联的 [TaskScheduler](../taskscheduler/)。 |
| [ParallelOptions](./paralleloptions/)() | 使用默认值构造一个 [ParallelOptions](./) 实例。 |
| [set_CancellationToken](./set_cancellationtoken/)(const CancellationToken\&) | 设置与此 [ParallelOptions](./) 实例关联的 [CancellationToken](../../system.threading/cancellationtoken/)。 |
| [set_MaxDegreeOfParallelism](./set_maxdegreeofparallelism/)(int32_t) | 设置此 [ParallelOptions](./) 实例启用的最大并行度。 |
| [set_TaskScheduler](./set_taskscheduler/)(const SharedPtr\<TaskScheduler\>\&) | 设置与此 [ParallelOptions](./) 实例关联的 [TaskScheduler](../taskscheduler/)。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
