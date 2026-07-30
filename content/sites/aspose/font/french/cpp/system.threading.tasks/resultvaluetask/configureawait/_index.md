---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait méthode"
linktitle: "ConfigureAwait"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait méthode. Configure un awaiter pour cette tâche en C++."
type: docs
weight: 300
url: /fr/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Configure un awaiter pour cette tâche.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| continueOnCapturedContext | bool | true pour tenter de transmettre la continuation au contexte d'origine capturé ; sinon, false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Un objet qui configure le comportement des awaiters pour cette tâche.

## Voir aussi

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
