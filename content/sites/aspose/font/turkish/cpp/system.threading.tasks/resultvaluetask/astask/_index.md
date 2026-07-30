---
title: "System::Threading::Tasks::ResultValueTask::AsTask metodu"
linktitle: "AsTask"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask metodu. Bu ResultValueTask'i C++ içinde ResultTask<T>'ye ortak bir göstericiye dönüştürür."
type: docs
weight: 200
url: /tr/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Bu [ResultValueTask](../) öğesini [ResultTask<T>](../../resulttask/) için ortak bir göstericiye dönüştürür.

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Açıklamalar



Eğer [ResultValueTask](../) doğrudan bir sonuç içeriyorsa, o sonuçla tamamlanmış bir görev oluşturur. Eğer bir görev içeriyorsa, o göreve ortak bir gösterici döndürür.

## Ayrıca Bakınız

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
