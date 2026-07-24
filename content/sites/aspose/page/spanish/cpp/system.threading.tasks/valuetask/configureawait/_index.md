---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait método"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait método. Configura un awaiter para esta tarea en C++."
type: docs
weight: 300
url: /es/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Configura un awaiter para esta tarea.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continueOnCapturedContext | bool | verdadero para intentar trasladar la continuación de nuevo al contexto original capturado; de lo contrario, falso. |

### ReturnValue

ConfiguredValueTaskAwaitable Un objeto que configura cómo se comportan los awaiters para esta tarea.

## Ver también

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
