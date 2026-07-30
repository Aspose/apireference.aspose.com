---
title: "System::Threading::ThreadPool فئة"
linktitle: "ThreadPool"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::ThreadPool فئة. واجهة برمجة تطبيقات مجموعة الخيوط تسمح بدفع الوظائف إلى الطابور لتُقرأ بواسطة مجموعة من خيوط العامل. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تقوم بإنشاء أي مثيلات له بأي وسيلة في C++."
type: docs
weight: 1300
url: /ar/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | يحصل على عدد الخيوط المتاحة. |
| static [GetInstance](./getinstance/)() | معلومات RTTI. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | يحصل على الحد الأقصى لعدد الخيوط المتزامنة. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | يحصل على الحد الأدنى لعدد الخيوط التي يتم إنشاؤها بواسطة المجمع. |
| static [JoinAllThreads](./joinallthreads/)() | ينضم إلى جميع الخيوط المملوكة. ينتظر إلى ما لا نهاية. |
| [operator=](./operator=/)(const ThreadPool\&) | لا نسخ. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | يضع عنصر العمل في الطابور الموجود مع رد نداء بدون معلمات. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | يضع عنصر العمل في الطابور الموجود مع رد نداء بدون معلمات. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | يضبط عدد الخيوط المملوكة للمجمع. |
| static [SetMinThreads](./setminthreads/)(int, int) | يضبط الحد الأدنى لعدد الخيوط المملوكة للمجمع. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | لا نسخ. |
## ملاحظات



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

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
