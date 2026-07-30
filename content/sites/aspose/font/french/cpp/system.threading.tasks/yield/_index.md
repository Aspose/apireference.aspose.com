---
title: "Méthode System::Threading::Tasks::Yield"
linktitle: "Yield"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Tasks::Yield. Crée une tâche awaitable qui rend le contrôle de façon asynchrone au contexte actuel lorsqu’elle est awaitée en C++."
type: docs
weight: 3200
url: /fr/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


Crée une tâche awaitable qui rend le contrôle de façon asynchrone au contexte actuel lorsqu’elle est awaitée.

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

Un YieldAwaitable qui peut être awaité pour rendre le contrôle.
## Remarques



Cette méthode est utile pour forcer une méthode asynchrone à rendre le contrôle, permettant à d’autres travaux en attente d’être traités avant de continuer.
## Voir aussi

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
