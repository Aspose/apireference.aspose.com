---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::TimerQueue class. Antrean yang menangani objek Timer. Ini hanya sebuah implementasi. Objek Timer mendaftar di sana secara otomatis, Anda tidak perlu melakukannya untuk menggunakannya - gunakan API kelas Timer sebagai gantinya. Ini adalah tipe singleton dengan manajemen memori yang dilakukan oleh fungsi akses. Anda tidak pernah boleh membuat instance darinya secara langsung di C++."
type: docs
weight: 1600
url: /id/cpp/system.threading/timerqueue/
---
## TimerQueue class


Antrian yang menangani objek [Timer](../timer/). Ini hanya sebuah implementasi. Objek [Timer](../timer/) mendaftar di sana secara otomatis, Anda tidak perlu melakukannya untuk menggunakannya - gunakan API kelas [Timer](../timer/) sebagai gantinya. Ini adalah tipe singleton dengan manajemen memori yang dilakukan oleh fungsi akses. Anda tidak boleh membuat instance-nya secara langsung.

```cpp
class TimerQueue
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(Timer *) | Mendaftarkan timer ke antrian. |
| [Delete](./delete/)(Timer *) | Menghapus timer dari antrian. |
| static [GetInstance](./getinstance/)() | Singleton implementasi. |
| static [JoinWorkerThread](./joinworkerthread/)() | Menyambungkan thread pekerja. Menunggu tanpa batas jika diperlukan. |
| [operator=](./operator=/)(const TimerQueue\&) | Tidak ada penyalinan. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Tidak ada penyalinan. |
## Lihat Juga

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
