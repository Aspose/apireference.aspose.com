---
title: "System::Threading::Tasks::Task::ConfigureAwait 方法"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Task::ConfigureAwait 方法。配置此任务的 await 在 C++ 中关于上下文捕获的行为方式。"
type: docs
weight: 700
url: /zh/cpp/system.threading.tasks/task/configureawait/
---
## Task::ConfigureAwait method


配置对该任务的 await 的行为，以决定上下文捕获方式。

```cpp
Runtime::CompilerServices::ConfiguredTaskAwaitable System::Threading::Tasks::Task::ConfigureAwait(bool continueOnCapturedContext) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 是否在捕获的上下文中继续 |

### ReturnValue

[Runtime::CompilerServices::ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/) A configured awaitable

## 另见

* Class [ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
