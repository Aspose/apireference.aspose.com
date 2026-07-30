---
title: "System::Threading::AutoResetEvent sınıfı"
linktitle: "AutoResetEvent"
second_title: "Aspose.Font için C++"
description: "System::Threading::AutoResetEvent sınıfı. Otomatik olarak sıfırlanan, bekleyen iş parçacığını bilgilendiren olay. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.threading/autoresetevent/
---
## AutoResetEvent class


[Event](../../system/event/) to notify waiting thread that resets automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AutoResetEvent : public System::Threading::EventWaitHandle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AutoResetEvent](./autoresetevent/)(bool) | RTTI bilgisi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Açıklamalar



```cpp
#include "system/threading/auto_reset_event.h"
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

  auto autoResetEvent = System::MakeObject<AutoResetEvent>(true);
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &autoResetEvent]() -> void {
      autoResetEvent->WaitOne();
      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }
      autoResetEvent->Set();
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

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
