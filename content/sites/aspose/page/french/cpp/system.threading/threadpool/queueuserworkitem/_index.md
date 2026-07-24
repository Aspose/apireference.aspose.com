---
title: "Méthode System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Threading::ThreadPool::QueueUserWorkItem. Place un élément de travail dans la file d'attente qui est présent avec un rappel sans paramètre en C++."
type: docs
weight: 600
url: /fr/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Place l'élément de travail dans la file d'attente qui est présent avec un rappel sans paramètre.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | WaitCallback | Fonction de rappel à utiliser comme tâche. |

### ReturnValue

Renvoie toujours vrai.

## Voir aussi

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Place l'élément de travail dans la file d'attente qui est présent avec un rappel sans paramètre.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | WaitCallback | Fonction de rappel à utiliser comme tâche. |
| état | const System::SharedPtr\<System::Object\>\& | Paramètre de fonction de tâche. |

### ReturnValue

Renvoie toujours vrai.

## Voir aussi

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
