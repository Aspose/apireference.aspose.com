---
title: "Método System::Threading::Tasks::ResultTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page para C++"
description: "Método System::Threading::Tasks::ResultTask::ConfigureAwait. Configura cómo deben comportarse los await en esta tarea de resultado respecto a la captura del contexto en C++."
type: docs
weight: 200
url: /es/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Configura cómo deben comportarse los await en esta tarea de resultado respecto a la captura de contexto.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continueOnCapturedContext | bool | Indica si se debe continuar en el contexto capturado |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Observaciones



Esto permite un control granular sobre el flujo del contexto para los patrones async/await

## Ver también

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
