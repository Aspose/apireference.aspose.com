---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::Task::ContinueWith method. Membuat kelanjutan yang dieksekusi ketika tugas selesai dalam C++."
type: docs
weight: 700
url: /id/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


Membuat lanjutan yang dieksekusi ketika tugas selesai.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) untuk dijalankan ketika tugas ini selesai |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
