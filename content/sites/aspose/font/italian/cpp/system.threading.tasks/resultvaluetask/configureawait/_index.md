---
title: "Metodo System::Threading::Tasks::ResultValueTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::ResultValueTask::ConfigureAwait. Configura un awaiter per questa attività in C++."
type: docs
weight: 300
url: /it/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Configura un awaiter per questo task.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continueOnCapturedContext | bool | true per tentare di trasferire la continuazione al contesto originale catturato; altrimenti, false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Un oggetto che configura il comportamento degli awaiter per questa attività.

## Vedi anche

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
