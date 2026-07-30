---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait 方法"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait 方法。为此任务在 C++ 中配置 awaiter。"
type: docs
weight: 300
url: /zh/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


为此任务配置 awaiter。

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continueOnCapturedContext | bool | true 表示尝试将后续操作重新调度回捕获的原始上下文；否则为 false。 |

### ReturnValue

ConfiguredValueTaskAwaitable 一个对象，用于配置此任务的 awaiter 行为。

## 另见

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
