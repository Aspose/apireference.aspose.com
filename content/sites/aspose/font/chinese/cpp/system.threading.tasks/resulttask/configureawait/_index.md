---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait 方法"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait 方法。配置在 C++ 中此结果任务的 await 在上下文捕获方面的行为。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


配置对该结果任务的 await 在上下文捕获方面的行为方式。

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 是否在捕获的上下文中继续 |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## 备注



这使得对 async/await 模式的上下文流进行细粒度控制

## 另见

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
