---
title: "System::Threading::Tasks::WaitAny metodo"
linktitle: "WaitAny"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::WaitAny metodo. Attende che uno qualsiasi degli oggetti Task forniti completi l'esecuzione in C++."
type: docs
weight: 2200
url: /it/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


Attende che uno qualsiasi degli oggetti [Task](../task/) forniti completi l'esecuzione.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Un array di istanze [Task](../task/) su cui attendere. |

### ReturnValue

L'indice del task completato nell'array dei task.

## Vedi anche

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Attende che uno qualsiasi degli oggetti [Task](../task/) forniti completi l'esecuzione.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Un array di istanze [Task](../task/) su cui attendere. |
| cancellationToken | const CancellationToken\& | Un [CancellationToken](../../system.threading/cancellationtoken/) da osservare mentre si attende il completamento dei task. |

### ReturnValue

L'indice del task completato nell'array dei task.

## Vedi anche

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
