---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait 方法"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait 方法。为此任务配置 awaiter（在 C++ 中）。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


为此任务配置 awaiter。

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continueOnCapturedContext | bool | true 表示尝试将后续操作重新调度回捕获的原始上下文；否则为 false。 |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> 一个对象，用于配置此任务的 awaiter 行为。

## 另见

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
