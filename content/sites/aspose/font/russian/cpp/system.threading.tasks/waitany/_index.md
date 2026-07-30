---
title: "System::Threading::Tasks::WaitAny метод"
linktitle: "WaitAny"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::WaitAny метод. Ожидает завершения выполнения любого из предоставленных объектов Task в C++."
type: docs
weight: 2200
url: /ru/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


Ожидает завершения выполнения любого из предоставленных объектов [Task](../task/).

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Массив экземпляров [Task](../task/), на которых следует ожидать. |

### ReturnValue

Индекс завершённой задачи в массиве задач.

## См. также

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Ожидает завершения выполнения любого из предоставленных объектов [Task](../task/).

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Массив экземпляров [Task](../task/), на которых следует ожидать. |
| cancellationToken | const CancellationToken\& | Объект [CancellationToken](../../system.threading/cancellationtoken/) для наблюдения во время ожидания завершения задач. |

### ReturnValue

Индекс завершённой задачи в массиве задач.

## См. также

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
