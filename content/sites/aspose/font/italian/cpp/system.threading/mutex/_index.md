---
title: "System::Threading::Mutex class"
linktitle: "Mutex"
second_title: "Aspose.Font per C++"
description: "System::Threading::Mutex class. Implementazione del mutex. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Mutex](./mutex/)() | Informazioni RTTI. |
| [Mutex](./mutex/)(bool) | Costruttore. |
| [Mutex](./mutex/)(bool, const String\&) | Costruttore. |
| [ReleaseMutex](./releasemutex/)() | Rilascia il mutex. |
| static [Remove](./remove/)(const String\&) | Cancella un mutex nominato dal sistema. |
| virtual [Reset](./reset/)() | Reimposta lo stato del mutex. Non implementato. |
| virtual [Set](./set/)() | Imposta il mutex nello stato segnalato. Non implementato. |
| [WaitOne](./waitone/)() override | Blocca il mutex. Esegue attesa illimitata se necessario. |
| [WaitOne](./waitone/)(int) override | Blocca il mutex. Esegue attesa se necessario. |
| [WaitOne](./waitone/)(TimeSpan) override | Blocca il mutex. Esegue attesa se necessario. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valore speciale da restituire dalla funzione, altrimenti restituisce l'indice dell'oggetto segnalato nell'array, se il timeout scade e nulla segnala. |
## Osservazioni



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

## Vedi anche

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
