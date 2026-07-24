---
title: "System::Threading::ThreadPool class"
linktitle: "ThreadPool"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::ThreadPool class. API thread pool yang memungkinkan menambahkan pekerjaan ke antrean untuk dibaca oleh kumpulan thread pekerja. Ini adalah tipe statis tanpa layanan instance. Anda tidak pernah boleh membuat instance darinya dengan cara apapun di C++."
type: docs
weight: 1300
url: /id/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Mendapatkan jumlah thread yang tersedia. |
| static [GetInstance](./getinstance/)() | Informasi RTTI. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Mendapatkan jumlah maksimal thread bersamaan. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Mendapatkan jumlah minimal thread yang dibuat oleh pool. |
| static [JoinAllThreads](./joinallthreads/)() | Menggabungkan semua thread yang dimiliki. Menunggu tanpa batas. |
| [operator=](./operator=/)(const ThreadPool\&) | Tidak ada penyalinan. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Menempatkan item kerja ke dalam antrean yang hadir dengan callback tanpa parameter. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Menempatkan item kerja ke dalam antrean yang hadir dengan callback tanpa parameter. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Mengatur jumlah thread yang dimiliki oleh pool. |
| static [SetMinThreads](./setminthreads/)(int, int) | Mengatur jumlah minimal thread yang dimiliki oleh pool. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Tidak ada penyalinan. |
## Catatan



```cpp
#include "system/threading/thread_pool.h"
#include "system/threading/thread.h"
#include "system/object.h"
#include "system/smart_ptr.h"
#include <iostream>
#include <mutex>
#include <string>
#include <thread>

const std::string &BooleanToString(bool value)
{
  static const std::string True = "True";
  static const std::string False = "False";

  return value ? True : False;
}

int main()
{
  using namespace System::Threading;
  std::mutex m;

  const auto threadsCount = std::thread::hardware_concurrency();

  for (unsigned int i = 0; i < threadsCount; ++i)
  {
    ThreadPool::QueueUserWorkItem([&m](System::SharedPtr<System::Object> object) -> void {
      auto thread = Thread::get_CurrentThread();
      m.lock();
      std::cout << "Background: " << BooleanToString(thread->get_IsBackground()) <<
        ", Thread pool: " << BooleanToString(thread->get_IsThreadPoolThread()) <<
        ", Thread ID: " << thread->get_ManagedThreadId() << std::endl;
      m.unlock();
    });
  }

  ThreadPool::JoinAllThreads();

  return 0;
}
/*
This code example produces the following output:
Background: True, Thread pool: True, Thread ID: 1
Background: True, Thread pool: True, Thread ID: 3
Background: True, Thread pool: True, Thread ID: 5
Background: True, Thread pool: True, Thread ID: 6
Background: True, Thread pool: True, Thread ID: 9
Background: True, Thread pool: True, Thread ID: 1
Background: True, Thread pool: True, Thread ID: 7
Background: True, Thread pool: True, Thread ID: 2
Background: True, Thread pool: True, Thread ID: 4
Background: True, Thread pool: True, Thread ID: 3
Background: True, Thread pool: True, Thread ID: 12
Background: True, Thread pool: True, Thread ID: 8
Background: True, Thread pool: True, Thread ID: 5
Background: True, Thread pool: True, Thread ID: 6
Background: True, Thread pool: True, Thread ID: 16
Background: True, Thread pool: True, Thread ID: 11
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
