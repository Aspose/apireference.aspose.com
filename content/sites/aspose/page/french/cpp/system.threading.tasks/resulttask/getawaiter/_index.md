---
title: "System::Threading::Tasks::ResultTask::GetAwaiter méthode"
linktitle: "GetAwaiter"
second_title: "Aspose.Page pour C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter méthode. Obtient un awaiter pour cette tâche de résultat à utiliser avec Await en C++."
type: docs
weight: 500
url: /fr/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Obtient un awaiter pour cette tâche de résultat à utiliser avec Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Remarques



Lorsqu’elle est attendue, la coroutine reprendra avec la valeur de résultat disponible

## Voir aussi

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
