---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait método"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait método. Configura un awaiter para esta tarea en C++."
type: docs
weight: 300
url: /es/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Configura un awaiter para esta tarea.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continueOnCapturedContext | bool | verdadero para intentar trasladar la continuación de nuevo al contexto original capturado; de lo contrario, falso. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Un objeto que configura cómo se comportan los awaiters para esta tarea.

## Ver también

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
