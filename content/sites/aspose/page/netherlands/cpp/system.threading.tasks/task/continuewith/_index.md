---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Maakt een voortzetting aan die wordt uitgevoerd wanneer de taak voltooid is in C++."
type: docs
weight: 700
url: /nl/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Creëert een voortzetting die wordt uitgevoerd wanneer de taak voltooid is.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) om uit te voeren wanneer deze taak voltooid is |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
