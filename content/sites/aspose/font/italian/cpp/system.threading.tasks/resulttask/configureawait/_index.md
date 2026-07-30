---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait metodo"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait metodo. Configura il comportamento delle attese su questo task di risultato riguardo alla cattura del contesto in C++."
type: docs
weight: 300
url: /it/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Configura come gli await su questo task di risultato devono comportarsi riguardo alla cattura del contesto.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continueOnCapturedContext | bool | Indica se continuare sul contesto catturato |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Osservazioni



Questo consente un controllo fine sul flusso del contesto per i pattern async/await

## Vedi anche

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
