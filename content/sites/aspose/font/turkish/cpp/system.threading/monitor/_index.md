---
title: "System::Threading::Monitor sınıfı"
linktitle: "Monitor"
second_title: "Aspose.Font için C++"
description: "System::Threading::Monitor sınıfı. Monitor sınıfı, C++'ta nesnelere erişimi senkronize eden bir mekanizma sağlar."
type: docs
weight: 800
url: /tr/cpp/system.threading/monitor/
---
## Monitor class


Sınıf [Monitor](./) nesnelere erişimi senkronize eden bir mekanizma sağlar.

```cpp
class Monitor : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Belirtilen bir nesne üzerinde münhasır kilit alır. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Belirtilen nesne üzerinde münhasır kilit alır ve kilidin alınıp alınmadığını gösteren bir değeri atomik olarak ayarlar. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Belirtilen nesne üzerindeki münhasır kilidi serbest bırakır. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Mevcut iş parçacığının belirtilen nesne üzerindeki kilidi tutup tutmadığını belirler. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Bekleme kuyruğundaki bir iş parçacığını kilitli nesnenin durumundaki değişiklikten haberdar eder. Uygulanmadı. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Tüm bekleyen iş parçacıklarını nesnenin durumundaki değişiklikten haberdar eder. Uygulanmadı. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Belirtilen nesne üzerinde münhasır kilit almaya çalışır. Uygulanmadı. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Belirtilen nesne üzerinde münhasır kilit almaya çalışır ve kilidin alınıp alınmadığını gösteren bir değeri atomik olarak ayarlar. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Belirtilen milisaniye sayısı kadar süreyle, belirtilen nesne üzerinde münhasır kilit almaya çalışır. Uygulanmadı. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Belirtilen süre boyunca, belirtilen nesne üzerinde münhasır kilit almaya çalışır. Uygulanmadı. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Belirtilen süre boyunca, belirtilen nesne üzerinde münhasır kilit almaya çalışır ve kilidin alınıp alınmadığını gösteren bir değeri atomik olarak ayarlar. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Belirtilen süre boyunca, belirtilen nesne üzerinde münhasır kilit almaya çalışır ve kilidin alınıp alınmadığını gösteren bir değeri atomik olarak ayarlar. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Nesnedeki kilidi serbest bırakır ve mevcut iş parçacığını kilidi yeniden elde edene kadar engeller. Belirtilen zaman aşımı süresi dolarsa, iş parçacığı hazır kuyruğuna girer. İsteğe bağlı olarak, bekleme öncesinde senkronize bağlam için senkronizasyon alanından çıkar ve ardından alanı yeniden kazanır. Uygulanmadı. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Nesnedeki kilidi serbest bırakır ve mevcut iş parçacığını kilidi yeniden elde edene kadar engeller. Belirtilen zaman aşımı süresi dolarsa, iş parçacığı hazır kuyruğuna girer. İsteğe bağlı olarak, bekleme öncesinde senkronize bağlam için senkronizasyon alanından çıkar ve ardından alanı yeniden kazanır. Uygulanmadı. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Nesnedeki kilidi serbest bırakır ve mevcut iş parçacığını kilidi yeniden elde edene kadar engeller. Belirtilen zaman aşımı süresi dolarsa, iş parçacığı hazır kuyruğuna girer. Uygulanmadı. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Nesnedeki kilidi serbest bırakır ve mevcut iş parçacığını kilidi yeniden elde edene kadar engeller. Belirtilen zaman aşımı süresi dolarsa, iş parçacığı hazır kuyruğuna girer. Uygulanmadı. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Nesnedeki kilidi serbest bırakır ve mevcut iş parçacığını kilidi yeniden elde edene kadar engeller. Uygulanmadı. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
