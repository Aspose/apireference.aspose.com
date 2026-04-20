---
title: "طريقة System::Threading::Tasks::Task::ContinueWith"
linktitle: "ContinueWith"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::Task::ContinueWith. تُنشئ استمرارية تُنفّذ عندما تكتمل المهمة في C++."
type: docs
weight: 800
url: /ar/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


ينشئ متابعة تُنفّذ عندما تُكمل المهمة.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) للتنفيذ عندما تكتمل هذه المهمة |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


ينشئ متابعة تُنفّذ عندما تُكمل المهمة.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع من نتيجة المهمة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | دالة للحصول على النتيجة عندما تكتمل هذه المهمة |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
