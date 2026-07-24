---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Erstellt eine Fortsetzung, die ausgeführt wird, wenn die Task in C++ abgeschlossen ist."
type: docs
weight: 700
url: /de/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) zur Ausführung, wenn diese Task abgeschlossen ist |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
