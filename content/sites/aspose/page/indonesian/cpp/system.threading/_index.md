---
title: "System::Threading ruang nama"
linktitle: "System::Threading"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan ruang nama System::Threading dalam C++."
type: docs
weight: 6500
url: /id/cpp/system.threading/
---



## Kelas

| Kelas | Deskripsi |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) untuk memberi tahu thread yang menunggu yang mereset secara otomatis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [CancellationToken](./cancellationtoken/) | Menyebarkan notifikasi bahwa operasi harus dibatalkan. Kelas ini menyediakan mekanisme pembatalan kooperatif antar thread, memungkinkan satu thread memberi tahu thread lain bahwa sebuah operasi harus dibatalkan. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Mewakili pendaftaran untuk callback token pembatalan. |
| [CancellationTokenSource](./cancellationtokensource/) | Sumber token pembatalan yang dapat digunakan untuk memicu notifikasi pembatalan. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) yang dapat dikirim ke thread yang menunggu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [Interlocked](./interlocked/) | Menyediakan API untuk operasi yang aman terhadap thread. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) untuk memberi tahu thread yang menunggu yang tidak mereset secara otomatis. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [Monitor](./monitor/) | Kelas [Monitor](./monitor/) menyediakan mekanisme yang menyinkronkan akses ke objek. |
| [Mutex](./mutex/) | [Mutex](./mutex/) implementasi. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) implementasi. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [SynchronizationContext](./synchronizationcontext/) | Menyediakan fungsi dasar untuk menyebarkan konteks sinkronisasi di berbagai operasi sinkronisasi. |
| [Thread](./thread/) | [Thread](./thread/) implementasi. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [ThreadPool](./threadpool/) | API pool [Thread](./thread/) yang memungkinkan menambahkan pekerjaan ke antrean untuk dibaca oleh kumpulan thread pekerja. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun. |
| [ThreadPoolImpl](./threadpoolimpl/) | Data internal pool [Thread](./thread/). Ini adalah tipe singleton dengan manajemen memori yang dilakukan oleh fungsi akses. Anda tidak boleh pernah membuat instance darinya secara langsung. |
| [Timer](./timer/) | Kelas [Timer](./timer/) yang mengeksekusi item pekerjaan di thread terpisah setelah penundaan. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [TimerQueue](./timerqueue/) | Antrian yang menangani objek [Timer](./timer/). Ini hanya sebuah implementasi. Objek [Timer](./timer/) mendaftar di sana secara otomatis, Anda tidak perlu melakukannya untuk menggunakannya – gunakan API kelas [Timer](./timer/) sebagai gantinya. Ini adalah tipe singleton dengan manajemen memori yang dilakukan oleh fungsi akses. Anda tidak boleh pernah membuat instance darinya secara langsung. |
| [WaitHandle](./waithandle/) | Kelas dasar primitif penunggu. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
## Enums

| Enum | Deskripsi |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Mengatur status apartemen thread. |
| [EventResetMode](./eventresetmode/) | Menunjukkan bagaimana status event direset. |
| [ThreadState](./threadstate/) | Status thread. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Fungsi [Thread](./thread/) dengan satu parameter. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Fungsi [Thread](./thread/) tanpa parameter. |
| [TimerCallback](./timercallback/) | Fungsi callback yang akan dipanggil oleh timer. |
| [wait_handle_t](./wait_handle_t/) | Tipe handle. |
| [WaitCallback](./waitcallback/) | Item callback yang akan dieksekusi begitu ada slot. |
