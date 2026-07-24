---
title: "Méthode System::Threading::Tasks::ResultTask::ConfigureAwait"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Threading::Tasks::ResultTask::ConfigureAwait. Configure la façon dont les await sur cette tâche de résultat doivent se comporter concernant la capture du contexte en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Configure la façon dont les await sur cette tâche de résultat doivent se comporter concernant la capture du contexte.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| continueOnCapturedContext | bool | Indique s'il faut continuer sur le contexte capturé |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Remarques



Cela permet un contrôle fin du flux de contexte pour les modèles async/await

## Voir aussi

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
