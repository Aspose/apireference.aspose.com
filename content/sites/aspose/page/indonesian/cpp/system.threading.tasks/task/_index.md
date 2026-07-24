---
title: "kelas System::Threading::Tasks::Task"
linktitle: "Task"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Threading::Tasks::Task. Mewakili operasi asynchronous yang dapat ditunggu dan digabungkan dengan tugas lain dalam C++."
type: docs
weight: 300
url: /id/cpp/system.threading.tasks/task/
---
## Task class


Mewakili operasi asynchronous yang dapat ditunggu dan digabungkan dengan task lain.

```cpp
class Task : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Mengaktifkan tugas untuk dieksekusi pada penjadwal. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Menambahkan aksi lanjutan yang akan dieksekusi setelah selesai. |
| [Complete](./complete/)() | Menandai tugas sebagai selesai dan menyelesaikan tugas. |
| [ConfigureAwait](./configureawait/)(bool) const | Mengonfigurasi bagaimana await pada tugas ini harus berperilaku terkait penangkapan konteks. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Membuat lanjutan yang dieksekusi ketika tugas selesai. |
| [Dispose](./dispose/)() override | Melepaskan sumber daya yang terkait dengan tugas. |
| [Execute](./execute/)() | Menjalankan fungsi tugas. |
| [get_AsyncState](./get_asyncstate/)() const | Mendapatkan objek status yang didefinisikan pengguna yang terkait dengan tugas. |
| static [get_CompletedTask](./get_completedtask/)() | Mendapatkan tugas yang selesai (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Mendapatkan ID untuk tugas. |
| [get_IsCanceled](./get_iscanceled/)() const | Mendapatkan apakah tugas selesai karena pembatalan. |
| [get_IsCompleted](./get_iscompleted/)() const | Mendapatkan apakah tugas telah selesai. |
| [get_IsFaulted](./get_isfaulted/)() const | Mendapatkan apakah tugas selesai karena pengecualian yang tidak ditangani. |
| [get_Scheduler](./get_scheduler/)() const | Mendapatkan penjadwal yang terkait dengan tugas ini. |
| [get_Status](./get_status/)() const | Mendapatkan status terkini dari tugas. |
| [GetAwaiter](./getawaiter/)() const | Mendapatkan awaiter untuk tugas ini untuk digunakan dengan Await. |
| [RunSynchronously](./runsynchronously/)() | Menjalankan tugas secara sinkron pada thread saat ini. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Menjalankan tugas secara sinkron menggunakan penjadwal yang ditentukan. |
| [set_Function](./set_function/)(const FunctionT\&) | Mengatur fungsi internal untuk dijalankan. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Mengatur penjadwal yang terkait dengan tugas ini. |
| [set_Status](./set_status/)(TaskStatus) | Mengatur status tugas. |
| [Start](./start/)() | Memulai eksekusi tugas menggunakan penjadwal default. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Memulai eksekusi tugas menggunakan penjadwal yang ditentukan. |
| [Task](./task/)(const Action<>\&) | Membuat sebuah [Task](./) dengan aksi untuk dijalankan. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Membuat sebuah [Task](./) dengan aksi dan token pembatalan. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Membuat sebuah [Task](./) dengan aksi berstatus dan objek status. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Membuat sebuah [Task](./) dengan aksi berstatus, status, dan token pembatalan. |
| [Task](./task/)() | Konstruktor internal untuk membuat tugas yang belum diinisialisasi. |
| [Wait](./wait/)(const CancellationToken\&) const | Menunggu tugas selesai dengan dukungan pembatalan. |
| [Wait](./wait/)() const | Menunggu tugas selesai. |
| [~Task](./~task/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [FunctionT](./functiont/) | Implementasi internal. Tidak untuk kode pengguna. |
## Catatan


Menyediakan implementasi C++ yang mirip dengan [System.Threading.Tasks.Task](./) di .NET, mendukung pembatalan, kelanjutan, dan pola async/await.
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
