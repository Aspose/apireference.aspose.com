---
title: "System::Threading::Tasks::WaitAny طريقة"
linktitle: "WaitAny"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::WaitAny طريقة. ينتظر أيًا من كائنات Task المقدمة لإكمال التنفيذ في C++."
type: docs
weight: 2200
url: /ar/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


ينتظر أيًا من كائنات [Task](../task/) المقدمة لإكمال التنفيذ.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | مصفوفة من مثيلات [Task](../task/) التي يجب الانتظار عليها. |

### ReturnValue

فهرس المهمة المكتملة في مصفوفة المهام.

## انظر أيضًا

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


ينتظر أيًا من كائنات [Task](../task/) المقدمة لإكمال التنفيذ.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | مصفوفة من مثيلات [Task](../task/) التي يجب الانتظار عليها. |
| cancellationToken | const CancellationToken\& | [CancellationToken](../../system.threading/cancellationtoken/) لمراقبته أثناء انتظار إكمال المهام. |

### ReturnValue

فهرس المهمة المكتملة في مصفوفة المهام.

## انظر أيضًا

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
