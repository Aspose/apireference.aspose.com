---
title: "System::Threading::Tasks::WaitAll method"
linktitle: "WaitAll"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::WaitAll method. Ожидает завершения выполнения всех предоставленных объектов Task в C++."
type: docs
weight: 2000
url: /ru/cpp/system.threading.tasks/waitall/
---
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&) method


Ожидает завершения выполнения всех предоставленных объектов [Task](../task/).

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Массив экземпляров [Task](../task/), на которых следует ожидать. |

## См. также

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Ожидает завершения выполнения всех предоставленных объектов [Task](../task/).

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Массив экземпляров [Task](../task/), на которых следует ожидать. |
| cancellationToken | const CancellationToken\& | Объект [CancellationToken](../../system.threading/cancellationtoken/) для наблюдения во время ожидания завершения задач. |

## См. также

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
