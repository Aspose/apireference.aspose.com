---
title: "System::Threading::Tasks::Task::ConfigureAwait method"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::Task::ConfigureAwait method. Configura il comportamento delle attese su questa attività riguardo alla cattura del contesto in C++."
type: docs
weight: 700
url: /it/cpp/system.threading.tasks/task/configureawait/
---
## Task::ConfigureAwait method


Configura come gli await su questo task devono comportarsi riguardo alla cattura del contesto.

```cpp
Runtime::CompilerServices::ConfiguredTaskAwaitable System::Threading::Tasks::Task::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| continueOnCapturedContext | bool | Indica se continuare sul contesto catturato |

### ReturnValue

[Runtime::CompilerServices::ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/) A configured awaitable

## Vedi anche

* Class [ConfiguredTaskAwaitable](../../../system.runtime.compilerservices/configuredtaskawaitable/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
