---
title: "classe System::Threading::AutoResetEvent"
linktitle: "AutoResetEvent"
second_title: "Aspose.Font pour C++"
description: "classe System::Threading::AutoResetEvent. Événement qui notifie le thread en attente et qui se réinitialise automatiquement. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading/autoresetevent/
---
## AutoResetEvent class


[Event](../../system/event/) to notify waiting thread that resets automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AutoResetEvent : public System::Threading::EventWaitHandle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AutoResetEvent](./autoresetevent/)(bool) | Informations RTTI. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Remarques



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

## Voir aussi

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
