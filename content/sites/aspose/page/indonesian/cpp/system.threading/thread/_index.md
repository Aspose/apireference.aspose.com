---
title: "System::Threading::Thread kelas"
linktitle: "Thread"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Thread kelas. Implementasi Thread. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Abort](./abort/)() | Menghentikan thread. Tidak diimplementasikan. |
| [get_CurrentCulture](./get_currentculture/)() | Mendapatkan kultur thread. |
| static [get_CurrentThread](./get_currentthread/)() | Mendapatkan objek yang menggambarkan thread saat ini. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Mendapatkan kultur antarmuka pengguna yang digunakan oleh thread. |
| [get_IsAlive](./get_isalive/)() | Memeriksa apakah thread masih hidup. |
| [get_IsBackground](./get_isbackground/)() | Memeriksa apakah thread berjalan di latar belakang. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Memeriksa apakah thread dimiliki oleh pool thread. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Mendapatkan pengenal thread. Dapat diambil dari OS, tetapi jika pengenal thread OS melebihi batas int, id thread dapat bertumpang tindih. |
| [get_Name](./get_name/)() | Mendapatkan nama thread. |
| [get_ThreadState](./get_threadstate/)() | Mendapatkan status thread. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Mendapatkan pengenal thread saat ini. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Menginterupsi thread. Tidak diimplementasikan. |
| [Join](./join/)() | Menunggu thread terkelola. Melakukan penunggu tak terbatas jika diperlukan. |
| [Join](./join/)(int) | Menunggu thread terkelola. Melakukan penunggu terbatas. |
| [Join](./join/)(TimeSpan) | Menunggu thread terkelola. Melakukan penunggu terbatas. |
| static [MemoryBarrier](./memorybarrier/)() | Menyinkronkan akses memori. |
| [operator=](./operator=/)(const Thread\&) | Menyalin data TLS dari thread yang berbeda. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Mengatur kultur thread. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Mengatur kultur antarmuka pengguna yang digunakan oleh thread. |
| [set_IsBackground](./set_isbackground/)(bool) | Mengatur thread menjadi latar belakang atau latar depan. |
| [set_Name](./set_name/)(const System::String\&) | Mengatur nama thread. |
| static [Sleep](./sleep/)(int) | Menghentikan thread saat ini selama batas waktu yang ditentukan. |
| static [Sleep](./sleep/)(TimeSpan) | Menghentikan thread saat ini selama batas waktu yang ditentukan. |
| static [SpinWait](./spinwait/)(int) | Menunggu sejumlah iterasi loop tertentu. |
| [Start](./start/)() | Memulai thread menggunakan objek argumen null. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Memulai thread. |
| [Thread](./thread/)() | Konstruktor. |
| [Thread](./thread/)(ThreadStart) | Konstruktor. |
| [Thread](./thread/)(ParameterizedThreadStart) | Konstruktor. |
| [Thread](./thread/)(Thread\&) | Konstruktor penyalinan. |
| static [Yield](./yield/)() | Menyisihkan thread. |
| virtual [~Thread](./~thread/)() | Destruktor. |
## Catatan



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
