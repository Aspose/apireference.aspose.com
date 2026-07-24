---
title: "System::Threading::Tasks::ResultTask::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith methode. Maakt een voortzetting die wordt uitgevoerd wanneer de resulttask voltooid is in C++."
type: docs
weight: 300
url: /nl/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Maakt een voortzetting aan die wordt uitgevoerd wanneer de resultaattaak voltooid is.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) om uit te voeren wanneer deze taak voltooid is, waarbij deze resulttask wordt ontvangen. |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Opmerkingen



De voortzettingactie ontvangt deze [ResultTask](../) om de resultaatwaarde te benaderen.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
