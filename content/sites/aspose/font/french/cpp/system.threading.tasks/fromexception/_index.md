---
title: "Méthode System::Threading::Tasks::FromException"
linktitle: "FromException"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Tasks::FromException. Crée une tâche qui s’est terminée avec une exception spécifiée en C++."
type: docs
weight: 1300
url: /fr/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


Crée une tâche qui s’est terminée avec une exception spécifiée.

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| exception | const Exception\& | L’exception avec laquelle terminer la tâche. |

### ReturnValue

Une tâche en échec.

## Voir aussi

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


Crée une tâche qui s’est terminée avec une exception spécifiée et un type de résultat.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| Paramètre | Description |
| --- | --- |
| TResult | Le type du résultat de la tâche. |

| Paramètre | Type | Description |
| --- | --- | --- |
| exception | const Exception\& | L’exception avec laquelle terminer la tâche. |

### ReturnValue

Une tâche en échec avec le type de résultat spécifié.

## Voir aussi

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
