---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait methode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait methode. Configureert een awaiter voor deze taak in C++."
type: docs
weight: 300
url: /nl/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Configureert een awaiter voor deze taak.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| continueOnCapturedContext | bool | true om te proberen de voortzetting terug te marshallen naar de oorspronkelijke vastgelegde context; anders false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Een object dat configureert hoe awaiters zich gedragen voor deze taak.

## Zie ook

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
