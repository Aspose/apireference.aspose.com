---
title: "System::Threading::ThreadPool sınıfı"
linktitle: "ThreadPool"
second_title: "Aspose.Font için C++"
description: "System::Threading::ThreadPool sınıfı. İşleri kuyruğa iterek işçi thread havuzu tarafından okunmasını sağlayan thread havuzu API'si. Bu, örnek hizmeti olmayan statik bir türdür. C++'de hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 1300
url: /tr/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Kullanılabilir iş parçacığı sayısını alır. |
| static [GetInstance](./getinstance/)() | RTTI bilgisi. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Eşzamanlı iş parçacıklarının azami sayısını alır. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Havuz tarafından oluşturulan iş parçacıklarının asgari sayısını alır. |
| static [JoinAllThreads](./joinallthreads/)() | Tüm sahip olunan iş parçacıklarına katılır. Sonsuz bekler. |
| [operator=](./operator=/)(const ThreadPool\&) | Kopyalama yok. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Parametresiz geri arama ile mevcut olan iş öğesini kuyruğa ekler. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Parametresiz geri arama ile mevcut olan iş öğesini kuyruğa ekler. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Havuzun sahip olduğu iş parçacığı sayısını ayarlar. |
| static [SetMinThreads](./setminthreads/)(int, int) | Havuzun sahip olduğu iş parçacıklarının asgari sayısını ayarlar. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Kopyalama yok. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
