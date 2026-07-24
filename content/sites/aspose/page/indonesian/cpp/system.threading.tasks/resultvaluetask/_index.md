---
title: "Kelas System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Threading::Tasks::ResultValueTask. Mewakili tipe tugas hibrida yang dapat membungkus baik nilai hasil langsung maupun ResultTask<T> dalam C++."
type: docs
weight: 200
url: /id/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Mewakili tipe tugas hibrida yang dapat membungkus baik nilai hasil langsung maupun [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe hasil yang dihasilkan oleh tugas. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [AsTask](./astask/)() const | Mengonversi [ResultValueTask](./) ini menjadi pointer bersama ke [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Mengonfigurasi awaiter untuk tugas ini. |
| [Equals](./equals/)(ResultValueTask) override | Menentukan apakah instance ini sama dengan instance [ResultValueTask](./) lainnya. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah instance ini sama dengan objek lain. |
| [get_IsCanceled](./get_iscanceled/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai karena dibatalkan. |
| [get_IsCompleted](./get_iscompleted/)() const | Mengambil nilai yang menunjukkan apakah tugas telah selesai. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai dengan sukses. |
| [get_IsFaulted](./get_isfaulted/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai karena pengecualian yang tidak ditangani. |
| [get_Result](./get_result/)() const | Mendapatkan hasil dari tugas yang selesai. |
| [GetAwaiter](./getawaiter/)() const | Mengambil awaiter untuk tugas ini guna mendukung ekspresi await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Operator ketidaksamaan untuk [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Operator kesamaan untuk [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Membuat [ResultValueTask](./) kosong yang belum diinisialisasi. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Membuat [ResultValueTask](./) yang selesai dengan hasil yang ditentukan. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Membuat [ResultValueTask](./) dari pointer bersama ke [ResultTask<T>](../resulttask/). |
## Catatan


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Lihat Juga

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
