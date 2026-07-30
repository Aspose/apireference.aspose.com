---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait metodo"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait metodo. Configura un awaiter per questa operazione in C++."
type: docs
weight: 300
url: /it/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Configura un awaiter per questo task.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continueOnCapturedContext | bool | true per tentare di trasferire la continuazione al contesto originale catturato; altrimenti, false. |

### ReturnValue

ConfiguredValueTaskAwaitable Un oggetto che configura il comportamento degli awaiter per questa operazione.

## Vedi anche

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
