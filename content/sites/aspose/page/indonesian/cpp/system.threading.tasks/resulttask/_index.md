---
title: "Kelas System::Threading::Tasks::ResultTask"
linktitle: "ResultTask"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Threading::Tasks::ResultTask. Spesialisasi Task yang mengembalikan nilai hasil setelah selesai dalam C++."
type: docs
weight: 100
url: /id/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Sebuah spesialisasi [Task](../task/) yang mengembalikan nilai hasil setelah selesai.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai hasil yang dikembalikan oleh task |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Mengonfigurasi bagaimana await pada task hasil ini harus berperilaku terkait penangkapan konteks. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Membuat kelanjutan yang dieksekusi ketika task hasil selesai. |
| [get_Result](./get_result/)() const | Mendapatkan hasil dari operasi asynchronous. |
| [GetAwaiter](./getawaiter/)() const | Mendapatkan awaiter untuk task hasil ini untuk digunakan dengan Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Membuat sebuah [ResultTask](./) dengan fungsi yang mengembalikan nilai. |
| [ResultTask](./resulttask/)() | Implementasi internal. Tidak untuk kode pengguna. |
| [ResultTask](./resulttask/)(const T\&) | Konstruktor internal untuk membuat task hasil dengan hasil yang ditentukan. |
| [set_Result](./set_result/)(const T\&) | Mengatur nilai hasil untuk task. |
## Catatan



Mewakili operasi asynchronous yang menghasilkan hasil, mirip dengan [System.Threading.Tasks.Task<TResult>](../task/) di .NET
## Lihat Juga

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
