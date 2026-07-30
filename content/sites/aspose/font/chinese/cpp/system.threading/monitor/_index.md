---
title: "System::Threading::Monitor 类"
linktitle: "Monitor"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Monitor 类。Monitor 类提供了一种在 C++ 中同步访问对象的机制。"
type: docs
weight: 800
url: /zh/cpp/system.threading/monitor/
---
## Monitor class


类 [Monitor](./) 提供了一种同步访问对象的机制。

```cpp
class Monitor : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | 获取对指定对象的独占锁。 |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | 获取对指定对象的独占锁，并原子性地设置一个指示锁是否已获取的值。 |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | 释放对指定对象的独占锁。 |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | 确定当前线程是否持有对指定对象的锁。 |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | 通知等待队列中的线程锁定对象状态的变化（未实现）。 |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | 通知所有等待线程对象状态的变化（未实现）。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | 尝试获取对指定对象的独占锁（未实现）。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | 尝试获取对指定对象的独占锁，并原子性地设置一个指示锁是否已获取的值。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | 尝试在指定的毫秒数内获取对指定对象的独占锁（未实现）。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | 尝试在指定的时间内获取对指定对象的独占锁（未实现）。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | 尝试在指定的时间内获取对指定对象的独占锁，并原子性地设置一个指示锁是否已获取的值。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | 尝试在指定的时间内获取对指定对象的独占锁，并原子性地设置一个指示锁是否已获取的值。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | 释放对象的锁并阻塞当前线程，直至重新获取锁。如果指定的超时间隔已到，线程进入就绪队列。可选地在等待之前退出同步上下文的同步域，随后重新获取该域（未实现）。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | 释放对象的锁并阻塞当前线程，直至重新获取锁。如果指定的超时间隔已到，线程进入就绪队列。可选地在等待之前退出同步上下文的同步域，随后重新获取该域（未实现）。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | 释放对象的锁并阻塞当前线程，直至重新获取锁。如果指定的超时间隔已到，线程进入就绪队列（未实现）。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | 释放对象的锁并阻塞当前线程，直至重新获取锁。如果指定的超时间隔已到，线程进入就绪队列（未实现）。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | 释放对象的锁并阻塞当前线程，直至重新获取锁（未实现）。 |
## 备注



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

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
