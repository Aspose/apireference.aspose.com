---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait method"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait method. Configureert een awaiter voor deze taak in C++."
type: docs
weight: 300
url: /nl/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Configureert een awaiter voor deze taak.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| continueOnCapturedContext | bool | true om te proberen de voortzetting terug te marshallen naar de oorspronkelijke vastgelegde context; anders false. |

### ReturnValue

ConfiguredValueTaskAwaitable Een object dat configureert hoe awaiters zich gedragen voor deze taak.

## Zie ook

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
