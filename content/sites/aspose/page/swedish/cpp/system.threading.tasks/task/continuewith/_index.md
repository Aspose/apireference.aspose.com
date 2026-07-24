---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Skapar en fortsättning som körs när uppgiften slutförs i C++."
type: docs
weight: 700
url: /sv/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Skapar en fortsättning som körs när uppgiften slutförs.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) för att köras när denna uppgift slutförs |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Se även

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
