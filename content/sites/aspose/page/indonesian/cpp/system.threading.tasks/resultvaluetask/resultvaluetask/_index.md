---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask konstruktor"
linktitle: "ResultValueTask"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask konstruktor. Membuat sebuah ResultValueTask kosong dan belum diinisialisasi dalam C++."
type: docs
weight: 100
url: /id/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Membuat sebuah [ResultValueTask](../) kosong dan belum diinisialisasi.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Catatan



Tugas belum selesai dan tidak berisi hasil. Mencoba mendapatkan hasil akan melempar pengecualian.

## Lihat Juga

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Membuat sebuah [ResultValueTask](../) dari shared pointer ke [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tugas | const RTaskPtr\<T\>\& | Tugas yang akan dibungkus. Bisa bernilai null untuk tugas kosong. |
## Catatan



[ResultValueTask](../) akan mewakili keadaan dan hasil dari tugas yang diberikan.

## Lihat Juga

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Membuat sebuah [ResultValueTask](../) yang selesai dengan hasil yang ditentukan.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hasil | const T\& | Nilai hasil untuk dibungkus dalam sebuah task yang selesai. |
## Catatan



Ini membuat sebuah task yang berhasil selesai yang segera mengembalikan nilai.

## Lihat Juga

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
