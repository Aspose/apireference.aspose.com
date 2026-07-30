---
title: "Méthode System::Threading::Tasks::WhenAny"
linktitle: "WhenAny"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Tasks::WhenAny. Crée une tâche qui se terminera lorsque l'une des tâches fournies sera terminée en C++."
type: docs
weight: 2800
url: /fr/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


Crée une tâche qui se terminera lorsque l'une des tâches fournies sera terminée.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type du résultat de la tâche terminée. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui renvoie la première tâche terminée lorsqu'une tâche se termine.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


Crée une tâche qui se terminera lorsque l'une des tâches fournies sera terminée.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const ArrayPtr\<TaskPtr\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui représente l'achèvement de l'une des tâches fournies.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


Crée une tâche qui se terminera lorsque l'une des tâches fournies sera terminée.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type du résultat de la tâche terminée. |

| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui renvoie la première tâche terminée lorsqu'une tâche se termine.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


Crée une tâche qui se terminera lorsque l'une des tâches fournies sera terminée.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tâches | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | Les tâches à attendre pour leur achèvement. |

### ReturnValue

Une tâche qui représente l'achèvement de l'une des tâches fournies.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
