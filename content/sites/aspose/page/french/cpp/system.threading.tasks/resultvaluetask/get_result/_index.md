---
title: "System::Threading::Tasks::ResultValueTask::get_Result méthode"
linktitle: "get_Result"
second_title: "Aspose.Page pour C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result méthode. Obtient le résultat de la tâche terminée en C++."
type: docs
weight: 900
url: /fr/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Obtient le résultat de la tâche terminée.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T La valeur du résultat.
## Remarques



Si la tâche est soutenue par un [ResultTask<T>](../../resulttask/), cette méthode attendra le résultat et le mettra en cache. Les appels suivants renverront la valeur mise en cache sans attendre.

## Voir aussi

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
