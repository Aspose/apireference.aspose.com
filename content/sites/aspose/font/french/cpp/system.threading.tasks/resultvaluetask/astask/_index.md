---
title: "System::Threading::Tasks::ResultValueTask::AsTask méthode"
linktitle: "AsTask"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask méthode. Convertit ce ResultValueTask en un pointeur partagé vers ResultTask<T> en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Convertit ce [ResultValueTask](../) en un pointeur partagé vers [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Remarques



Si le [ResultValueTask](../) contient un résultat direct, crée une tâche terminée avec ce résultat. S'il contient une tâche, renvoie un pointeur partagé vers cette tâche.

## Voir aussi

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
