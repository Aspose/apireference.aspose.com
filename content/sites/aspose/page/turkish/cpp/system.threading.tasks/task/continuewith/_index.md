---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Görev tamamlandığında yürütülen bir devam (continuation) oluşturur."
type: docs
weight: 700
url: /tr/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Görev tamamlandığında yürütülen bir devam oluşturur.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) bu görev tamamlandığında yürütülecek |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
