---
title: "System::Threading::Tasks::Task::ContinueWith yöntemi"
linktitle: "ContinueWith"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Task::ContinueWith yöntemi. Görev tamamlandığında çalışan bir devam (continuation) oluşturur C++'ta."
type: docs
weight: 800
url: /tr/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


Görev tamamlandığında çalışan bir devam (continuation) oluşturur.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | Bu görev tamamlandığında yürütülecek [Action](../../../system/action/) |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


Görev tamamlandığında çalışan bir devam (continuation) oluşturur.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| Parametre | Açıklama |
| --- | --- |
| TResult | Bir görev sonucu türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | Bu görev tamamlandığında sonucu almak için işlev |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
