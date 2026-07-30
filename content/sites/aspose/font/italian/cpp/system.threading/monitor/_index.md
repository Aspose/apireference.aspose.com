---
title: "classe System::Threading::Monitor"
linktitle: "Monitor"
second_title: "Aspose.Font per C++"
description: "classe System::Threading::Monitor. La classe Monitor fornisce un meccanismo che sincronizza l'accesso agli oggetti in C++."
type: docs
weight: 800
url: /it/cpp/system.threading/monitor/
---
## Monitor class


La classe [Monitor](./) fornisce un meccanismo che sincronizza l'accesso agli oggetti.

```cpp
class Monitor : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Acquisisce un lock esclusivo su un oggetto specificato. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Acquisisce un lock esclusivo sull'oggetto specificato e imposta in modo atomico un valore che indica se il lock è stato acquisito. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Rilascia un lock esclusivo sull'oggetto specificato. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Determina se il thread corrente possiede il lock sull'oggetto specificato. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Notifica a un thread nella coda di attesa un cambiamento nello stato dell'oggetto bloccato. Non implementato. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Notifica tutti i thread in attesa di un cambiamento nello stato dell'oggetto. Non implementato. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Tenta di acquisire un lock esclusivo sull'oggetto specificato. Non implementato. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Tenta di acquisire un lock esclusivo sull'oggetto specificato e imposta in modo atomico un valore che indica se il lock è stato acquisito. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Tenta, per il numero specificato di millisecondi, di acquisire un lock esclusivo sull'oggetto specificato. Non implementato. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Tenta, per la quantità di tempo specificata, di acquisire un lock esclusivo sull'oggetto specificato. Non implementato. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Tenta, per la quantità di tempo specificata, di acquisire un lock esclusivo sull'oggetto specificato e imposta in modo atomico un valore che indica se il lock è stato acquisito. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Tenta, per la quantità di tempo specificata, di acquisire un lock esclusivo sull'oggetto specificato e imposta in modo atomico un valore che indica se il lock è stato acquisito. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Rilascia il lock su un oggetto e blocca il thread corrente fino a quando non riacquista il lock. Se l'intervallo di timeout specificato scade, il thread entra nella coda di pronto. Opzionalmente esce dal dominio di sincronizzazione per il contesto sincronizzato prima dell'attesa e riacquista il dominio successivamente. Non implementato. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Rilascia il lock su un oggetto e blocca il thread corrente fino a quando non riacquista il lock. Se l'intervallo di timeout specificato scade, il thread entra nella coda di pronto. Opzionalmente esce dal dominio di sincronizzazione per il contesto sincronizzato prima dell'attesa e riacquista il dominio successivamente. Non implementato. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Rilascia il lock su un oggetto e blocca il thread corrente fino a quando non riacquista il lock. Se l'intervallo di timeout specificato scade, il thread entra nella coda di pronto. Non implementato. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Rilascia il lock su un oggetto e blocca il thread corrente fino a quando non riacquista il lock. Se l'intervallo di timeout specificato scade, il thread entra nella coda di pronto. Non implementato. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Rilascia il lock su un oggetto e blocca il thread corrente fino a quando non riacquista il lock. Non implementato. |
## Osservazioni



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

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
