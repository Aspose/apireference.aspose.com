---
title: "System::Threading::Tasks::ResultTask::ContinueWith metodu"
linktitle: "ContinueWith"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith yöntemi. Sonuç görev tamamlandığında çalışan bir devam işlemi oluşturur C++'ta."
type: docs
weight: 300
url: /tr/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) bu görev tamamlandığında yürütülecek, bu sonuç görevini alır |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Açıklamalar



Devam eylemi, sonuç değerine erişmek için bu [ResultTask](../) alır

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
