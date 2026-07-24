---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Δημιουργεί μια συνέχιση που εκτελείται όταν η εργασία ολοκληρωθεί σε C++."
type: docs
weight: 700
url: /el/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Δημιουργεί μια συνέχιση που εκτελείται όταν η εργασία ολοκληρώνεται.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) για εκτέλεση όταν αυτή η εργασία ολοκληρωθεί |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
