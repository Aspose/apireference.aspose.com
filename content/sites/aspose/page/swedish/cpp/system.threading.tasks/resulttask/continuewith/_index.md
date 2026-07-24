---
title: "System::Threading::Tasks::ResultTask::ContinueWith metod"
linktitle: "ContinueWith"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith‑metod. Skapar en fortsättning som körs när resultat‑tasken är klar i C++."
type: docs
weight: 300
url: /sv/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Skapar en fortsättning som körs när resultattasken slutförs.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) för att köras när denna task slutförs och tar emot denna resultat‑task |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Anmärkningar



Fortsättningsåtgärden får denna [ResultTask](../) för att komma åt resultatvärdet

## Se även

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
