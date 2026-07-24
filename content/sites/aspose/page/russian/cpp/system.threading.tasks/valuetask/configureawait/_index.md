---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait method"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait method. Настраивает awaiter для этой задачи в C++."
type: docs
weight: 300
url: /ru/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Настраивает awaiter для этой задачи.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| continueOnCapturedContext | bool | true, чтобы попытаться передать продолжение обратно в исходный захваченный контекст; иначе false. |

### ReturnValue

ConfiguredValueTaskAwaitable — объект, который настраивает поведение awaiter'ов для этой задачи.

## См. также

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
