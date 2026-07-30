---
title: "System::Threading::ThreadPool 类"
linktitle: "ThreadPool"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::ThreadPool 类。线程池 API，允许将作业推入队列，由工作线程池读取。这是一个没有实例服务的静态类型。绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 1300
url: /zh/cpp/system.threading/threadpool/
---
## ThreadPool class


[Thread](../thread/) pool API allowing it pushing jobs into queue to be read by pool of worker threads. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class ThreadPool : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | 获取可用线程的数量。 |
| static [GetInstance](./getinstance/)() | RTTI 信息。 |
| static [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | 获取最大并发线程数。 |
| static [GetMinThreads](./getminthreads/)(int\&, int\&) | 获取池正在创建的最小线程数。 |
| static [JoinAllThreads](./joinallthreads/)() | 加入所有拥有的线程。无限期等待。 |
| [operator=](./operator=/)(const ThreadPool\&) | 不支持复制。 |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback) | 将工作项放入队列，该工作项带有无参数的回调。 |
| static [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | 将工作项放入队列，该工作项带有无参数的回调。 |
| static [SetMaxThreads](./setmaxthreads/)(int, int) | 设置池拥有的线程数量。 |
| static [SetMinThreads](./setminthreads/)(int, int) | 设置池拥有的最小线程数。 |
| [ThreadPool](./threadpool/)(const ThreadPool\&) | 不支持复制。 |
## 备注



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

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
