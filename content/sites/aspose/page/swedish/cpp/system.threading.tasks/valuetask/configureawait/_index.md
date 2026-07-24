---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait metod"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait metod. Konfigurerar en awaiter för denna uppgift i C++."
type: docs
weight: 300
url: /sv/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Konfigurerar en väntare för detta task.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| continueOnCapturedContext | bool | true för att försöka överföra fortsättningen tillbaka till den ursprungliga kontexten som fångats; annars false. |

### ReturnValue

ConfiguredValueTaskAwaitable Ett objekt som konfigurerar hur awaiters beter sig för denna uppgift.

## Se även

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
