---
title: "System::Threading::Tasks::Task::ConfigureAwait 方法"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Tasks::Task::ConfigureAwait 方法。配置此任务的 await 在 C++ 中关于上下文捕获的行为。"
type: docs
weight: 600
url: /zh/cpp/system.threading.tasks/task/configureawait/
---
## Task::ConfigureAwait method


配置对该任务的 await 在上下文捕获方面的行为。

```cpp
Runtime::CompilerServices::ConfiguredTaskAwaitable System::Threading::Tasks::Task::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 是否在捕获的上下文上继续执行 |

### ReturnValue

[Runtime::CompilerServices::ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/) A configured awaitable

## 另见

* Class [ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
