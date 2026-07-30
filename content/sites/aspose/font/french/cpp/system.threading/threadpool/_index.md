---
title: "Classe System::Threading::ThreadPool"
linktitle: "ThreadPool"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::ThreadPool. API de pool de threads permettant d'enfiler des travaux dans la file d'attente pour être traités par un pool de threads de travail. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de ce type, quel que soit le moyen, en C++."
type: docs
weight: 1300
url: /fr/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Obtient le nombre de threads disponibles. |
| static [GetInstance](./getinstance/)() | Informations RTTI. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Obtient le nombre maximal de threads concurrents. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Obtient le nombre minimal de threads créés par le pool. |
| static [JoinAllThreads](./joinallthreads/)() | Joint tous les threads possédés. Attend indéfiniment. |
| [operator=](./operator=/)(const ThreadPool\&) | Pas de copie. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Place un élément de travail dans la file d'attente qui possède un rappel sans paramètre. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Place un élément de travail dans la file d'attente qui possède un rappel sans paramètre. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Définit le nombre de threads possédés par le pool. |
| static [SetMinThreads](./setminthreads/)(int, int) | Définit le nombre minimal de threads possédés par le pool. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Pas de copie. |
## Remarques



```cpp
#include "system/threading/thread_pool.h"
#include "system/threading/thread.h"
#include "system/object.h"
#include "system/smart_ptr.h"
#include <iostream>
#include <mutex>
#include <string>
#include <thread>

const std::string &BooleanToString(bool value)
{
  static const std::string True = "True";
  static const std::string False = "False";

  return value ? True : False;
}

int main()
{
  using namespace System::Threading;
  std::mutex m;

  const auto threadsCount = std::thread::hardware_concurrency();

  for (unsigned int i = 0; i < threadsCount; ++i)
  {
    ThreadPool::QueueUserWorkItem([&m](System::SharedPtr<System::Object> object) -> void {
      auto thread = Thread::get_CurrentThread();
      m.lock();
      std::cout << "Background: " << BooleanToString(thread->get_IsBackground()) <<
        ", Thread pool: " << BooleanToString(thread->get_IsThreadPoolThread()) <<
        ", Thread ID: " << thread->get_ManagedThreadId() << std::endl;
      m.unlock();
    });
  }

  ThreadPool::JoinAllThreads();

  return 0;
}
/*
This code example produces the following output:
Background: True, Thread pool: True, Thread ID: 1
Background: True, Thread pool: True, Thread ID: 3
Background: True, Thread pool: True, Thread ID: 5
Background: True, Thread pool: True, Thread ID: 6
Background: True, Thread pool: True, Thread ID: 9
Background: True, Thread pool: True, Thread ID: 1
Background: True, Thread pool: True, Thread ID: 7
Background: True, Thread pool: True, Thread ID: 2
Background: True, Thread pool: True, Thread ID: 4
Background: True, Thread pool: True, Thread ID: 3
Background: True, Thread pool: True, Thread ID: 12
Background: True, Thread pool: True, Thread ID: 8
Background: True, Thread pool: True, Thread ID: 5
Background: True, Thread pool: True, Thread ID: 6
Background: True, Thread pool: True, Thread ID: 16
Background: True, Thread pool: True, Thread ID: 11
*/
```

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
