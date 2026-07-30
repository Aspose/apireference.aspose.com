---
title: "System::Threading::AutoResetEvent Klasse"
linktitle: "AutoResetEvent"
second_title: "Aspose.Font für C++"
description: "System::Threading::AutoResetEvent Klasse. Ereignis, das wartende Threads benachrichtigt und sich automatisch zurücksetzt. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.threading/autoresetevent/
---
## AutoResetEvent class


[Event](../../system/event/) to notify waiting thread that resets automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AutoResetEvent : public System::Threading::EventWaitHandle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AutoResetEvent](./autoresetevent/)(bool) | RTTI-Informationen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Hinweise



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

## Siehe auch

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
