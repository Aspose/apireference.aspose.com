---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait méthode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait méthode. Configure un awaiter pour cette tâche en C++."
type: docs
weight: 300
url: /fr/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Configure un awaiter pour cette tâche.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| continueOnCapturedContext | bool | true pour tenter de transmettre la continuation au contexte d'origine capturé ; sinon, false. |

### ReturnValue

ConfiguredValueTaskAwaitable Un objet qui configure le comportement des awaiters pour cette tâche.

## Voir aussi

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
