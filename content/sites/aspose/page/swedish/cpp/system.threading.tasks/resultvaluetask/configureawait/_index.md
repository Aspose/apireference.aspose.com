---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait metod"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait metod. Konfigurerar en väntare för denna uppgift i C++."
type: docs
weight: 300
url: /sv/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Konfigurerar en väntare för detta task.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| continueOnCapturedContext | bool | true för att försöka överföra fortsättningen tillbaka till den ursprungliga kontexten som fångats; annars false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Ett objekt som konfigurerar hur väntare beter sig för denna uppgift.

## Se även

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
