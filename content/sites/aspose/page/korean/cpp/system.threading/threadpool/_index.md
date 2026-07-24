---
title: "System::Threading::ThreadPool class"
linktitle: "ThreadPool"
second_title: "C++용 Aspose.Page"
description: "System::Threading::ThreadPool class. 작업을 큐에 넣어 작업자 스레드 풀에서 읽을 수 있게 하는 스레드 풀 API입니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1300
url: /ko/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | 사용 가능한 스레드 수를 가져옵니다. |
| static [GetInstance](./getinstance/)() | RTTI 정보. |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | 동시 실행 가능한 최대 스레드 수를 가져옵니다. |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | 풀에 의해 생성되는 최소 스레드 수를 가져옵니다. |
| static [JoinAllThreads](./joinallthreads/)() | 소유한 모든 스레드를 조인합니다. 무한히 기다립니다. |
| [operator=](./operator=/)(const ThreadPool\&) | 복사 불가. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | 매개변수가 없는 콜백과 함께 작업 항목을 큐에 넣습니다. |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | 매개변수가 없는 콜백과 함께 작업 항목을 큐에 넣습니다. |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | 풀에 소유된 스레드 수를 설정합니다. |
| static [SetMinThreads](./setminthreads/)(int, int) | 풀에 소유된 최소 스레드 수를 설정합니다. |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | 복사 불가. |
## 비고



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

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
