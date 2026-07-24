---
title: "System::Threading::ThreadPool class"
linktitle: "ThreadPool"
second_title: "Aspose.Page για C++"
description: "System::Threading::ThreadPool class. API ομάδας νημάτων που επιτρέπει την προσθήκη εργασιών στην ουρά για ανάγνωση από την ομάδα των νήματων εργασίας. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο στο C++."
type: docs
weight: 1300
url: /el/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Λαμβάνει τον αριθμό των διαθέσιμων νημάτων. |
| static [GetInstance](./getinstance/)() | Πληροφορίες RTTI. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Λαμβάνει τον μέγιστο αριθμό ταυτόχρονων νημάτων. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | Λαμβάνει τον ελάχιστο αριθμό νημάτων που δημιουργούνται από την πισίνα. |
| static [JoinAllThreads](./joinallthreads/)() | Περιμένει όλα τα ιδιόκτητα νήματα. Περιμένει επ' άπειρον. |
| [operator=](./operator=/)(const ThreadPool\&) | Δεν επιτρέπεται η αντιγραφή. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | Τοποθετεί το αντικείμενο εργασίας στην ουρά που υπάρχει με callback χωρίς παράμετρο. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Τοποθετεί το αντικείμενο εργασίας στην ουρά που υπάρχει με callback χωρίς παράμετρο. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | Ορίζει τον αριθμό των νημάτων που ανήκουν στην πισίνα. |
| static [SetMinThreads](./setminthreads/)(int, int) | Ορίζει τον ελάχιστο αριθμό των νημάτων που ανήκουν στην πισίνα. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | Δεν επιτρέπεται η αντιγραφή. |
## Παρατηρήσεις



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

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
