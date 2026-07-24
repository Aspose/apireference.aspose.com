---
title: "System::Threading::Thread‑klasse"
linktitle: "Thread"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Thread‑klasse. Thread‑implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Abort](./abort/)() | Breekt thread af. Niet geïmplementeerd. |
| [get_CurrentCulture](./get_currentculture/)() | Haalt de thread‑cultuur op. |
| static [get_CurrentThread](./get_currentthread/)() | Haalt het object op dat de huidige thread beschrijft. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Haalt de gebruikersinterface‑cultuur op die door de thread wordt gebruikt. |
| [get_IsAlive](./get_isalive/)() | Controleert of de thread actief is. |
| [get_IsBackground](./get_isbackground/)() | Controleert of de thread op de achtergrond draait. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Controleert of de thread eigendom is van een thread‑pool. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Haalt de identifier van de thread op. Kan van het OS worden verkregen, maar als de OS‑thread‑identifier de int‑limieten overschrijdt, kunnen thread‑ids overlappen. |
| [get_Name](./get_name/)() | Haalt de thread‑naam op. |
| [get_ThreadState](./get_threadstate/)() | Haalt de thread‑status op. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Haalt de identifier van de huidige thread op. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Onderbreekt thread. Niet geïmplementeerd. |
| [Join](./join/)() | Voegt zich bij een beheerde thread. Voert onbeperkt wachten uit indien nodig. |
| [Join](./join/)(int) | Voegt zich bij een beheerde thread. Voert beperkt wachten uit. |
| [Join](./join/)(TimeSpan) | Voegt zich bij een beheerde thread. Voert beperkt wachten uit. |
| static [MemoryBarrier](./memorybarrier/)() | Synchroniseert geheugen‑toegang. |
| [operator=](./operator=/)(const Thread\&) | Kopieert TLS‑gegevens van een andere thread. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Stelt de thread‑cultuur in. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Stelt de gebruikersinterface‑cultuur in die door de thread wordt gebruikt. |
| [set_IsBackground](./set_isbackground/)(bool) | Stelt de thread in op achtergrond of voorgrond. |
| [set_Name](./set_name/)(const System::String\&) | Stelt de threadnaam in. |
| static [Sleep](./sleep/)(int) | Stopt de huidige thread voor de opgegeven time-out. |
| static [Sleep](./sleep/)(TimeSpan) | Stopt de huidige thread voor de opgegeven time-out. |
| static [SpinWait](./spinwait/)(int) | Wacht op een specifiek aantal lusiteraties. |
| [Start](./start/)() | Start thread met een null-argumentobject. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Start thread. |
| [Thread](./thread/)() | Constructor. |
| [Thread](./thread/)(ThreadStart) | Constructor. |
| [Thread](./thread/)(ParameterizedThreadStart) | Constructor. |
| [Thread](./thread/)(Thread\&) | Copy-constructor. |
| static [Yield](./yield/)() | Geeft de thread vrij. |
| virtual [~Thread](./~thread/)() | Destructor. |
## Opmerkingen



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

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
