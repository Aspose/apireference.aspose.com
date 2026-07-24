---
title: "System::Threading::Monitor class"
linktitle: "Monitor"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Monitor class. Kelas Monitor menyediakan mekanisme yang menyinkronkan akses ke objek dalam C++."
type: docs
weight: 800
url: /id/cpp/system.threading/monitor/
---
## Monitor class


Kelas [Monitor](./) menyediakan mekanisme yang menyinkronkan akses ke objek.

```cpp
class Monitor : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Mendapatkan kunci eksklusif pada objek yang ditentukan. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Mendapatkan kunci eksklusif pada objek yang ditentukan, dan secara atomik mengatur nilai yang menunjukkan apakah kunci telah diambil. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Melepaskan kunci eksklusif pada objek yang ditentukan. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Menentukan apakah thread saat ini memegang kunci pada objek yang ditentukan. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Memberitahu sebuah thread dalam antrian tunggu tentang perubahan status objek yang dikunci. Tidak diimplementasikan. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Memberitahu semua thread yang menunggu tentang perubahan status objek. Tidak diimplementasikan. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Mencoba mendapatkan kunci eksklusif pada objek yang ditentukan. Tidak diimplementasikan. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Mencoba mendapatkan kunci eksklusif pada objek yang ditentukan, dan secara atomik mengatur nilai yang menunjukkan apakah kunci telah diambil. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Mencoba, selama jumlah milidetik yang ditentukan, mendapatkan kunci eksklusif pada objek yang ditentukan. Tidak diimplementasikan. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Mencoba, selama durasi waktu yang ditentukan, mendapatkan kunci eksklusif pada objek yang ditentukan. Tidak diimplementasikan. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Mencoba, selama jangka waktu yang ditentukan, untuk memperoleh kunci eksklusif pada objek yang ditentukan, dan secara atomik menetapkan nilai yang menunjukkan apakah kunci tersebut diambil. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Mencoba, selama jangka waktu yang ditentukan, untuk memperoleh kunci eksklusif pada objek yang ditentukan, dan secara atomik menetapkan nilai yang menunjukkan apakah kunci tersebut diambil. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Melepaskan kunci pada sebuah objek dan memblokir thread saat ini hingga ia memperoleh kembali kunci tersebut. Jika interval batas waktu yang ditentukan berakhir, thread masuk ke antrian siap. Secara opsional keluar dari domain sinkronisasi untuk konteks yang disinkronkan sebelum menunggu dan memperoleh kembali domain tersebut setelahnya. Tidak diimplementasikan. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Melepaskan kunci pada sebuah objek dan memblokir thread saat ini hingga ia memperoleh kembali kunci tersebut. Jika interval batas waktu yang ditentukan berakhir, thread masuk ke antrian siap. Secara opsional keluar dari domain sinkronisasi untuk konteks yang disinkronkan sebelum menunggu dan memperoleh kembali domain tersebut setelahnya. Tidak diimplementasikan. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Melepaskan kunci pada sebuah objek dan memblokir thread saat ini hingga ia memperoleh kembali kunci tersebut. Jika interval batas waktu yang ditentukan berakhir, thread masuk ke antrian siap. Tidak diimplementasikan. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Melepaskan kunci pada sebuah objek dan memblokir thread saat ini hingga ia memperoleh kembali kunci tersebut. Jika interval batas waktu yang ditentukan berakhir, thread masuk ke antrian siap. Tidak diimplementasikan. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Melepaskan kunci pada sebuah objek dan memblokir thread saat ini hingga ia memperoleh kembali kunci tersebut. Tidak diimplementasikan. |
## Catatan



```cpp
#include "system/threading/monitor.h"
#include "system/threading/thread.h"
#include "system/smart_ptr.h"
#include "system/string.h"
#include <iostream>
#include <vector>

int main()
{
  using namespace System::Threading;

  const auto threadsCount = 3;
  std::cout << "Threads count: " << threadsCount << std::endl;
  auto locker = System::MakeObject<System::Object>();
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &locker]() -> void {
      Monitor::Enter(locker);

      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }

      Monitor::Exit(locker);
    }));
    threads.back()->set_Name(System::String("Thread " + std::to_string(i)));
    threads.back()->Start();
  }

  Thread::Sleep(threadsCount * 100);

  for (auto& thread : threads)
  {
    thread->Join();
  }

  return 0;
}
/*
This code example produces the following output:
Threads count: 3
Thread 0: 1
Thread 0: 2
Thread 0: 3
Thread 0: 4
Thread 0: 5
Thread 1: 1
Thread 1: 2
Thread 1: 3
Thread 1: 4
Thread 1: 5
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
