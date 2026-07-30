---
title: "System::Threading::ThreadPool Klasse"
linktitle: "ThreadPool"
second_title: "Aspose.Font für C++"
description: "System::Threading::ThreadPool Klasse. Thread‑Pool‑API, die das Einreihen von Jobs in eine Warteschlange ermöglicht, die von einem Pool von Arbeiter‑Threads gelesen wird. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 1300
url: /de/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Ermittelt die Anzahl verfügbarer Threads. |
| static [GetInstance](./getinstance/)() | RTTI-Informationen. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Ermittelt die maximale Anzahl gleichzeitiger Threads. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Ermittelt die minimale Anzahl von Threads, die vom Pool erstellt werden. |
| static [JoinAllThreads](./joinallthreads/)() | Führt join für alle eigenen Threads aus. Wartet unendlich. |
| [operator=](./operator=/)(const ThreadPool\&) | Kein Kopieren. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Legt ein Arbeitselement in die Warteschlange, das mit einem Callback ohne Parameter vorhanden ist. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Legt ein Arbeitselement in die Warteschlange, das mit einem Callback ohne Parameter vorhanden ist. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Setzt die Anzahl der vom Pool verwalteten Threads. |
| static [SetMinThreads](./setminthreads/)(int, int) | Setzt die minimale Anzahl der vom Pool verwalteten Threads. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Kein Kopieren. |
## Hinweise



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

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
