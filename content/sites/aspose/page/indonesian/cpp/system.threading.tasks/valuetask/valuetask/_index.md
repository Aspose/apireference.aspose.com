---
title: "Konstruktor System::Threading::Tasks::ValueTask::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Threading::Tasks::ValueTask::ValueTask. Membuat ValueTask kosong yang belum diinisialisasi di C++."
type: docs
weight: 100
url: /id/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Membuat [ValueTask](../) kosong yang belum diinisialisasi.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Catatan



Tugas belum selesai dan tidak berisi hasil. Mencoba mendapatkan hasil akan melempar pengecualian.

## Lihat Juga

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Membuat [ValueTask](../) dari pointer bersama ke [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tugas | const TaskPtr\& | Tugas yang akan dibungkus. Bisa bernilai null untuk tugas kosong. |
## Catatan



[ValueTask](../) akan mewakili status tugas yang diberikan.

## Lihat Juga

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
