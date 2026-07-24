---
title: "System::Threading::Mutex class"
linktitle: "Mutex"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Mutex class. Mutex-implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 900
url: /nl/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Mutex](./mutex/)() | RTTI-informatie. |
| [Mutex](./mutex/)(bool) | Constructor. |
| [Mutex](./mutex/)(bool, const String\&) | Constructor. |
| [ReleaseMutex](./releasemutex/)() | Vrijgeeft de mutex. |
| static [Remove](./remove/)(const String\&) | Verwijdert een benoemde mutex uit het systeem. |
| virtual [Reset](./reset/)() | Reset de mutexstatus. Niet geïmplementeerd. |
| virtual [Set](./set/)() | Stel de mutex in op gesignaleerde status. Niet geïmplementeerd. |
| [WaitOne](./waitone/)() override | Vergrendelt mutex. Voert onbeperkt wachten uit indien nodig. |
| [WaitOne](./waitone/)(int) override | Vergrendelt mutex. Voert wachten uit indien nodig. |
| [WaitOne](./waitone/)(TimeSpan) override | Vergrendelt mutex. Voert wachten uit indien nodig. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Speciale waarde die door de functie moet worden geretourneerd, anders wordt de index van het gesignaleerde object in de array geretourneerd, als de timeout wordt overschreden en er niets signaleert. |
## Opmerkingen



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## Zie ook

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
