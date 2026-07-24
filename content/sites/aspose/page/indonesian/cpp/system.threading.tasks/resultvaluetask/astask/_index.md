---
title: "System::Threading::Tasks::ResultValueTask::AsTask metode"
linktitle: "AsTask"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask metode. Mengonversi ResultValueTask ini menjadi shared pointer ke ResultTask<T> dalam C++."
type: docs
weight: 200
url: /id/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Mengonversi [ResultValueTask](../) ini menjadi shared pointer ke [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Catatan



Jika [ResultValueTask](../) berisi hasil langsung, membuat task yang selesai dengan hasil tersebut. Jika berisi task, mengembalikan shared pointer ke task itu.

## Lihat Juga

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
