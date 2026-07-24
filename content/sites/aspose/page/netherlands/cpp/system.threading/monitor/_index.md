---
title: "System::Threading::Monitor class"
linktitle: "Monitor"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Monitor class. Klasse Monitor biedt een mechanisme dat de toegang tot objecten in C++ synchroniseert."
type: docs
weight: 800
url: /nl/cpp/system.threading/monitor/
---
## Monitor class


Klasse [Monitor](./) biedt een mechanisme dat de toegang tot objecten synchroniseert.

```cpp
class Monitor : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Verkrijgt een exclusieve lock op een opgegeven object. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Verkrijgt een exclusieve lock op het opgegeven object en stelt atomair een waarde in die aangeeft of de lock is verkregen. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Geeft een exclusieve lock op het opgegeven object vrij. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Bepaalt of de huidige thread de lock op het opgegeven object bezit. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Meldt een thread in de wachtende wachtrij van een wijziging in de status van het vergrendelde object. Niet geïmplementeerd. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Meldt alle wachtende threads van een wijziging in de status van het object. Niet geïmplementeerd. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Probeert een exclusieve lock op het opgegeven object te verkrijgen. Niet geïmplementeerd. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Probeert een exclusieve lock op het opgegeven object te verkrijgen en stelt atomair een waarde in die aangeeft of de lock is verkregen. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Probeert, gedurende het opgegeven aantal milliseconden, een exclusieve lock op het opgegeven object te verkrijgen. Niet geïmplementeerd. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Probeert, gedurende de opgegeven tijdsduur, een exclusieve lock op het opgegeven object te verkrijgen. Niet geïmplementeerd. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Pogingen, gedurende de opgegeven tijdsduur, om een exclusieve lock op het opgegeven object te verkrijgen, en stelt atomisch een waarde in die aangeeft of de lock is verkregen. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Pogingen, gedurende de opgegeven tijdsduur, om een exclusieve lock op het opgegeven object te verkrijgen, en stelt atomisch een waarde in die aangeeft of de lock is verkregen. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Geeft de lock op een object vrij en blokkeert de huidige thread totdat deze de lock opnieuw verkrijgt. Als het opgegeven time‑out‑interval verstrijkt, wordt de thread in de gereed‑wachtrij geplaatst. Optioneel verlaat het synchronisatiedomein voor de gesynchroniseerde context vóór het wachten en verkrijgt het domein daarna opnieuw. Niet geïmplementeerd. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Geeft de lock op een object vrij en blokkeert de huidige thread totdat deze de lock opnieuw verkrijgt. Als het opgegeven time‑out‑interval verstrijkt, wordt de thread in de gereed‑wachtrij geplaatst. Optioneel verlaat het synchronisatiedomein voor de gesynchroniseerde context vóór het wachten en verkrijgt het domein daarna opnieuw. Niet geïmplementeerd. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Geeft de lock op een object vrij en blokkeert de huidige thread totdat deze de lock opnieuw verkrijgt. Als het opgegeven time‑out‑interval verstrijkt, wordt de thread in de gereed‑wachtrij geplaatst. Niet geïmplementeerd. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Geeft de lock op een object vrij en blokkeert de huidige thread totdat deze de lock opnieuw verkrijgt. Als het opgegeven time‑out‑interval verstrijkt, wordt de thread in de gereed‑wachtrij geplaatst. Niet geïmplementeerd. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Geeft de lock op een object vrij en blokkeert de huidige thread totdat deze de lock opnieuw verkrijgt. Niet geïmplementeerd. |
## Opmerkingen



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

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
