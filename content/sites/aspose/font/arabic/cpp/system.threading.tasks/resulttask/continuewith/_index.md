---
title: "System::Threading::Tasks::ResultTask::ContinueWith طريقة"
linktitle: "ContinueWith"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith طريقة. ينشئ متابعة يتم تنفيذها عندما تكتمل مهمة النتيجة في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


ينشئ متابعة تُنفّذ عندما تُكمل مهمة النتيجة.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) للتنفيذ عندما تكتمل هذه المهمة، مع استلام مهمة النتيجة هذه |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## ملاحظات



الإجراء المتابع يستقبل هذا [ResultTask](../) للوصول إلى قيمة النتيجة

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


ينشئ متابعة تُنفّذ عندما تُكمل مهمة النتيجة.

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| معامل | الوصف |
| --- | --- |
| TNewResult | نوع النتيجة لاستمرار المهمة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | دالة للحصول على نتيجة المتابعة عندما تكتمل هذه المهمة، مع استلام مهمة النتيجة هذه |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## ملاحظات



تستقبل دالة المتابعة هذا [ResultTask](../) للوصول إلى قيمة النتيجة

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
