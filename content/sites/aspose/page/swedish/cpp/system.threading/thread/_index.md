---
title: "System::Threading::Thread klass"
linktitle: "Thread"
second_title: "Aspose.Page för C++"
description: "System::Threading::Thread klass. Trådimplementering. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körningsfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1200
url: /sv/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Abort](./abort/)() | Avbryter tråden. Inte implementerad. |
| [get_CurrentCulture](./get_currentculture/)() | Hämtar trådkultur. |
| static [get_CurrentThread](./get_currentthread/)() | Hämtar objekt som beskriver den aktuella tråden. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Hämtar användargränssnittskultur som används av tråden. |
| [get_IsAlive](./get_isalive/)() | Kontrollerar om tråden är levande. |
| [get_IsBackground](./get_isbackground/)() | Kontrollerar om tråden är i bakgrunden. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Kontrollerar om tråden ägs av en trådpool. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Hämtar identifierare för tråden. Kan erhållas från OS, men om OS‑trådens identifierare överskrider int‑gränserna kan trådens id:n korsa varandra. |
| [get_Name](./get_name/)() | Hämtar trådens namn. |
| [get_ThreadState](./get_threadstate/)() | Hämtar trådens tillstånd. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Hämtar identifierare för den aktuella tråden. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Avbryt tråden. Inte implementerad. |
| [Join](./join/)() | Väntar på hanterad tråd. Utför obegränsad väntan om det krävs. |
| [Join](./join/)(int) | Väntar på hanterad tråd. Utför begränsad väntan. |
| [Join](./join/)(TimeSpan) | Väntar på hanterad tråd. Utför begränsad väntan. |
| static [MemoryBarrier](./memorybarrier/)() | Synkroniserar minnesåtkomst. |
| [operator=](./operator=/)(const Thread\&) | Kopierar TLS‑data från en annan tråd. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Ställer in trådkultur. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Ställer in användargränssnittskultur som används av tråden. |
| [set_IsBackground](./set_isbackground/)(bool) | Ställer in tråden till bakgrund eller förgrund. |
| [set_Name](./set_name/)(const System::String\&) | Ställer in trådens namn. |
| static [Sleep](./sleep/)(int) | Stoppar aktuell tråd för angiven tidsgräns. |
| static [Sleep](./sleep/)(TimeSpan) | Stoppar aktuell tråd för angiven tidsgräns. |
| static [SpinWait](./spinwait/)(int) | Väntar på ett specifikt antal loopiterationer. |
| [Start](./start/)() | Startar tråden med ett null-argumentobjekt. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Startar tråden. |
| [Thread](./thread/)() | Konstruktor. |
| [Thread](./thread/)(ThreadStart) | Konstruktor. |
| [Thread](./thread/)(ParameterizedThreadStart) | Konstruktor. |
| [Thread](./thread/)(Thread\&) | Kopieringskonstruktor. |
| static [Yield](./yield/)() | Yieldar tråden. |
| virtual [~Thread](./~thread/)() | Destruktor. |
## Anmärkningar



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

## Se även

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
