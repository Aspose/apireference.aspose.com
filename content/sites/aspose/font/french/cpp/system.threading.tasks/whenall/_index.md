---
title: "System::Threading::Tasks::WhenAll méthode"
linktitle: "WhenAll"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Tasks::WhenAll méthode. Crée une tâche qui se terminera lorsque toutes les tâches fournies seront terminées en C++."
type: docs
weight: 2400
url: /fr/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Crée une tâche qui se terminera lorsque toutes les tâches fournies seront terminées.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type des résultats des tâches terminées. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui renvoie un tableau de tous les résultats lorsque toutes les tâches sont terminées.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


Crée une tâche qui se terminera lorsque toutes les tâches fournies seront terminées.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const ArrayPtr\<TaskPtr\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui représente l'achèvement de toutes les tâches fournies.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Crée une tâche qui se terminera lorsque toutes les tâches fournies seront terminées.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type des résultats des tâches terminées. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui renvoie un tableau de tous les résultats lorsque toutes les tâches sont terminées.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Crée une tâche qui se terminera lorsque toutes les tâches fournies seront terminées.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui représente l'achèvement de toutes les tâches fournies.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
