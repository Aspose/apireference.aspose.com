---
title: "System::Threading::ThreadPool classe"
linktitle: "ThreadPool"
second_title: "Aspose.Font per C++"
description: "System::Threading::ThreadPool classe. API del pool di thread che consente di inserire lavori nella coda da leggere da un pool di thread di lavoro. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1300
url: /it/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Ottiene il numero di thread disponibili. |
| static [GetInstance](./getinstance/)() | Informazioni RTTI. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Ottiene il numero massimo di thread concorrenti. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Ottiene il numero minimo di thread creati dal pool. |
| static [JoinAllThreads](./joinallthreads/)() | Unisce tutti i thread posseduti. Attende indefinitamente. |
| [operator=](./operator=/)(const ThreadPool\&) | Nessuna copia. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Inserisce l'elemento di lavoro nella coda, presente con un callback senza parametri. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Inserisce l'elemento di lavoro nella coda, presente con un callback senza parametri. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Imposta il numero di thread posseduti dal pool. |
| static [SetMinThreads](./setminthreads/)(int, int) | Imposta il numero minimo di thread posseduti dal pool. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Nessuna copia. |
## Osservazioni



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

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
