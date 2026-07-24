---
title: "System::Threading::Monitor クラス"
linktitle: "Monitor"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Monitor クラス。Monitor クラスは C++ においてオブジェクトへのアクセスを同期する仕組みを提供します。"
type: docs
weight: 800
url: /ja/cpp/system.threading/monitor/
---
## Monitor class


クラス [Monitor](./) はオブジェクトへのアクセスを同期する仕組みを提供します。

```cpp
class Monitor : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | 指定されたオブジェクトに対して排他ロックを取得します。 |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | 指定されたオブジェクトに対して排他ロックを取得し、ロックが取得されたかを示す値を原子的に設定します。 |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | 指定されたオブジェクトの排他ロックを解放します。 |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | 現在のスレッドが指定されたオブジェクトのロックを保持しているかどうかを判定します。 |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | ロックされたオブジェクトの状態変化を待機キュー内のスレッドに通知します（未実装）。 |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | オブジェクトの状態変化をすべての待機スレッドに通知します（未実装）。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | 指定されたオブジェクトに対して排他ロックを取得しようとします（未実装）。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | 指定されたオブジェクトに対して排他ロックを取得し、ロックが取得されたかを示す値を原子的に設定します。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | 指定されたミリ秒数だけ、指定されたオブジェクトに対して排他ロックを取得しようとします（未実装）。 |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | 指定された時間だけ、指定されたオブジェクトに対して排他ロックを取得しようとします（未実装）。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | 指定された時間だけ、指定されたオブジェクトに対して排他ロックを取得しようと試み、ロックが取得されたかどうかを示す値を原子操作で設定します。 |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | 指定された時間だけ、指定されたオブジェクトに対して排他ロックを取得しようと試み、ロックが取得されたかどうかを示す値を原子操作で設定します。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | オブジェクトのロックを解除し、ロックが再取得されるまで現在のスレッドをブロックします。指定されたタイムアウト間隔が経過すると、スレッドはレディキューに入ります。オプションで、待機前に同期コンテキストの同期ドメインを抜け、待機後にドメインを再取得します。実装されていません。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | オブジェクトのロックを解除し、ロックが再取得されるまで現在のスレッドをブロックします。指定されたタイムアウト間隔が経過すると、スレッドはレディキューに入ります。オプションで、待機前に同期コンテキストの同期ドメインを抜け、待機後にドメインを再取得します。実装されていません。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | オブジェクトのロックを解除し、ロックが再取得されるまで現在のスレッドをブロックします。指定されたタイムアウト間隔が経過すると、スレッドはレディキューに入ります。実装されていません。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | オブジェクトのロックを解除し、ロックが再取得されるまで現在のスレッドをブロックします。指定されたタイムアウト間隔が経過すると、スレッドはレディキューに入ります。実装されていません。 |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | オブジェクトのロックを解除し、ロックが再取得されるまで現在のスレッドをブロックします。実装されていません。 |
## 備考



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

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
