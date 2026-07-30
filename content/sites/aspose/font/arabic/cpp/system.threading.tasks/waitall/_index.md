---
title: "System::Threading::Tasks::WaitAll method"
linktitle: "WaitAll"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::WaitAll method. ينتظر حتى تكتمل جميع كائنات Task المقدمة في التنفيذ في C++."
type: docs
weight: 2000
url: /ar/cpp/system.threading.tasks/waitall/
---
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&) method


ينتظر حتى تكتمل جميع كائنات [Task](../task/) المقدمة في التنفيذ.

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | مصفوفة من مثيلات [Task](../task/) التي يجب الانتظار عليها. |

## انظر أيضًا

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


ينتظر حتى تكتمل جميع كائنات [Task](../task/) المقدمة في التنفيذ.

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | مصفوفة من مثيلات [Task](../task/) التي يجب الانتظار عليها. |
| cancellationToken | const CancellationToken\& | [CancellationToken](../../system.threading/cancellationtoken/) لمراقبته أثناء انتظار إكمال المهام. |

## انظر أيضًا

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
