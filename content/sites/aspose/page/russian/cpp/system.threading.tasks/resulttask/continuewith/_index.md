---
title: "System::Threading::Tasks::ResultTask::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page для C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith метод. Создает продолжение, которое выполняется, когда задача результата завершается в C++."
type: docs
weight: 300
url: /ru/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Создаёт продолжение, которое выполняется, когда задача результата завершается.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) для выполнения, когда эта задача завершается, получая эту задачу результата |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Примечания



Действие продолжения получает эту [ResultTask](../), чтобы получить значение результата

## См. также

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
