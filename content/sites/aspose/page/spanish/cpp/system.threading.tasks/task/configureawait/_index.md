---
title: "System::Threading::Tasks::Task::ConfigureAwait método"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::Task::ConfigureAwait método. Configura cómo los await en esta tarea deben comportarse respecto a la captura del contexto en C++."
type: docs
weight: 600
url: /es/cpp/system.threading.tasks/task/configureawait/
---
## Task::ConfigureAwait method


Configura cómo deben comportarse los await en esta tarea respecto a la captura del contexto.

```cpp
Runtime::CompilerServices::ConfiguredTaskAwaitable System::Threading::Tasks::Task::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| continueOnCapturedContext | bool | Indica si se debe continuar en el contexto capturado |

### ReturnValue

[Runtime::CompilerServices::ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/) A configured awaitable

## Ver también

* Class [ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
