---
title: "System::Threading::Tasks::ResultTask::ContinueWith yöntemi"
linktitle: "ContinueWith"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith yöntemi. C++'ta sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur."
type: docs
weight: 400
url: /tr/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | Bu görev tamamlandığında yürütülecek [Action](../../../system/action/), bu sonuç görevini alır. |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Açıklamalar



Devam eylemi, sonuç değerine erişmek için bu [ResultTask](../) alır.

## Ayrıca Bakınız

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur.

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| Parametre | Açıklama |
| --- | --- |
| TNewResult | Görev devamının sonuç türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | Bu görev tamamlandığında devam sonucunu almak için fonksiyon, bu sonuç görevini alır. |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## Açıklamalar



Devam fonksiyonu, sonuç değerine erişmek için bu [ResultTask](../) alır

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
