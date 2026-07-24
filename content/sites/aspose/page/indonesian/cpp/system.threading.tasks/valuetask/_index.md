---
title: "Kelas System::Threading::Tasks::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Threading::Tasks::ValueTask. Menyediakan hasil yang dapat ditunggu dari operasi asynchronous dalam C++."
type: docs
weight: 500
url: /id/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Menyediakan hasil yang dapat ditunggu dari operasi asynchronous.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AsTask](./astask/)() const | Mengonversi [ValueTask](./) ini menjadi shared pointer ke [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Mengonfigurasi awaiter untuk tugas ini. |
| [Equals](./equals/)(ValueTask) override | Menentukan apakah instance ini sama dengan instance [ValueTask](./) lainnya. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah instance ini sama dengan objek lain. |
| [get_IsCanceled](./get_iscanceled/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai karena dibatalkan. |
| [get_IsCompleted](./get_iscompleted/)() const | Mengambil nilai yang menunjukkan apakah tugas telah selesai. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai dengan sukses. |
| [get_IsFaulted](./get_isfaulted/)() const | Mengambil nilai yang menunjukkan apakah tugas selesai karena pengecualian yang tidak ditangani. |
| [GetAwaiter](./getawaiter/)() const | Mengambil awaiter untuk tugas ini guna mendukung ekspresi await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Operator ketidaksamaan untuk [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Operator kesamaan untuk [ValueTask](./). |
| [ValueTask](./valuetask/)() | Membuat [ValueTask](./) kosong yang belum diinisialisasi. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Membuat [ValueTask](./) dari shared pointer ke [Task](../task/). |
## Lihat Juga

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
