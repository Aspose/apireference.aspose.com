---
title: "Classe System::Threading::Monitor"
linktitle: "Monitor"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::Monitor. La classe Monitor fournit un mécanisme qui synchronise l'accès aux objets en C++."
type: docs
weight: 800
url: /fr/cpp/system.threading/monitor/
---
## Monitor class


La classe [Monitor](./) fournit un mécanisme qui synchronise l'accès aux objets.

```cpp
class Monitor : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Acquiert un verrou exclusif sur un objet spécifié. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Acquiert un verrou exclusif sur l'objet spécifié et définit de manière atomique une valeur indiquant si le verrou a été pris. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Libère un verrou exclusif sur l'objet spécifié. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Détermine si le thread actuel détient le verrou sur l'objet spécifié. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Notifie un thread dans la file d'attente d'attente d'un changement d'état de l'objet verrouillé Non implémenté. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Notifie tous les threads en attente d'un changement d'état de l'objet Non implémenté. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Tente d'acquérir un verrou exclusif sur l'objet spécifié Non implémenté. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Tente d'acquérir un verrou exclusif sur l'objet spécifié et définit de manière atomique une valeur indiquant si le verrou a été pris. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Tente, pendant le nombre de millisecondes spécifié, d'acquérir un verrou exclusif sur l'objet spécifié Non implémenté. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Tente, pendant la durée spécifiée, d'acquérir un verrou exclusif sur l'objet spécifié Non implémenté. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Tente, pendant la durée spécifiée, d'acquérir un verrou exclusif sur l'objet spécifié et définit de manière atomique une valeur indiquant si le verrou a été pris. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Tente, pendant la durée spécifiée, d'acquérir un verrou exclusif sur l'objet spécifié et définit de manière atomique une valeur indiquant si le verrou a été pris. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Libère le verrou sur un objet et bloque le thread actuel jusqu'à ce qu'il récupère le verrou. Si l'intervalle d'expiration spécifié s'écoule, le thread entre dans la file d'attente prête. Optionnellement, sort du domaine de synchronisation pour le contexte synchronisé avant l'attente et récupère le domaine ensuite. Non implémenté. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Libère le verrou sur un objet et bloque le thread actuel jusqu'à ce qu'il récupère le verrou. Si l'intervalle d'expiration spécifié s'écoule, le thread entre dans la file d'attente prête. Optionnellement, sort du domaine de synchronisation pour le contexte synchronisé avant l'attente et récupère le domaine ensuite. Non implémenté. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Libère le verrou sur un objet et bloque le thread actuel jusqu'à ce qu'il récupère le verrou. Si l'intervalle d'expiration spécifié s'écoule, le thread entre dans la file d'attente prête. Non implémenté. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Libère le verrou sur un objet et bloque le thread actuel jusqu'à ce qu'il récupère le verrou. Si l'intervalle d'expiration spécifié s'écoule, le thread entre dans la file d'attente prête. Non implémenté. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Libère le verrou sur un objet et bloque le thread actuel jusqu'à ce qu'il récupère le verrou Non implémenté. |
## Remarques



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

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
