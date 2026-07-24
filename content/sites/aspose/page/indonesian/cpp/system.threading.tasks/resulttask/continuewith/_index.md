---
title: "System::Threading::Tasks::ResultTask::ContinueWith metode"
linktitle: "ContinueWith"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Threading::Tasks::ResultTask::ContinueWith. Membuat kelanjutan yang dijalankan ketika tugas hasil selesai di C++."
type: docs
weight: 300
url: /id/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Membuat kelanjutan yang dieksekusi ketika task hasil selesai.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) untuk dieksekusi ketika tugas ini selesai, menerima tugas hasil ini |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Catatan



Aksi kelanjutan menerima [ResultTask](../) ini untuk mengakses nilai hasil

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
