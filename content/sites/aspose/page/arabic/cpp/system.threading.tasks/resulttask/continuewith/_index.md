---
title: "System::Threading::Tasks::ResultTask::ContinueWith طريقة"
linktitle: "ContinueWith"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Tasks::ResultTask::ContinueWith. تُنشئ متابعة تُنفّذ عندما يكتمل مهمة النتيجة في C++."
type: docs
weight: 300
url: /ar/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


ينشئ متابعة تُنفّذ عندما تكتمل مهمة النتيجة.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) للتنفيذ عندما تكتمل هذه المهمة، مع استلام مهمة النتيجة هذه |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## ملاحظات



إجراء المتابعة يستقبل هذا [ResultTask](../) للوصول إلى قيمة النتيجة

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
